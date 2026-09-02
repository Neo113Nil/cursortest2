package W;

import T.T;
import a0.C0130F;
import a0.C0146l;
import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f3358a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3359b;

    /* renamed from: c, reason: collision with root package name */
    public int f3360c;

    /* renamed from: d, reason: collision with root package name */
    public int f3361d;

    /* renamed from: e, reason: collision with root package name */
    public long f3362e;

    /* renamed from: f, reason: collision with root package name */
    public long f3363f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3364g;

    /* renamed from: h, reason: collision with root package name */
    public long f3365h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ B f3366i;

    public x(B b4, int i4) {
        this.f3366i = b4;
        this.f3358a = i4;
    }

    public final void a() {
        int i4 = this.f3358a;
        B b4 = this.f3366i;
        if (b4.f3242a.u() == 2 && b4.f3242a.t()) {
            C0130F c0130f = b4.f3242a;
            c0130f.L();
            if (c0130f.f3886i0.n == 0) {
                T q4 = b4.f3242a.q();
                Object l4 = q4.p() ? null : q4.l(b4.f3242a.n());
                int k4 = b4.f3242a.k();
                int l5 = b4.f3242a.l();
                long i5 = b4.f3242a.i();
                long max = Math.max(0L, i5 - b4.f3242a.o());
                C0130F c0130f2 = b4.f3242a;
                c0130f2.L();
                long max2 = Math.max(0L, J.Z(c0130f2.f3886i0.f4154r) - max);
                if (l4 != null && k4 == -1) {
                    i5 -= J.Z(q4.g(l4, b4.f3246e).f2685e);
                }
                b4.f3245d.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (this.f3364g && Objects.equals(l4, this.f3359b) && k4 == this.f3360c && l5 == this.f3361d && i5 == this.f3362e && max2 == this.f3363f) {
                    if (elapsedRealtime - this.f3365h >= i4) {
                        b4.f3244c.f3838a.G(new C0146l(2, new C(1, i4), 1003));
                        return;
                    }
                    return;
                }
                this.f3364g = true;
                this.f3365h = elapsedRealtime;
                this.f3359b = l4;
                this.f3360c = k4;
                this.f3361d = l5;
                this.f3362e = i5;
                this.f3363f = max2;
                b4.f3247f.d(1);
                b4.f3247f.f3257a.sendEmptyMessageDelayed(1, i4);
                return;
            }
        }
        if (this.f3364g) {
            b4.f3247f.d(1);
        }
        this.f3364g = false;
    }
}
