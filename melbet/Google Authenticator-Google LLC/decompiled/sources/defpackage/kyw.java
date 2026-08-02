package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyw {
    public static final kyv a = new kyv();
    public final Object b;

    public /* synthetic */ kyw(Object obj) {
        this.b = obj;
    }

    public static final Object a(Object obj) {
        if (obj instanceof kyv) {
            return null;
        }
        return obj;
    }

    public static final Throwable b(Object obj) {
        kyu kyuVar = obj instanceof kyu ? (kyu) obj : null;
        if (kyuVar != null) {
            return kyuVar.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kyw) && ksp.b(this.b, ((kyw) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        return obj instanceof kyu ? ((kyu) obj).toString() : a.ab(obj, "Value(", ")");
    }
}
