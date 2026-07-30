package f4;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u implements w {

    /* renamed from: a, reason: collision with root package name */
    public final String f3350a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3351b;

    public u(String str, boolean z8) {
        r6.k.f(str, "url");
        this.f3350a = str;
        this.f3351b = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return r6.k.a(this.f3350a, uVar.f3350a) && this.f3351b == uVar.f3351b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3351b) + (this.f3350a.hashCode() * 31);
    }

    public final String toString() {
        return "Page(url=" + this.f3350a + ", consent=" + this.f3351b + ")";
    }
}
