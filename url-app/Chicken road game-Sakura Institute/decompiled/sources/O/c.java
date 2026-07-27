package O;

import G.AbstractC0217p0;
import G.a1;
import L.m;

/* loaded from: classes.dex */
public final class c extends L.e {

    /* renamed from: m, reason: collision with root package name */
    public d f3625m;

    @Override // L.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0217p0) {
            return super.containsKey((AbstractC0217p0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof a1) {
            return super.containsValue((a1) obj);
        }
        return false;
    }

    @Override // L.e, java.util.AbstractMap, java.util.Map
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

    @Override // L.e, J.d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final d j() {
        m mVar = this.f3467i;
        d dVar = this.f3625m;
        if (mVar != dVar.f3460j) {
            this.f3466e = new N.b();
            dVar = new d(this.f3467i, d());
        }
        this.f3625m = dVar;
        return dVar;
    }

    @Override // L.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC0217p0) {
            return (a1) super.remove((AbstractC0217p0) obj);
        }
        return null;
    }
}
