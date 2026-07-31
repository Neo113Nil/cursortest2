package k0;

import android.view.SurfaceHolder;

/* renamed from: k0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC0192i implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f2697a;

    public SurfaceHolderCallbackC0192i(j jVar) {
        this.f2697a = jVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        j jVar = this.f2697a;
        io.flutter.embedding.engine.renderer.i iVar = jVar.f2700g;
        if (iVar == null || jVar.f2699f) {
            return;
        }
        if (iVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        iVar.f2389a.onSurfaceChanged(i3, i4);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        j jVar = this.f2697a;
        jVar.f2698e = true;
        if (jVar.f2700g == null || jVar.f2699f) {
            return;
        }
        jVar.e();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        j jVar = this.f2697a;
        jVar.f2698e = false;
        io.flutter.embedding.engine.renderer.i iVar = jVar.f2700g;
        if (iVar == null || jVar.f2699f) {
            return;
        }
        if (iVar == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        iVar.e();
    }
}
