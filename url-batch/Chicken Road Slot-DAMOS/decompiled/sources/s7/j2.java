package s7;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j2 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f8756e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q2 f8757i;

    public j2(q2 q2Var, long j, int i3) {
        this.f8755d = i3;
        switch (i3) {
            case 1:
                this.f8756e = j;
                this.f8757i = q2Var;
                break;
            default:
                this.f8756e = j;
                Objects.requireNonNull(q2Var);
                this.f8757i = q2Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8755d) {
            case 0:
                q1 q1Var = (q1) this.f8757i.f1478d;
                f1 f1Var = q1Var.f8936s;
                q1.j(f1Var);
                d1 d1Var = f1Var.f8690y;
                long j = this.f8756e;
                d1Var.b(j);
                v0 v0Var = q1Var.f8937t;
                q1.l(v0Var);
                v0Var.A.b(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                q2 q2Var = this.f8757i;
                q2Var.s();
                q2Var.t();
                q1 q1Var2 = (q1) q2Var.f1478d;
                v0 v0Var2 = q1Var2.f8937t;
                q1.l(v0Var2);
                v0Var2.A.a("Resetting analytics data (FE)");
                t3 t3Var = q1Var2.f8939v;
                q1.k(t3Var);
                t3Var.s();
                s3 s3Var = t3Var.f9029t;
                s3Var.f9001c.c();
                ((q1) s3Var.f9002d.f1478d).f8942y.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                s3Var.f8999a = elapsedRealtime;
                s3Var.f9000b = elapsedRealtime;
                q1Var2.q().x();
                boolean z10 = !q1Var2.c();
                f1 f1Var2 = q1Var2.f8936s;
                q1.j(f1Var2);
                f1Var2.f8685t.b(this.f8756e);
                q1 q1Var3 = (q1) f1Var2.f1478d;
                f1 f1Var3 = q1Var3.f8936s;
                q1.j(f1Var3);
                if (!TextUtils.isEmpty(f1Var3.J.d())) {
                    f1Var2.J.e(null);
                }
                f1Var2.D.b(0L);
                f1Var2.E.b(0L);
                if (!q1Var3.f8935r.G()) {
                    f1Var2.A(z10);
                }
                f1Var2.K.e(null);
                f1Var2.L.b(0L);
                f1Var2.M.e(null);
                l3 o6 = q1Var2.o();
                o6.s();
                o6.t();
                r4 I = o6.I(false);
                o6.E();
                ((q1) o6.f1478d).n().w();
                o6.G(new g3(o6, I, 0));
                q1.k(t3Var);
                t3Var.f9028s.B();
                q2Var.F = z10;
                q1Var2.o().w(new AtomicReference());
                break;
        }
    }
}
