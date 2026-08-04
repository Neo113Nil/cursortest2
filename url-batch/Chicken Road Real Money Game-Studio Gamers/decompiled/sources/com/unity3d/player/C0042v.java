package com.unity3d.player;

import android.graphics.SurfaceTexture;

/* renamed from: com.unity3d.player.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0042v implements SurfaceTexture.OnFrameAvailableListener {
    final /* synthetic */ C0044w a;

    C0042v(C0044w c0044w) {
        this.a = c0044w;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        com.unity3d.player.a.b bVar;
        bVar = this.a.a;
        ((Camera2Wrapper) bVar).a(surfaceTexture);
    }
}
