package com.zmxv.RNSound;

import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BridgeReactContext;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Sound.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\bJ-\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 ¢\u0006\u0002\u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001b\u001a\u00020\fH\u0002J\u001f\u0010#\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\b2\b\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0002\u0010$J\u001f\u0010%\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\b2\b\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0002\u0010$J\u0016\u0010&\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 J\u0015\u0010'\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010(J\u000e\u0010)\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\bJ)\u0010*\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\b2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0002\u0010.J\u000e\u0010/\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 J\u000e\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u00020,J\u001f\u00102\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\b2\b\u00103\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u00104J\u001f\u00105\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\b2\b\u00106\u001a\u0004\u0018\u00010,¢\u0006\u0002\u00107J\u001f\u00108\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\b2\b\u00109\u001a\u0004\u0018\u00010,¢\u0006\u0002\u00107J\u001d\u0010:\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0006\u0010;\u001a\u00020,¢\u0006\u0002\u0010<J\u001d\u0010=\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001f\u001a\u00020 ¢\u0006\u0002\u0010$J\u001d\u0010>\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0006\u0010?\u001a\u00020\u0012¢\u0006\u0002\u0010@J\u001f\u0010\u000f\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010AJ\u0010\u0010B\u001a\u00020\u00172\u0006\u0010C\u001a\u00020DH\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/zmxv/RNSound/Sound;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "playerPool", "", "", "Landroid/media/MediaPlayer;", "reactContext", "category", "", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "mixWithOthers", "", "focusedPlayerKey", "Ljava/lang/Double;", "wasPlayingBeforeFocusChange", "setOnPlay", "", "isPlaying", "playerKey", "prepare", "fileName", "key", "options", "Lcom/facebook/react/bridge/ReadableMap;", "callback", "Lcom/facebook/react/bridge/Callback;", "(Ljava/lang/String;Ljava/lang/Double;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V", "createMediaPlayer", "play", "(Ljava/lang/Double;Lcom/facebook/react/bridge/Callback;)V", "pause", "stop", "reset", "(Ljava/lang/Double;)V", "release", "setVolume", ViewProps.LEFT, "", ViewProps.RIGHT, "(Ljava/lang/Double;Ljava/lang/Float;Ljava/lang/Float;)V", "getSystemVolume", "setSystemVolume", "value", "setLooping", "looping", "(Ljava/lang/Double;Ljava/lang/Boolean;)V", "setSpeed", "speed", "(Ljava/lang/Double;Ljava/lang/Float;)V", "setPitch", "pitch", "setCurrentTime", "sec", "(Ljava/lang/Double;F)V", "getCurrentTime", "setSpeakerphoneOn", "speaker", "(Ljava/lang/Double;Z)V", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "onAudioFocusChange", "focusChange", "", "react-native-sound_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class Sound implements AudioManager.OnAudioFocusChangeListener {
    private String category;
    private Double focusedPlayerKey;
    private boolean mixWithOthers;
    private Map<Double, MediaPlayer> playerPool;
    private final ReactApplicationContext reactContext;
    private boolean wasPlayingBeforeFocusChange;

    public Sound(ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.playerPool = new LinkedHashMap();
        this.reactContext = context;
        this.mixWithOthers = true;
    }

    public final String getCategory() {
        return this.category;
    }

    public final void setCategory(String str) {
        this.category = str;
    }

    public final void setOnPlay(boolean isPlaying, double playerKey) {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("isPlaying", isPlaying);
        createMap.putDouble("playerKey", playerKey);
        BridgeReactContext.RCTDeviceEventEmitter rCTDeviceEventEmitter = (BridgeReactContext.RCTDeviceEventEmitter) this.reactContext.getJSModule(BridgeReactContext.RCTDeviceEventEmitter.class);
        if (rCTDeviceEventEmitter != null) {
            rCTDeviceEventEmitter.emit("onPlayChange", createMap);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void prepare(String fileName, Double key, ReadableMap options, final Callback callback) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MediaPlayer createMediaPlayer = createMediaPlayer(fileName);
        if (options.hasKey("speed")) {
            Intrinsics.checkNotNull(createMediaPlayer);
            createMediaPlayer.setPlaybackParams(createMediaPlayer.getPlaybackParams().setSpeed((float) options.getDouble("speed")));
        }
        Integer num = null;
        if (createMediaPlayer == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("code", -1);
            createMap.putString("message", "resource not found");
            callback.invoke(createMap, null);
            return;
        }
        if (key != null) {
            this.playerPool.put(key, createMediaPlayer);
        }
        String str = this.category;
        if (str != null) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -1803461041:
                        if (str.equals("System")) {
                            num = 1;
                            break;
                        }
                        break;
                    case 2547280:
                        if (str.equals("Ring")) {
                            num = 2;
                            break;
                        }
                        break;
                    case 63343153:
                        if (str.equals("Alarm")) {
                            num = 4;
                            break;
                        }
                        break;
                    case 82833682:
                        if (str.equals("Voice")) {
                            num = 0;
                            break;
                        }
                        break;
                    case 772508280:
                        if (str.equals("Ambient")) {
                            num = 5;
                            break;
                        }
                        break;
                    case 1943812667:
                        if (str.equals("Playback")) {
                            num = 3;
                            break;
                        }
                        break;
                }
            }
            if (num != null) {
                createMediaPlayer.setAudioStreamType(num.intValue());
            }
        }
        createMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.zmxv.RNSound.Sound$prepare$1
            private boolean callbackWasCalled;

            public final boolean getCallbackWasCalled() {
                return this.callbackWasCalled;
            }

            public final void setCallbackWasCalled(boolean z) {
                this.callbackWasCalled = z;
            }

            @Override // android.media.MediaPlayer.OnPreparedListener
            public synchronized void onPrepared(MediaPlayer mp) {
                Intrinsics.checkNotNullParameter(mp, "mp");
                if (this.callbackWasCalled) {
                    return;
                }
                this.callbackWasCalled = true;
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putDouble("duration", mp.getDuration() * 0.001d);
                try {
                    Callback.this.invoke(null, createMap2);
                } catch (RuntimeException unused) {
                }
            }
        });
        createMediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.zmxv.RNSound.Sound$prepare$2
            private boolean callbackWasCalled;

            public final boolean getCallbackWasCalled() {
                return this.callbackWasCalled;
            }

            public final void setCallbackWasCalled(boolean z) {
                this.callbackWasCalled = z;
            }

            @Override // android.media.MediaPlayer.OnErrorListener
            public synchronized boolean onError(MediaPlayer mp, int what, int extra) {
                if (this.callbackWasCalled) {
                    return true;
                }
                this.callbackWasCalled = true;
                try {
                    WritableMap createMap2 = Arguments.createMap();
                    createMap2.putInt("what", what);
                    createMap2.putInt("extra", extra);
                    Callback.this.invoke(createMap2, null);
                } catch (RuntimeException unused) {
                }
                return true;
            }
        });
        try {
            if (options.hasKey("loadSync") && options.getBoolean("loadSync")) {
                createMediaPlayer.prepare();
            } else {
                createMediaPlayer.prepareAsync();
            }
        } catch (Exception unused) {
        }
    }

    private final MediaPlayer createMediaPlayer(String fileName) {
        int identifier = this.reactContext.getResources().getIdentifier(fileName, "raw", this.reactContext.getPackageName());
        MediaPlayer mediaPlayer = new MediaPlayer();
        if (identifier != 0) {
            try {
                AssetFileDescriptor openRawResourceFd = this.reactContext.getResources().openRawResourceFd(identifier);
                mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                openRawResourceFd.close();
                return mediaPlayer;
            } catch (IOException unused) {
                return null;
            }
        }
        if (StringsKt.startsWith$default(fileName, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(fileName, "https://", false, 2, (Object) null)) {
            mediaPlayer.setAudioStreamType(3);
            try {
                mediaPlayer.setDataSource(fileName);
                return mediaPlayer;
            } catch (IOException unused2) {
                return null;
            }
        }
        if (StringsKt.startsWith$default(fileName, "asset:/", false, 2, (Object) null)) {
            try {
                AssetFileDescriptor openFd = this.reactContext.getAssets().openFd(StringsKt.replace$default(fileName, "asset:/", "", false, 4, (Object) null));
                Intrinsics.checkNotNullExpressionValue(openFd, "openFd(...)");
                mediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                openFd.close();
                return mediaPlayer;
            } catch (IOException unused3) {
                return null;
            }
        }
        if (StringsKt.startsWith$default(fileName, "file:/", false, 2, (Object) null)) {
            try {
                mediaPlayer.setDataSource(fileName);
                return mediaPlayer;
            } catch (IOException unused4) {
                return null;
            }
        }
        if (new File(fileName).exists()) {
            mediaPlayer.setAudioStreamType(3);
            try {
                mediaPlayer.setDataSource(fileName);
                return mediaPlayer;
            } catch (IOException unused5) {
            }
        }
        return null;
    }

    public final void play(final Double key, final Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(key);
        if (mediaPlayer == null) {
            if (key != null) {
                setOnPlay(false, key.doubleValue());
            }
            if (callback != null) {
                callback.invoke(false);
                return;
            }
            return;
        }
        if (mediaPlayer.isPlaying()) {
            return;
        }
        if (!this.mixWithOthers) {
            Object systemService = this.reactContext.getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            ((AudioManager) systemService).requestAudioFocus(this, 3, 1);
            this.focusedPlayerKey = key;
        }
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.zmxv.RNSound.Sound$play$1
            private boolean callbackWasCalled;

            public final boolean getCallbackWasCalled() {
                return this.callbackWasCalled;
            }

            public final void setCallbackWasCalled(boolean z) {
                this.callbackWasCalled = z;
            }

            @Override // android.media.MediaPlayer.OnCompletionListener
            public synchronized void onCompletion(MediaPlayer mp) {
                Intrinsics.checkNotNullParameter(mp, "mp");
                if (!mp.isLooping()) {
                    Double d = key;
                    if (d != null) {
                        this.setOnPlay(false, d.doubleValue());
                    }
                    if (this.callbackWasCalled) {
                        return;
                    }
                    this.callbackWasCalled = true;
                    try {
                        Callback callback2 = callback;
                        if (callback2 != null) {
                            callback2.invoke(true);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.zmxv.RNSound.Sound$play$2
            private boolean callbackWasCalled;

            public final boolean getCallbackWasCalled() {
                return this.callbackWasCalled;
            }

            public final void setCallbackWasCalled(boolean z) {
                this.callbackWasCalled = z;
            }

            @Override // android.media.MediaPlayer.OnErrorListener
            public synchronized boolean onError(MediaPlayer mp, int what, int extra) {
                Double d = key;
                if (d != null) {
                    this.setOnPlay(false, d.doubleValue());
                }
                if (this.callbackWasCalled) {
                    return true;
                }
                this.callbackWasCalled = true;
                try {
                    Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.invoke(true);
                    }
                } catch (Exception unused) {
                }
                return true;
            }
        });
        mediaPlayer.start();
        if (key != null) {
            setOnPlay(true, key.doubleValue());
        }
    }

    public final void pause(Double key, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(key);
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        }
        if (callback != null) {
            callback.invoke(new Object[0]);
        }
    }

    public final void stop(double key, Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        MediaPlayer mediaPlayer = this.playerPool.get(Double.valueOf(key));
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            mediaPlayer.seekTo(0);
        }
        if (!this.mixWithOthers && Double.valueOf(key) == this.focusedPlayerKey) {
            Object systemService = this.reactContext.getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            ((AudioManager) systemService).abandonAudioFocus(this);
        }
        callback.invoke(new Object[0]);
    }

    public final void reset(Double key) {
        MediaPlayer mediaPlayer = this.playerPool.get(key);
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
    }

    public final void release(double key) {
        MediaPlayer mediaPlayer = this.playerPool.get(Double.valueOf(key));
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            mediaPlayer.release();
            this.playerPool.remove(Double.valueOf(key));
            if (this.mixWithOthers || Double.valueOf(key) != this.focusedPlayerKey) {
                return;
            }
            Object systemService = this.reactContext.getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            ((AudioManager) systemService).abandonAudioFocus(this);
        }
    }

    public final void setVolume(Double key, Float left, Float right) {
        MediaPlayer mediaPlayer = this.playerPool.get(key);
        if (mediaPlayer != null) {
            Intrinsics.checkNotNull(left);
            float floatValue = left.floatValue();
            Intrinsics.checkNotNull(right);
            mediaPlayer.setVolume(floatValue, right.floatValue());
        }
    }

    public final void getSystemVolume(Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Object systemService = this.reactContext.getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            callback.invoke(Float.valueOf(audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3)));
        } catch (Exception e) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("code", -1);
            createMap.putString("message", e.getMessage());
            callback.invoke(createMap);
        }
    }

    public final void setSystemVolume(float value) {
        Object systemService = this.reactContext.getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        ((AudioManager) systemService).setStreamVolume(3, Math.round(r0.getStreamMaxVolume(3) * value), 0);
    }

    public final void setLooping(Double key, Boolean looping) {
        MediaPlayer mediaPlayer = this.playerPool.get(key);
        if (mediaPlayer != null) {
            Intrinsics.checkNotNull(looping);
            mediaPlayer.setLooping(looping.booleanValue());
        }
    }

    public final void setSpeed(Double key, Float speed) {
        MediaPlayer mediaPlayer = this.playerPool.get(key);
        if (mediaPlayer != null) {
            PlaybackParams playbackParams = mediaPlayer.getPlaybackParams();
            Intrinsics.checkNotNull(speed);
            mediaPlayer.setPlaybackParams(playbackParams.setSpeed(speed.floatValue()));
        }
    }

    public final void setPitch(Double key, Float pitch) {
        MediaPlayer mediaPlayer = this.playerPool.get(key);
        if (mediaPlayer != null) {
            PlaybackParams playbackParams = mediaPlayer.getPlaybackParams();
            Intrinsics.checkNotNull(pitch);
            mediaPlayer.setPlaybackParams(playbackParams.setPitch(pitch.floatValue()));
        }
    }

    public final void setCurrentTime(Double key, float sec) {
        MediaPlayer mediaPlayer = this.playerPool.get(key);
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(Math.round(sec * 1000));
        }
    }

    public final void getCurrentTime(Double key, Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        MediaPlayer mediaPlayer = this.playerPool.get(key);
        if (mediaPlayer == null) {
            callback.invoke(-1, false);
        } else {
            callback.invoke(Double.valueOf(mediaPlayer.getCurrentPosition() * 0.001d), Boolean.valueOf(mediaPlayer.isPlaying()));
        }
    }

    public final void setSpeakerphoneOn(Double key, boolean speaker) {
        if (this.playerPool.get(key) != null) {
            Object systemService = this.reactContext.getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            if (speaker) {
                audioManager.setMode(3);
            } else {
                audioManager.setMode(0);
            }
            audioManager.setSpeakerphoneOn(speaker);
        }
    }

    public final void setCategory(String category, Boolean mixWithOthers) {
        this.category = category;
        Intrinsics.checkNotNull(mixWithOthers);
        this.mixWithOthers = mixWithOthers.booleanValue();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int focusChange) {
        MediaPlayer mediaPlayer;
        if (this.mixWithOthers || (mediaPlayer = this.playerPool.get(this.focusedPlayerKey)) == null) {
            return;
        }
        if (focusChange <= 0) {
            boolean isPlaying = mediaPlayer.isPlaying();
            this.wasPlayingBeforeFocusChange = isPlaying;
            if (isPlaying) {
                pause(this.focusedPlayerKey, null);
                return;
            }
            return;
        }
        if (this.wasPlayingBeforeFocusChange) {
            play(this.focusedPlayerKey, null);
            this.wasPlayingBeforeFocusChange = false;
        }
    }
}
