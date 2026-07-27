package w2;

import android.view.SurfaceHolder;

/* renamed from: w2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC1519g implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1520h f12152a;

    public SurfaceHolderCallbackC1519g(C1520h c1520h) {
        this.f12152a = c1520h;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i6) {
        C1520h c1520h = this.f12152a;
        io.flutter.embedding.engine.renderer.i iVar = c1520h.f12155c;
        if (iVar == null || c1520h.f12154b) {
            return;
        }
        if (iVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        iVar.f10146a.onSurfaceChanged(i3, i6);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C1520h c1520h = this.f12152a;
        c1520h.f12153a = true;
        if ((c1520h.f12155c == null || c1520h.f12154b) ? false : true) {
            c1520h.e();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C1520h c1520h = this.f12152a;
        boolean z = false;
        c1520h.f12153a = false;
        io.flutter.embedding.engine.renderer.i iVar = c1520h.f12155c;
        if (iVar != null && !c1520h.f12154b) {
            z = true;
        }
        if (z) {
            if (iVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            iVar.e();
        }
    }
}
