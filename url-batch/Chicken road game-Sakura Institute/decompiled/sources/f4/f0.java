package f4;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3324a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3325b;

    public f0(String str, String str2) {
        r6.k.f(str2, "deviceUuid");
        this.f3324a = str;
        this.f3325b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return r6.k.a(this.f3324a, f0Var.f3324a) && r6.k.a(this.f3325b, f0Var.f3325b);
    }

    public final int hashCode() {
        return this.f3325b.hashCode() + (this.f3324a.hashCode() * 31);
    }

    public final String toString() {
        return "TraceIds(gaid=" + this.f3324a + ", deviceUuid=" + this.f3325b + ")";
    }
}
