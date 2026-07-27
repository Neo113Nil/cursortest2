package M2;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC1332g;

/* loaded from: classes.dex */
public abstract class m extends AbstractC0253e implements l, S2.a, InterfaceC1332g {

    /* renamed from: m, reason: collision with root package name */
    public final int f3604m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3605n;

    public m(int i2, Class cls, String str, String str2, int i4) {
        this(i2, i4, cls, C0252d.f3589d, str, str2);
    }

    @Override // M2.AbstractC0253e
    public final S2.a a() {
        F.f3581a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return this.f3593j.equals(mVar.f3593j) && this.f3594k.equals(mVar.f3594k) && this.f3605n == mVar.f3605n && this.f3604m == mVar.f3604m && Intrinsics.a(this.f3591e, mVar.f3591e) && Intrinsics.a(b(), mVar.b());
        }
        if (!(obj instanceof m)) {
            return false;
        }
        S2.a aVar = this.f3590d;
        if (aVar == null) {
            a();
            this.f3590d = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    @Override // M2.l
    public final int getArity() {
        return this.f3604m;
    }

    public final int hashCode() {
        return this.f3594k.hashCode() + r0.B.a(this.f3593j, b() == null ? 0 : b().hashCode() * 31, 31);
    }

    public final String toString() {
        S2.a aVar = this.f3590d;
        if (aVar == null) {
            a();
            this.f3590d = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f3593j;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : AbstractC0017m.j("function ", str, " (Kotlin reflection is not available)");
    }

    public m(int i2, int i4, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
        this.f3604m = i2;
        this.f3605n = 0;
    }
}
