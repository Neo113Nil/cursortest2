package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class y00 implements Closeable {
    public final pp f;
    public final dy g;
    public final String h;
    public final int i;
    public final kn j;
    public final nn k;
    public final a10 l;
    public final y00 m;
    public final y00 n;
    public final y00 o;
    public final long p;
    public final long q;
    public final gi r;

    public y00(pp ppVar, dy dyVar, String str, int i, kn knVar, nn nnVar, a10 a10Var, y00 y00Var, y00 y00Var2, y00 y00Var3, long j, long j2, gi giVar) {
        ppVar.getClass();
        dyVar.getClass();
        str.getClass();
        this.f = ppVar;
        this.g = dyVar;
        this.h = str;
        this.i = i;
        this.j = knVar;
        this.k = nnVar;
        this.l = a10Var;
        this.m = y00Var;
        this.n = y00Var2;
        this.o = y00Var3;
        this.p = j;
        this.q = j2;
        this.r = giVar;
    }

    public static String m(y00 y00Var, String str) {
        y00Var.getClass();
        String a = y00Var.k.a(str);
        if (a == null) {
            return null;
        }
        return a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a10 a10Var = this.l;
        if (a10Var != null) {
            a10Var.close();
        } else {
            o8.t("response is not eligible for a body and must not be closed");
        }
    }

    public final x00 n() {
        x00 x00Var = new x00();
        x00Var.a = this.f;
        x00Var.b = this.g;
        x00Var.c = this.i;
        x00Var.d = this.h;
        x00Var.e = this.j;
        x00Var.f = this.k.c();
        x00Var.g = this.l;
        x00Var.h = this.m;
        x00Var.i = this.n;
        x00Var.j = this.o;
        x00Var.k = this.p;
        x00Var.l = this.q;
        x00Var.m = this.r;
        return x00Var;
    }

    public final String toString() {
        return "Response{protocol=" + this.g + ", code=" + this.i + ", message=" + this.h + ", url=" + ((yo) this.f.b) + '}';
    }
}
