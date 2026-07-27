package androidx.compose.ui.draw;

import S.n;
import W.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class DrawBehindElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f5157a;

    public DrawBehindElement(Function1 function1) {
        this.f5157a = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && Intrinsics.a(this.f5157a, ((DrawBehindElement) obj).f5157a);
    }

    public final int hashCode() {
        return this.f5157a.hashCode();
    }

    @Override // r0.T
    public final n l() {
        d dVar = new d();
        dVar.f4195t = this.f5157a;
        return dVar;
    }

    @Override // r0.T
    public final void m(n nVar) {
        ((d) nVar).f4195t = this.f5157a;
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.f5157a + ')';
    }
}
