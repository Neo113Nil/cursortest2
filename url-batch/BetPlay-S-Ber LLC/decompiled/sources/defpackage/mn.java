package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class mn {
    public static final t8 d;
    public static final t8 e;
    public static final t8 f;
    public static final t8 g;
    public static final t8 h;
    public static final t8 i;
    public final t8 a;
    public final t8 b;
    public final int c;

    static {
        t8 t8Var = t8.i;
        d = vg.j(":");
        e = vg.j(":status");
        f = vg.j(":method");
        g = vg.j(":path");
        h = vg.j(":scheme");
        i = vg.j(":authority");
    }

    public mn(t8 t8Var, t8 t8Var2) {
        t8Var.getClass();
        t8Var2.getClass();
        this.a = t8Var;
        this.b = t8Var2;
        this.c = t8Var2.a() + t8Var.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn)) {
            return false;
        }
        mn mnVar = (mn) obj;
        return op.d(this.a, mnVar.a) && op.d(this.b, mnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.h() + ": " + this.b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mn(String str, String str2) {
        this(vg.j(str), vg.j(str2));
        str.getClass();
        str2.getClass();
        t8 t8Var = t8.i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mn(t8 t8Var, String str) {
        this(t8Var, vg.j(str));
        t8Var.getClass();
        str.getClass();
        t8 t8Var2 = t8.i;
    }
}
