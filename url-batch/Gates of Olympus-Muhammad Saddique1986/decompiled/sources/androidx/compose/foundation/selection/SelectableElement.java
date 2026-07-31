package androidx.compose.foundation.selection;

import A0.f;
import U.p;
import e2.InterfaceC0422a;
import f2.j;
import m.AbstractC0625j;
import q.k;
import t0.AbstractC0993f;
import t0.U;
import v.C1158b;

/* loaded from: classes.dex */
final class SelectableElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4853a;

    /* renamed from: b, reason: collision with root package name */
    public final k f4854b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4855c;

    /* renamed from: d, reason: collision with root package name */
    public final f f4856d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0422a f4857e;

    public SelectableElement(boolean z3, k kVar, boolean z4, f fVar, InterfaceC0422a interfaceC0422a) {
        this.f4853a = z3;
        this.f4854b = kVar;
        this.f4855c = z4;
        this.f4856d = fVar;
        this.f4857e = interfaceC0422a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.f4853a == selectableElement.f4853a && j.a(this.f4854b, selectableElement.f4854b) && j.a(null, null) && this.f4855c == selectableElement.f4855c && this.f4856d.equals(selectableElement.f4856d) && this.f4857e == selectableElement.f4857e;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f4853a) * 31;
        k kVar = this.f4854b;
        return this.f4857e.hashCode() + AbstractC0625j.a(this.f4856d.f98a, A.k.e((hashCode + (kVar != null ? kVar.hashCode() : 0)) * 961, 31, this.f4855c), 31);
    }

    @Override // t0.U
    public final p l() {
        f fVar = this.f4856d;
        C1158b c1158b = new C1158b(this.f4854b, null, this.f4855c, null, fVar, this.f4857e);
        c1158b.f9742K = this.f4853a;
        return c1158b;
    }

    @Override // t0.U
    public final void m(p pVar) {
        C1158b c1158b = (C1158b) pVar;
        boolean z3 = c1158b.f9742K;
        boolean z4 = this.f4853a;
        if (z3 != z4) {
            c1158b.f9742K = z4;
            AbstractC0993f.o(c1158b);
        }
        f fVar = this.f4856d;
        c1158b.E0(this.f4854b, null, this.f4855c, null, fVar, this.f4857e);
    }
}
