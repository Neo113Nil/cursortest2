package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class b80 {
    public final v71 a;
    public w70 b;
    public z70 c;
    public y70 d;
    public x70 e;
    public la0 f;
    public nq0 g;
    public long h = 9205357640488583168L;
    public xi1 i;
    public final c80 j;
    public final c80 k;
    public long l;

    public b80(v71 v71Var) {
        this.a = v71Var;
        c80 c80Var = new c80();
        c80Var.b = new ArrayList();
        this.j = c80Var;
        c80 c80Var2 = new c80();
        c80Var2.b = new ArrayList();
        this.k = c80Var2;
        this.l = 0L;
    }

    public static void c(b80 b80Var, u70 u70Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        v71 v71Var = b80Var.a;
        y70 y70Var = b80Var.d;
        if (y70Var == null) {
            y70Var = new y70();
            y70Var.x = null;
            y70Var.y = Long.MAX_VALUE;
            y70Var.z = false;
            b80Var.d = y70Var;
        }
        y70Var.x = u70Var;
        y70Var.y = j;
        xi1 xi1Var = b80Var.i;
        et0 et0Var = v71Var.u;
        if (xi1Var == null) {
            b80Var.i = new xi1(et0Var);
        } else {
            xi1Var.e = et0Var;
            xi1Var.d = j2;
        }
        y70Var.z = false;
        b80Var.f = y70Var;
    }

    public final void a() {
        w70 w70Var = this.b;
        if (w70Var == null) {
            v70 v70Var = v70.g;
            w70Var = new w70();
            w70Var.x = v70Var;
            w70Var.y = false;
            this.b = w70Var;
        }
        w70Var.x = v70.g;
        w70Var.y = false;
        this.f = w70Var;
    }

    public final void b(u70 u70Var, long j, xi1 xi1Var) {
        x70 x70Var = this.e;
        if (x70Var == null) {
            x70Var = new x70();
            x70Var.x = null;
            x70Var.y = Long.MAX_VALUE;
            this.e = x70Var;
        }
        x70Var.x = u70Var;
        x70Var.y = j;
        xi1Var.d = 0L;
        this.f = x70Var;
    }

    public final nq0 d() {
        nq0 nq0Var = this.g;
        if (nq0Var != null) {
            return nq0Var;
        }
        dd0.e("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(u70 u70Var, t70 t70Var, long j) {
        v71 v71Var = this.a;
        long b = op.H(v71Var).b(0L);
        if (!wq0.b(this.h, 9205357640488583168L) && !wq0.b(b, this.h)) {
            this.l = wq0.e(this.l, wq0.d(b, this.h));
        }
        this.h = b;
        et0 et0Var = v71Var.u;
        et0Var.getClass();
        int i = bu.a;
        if (Math.abs(Float.intBitsToFloat((int) (et0Var == et0.d ? j & 4294967295L : j >> 32))) > 2.0f) {
            uq1.t(d(), u70Var, v71Var.u, t70Var, this.j, this.l);
            c80 c80Var = this.k;
            ArrayList arrayList = c80Var.b;
            if (arrayList.size() == 3) {
                int i2 = c80Var.a;
                c80Var.a = i2 + 1;
                arrayList.set(i2, new wq0(j));
            } else {
                arrayList.add(new wq0(j));
            }
            if (c80Var.a == 3) {
                c80Var.a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((wq0) arrayList.get(i3)).a >> 32))));
            }
            float m = (float) CollectionsKt.m(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((wq0) arrayList.get(i4)).a & 4294967295L))));
            }
            v71Var.J0(new nt((Float.floatToRawIntBits((float) CollectionsKt.m(arrayList3)) & 4294967295L) | (Float.floatToRawIntBits(m) << 32), true));
        }
    }

    public final void f(u70 u70Var, u70 u70Var2, t70 t70Var, long j) {
        if (this.g == null) {
            this.g = new nq0(20);
        }
        this.l = 0L;
        nq0 d = d();
        v71 v71Var = this.a;
        uq1.t(d, u70Var, v71Var.u, t70Var, this.j, this.l);
        long d2 = wq0.d(uq1.P(u70Var2, v71Var.u, t70Var), j);
        v71Var.v.getClass();
        this.h = op.H(v71Var).b(0L);
        v71Var.J0(new ot(d2));
        c80 c80Var = this.k;
        c80Var.a = 0;
        c80Var.b.clear();
    }
}
