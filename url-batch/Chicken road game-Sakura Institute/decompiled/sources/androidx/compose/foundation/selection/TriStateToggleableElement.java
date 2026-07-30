package androidx.compose.foundation.selection;

import a0.m;
import l.h;
import m.l0;
import p.j;
import r1.s0;
import r6.k;
import s0.n;
import u.c;
import y1.f;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class TriStateToggleableElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final z1.a f670a;

    /* renamed from: b, reason: collision with root package name */
    public final j f671b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f672c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f673d;

    /* renamed from: e, reason: collision with root package name */
    public final f f674e;

    /* renamed from: f, reason: collision with root package name */
    public final q6.a f675f;

    public TriStateToggleableElement(z1.a aVar, j jVar, l0 l0Var, boolean z8, f fVar, q6.a aVar2) {
        this.f670a = aVar;
        this.f671b = jVar;
        this.f672c = l0Var;
        this.f673d = z8;
        this.f674e = fVar;
        this.f675f = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TriStateToggleableElement.class != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        return this.f670a == triStateToggleableElement.f670a && k.a(this.f671b, triStateToggleableElement.f671b) && k.a(this.f672c, triStateToggleableElement.f672c) && this.f673d == triStateToggleableElement.f673d && this.f674e.equals(triStateToggleableElement.f674e) && this.f675f == triStateToggleableElement.f675f;
    }

    public final int hashCode() {
        int hashCode = this.f670a.hashCode() * 31;
        j jVar = this.f671b;
        int hashCode2 = (hashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        l0 l0Var = this.f672c;
        return this.f675f.hashCode() + h.c(this.f674e.f9803a, m.e((hashCode2 + (l0Var != null ? l0Var.hashCode() : 0)) * 31, 31, this.f673d), 31);
    }

    @Override // r1.s0
    public final n l() {
        c cVar = new c(this.f671b, this.f672c, this.f673d, null, this.f674e, this.f675f);
        cVar.M = this.f670a;
        return cVar;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        c cVar = (c) nVar;
        z1.a aVar = cVar.M;
        z1.a aVar2 = this.f670a;
        if (aVar != aVar2) {
            cVar.M = aVar2;
            r1.f.o(cVar);
        }
        cVar.G0(this.f671b, this.f672c, this.f673d, null, this.f674e, this.f675f);
    }
}
