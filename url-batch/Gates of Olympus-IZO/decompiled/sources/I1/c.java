package I1;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f2457a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2458b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2459c;

    /* renamed from: d, reason: collision with root package name */
    public final com.gates.olympus.miruv.data.f f2460d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2461e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2462f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2463g;

    public /* synthetic */ c(int i3, String str, String str2, com.gates.olympus.miruv.data.f fVar, boolean z3) {
        this(i3, str, str2, fVar, z3, false, false);
    }

    public static c a(c cVar, boolean z3, boolean z4, int i3) {
        if ((i3 & 32) != 0) {
            z3 = cVar.f2462f;
        }
        boolean z5 = z3;
        if ((i3 & 64) != 0) {
            z4 = cVar.f2463g;
        }
        String str = cVar.f2458b;
        Z1.i.f(str, "jointId");
        String str2 = cVar.f2459c;
        Z1.i.f(str2, "label");
        com.gates.olympus.miruv.data.f fVar = cVar.f2460d;
        Z1.i.f(fVar, "shape");
        return new c(cVar.f2457a, str, str2, fVar, cVar.f2461e, z5, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2457a == cVar.f2457a && Z1.i.a(this.f2458b, cVar.f2458b) && Z1.i.a(this.f2459c, cVar.f2459c) && this.f2460d == cVar.f2460d && this.f2461e == cVar.f2461e && this.f2462f == cVar.f2462f && this.f2463g == cVar.f2463g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2463g) + AbstractC0080b.f(AbstractC0080b.f((this.f2460d.hashCode() + AbstractC0080b.e(AbstractC0080b.e(Integer.hashCode(this.f2457a) * 31, 31, this.f2458b), 31, this.f2459c)) * 31, 31, this.f2461e), 31, this.f2462f);
    }

    public final String toString() {
        return "MatchCard(key=" + this.f2457a + ", jointId=" + this.f2458b + ", label=" + this.f2459c + ", shape=" + this.f2460d + ", isGlyph=" + this.f2461e + ", revealed=" + this.f2462f + ", matched=" + this.f2463g + ")";
    }

    public c(int i3, String str, String str2, com.gates.olympus.miruv.data.f fVar, boolean z3, boolean z4, boolean z5) {
        Z1.i.f(str, "jointId");
        Z1.i.f(str2, "label");
        Z1.i.f(fVar, "shape");
        this.f2457a = i3;
        this.f2458b = str;
        this.f2459c = str2;
        this.f2460d = fVar;
        this.f2461e = z3;
        this.f2462f = z4;
        this.f2463g = z5;
    }
}
