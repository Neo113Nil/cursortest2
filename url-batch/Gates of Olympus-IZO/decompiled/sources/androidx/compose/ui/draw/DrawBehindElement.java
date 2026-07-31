package androidx.compose.ui.draw;

import U.k;
import Y.d;
import Y1.c;
import Z1.i;
import t0.T;

/* loaded from: classes.dex */
final class DrawBehindElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final c f3696a;

    public DrawBehindElement(c cVar) {
        this.f3696a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && i.a(this.f3696a, ((DrawBehindElement) obj).f3696a);
    }

    @Override // t0.T
    public final k h() {
        d dVar = new d();
        dVar.f3397q = this.f3696a;
        return dVar;
    }

    public final int hashCode() {
        return this.f3696a.hashCode();
    }

    @Override // t0.T
    public final void i(k kVar) {
        ((d) kVar).f3397q = this.f3696a;
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.f3696a + ')';
    }
}
