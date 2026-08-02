package E1;

import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* renamed from: E1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036l extends SurfaceView implements io.flutter.embedding.engine.renderer.m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f364a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f365b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.j f366c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f367d;

    /* renamed from: e, reason: collision with root package name */
    public final L f368e;

    public C0036l(AbstractActivityC0029e abstractActivityC0029e, boolean z) {
        super(abstractActivityC0029e, null);
        this.f364a = false;
        this.f365b = false;
        this.f367d = false;
        L l3 = new L(new SurfaceHolderCallbackC0035k(this), this, this.f366c);
        this.f368e = l3;
        if (z) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        this.f367d = android.support.v4.media.session.a.A(getContext());
        getHolder().addCallback(l3);
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a() {
        if (this.f366c == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.j jVar = this.f366c;
            if (jVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            jVar.j();
        }
        this.f368e.f328e.g();
        this.f366c = null;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        if (this.f366c == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f365b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void c() {
        if (this.f366c == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.f368e.f328e.j();
        if (this.f364a) {
            e();
        }
        this.f365b = false;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void d(io.flutter.embedding.engine.renderer.j jVar) {
        io.flutter.embedding.engine.renderer.j jVar2 = this.f366c;
        if (jVar2 != null) {
            jVar2.j();
        }
        this.f366c = jVar;
        this.f368e.f328e.r(jVar);
        c();
    }

    public final void e() {
        if (this.f366c == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        io.flutter.embedding.engine.renderer.j jVar = this.f366c;
        Surface surface = getHolder().getSurface();
        boolean z = this.f365b;
        if (!z) {
            jVar.j();
        }
        jVar.f9164c = surface;
        FlutterJNI flutterJNI = jVar.f9162a;
        if (z) {
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
        int i3 = iArr[0];
        region.op(i3, iArr[1], (getRight() + i3) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public io.flutter.embedding.engine.renderer.j getAttachedRenderer() {
        return this.f366c;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i3, int i4) {
        if (!this.f367d) {
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i3), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i4), View.MeasureSpec.getMode(i4) == 0 ? 1 : 0));
    }
}
