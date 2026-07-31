package Q;

import I.AbstractC0168p0;
import I.InterfaceC0164n0;
import I.Z0;
import N.m;

/* loaded from: classes.dex */
public final class d extends N.c implements InterfaceC0164n0 {

    /* renamed from: g, reason: collision with root package name */
    public static final d f3954g = new d(m.f3521e, 0);

    @Override // N.c, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0168p0) {
            return super.containsKey((AbstractC0168p0) obj);
        }
        return false;
    }

    @Override // S1.e, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Z0) {
            return super.containsValue((Z0) obj);
        }
        return false;
    }

    @Override // N.c, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC0168p0) {
            return (Z0) super.get((AbstractC0168p0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC0168p0) ? obj2 : (Z0) super.getOrDefault((AbstractC0168p0) obj, (Z0) obj2);
    }
}
