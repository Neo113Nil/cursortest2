package x1;

import d6.z;
import java.io.Serializable;
import r6.w;
import r6.x;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements q6.c, r6.g, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final i0.d f9665f;

    public i(i0.d dVar) {
        this.f9665f = dVar;
    }

    @Override // r6.g
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f9665f.equals(((i) obj).f9665f) && i0.d.class.equals(i0.d.class);
    }

    @Override // q6.c
    public final Object f(Object obj) {
        this.f9665f.b((k) obj);
        return z.f2639a;
    }

    public final int hashCode() {
        return ((((((((((i0.d.class.hashCode() + (this.f9665f.hashCode() * 31)) * 31) + 96417) * 31) + 1636195860) * 31) + 1237) * 31) + 1) * 31) + 4;
    }

    public final String toString() {
        w.f7969a.getClass();
        return x.a(this);
    }
}
