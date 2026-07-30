package defpackage;

import com.appsflyer.internal.l;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class wm extends zl0 implements ul, sc0 {
    public et0 s;
    public final d81 t;
    public boolean u;
    public final r71 v;
    public boolean x;
    public boolean z;
    public final ee w = new ee(0);
    public long y = 0;

    public wm(et0 et0Var, d81 d81Var, boolean z, r71 r71Var) {
        this.s = et0Var;
        this.t = d81Var;
        this.u = z;
        this.v = r71Var;
    }

    public static boolean A0(wm wmVar, s11 s11Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = wmVar.y;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long C0 = wmVar.C0(s11Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (C0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (C0 & 4294967295L))) <= 0.5f;
    }

    public static final float z0(wm wmVar, ke keVar, long j) {
        float f;
        s11 s11Var;
        int compare;
        if (ba0.a(wmVar.y, 0L)) {
            return 0.0f;
        }
        eo0 eo0Var = wmVar.w.a;
        int i = eo0Var.g - 1;
        Object[] objArr = eo0Var.d;
        if (i < objArr.length) {
            s11Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                s11 s11Var2 = (s11) ((sm) objArr[i]).a.invoke();
                if (s11Var2 != null) {
                    long b = s11Var2.b();
                    long x = ca0.x(wmVar.y);
                    f = 0.0f;
                    int ordinal = wmVar.s.ordinal();
                    if (ordinal == 0) {
                        compare = Float.compare(Float.intBitsToFloat((int) (b & 4294967295L)), Float.intBitsToFloat((int) (x & 4294967295L)));
                    } else {
                        if (ordinal != 1) {
                            l.a();
                            return 0.0f;
                        }
                        compare = Float.compare(Float.intBitsToFloat((int) (b >> 32)), Float.intBitsToFloat((int) (x >> 32)));
                    }
                    if (compare <= 0) {
                        s11Var = s11Var2;
                    } else if (s11Var == null) {
                        s11Var = s11Var2;
                    }
                }
                i--;
            }
        } else {
            f = 0.0f;
            s11Var = null;
        }
        if (s11Var == null) {
            s11 s11Var3 = wmVar.x ? (s11) wmVar.v.invoke() : null;
            if (s11Var3 == null) {
                return f;
            }
            s11Var = s11Var3;
        }
        long x2 = ca0.x(wmVar.y);
        int ordinal2 = wmVar.s.ordinal();
        if (ordinal2 == 0) {
            float f2 = s11Var.b;
            return keVar.a(f2 - ((int) (j & 4294967295L)), s11Var.d - f2, Float.intBitsToFloat((int) (x2 & 4294967295L)));
        }
        if (ordinal2 == 1) {
            float f3 = s11Var.a;
            return keVar.a(f3 - ((int) (j >> 32)), s11Var.c - f3, Float.intBitsToFloat((int) (x2 >> 32)));
        }
        l.a();
        return f;
    }

    public final void B0(long j) {
        zl zlVar = me.a;
        ke keVar = (ke) mo.k(this, zlVar);
        if (this.z) {
            r80.c("launchAnimation called when previous animation was running");
        }
        ((ke) mo.k(this, zlVar)).getClass();
        ke.a.getClass();
        sl1 sl1Var = new sl1(je.b);
        sn n0 = n0();
        vn vnVar = vn.d;
        uq1.N(n0, null, new vm(this, sl1Var, keVar, j, null), 1);
    }

    public final long C0(s11 s11Var, long j, long j2) {
        long x = ca0.x(j);
        int ordinal = this.s.ordinal();
        if (ordinal == 0) {
            ke keVar = (ke) mo.k(this, me.a);
            float f = s11Var.b;
            float a = keVar.a(f - ((int) (j2 & 4294967295L)), s11Var.d - f, Float.intBitsToFloat((int) (x & 4294967295L)));
            return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(a) & 4294967295L);
        }
        if (ordinal != 1) {
            l.a();
            return 0L;
        }
        ke keVar2 = (ke) mo.k(this, me.a);
        float f2 = s11Var.a;
        return (Float.floatToRawIntBits(keVar2.a(f2 - ((int) (j2 >> 32)), s11Var.c - f2, Float.intBitsToFloat((int) (x >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
    }

    @Override // defpackage.sc0
    public final void l(long j) {
        int b;
        long j2 = this.y;
        this.y = j;
        int ordinal = this.s.ordinal();
        if (ordinal == 0) {
            b = Intrinsics.b((int) (j & 4294967295L), (int) (j2 & 4294967295L));
        } else {
            if (ordinal != 1) {
                l.a();
                return;
            }
            b = Intrinsics.b((int) (j >> 32), (int) (j2 >> 32));
        }
        if (b >= 0) {
            return;
        }
        long j3 = !this.u ? this.s == et0.d ? (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L : (((int) (j2 >> 32)) - ((int) (j >> 32))) << 32 : 0L;
        s11 s11Var = (s11) this.v.invoke();
        if (s11Var == null || this.z || this.x || !A0(this, s11Var, j2, 0L, 2) || A0(this, s11Var, 0L, j3, 1)) {
            return;
        }
        this.x = true;
        B0(j3);
    }

    @Override // defpackage.zl0
    public final boolean o0() {
        return false;
    }
}
