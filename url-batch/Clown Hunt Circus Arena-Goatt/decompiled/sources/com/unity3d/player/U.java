package com.unity3d.player;

import android.view.SurfaceHolder;
import android.widget.FrameLayout;
import com.unity3d.player.a.C0143g;

/* loaded from: classes.dex */
public final class U implements SurfaceHolder.Callback {
    public final /* synthetic */ V a;

    public U(V v) {
        this.a = v;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.a.b.updateGLDisplay(0, surfaceHolder.getSurface());
        V v = this.a;
        com.unity3d.player.a.C c = v.c;
        FrameLayout frameLayout = v.b.getFrameLayout();
        com.unity3d.player.a.B b = c.b;
        if (b == null || b.getParent() != null) {
            return;
        }
        frameLayout.addView(c.b);
        frameLayout.bringChildToFront(c.b);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.b.updateGLDisplay(0, surfaceHolder.getSurface());
        this.a.b.sendSurfaceChangedEvent();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        V v = this.a;
        com.unity3d.player.a.C c = v.c;
        C0143g c0143g = v.a;
        if (c.a != null) {
            if (c.b == null) {
                c.b = new com.unity3d.player.a.B(c, c.a);
            }
            c.b.a(c0143g);
        }
        this.a.b.updateGLDisplay(0, null);
    }
}
