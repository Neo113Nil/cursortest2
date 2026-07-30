package c0;

import a.AbstractC0069a;
import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class l extends SurfaceView implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: e, reason: collision with root package name */
    public boolean f1721e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1722f;

    /* renamed from: g, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f1723g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1724h;

    /* renamed from: i, reason: collision with root package name */
    public final K f1725i;

    public l(AbstractActivityC0104f abstractActivityC0104f, boolean z2) {
        super(abstractActivityC0104f, null);
        this.f1721e = false;
        this.f1722f = false;
        this.f1724h = false;
        K k2 = new K(new SurfaceHolderCallbackC0109k(this), this, this.f1723g);
        this.f1725i = k2;
        if (z2) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        this.f1724h = AbstractC0069a.s(getContext());
        getHolder().addCallback(k2);
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a(io.flutter.embedding.engine.renderer.h hVar) {
        io.flutter.embedding.engine.renderer.h hVar2 = this.f1723g;
        if (hVar2 != null) {
            hVar2.e();
        }
        this.f1723g = hVar;
        J j2 = this.f1725i.f1683e;
        switch (j2.f1677a) {
            case 0:
                j2.f1678b.f1680b = hVar;
                break;
            default:
                K k2 = j2.f1678b;
                io.flutter.embedding.engine.renderer.h hVar3 = k2.f1680b;
                if (hVar3 != null) {
                    hVar3.c(k2.f1682d);
                }
                k2.f1680b = hVar;
                break;
        }
        b();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        if (this.f1723g == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        J j2 = this.f1725i.f1683e;
        switch (j2.f1677a) {
            case 0:
                break;
            default:
                K k2 = j2.f1678b;
                io.flutter.embedding.engine.renderer.h hVar = k2.f1680b;
                if (hVar != null) {
                    hVar.a(k2.f1682d);
                    break;
                }
                break;
        }
        if (this.f1721e) {
            e();
        }
        this.f1722f = false;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void c() {
        if (this.f1723g == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f1722f = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void d() {
        if (this.f1723g == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.h hVar = this.f1723g;
            if (hVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
        }
        J j2 = this.f1725i.f1683e;
        switch (j2.f1677a) {
            case 0:
                j2.f1678b.f1680b = null;
                break;
            default:
                K k2 = j2.f1678b;
                k2.f1679a.setAlpha(0.0f);
                io.flutter.embedding.engine.renderer.h hVar2 = k2.f1680b;
                if (hVar2 != null) {
                    hVar2.c(k2.f1682d);
                }
                k2.f1680b = null;
                break;
        }
        this.f1723g = null;
    }

    public final void e() {
        if (this.f1723g == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        io.flutter.embedding.engine.renderer.h hVar = this.f1723g;
        Surface surface = getHolder().getSurface();
        boolean z2 = this.f1722f;
        if (!z2) {
            hVar.e();
        }
        hVar.f2386b = surface;
        FlutterJNI flutterJNI = hVar.f2385a;
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
        return this.f1723g;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f1724h) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }
}
