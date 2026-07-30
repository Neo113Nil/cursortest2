package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class kd0 {
    public final b3 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public b3 f;
    public final /* synthetic */ int h;
    public boolean b = true;
    public final HashMap g = new HashMap();

    public kd0(b3 b3Var, int i) {
        this.h = i;
        this.a = b3Var;
    }

    public static final void a(kd0 kd0Var, m60 m60Var, int i, qp0 qp0Var) {
        HashMap hashMap = kd0Var.g;
        float f = i;
        long floatToRawIntBits = Float.floatToRawIntBits(f) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f) & 4294967295L;
        while (true) {
            long j = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (kd0Var.h) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        du0 du0Var = qp0Var.P;
                        if (du0Var != null) {
                            n50 n50Var = (n50) du0Var;
                            float[] b = n50Var.b();
                            if (!n50Var.w) {
                                j = y90.u(b, j);
                            }
                        }
                        j = t90.v(j, qp0Var.D);
                        break;
                    default:
                        gj0 H0 = qp0Var.H0();
                        H0.getClass();
                        long j2 = H0.t;
                        j = wq0.e((Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
                        break;
                }
                qp0Var = qp0Var.u;
                qp0Var.getClass();
                if (qp0Var.equals(kd0Var.a.y())) {
                    int round = Math.round(m60Var instanceof m60 ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j >> 32)));
                    if (hashMap.containsKey(m60Var)) {
                        hashMap.getClass();
                        Object obj = hashMap.get(m60Var);
                        if (obj == null && !hashMap.containsKey(m60Var)) {
                            throw new NoSuchElementException("Key " + m60Var + " is missing in the map.");
                        }
                        int intValue = ((Number) obj).intValue();
                        m60 m60Var2 = z2.a;
                        round = ((Number) m60Var.a.b(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(m60Var, Integer.valueOf(round));
                    return;
                }
            } while (!kd0Var.b(qp0Var).containsKey(m60Var));
            float c = kd0Var.c(qp0Var, m60Var);
            long floatToRawIntBits3 = Float.floatToRawIntBits(c);
            long floatToRawIntBits4 = Float.floatToRawIntBits(c);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(qp0 qp0Var) {
        switch (this.h) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return qp0Var.r0().a();
            default:
                gj0 H0 = qp0Var.H0();
                H0.getClass();
                return H0.r0().a();
        }
    }

    public final int c(qp0 qp0Var, m60 m60Var) {
        switch (this.h) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return qp0Var.j0(m60Var);
            default:
                gj0 H0 = qp0Var.H0();
                H0.getClass();
                return H0.j0(m60Var);
        }
    }

    public final boolean d() {
        return this.c || this.d || this.e;
    }

    public final boolean e() {
        h();
        return this.f != null;
    }

    public final void f() {
        this.b = true;
        b3 b3Var = this.a;
        b3 z = b3Var.z();
        if (z == null) {
            return;
        }
        if (this.c) {
            z.requestLayout();
        }
        if (this.d) {
            b3Var.P();
        }
        if (this.e) {
            b3Var.requestLayout();
        }
        z.a().f();
    }

    public final void g() {
        HashMap hashMap = this.g;
        hashMap.clear();
        a3 a3Var = new a3(0, this);
        b3 b3Var = this.a;
        b3Var.n(a3Var);
        hashMap.putAll(b(b3Var.y()));
        this.b = false;
    }

    public final void h() {
        kd0 a;
        kd0 a2;
        boolean d = d();
        b3 b3Var = this.a;
        if (!d) {
            b3 z = b3Var.z();
            if (z == null) {
                return;
            }
            b3Var = z.a().f;
            if (b3Var == null || !b3Var.a().d()) {
                b3 b3Var2 = this.f;
                if (b3Var2 == null || b3Var2.a().d()) {
                    return;
                }
                b3 z2 = b3Var2.z();
                if (z2 != null && (a2 = z2.a()) != null) {
                    a2.h();
                }
                b3 z3 = b3Var2.z();
                b3Var = (z3 == null || (a = z3.a()) == null) ? null : a.f;
            }
        }
        this.f = b3Var;
    }
}
