package com.unity3d.player;

import android.view.SurfaceHolder;
import android.widget.FrameLayout;
import h1.C2439A;
import h1.C2441b;
import h1.C2442c;

/* loaded from: classes2.dex */
public final class T implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f22078a;

    public T(U u4) {
        this.f22078a = u4;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
        this.f22078a.f22081b.updateGLDisplay(0, surfaceHolder.getSurface());
        this.f22078a.f22081b.sendSurfaceChangedEvent();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f22078a.f22081b.updateGLDisplay(0, surfaceHolder.getSurface());
        U u4 = this.f22078a;
        C2442c c2442c = u4.f22082c;
        FrameLayout frameLayout = u4.f22081b.getFrameLayout();
        C2441b c2441b = c2442c.f36733b;
        if (c2441b == null || c2441b.getParent() != null) {
            return;
        }
        frameLayout.addView(c2442c.f36733b);
        frameLayout.bringChildToFront(c2442c.f36733b);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        U u4 = this.f22078a;
        C2442c c2442c = u4.f22082c;
        C2439A c2439a = u4.f22080a;
        if (c2442c.f36732a != null) {
            if (c2442c.f36733b == null) {
                c2442c.f36733b = new C2441b(c2442c, c2442c.f36732a);
            }
            c2442c.f36733b.a(c2439a);
        }
        this.f22078a.f22081b.updateGLDisplay(0, null);
    }
}
