package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class v92 {
    public fy a;
    public s52 b;
    public String d;
    public dx0 e;
    public t01 g;
    public w92 h;
    public w92 i;
    public w92 j;
    public long k;
    public long l;
    public du m;
    public int c = -1;
    public lx0 f = new lx0(0);

    public static void b(w92 w92Var, String str) {
        if (w92Var != null) {
            if (w92Var.s != null) {
                lh.c(str.concat(".body != null"));
                return;
            }
            if (w92Var.t != null) {
                lh.c(str.concat(".networkResponse != null"));
            } else if (w92Var.u != null) {
                lh.c(str.concat(".cacheResponse != null"));
            } else {
                if (w92Var.v == null) {
                    return;
                }
                lh.c(str.concat(".priorResponse != null"));
            }
        }
    }

    public final w92 a() {
        int i = this.c;
        if (i < 0) {
            b71.g(this.c, "code < 0: ");
            return null;
        }
        fy fyVar = this.a;
        if (fyVar == null) {
            lh.g("request == null");
            return null;
        }
        s52 s52Var = this.b;
        if (s52Var == null) {
            lh.g("protocol == null");
            return null;
        }
        String str = this.d;
        if (str != null) {
            return new w92(fyVar, s52Var, str, i, this.e, this.f.c(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }
        lh.g("message == null");
        return null;
    }
}
