package D3;

import android.os.Build;
import android.view.SurfaceHolder;

/* loaded from: classes.dex */
public final class N implements SurfaceHolder.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0124l f402a;

    /* renamed from: b, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f403b;

    /* renamed from: c, reason: collision with root package name */
    public final SurfaceHolderCallbackC0123k f404c;

    /* renamed from: d, reason: collision with root package name */
    public final C0118f f405d = new C0118f(2, this);

    /* renamed from: e, reason: collision with root package name */
    public final L f406e;

    public N(SurfaceHolderCallbackC0123k surfaceHolderCallbackC0123k, C0124l c0124l, io.flutter.embedding.engine.renderer.h hVar) {
        boolean z5 = Build.VERSION.SDK_INT < 26;
        this.f406e = z5 ? new J1.c(2, this) : new M(0, this);
        this.f404c = surfaceHolderCallbackC0123k;
        this.f403b = hVar;
        this.f402a = c0124l;
        if (z5) {
            c0124l.setAlpha(0.0f);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
        SurfaceHolderCallbackC0123k surfaceHolderCallbackC0123k = this.f404c;
        if (surfaceHolderCallbackC0123k != null) {
            surfaceHolderCallbackC0123k.surfaceChanged(surfaceHolder, i7, i8, i9);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolderCallbackC0123k surfaceHolderCallbackC0123k = this.f404c;
        if (surfaceHolderCallbackC0123k != null) {
            surfaceHolderCallbackC0123k.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolderCallbackC0123k surfaceHolderCallbackC0123k = this.f404c;
        if (surfaceHolderCallbackC0123k != null) {
            surfaceHolderCallbackC0123k.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        io.flutter.embedding.engine.renderer.h hVar = this.f403b;
        if (hVar == null) {
            return;
        }
        hVar.a(new K(this, runnable));
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
