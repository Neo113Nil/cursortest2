package g2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final n2.c f2990a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2991b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2992c;

    public p(n2.c cVar, int i, int i8) {
        this.f2990a = cVar;
        this.f2991b = i;
        this.f2992c = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f2990a.equals(pVar.f2990a) && this.f2991b == pVar.f2991b && this.f2992c == pVar.f2992c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2992c) + a0.q.b(this.f2991b, this.f2990a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f2990a);
        sb.append(", startIndex=");
        sb.append(this.f2991b);
        sb.append(", endIndex=");
        return a0.q.k(sb, this.f2992c, ')');
    }
}
