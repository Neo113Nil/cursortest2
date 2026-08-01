package l8;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final r f5920a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5921b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5922c;

    public j(r rVar, int i3, int i10) {
        this.f5920a = rVar;
        this.f5921b = i3;
        this.f5922c = i10;
    }

    public static j a(Class cls) {
        return new j(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f5920a.equals(jVar.f5920a) && this.f5921b == jVar.f5921b && this.f5922c == jVar.f5922c;
    }

    public final int hashCode() {
        return ((((this.f5920a.hashCode() ^ 1000003) * 1000003) ^ this.f5921b) * 1000003) ^ this.f5922c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f5920a);
        sb2.append(", type=");
        int i3 = this.f5921b;
        sb2.append(i3 == 1 ? "required" : i3 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        int i10 = this.f5922c;
        if (i10 == 0) {
            str = pc.e.DIRECT_TAG;
        } else if (i10 == 1) {
            str = "provider";
        } else {
            if (i10 != 2) {
                throw new AssertionError(v4.a.j(i10, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return v4.a.o(sb2, str, "}");
    }

    public j(int i3, int i10, Class cls) {
        this(r.a(cls), i3, i10);
    }
}
