package androidx.compose.ui.layout;

import U.k;
import Y1.f;
import Z1.i;
import r0.C0841n;
import t0.T;

/* loaded from: classes.dex */
final class LayoutElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final f f3734a;

    public LayoutElement(f fVar) {
        this.f3734a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && i.a(this.f3734a, ((LayoutElement) obj).f3734a);
    }

    @Override // t0.T
    public final k h() {
        C0841n c0841n = new C0841n();
        c0841n.f7150q = this.f3734a;
        return c0841n;
    }

    public final int hashCode() {
        return this.f3734a.hashCode();
    }

    @Override // t0.T
    public final void i(k kVar) {
        ((C0841n) kVar).f7150q = this.f3734a;
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.f3734a + ')';
    }
}
