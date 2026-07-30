package com.unity3d.player;

import android.graphics.SurfaceTexture;

/* renamed from: com.unity3d.player.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180n implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ C0184p a;

    public C0180n(C0184p c0184p) {
        this.a = c0184p;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        ((Camera2Wrapper) this.a.a).a(surfaceTexture);
    }
}
