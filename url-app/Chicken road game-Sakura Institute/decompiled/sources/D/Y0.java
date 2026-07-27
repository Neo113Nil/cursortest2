package D;

import A.AbstractC0017m;
import Z.C0323u;
import kotlin.jvm.internal.Intrinsics;
import p.InterfaceC0934j;
import r0.InterfaceC1072m;
import y2.y;

/* loaded from: classes.dex */
public final class Y0 implements m.W {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1682a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1683b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1684c;

    public Y0(boolean z4, float f4, long j4) {
        this.f1682a = z4;
        this.f1683b = f4;
        this.f1684c = j4;
    }

    @Override // m.W
    public final InterfaceC1072m a(InterfaceC0934j interfaceC0934j) {
        T t4 = new T(1, this);
        return new V(interfaceC0934j, this.f1682a, this.f1683b, t4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y0)) {
            return false;
        }
        Y0 y02 = (Y0) obj;
        if (this.f1682a == y02.f1682a && M0.e.a(this.f1683b, y02.f1683b) && Intrinsics.a(null, null)) {
            return C0323u.c(this.f1684c, y02.f1684c);
        }
        return false;
    }

    public final int hashCode() {
        int a4 = AbstractC0017m.a(this.f1683b, Boolean.hashCode(this.f1682a) * 31, 961);
        int i2 = C0323u.f4548h;
        y.a aVar = y2.y.f11688e;
        return Long.hashCode(this.f1684c) + a4;
    }
}
