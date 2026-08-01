package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class n30 implements Closeable {
    public final b30 f;
    public final q00 g;
    public final String h;
    public final int i;
    public final ep j;
    public final kp k;
    public final p30 l;
    public final n30 m;
    public final n30 n;
    public final n30 o;
    public final long p;
    public final long q;
    public final uk r;

    public n30(b30 b30Var, q00 q00Var, String str, int i, ep epVar, kp kpVar, p30 p30Var, n30 n30Var, n30 n30Var2, n30 n30Var3, long j, long j2, uk ukVar) {
        b30Var.getClass();
        q00Var.getClass();
        str.getClass();
        this.f = b30Var;
        this.g = q00Var;
        this.h = str;
        this.i = i;
        this.j = epVar;
        this.k = kpVar;
        this.l = p30Var;
        this.m = n30Var;
        this.n = n30Var2;
        this.o = n30Var3;
        this.p = j;
        this.q = j2;
        this.r = ukVar;
    }

    public static String f(n30 n30Var, String str) {
        n30Var.getClass();
        String a = n30Var.k.a(str);
        if (a == null) {
            return null;
        }
        return a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        p30 p30Var = this.l;
        if (p30Var != null) {
            p30Var.close();
        } else {
            g9.s("response is not eligible for a body and must not be closed");
        }
    }

    public final m30 g() {
        m30 m30Var = new m30();
        m30Var.a = this.f;
        m30Var.b = this.g;
        m30Var.c = this.i;
        m30Var.d = this.h;
        m30Var.e = this.j;
        m30Var.f = this.k.c();
        m30Var.g = this.l;
        m30Var.h = this.m;
        m30Var.i = this.n;
        m30Var.j = this.o;
        m30Var.k = this.p;
        m30Var.l = this.q;
        m30Var.m = this.r;
        return m30Var;
    }

    public final String toString() {
        return "Response{protocol=" + this.g + ", code=" + this.i + ", message=" + this.h + ", url=" + this.f.a + '}';
    }
}
