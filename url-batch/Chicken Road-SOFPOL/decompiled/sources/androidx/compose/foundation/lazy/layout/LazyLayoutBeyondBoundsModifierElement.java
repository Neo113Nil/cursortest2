package androidx.compose.foundation.lazy.layout;

import a0.l;
import a0.p;
import a0.q;
import q6.i;
import u.j0;
import w1.x0;
import z.e;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
final class LazyLayoutBeyondBoundsModifierElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final e f504a;

    /* renamed from: b, reason: collision with root package name */
    public final l f505b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f506c;

    public LazyLayoutBeyondBoundsModifierElement(e eVar, l lVar, j0 j0Var) {
        this.f504a = eVar;
        this.f505b = lVar;
        this.f506c = j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        return i.a(this.f504a, lazyLayoutBeyondBoundsModifierElement.f504a) && i.a(this.f505b, lazyLayoutBeyondBoundsModifierElement.f505b) && this.f506c == lazyLayoutBeyondBoundsModifierElement.f506c;
    }

    @Override // w1.x0
    public final y0.l f() {
        p pVar = new p();
        pVar.f128r = this.f504a;
        pVar.f129s = this.f505b;
        pVar.f130t = this.f506c;
        return pVar;
    }

    @Override // w1.x0
    public final void g(y0.l lVar) {
        p pVar = (p) lVar;
        pVar.f128r = this.f504a;
        pVar.f129s = this.f505b;
        pVar.f130t = this.f506c;
    }

    public final int hashCode() {
        return this.f506c.hashCode() + q.d((this.f505b.hashCode() + (this.f504a.hashCode() * 31)) * 31, 31, false);
    }
}
