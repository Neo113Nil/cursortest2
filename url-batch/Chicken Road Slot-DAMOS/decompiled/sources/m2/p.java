package m2;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f6501a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6502b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6503c;

    /* renamed from: d, reason: collision with root package name */
    public final w2.q f6504d;

    /* renamed from: e, reason: collision with root package name */
    public final r f6505e;

    /* renamed from: f, reason: collision with root package name */
    public final w2.i f6506f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6507h;

    /* renamed from: i, reason: collision with root package name */
    public final w2.s f6508i;

    public p(int i3, int i10, long j, w2.q qVar, r rVar, w2.i iVar, int i11, int i12, w2.s sVar) {
        this.f6501a = i3;
        this.f6502b = i10;
        this.f6503c = j;
        this.f6504d = qVar;
        this.f6505e = rVar;
        this.f6506f = iVar;
        this.g = i11;
        this.f6507h = i12;
        this.f6508i = sVar;
        if (x2.n.a(j, x2.n.f10335c) || x2.n.c(j) >= 0.0f) {
            return;
        }
        r2.a.b("lineHeight can't be negative (" + x2.n.c(j) + ')');
    }

    public final p a(p pVar) {
        return pVar == null ? this : q.a(this, pVar.f6501a, pVar.f6502b, pVar.f6503c, pVar.f6504d, pVar.f6505e, pVar.f6506f, pVar.g, pVar.f6507h, pVar.f6508i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f6501a == pVar.f6501a && this.f6502b == pVar.f6502b && x2.n.a(this.f6503c, pVar.f6503c) && Intrinsics.a(this.f6504d, pVar.f6504d) && Intrinsics.a(this.f6505e, pVar.f6505e) && Intrinsics.a(this.f6506f, pVar.f6506f) && this.g == pVar.g && this.f6507h == pVar.f6507h && Intrinsics.a(this.f6508i, pVar.f6508i);
    }

    public final int hashCode() {
        int x10 = v4.a.x(this.f6502b, Integer.hashCode(this.f6501a) * 31, 31);
        x2.o[] oVarArr = x2.n.f10334b;
        int c10 = n0.l.c(x10, 31, this.f6503c);
        w2.q qVar = this.f6504d;
        int hashCode = (c10 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        r rVar = this.f6505e;
        int hashCode2 = (hashCode + (rVar != null ? rVar.hashCode() : 0)) * 31;
        w2.i iVar = this.f6506f;
        int x11 = v4.a.x(this.f6507h, v4.a.x(this.g, (hashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31, 31), 31);
        w2.s sVar = this.f6508i;
        return x11 + (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) w2.k.a(this.f6501a)) + ", textDirection=" + ((Object) w2.m.a(this.f6502b)) + ", lineHeight=" + ((Object) x2.n.d(this.f6503c)) + ", textIndent=" + this.f6504d + ", platformStyle=" + this.f6505e + ", lineHeightStyle=" + this.f6506f + ", lineBreak=" + ((Object) w2.e.a(this.g)) + ", hyphens=" + ((Object) w2.d.a(this.f6507h)) + ", textMotion=" + this.f6508i + ')';
    }
}
