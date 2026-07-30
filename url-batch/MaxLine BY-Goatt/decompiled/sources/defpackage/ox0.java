package defpackage;

import androidx.compose.foundation.layout.b;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ox0 extends o81 implements xt0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ pw2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox0(int i, int i2, pw2 pw2Var) {
        super(3);
        this.m = i;
        this.n = i2;
        this.o = pw2Var;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        a00 a00Var = (a00) obj2;
        ((Number) obj3).intValue();
        a00Var.X(408240218);
        int i = this.m;
        int i2 = this.n;
        yj1.K(i, i2);
        sl1 sl1Var = sl1.a;
        if (i == 1 && i2 == Integer.MAX_VALUE) {
            a00Var.q(false);
            return sl1Var;
        }
        ca0 ca0Var = (ca0) a00Var.j(p00.h);
        hp0 hp0Var = (hp0) a00Var.j(p00.k);
        u81 u81Var = (u81) a00Var.j(p00.n);
        pw2 pw2Var = this.o;
        boolean f = a00Var.f(pw2Var) | a00Var.f(u81Var);
        Object M = a00Var.M();
        nj njVar = sz.a;
        if (f || M == njVar) {
            M = ci2.i(pw2Var, u81Var);
            a00Var.i0(M);
        }
        pw2 pw2Var2 = (pw2) M;
        boolean f2 = a00Var.f(hp0Var) | a00Var.f(pw2Var2);
        Object M2 = a00Var.M();
        if (f2 || M2 == njVar) {
            un2 un2Var = pw2Var2.a;
            ip0 ip0Var = un2Var.f;
            jq0 jq0Var = un2Var.c;
            if (jq0Var == null) {
                jq0Var = jq0.q;
            }
            fq0 fq0Var = un2Var.d;
            int i3 = fq0Var != null ? fq0Var.a : 0;
            gq0 gq0Var = un2Var.e;
            M2 = ((jp0) hp0Var).b(ip0Var, jq0Var, i3, gq0Var != null ? gq0Var.a : 65535);
            a00Var.i0(M2);
        }
        so2 so2Var = (so2) M2;
        boolean f3 = a00Var.f(so2Var.getValue()) | a00Var.f(ca0Var) | a00Var.f(hp0Var) | a00Var.f(pw2Var) | a00Var.f(u81Var);
        Object M3 = a00Var.M();
        if (f3 || M3 == njVar) {
            M3 = Integer.valueOf((int) (iu2.a(pw2Var2, ca0Var, hp0Var, iu2.a, 1) & 4294967295L));
            a00Var.i0(M3);
        }
        int intValue = ((Number) M3).intValue();
        boolean f4 = a00Var.f(pw2Var) | a00Var.f(ca0Var) | a00Var.f(hp0Var) | a00Var.f(u81Var) | a00Var.f(so2Var.getValue());
        Object M4 = a00Var.M();
        if (f4 || M4 == njVar) {
            StringBuilder sb = new StringBuilder();
            String str = iu2.a;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            M4 = Integer.valueOf((int) (iu2.a(pw2Var2, ca0Var, hp0Var, sb.toString(), 2) & 4294967295L));
            a00Var.i0(M4);
        }
        int intValue2 = ((Number) M4).intValue() - intValue;
        Integer valueOf = i == 1 ? null : Integer.valueOf(((i - 1) * intValue2) + intValue);
        Integer valueOf2 = i2 != Integer.MAX_VALUE ? Integer.valueOf(((i2 - 1) * intValue2) + intValue) : null;
        vl1 e = b.e(sl1Var, valueOf != null ? ca0Var.p0(valueOf.intValue()) : Float.NaN, valueOf2 != null ? ca0Var.p0(valueOf2.intValue()) : Float.NaN);
        a00Var.q(false);
        return e;
    }
}
