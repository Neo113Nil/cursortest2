package O;

import G.AbstractC0217p0;
import G.InterfaceC0213n0;
import G.a1;
import L.m;

/* loaded from: classes.dex */
public final class d extends L.c implements InterfaceC0213n0 {

    /* renamed from: m, reason: collision with root package name */
    public static final d f3626m = new d(m.f3483e, 0);

    @Override // L.c, J.e
    public final J.d a() {
        c cVar = new c(this);
        cVar.f3625m = this;
        return cVar;
    }

    @Override // L.c, z2.AbstractC1423g, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0217p0) {
            return super.containsKey((AbstractC0217p0) obj);
        }
        return false;
    }

    @Override // z2.AbstractC1423g, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof a1) {
            return super.containsValue((a1) obj);
        }
        return false;
    }

    @Override // L.c
    /* renamed from: g */
    public final L.e a() {
        c cVar = new c(this);
        cVar.f3625m = this;
        return cVar;
    }

    @Override // L.c, z2.AbstractC1423g, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC0217p0) {
            return (a1) super.get((AbstractC0217p0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC0217p0) ? obj2 : (a1) super.getOrDefault((AbstractC0217p0) obj, (a1) obj2);
    }
}
