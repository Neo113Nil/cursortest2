package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class xs {
    public static final y9 d;
    public static final y9 e;
    public static final y9 f;
    public static final y9 g;
    public static final y9 h;
    public static final y9 i;
    public final y9 a;
    public final y9 b;
    public final int c;

    static {
        y9 y9Var = y9.i;
        d = sl.h(":");
        e = sl.h(":status");
        f = sl.h(":method");
        g = sl.h(":path");
        h = sl.h(":scheme");
        i = sl.h(":authority");
    }

    public xs(y9 y9Var, y9 y9Var2) {
        y9Var.getClass();
        y9Var2.getClass();
        this.a = y9Var;
        this.b = y9Var2;
        this.c = y9Var2.a() + y9Var.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs)) {
            return false;
        }
        xs xsVar = (xs) obj;
        return mv.c(this.a, xsVar.a) && mv.c(this.b, xsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.h() + ": " + this.b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xs(String str, String str2) {
        this(sl.h(str), sl.h(str2));
        str.getClass();
        str2.getClass();
        y9 y9Var = y9.i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xs(y9 y9Var, String str) {
        this(y9Var, sl.h(str));
        y9Var.getClass();
        str.getClass();
        y9 y9Var2 = y9.i;
    }
}
