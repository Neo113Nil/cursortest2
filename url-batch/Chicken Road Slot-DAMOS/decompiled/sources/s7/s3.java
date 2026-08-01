package s7;

import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    public long f8999a;

    /* renamed from: b, reason: collision with root package name */
    public long f9000b;

    /* renamed from: c, reason: collision with root package name */
    public final r3 f9001c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t3 f9002d;

    public s3(t3 t3Var) {
        this.f9002d = t3Var;
        q1 q1Var = (q1) t3Var.f1478d;
        this.f9001c = new r3(this, q1Var, 0);
        q1Var.f8942y.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f8999a = elapsedRealtime;
        this.f9000b = elapsedRealtime;
    }

    public final boolean a(boolean z10, boolean z11, long j) {
        t3 t3Var = this.f9002d;
        t3Var.s();
        t3Var.t();
        q1 q1Var = (q1) t3Var.f1478d;
        boolean c10 = q1Var.c();
        v0 v0Var = q1Var.f8937t;
        if (c10) {
            f1 f1Var = q1Var.f8936s;
            q1.j(f1Var);
            d1 d1Var = f1Var.D;
            q1Var.f8942y.getClass();
            d1Var.b(System.currentTimeMillis());
        }
        long j3 = j - this.f8999a;
        if (!z10 && j3 < 1000) {
            q1.l(v0Var);
            v0Var.B.b(Long.valueOf(j3), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z11) {
            j3 = j - this.f9000b;
            this.f9000b = j;
        }
        q1.l(v0Var);
        v0Var.B.b(Long.valueOf(j3), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j3);
        boolean z12 = !q1Var.f8935r.H();
        b3 b3Var = q1Var.f8943z;
        q1.k(b3Var);
        p4.o0(b3Var.w(z12), bundle, true);
        if (!z11) {
            q2 q2Var = q1Var.A;
            q1.k(q2Var);
            q2Var.z("auto", "_e", bundle);
        }
        this.f8999a = j;
        r3 r3Var = this.f9001c;
        r3Var.c();
        r3Var.b(((Long) e0.f8643p0.a(null)).longValue());
        return true;
    }
}
