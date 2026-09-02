package W;

import T.Q;
import T.T;
import a0.C0130F;
import a0.C0146l;
import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f3375a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3376b;

    /* renamed from: c, reason: collision with root package name */
    public int f3377c;

    /* renamed from: d, reason: collision with root package name */
    public int f3378d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3379e;

    /* renamed from: f, reason: collision with root package name */
    public long f3380f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ B f3381g;

    public z(B b4, int i4) {
        this.f3381g = b4;
        this.f3375a = i4;
    }

    public final void a() {
        long s4;
        boolean z;
        B b4 = this.f3381g;
        Q q4 = b4.f3246e;
        F f4 = b4.f3247f;
        C0130F c0130f = b4.f3242a;
        T q5 = c0130f.q();
        Object l4 = q5.p() ? null : q5.l(c0130f.n());
        int k4 = c0130f.k();
        int l5 = c0130f.l();
        long o = c0130f.o();
        if (l4 == null || k4 != -1) {
            s4 = k4 != -1 ? c0130f.s() : -9223372036854775807L;
        } else {
            q5.g(l4, q4);
            o -= J.Z(q4.f2685e);
            s4 = J.Z(q4.f2684d);
        }
        if (c0130f.u() == 3 && c0130f.t()) {
            c0130f.L();
            if (c0130f.f3886i0.n == 0) {
                z = true;
                if (z || s4 == -9223372036854775807L || o < s4) {
                    f4.d(3);
                    if (z && s4 != -9223372036854775807L) {
                        c0130f.L();
                        f4.f3257a.sendEmptyMessageDelayed(3, (int) Math.ceil((s4 - o) / c0130f.f3886i0.o.f2664a));
                    }
                    this.f3379e = false;
                }
                b4.f3245d.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                boolean z4 = this.f3379e;
                int i4 = this.f3375a;
                if (z4 && Objects.equals(l4, this.f3376b) && k4 == this.f3377c && l5 == this.f3378d) {
                    if (elapsedRealtime - this.f3380f >= i4) {
                        b4.f3244c.f3838a.G(new C0146l(2, new C(3, i4), 1003));
                        return;
                    }
                    return;
                }
                this.f3379e = true;
                this.f3380f = elapsedRealtime;
                this.f3376b = l4;
                this.f3377c = k4;
                this.f3378d = l5;
                f4.d(3);
                f4.f3257a.sendEmptyMessageDelayed(3, i4);
                return;
            }
        }
        z = false;
        if (z) {
        }
        f4.d(3);
        if (z) {
            c0130f.L();
            f4.f3257a.sendEmptyMessageDelayed(3, (int) Math.ceil((s4 - o) / c0130f.f3886i0.o.f2664a));
        }
        this.f3379e = false;
    }
}
