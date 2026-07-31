package com.unity3d.player.a;

import android.graphics.SurfaceTexture;
import com.unity3d.player.Camera2Wrapper;

/* renamed from: com.unity3d.player.a.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0121n implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ C0123p a;

    public C0121n(C0123p c0123p) {
        this.a = c0123p;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        ((Camera2Wrapper) this.a.a).a(surfaceTexture);
    }
}
