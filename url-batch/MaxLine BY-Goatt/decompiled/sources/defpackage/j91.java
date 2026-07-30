package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class j91 {
    public final k6 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public k6 f;
    public final /* synthetic */ int h;
    public boolean b = true;
    public final HashMap g = new HashMap();

    public j91(k6 k6Var, int i) {
        this.h = i;
        this.a = k6Var;
    }

    public static final void a(j91 j91Var, xx0 xx0Var, int i, ks1 ks1Var) {
        HashMap hashMap = j91Var.g;
        float f = i;
        long floatToRawIntBits = Float.floatToRawIntBits(f) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f) & 4294967295L;
        while (true) {
            long j = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (j91Var.h) {
                    case 0:
                        ia2 ia2Var = ks1.V;
                        j = ks1Var.l1(j);
                        break;
                    default:
                        sg1 O0 = ks1Var.O0();
                        O0.getClass();
                        long j2 = O0.B;
                        j = au1.g((Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
                        break;
                }
                ks1Var = ks1Var.C;
                ks1Var.getClass();
                if (ks1Var.equals(j91Var.a.n())) {
                    int round = Math.round(xx0Var instanceof xx0 ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j >> 32)));
                    if (hashMap.containsKey(xx0Var)) {
                        int intValue = ((Number) mi1.d(hashMap, xx0Var)).intValue();
                        xx0 xx0Var2 = i6.a;
                        round = ((Number) xx0Var.a.invoke(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(xx0Var, Integer.valueOf(round));
                    return;
                }
            } while (!j91Var.b(ks1Var).containsKey(xx0Var));
            float c = j91Var.c(ks1Var, xx0Var);
            long floatToRawIntBits3 = Float.floatToRawIntBits(c);
            long floatToRawIntBits4 = Float.floatToRawIntBits(c);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(ks1 ks1Var) {
        switch (this.h) {
            case 0:
                return ks1Var.y0().a();
            default:
                sg1 O0 = ks1Var.O0();
                O0.getClass();
                return O0.y0().a();
        }
    }

    public final int c(ks1 ks1Var, xx0 xx0Var) {
        switch (this.h) {
            case 0:
                return ks1Var.t0(xx0Var);
            default:
                sg1 O0 = ks1Var.O0();
                O0.getClass();
                return O0.t0(xx0Var);
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
        k6 k6Var = this.a;
        k6 o = k6Var.o();
        if (o == null) {
            return;
        }
        if (this.c) {
            o.requestLayout();
        }
        if (this.d) {
            k6Var.X();
        }
        if (this.e) {
            k6Var.requestLayout();
        }
        o.a().f();
    }

    public final void g() {
        HashMap hashMap = this.g;
        hashMap.clear();
        j6 j6Var = new j6(0, this);
        k6 k6Var = this.a;
        k6Var.l(j6Var);
        hashMap.putAll(b(k6Var.n()));
        this.b = false;
    }

    public final void h() {
        j91 a;
        j91 a2;
        boolean d = d();
        k6 k6Var = this.a;
        if (!d) {
            k6 o = k6Var.o();
            if (o == null) {
                return;
            }
            k6Var = o.a().f;
            if (k6Var == null || !k6Var.a().d()) {
                k6 k6Var2 = this.f;
                if (k6Var2 == null || k6Var2.a().d()) {
                    return;
                }
                k6 o2 = k6Var2.o();
                if (o2 != null && (a2 = o2.a()) != null) {
                    a2.h();
                }
                k6 o3 = k6Var2.o();
                k6Var = (o3 == null || (a = o3.a()) == null) ? null : a.f;
            }
        }
        this.f = k6Var;
    }
}
