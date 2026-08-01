package E;

import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import io.flutter.embedding.engine.FlutterJNI;

/* renamed from: E.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0013n extends SurfaceView implements io.flutter.embedding.engine.renderer.j {

    /* renamed from: a, reason: collision with root package name */
    public boolean f174a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f175b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f176c;

    /* renamed from: d, reason: collision with root package name */
    public final P f177d;

    public C0013n(AbstractActivityC0004e abstractActivityC0004e, boolean z) {
        super(abstractActivityC0004e, null);
        this.f174a = false;
        this.f175b = false;
        P p2 = new P(new SurfaceHolderCallbackC0012m(this), this, this.f176c);
        this.f177d = p2;
        if (z) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(p2);
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void a(io.flutter.embedding.engine.renderer.h hVar) {
        io.flutter.embedding.engine.renderer.h hVar2 = this.f176c;
        if (hVar2 != null) {
            hVar2.e();
        }
        this.f176c = hVar;
        O o2 = this.f177d.f137e;
        switch (o2.f131a) {
            case 0:
                o2.f132b.f134b = hVar;
                break;
            default:
                P p2 = o2.f132b;
                io.flutter.embedding.engine.renderer.h hVar3 = p2.f134b;
                if (hVar3 != null) {
                    hVar3.c(p2.f136d);
                }
                p2.f134b = hVar;
                break;
        }
        b();
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void b() {
        if (this.f176c == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        O o2 = this.f177d.f137e;
        switch (o2.f131a) {
            case 0:
                break;
            default:
                P p2 = o2.f132b;
                io.flutter.embedding.engine.renderer.h hVar = p2.f134b;
                if (hVar != null) {
                    hVar.a(p2.f136d);
                    break;
                }
                break;
        }
        if (this.f174a) {
            e();
        }
        this.f175b = false;
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void c() {
        if (this.f176c == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f175b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void d() {
        if (this.f176c == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.h hVar = this.f176c;
            if (hVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
        }
        O o2 = this.f177d.f137e;
        switch (o2.f131a) {
            case 0:
                o2.f132b.f134b = null;
                break;
            default:
                P p2 = o2.f132b;
                p2.f133a.setAlpha(0.0f);
                io.flutter.embedding.engine.renderer.h hVar2 = p2.f134b;
                if (hVar2 != null) {
                    hVar2.c(p2.f136d);
                }
                p2.f134b = null;
                break;
        }
        this.f176c = null;
    }

    public final void e() {
        if (this.f176c == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        io.flutter.embedding.engine.renderer.h hVar = this.f176c;
        Surface surface = getHolder().getSurface();
        boolean z = this.f175b;
        if (!z) {
            hVar.e();
        }
        hVar.f624b = surface;
        FlutterJNI flutterJNI = hVar.f623a;
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

    @Override // io.flutter.embedding.engine.renderer.j
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f176c;
    }
}
