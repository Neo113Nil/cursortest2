package defpackage;

import androidx.compose.foundation.a;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class kr2 {
    public static final r00 a = new r00(o00.N);

    public static final void a(vl1 vl1Var, fk2 fk2Var, long j, long j2, my myVar, a00 a00Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            fk2Var = ap.e;
        }
        fk2 fk2Var2 = fk2Var;
        if ((i2 & 4) != 0) {
            j = ((gw) a00Var.j(hw.a)).p;
        }
        long j3 = j;
        if ((i2 & 8) != 0) {
            j2 = hw.b(j3, a00Var);
        }
        r00 r00Var = a;
        float f = ((pc0) a00Var.j(r00Var)).m + 0.0f;
        yk3.c(new ye[]{e20.a.a(new aw(j2)), r00Var.a(new pc0(f))}, yj1.H(-70914509, new ir2(vl1Var, fk2Var2, j3, f, myVar), a00Var), a00Var, 56);
    }

    public static final vl1 b(float f, long j, vl1 vl1Var, fk2 fk2Var) {
        sl1 sl1Var = sl1.a;
        return yk3.u(a.b(vl1Var.k(f > 0.0f ? androidx.compose.ui.graphics.a.b(sl1Var, f, fk2Var, 124895) : sl1Var).k(sl1Var), j, fk2Var), fk2Var);
    }

    public static final long c(long j, float f, a00 a00Var) {
        gw gwVar = (gw) a00Var.j(hw.a);
        boolean booleanValue = ((Boolean) a00Var.j(hw.b)).booleanValue();
        long j2 = gwVar.p;
        if (!aw.c(j, j2) || !booleanValue) {
            return j;
        }
        if (pc0.a(f, 0.0f)) {
            return j2;
        }
        return ap.s(aw.b(gwVar.t, ((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f), j2);
    }
}
