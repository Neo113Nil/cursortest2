package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class o80 implements hr1 {
    public final q80 m;

    public o80(q80 q80Var) {
        this.m = q80Var;
    }

    @Override // defpackage.hr1
    public final Object N(long j, long j2, o30 o30Var) {
        return new f43(f43.a(j2, 0.0f, 0.0f, 1));
    }

    @Override // defpackage.hr1
    public final long d0(long j, long j2, int i) {
        if (i != 2 || au1.d(j2) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // defpackage.hr1
    public final long o(long j, int i) {
        if (i != 1) {
            return 0L;
        }
        q80 q80Var = this.m;
        if (Math.abs(q80Var.k()) <= 1.0E-6d) {
            return 0L;
        }
        float k = q80Var.k() * q80Var.n();
        float f = ((q80Var.l().b + q80Var.l().c) * (-Math.signum(q80Var.k()))) + k;
        if (q80Var.k() > 0.0f) {
            f = k;
            k = f;
        }
        float f2 = -q80Var.j.e(-d.b(au1.d(j), k, f));
        float e = au1.e(j);
        return (Float.floatToRawIntBits(e) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }
}
