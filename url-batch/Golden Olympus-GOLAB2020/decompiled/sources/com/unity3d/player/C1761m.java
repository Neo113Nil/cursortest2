package com.unity3d.player;

import android.graphics.SurfaceTexture;

/* renamed from: com.unity3d.player.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1761m implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1766o f22195a;

    public C1761m(C1766o c1766o) {
        this.f22195a = c1766o;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        ((Camera2Wrapper) this.f22195a.f22203a).a(surfaceTexture);
    }
}
