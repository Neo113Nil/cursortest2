package com.unity3d.player.a;

import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import com.unity3d.player.AudioVolumeHandler;

/* renamed from: com.unity3d.player.a.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0007g extends ContentObserver {
    public final AudioVolumeHandler a;
    public final AudioManager b;
    public final int c;
    public int d;

    public C0007g(Handler handler, AudioManager audioManager, AudioVolumeHandler audioVolumeHandler) {
        super(handler);
        this.b = audioManager;
        this.c = 3;
        this.a = audioVolumeHandler;
        this.d = audioManager.getStreamVolume(3);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        int streamVolume;
        AudioManager audioManager = this.b;
        if (audioManager == null || this.a == null || (streamVolume = audioManager.getStreamVolume(this.c)) == this.d) {
            return;
        }
        this.d = streamVolume;
        this.a.onAudioVolumeChanged(streamVolume);
    }
}
