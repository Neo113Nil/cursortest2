package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;

@Deprecated
/* loaded from: classes3.dex */
final class StreamVolumeManager {
    private static final String TAG = "StreamVolumeManager";
    private static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    private final Context applicationContext;
    private final AudioManager audioManager;
    private final Handler eventHandler;
    private final Listener listener;
    private boolean muted;

    @Nullable
    private VolumeChangeReceiver receiver;
    private int streamType;
    private int volume;

    public interface Listener {
        void onStreamTypeChanged(int i8);

        void onStreamVolumeChanged(int i8, boolean z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class VolumeChangeReceiver extends BroadcastReceiver {
        private VolumeChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = StreamVolumeManager.this.eventHandler;
            final StreamVolumeManager streamVolumeManager = StreamVolumeManager.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.e6
                @Override // java.lang.Runnable
                public final void run() {
                    StreamVolumeManager.access$200(StreamVolumeManager.this);
                }
            });
        }
    }

    public StreamVolumeManager(Context context, Handler handler, Listener listener) {
        Context applicationContext = context.getApplicationContext();
        this.applicationContext = applicationContext;
        this.eventHandler = handler;
        this.listener = listener;
        AudioManager audioManager = (AudioManager) Assertions.checkStateNotNull((AudioManager) applicationContext.getSystemService("audio"));
        this.audioManager = audioManager;
        this.streamType = 3;
        this.volume = getVolumeFromManager(audioManager, 3);
        this.muted = getMutedFromManager(audioManager, this.streamType);
        VolumeChangeReceiver volumeChangeReceiver = new VolumeChangeReceiver();
        try {
            applicationContext.registerReceiver(volumeChangeReceiver, new IntentFilter(VOLUME_CHANGED_ACTION));
            this.receiver = volumeChangeReceiver;
        } catch (RuntimeException e8) {
            Log.w(TAG, "Error registering stream volume receiver", e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void access$200(StreamVolumeManager streamVolumeManager) {
        streamVolumeManager.updateVolumeAndNotifyIfChanged();
    }

    private static boolean getMutedFromManager(AudioManager audioManager, int i8) {
        boolean isStreamMute;
        if (Util.SDK_INT < 23) {
            return getVolumeFromManager(audioManager, i8) == 0;
        }
        isStreamMute = audioManager.isStreamMute(i8);
        return isStreamMute;
    }

    private static int getVolumeFromManager(AudioManager audioManager, int i8) {
        try {
            return audioManager.getStreamVolume(i8);
        } catch (RuntimeException e8) {
            Log.w(TAG, "Could not retrieve stream volume for stream type " + i8, e8);
            return audioManager.getStreamMaxVolume(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateVolumeAndNotifyIfChanged() {
        int volumeFromManager = getVolumeFromManager(this.audioManager, this.streamType);
        boolean mutedFromManager = getMutedFromManager(this.audioManager, this.streamType);
        if (this.volume == volumeFromManager && this.muted == mutedFromManager) {
            return;
        }
        this.volume = volumeFromManager;
        this.muted = mutedFromManager;
        this.listener.onStreamVolumeChanged(volumeFromManager, mutedFromManager);
    }

    public void decreaseVolume(int i8) {
        if (this.volume <= getMinVolume()) {
            return;
        }
        this.audioManager.adjustStreamVolume(this.streamType, -1, i8);
        updateVolumeAndNotifyIfChanged();
    }

    public int getMaxVolume() {
        return this.audioManager.getStreamMaxVolume(this.streamType);
    }

    public int getMinVolume() {
        int streamMinVolume;
        if (Util.SDK_INT < 28) {
            return 0;
        }
        streamMinVolume = this.audioManager.getStreamMinVolume(this.streamType);
        return streamMinVolume;
    }

    public int getVolume() {
        return this.volume;
    }

    public void increaseVolume(int i8) {
        if (this.volume >= getMaxVolume()) {
            return;
        }
        this.audioManager.adjustStreamVolume(this.streamType, 1, i8);
        updateVolumeAndNotifyIfChanged();
    }

    public boolean isMuted() {
        return this.muted;
    }

    public void release() {
        VolumeChangeReceiver volumeChangeReceiver = this.receiver;
        if (volumeChangeReceiver != null) {
            try {
                this.applicationContext.unregisterReceiver(volumeChangeReceiver);
            } catch (RuntimeException e8) {
                Log.w(TAG, "Error unregistering stream volume receiver", e8);
            }
            this.receiver = null;
        }
    }

    public void setMuted(boolean z7, int i8) {
        if (Util.SDK_INT >= 23) {
            this.audioManager.adjustStreamVolume(this.streamType, z7 ? -100 : 100, i8);
        } else {
            this.audioManager.setStreamMute(this.streamType, z7);
        }
        updateVolumeAndNotifyIfChanged();
    }

    public void setStreamType(int i8) {
        if (this.streamType == i8) {
            return;
        }
        this.streamType = i8;
        updateVolumeAndNotifyIfChanged();
        this.listener.onStreamTypeChanged(i8);
    }

    public void setVolume(int i8, int i9) {
        if (i8 < getMinVolume() || i8 > getMaxVolume()) {
            return;
        }
        this.audioManager.setStreamVolume(this.streamType, i8, i9);
        updateVolumeAndNotifyIfChanged();
    }
}
