package io.flutter.plugin.platform;

import android.graphics.Rect;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import io.appmetrica.analytics.impl.Wo;

/* loaded from: classes.dex */
public final class p implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SurfaceView f9274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f9275b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rect f9276c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f9278e;

    public p(q qVar, SurfaceView surfaceView, float f, Rect rect, int i3) {
        this.f9278e = qVar;
        this.f9274a = surfaceView;
        this.f9275b = f;
        this.f9276c = rect;
        this.f9277d = i3;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceControl surfaceControl;
        boolean isValid;
        SurfaceControl.Transaction alpha;
        SurfaceView surfaceView = this.f9274a;
        surfaceControl = surfaceView.getSurfaceControl();
        q qVar = this.f9278e;
        if (surfaceControl != null) {
            isValid = surfaceControl.isValid();
            if (isValid) {
                qVar.getClass();
                SurfaceControl.Transaction h3 = Wo.h();
                qVar.f9289l.add(h3);
                alpha = h3.setAlpha(surfaceControl, this.f9275b);
                alpha.setCrop(surfaceControl, this.f9276c);
                qVar.f9283e.scheduleFrame();
                qVar.f9292p.remove(Integer.valueOf(this.f9277d));
                surfaceView.getHolder().removeCallback(this);
            }
        }
        surfaceView.getId();
        qVar.f9283e.scheduleFrame();
        qVar.f9292p.remove(Integer.valueOf(this.f9277d));
        surfaceView.getHolder().removeCallback(this);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f9278e.f9292p.remove(Integer.valueOf(this.f9277d));
        this.f9274a.getHolder().removeCallback(this);
    }
}
