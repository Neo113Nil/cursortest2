package androidx.compose.ui.draw;

import S.n;
import W.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class DrawWithContentElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f5159a;

    public DrawWithContentElement(Function1 function1) {
        this.f5159a = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && Intrinsics.a(this.f5159a, ((DrawWithContentElement) obj).f5159a);
    }

    public final int hashCode() {
        return this.f5159a.hashCode();
    }

    @Override // r0.T
    public final n l() {
        f fVar = new f();
        fVar.f4196t = this.f5159a;
        return fVar;
    }

    @Override // r0.T
    public final void m(n nVar) {
        ((f) nVar).f4196t = this.f5159a;
    }

    public final String toString() {
        return "DrawWithContentElement(onDraw=" + this.f5159a + ')';
    }
}
