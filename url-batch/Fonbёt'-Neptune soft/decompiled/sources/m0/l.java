package m0;

import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class l extends SurfaceView implements io.flutter.embedding.engine.renderer.n {

    /* renamed from: e, reason: collision with root package name */
    public boolean f3169e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3170f;

    /* renamed from: g, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.l f3171g;

    /* renamed from: h, reason: collision with root package name */
    public final C0265e f3172h;

    public l(AbstractActivityC0264d abstractActivityC0264d, boolean z2) {
        super(abstractActivityC0264d, null);
        this.f3169e = false;
        this.f3170f = false;
        k kVar = new k(this);
        this.f3172h = new C0265e(1, this);
        if (z2) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(kVar);
        setAlpha(0.0f);
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void a(io.flutter.embedding.engine.renderer.l lVar) {
        io.flutter.embedding.engine.renderer.l lVar2 = this.f3171g;
        if (lVar2 != null) {
            lVar2.g();
            this.f3171g.f2537a.removeIsDisplayingFlutterUiListener(this.f3172h);
        }
        this.f3171g = lVar;
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void b() {
        if (this.f3171g == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f3170f = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void c() {
        if (this.f3171g == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.l lVar = this.f3171g;
            if (lVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            lVar.g();
        }
        setAlpha(0.0f);
        this.f3171g.f2537a.removeIsDisplayingFlutterUiListener(this.f3172h);
        this.f3171g = null;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void d() {
        io.flutter.embedding.engine.renderer.l lVar = this.f3171g;
        if (lVar == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        FlutterJNI flutterJNI = lVar.f2537a;
        C0265e c0265e = this.f3172h;
        flutterJNI.addIsDisplayingFlutterUiListener(c0265e);
        if (lVar.f2540d) {
            c0265e.b();
        }
        if (this.f3169e) {
            e();
        }
        this.f3170f = false;
    }

    public final void e() {
        if (this.f3171g == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        io.flutter.embedding.engine.renderer.l lVar = this.f3171g;
        Surface surface = getHolder().getSurface();
        boolean z2 = this.f3170f;
        if (!z2) {
            lVar.g();
        }
        lVar.f2539c = surface;
        FlutterJNI flutterJNI = lVar.f2537a;
        if (z2) {
            flutterJNI.onSurfaceWindowChanged(surface);
        } else {
            flutterJNI.onSurfaceCreated(surface);
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i2 = iArr[0];
        region.op(i2, iArr[1], (getRight() + i2) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public io.flutter.embedding.engine.renderer.l getAttachedRenderer() {
        return this.f3171g;
    }
}
