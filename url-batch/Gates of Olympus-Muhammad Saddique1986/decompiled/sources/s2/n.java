package s2;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final m f8411b = new m();

    /* renamed from: a, reason: collision with root package name */
    public final Object f8412a;

    public static final Object a(Object obj) {
        if (obj instanceof m) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return f2.j.a(this.f8412a, ((n) obj).f8412a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f8412a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f8412a;
        if (obj instanceof l) {
            return ((l) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
