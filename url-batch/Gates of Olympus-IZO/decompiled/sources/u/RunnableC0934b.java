package u;

import I.B0;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;

/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0934b implements T, B0, Runnable, Choreographer.FrameCallback {

    /* renamed from: j, reason: collision with root package name */
    public static long f8051j;

    /* renamed from: d, reason: collision with root package name */
    public final View f8052d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8054f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8056h;

    /* renamed from: i, reason: collision with root package name */
    public long f8057i;

    /* renamed from: e, reason: collision with root package name */
    public final K.d f8053e = new K.d(new Q[16]);

    /* renamed from: g, reason: collision with root package name */
    public final Choreographer f8055g = Choreographer.getInstance();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r5 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RunnableC0934b(View view) {
        float f3;
        this.f8052d = view;
        if (f8051j == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f3 = display.getRefreshRate();
            }
            f3 = 60.0f;
            f8051j = (long) (1000000000 / f3);
        }
    }

    @Override // I.B0
    public final void a() {
        this.f8056h = false;
        this.f8052d.removeCallbacks(this);
        this.f8055g.removeFrameCallback(this);
    }

    @Override // I.B0
    public final void b() {
        this.f8056h = true;
    }

    @Override // u.T
    public final void d(Q q2) {
        this.f8053e.b(q2);
        if (this.f8054f) {
            return;
        }
        this.f8054f = true;
        this.f8052d.post(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        if (this.f8056h) {
            this.f8057i = j3;
            this.f8052d.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        K.d dVar = this.f8053e;
        if (dVar.l() || !this.f8054f || !this.f8056h || this.f8052d.getWindowVisibility() != 0) {
            this.f8054f = false;
            return;
        }
        C0933a c0933a = new C0933a(this.f8057i + f8051j);
        boolean z3 = false;
        while (dVar.m() && !z3) {
            if (c0933a.a() <= 0 || ((Q) dVar.f2640d[0]).b(c0933a)) {
                z3 = true;
            } else {
                dVar.o(0);
            }
        }
        if (z3) {
            this.f8055g.postFrameCallback(this);
        } else {
            this.f8054f = false;
        }
    }

    @Override // I.B0
    public final void c() {
    }
}
