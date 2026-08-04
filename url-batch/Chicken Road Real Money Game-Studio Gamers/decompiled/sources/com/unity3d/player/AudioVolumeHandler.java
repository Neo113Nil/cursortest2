package com.unity3d.player;

import android.content.Context;

/* loaded from: classes.dex */
public class AudioVolumeHandler implements InterfaceC0030p {
    private C0032q a;

    AudioVolumeHandler(Context context) {
        C0032q c0032q = new C0032q(context);
        this.a = c0032q;
        c0032q.a(this);
    }

    public final void a() {
        this.a.a();
        this.a = null;
    }

    @Override // com.unity3d.player.InterfaceC0030p
    public final native void onAudioVolumeChanged(int i);
}
