package h4;

import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class k extends SurfaceView implements io.flutter.embedding.engine.renderer.m {

    /* renamed from: d, reason: collision with root package name */
    public boolean f5217d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5218e;

    /* renamed from: i, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.j f5219i;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f5220l;

    /* renamed from: m, reason: collision with root package name */
    public final G f5221m;

    public k(AbstractActivityC0488c abstractActivityC0488c, boolean z7) {
        super(abstractActivityC0488c, null);
        this.f5217d = false;
        this.f5218e = false;
        this.f5220l = false;
        G g7 = new G(new j(this), this, this.f5219i);
        this.f5221m = g7;
        if (z7) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        this.f5220l = P0.f.y(getContext());
        getHolder().addCallback(g7);
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a() {
        if (this.f5219i == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.j jVar = this.f5219i;
            if (jVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            jVar.j();
        }
        C0485F c0485f = this.f5221m.f5181e;
        switch (c0485f.f5175a) {
            case 0:
                c0485f.f5176b.f5178b = null;
                break;
            default:
                G g7 = c0485f.f5176b;
                g7.f5177a.setAlpha(0.0f);
                io.flutter.embedding.engine.renderer.j jVar2 = g7.f5178b;
                if (jVar2 != null) {
                    jVar2.g(g7.f5180d);
                }
                g7.f5178b = null;
                break;
        }
        this.f5219i = null;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        if (this.f5219i == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        C0485F c0485f = this.f5221m.f5181e;
        switch (c0485f.f5175a) {
            case 0:
                break;
            default:
                G g7 = c0485f.f5176b;
                io.flutter.embedding.engine.renderer.j jVar = g7.f5178b;
                if (jVar != null) {
                    jVar.a(g7.f5180d);
                    break;
                }
                break;
        }
        if (this.f5217d) {
            e();
        }
        this.f5218e = false;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void c(io.flutter.embedding.engine.renderer.j jVar) {
        io.flutter.embedding.engine.renderer.j jVar2 = this.f5219i;
        if (jVar2 != null) {
            jVar2.j();
        }
        this.f5219i = jVar;
        C0485F c0485f = this.f5221m.f5181e;
        switch (c0485f.f5175a) {
            case 0:
                c0485f.f5176b.f5178b = jVar;
                break;
            default:
                G g7 = c0485f.f5176b;
                io.flutter.embedding.engine.renderer.j jVar3 = g7.f5178b;
                if (jVar3 != null) {
                    jVar3.g(g7.f5180d);
                }
                g7.f5178b = jVar;
                break;
        }
        b();
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void d() {
        if (this.f5219i == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f5218e = true;
        }
    }

    public final void e() {
        if (this.f5219i == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        io.flutter.embedding.engine.renderer.j jVar = this.f5219i;
        Surface surface = getHolder().getSurface();
        boolean z7 = this.f5218e;
        FlutterJNI flutterJNI = jVar.f5598a;
        if (!z7) {
            jVar.j();
        }
        jVar.f5600c = surface;
        if (z7) {
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

    @Override // io.flutter.embedding.engine.renderer.m
    public io.flutter.embedding.engine.renderer.j getAttachedRenderer() {
        return this.f5219i;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i2, int i5) {
        if (!this.f5220l) {
            super.onMeasure(i2, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i5), View.MeasureSpec.getMode(i5) == 0 ? 1 : 0));
    }
}
