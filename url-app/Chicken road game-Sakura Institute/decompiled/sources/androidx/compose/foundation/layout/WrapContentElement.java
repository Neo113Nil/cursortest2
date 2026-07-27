package androidx.compose.foundation.layout;

import A.AbstractC0017m;
import M2.p;
import S.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;
import q.s0;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class WrapContentElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final int f5076a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5077b;

    /* renamed from: c, reason: collision with root package name */
    public final p f5078c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5079d;

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(int i2, boolean z4, Function2 function2, Object obj) {
        this.f5076a = i2;
        this.f5077b = z4;
        this.f5078c = (p) function2;
        this.f5079d = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f5076a == wrapContentElement.f5076a && this.f5077b == wrapContentElement.f5077b && Intrinsics.a(this.f5079d, wrapContentElement.f5079d);
    }

    public final int hashCode() {
        return this.f5079d.hashCode() + AbstractC0017m.d(AbstractC0784j.d(this.f5076a) * 31, 31, this.f5077b);
    }

    @Override // r0.T
    public final n l() {
        s0 s0Var = new s0();
        s0Var.f9339t = this.f5076a;
        s0Var.f9340u = this.f5077b;
        s0Var.f9341v = this.f5078c;
        return s0Var;
    }

    @Override // r0.T
    public final void m(n nVar) {
        s0 s0Var = (s0) nVar;
        s0Var.f9339t = this.f5076a;
        s0Var.f9340u = this.f5077b;
        s0Var.f9341v = this.f5078c;
    }
}
