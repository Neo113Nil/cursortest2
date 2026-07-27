package A0;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f376a;

    /* renamed from: b, reason: collision with root package name */
    public final int f377b;

    /* renamed from: c, reason: collision with root package name */
    public final long f378c;

    /* renamed from: d, reason: collision with root package name */
    public final L0.p f379d;

    /* renamed from: e, reason: collision with root package name */
    public final w f380e;

    /* renamed from: f, reason: collision with root package name */
    public final L0.g f381f;

    /* renamed from: g, reason: collision with root package name */
    public final int f382g;

    /* renamed from: h, reason: collision with root package name */
    public final int f383h;

    /* renamed from: i, reason: collision with root package name */
    public final L0.q f384i;

    public u(int i2, int i4, long j4, L0.p pVar, w wVar, L0.g gVar, int i5, int i6, L0.q qVar) {
        this.f376a = i2;
        this.f377b = i4;
        this.f378c = j4;
        this.f379d = pVar;
        this.f380e = wVar;
        this.f381f = gVar;
        this.f382g = i5;
        this.f383h = i6;
        this.f384i = qVar;
        if (M0.m.a(j4, M0.m.f3560c) || M0.m.c(j4) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + M0.m.c(j4) + ')').toString());
    }

    public final u a(u uVar) {
        if (uVar == null) {
            return this;
        }
        return v.a(this, uVar.f376a, uVar.f377b, uVar.f378c, uVar.f379d, uVar.f380e, uVar.f381f, uVar.f382g, uVar.f383h, uVar.f384i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return L0.i.a(this.f376a, uVar.f376a) && L0.k.a(this.f377b, uVar.f377b) && M0.m.a(this.f378c, uVar.f378c) && Intrinsics.a(this.f379d, uVar.f379d) && Intrinsics.a(this.f380e, uVar.f380e) && Intrinsics.a(this.f381f, uVar.f381f) && this.f382g == uVar.f382g && L0.d.a(this.f383h, uVar.f383h) && Intrinsics.a(this.f384i, uVar.f384i);
    }

    public final int hashCode() {
        int c4 = AbstractC0784j.c(this.f377b, Integer.hashCode(this.f376a) * 31, 31);
        M0.n[] nVarArr = M0.m.f3559b;
        int c5 = AbstractC0017m.c(c4, 31, this.f378c);
        L0.p pVar = this.f379d;
        int hashCode = (c5 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        w wVar = this.f380e;
        int hashCode2 = (hashCode + (wVar != null ? wVar.hashCode() : 0)) * 31;
        L0.g gVar = this.f381f;
        int c6 = AbstractC0784j.c(this.f383h, AbstractC0784j.c(this.f382g, (hashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31, 31), 31);
        L0.q qVar = this.f384i;
        return c6 + (qVar != null ? qVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) L0.i.b(this.f376a)) + ", textDirection=" + ((Object) L0.k.b(this.f377b)) + ", lineHeight=" + ((Object) M0.m.d(this.f378c)) + ", textIndent=" + this.f379d + ", platformStyle=" + this.f380e + ", lineHeightStyle=" + this.f381f + ", lineBreak=" + ((Object) L0.e.a(this.f382g)) + ", hyphens=" + ((Object) L0.d.b(this.f383h)) + ", textMotion=" + this.f384i + ')';
    }
}
