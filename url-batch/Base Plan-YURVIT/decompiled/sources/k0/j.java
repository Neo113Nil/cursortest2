package k0;

import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import androidx.datastore.preferences.protobuf.k0;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class j extends SurfaceView implements io.flutter.embedding.engine.renderer.l {

    /* renamed from: e, reason: collision with root package name */
    public boolean f2698e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2699f;

    /* renamed from: g, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.i f2700g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2701h;

    /* renamed from: i, reason: collision with root package name */
    public final I f2702i;

    public j(AbstractActivityC0187d abstractActivityC0187d, boolean z2) {
        super(abstractActivityC0187d, null);
        this.f2698e = false;
        this.f2699f = false;
        this.f2701h = false;
        I i2 = new I(new SurfaceHolderCallbackC0192i(this), this, this.f2700g);
        this.f2702i = i2;
        if (z2) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        this.f2701h = k0.v(getContext());
        getHolder().addCallback(i2);
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void a() {
        if (this.f2700g == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.i iVar = this.f2700g;
            if (iVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            iVar.e();
        }
        H h2 = this.f2702i.f2662e;
        switch (h2.f2656a) {
            case 0:
                h2.f2657b.f2659b = null;
                break;
            default:
                I i2 = h2.f2657b;
                i2.f2658a.setAlpha(0.0f);
                io.flutter.embedding.engine.renderer.i iVar2 = i2.f2659b;
                if (iVar2 != null) {
                    iVar2.c(i2.f2661d);
                }
                i2.f2659b = null;
                break;
        }
        this.f2700g = null;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void b() {
        if (this.f2700g == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        H h2 = this.f2702i.f2662e;
        switch (h2.f2656a) {
            case 0:
                break;
            default:
                I i2 = h2.f2657b;
                io.flutter.embedding.engine.renderer.i iVar = i2.f2659b;
                if (iVar != null) {
                    iVar.a(i2.f2661d);
                    break;
                }
                break;
        }
        if (this.f2698e) {
            e();
        }
        this.f2699f = false;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void c(io.flutter.embedding.engine.renderer.i iVar) {
        io.flutter.embedding.engine.renderer.i iVar2 = this.f2700g;
        if (iVar2 != null) {
            iVar2.e();
        }
        this.f2700g = iVar;
        H h2 = this.f2702i.f2662e;
        switch (h2.f2656a) {
            case 0:
                h2.f2657b.f2659b = iVar;
                break;
            default:
                I i2 = h2.f2657b;
                io.flutter.embedding.engine.renderer.i iVar3 = i2.f2659b;
                if (iVar3 != null) {
                    iVar3.c(i2.f2661d);
                }
                i2.f2659b = iVar;
                break;
        }
        b();
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void d() {
        if (this.f2700g == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f2699f = true;
        }
    }

    public final void e() {
        if (this.f2700g == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        io.flutter.embedding.engine.renderer.i iVar = this.f2700g;
        Surface surface = getHolder().getSurface();
        boolean z2 = this.f2699f;
        FlutterJNI flutterJNI = iVar.f2389a;
        if (!z2) {
            iVar.e();
        }
        iVar.f2390b = surface;
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

    @Override // io.flutter.embedding.engine.renderer.l
    public io.flutter.embedding.engine.renderer.i getAttachedRenderer() {
        return this.f2700g;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f2701h) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }
}
