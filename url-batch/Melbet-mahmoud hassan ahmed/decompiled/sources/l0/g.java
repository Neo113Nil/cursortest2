package l0;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f18454a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18455b;

    public g(String str, int i7) {
        this.f18454a = str;
        this.f18455b = i7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f18455b != gVar.f18455b) {
            return false;
        }
        return this.f18454a.equals(gVar.f18454a);
    }

    public int hashCode() {
        return (this.f18454a.hashCode() * 31) + this.f18455b;
    }
}
