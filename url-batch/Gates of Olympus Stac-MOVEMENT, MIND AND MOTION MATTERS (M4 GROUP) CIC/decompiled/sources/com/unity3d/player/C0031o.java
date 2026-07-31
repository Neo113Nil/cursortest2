package com.unity3d.player;

import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;

/* renamed from: com.unity3d.player.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0031o extends ContentObserver {
    private final InterfaceC0033p a;
    private final AudioManager b;
    private final int c;
    private int d;

    public C0031o(Handler handler, AudioManager audioManager, InterfaceC0033p interfaceC0033p) {
        super(handler);
        this.b = audioManager;
        this.c = 3;
        this.a = interfaceC0033p;
        this.d = audioManager.getStreamVolume(3);
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return super.deliverSelfNotifications();
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
