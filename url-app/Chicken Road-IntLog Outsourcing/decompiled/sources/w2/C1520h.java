package w2;

import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* renamed from: w2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1520h extends SurfaceView implements io.flutter.embedding.engine.renderer.l {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12153a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12154b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.i f12155c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12156d;

    /* renamed from: e, reason: collision with root package name */
    public final z f12157e;

    public C1520h(AbstractActivityC1515c abstractActivityC1515c, boolean z) {
        super(abstractActivityC1515c, null);
        this.f12153a = false;
        this.f12154b = false;
        this.f12156d = false;
        z zVar = new z(new SurfaceHolderCallbackC1519g(this), this, this.f12155c);
        this.f12157e = zVar;
        if (z) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        this.f12156d = e5.g.q(getContext());
        getHolder().addCallback(zVar);
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void a() {
        if (this.f12155c == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f12154b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void b() {
        if (this.f12155c == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.i iVar = this.f12155c;
            if (iVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            iVar.e();
        }
        this.f12157e.f12226e.f();
        this.f12155c = null;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void c() {
        if (this.f12155c == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.f12157e.f12226e.m();
        if (this.f12153a) {
            e();
        }
        this.f12154b = false;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void d(io.flutter.embedding.engine.renderer.i iVar) {
        io.flutter.embedding.engine.renderer.i iVar2 = this.f12155c;
        if (iVar2 != null) {
            iVar2.e();
        }
        this.f12155c = iVar;
        this.f12157e.f12226e.v(iVar);
        c();
    }

    public final void e() {
        if (this.f12155c == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        io.flutter.embedding.engine.renderer.i iVar = this.f12155c;
        Surface surface = getHolder().getSurface();
        boolean z = this.f12154b;
        if (!z) {
            iVar.e();
        }
        iVar.f10147b = surface;
        FlutterJNI flutterJNI = iVar.f10146a;
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
        int i2 = iArr[0];
        region.op(i2, iArr[1], (getRight() + i2) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public io.flutter.embedding.engine.renderer.i getAttachedRenderer() {
        return this.f12155c;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f12156d) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }
}
