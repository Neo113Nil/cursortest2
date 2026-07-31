package androidx.compose.ui.graphics;

import U.k;
import Y1.c;
import Z1.i;
import b0.C0283p;
import t0.AbstractC0898f;
import t0.T;
import t0.a0;

/* loaded from: classes.dex */
final class BlockGraphicsLayerElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final c f3713a;

    public BlockGraphicsLayerElement(c cVar) {
        this.f3713a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && i.a(this.f3713a, ((BlockGraphicsLayerElement) obj).f3713a);
    }

    @Override // t0.T
    public final k h() {
        C0283p c0283p = new C0283p();
        c0283p.f4286q = this.f3713a;
        return c0283p;
    }

    public final int hashCode() {
        return this.f3713a.hashCode();
    }

    @Override // t0.T
    public final void i(k kVar) {
        C0283p c0283p = (C0283p) kVar;
        c0283p.f4286q = this.f3713a;
        a0 a0Var = AbstractC0898f.r(c0283p, 2).p;
        if (a0Var != null) {
            a0Var.U0(c0283p.f4286q, true);
        }
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f3713a + ')';
    }
}
