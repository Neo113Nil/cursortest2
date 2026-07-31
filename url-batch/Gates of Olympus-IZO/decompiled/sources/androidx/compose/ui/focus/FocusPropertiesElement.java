package androidx.compose.ui.focus;

import Z.h;
import Z.k;
import Z.m;
import Z1.i;
import t0.T;

/* loaded from: classes.dex */
final class FocusPropertiesElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final k f3704a;

    public FocusPropertiesElement(k kVar) {
        this.f3704a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && i.a(this.f3704a, ((FocusPropertiesElement) obj).f3704a);
    }

    @Override // t0.T
    public final U.k h() {
        m mVar = new m();
        mVar.f3442q = this.f3704a;
        return mVar;
    }

    public final int hashCode() {
        return h.f3426f.hashCode();
    }

    @Override // t0.T
    public final void i(U.k kVar) {
        ((m) kVar).f3442q = this.f3704a;
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.f3704a + ')';
    }
}
