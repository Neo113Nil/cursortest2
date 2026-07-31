package androidx.compose.ui.input.key;

import U.k;
import Z1.i;
import l0.C0574d;
import t0.T;
import u0.C0992q;

/* loaded from: classes.dex */
final class KeyInputElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final C0992q f3729a;

    public KeyInputElement(C0992q c0992q) {
        this.f3729a = c0992q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyInputElement) {
            return this.f3729a.equals(((KeyInputElement) obj).f3729a) && i.a(null, null);
        }
        return false;
    }

    @Override // t0.T
    public final k h() {
        C0574d c0574d = new C0574d();
        c0574d.f5542q = this.f3729a;
        return c0574d;
    }

    public final int hashCode() {
        return this.f3729a.hashCode() * 31;
    }

    @Override // t0.T
    public final void i(k kVar) {
        ((C0574d) kVar).f5542q = this.f3729a;
    }

    public final String toString() {
        return "KeyInputElement(onKeyEvent=" + this.f3729a + ", onPreKeyEvent=null)";
    }
}
