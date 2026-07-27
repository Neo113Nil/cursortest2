package androidx.compose.ui.graphics;

import S.n;
import Z.C0318o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r0.AbstractC1065f;
import r0.T;
import r0.a0;

@Metadata
/* loaded from: classes.dex */
final class BlockGraphicsLayerElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f5184a;

    public BlockGraphicsLayerElement(Function1 function1) {
        this.f5184a = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && Intrinsics.a(this.f5184a, ((BlockGraphicsLayerElement) obj).f5184a);
    }

    public final int hashCode() {
        return this.f5184a.hashCode();
    }

    @Override // r0.T
    public final n l() {
        return new C0318o(this.f5184a);
    }

    @Override // r0.T
    public final void m(n nVar) {
        C0318o c0318o = (C0318o) nVar;
        c0318o.f4538t = this.f5184a;
        a0 a0Var = AbstractC1065f.t(c0318o, 2).f9763s;
        if (a0Var != null) {
            a0Var.j1(c0318o.f4538t, true);
        }
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f5184a + ')';
    }
}
