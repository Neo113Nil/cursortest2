package B0;

import H2.AbstractC0080b;
import e2.AbstractC0381e;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final C0004a f278a;

    /* renamed from: b, reason: collision with root package name */
    public final int f279b;

    /* renamed from: c, reason: collision with root package name */
    public final int f280c;

    /* renamed from: d, reason: collision with root package name */
    public final int f281d;

    /* renamed from: e, reason: collision with root package name */
    public final int f282e;

    /* renamed from: f, reason: collision with root package name */
    public final float f283f;

    /* renamed from: g, reason: collision with root package name */
    public final float f284g;

    public l(C0004a c0004a, int i3, int i4, int i5, int i6, float f3, float f4) {
        this.f278a = c0004a;
        this.f279b = i3;
        this.f280c = i4;
        this.f281d = i5;
        this.f282e = i6;
        this.f283f = f3;
        this.f284g = f4;
    }

    public final int a(int i3) {
        int i4 = this.f280c;
        int i5 = this.f279b;
        return AbstractC0381e.r(i3, i5, i4) - i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f278a.equals(lVar.f278a) && this.f279b == lVar.f279b && this.f280c == lVar.f280c && this.f281d == lVar.f281d && this.f282e == lVar.f282e && Float.compare(this.f283f, lVar.f283f) == 0 && Float.compare(this.f284g, lVar.f284g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f284g) + AbstractC0080b.a(this.f283f, AbstractC0080b.b(this.f282e, AbstractC0080b.b(this.f281d, AbstractC0080b.b(this.f280c, AbstractC0080b.b(this.f279b, this.f278a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f278a);
        sb.append(", startIndex=");
        sb.append(this.f279b);
        sb.append(", endIndex=");
        sb.append(this.f280c);
        sb.append(", startLineIndex=");
        sb.append(this.f281d);
        sb.append(", endLineIndex=");
        sb.append(this.f282e);
        sb.append(", top=");
        sb.append(this.f283f);
        sb.append(", bottom=");
        return AbstractC0080b.j(sb, this.f284g, ')');
    }
}
