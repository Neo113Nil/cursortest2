package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xu2 {
    public final yd a;
    public final long b;
    public final bw2 c;
    public final cu1 d;
    public final iw2 e;
    public long f;
    public final yd g;
    public final nv2 h;
    public final cw2 i;

    public xu2(nv2 nv2Var, cu1 cu1Var, cw2 cw2Var, iw2 iw2Var) {
        yd ydVar = nv2Var.a;
        long j = nv2Var.b;
        bw2 bw2Var = cw2Var != null ? cw2Var.a : null;
        this.a = ydVar;
        this.b = j;
        this.c = bw2Var;
        this.d = cu1Var;
        this.e = iw2Var;
        this.f = j;
        this.g = ydVar;
        this.h = nv2Var;
        this.i = cw2Var;
    }

    public final List a(Function1 function1) {
        if (!jw2.b(this.f)) {
            return qv.g(new yw(BuildConfig.FLAVOR, 0), new nj2(jw2.e(this.f), jw2.e(this.f)));
        }
        pf0 pf0Var = (pf0) function1.invoke(this);
        if (pf0Var != null) {
            return pv.c(pf0Var);
        }
        return null;
    }

    public final Integer b() {
        bw2 bw2Var = this.c;
        if (bw2Var == null) {
            return null;
        }
        int d = jw2.d(this.f);
        cu1 cu1Var = this.d;
        return Integer.valueOf(cu1Var.b(bw2Var.d(bw2Var.e(cu1Var.g(d)), true)));
    }

    public final Integer c() {
        int length;
        bw2 bw2Var = this.c;
        if (bw2Var == null) {
            return null;
        }
        int p = p();
        while (true) {
            yd ydVar = this.a;
            if (p < ydVar.n.length()) {
                int length2 = this.g.n.length() - 1;
                if (p <= length2) {
                    length2 = p;
                }
                long k = bw2Var.k(length2);
                int i = jw2.c;
                int i2 = (int) (k & 4294967295L);
                if (i2 > p) {
                    length = this.d.b(i2);
                    break;
                }
                p++;
            } else {
                length = ydVar.n.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer d() {
        int i;
        bw2 bw2Var = this.c;
        if (bw2Var == null) {
            return null;
        }
        int p = p();
        while (true) {
            if (p <= 0) {
                i = 0;
                break;
            }
            int length = this.g.n.length() - 1;
            if (p <= length) {
                length = p;
            }
            long k = bw2Var.k(length);
            int i2 = jw2.c;
            int i3 = (int) (k >> 32);
            if (i3 < p) {
                i = this.d.b(i3);
                break;
            }
            p--;
        }
        return Integer.valueOf(i);
    }

    public final boolean e() {
        bw2 bw2Var = this.c;
        return (bw2Var != null ? bw2Var.i(p()) : null) != k92.n;
    }

    public final int f(bw2 bw2Var, int i) {
        int p = p();
        iw2 iw2Var = this.e;
        if (iw2Var.a == null) {
            iw2Var.a = Float.valueOf(bw2Var.c(p).a);
        }
        int e = bw2Var.e(p);
        sm1 sm1Var = bw2Var.b;
        int i2 = e + i;
        if (i2 < 0) {
            return 0;
        }
        if (i2 >= sm1Var.f) {
            return this.g.n.length();
        }
        float b = sm1Var.b(i2) - 1.0f;
        Float f = iw2Var.a;
        f.getClass();
        float floatValue = f.floatValue();
        if ((e() && floatValue >= bw2Var.g(i2)) || (!e() && floatValue <= bw2Var.f(i2))) {
            return bw2Var.d(i2, true);
        }
        return this.d.b(sm1Var.e(ap.i(f.floatValue(), b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r7 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(cw2 cw2Var, int i) {
        w72 w72Var;
        t81 t81Var = cw2Var.b;
        bw2 bw2Var = cw2Var.a;
        if (t81Var != null) {
            t81 t81Var2 = cw2Var.c;
            w72Var = t81Var2 != null ? t81Var2.M(t81Var, true) : null;
        }
        w72Var = w72.e;
        long j = this.h.b;
        int i2 = jw2.c;
        cu1 cu1Var = this.d;
        w72 c = bw2Var.c(cu1Var.g((int) (j & 4294967295L)));
        return cu1Var.b(bw2Var.b.e(ap.i(c.a, (ql2.b(w72Var.b()) * i) + c.b)));
    }

    public final void h() {
        iw2 iw2Var = this.e;
        iw2Var.a = null;
        yd ydVar = this.g;
        if (ydVar.n.length() > 0) {
            if (e()) {
                iw2Var.a = null;
                if (ydVar.n.length() > 0) {
                    String str = ydVar.n;
                    long j = this.f;
                    int i = jw2.c;
                    int f = ti2.f((int) (j & 4294967295L), str);
                    if (f != -1) {
                        o(f, f);
                        return;
                    }
                    return;
                }
                return;
            }
            iw2Var.a = null;
            if (ydVar.n.length() > 0) {
                String str2 = ydVar.n;
                long j2 = this.f;
                int i2 = jw2.c;
                int e = ti2.e((int) (j2 & 4294967295L), str2);
                if (e != -1) {
                    o(e, e);
                }
            }
        }
    }

    public final void i() {
        this.e.a = null;
        yd ydVar = this.g;
        String str = ydVar.n;
        String str2 = ydVar.n;
        if (str.length() > 0) {
            int g = mi2.g(str2, jw2.d(this.f));
            if (g == jw2.d(this.f) && g != str2.length()) {
                g = mi2.g(str2, g + 1);
            }
            o(g, g);
        }
    }

    public final void j() {
        this.e.a = null;
        yd ydVar = this.g;
        String str = ydVar.n;
        String str2 = ydVar.n;
        if (str.length() > 0) {
            int h = mi2.h(str2, jw2.e(this.f));
            if (h == jw2.e(this.f) && h != 0) {
                h = mi2.h(str2, h - 1);
            }
            o(h, h);
        }
    }

    public final void k() {
        iw2 iw2Var = this.e;
        iw2Var.a = null;
        yd ydVar = this.g;
        if (ydVar.n.length() > 0) {
            if (e()) {
                iw2Var.a = null;
                if (ydVar.n.length() > 0) {
                    String str = ydVar.n;
                    long j = this.f;
                    int i = jw2.c;
                    int e = ti2.e((int) (j & 4294967295L), str);
                    if (e != -1) {
                        o(e, e);
                        return;
                    }
                    return;
                }
                return;
            }
            iw2Var.a = null;
            if (ydVar.n.length() > 0) {
                String str2 = ydVar.n;
                long j2 = this.f;
                int i2 = jw2.c;
                int f = ti2.f((int) (j2 & 4294967295L), str2);
                if (f != -1) {
                    o(f, f);
                }
            }
        }
    }

    public final void l() {
        Integer b;
        this.e.a = null;
        if (this.g.n.length() <= 0 || (b = b()) == null) {
            return;
        }
        int intValue = b.intValue();
        o(intValue, intValue);
    }

    public final void m() {
        Integer num = null;
        this.e.a = null;
        if (this.g.n.length() > 0) {
            bw2 bw2Var = this.c;
            if (bw2Var != null) {
                int e = jw2.e(this.f);
                cu1 cu1Var = this.d;
                num = Integer.valueOf(cu1Var.b(bw2Var.h(bw2Var.e(cu1Var.g(e)))));
            }
            if (num != null) {
                int intValue = num.intValue();
                o(intValue, intValue);
            }
        }
    }

    public final void n() {
        if (this.g.n.length() > 0) {
            int i = jw2.c;
            this.f = th2.a((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void o(int i, int i2) {
        this.f = th2.a(i, i2);
    }

    public final int p() {
        long j = this.f;
        int i = jw2.c;
        return this.d.g((int) (j & 4294967295L));
    }
}
