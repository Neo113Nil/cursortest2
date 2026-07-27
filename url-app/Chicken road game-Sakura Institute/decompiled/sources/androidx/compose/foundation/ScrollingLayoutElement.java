package androidx.compose.foundation;

import A.AbstractC0017m;
import S.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m.u0;
import m.v0;
import r0.T;

@Metadata
/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f5034a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5035b;

    public ScrollingLayoutElement(u0 u0Var, boolean z4) {
        this.f5034a = u0Var;
        this.f5035b = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return Intrinsics.a(this.f5034a, scrollingLayoutElement.f5034a) && this.f5035b == scrollingLayoutElement.f5035b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0017m.d(this.f5034a.hashCode() * 31, 31, this.f5035b);
    }

    @Override // r0.T
    public final n l() {
        v0 v0Var = new v0();
        v0Var.f8206t = this.f5034a;
        v0Var.f8207u = this.f5035b;
        v0Var.f8208v = true;
        return v0Var;
    }

    @Override // r0.T
    public final void m(n nVar) {
        v0 v0Var = (v0) nVar;
        v0Var.f8206t = this.f5034a;
        v0Var.f8207u = this.f5035b;
        v0Var.f8208v = true;
    }
}
