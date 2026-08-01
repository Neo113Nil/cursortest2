package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class u90 {
    public j90 a;
    public u60 b;
    public String d;
    public vs e;
    public x90 g;
    public v90 h;
    public v90 i;
    public v90 j;
    public long k;
    public long l;
    public rn m;
    public int c = -1;
    public o0 f = new o0(27);

    public static void b(v90 v90Var, String str) {
        if (v90Var != null) {
            if (v90Var.l != null) {
                s9.e(str.concat(".body != null"));
                return;
            }
            if (v90Var.m != null) {
                s9.e(str.concat(".networkResponse != null"));
            } else if (v90Var.n != null) {
                s9.e(str.concat(".cacheResponse != null"));
            } else {
                if (v90Var.o == null) {
                    return;
                }
                s9.e(str.concat(".priorResponse != null"));
            }
        }
    }

    public final v90 a() {
        int i = this.c;
        if (i < 0) {
            s9.l("code < 0: ", this.c);
            return null;
        }
        j90 j90Var = this.a;
        if (j90Var == null) {
            s9.u("request == null");
            return null;
        }
        u60 u60Var = this.b;
        if (u60Var == null) {
            s9.u("protocol == null");
            return null;
        }
        String str = this.d;
        if (str != null) {
            return new v90(j90Var, u60Var, str, i, this.e, this.f.x(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }
        s9.u("message == null");
        return null;
    }
}
