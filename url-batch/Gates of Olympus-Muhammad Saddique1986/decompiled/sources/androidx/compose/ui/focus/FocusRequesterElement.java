package androidx.compose.ui.focus;

import Z.p;
import Z.r;
import f2.j;
import t0.U;

/* loaded from: classes.dex */
final class FocusRequesterElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final p f4898a;

    public FocusRequesterElement(p pVar) {
        this.f4898a = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && j.a(this.f4898a, ((FocusRequesterElement) obj).f4898a);
    }

    public final int hashCode() {
        return this.f4898a.hashCode();
    }

    @Override // t0.U
    public final U.p l() {
        r rVar = new r();
        rVar.f4701q = this.f4898a;
        return rVar;
    }

    @Override // t0.U
    public final void m(U.p pVar) {
        r rVar = (r) pVar;
        rVar.f4701q.f4700a.n(rVar);
        p pVar2 = this.f4898a;
        rVar.f4701q = pVar2;
        pVar2.f4700a.b(rVar);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f4898a + ')';
    }
}
