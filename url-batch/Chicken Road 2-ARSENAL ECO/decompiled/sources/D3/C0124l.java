package D3;

import a.AbstractC0219a;
import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* renamed from: D3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124l extends SurfaceView implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: f, reason: collision with root package name */
    public boolean f445f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f446g;

    /* renamed from: h, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f447h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f448i;

    /* renamed from: j, reason: collision with root package name */
    public final N f449j;

    public C0124l(AbstractActivityC0117e abstractActivityC0117e, boolean z5) {
        super(abstractActivityC0117e, null);
        this.f445f = false;
        this.f446g = false;
        this.f448i = false;
        N n7 = new N(new SurfaceHolderCallbackC0123k(this), this, this.f447h);
        this.f449j = n7;
        if (z5) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        this.f448i = AbstractC0219a.v(getContext());
        getHolder().addCallback(n7);
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a() {
        if (this.f447h == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.h hVar = this.f447h;
            if (hVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
        }
        this.f449j.f406e.e();
        this.f447h = null;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        if (this.f447h == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.f449j.f406e.i();
        if (this.f445f) {
            e();
        }
        this.f446g = false;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void c(io.flutter.embedding.engine.renderer.h hVar) {
        io.flutter.embedding.engine.renderer.h hVar2 = this.f447h;
        if (hVar2 != null) {
            hVar2.e();
        }
        this.f447h = hVar;
        this.f449j.f406e.p(hVar);
        b();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void d() {
        if (this.f447h == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f446g = true;
        }
    }

    public final void e() {
        if (this.f447h == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        io.flutter.embedding.engine.renderer.h hVar = this.f447h;
        Surface surface = getHolder().getSurface();
        boolean z5 = this.f446g;
        FlutterJNI flutterJNI = hVar.f4486a;
        if (!z5) {
            hVar.e();
        }
        hVar.f4487b = surface;
        if (z5) {
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
        int i7 = iArr[0];
        region.op(i7, iArr[1], (getRight() + i7) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f447h;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i7, int i8) {
        if (!this.f448i) {
            super.onMeasure(i7, i8);
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i7), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i8), View.MeasureSpec.getMode(i8) == 0 ? 1 : 0));
    }
}
