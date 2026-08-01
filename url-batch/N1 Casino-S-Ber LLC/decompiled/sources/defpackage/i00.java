package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class i00 implements Closeable {
    public final xz f;
    public final nx g;
    public final String h;
    public final int i;
    public final sm j;
    public final ym k;
    public final k00 l;
    public final i00 m;
    public final i00 n;
    public final i00 o;
    public final long p;
    public final long q;
    public final ni r;

    public i00(xz xzVar, nx nxVar, String str, int i, sm smVar, ym ymVar, k00 k00Var, i00 i00Var, i00 i00Var2, i00 i00Var3, long j, long j2, ni niVar) {
        xzVar.getClass();
        nxVar.getClass();
        str.getClass();
        this.f = xzVar;
        this.g = nxVar;
        this.h = str;
        this.i = i;
        this.j = smVar;
        this.k = ymVar;
        this.l = k00Var;
        this.m = i00Var;
        this.n = i00Var2;
        this.o = i00Var3;
        this.p = j;
        this.q = j2;
        this.r = niVar;
    }

    public static String m(i00 i00Var, String str) {
        i00Var.getClass();
        String a = i00Var.k.a(str);
        if (a == null) {
            return null;
        }
        return a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        k00 k00Var = this.l;
        if (k00Var != null) {
            k00Var.close();
        } else {
            t8.t("response is not eligible for a body and must not be closed");
        }
    }

    public final h00 n() {
        h00 h00Var = new h00();
        h00Var.a = this.f;
        h00Var.b = this.g;
        h00Var.c = this.i;
        h00Var.d = this.h;
        h00Var.e = this.j;
        h00Var.f = this.k.c();
        h00Var.g = this.l;
        h00Var.h = this.m;
        h00Var.i = this.n;
        h00Var.j = this.o;
        h00Var.k = this.p;
        h00Var.l = this.q;
        h00Var.m = this.r;
        return h00Var;
    }

    public final String toString() {
        return "Response{protocol=" + this.g + ", code=" + this.i + ", message=" + this.h + ", url=" + this.f.a + '}';
    }
}
