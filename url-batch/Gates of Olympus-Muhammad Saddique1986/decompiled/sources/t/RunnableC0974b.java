package t;

import I.A0;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;

/* renamed from: t.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0974b implements L, A0, Runnable, Choreographer.FrameCallback {

    /* renamed from: j, reason: collision with root package name */
    public static long f8462j;

    /* renamed from: d, reason: collision with root package name */
    public final View f8463d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8465f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8467h;

    /* renamed from: i, reason: collision with root package name */
    public long f8468i;

    /* renamed from: e, reason: collision with root package name */
    public final K.d f8464e = new K.d(new J[16]);

    /* renamed from: g, reason: collision with root package name */
    public final Choreographer f8466g = Choreographer.getInstance();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r5 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RunnableC0974b(View view) {
        float f3;
        this.f8463d = view;
        if (f8462j == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f3 = display.getRefreshRate();
            }
            f3 = 60.0f;
            f8462j = (long) (1000000000 / f3);
        }
    }

    @Override // I.A0
    public final void a() {
        this.f8467h = false;
        this.f8463d.removeCallbacks(this);
        this.f8466g.removeFrameCallback(this);
    }

    @Override // I.A0
    public final void b() {
        this.f8467h = true;
    }

    @Override // t.L
    public final void d(J j3) {
        this.f8464e.b(j3);
        if (this.f8465f) {
            return;
        }
        this.f8465f = true;
        this.f8463d.post(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        if (this.f8467h) {
            this.f8468i = j3;
            this.f8463d.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        K.d dVar = this.f8464e;
        if (dVar.l() || !this.f8465f || !this.f8467h || this.f8463d.getWindowVisibility() != 0) {
            this.f8465f = false;
            return;
        }
        C0973a c0973a = new C0973a(this.f8468i + f8462j);
        boolean z3 = false;
        while (dVar.m() && !z3) {
            if (c0973a.a() <= 0 || ((J) dVar.f3214d[0]).b(c0973a)) {
                z3 = true;
            } else {
                dVar.o(0);
            }
        }
        if (z3) {
            this.f8466g.postFrameCallback(this);
        } else {
            this.f8465f = false;
        }
    }

    @Override // I.A0
    public final void c() {
    }
}
