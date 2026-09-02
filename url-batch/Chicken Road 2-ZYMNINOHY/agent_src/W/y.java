package W;

import T.T;
import a0.C0130F;
import a0.C0146l;
import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f3367a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3368b;

    /* renamed from: c, reason: collision with root package name */
    public int f3369c;

    /* renamed from: d, reason: collision with root package name */
    public int f3370d;

    /* renamed from: e, reason: collision with root package name */
    public long f3371e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3372f;

    /* renamed from: g, reason: collision with root package name */
    public long f3373g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ B f3374h;

    public y(B b4, int i4) {
        this.f3374h = b4;
        this.f3367a = i4;
    }

    public final void a() {
        B b4 = this.f3374h;
        F f4 = b4.f3247f;
        C0130F c0130f = b4.f3242a;
        if (c0130f.u() == 3 && c0130f.t()) {
            c0130f.L();
            if (c0130f.f3886i0.n == 0) {
                T q4 = c0130f.q();
                Object l4 = q4.p() ? null : q4.l(c0130f.n());
                int k4 = c0130f.k();
                int l5 = c0130f.l();
                long o = c0130f.o();
                if (l4 != null && k4 == -1) {
                    o -= J.Z(q4.g(l4, b4.f3246e).f2685e);
                }
                b4.f3245d.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                boolean z = this.f3372f;
                int i4 = this.f3367a;
                if (z && Objects.equals(l4, this.f3368b) && k4 == this.f3369c && l5 == this.f3370d && o == this.f3371e) {
                    if (elapsedRealtime - this.f3373g >= i4) {
                        b4.f3244c.f3838a.G(new C0146l(2, new C(2, i4), 1003));
                        return;
                    }
                    return;
                }
                this.f3372f = true;
                this.f3373g = elapsedRealtime;
                this.f3368b = l4;
                this.f3369c = k4;
                this.f3370d = l5;
                this.f3371e = o;
                f4.d(2);
                f4.f3257a.sendEmptyMessageDelayed(2, i4);
                return;
            }
        }
        if (this.f3372f) {
            f4.d(2);
        }
        this.f3372f = false;
    }
}
