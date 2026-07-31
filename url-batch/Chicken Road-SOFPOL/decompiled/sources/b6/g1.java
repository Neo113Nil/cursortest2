package b6;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1326a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1327b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1328c;

    public g1(String str, String str2, String str3) {
        this.f1326a = str;
        this.f1327b = str2;
        this.f1328c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return q6.i.a(this.f1326a, g1Var.f1326a) && q6.i.a(this.f1327b, g1Var.f1327b) && q6.i.a(this.f1328c, g1Var.f1328c);
    }

    public final int hashCode() {
        return this.f1328c.hashCode() + ((this.f1327b.hashCode() + (this.f1326a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "OnboardingPage(emoji=" + this.f1326a + ", title=" + this.f1327b + ", description=" + this.f1328c + ")";
    }
}
