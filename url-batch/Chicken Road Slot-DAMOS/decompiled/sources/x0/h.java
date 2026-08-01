package x0;

import com.google.android.gms.internal.measurement.bf;
import n0.p1;
import n0.p2;
import n0.t;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h extends u0.b implements t {

    /* renamed from: u, reason: collision with root package name */
    public static final h f10234u = new h(u0.i.f9590e, 0);

    @Override // u0.b, kotlin.collections.j, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof p1) {
            return super.containsKey((p1) obj);
        }
        return false;
    }

    @Override // kotlin.collections.j, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof p2) {
            return super.containsValue((p2) obj);
        }
        return false;
    }

    public final h g(p1 p1Var, p2 p2Var) {
        bf u2 = this.f9577r.u(p1Var.hashCode(), 0, p1Var, p2Var);
        return u2 == null ? this : new h((u0.i) u2.f2175e, this.f9578s + u2.f2174d);
    }

    @Override // u0.b, kotlin.collections.j, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof p1) {
            return (p2) super.get((p1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof p1) ? obj2 : (p2) super.getOrDefault((p1) obj, (p2) obj2);
    }
}
