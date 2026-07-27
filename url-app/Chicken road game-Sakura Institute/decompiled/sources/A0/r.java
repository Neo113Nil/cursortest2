package A0;

import A.AbstractC0017m;
import l.AbstractC0784j;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final C0031b f366a;

    /* renamed from: b, reason: collision with root package name */
    public final int f367b;

    /* renamed from: c, reason: collision with root package name */
    public final int f368c;

    /* renamed from: d, reason: collision with root package name */
    public final int f369d;

    /* renamed from: e, reason: collision with root package name */
    public final int f370e;

    /* renamed from: f, reason: collision with root package name */
    public final float f371f;

    /* renamed from: g, reason: collision with root package name */
    public final float f372g;

    public r(C0031b c0031b, int i2, int i4, int i5, int i6, float f4, float f5) {
        this.f366a = c0031b;
        this.f367b = i2;
        this.f368c = i4;
        this.f369d = i5;
        this.f370e = i6;
        this.f371f = f4;
        this.f372g = f5;
    }

    public final long a(long j4, boolean z4) {
        if (z4) {
            int i2 = K.f300c;
            long j5 = K.f299b;
            if (K.a(j4, j5)) {
                return j5;
            }
        }
        int i4 = K.f300c;
        int i5 = (int) (j4 >> 32);
        int i6 = this.f367b;
        return M1.a.j(i5 + i6, ((int) (j4 & 4294967295L)) + i6);
    }

    public final int b(int i2) {
        int i4 = this.f368c;
        int i5 = this.f367b;
        return kotlin.ranges.b.e(i2, i5, i4) - i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f366a.equals(rVar.f366a) && this.f367b == rVar.f367b && this.f368c == rVar.f368c && this.f369d == rVar.f369d && this.f370e == rVar.f370e && Float.compare(this.f371f, rVar.f371f) == 0 && Float.compare(this.f372g, rVar.f372g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f372g) + AbstractC0017m.a(this.f371f, AbstractC0784j.c(this.f370e, AbstractC0784j.c(this.f369d, AbstractC0784j.c(this.f368c, AbstractC0784j.c(this.f367b, this.f366a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f366a);
        sb.append(", startIndex=");
        sb.append(this.f367b);
        sb.append(", endIndex=");
        sb.append(this.f368c);
        sb.append(", startLineIndex=");
        sb.append(this.f369d);
        sb.append(", endLineIndex=");
        sb.append(this.f370e);
        sb.append(", top=");
        sb.append(this.f371f);
        sb.append(", bottom=");
        return AbstractC0017m.k(sb, this.f372g, ')');
    }
}
