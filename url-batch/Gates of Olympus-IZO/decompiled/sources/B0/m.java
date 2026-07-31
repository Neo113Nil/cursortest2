package B0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final I0.d f285a;

    /* renamed from: b, reason: collision with root package name */
    public final int f286b;

    /* renamed from: c, reason: collision with root package name */
    public final int f287c;

    public m(I0.d dVar, int i3, int i4) {
        this.f285a = dVar;
        this.f286b = i3;
        this.f287c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f285a.equals(mVar.f285a) && this.f286b == mVar.f286b && this.f287c == mVar.f287c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f287c) + AbstractC0080b.b(this.f286b, this.f285a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f285a);
        sb.append(", startIndex=");
        sb.append(this.f286b);
        sb.append(", endIndex=");
        return AbstractC0080b.k(sb, this.f287c, ')');
    }
}
