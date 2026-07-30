package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class mk0 {
    public static final ke1 a;

    static {
        ee0.b(new dd(12));
        a = new ke1(new dd(13));
    }

    public static final void a(mi miVar, om0 om0Var, y91 y91Var, fk1 fk1Var, hk hkVar, hl hlVar, int i) {
        int i2;
        hlVar.Y(904511636);
        if ((i & 6) == 0) {
            i2 = (hlVar.f(miVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= hlVar.f(om0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= hlVar.f(y91Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= hlVar.f(fk1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= hlVar.h(hkVar) ? 16384 : 8192;
        }
        if (hlVar.O(i2 & 1, (i2 & 9363) != 9362)) {
            hlVar.T();
            if ((i & 1) != 0 && !hlVar.y()) {
                hlVar.R();
            }
            hlVar.q();
            zl zlVar = b41.a;
            long j = hi.g;
            d41 d41Var = (bt.a(Float.NaN, Float.NaN) && hi.c(j, j)) ? b41.b : new d41(j, true);
            long j2 = miVar.a;
            boolean e = hlVar.e(j2);
            Object L = hlVar.L();
            if (e || L == bl.a) {
                L = new nh1(j2, hi.b(0.4f, j2));
                hlVar.h0(L);
            }
            op.b(new n01[]{oi.a.a(miVar), a.a(om0Var), r70.a.a(d41Var), z91.a.a(y91Var), oh1.a.a((nh1) L), gk1.a.a(fk1Var)}, m90.J(-1750539308, new lk0(fk1Var, hkVar), hlVar), hlVar, 56);
        } else {
            hlVar.R();
        }
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new j60(miVar, om0Var, y91Var, fk1Var, hkVar, i);
        }
    }

    public static final void b(mi miVar, y91 y91Var, fk1 fk1Var, hk hkVar, hl hlVar, int i) {
        int i2;
        y91 y91Var2;
        int i3;
        hlVar.Y(-449719819);
        if ((i & 6) == 0) {
            i2 = (hlVar.f(miVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= hlVar.f(fk1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= hlVar.h(hkVar) ? 2048 : 1024;
        }
        if (hlVar.O(i2 & 1, (i2 & 1171) != 1170)) {
            hlVar.T();
            if ((i & 1) == 0 || hlVar.y()) {
                y91Var2 = (y91) hlVar.j(z91.a);
                i3 = i2 & (-113);
            } else {
                hlVar.R();
                i3 = i2 & (-113);
                y91Var2 = y91Var;
            }
            hlVar.q();
            int i4 = i3 & 14;
            int i5 = i3 << 3;
            a(miVar, (om0) hlVar.j(a), y91Var2, fk1Var, hkVar, hlVar, (i5 & 57344) | i4 | (i5 & 7168));
        } else {
            hlVar.R();
            y91Var2 = y91Var;
        }
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new kx(miVar, y91Var2, fk1Var, hkVar, i, 1);
        }
    }
}
