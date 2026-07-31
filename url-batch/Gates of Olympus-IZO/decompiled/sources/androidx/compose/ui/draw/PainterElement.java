package androidx.compose.ui.draw;

import H2.AbstractC0080b;
import U.d;
import U.k;
import Y.h;
import Z1.i;
import a0.f;
import b0.C0281n;
import g0.AbstractC0393b;
import r0.D;
import t0.AbstractC0898f;
import t0.T;

/* loaded from: classes.dex */
final class PainterElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0393b f3697a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3698b;

    /* renamed from: c, reason: collision with root package name */
    public final d f3699c;

    /* renamed from: d, reason: collision with root package name */
    public final D f3700d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3701e;

    /* renamed from: f, reason: collision with root package name */
    public final C0281n f3702f;

    public PainterElement(AbstractC0393b abstractC0393b, boolean z3, d dVar, D d3, float f3, C0281n c0281n) {
        this.f3697a = abstractC0393b;
        this.f3698b = z3;
        this.f3699c = dVar;
        this.f3700d = d3;
        this.f3701e = f3;
        this.f3702f = c0281n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return i.a(this.f3697a, painterElement.f3697a) && this.f3698b == painterElement.f3698b && i.a(this.f3699c, painterElement.f3699c) && i.a(this.f3700d, painterElement.f3700d) && Float.compare(this.f3701e, painterElement.f3701e) == 0 && i.a(this.f3702f, painterElement.f3702f);
    }

    @Override // t0.T
    public final k h() {
        h hVar = new h();
        hVar.f3402q = this.f3697a;
        hVar.f3403r = this.f3698b;
        hVar.f3404s = this.f3699c;
        hVar.f3405t = this.f3700d;
        hVar.f3406u = this.f3701e;
        hVar.f3407v = this.f3702f;
        return hVar;
    }

    public final int hashCode() {
        int a3 = AbstractC0080b.a(this.f3701e, (this.f3700d.hashCode() + ((this.f3699c.hashCode() + AbstractC0080b.f(this.f3697a.hashCode() * 31, 31, this.f3698b)) * 31)) * 31, 31);
        C0281n c0281n = this.f3702f;
        return a3 + (c0281n == null ? 0 : c0281n.hashCode());
    }

    @Override // t0.T
    public final void i(k kVar) {
        h hVar = (h) kVar;
        boolean z3 = hVar.f3403r;
        AbstractC0393b abstractC0393b = this.f3697a;
        boolean z4 = this.f3698b;
        boolean z5 = z3 != z4 || (z4 && !f.a(hVar.f3402q.d(), abstractC0393b.d()));
        hVar.f3402q = abstractC0393b;
        hVar.f3403r = z4;
        hVar.f3404s = this.f3699c;
        hVar.f3405t = this.f3700d;
        hVar.f3406u = this.f3701e;
        hVar.f3407v = this.f3702f;
        if (z5) {
            AbstractC0898f.n(hVar);
        }
        AbstractC0898f.m(hVar);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f3697a + ", sizeToIntrinsics=" + this.f3698b + ", alignment=" + this.f3699c + ", contentScale=" + this.f3700d + ", alpha=" + this.f3701e + ", colorFilter=" + this.f3702f + ')';
    }
}
