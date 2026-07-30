package defpackage;

import androidx.compose.foundation.gestures.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cg2 {
    public uf2 a;
    public px1 b;
    public om0 c;
    public ww1 d;
    public boolean e;
    public js0 f;
    public int g = 1;
    public ff2 h = a.a;
    public final ag2 i = new ag2(this);
    public final s72 j = new s72(4, this);

    public cg2(uf2 uf2Var, px1 px1Var, om0 om0Var, ww1 ww1Var, boolean z, js0 js0Var) {
        this.a = uf2Var;
        this.b = px1Var;
        this.c = om0Var;
        this.d = ww1Var;
        this.e = z;
        this.f = js0Var;
    }

    public static final long a(cg2 cg2Var, ff2 ff2Var, long j, int i) {
        mr1 mr1Var = (mr1) cg2Var.f.m;
        mr1 mr1Var2 = null;
        mr1 mr1Var3 = (mr1Var == null || !mr1Var.z) ? null : (mr1) nk2.j(mr1Var);
        long o = mr1Var3 != null ? mr1Var3.o(j, i) : 0L;
        long f = au1.f(j, o);
        long d = cg2Var.d(cg2Var.g(ff2Var.a(cg2Var.f(cg2Var.d(au1.a(f, 0.0f, cg2Var.d == ww1.n ? 1 : 2))))));
        long f2 = au1.f(f, d);
        mr1 mr1Var4 = (mr1) cg2Var.f.m;
        if (mr1Var4 != null && mr1Var4.z) {
            mr1Var2 = (mr1) nk2.j(mr1Var4);
        }
        mr1 mr1Var5 = mr1Var2;
        return au1.g(au1.g(o, d), mr1Var5 != null ? mr1Var5.d0(d, f2, i) : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, r30 r30Var) {
        xf2 xf2Var;
        int i;
        b82 b82Var;
        if (r30Var instanceof xf2) {
            xf2Var = (xf2) r30Var;
            int i2 = xf2Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xf2Var.p = i2 - Integer.MIN_VALUE;
                Object obj = xf2Var.n;
                Object obj2 = b50.m;
                i = xf2Var.p;
                if (i != 0) {
                    ca2.b(obj);
                    b82 b82Var2 = new b82();
                    b82Var2.m = j;
                    Function2 zf2Var = new zf2(this, b82Var2, j, null);
                    xf2Var.m = b82Var2;
                    xf2Var.p = 1;
                    if (e(ho1.m, zf2Var, xf2Var) == obj2) {
                        return obj2;
                    }
                    b82Var = b82Var2;
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b82Var = xf2Var.m;
                    ca2.b(obj);
                }
                return new f43(b82Var.m);
            }
        }
        xf2Var = new xf2(this, r30Var);
        Object obj3 = xf2Var.n;
        Object obj22 = b50.m;
        i = xf2Var.p;
        if (i != 0) {
        }
        return new f43(b82Var.m);
    }

    public final float c(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long d(long j) {
        return this.e ? au1.h(j, -1.0f) : j;
    }

    public final Object e(ho1 ho1Var, Function2 function2, r30 r30Var) {
        Object d = this.a.d(ho1Var, new ed(this, function2, (o30) null, 17), r30Var);
        return d == b50.m ? d : Unit.a;
    }

    public final float f(long j) {
        return this.d == ww1.n ? au1.d(j) : au1.e(j);
    }

    public final long g(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        return this.d == ww1.n ? ap.i(f, 0.0f) : ap.i(0.0f, f);
    }
}
