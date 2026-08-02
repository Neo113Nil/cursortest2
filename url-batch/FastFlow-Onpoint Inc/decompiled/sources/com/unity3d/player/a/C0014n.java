package com.unity3d.player.a;

import android.graphics.SurfaceTexture;
import com.unity3d.player.Camera2Wrapper;

/* renamed from: com.unity3d.player.a.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014n implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ C0016p a;

    public C0014n(C0016p c0016p) {
        this.a = c0016p;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        ((Camera2Wrapper) this.a.a).a(surfaceTexture);
    }
}
