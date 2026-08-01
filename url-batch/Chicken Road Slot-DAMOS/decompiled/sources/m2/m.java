package m2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final a f6492a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6493b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6494c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6495d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6496e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6497f;
    public final float g;

    public m(a aVar, int i3, int i10, int i11, int i12, float f3, float f10) {
        this.f6492a = aVar;
        this.f6493b = i3;
        this.f6494c = i10;
        this.f6495d = i11;
        this.f6496e = i12;
        this.f6497f = f3;
        this.g = f10;
    }

    public final int a(int i3) {
        int i10 = this.f6494c;
        int i11 = this.f6493b;
        return be.f.c(i3, i11, i10) - i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f6492a.equals(mVar.f6492a) && this.f6493b == mVar.f6493b && this.f6494c == mVar.f6494c && this.f6495d == mVar.f6495d && this.f6496e == mVar.f6496e && Float.compare(this.f6497f, mVar.f6497f) == 0 && Float.compare(this.g, mVar.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + n0.l.b(this.f6497f, v4.a.x(this.f6496e, v4.a.x(this.f6495d, v4.a.x(this.f6494c, v4.a.x(this.f6493b, this.f6492a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphInfo(paragraph=");
        sb2.append(this.f6492a);
        sb2.append(", startIndex=");
        sb2.append(this.f6493b);
        sb2.append(", endIndex=");
        sb2.append(this.f6494c);
        sb2.append(", startLineIndex=");
        sb2.append(this.f6495d);
        sb2.append(", endLineIndex=");
        sb2.append(this.f6496e);
        sb2.append(", top=");
        sb2.append(this.f6497f);
        sb2.append(", bottom=");
        return v4.a.l(sb2, this.g, ')');
    }
}
