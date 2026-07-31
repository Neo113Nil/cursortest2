package com.unity3d.player;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import h1.C2441b;
import h1.C2442c;

/* loaded from: classes2.dex */
public final class O0 implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForGameActivity f22060a;

    public O0(UnityPlayerForGameActivity unityPlayerForGameActivity) {
        this.f22060a = unityPlayerForGameActivity;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C2442c c2442c;
        UnityPlayerForGameActivity unityPlayerForGameActivity = this.f22060a;
        c2442c = unityPlayerForGameActivity.m_PersistentUnitySurface;
        FrameLayout frameLayout = unityPlayerForGameActivity.getFrameLayout();
        C2441b c2441b = c2442c.f36733b;
        if (c2441b == null || c2441b.getParent() != null) {
            return;
        }
        frameLayout.addView(c2442c.f36733b);
        frameLayout.bringChildToFront(c2442c.f36733b);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C2442c c2442c;
        UnityPlayerForGameActivity unityPlayerForGameActivity = this.f22060a;
        c2442c = unityPlayerForGameActivity.m_PersistentUnitySurface;
        SurfaceView surfaceView = unityPlayerForGameActivity.m_SurfaceView;
        if (c2442c.f36732a != null) {
            if (c2442c.f36733b == null) {
                c2442c.f36733b = new C2441b(c2442c, c2442c.f36732a);
            }
            c2442c.f36733b.a(surfaceView);
        }
    }
}
