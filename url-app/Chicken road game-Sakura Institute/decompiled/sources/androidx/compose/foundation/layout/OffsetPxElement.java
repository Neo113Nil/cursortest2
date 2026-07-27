package androidx.compose.foundation.layout;

import Q.C0267c;
import S.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import q.C1019X;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class OffsetPxElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f5063a;

    public OffsetPxElement(Function1 function1, C0267c c0267c) {
        this.f5063a = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && this.f5063a == offsetPxElement.f5063a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f5063a.hashCode() * 31);
    }

    @Override // r0.T
    public final n l() {
        C1019X c1019x = new C1019X();
        c1019x.f9223t = this.f5063a;
        c1019x.f9224u = true;
        return c1019x;
    }

    @Override // r0.T
    public final void m(n nVar) {
        C1019X c1019x = (C1019X) nVar;
        c1019x.f9223t = this.f5063a;
        c1019x.f9224u = true;
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f5063a + ", rtlAware=true)";
    }
}
