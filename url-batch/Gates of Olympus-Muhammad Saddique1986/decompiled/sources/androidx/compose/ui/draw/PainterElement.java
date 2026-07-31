package androidx.compose.ui.draw;

import A.k;
import U.d;
import U.p;
import Y.h;
import a0.C0241f;
import b0.C0344m;
import f2.j;
import g0.AbstractC0437b;
import r0.C0888J;
import t0.AbstractC0993f;
import t0.U;

/* loaded from: classes.dex */
final class PainterElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0437b f4885a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4886b;

    /* renamed from: c, reason: collision with root package name */
    public final d f4887c;

    /* renamed from: d, reason: collision with root package name */
    public final C0888J f4888d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4889e;

    /* renamed from: f, reason: collision with root package name */
    public final C0344m f4890f;

    public PainterElement(AbstractC0437b abstractC0437b, boolean z3, d dVar, C0888J c0888j, float f3, C0344m c0344m) {
        this.f4885a = abstractC0437b;
        this.f4886b = z3;
        this.f4887c = dVar;
        this.f4888d = c0888j;
        this.f4889e = f3;
        this.f4890f = c0344m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return j.a(this.f4885a, painterElement.f4885a) && this.f4886b == painterElement.f4886b && j.a(this.f4887c, painterElement.f4887c) && j.a(this.f4888d, painterElement.f4888d) && Float.compare(this.f4889e, painterElement.f4889e) == 0 && j.a(this.f4890f, painterElement.f4890f);
    }

    public final int hashCode() {
        int a3 = k.a(this.f4889e, (this.f4888d.hashCode() + ((this.f4887c.hashCode() + k.e(this.f4885a.hashCode() * 31, 31, this.f4886b)) * 31)) * 31, 31);
        C0344m c0344m = this.f4890f;
        return a3 + (c0344m == null ? 0 : c0344m.hashCode());
    }

    @Override // t0.U
    public final p l() {
        h hVar = new h();
        hVar.f4657q = this.f4885a;
        hVar.f4658r = this.f4886b;
        hVar.f4659s = this.f4887c;
        hVar.f4660t = this.f4888d;
        hVar.f4661u = this.f4889e;
        hVar.f4662v = this.f4890f;
        return hVar;
    }

    @Override // t0.U
    public final void m(p pVar) {
        h hVar = (h) pVar;
        boolean z3 = hVar.f4658r;
        AbstractC0437b abstractC0437b = this.f4885a;
        boolean z4 = this.f4886b;
        boolean z5 = z3 != z4 || (z4 && !C0241f.a(hVar.f4657q.d(), abstractC0437b.d()));
        hVar.f4657q = abstractC0437b;
        hVar.f4658r = z4;
        hVar.f4659s = this.f4887c;
        hVar.f4660t = this.f4888d;
        hVar.f4661u = this.f4889e;
        hVar.f4662v = this.f4890f;
        if (z5) {
            AbstractC0993f.n(hVar);
        }
        AbstractC0993f.m(hVar);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f4885a + ", sizeToIntrinsics=" + this.f4886b + ", alignment=" + this.f4887c + ", contentScale=" + this.f4888d + ", alpha=" + this.f4889e + ", colorFilter=" + this.f4890f + ')';
    }
}
