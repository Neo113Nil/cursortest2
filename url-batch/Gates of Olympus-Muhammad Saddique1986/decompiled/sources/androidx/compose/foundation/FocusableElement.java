package androidx.compose.foundation;

import U.p;
import f2.j;
import n.C0669L;
import q.k;
import t0.U;

/* loaded from: classes.dex */
final class FocusableElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final k f4764a;

    public FocusableElement(k kVar) {
        this.f4764a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return j.a(this.f4764a, ((FocusableElement) obj).f4764a);
        }
        return false;
    }

    public final int hashCode() {
        k kVar = this.f4764a;
        if (kVar != null) {
            return kVar.hashCode();
        }
        return 0;
    }

    @Override // t0.U
    public final p l() {
        return new C0669L(this.f4764a);
    }

    @Override // t0.U
    public final void m(p pVar) {
        ((C0669L) pVar).B0(this.f4764a);
    }
}
