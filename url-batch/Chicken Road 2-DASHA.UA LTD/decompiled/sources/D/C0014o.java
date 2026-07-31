package D;

import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* renamed from: D.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014o extends SurfaceView implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f97a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f98b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f99c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f100d;

    /* renamed from: e, reason: collision with root package name */
    public final T f101e;

    public C0014o(AbstractActivityC0005f abstractActivityC0005f, boolean z2) {
        super(abstractActivityC0005f, null);
        this.f97a = false;
        this.f98b = false;
        this.f100d = false;
        T t2 = new T(new SurfaceHolderCallbackC0013n(this), this, this.f99c);
        this.f101e = t2;
        if (z2) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        this.f100d = a.a.p(getContext());
        getHolder().addCallback(t2);
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a(io.flutter.embedding.engine.renderer.h hVar) {
        io.flutter.embedding.engine.renderer.h hVar2 = this.f99c;
        if (hVar2 != null) {
            hVar2.e();
        }
        this.f99c = hVar;
        S s2 = this.f101e.f59e;
        switch (s2.f53a) {
            case 0:
                s2.f54b.f56b = hVar;
                break;
            default:
                T t2 = s2.f54b;
                io.flutter.embedding.engine.renderer.h hVar3 = t2.f56b;
                if (hVar3 != null) {
                    hVar3.c(t2.f58d);
                }
                t2.f56b = hVar;
                break;
        }
        b();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        if (this.f99c == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        S s2 = this.f101e.f59e;
        switch (s2.f53a) {
            case 0:
                break;
            default:
                T t2 = s2.f54b;
                io.flutter.embedding.engine.renderer.h hVar = t2.f56b;
                if (hVar != null) {
                    hVar.a(t2.f58d);
                    break;
                }
                break;
        }
        if (this.f97a) {
            e();
        }
        this.f98b = false;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void c() {
        if (this.f99c == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f98b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void d() {
        if (this.f99c == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.h hVar = this.f99c;
            if (hVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
        }
        S s2 = this.f101e.f59e;
        switch (s2.f53a) {
            case 0:
                s2.f54b.f56b = null;
                break;
            default:
                T t2 = s2.f54b;
                t2.f55a.setAlpha(0.0f);
                io.flutter.embedding.engine.renderer.h hVar2 = t2.f56b;
                if (hVar2 != null) {
                    hVar2.c(t2.f58d);
                }
                t2.f56b = null;
                break;
        }
        this.f99c = null;
    }

    public final void e() {
        if (this.f99c == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        io.flutter.embedding.engine.renderer.h hVar = this.f99c;
        Surface surface = getHolder().getSurface();
        boolean z2 = this.f98b;
        if (!z2) {
            hVar.e();
        }
        hVar.f571b = surface;
        FlutterJNI flutterJNI = hVar.f570a;
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

    @Override // io.flutter.embedding.engine.renderer.k
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f99c;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f100d) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }
}
