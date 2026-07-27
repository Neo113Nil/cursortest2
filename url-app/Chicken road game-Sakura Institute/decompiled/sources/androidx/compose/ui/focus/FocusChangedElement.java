package androidx.compose.ui.focus;

import S.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class FocusChangedElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f5170a;

    public FocusChangedElement(Function1 function1) {
        this.f5170a = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && Intrinsics.a(this.f5170a, ((FocusChangedElement) obj).f5170a);
    }

    public final int hashCode() {
        return this.f5170a.hashCode();
    }

    @Override // r0.T
    public final n l() {
        X.a aVar = new X.a();
        aVar.f4310t = this.f5170a;
        return aVar;
    }

    @Override // r0.T
    public final void m(n nVar) {
        ((X.a) nVar).f4310t = this.f5170a;
    }

    public final String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f5170a + ')';
    }
}
