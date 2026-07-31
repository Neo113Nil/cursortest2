package androidx.compose.foundation;

import A0.f;
import U.p;
import e2.InterfaceC0422a;
import f2.j;
import n.C0698y;
import n.Z;
import q.k;
import t0.U;

/* loaded from: classes.dex */
final class ClickableElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final k f4758a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f4759b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4760c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4761d;

    /* renamed from: e, reason: collision with root package name */
    public final f f4762e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0422a f4763f;

    public ClickableElement(k kVar, Z z3, boolean z4, String str, f fVar, InterfaceC0422a interfaceC0422a) {
        this.f4758a = kVar;
        this.f4759b = z3;
        this.f4760c = z4;
        this.f4761d = str;
        this.f4762e = fVar;
        this.f4763f = interfaceC0422a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return j.a(this.f4758a, clickableElement.f4758a) && j.a(this.f4759b, clickableElement.f4759b) && this.f4760c == clickableElement.f4760c && j.a(this.f4761d, clickableElement.f4761d) && j.a(this.f4762e, clickableElement.f4762e) && this.f4763f == clickableElement.f4763f;
    }

    public final int hashCode() {
        k kVar = this.f4758a;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        Z z3 = this.f4759b;
        int e3 = A.k.e((hashCode + (z3 != null ? z3.hashCode() : 0)) * 31, 31, this.f4760c);
        String str = this.f4761d;
        int hashCode2 = (e3 + (str != null ? str.hashCode() : 0)) * 31;
        f fVar = this.f4762e;
        return this.f4763f.hashCode() + ((hashCode2 + (fVar != null ? Integer.hashCode(fVar.f98a) : 0)) * 31);
    }

    @Override // t0.U
    public final p l() {
        return new C0698y(this.f4758a, this.f4759b, this.f4760c, this.f4761d, this.f4762e, this.f4763f);
    }

    @Override // t0.U
    public final void m(p pVar) {
        ((C0698y) pVar).E0(this.f4758a, this.f4759b, this.f4760c, this.f4761d, this.f4762e, this.f4763f);
    }
}
