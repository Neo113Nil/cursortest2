package m2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final t2.c f6498a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6499b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6500c;

    public n(t2.c cVar, int i3, int i10) {
        this.f6498a = cVar;
        this.f6499b = i3;
        this.f6500c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f6498a.equals(nVar.f6498a) && this.f6499b == nVar.f6499b && this.f6500c == nVar.f6500c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6500c) + v4.a.x(this.f6499b, this.f6498a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.f6498a);
        sb2.append(", startIndex=");
        sb2.append(this.f6499b);
        sb2.append(", endIndex=");
        return v4.a.m(sb2, this.f6500c, ')');
    }
}
