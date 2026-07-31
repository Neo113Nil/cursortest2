package u0;

import m0.o1;
import m0.r1;
import m0.w2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends r0.b implements o1 {

    /* renamed from: g, reason: collision with root package name */
    public static final g f7151g = new g(r0.j.f6488e, 0);

    public final g b(r1 r1Var, w2 w2Var) {
        k5.e u7 = this.f6474d.u(r1Var.hashCode(), 0, r1Var, w2Var);
        return u7 == null ? this : new g((r0.j) u7.f4190e, this.f6475e + u7.f4189d);
    }

    @Override // r0.b, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof r1) {
            return super.containsKey((r1) obj);
        }
        return false;
    }

    @Override // d6.f, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof w2) {
            return super.containsValue((w2) obj);
        }
        return false;
    }

    @Override // r0.b, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof r1) {
            return (w2) super.get((r1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof r1) ? obj2 : (w2) super.getOrDefault((r1) obj, (w2) obj2);
    }
}
