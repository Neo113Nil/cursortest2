package l;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u0 implements InterfaceC0799z {

    /* renamed from: a, reason: collision with root package name */
    public final int f7844a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7845b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0797x f7846c;

    public u0(int i2, InterfaceC0797x interfaceC0797x, int i4) {
        this(i2, 0, (i4 & 4) != 0 ? AbstractC0798y.f7865a : interfaceC0797x);
    }

    @Override // l.InterfaceC0787m
    public final x0 a(v0 v0Var) {
        return new B0(this.f7844a, this.f7845b, this.f7846c);
    }

    @Override // l.InterfaceC0799z
    public final z0 e() {
        v0 v0Var = w0.f7856a;
        return new B0(this.f7844a, this.f7845b, this.f7846c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return u0Var.f7844a == this.f7844a && u0Var.f7845b == this.f7845b && Intrinsics.a(u0Var.f7846c, this.f7846c);
    }

    public final int hashCode() {
        return ((this.f7846c.hashCode() + (this.f7844a * 31)) * 31) + this.f7845b;
    }

    public u0(int i2, int i4, InterfaceC0797x interfaceC0797x) {
        this.f7844a = i2;
        this.f7845b = i4;
        this.f7846c = interfaceC0797x;
    }
}
