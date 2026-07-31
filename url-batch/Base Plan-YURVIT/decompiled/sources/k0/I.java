package k0;

import android.os.Build;
import android.view.SurfaceHolder;

/* loaded from: classes.dex */
public final class I implements SurfaceHolder.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final j f2658a;

    /* renamed from: b, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.i f2659b;

    /* renamed from: c, reason: collision with root package name */
    public final SurfaceHolderCallbackC0192i f2660c;

    /* renamed from: d, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.a f2661d = new io.flutter.embedding.engine.renderer.a(3, this);

    /* renamed from: e, reason: collision with root package name */
    public final H f2662e;

    public I(SurfaceHolderCallbackC0192i surfaceHolderCallbackC0192i, j jVar, io.flutter.embedding.engine.renderer.i iVar) {
        boolean z2 = Build.VERSION.SDK_INT < 26;
        this.f2662e = z2 ? new H(this, 1) : new H(this, 0);
        this.f2660c = surfaceHolderCallbackC0192i;
        this.f2659b = iVar;
        this.f2658a = jVar;
        if (z2) {
            jVar.setAlpha(0.0f);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        SurfaceHolderCallbackC0192i surfaceHolderCallbackC0192i = this.f2660c;
        if (surfaceHolderCallbackC0192i != null) {
            surfaceHolderCallbackC0192i.surfaceChanged(surfaceHolder, i2, i3, i4);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolderCallbackC0192i surfaceHolderCallbackC0192i = this.f2660c;
        if (surfaceHolderCallbackC0192i != null) {
            surfaceHolderCallbackC0192i.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolderCallbackC0192i surfaceHolderCallbackC0192i = this.f2660c;
        if (surfaceHolderCallbackC0192i != null) {
            surfaceHolderCallbackC0192i.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        io.flutter.embedding.engine.renderer.i iVar = this.f2659b;
        if (iVar == null) {
            return;
        }
        iVar.a(new G(this, runnable));
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
