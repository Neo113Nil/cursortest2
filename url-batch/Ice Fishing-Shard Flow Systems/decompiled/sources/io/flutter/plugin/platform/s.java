package io.flutter.plugin.platform;

import android.graphics.Rect;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* loaded from: classes.dex */
public final class s implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SurfaceView f5725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f5726b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rect f5727c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f5729e;

    public s(t tVar, SurfaceView surfaceView, float f7, Rect rect, int i2) {
        this.f5729e = tVar;
        this.f5725a = surfaceView;
        this.f5726b = f7;
        this.f5727c = rect;
        this.f5728d = i2;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i5, int i7) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceControl surfaceControl;
        boolean isValid;
        SurfaceControl.Transaction alpha;
        SurfaceView surfaceView = this.f5725a;
        surfaceControl = surfaceView.getSurfaceControl();
        t tVar = this.f5729e;
        if (surfaceControl != null) {
            isValid = surfaceControl.isValid();
            if (isValid) {
                tVar.getClass();
                SurfaceControl.Transaction g7 = com.google.firebase.messaging.v.g();
                tVar.f5741t.add(g7);
                alpha = g7.setAlpha(surfaceControl, this.f5726b);
                alpha.setCrop(surfaceControl, this.f5727c);
                tVar.f5734m.scheduleFrame();
                tVar.f5745x.remove(Integer.valueOf(this.f5728d));
                surfaceView.getHolder().removeCallback(this);
            }
        }
        surfaceView.getId();
        tVar.f5734m.scheduleFrame();
        tVar.f5745x.remove(Integer.valueOf(this.f5728d));
        surfaceView.getHolder().removeCallback(this);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f5729e.f5745x.remove(Integer.valueOf(this.f5728d));
        this.f5725a.getHolder().removeCallback(this);
    }
}
