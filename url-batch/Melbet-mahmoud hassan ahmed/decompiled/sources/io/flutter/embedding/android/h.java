package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* loaded from: classes.dex */
public class h extends SurfaceView implements k5.c {

    /* renamed from: f, reason: collision with root package name */
    private final boolean f17101f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f17102g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f17103h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17104i;

    /* renamed from: j, reason: collision with root package name */
    private k5.a f17105j;

    /* renamed from: k, reason: collision with root package name */
    private final SurfaceHolder.Callback f17106k;

    /* renamed from: l, reason: collision with root package name */
    private final k5.b f17107l;

    class a implements SurfaceHolder.Callback {
        a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
            z4.b.e("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
            if (h.this.f17104i) {
                h.this.i(i8, i9);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            z4.b.e("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
            h.this.f17102g = true;
            if (h.this.f17104i) {
                h.this.j();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            z4.b.e("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
            h.this.f17102g = false;
            if (h.this.f17104i) {
                h.this.k();
            }
        }
    }

    class b implements k5.b {
        b() {
        }

        @Override // k5.b
        public void c() {
        }

        @Override // k5.b
        public void f() {
            z4.b.e("FlutterSurfaceView", "onFlutterUiDisplayed()");
            h.this.setAlpha(1.0f);
            if (h.this.f17105j != null) {
                h.this.f17105j.q(this);
            }
        }
    }

    private h(Context context, AttributeSet attributeSet, boolean z6) {
        super(context, attributeSet);
        this.f17102g = false;
        this.f17103h = false;
        this.f17104i = false;
        this.f17106k = new a();
        this.f17107l = new b();
        this.f17101f = z6;
        l();
    }

    public h(Context context, boolean z6) {
        this(context, null, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(int i7, int i8) {
        if (this.f17105j == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        z4.b.e("FlutterSurfaceView", "Notifying FlutterRenderer that Android surface size has changed to " + i7 + " x " + i8);
        this.f17105j.w(i7, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f17105j == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.f17105j.u(getHolder().getSurface(), this.f17103h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        k5.a aVar = this.f17105j;
        if (aVar == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        aVar.v();
    }

    private void l() {
        if (this.f17101f) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.f17106k);
        setAlpha(0.0f);
    }

    @Override // k5.c
    public void Z() {
        if (this.f17105j == null) {
            z4.b.f("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.f17105j = null;
        this.f17103h = true;
        this.f17104i = false;
    }

    @Override // k5.c
    public void a() {
        if (this.f17105j == null) {
            z4.b.f("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            z4.b.e("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
            k();
        }
        setAlpha(0.0f);
        this.f17105j.q(this.f17107l);
        this.f17105j = null;
        this.f17104i = false;
    }

    @Override // k5.c
    public void b(k5.a aVar) {
        z4.b.e("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.f17105j != null) {
            z4.b.e("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f17105j.v();
            this.f17105j.q(this.f17107l);
        }
        this.f17105j = aVar;
        this.f17104i = true;
        aVar.g(this.f17107l);
        if (this.f17102g) {
            z4.b.e("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            j();
        }
        this.f17103h = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        region.op(iArr[0], iArr[1], (iArr[0] + getRight()) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // k5.c
    public k5.a getAttachedRenderer() {
        return this.f17105j;
    }
}
