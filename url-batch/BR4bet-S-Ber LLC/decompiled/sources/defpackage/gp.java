package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class gp {
    public static final l9 d;
    public static final l9 e;
    public static final l9 f;
    public static final l9 g;
    public static final l9 h;
    public static final l9 i;
    public final l9 a;
    public final l9 b;
    public final int c;

    static {
        l9 l9Var = l9.i;
        d = ej.h(":");
        e = ej.h(":status");
        f = ej.h(":method");
        g = ej.h(":path");
        h = ej.h(":scheme");
        i = ej.h(":authority");
    }

    public gp(l9 l9Var, l9 l9Var2) {
        l9Var.getClass();
        l9Var2.getClass();
        this.a = l9Var;
        this.b = l9Var2;
        this.c = l9Var2.a() + l9Var.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp)) {
            return false;
        }
        gp gpVar = (gp) obj;
        return kr.b(this.a, gpVar.a) && kr.b(this.b, gpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.h() + ": " + this.b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gp(String str, String str2) {
        this(ej.h(str), ej.h(str2));
        str.getClass();
        str2.getClass();
        l9 l9Var = l9.i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gp(l9 l9Var, String str) {
        this(l9Var, ej.h(str));
        l9Var.getClass();
        str.getClass();
        l9 l9Var2 = l9.i;
    }
}
