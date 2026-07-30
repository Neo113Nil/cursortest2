package h4;

import android.os.Build;
import android.view.SurfaceHolder;

/* loaded from: classes.dex */
public final class G implements SurfaceHolder.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final k f5177a;

    /* renamed from: b, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.j f5178b;

    /* renamed from: c, reason: collision with root package name */
    public final j f5179c;

    /* renamed from: d, reason: collision with root package name */
    public final C0489d f5180d = new C0489d(2, this);

    /* renamed from: e, reason: collision with root package name */
    public final C0485F f5181e;

    public G(j jVar, k kVar, io.flutter.embedding.engine.renderer.j jVar2) {
        boolean z7 = Build.VERSION.SDK_INT < 26;
        this.f5181e = z7 ? new C0485F(this, 1) : new C0485F(this, 0);
        this.f5179c = jVar;
        this.f5178b = jVar2;
        this.f5177a = kVar;
        if (z7) {
            kVar.setAlpha(0.0f);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i5, int i7) {
        j jVar = this.f5179c;
        if (jVar != null) {
            jVar.surfaceChanged(surfaceHolder, i2, i5, i7);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        j jVar = this.f5179c;
        if (jVar != null) {
            jVar.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        j jVar = this.f5179c;
        if (jVar != null) {
            jVar.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        io.flutter.embedding.engine.renderer.j jVar = this.f5178b;
        if (jVar == null) {
            return;
        }
        jVar.a(new C0484E(this, runnable));
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
