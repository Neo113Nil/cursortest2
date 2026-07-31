package com.unity3d.player;

import android.graphics.SurfaceTexture;

/* renamed from: com.unity3d.player.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0045v implements SurfaceTexture.OnFrameAvailableListener {
    final /* synthetic */ C0047w a;

    C0045v(C0047w c0047w) {
        this.a = c0047w;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        com.unity3d.player.a.b bVar;
        bVar = this.a.a;
        ((Camera2Wrapper) bVar).a(surfaceTexture);
    }
}
