package s;

import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import g0.u1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements j0, u1, Runnable, Choreographer.FrameCallback {

    /* renamed from: l, reason: collision with root package name */
    public static long f7971l;

    /* renamed from: f, reason: collision with root package name */
    public final View f7972f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7974h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7976j;

    /* renamed from: k, reason: collision with root package name */
    public long f7977k;

    /* renamed from: g, reason: collision with root package name */
    public final i0.d f7973g = new i0.d(new h0[16]);

    /* renamed from: i, reason: collision with root package name */
    public final Choreographer f7975i = Choreographer.getInstance();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r5 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(View view) {
        float f9;
        this.f7972f = view;
        if (f7971l == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f9 = display.getRefreshRate();
            }
            f9 = 60.0f;
            f7971l = (long) (1000000000 / f9);
        }
    }

    @Override // g0.u1
    public final void a() {
        this.f7976j = true;
    }

    @Override // g0.u1
    public final void c() {
        this.f7976j = false;
        this.f7972f.removeCallbacks(this);
        this.f7975i.removeFrameCallback(this);
    }

    @Override // s.j0
    public final void d(h0 h0Var) {
        this.f7973g.b(h0Var);
        if (this.f7974h) {
            return;
        }
        this.f7974h = true;
        this.f7972f.post(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j8) {
        if (this.f7976j) {
            this.f7977k = j8;
            this.f7972f.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        i0.d dVar = this.f7973g;
        if (dVar.l() || !this.f7974h || !this.f7976j || this.f7972f.getWindowVisibility() != 0) {
            this.f7974h = false;
            return;
        }
        long j8 = this.f7977k + f7971l;
        o5.f fVar = new o5.f();
        fVar.f6848f = j8;
        boolean z8 = false;
        while (dVar.m() && !z8) {
            if (fVar.a() <= 0 || ((h0) dVar.f4840f[0]).b(fVar)) {
                z8 = true;
            } else {
                dVar.o(0);
            }
        }
        if (z8) {
            this.f7975i.postFrameCallback(this);
        } else {
            this.f7974h = false;
        }
    }

    @Override // g0.u1
    public final void b() {
    }
}
