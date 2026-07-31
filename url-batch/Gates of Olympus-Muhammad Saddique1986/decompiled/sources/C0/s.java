package C0;

import m.AbstractC0625j;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final K0.c f641a;

    /* renamed from: b, reason: collision with root package name */
    public final int f642b;

    /* renamed from: c, reason: collision with root package name */
    public final int f643c;

    public s(K0.c cVar, int i3, int i4) {
        this.f641a = cVar;
        this.f642b = i3;
        this.f643c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f641a.equals(sVar.f641a) && this.f642b == sVar.f642b && this.f643c == sVar.f643c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f643c) + AbstractC0625j.a(this.f642b, this.f641a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f641a);
        sb.append(", startIndex=");
        sb.append(this.f642b);
        sb.append(", endIndex=");
        return A.k.j(sb, this.f643c, ')');
    }
}
