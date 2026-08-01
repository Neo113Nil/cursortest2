package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class h00 {
    public xz a;
    public nx b;
    public String d;
    public sm e;
    public k00 g;
    public i00 h;
    public i00 i;
    public i00 j;
    public long k;
    public long l;
    public ni m;
    public int c = -1;
    public k0 f = new k0(25);

    public static void b(i00 i00Var, String str) {
        if (i00Var != null) {
            if (i00Var.l != null) {
                t8.e(str.concat(".body != null"));
                return;
            }
            if (i00Var.m != null) {
                t8.e(str.concat(".networkResponse != null"));
            } else if (i00Var.n != null) {
                t8.e(str.concat(".cacheResponse != null"));
            } else {
                if (i00Var.o == null) {
                    return;
                }
                t8.e(str.concat(".priorResponse != null"));
            }
        }
    }

    public final i00 a() {
        int i = this.c;
        if (i < 0) {
            t8.l("code < 0: ", this.c);
            return null;
        }
        xz xzVar = this.a;
        if (xzVar == null) {
            t8.t("request == null");
            return null;
        }
        nx nxVar = this.b;
        if (nxVar == null) {
            t8.t("protocol == null");
            return null;
        }
        String str = this.d;
        if (str != null) {
            return new i00(xzVar, nxVar, str, i, this.e, this.f.B(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }
        t8.t("message == null");
        return null;
    }
}
