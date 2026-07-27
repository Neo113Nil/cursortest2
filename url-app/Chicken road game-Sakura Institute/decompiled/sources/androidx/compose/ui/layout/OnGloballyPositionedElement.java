package androidx.compose.ui.layout;

import S.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import p0.C0950K;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class OnGloballyPositionedElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f5210a;

    public OnGloballyPositionedElement(Function1 function1) {
        this.f5210a = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.f5210a == ((OnGloballyPositionedElement) obj).f5210a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5210a.hashCode();
    }

    @Override // r0.T
    public final n l() {
        C0950K c0950k = new C0950K();
        c0950k.f9000t = this.f5210a;
        return c0950k;
    }

    @Override // r0.T
    public final void m(n nVar) {
        ((C0950K) nVar).f9000t = this.f5210a;
    }
}
