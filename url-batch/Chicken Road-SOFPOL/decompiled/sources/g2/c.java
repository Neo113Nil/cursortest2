package g2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2917a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2918b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2919c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2920d;

    public c(Object obj, int i, int i8, String str) {
        this.f2917a = obj;
        this.f2918b = i;
        this.f2919c = i8;
        this.f2920d = str;
        if (i <= i8) {
            return;
        }
        l2.a.a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return q6.i.a(this.f2917a, cVar.f2917a) && this.f2918b == cVar.f2918b && this.f2919c == cVar.f2919c && q6.i.a(this.f2920d, cVar.f2920d);
    }

    public final int hashCode() {
        Object obj = this.f2917a;
        return this.f2920d.hashCode() + a0.q.b(this.f2919c, a0.q.b(this.f2918b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.f2917a + ", start=" + this.f2918b + ", end=" + this.f2919c + ", tag=" + this.f2920d + ')';
    }

    public c(int i, int i8, Object obj) {
        this(obj, i, i8, "");
    }
}
