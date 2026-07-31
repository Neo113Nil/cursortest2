package androidx.compose.foundation;

import A.k;
import U.p;
import b0.AbstractC0347p;
import b0.C0352v;
import b0.Q;
import f2.j;
import n.C0689o;
import t0.U;

/* loaded from: classes.dex */
final class BackgroundElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final long f4751a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0347p f4752b = null;

    /* renamed from: c, reason: collision with root package name */
    public final float f4753c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public final Q f4754d;

    public BackgroundElement(long j3, Q q3) {
        this.f4751a = j3;
        this.f4754d = q3;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && C0352v.c(this.f4751a, backgroundElement.f4751a) && j.a(this.f4752b, backgroundElement.f4752b) && this.f4753c == backgroundElement.f4753c && j.a(this.f4754d, backgroundElement.f4754d);
    }

    public final int hashCode() {
        int i3 = C0352v.f5440h;
        int hashCode = Long.hashCode(this.f4751a) * 31;
        AbstractC0347p abstractC0347p = this.f4752b;
        return this.f4754d.hashCode() + k.a(this.f4753c, (hashCode + (abstractC0347p != null ? abstractC0347p.hashCode() : 0)) * 31, 31);
    }

    @Override // t0.U
    public final p l() {
        C0689o c0689o = new C0689o();
        c0689o.f7173q = this.f4751a;
        c0689o.f7174r = this.f4752b;
        c0689o.f7175s = this.f4753c;
        c0689o.f7176t = this.f4754d;
        c0689o.f7177u = 9205357640488583168L;
        return c0689o;
    }

    @Override // t0.U
    public final void m(p pVar) {
        C0689o c0689o = (C0689o) pVar;
        c0689o.f7173q = this.f4751a;
        c0689o.f7174r = this.f4752b;
        c0689o.f7175s = this.f4753c;
        c0689o.f7176t = this.f4754d;
    }
}
