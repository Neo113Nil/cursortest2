package te;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d0 extends a {

    /* renamed from: a, reason: collision with root package name */
    public final pe.a f9353a;

    /* renamed from: b, reason: collision with root package name */
    public final pe.a f9354b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9355c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f9356d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0(pe.a aVar, pe.a aVar2, int i3) {
        this(aVar, aVar2, (byte) 0);
        this.f9355c = i3;
        aVar.getClass();
        aVar2.getClass();
        switch (i3) {
            case 1:
                this(aVar, aVar2, (byte) 0);
                re.e d10 = aVar.d();
                re.e d11 = aVar2.d();
                d10.getClass();
                d11.getClass();
                this.f9356d = new c0("kotlin.collections.LinkedHashMap", d10, d11);
                break;
            default:
                re.e d12 = aVar.d();
                re.e d13 = aVar2.d();
                d12.getClass();
                d13.getClass();
                this.f9356d = new c0("kotlin.collections.HashMap", d12, d13);
                break;
        }
    }

    @Override // pe.a
    public final void a(e3.o oVar, Object obj) {
        h(obj);
        d().getClass();
        Iterator g = g(obj);
        int i3 = 0;
        while (g.hasNext()) {
            Map.Entry entry = (Map.Entry) g.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i10 = i3 + 1;
            oVar.k(d(), i3, this.f9353a, key);
            i3 += 2;
            oVar.k(d(), i10, this.f9354b, value);
        }
    }

    @Override // pe.a
    public final re.e d() {
        switch (this.f9355c) {
        }
        return this.f9356d;
    }

    @Override // te.a
    public final Object e() {
        switch (this.f9355c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // te.a
    public final int f(Object obj) {
        int size;
        switch (this.f9355c) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                hashMap.getClass();
                size = hashMap.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    @Override // te.a
    public final Iterator g(Object obj) {
        switch (this.f9355c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.entrySet().iterator();
        }
    }

    @Override // te.a
    public final int h(Object obj) {
        switch (this.f9355c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.size();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.size();
        }
    }

    @Override // te.a
    public final void j(y6.l lVar, int i3, Object obj) {
        Object d10;
        Map map = (Map) obj;
        map.getClass();
        Object d11 = y6.l.d(lVar, d(), i3, this.f9353a);
        int a9 = lVar.a(d());
        if (a9 != i3 + 1) {
            kotlin.collections.i0.d(i3, a9, ", returned index for value: ", "Value must follow key in a map, index for key: ");
            return;
        }
        boolean containsKey = map.containsKey(d11);
        pe.a aVar = this.f9354b;
        if (!containsKey || (aVar.d().b() instanceof re.d)) {
            d10 = y6.l.d(lVar, d(), a9, aVar);
        } else {
            re.e d12 = d();
            kotlin.collections.p0.c(d11, map);
            d12.getClass();
            d10 = lVar.e();
        }
        map.put(d11, d10);
    }

    @Override // te.a
    public final Object k(Object obj) {
        switch (this.f9355c) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }

    @Override // te.a
    public final Object l(Object obj) {
        switch (this.f9355c) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                hashMap.getClass();
                return hashMap;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                return linkedHashMap;
        }
    }

    public d0(pe.a aVar, pe.a aVar2, byte b10) {
        this.f9353a = aVar;
        this.f9354b = aVar2;
    }
}
