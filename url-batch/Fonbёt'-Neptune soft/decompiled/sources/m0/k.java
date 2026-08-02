package m0;

import android.view.SurfaceHolder;

/* loaded from: classes.dex */
public final class k implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f3168a;

    public k(l lVar) {
        this.f3168a = lVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        l lVar = this.f3168a;
        io.flutter.embedding.engine.renderer.l lVar2 = lVar.f3171g;
        if (lVar2 == null || lVar.f3170f) {
            return;
        }
        if (lVar2 == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        lVar2.f2537a.onSurfaceChanged(i3, i4);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        l lVar = this.f3168a;
        lVar.f3169e = true;
        if ((lVar.f3171g == null || lVar.f3170f) ? false : true) {
            lVar.e();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        l lVar = this.f3168a;
        boolean z2 = false;
        lVar.f3169e = false;
        io.flutter.embedding.engine.renderer.l lVar2 = lVar.f3171g;
        if (lVar2 != null && !lVar.f3170f) {
            z2 = true;
        }
        if (z2) {
            if (lVar2 == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            lVar2.g();
        }
    }
}
