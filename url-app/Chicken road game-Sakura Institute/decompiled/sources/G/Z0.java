package G;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Z0 implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2784a;

    public Z0(Object obj) {
        this.f2784a = obj;
    }

    @Override // G.a1
    public final Object a(InterfaceC0213n0 interfaceC0213n0) {
        return this.f2784a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Z0) && Intrinsics.a(this.f2784a, ((Z0) obj).f2784a);
    }

    public final int hashCode() {
        Object obj = this.f2784a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f2784a + ')';
    }
}
