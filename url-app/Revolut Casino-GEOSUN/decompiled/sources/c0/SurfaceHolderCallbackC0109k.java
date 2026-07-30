package c0;

import android.view.SurfaceHolder;

/* renamed from: c0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC0109k implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f1720a;

    public SurfaceHolderCallbackC0109k(l lVar) {
        this.f1720a = lVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        l lVar = this.f1720a;
        io.flutter.embedding.engine.renderer.h hVar = lVar.f1723g;
        if (hVar == null || lVar.f1722f) {
            return;
        }
        if (hVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        hVar.f2385a.onSurfaceChanged(i3, i4);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        l lVar = this.f1720a;
        lVar.f1721e = true;
        if ((lVar.f1723g == null || lVar.f1722f) ? false : true) {
            lVar.e();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        l lVar = this.f1720a;
        boolean z2 = false;
        lVar.f1721e = false;
        io.flutter.embedding.engine.renderer.h hVar = lVar.f1723g;
        if (hVar != null && !lVar.f1722f) {
            z2 = true;
        }
        if (z2) {
            if (hVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
        }
    }
}
