package E1;

import android.os.Build;
import android.view.SurfaceHolder;
import b0.C0178i;

/* loaded from: classes.dex */
public final class L implements SurfaceHolder.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0036l f324a;

    /* renamed from: b, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.j f325b;

    /* renamed from: c, reason: collision with root package name */
    public final SurfaceHolderCallbackC0035k f326c;

    /* renamed from: d, reason: collision with root package name */
    public final C0030f f327d = new C0030f(2, this);

    /* renamed from: e, reason: collision with root package name */
    public final K f328e;

    public L(SurfaceHolderCallbackC0035k surfaceHolderCallbackC0035k, C0036l c0036l, io.flutter.embedding.engine.renderer.j jVar) {
        boolean z = Build.VERSION.SDK_INT < 26;
        this.f328e = z ? new C0178i(2, this) : new C0.e(2, this);
        this.f326c = surfaceHolderCallbackC0035k;
        this.f325b = jVar;
        this.f324a = c0036l;
        if (z) {
            c0036l.setAlpha(0.0f);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
        SurfaceHolderCallbackC0035k surfaceHolderCallbackC0035k = this.f326c;
        if (surfaceHolderCallbackC0035k != null) {
            surfaceHolderCallbackC0035k.surfaceChanged(surfaceHolder, i3, i4, i5);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolderCallbackC0035k surfaceHolderCallbackC0035k = this.f326c;
        if (surfaceHolderCallbackC0035k != null) {
            surfaceHolderCallbackC0035k.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolderCallbackC0035k surfaceHolderCallbackC0035k = this.f326c;
        if (surfaceHolderCallbackC0035k != null) {
            surfaceHolderCallbackC0035k.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        io.flutter.embedding.engine.renderer.j jVar = this.f325b;
        if (jVar == null) {
            return;
        }
        jVar.a(new J(this, runnable));
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
