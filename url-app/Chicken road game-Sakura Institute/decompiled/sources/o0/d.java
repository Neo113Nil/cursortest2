package o0;

import g0.k1;
import g0.m1;
import g0.p2;
import l0.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends l0.c implements k1 {

    /* renamed from: i, reason: collision with root package name */
    public static final d f6822i = new d(k.f5761e, 0);

    @Override // l0.c, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof m1) {
            return super.containsKey((m1) obj);
        }
        return false;
    }

    @Override // e6.e, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof p2) {
            return super.containsValue((p2) obj);
        }
        return false;
    }

    @Override // l0.c, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof m1) {
            return (p2) super.get((m1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof m1) ? obj2 : (p2) super.getOrDefault((m1) obj, (p2) obj2);
    }
}
