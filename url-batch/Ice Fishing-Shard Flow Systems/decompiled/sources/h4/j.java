package h4;

import android.view.SurfaceHolder;

/* loaded from: classes.dex */
public final class j implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f5216a;

    public j(k kVar) {
        this.f5216a = kVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i5, int i7) {
        k kVar = this.f5216a;
        io.flutter.embedding.engine.renderer.j jVar = kVar.f5219i;
        if (jVar == null || kVar.f5218e) {
            return;
        }
        if (jVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        jVar.f5598a.onSurfaceChanged(i5, i7);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        k kVar = this.f5216a;
        kVar.f5217d = true;
        if (kVar.f5219i == null || kVar.f5218e) {
            return;
        }
        kVar.e();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        k kVar = this.f5216a;
        kVar.f5217d = false;
        io.flutter.embedding.engine.renderer.j jVar = kVar.f5219i;
        if (jVar == null || kVar.f5218e) {
            return;
        }
        if (jVar == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        jVar.j();
    }
}
