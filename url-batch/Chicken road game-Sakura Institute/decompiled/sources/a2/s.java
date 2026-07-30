package a2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final i2.d f447a;

    /* renamed from: b, reason: collision with root package name */
    public final int f448b;

    /* renamed from: c, reason: collision with root package name */
    public final int f449c;

    public s(i2.d dVar, int i7, int i8) {
        this.f447a = dVar;
        this.f448b = i7;
        this.f449c = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f447a.equals(sVar.f447a) && this.f448b == sVar.f448b && this.f449c == sVar.f449c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f449c) + l.h.c(this.f448b, this.f447a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f447a);
        sb.append(", startIndex=");
        sb.append(this.f448b);
        sb.append(", endIndex=");
        return a0.m.l(sb, this.f449c, ')');
    }
}
