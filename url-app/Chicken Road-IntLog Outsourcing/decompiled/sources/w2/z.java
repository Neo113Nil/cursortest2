package w2;

import android.os.Build;
import android.view.SurfaceHolder;

/* loaded from: classes.dex */
public final class z implements SurfaceHolder.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final C1520h f12222a;

    /* renamed from: b, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.i f12223b;

    /* renamed from: c, reason: collision with root package name */
    public final SurfaceHolderCallbackC1519g f12224c;

    /* renamed from: d, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.a f12225d = new io.flutter.embedding.engine.renderer.a(3, this);

    /* renamed from: e, reason: collision with root package name */
    public final y f12226e;

    public z(SurfaceHolderCallbackC1519g surfaceHolderCallbackC1519g, C1520h c1520h, io.flutter.embedding.engine.renderer.i iVar) {
        boolean z = Build.VERSION.SDK_INT < 26;
        this.f12226e = z ? new V0.j(26, this) : new U.e(this);
        this.f12224c = surfaceHolderCallbackC1519g;
        this.f12223b = iVar;
        this.f12222a = c1520h;
        if (z) {
            c1520h.setAlpha(0.0f);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i6) {
        SurfaceHolderCallbackC1519g surfaceHolderCallbackC1519g = this.f12224c;
        if (surfaceHolderCallbackC1519g != null) {
            surfaceHolderCallbackC1519g.surfaceChanged(surfaceHolder, i2, i3, i6);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolderCallbackC1519g surfaceHolderCallbackC1519g = this.f12224c;
        if (surfaceHolderCallbackC1519g != null) {
            surfaceHolderCallbackC1519g.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolderCallbackC1519g surfaceHolderCallbackC1519g = this.f12224c;
        if (surfaceHolderCallbackC1519g != null) {
            surfaceHolderCallbackC1519g.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        io.flutter.embedding.engine.renderer.i iVar = this.f12223b;
        if (iVar == null) {
            return;
        }
        iVar.a(new x(this, runnable));
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
