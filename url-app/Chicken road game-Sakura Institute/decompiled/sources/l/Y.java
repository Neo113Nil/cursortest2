package l;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Y implements InterfaceC0787m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0799z f7661a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7662b;

    public Y(InterfaceC0799z interfaceC0799z, long j4) {
        this.f7661a = interfaceC0799z;
        this.f7662b = j4;
    }

    @Override // l.InterfaceC0787m
    public final x0 a(v0 v0Var) {
        return new Z(this.f7661a.a(v0Var), this.f7662b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y4 = (Y) obj;
        return y4.f7662b == this.f7662b && Intrinsics.a(y4.f7661a, this.f7661a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f7662b) + (this.f7661a.hashCode() * 31);
    }
}
