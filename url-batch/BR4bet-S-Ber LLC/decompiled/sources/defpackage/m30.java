package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class m30 {
    public b30 a;
    public q00 b;
    public String d;
    public ep e;
    public p30 g;
    public n30 h;
    public n30 i;
    public n30 j;
    public long k;
    public long l;
    public uk m;
    public int c = -1;
    public rc0 f = new rc0(25);

    public static void b(n30 n30Var, String str) {
        if (n30Var != null) {
            if (n30Var.l != null) {
                g9.d(str.concat(".body != null"));
                return;
            }
            if (n30Var.m != null) {
                g9.d(str.concat(".networkResponse != null"));
            } else if (n30Var.n != null) {
                g9.d(str.concat(".cacheResponse != null"));
            } else {
                if (n30Var.o == null) {
                    return;
                }
                g9.d(str.concat(".priorResponse != null"));
            }
        }
    }

    public final n30 a() {
        int i = this.c;
        if (i < 0) {
            g9.j("code < 0: ", this.c);
            return null;
        }
        b30 b30Var = this.a;
        if (b30Var == null) {
            g9.s("request == null");
            return null;
        }
        q00 q00Var = this.b;
        if (q00Var == null) {
            g9.s("protocol == null");
            return null;
        }
        String str = this.d;
        if (str != null) {
            return new n30(b30Var, q00Var, str, i, this.e, this.f.A(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }
        g9.s("message == null");
        return null;
    }
}
