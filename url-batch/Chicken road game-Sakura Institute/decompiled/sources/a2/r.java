package a2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final b f440a;

    /* renamed from: b, reason: collision with root package name */
    public final int f441b;

    /* renamed from: c, reason: collision with root package name */
    public final int f442c;

    /* renamed from: d, reason: collision with root package name */
    public final int f443d;

    /* renamed from: e, reason: collision with root package name */
    public final int f444e;

    /* renamed from: f, reason: collision with root package name */
    public final float f445f;

    /* renamed from: g, reason: collision with root package name */
    public final float f446g;

    public r(b bVar, int i7, int i8, int i9, int i10, float f9, float f10) {
        this.f440a = bVar;
        this.f441b = i7;
        this.f442c = i8;
        this.f443d = i9;
        this.f444e = i10;
        this.f445f = f9;
        this.f446g = f10;
    }

    public final long a(long j8, boolean z8) {
        if (z8) {
            long j9 = j0.f406b;
            if (j0.a(j8, j9)) {
                return j9;
            }
        }
        int i7 = j0.f407c;
        int i8 = (int) (j8 >> 32);
        int i9 = this.f441b;
        return r4.a.h(i8 + i9, ((int) (j8 & 4294967295L)) + i9);
    }

    public final int b(int i7) {
        int i8 = this.f442c;
        int i9 = this.f441b;
        return v1.g.e(i7, i9, i8) - i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f440a.equals(rVar.f440a) && this.f441b == rVar.f441b && this.f442c == rVar.f442c && this.f443d == rVar.f443d && this.f444e == rVar.f444e && Float.compare(this.f445f, rVar.f445f) == 0 && Float.compare(this.f446g, rVar.f446g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f446g) + a0.m.a(this.f445f, l.h.c(this.f444e, l.h.c(this.f443d, l.h.c(this.f442c, l.h.c(this.f441b, this.f440a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f440a);
        sb.append(", startIndex=");
        sb.append(this.f441b);
        sb.append(", endIndex=");
        sb.append(this.f442c);
        sb.append(", startLineIndex=");
        sb.append(this.f443d);
        sb.append(", endLineIndex=");
        sb.append(this.f444e);
        sb.append(", top=");
        sb.append(this.f445f);
        sb.append(", bottom=");
        return a0.m.k(sb, this.f446g, ')');
    }
}
