package E;

import android.os.Build;
import android.view.SurfaceHolder;

/* loaded from: classes.dex */
public final class P implements SurfaceHolder.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0013n f133a;

    /* renamed from: b, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f134b;

    /* renamed from: c, reason: collision with root package name */
    public final SurfaceHolderCallbackC0012m f135c;

    /* renamed from: d, reason: collision with root package name */
    public final C0005f f136d = new C0005f(2, this);

    /* renamed from: e, reason: collision with root package name */
    public final O f137e;

    public P(SurfaceHolderCallbackC0012m surfaceHolderCallbackC0012m, C0013n c0013n, io.flutter.embedding.engine.renderer.h hVar) {
        boolean z = Build.VERSION.SDK_INT < 26;
        this.f137e = z ? new O(this, 1) : new O(this, 0);
        this.f135c = surfaceHolderCallbackC0012m;
        this.f134b = hVar;
        this.f133a = c0013n;
        if (z) {
            c0013n.setAlpha(0.0f);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        SurfaceHolderCallbackC0012m surfaceHolderCallbackC0012m = this.f135c;
        if (surfaceHolderCallbackC0012m != null) {
            surfaceHolderCallbackC0012m.surfaceChanged(surfaceHolder, i2, i3, i4);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolderCallbackC0012m surfaceHolderCallbackC0012m = this.f135c;
        if (surfaceHolderCallbackC0012m != null) {
            surfaceHolderCallbackC0012m.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolderCallbackC0012m surfaceHolderCallbackC0012m = this.f135c;
        if (surfaceHolderCallbackC0012m != null) {
            surfaceHolderCallbackC0012m.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        io.flutter.embedding.engine.renderer.h hVar = this.f134b;
        if (hVar == null) {
            return;
        }
        hVar.a(new N(this, runnable));
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
