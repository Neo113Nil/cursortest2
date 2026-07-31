package com.unity3d.player;

import android.view.SurfaceHolder;
import android.widget.FrameLayout;
import com.unity3d.player.a.C0113f;

/* loaded from: classes2.dex */
public final class M implements SurfaceHolder.Callback {
    public final /* synthetic */ N a;

    public M(N n) {
        this.a = n;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.a.b.updateGLDisplay(0, surfaceHolder.getSurface());
        N n = this.a;
        com.unity3d.player.a.D d = n.c;
        FrameLayout frameLayout = n.b.getFrameLayout();
        com.unity3d.player.a.C c = d.b;
        if (c == null || c.getParent() != null) {
            return;
        }
        frameLayout.addView(d.b);
        frameLayout.bringChildToFront(d.b);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.b.updateGLDisplay(0, surfaceHolder.getSurface());
        this.a.b.sendSurfaceChangedEvent();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        N n = this.a;
        com.unity3d.player.a.D d = n.c;
        C0113f c0113f = n.a;
        d.getClass();
        if (PlatformSupport.NOUGAT_SUPPORT && d.a != null) {
            if (d.b == null) {
                d.b = new com.unity3d.player.a.C(d, d.a);
            }
            d.b.a(c0113f);
        }
        this.a.b.updateGLDisplay(0, null);
    }
}
