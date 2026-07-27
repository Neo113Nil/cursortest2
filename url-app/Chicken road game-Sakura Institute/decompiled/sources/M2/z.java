package M2;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class z extends AbstractC0253e implements S2.e {

    /* renamed from: m, reason: collision with root package name */
    public final boolean f3610m;

    public z() {
        this.f3610m = false;
    }

    public final S2.a c() {
        if (this.f3610m) {
            return this;
        }
        S2.a aVar = this.f3590d;
        if (aVar != null) {
            return aVar;
        }
        S2.a a4 = a();
        this.f3590d = a4;
        return a4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            return b().equals(zVar.b()) && this.f3593j.equals(zVar.f3593j) && this.f3594k.equals(zVar.f3594k) && Intrinsics.a(this.f3591e, zVar.f3591e);
        }
        if (obj instanceof S2.e) {
            return obj.equals(c());
        }
        return false;
    }

    public final int hashCode() {
        return this.f3594k.hashCode() + r0.B.a(this.f3593j, b().hashCode() * 31, 31);
    }

    public final String toString() {
        S2.a c4 = c();
        return c4 != this ? c4.toString() : AbstractC0017m.n(new StringBuilder("property "), this.f3593j, " (Kotlin reflection is not available)");
    }

    public z(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f3610m = false;
    }
}
