package r0;

import kotlin.jvm.internal.Intrinsics;
import p0.InterfaceC0946G;

/* loaded from: classes.dex */
public final class k0 implements h0 {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0946G f9823d;

    /* renamed from: e, reason: collision with root package name */
    public final O f9824e;

    public k0(InterfaceC0946G interfaceC0946G, O o4) {
        this.f9823d = interfaceC0946G;
        this.f9824e = o4;
    }

    @Override // r0.h0
    public final boolean N() {
        return this.f9824e.u0().p();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Intrinsics.a(this.f9823d, k0Var.f9823d) && Intrinsics.a(this.f9824e, k0Var.f9824e);
    }

    public final int hashCode() {
        return this.f9824e.hashCode() + (this.f9823d.hashCode() * 31);
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.f9823d + ", placeable=" + this.f9824e + ')';
    }
}
