package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class w92 implements Closeable {
    public final fy m;
    public final s52 n;
    public final String o;
    public final int p;
    public final dx0 q;
    public final mx0 r;
    public final t01 s;
    public final w92 t;
    public final w92 u;
    public final w92 v;
    public final long w;
    public final long x;
    public final du y;
    public gr z;

    public w92(fy fyVar, s52 s52Var, String str, int i, dx0 dx0Var, mx0 mx0Var, t01 t01Var, w92 w92Var, w92 w92Var2, w92 w92Var3, long j, long j2, du duVar) {
        fyVar.getClass();
        s52Var.getClass();
        str.getClass();
        this.m = fyVar;
        this.n = s52Var;
        this.o = str;
        this.p = i;
        this.q = dx0Var;
        this.r = mx0Var;
        this.s = t01Var;
        this.t = w92Var;
        this.u = w92Var2;
        this.v = w92Var3;
        this.w = j;
        this.x = j2;
        this.y = duVar;
    }

    public static String b(w92 w92Var, String str) {
        w92Var.getClass();
        String a = w92Var.r.a(str);
        if (a == null) {
            return null;
        }
        return a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t01 t01Var = this.s;
        if (t01Var != null) {
            t01Var.close();
        } else {
            lh.g("response is not eligible for a body and must not be closed");
        }
    }

    public final v92 f() {
        v92 v92Var = new v92();
        v92Var.a = this.m;
        v92Var.b = this.n;
        v92Var.c = this.p;
        v92Var.d = this.o;
        v92Var.e = this.q;
        v92Var.f = this.r.c();
        v92Var.g = this.s;
        v92Var.h = this.t;
        v92Var.i = this.u;
        v92Var.j = this.v;
        v92Var.k = this.w;
        v92Var.l = this.x;
        v92Var.m = this.y;
        return v92Var;
    }

    public final String toString() {
        return "Response{protocol=" + this.n + ", code=" + this.p + ", message=" + this.o + ", url=" + ((kz0) this.m.n) + '}';
    }
}
