package C0;

import m.AbstractC0625j;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final C0026b f634a;

    /* renamed from: b, reason: collision with root package name */
    public final int f635b;

    /* renamed from: c, reason: collision with root package name */
    public final int f636c;

    /* renamed from: d, reason: collision with root package name */
    public final int f637d;

    /* renamed from: e, reason: collision with root package name */
    public final int f638e;

    /* renamed from: f, reason: collision with root package name */
    public final float f639f;

    /* renamed from: g, reason: collision with root package name */
    public final float f640g;

    public r(C0026b c0026b, int i3, int i4, int i5, int i6, float f3, float f4) {
        this.f634a = c0026b;
        this.f635b = i3;
        this.f636c = i4;
        this.f637d = i5;
        this.f638e = i6;
        this.f639f = f3;
        this.f640g = f4;
    }

    public final long a(long j3, boolean z3) {
        if (z3) {
            int i3 = J.f568c;
            long j4 = J.f567b;
            if (J.a(j3, j4)) {
                return j4;
            }
        }
        int i4 = J.f568c;
        int i5 = (int) (j3 >> 32);
        int i6 = this.f635b;
        return O2.l.J(i5 + i6, ((int) (j3 & 4294967295L)) + i6);
    }

    public final int b(int i3) {
        int i4 = this.f636c;
        int i5 = this.f635b;
        return O2.d.y(i3, i5, i4) - i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f634a.equals(rVar.f634a) && this.f635b == rVar.f635b && this.f636c == rVar.f636c && this.f637d == rVar.f637d && this.f638e == rVar.f638e && Float.compare(this.f639f, rVar.f639f) == 0 && Float.compare(this.f640g, rVar.f640g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f640g) + A.k.a(this.f639f, AbstractC0625j.a(this.f638e, AbstractC0625j.a(this.f637d, AbstractC0625j.a(this.f636c, AbstractC0625j.a(this.f635b, this.f634a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f634a);
        sb.append(", startIndex=");
        sb.append(this.f635b);
        sb.append(", endIndex=");
        sb.append(this.f636c);
        sb.append(", startLineIndex=");
        sb.append(this.f637d);
        sb.append(", endLineIndex=");
        sb.append(this.f638e);
        sb.append(", top=");
        sb.append(this.f639f);
        sb.append(", bottom=");
        return A.k.i(sb, this.f640g, ')');
    }
}
