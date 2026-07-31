package r2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final j f6523e = new j(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f6524a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6525b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6526c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6527d;

    public j(int i, int i8, int i9, int i10) {
        this.f6524a = i;
        this.f6525b = i8;
        this.f6526c = i9;
        this.f6527d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f6524a == jVar.f6524a && this.f6525b == jVar.f6525b && this.f6526c == jVar.f6526c && this.f6527d == jVar.f6527d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6527d) + a0.q.b(this.f6526c, a0.q.b(this.f6525b, Integer.hashCode(this.f6524a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f6524a);
        sb.append(", ");
        sb.append(this.f6525b);
        sb.append(", ");
        sb.append(this.f6526c);
        sb.append(", ");
        return a0.q.k(sb, this.f6527d, ')');
    }
}
