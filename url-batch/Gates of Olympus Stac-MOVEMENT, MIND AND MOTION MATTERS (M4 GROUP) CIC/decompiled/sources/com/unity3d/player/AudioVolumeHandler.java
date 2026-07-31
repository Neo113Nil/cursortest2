package com.unity3d.player;

import android.content.Context;

/* loaded from: classes.dex */
public class AudioVolumeHandler implements InterfaceC0033p {
    private C0035q a;

    AudioVolumeHandler(Context context) {
        C0035q c0035q = new C0035q(context);
        this.a = c0035q;
        c0035q.a(this);
    }

    public final void a() {
        this.a.a();
        this.a = null;
    }

    @Override // com.unity3d.player.InterfaceC0033p
    public final native void onAudioVolumeChanged(int i);
}
