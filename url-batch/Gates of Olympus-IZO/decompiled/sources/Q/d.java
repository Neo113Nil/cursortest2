package Q;

import I.AbstractC0114p0;
import I.InterfaceC0110n0;
import I.a1;
import N.m;

/* loaded from: classes.dex */
public final class d extends N.c implements InterfaceC0110n0 {

    /* renamed from: g, reason: collision with root package name */
    public static final d f3088g = new d(m.f2839e, 0);

    @Override // N.c, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0114p0) {
            return super.containsKey((AbstractC0114p0) obj);
        }
        return false;
    }

    @Override // M1.AbstractC0144e, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof a1) {
            return super.containsValue((a1) obj);
        }
        return false;
    }

    @Override // N.c, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC0114p0) {
            return (a1) super.get((AbstractC0114p0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC0114p0) ? obj2 : (a1) super.getOrDefault((AbstractC0114p0) obj, (a1) obj2);
    }
}
