package androidx.compose.foundation.layout;

import S.n;
import kotlin.Metadata;
import q.C1017V;
import r0.T;

@Metadata
/* loaded from: classes.dex */
public final class LayoutWeightElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final float f5061a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5062b;

    public LayoutWeightElement(float f4, boolean z4) {
        this.f5061a = f4;
        this.f5062b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        if (layoutWeightElement == null) {
            return false;
        }
        return this.f5061a == layoutWeightElement.f5061a && this.f5062b == layoutWeightElement.f5062b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5062b) + (Float.hashCode(this.f5061a) * 31);
    }

    @Override // r0.T
    public final n l() {
        C1017V c1017v = new C1017V();
        c1017v.f9219t = this.f5061a;
        c1017v.f9220u = this.f5062b;
        return c1017v;
    }

    @Override // r0.T
    public final void m(n nVar) {
        C1017V c1017v = (C1017V) nVar;
        c1017v.f9219t = this.f5061a;
        c1017v.f9220u = this.f5062b;
    }
}
