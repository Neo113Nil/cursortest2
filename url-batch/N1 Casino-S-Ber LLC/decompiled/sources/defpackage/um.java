package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class um {
    public static final y8 d;
    public static final y8 e;
    public static final y8 f;
    public static final y8 g;
    public static final y8 h;
    public static final y8 i;
    public final y8 a;
    public final y8 b;
    public final int c;

    static {
        y8 y8Var = y8.i;
        d = dh.i(":");
        e = dh.i(":status");
        f = dh.i(":method");
        g = dh.i(":path");
        h = dh.i(":scheme");
        i = dh.i(":authority");
    }

    public um(y8 y8Var, y8 y8Var2) {
        y8Var.getClass();
        y8Var2.getClass();
        this.a = y8Var;
        this.b = y8Var2;
        this.c = y8Var2.a() + y8Var.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um)) {
            return false;
        }
        um umVar = (um) obj;
        return zo.b(this.a, umVar.a) && zo.b(this.b, umVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.h() + ": " + this.b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public um(String str, String str2) {
        this(dh.i(str), dh.i(str2));
        str.getClass();
        str2.getClass();
        y8 y8Var = y8.i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public um(y8 y8Var, String str) {
        this(y8Var, dh.i(str));
        y8Var.getClass();
        str.getClass();
        y8 y8Var2 = y8.i;
    }
}
