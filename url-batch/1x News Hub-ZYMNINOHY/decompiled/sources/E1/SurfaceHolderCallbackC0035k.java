package E1;

import android.view.SurfaceHolder;

/* renamed from: E1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC0035k implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0036l f363a;

    public SurfaceHolderCallbackC0035k(C0036l c0036l) {
        this.f363a = c0036l;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
        C0036l c0036l = this.f363a;
        io.flutter.embedding.engine.renderer.j jVar = c0036l.f366c;
        if (jVar == null || c0036l.f365b) {
            return;
        }
        if (jVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        jVar.f9162a.onSurfaceChanged(i4, i5);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C0036l c0036l = this.f363a;
        c0036l.f364a = true;
        if ((c0036l.f366c == null || c0036l.f365b) ? false : true) {
            c0036l.e();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C0036l c0036l = this.f363a;
        boolean z = false;
        c0036l.f364a = false;
        io.flutter.embedding.engine.renderer.j jVar = c0036l.f366c;
        if (jVar != null && !c0036l.f365b) {
            z = true;
        }
        if (z) {
            if (jVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            jVar.j();
        }
    }
}
