package e0;

import android.os.Build;
import android.view.SurfaceHolder;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class q0 implements SurfaceHolder.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final m f200a;

    /* renamed from: b, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f201b;

    /* renamed from: c, reason: collision with root package name */
    public final l f202c;

    /* renamed from: d, reason: collision with root package name */
    public final g f203d = new g(2, this);

    /* renamed from: e, reason: collision with root package name */
    public final p0 f204e;

    public q0(l lVar, m mVar, io.flutter.embedding.engine.renderer.h hVar) {
        boolean z2 = Build.VERSION.SDK_INT < 26;
        this.f204e = z2 ? new p0(this, 1) : new p0(this, 0);
        this.f202c = lVar;
        this.f201b = hVar;
        this.f200a = mVar;
        if (z2) {
            mVar.setAlpha(0.0f);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        l lVar = this.f202c;
        if (lVar != null) {
            lVar.surfaceChanged(surfaceHolder, i2, i3, i4);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        l lVar = this.f202c;
        if (lVar != null) {
            lVar.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        l lVar = this.f202c;
        if (lVar != null) {
            lVar.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        io.flutter.embedding.engine.renderer.h hVar = this.f201b;
        if (hVar == null) {
            return;
        }
        hVar.a(new o0(this, runnable));
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
