package e7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final k f2880b = new k();

    /* renamed from: a, reason: collision with root package name */
    public final Object f2881a;

    public static final Object a(Object obj) {
        if (obj instanceof k) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return r6.k.a(this.f2881a, ((l) obj).f2881a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f2881a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f2881a;
        if (obj instanceof j) {
            return ((j) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
