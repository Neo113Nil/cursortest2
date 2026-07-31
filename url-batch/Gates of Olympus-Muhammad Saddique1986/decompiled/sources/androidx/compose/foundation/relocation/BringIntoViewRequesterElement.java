package androidx.compose.foundation.relocation;

import U.p;
import f2.j;
import t0.U;
import u.C1076c;
import u.C1077d;

/* loaded from: classes.dex */
final class BringIntoViewRequesterElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final C1076c f4852a;

    public BringIntoViewRequesterElement(C1076c c1076c) {
        this.f4852a = c1076c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BringIntoViewRequesterElement) {
                if (j.a(this.f4852a, ((BringIntoViewRequesterElement) obj).f4852a)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f4852a.hashCode();
    }

    @Override // t0.U
    public final p l() {
        C1077d c1077d = new C1077d();
        c1077d.f9095q = this.f4852a;
        return c1077d;
    }

    @Override // t0.U
    public final void m(p pVar) {
        C1077d c1077d = (C1077d) pVar;
        C1076c c1076c = c1077d.f9095q;
        if (c1076c != null) {
            c1076c.f9094a.n(c1077d);
        }
        C1076c c1076c2 = this.f4852a;
        if (c1076c2 != null) {
            c1076c2.f9094a.b(c1077d);
        }
        c1077d.f9095q = c1076c2;
    }
}
