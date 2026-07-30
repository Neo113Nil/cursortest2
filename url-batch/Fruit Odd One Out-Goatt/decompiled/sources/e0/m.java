package e0;

import android.content.Context;
import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class m extends SurfaceView implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f179a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f180b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f181c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f182d;

    /* renamed from: e, reason: collision with root package name */
    public final q0 f183e;

    public m(Context context, boolean z2) {
        super(context, null);
        this.f179a = false;
        this.f180b = false;
        this.f182d = false;
        q0 q0Var = new q0(new l(this), this, this.f181c);
        this.f183e = q0Var;
        if (z2) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        this.f182d = a.a.n(getContext());
        getHolder().addCallback(q0Var);
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a(io.flutter.embedding.engine.renderer.h hVar) {
        io.flutter.embedding.engine.renderer.h hVar2 = this.f181c;
        if (hVar2 != null) {
            hVar2.e();
        }
        this.f181c = hVar;
        p0 p0Var = this.f183e.f204e;
        switch (p0Var.f196a) {
            case 0:
                p0Var.f197b.f201b = hVar;
                break;
            default:
                q0 q0Var = p0Var.f197b;
                io.flutter.embedding.engine.renderer.h hVar3 = q0Var.f201b;
                if (hVar3 != null) {
                    hVar3.c(q0Var.f203d);
                }
                q0Var.f201b = hVar;
                break;
        }
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        if (this.f181c == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f180b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void c() {
        if (this.f181c == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.h hVar = this.f181c;
            if (hVar == null) {
                f0.l.b("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
                return;
            }
            hVar.e();
        }
        p0 p0Var = this.f183e.f204e;
        switch (p0Var.f196a) {
            case 0:
                p0Var.f197b.f201b = null;
                break;
            default:
                q0 q0Var = p0Var.f197b;
                q0Var.f200a.setAlpha(0.0f);
                io.flutter.embedding.engine.renderer.h hVar2 = q0Var.f201b;
                if (hVar2 != null) {
                    hVar2.c(q0Var.f203d);
                }
                q0Var.f201b = null;
                break;
        }
        this.f181c = null;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void d() {
        if (this.f181c == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        p0 p0Var = this.f183e.f204e;
        switch (p0Var.f196a) {
            case 0:
                break;
            default:
                q0 q0Var = p0Var.f197b;
                io.flutter.embedding.engine.renderer.h hVar = q0Var.f201b;
                if (hVar != null) {
                    hVar.a(q0Var.f203d);
                    break;
                }
                break;
        }
        if (this.f179a) {
            e();
        }
        this.f180b = false;
    }

    public final void e() {
        if (this.f181c == null || getHolder() == null) {
            f0.l.b("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
            return;
        }
        io.flutter.embedding.engine.renderer.h hVar = this.f181c;
        Surface surface = getHolder().getSurface();
        boolean z2 = this.f180b;
        if (!z2) {
            hVar.e();
        }
        hVar.f423b = surface;
        FlutterJNI flutterJNI = hVar.f422a;
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
        return this.f181c;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f182d) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }
}
