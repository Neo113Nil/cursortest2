package androidx.compose.foundation;

import t.h0;
import t.i0;
import v.i;
import w1.k;
import w1.x0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
final class IndicationModifierElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final i f470a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f471b;

    public IndicationModifierElement(i iVar, i0 i0Var) {
        this.f470a = iVar;
        this.f471b = i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return q6.i.a(this.f470a, indicationModifierElement.f470a) && q6.i.a(this.f471b, indicationModifierElement.f471b);
    }

    @Override // w1.x0
    public final l f() {
        k a8 = this.f471b.a(this.f470a);
        h0 h0Var = new h0();
        h0Var.f6783t = a8;
        h0Var.r0(a8);
        return h0Var;
    }

    @Override // w1.x0
    public final void g(l lVar) {
        h0 h0Var = (h0) lVar;
        k a8 = this.f471b.a(this.f470a);
        h0Var.s0(h0Var.f6783t);
        h0Var.f6783t = a8;
        h0Var.r0(a8);
    }

    public final int hashCode() {
        return this.f471b.hashCode() + (this.f470a.hashCode() * 31);
    }
}
