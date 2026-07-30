package c0;

import android.os.Build;
import android.view.SurfaceHolder;

/* loaded from: classes.dex */
public final class K implements SurfaceHolder.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final l f1679a;

    /* renamed from: b, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f1680b;

    /* renamed from: c, reason: collision with root package name */
    public final SurfaceHolderCallbackC0109k f1681c;

    /* renamed from: d, reason: collision with root package name */
    public final C0105g f1682d = new C0105g(2, this);

    /* renamed from: e, reason: collision with root package name */
    public final J f1683e;

    public K(SurfaceHolderCallbackC0109k surfaceHolderCallbackC0109k, l lVar, io.flutter.embedding.engine.renderer.h hVar) {
        boolean z2 = Build.VERSION.SDK_INT < 26;
        this.f1683e = z2 ? new J(this, 1) : new J(this, 0);
        this.f1681c = surfaceHolderCallbackC0109k;
        this.f1680b = hVar;
        this.f1679a = lVar;
        if (z2) {
            lVar.setAlpha(0.0f);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        SurfaceHolderCallbackC0109k surfaceHolderCallbackC0109k = this.f1681c;
        if (surfaceHolderCallbackC0109k != null) {
            surfaceHolderCallbackC0109k.surfaceChanged(surfaceHolder, i2, i3, i4);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolderCallbackC0109k surfaceHolderCallbackC0109k = this.f1681c;
        if (surfaceHolderCallbackC0109k != null) {
            surfaceHolderCallbackC0109k.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolderCallbackC0109k surfaceHolderCallbackC0109k = this.f1681c;
        if (surfaceHolderCallbackC0109k != null) {
            surfaceHolderCallbackC0109k.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        io.flutter.embedding.engine.renderer.h hVar = this.f1680b;
        if (hVar == null) {
            return;
        }
        hVar.a(new I(this, runnable));
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
