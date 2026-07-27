package s;

import G.A0;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import j2.C0716f;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1097a implements A0, Runnable, Choreographer.FrameCallback {

    /* renamed from: m, reason: collision with root package name */
    public static long f9914m;

    /* renamed from: d, reason: collision with root package name */
    public final View f9915d;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9917i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9919k;

    /* renamed from: l, reason: collision with root package name */
    public long f9920l;

    /* renamed from: e, reason: collision with root package name */
    public final I.d f9916e = new I.d(new C1094J[16]);

    /* renamed from: j, reason: collision with root package name */
    public final Choreographer f9918j = Choreographer.getInstance();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r5 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RunnableC1097a(View view) {
        float f4;
        this.f9915d = view;
        if (f9914m == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f4 = display.getRefreshRate();
            }
            f4 = 60.0f;
            f9914m = (long) (1000000000 / f4);
        }
    }

    @Override // G.A0
    public final void a() {
        this.f9919k = false;
        this.f9915d.removeCallbacks(this);
        this.f9918j.removeFrameCallback(this);
    }

    @Override // G.A0
    public final void b() {
        this.f9919k = true;
    }

    @Override // G.A0
    public final void d() {
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j4) {
        if (this.f9919k) {
            this.f9920l = j4;
            this.f9915d.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        I.d dVar = this.f9916e;
        if (dVar.k() || !this.f9917i || !this.f9919k || this.f9915d.getWindowVisibility() != 0) {
            this.f9917i = false;
            return;
        }
        long j4 = this.f9920l + f9914m;
        C0716f c0716f = new C0716f();
        c0716f.f7161d = j4;
        boolean z4 = false;
        while (dVar.l() && !z4) {
            if (c0716f.a() <= 0 || ((C1094J) dVar.f3330d[0]).b(c0716f)) {
                z4 = true;
            } else {
                dVar.n(0);
            }
        }
        if (z4) {
            this.f9918j.postFrameCallback(this);
        } else {
            this.f9917i = false;
        }
    }
}
