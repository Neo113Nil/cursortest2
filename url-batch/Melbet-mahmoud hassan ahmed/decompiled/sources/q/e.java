package q;

/* loaded from: classes.dex */
public class e<F, S> {

    /* renamed from: a, reason: collision with root package name */
    public final F f20160a;

    /* renamed from: b, reason: collision with root package name */
    public final S f20161b;

    public e(F f7, S s7) {
        this.f20160a = f7;
        this.f20161b = s7;
    }

    public static <A, B> e<A, B> a(A a7, B b7) {
        return new e<>(a7, b7);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return d.a(eVar.f20160a, this.f20160a) && d.a(eVar.f20161b, this.f20161b);
    }

    public int hashCode() {
        F f7 = this.f20160a;
        int hashCode = f7 == null ? 0 : f7.hashCode();
        S s7 = this.f20161b;
        return hashCode ^ (s7 != null ? s7.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f20160a + " " + this.f20161b + "}";
    }
}
