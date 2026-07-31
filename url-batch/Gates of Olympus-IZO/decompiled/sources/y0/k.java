package y0;

import L1.z;
import Z1.u;
import Z1.v;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Y1.c, Z1.f, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final K.d f8820d;

    public k(K.d dVar) {
        this.f8820d = dVar;
    }

    @Override // Z1.f
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        kVar.getClass();
        return this.f8820d.equals(kVar.f8820d) && K.d.class.equals(K.d.class);
    }

    public final int hashCode() {
        return ((((((((((K.d.class.hashCode() + (this.f8820d.hashCode() * 31)) * 31) + 96417) * 31) + 1636195860) * 31) + 1237) * 31) + 1) * 31) + 4;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        this.f8820d.b((m) obj);
        return z.f2729a;
    }

    public final String toString() {
        u.f3481a.getClass();
        return v.a(this);
    }
}
