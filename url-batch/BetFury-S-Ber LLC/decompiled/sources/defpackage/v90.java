package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class v90 implements Closeable {
    public final j90 f;
    public final u60 g;
    public final String h;
    public final int i;
    public final vs j;
    public final bt k;
    public final x90 l;
    public final v90 m;
    public final v90 n;
    public final v90 o;
    public final long p;
    public final long q;
    public final rn r;

    public v90(j90 j90Var, u60 u60Var, String str, int i, vs vsVar, bt btVar, x90 x90Var, v90 v90Var, v90 v90Var2, v90 v90Var3, long j, long j2, rn rnVar) {
        j90Var.getClass();
        u60Var.getClass();
        str.getClass();
        this.f = j90Var;
        this.g = u60Var;
        this.h = str;
        this.i = i;
        this.j = vsVar;
        this.k = btVar;
        this.l = x90Var;
        this.m = v90Var;
        this.n = v90Var2;
        this.o = v90Var3;
        this.p = j;
        this.q = j2;
        this.r = rnVar;
    }

    public static String i(v90 v90Var, String str) {
        v90Var.getClass();
        String a = v90Var.k.a(str);
        if (a == null) {
            return null;
        }
        return a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        x90 x90Var = this.l;
        if (x90Var != null) {
            x90Var.close();
        } else {
            s9.u("response is not eligible for a body and must not be closed");
        }
    }

    public final u90 n() {
        u90 u90Var = new u90();
        u90Var.a = this.f;
        u90Var.b = this.g;
        u90Var.c = this.i;
        u90Var.d = this.h;
        u90Var.e = this.j;
        u90Var.f = this.k.c();
        u90Var.g = this.l;
        u90Var.h = this.m;
        u90Var.i = this.n;
        u90Var.j = this.o;
        u90Var.k = this.p;
        u90Var.l = this.q;
        u90Var.m = this.r;
        return u90Var;
    }

    public final String toString() {
        return "Response{protocol=" + this.g + ", code=" + this.i + ", message=" + this.h + ", url=" + ((ou) this.f.b) + '}';
    }
}
