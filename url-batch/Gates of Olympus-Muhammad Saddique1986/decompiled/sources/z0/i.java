package z0;

import R1.y;
import e2.InterfaceC0424c;
import f2.v;
import f2.w;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements InterfaceC0424c, f2.g, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final K.d f10541d;

    public i(K.d dVar) {
        this.f10541d = dVar;
    }

    @Override // f2.g
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        iVar.getClass();
        return this.f10541d.equals(iVar.f10541d) && K.d.class.equals(K.d.class);
    }

    public final int hashCode() {
        return ((((((((((K.d.class.hashCode() + (this.f10541d.hashCode() * 31)) * 31) + 96417) * 31) + 1636195860) * 31) + 1237) * 31) + 1) * 31) + 4;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        this.f10541d.b((k) obj);
        return y.f4171a;
    }

    public final String toString() {
        v.f5833a.getClass();
        return w.a(this);
    }
}
