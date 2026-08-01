package D;

import android.os.Build;
import android.view.SurfaceHolder;

/* loaded from: classes.dex */
public final class T implements SurfaceHolder.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0014o f55a;

    /* renamed from: b, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f56b;

    /* renamed from: c, reason: collision with root package name */
    public final SurfaceHolderCallbackC0013n f57c;

    /* renamed from: d, reason: collision with root package name */
    public final C0006g f58d = new C0006g(2, this);

    /* renamed from: e, reason: collision with root package name */
    public final S f59e;

    public T(SurfaceHolderCallbackC0013n surfaceHolderCallbackC0013n, C0014o c0014o, io.flutter.embedding.engine.renderer.h hVar) {
        boolean z2 = Build.VERSION.SDK_INT < 26;
        this.f59e = z2 ? new S(this, 1) : new S(this, 0);
        this.f57c = surfaceHolderCallbackC0013n;
        this.f56b = hVar;
        this.f55a = c0014o;
        if (z2) {
            c0014o.setAlpha(0.0f);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        SurfaceHolderCallbackC0013n surfaceHolderCallbackC0013n = this.f57c;
        if (surfaceHolderCallbackC0013n != null) {
            surfaceHolderCallbackC0013n.surfaceChanged(surfaceHolder, i2, i3, i4);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolderCallbackC0013n surfaceHolderCallbackC0013n = this.f57c;
        if (surfaceHolderCallbackC0013n != null) {
            surfaceHolderCallbackC0013n.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolderCallbackC0013n surfaceHolderCallbackC0013n = this.f57c;
        if (surfaceHolderCallbackC0013n != null) {
            surfaceHolderCallbackC0013n.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        io.flutter.embedding.engine.renderer.h hVar = this.f56b;
        if (hVar == null) {
            return;
        }
        hVar.a(new Q(this, runnable));
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
