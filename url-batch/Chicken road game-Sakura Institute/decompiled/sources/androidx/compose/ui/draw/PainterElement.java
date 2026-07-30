package androidx.compose.ui.draw;

import e1.b;
import p1.i0;
import r1.s0;
import r6.k;
import s0.c;
import s0.n;
import w0.h;
import y0.f;
import z0.m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class PainterElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f698a;

    /* renamed from: b, reason: collision with root package name */
    public final c f699b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f700c;

    /* renamed from: d, reason: collision with root package name */
    public final float f701d;

    /* renamed from: e, reason: collision with root package name */
    public final m f702e;

    public PainterElement(b bVar, c cVar, i0 i0Var, float f9, m mVar) {
        this.f698a = bVar;
        this.f699b = cVar;
        this.f700c = i0Var;
        this.f701d = f9;
        this.f702e = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return k.a(this.f698a, painterElement.f698a) && k.a(this.f699b, painterElement.f699b) && this.f700c.equals(painterElement.f700c) && Float.compare(this.f701d, painterElement.f701d) == 0 && k.a(this.f702e, painterElement.f702e);
    }

    public final int hashCode() {
        int a3 = a0.m.a(this.f701d, (this.f700c.hashCode() + ((this.f699b.hashCode() + a0.m.e(this.f698a.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        m mVar = this.f702e;
        return a3 + (mVar == null ? 0 : mVar.hashCode());
    }

    @Override // r1.s0
    public final n l() {
        h hVar = new h();
        hVar.f9483s = this.f698a;
        hVar.f9484t = true;
        hVar.f9485u = this.f699b;
        hVar.f9486v = this.f700c;
        hVar.f9487w = this.f701d;
        hVar.f9488x = this.f702e;
        return hVar;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        h hVar = (h) nVar;
        boolean z8 = hVar.f9484t;
        b bVar = this.f698a;
        boolean z9 = (z8 && f.a(hVar.f9483s.d(), bVar.d())) ? false : true;
        hVar.f9483s = bVar;
        hVar.f9484t = true;
        hVar.f9485u = this.f699b;
        hVar.f9486v = this.f700c;
        hVar.f9487w = this.f701d;
        hVar.f9488x = this.f702e;
        if (z9) {
            r1.f.n(hVar);
        }
        r1.f.m(hVar);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f698a + ", sizeToIntrinsics=true, alignment=" + this.f699b + ", contentScale=" + this.f700c + ", alpha=" + this.f701d + ", colorFilter=" + this.f702e + ')';
    }
}
