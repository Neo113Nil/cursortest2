package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dz1 {
    public String a;
    public pw2 b;
    public hp0 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public ca0 i;
    public ja j;
    public boolean k;
    public ol1 m;
    public cz1 n;
    public u81 o;
    public long h = l21.a;
    public long l = zm3.d(0, 0);
    public long p = v10.h(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;

    public dz1(String str, pw2 pw2Var, hp0 hp0Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = pw2Var;
        this.c = hp0Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public final int a(int i, u81 u81Var) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        int c = ti2.c(b(v10.a(0, i, 0, Integer.MAX_VALUE), u81Var).b());
        this.q = i;
        this.r = c;
        return c;
    }

    public final ja b(long j, u81 u81Var) {
        cz1 e = e(u81Var);
        long w = ap.w(j, this.e, this.d, e.c());
        boolean z = this.e;
        int i = this.d;
        int i2 = this.f;
        return new ja((na) e, ((z || i != 2) && i2 >= 1) ? i2 : 1, i == 2 ? 2 : 1, w);
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = v10.h(0, 0, 0, 0);
        this.l = zm3.d(0, 0);
        this.k = false;
    }

    public final void d(ca0 ca0Var) {
        long j;
        ca0 ca0Var2 = this.i;
        if (ca0Var != null) {
            int i = l21.b;
            j = l21.a(ca0Var.d(), ca0Var.p());
        } else {
            j = l21.a;
        }
        if (ca0Var2 == null) {
            this.i = ca0Var;
            this.h = j;
        } else if (ca0Var == null || this.h != j) {
            this.i = ca0Var;
            this.h = j;
            c();
        }
    }

    public final cz1 e(u81 u81Var) {
        cz1 cz1Var = this.n;
        if (cz1Var == null || u81Var != this.o || cz1Var.b()) {
            this.o = u81Var;
            String str = this.a;
            pw2 i = ci2.i(this.b, u81Var);
            ca0 ca0Var = this.i;
            ca0Var.getClass();
            hp0 hp0Var = this.c;
            ah0 ah0Var = ah0.m;
            cz1Var = new na(str, i, ah0Var, ah0Var, hp0Var, ca0Var);
        }
        this.n = cz1Var;
        return cz1Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        long j = this.h;
        int i = l21.b;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}
