package o7;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d0 extends a {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f6868a;

    public d0() {
        a1 a1Var = a1.f6856a;
        p7.m mVar = p7.m.f7230a;
        this.f6868a = new c0(a1.f6857b, p7.m.f7231b);
    }

    @Override // o7.a
    public final Object a() {
        return new LinkedHashMap();
    }

    @Override // o7.a
    public final int b(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        r6.k.f(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // o7.a
    public final void d(n7.a aVar, int i7, Object obj) {
        Map map = (Map) obj;
        p7.m mVar = p7.m.f7230a;
        r6.k.f(map, "builder");
        a1 a1Var = a1.f6856a;
        c0 c0Var = this.f6868a;
        Object q8 = aVar.q(c0Var, i7, a1Var, null);
        int m8 = aVar.m(c0Var);
        if (m8 != i7 + 1) {
            throw new IllegalArgumentException(r6.i.b(i7, m8, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
        }
        map.put(q8, (!map.containsKey(q8) || (p7.m.f7231b.f6451b instanceof m7.e)) ? aVar.q(c0Var, m8, mVar, null) : aVar.q(c0Var, m8, mVar, e6.c0.i0(q8, map)));
    }

    @Override // o7.a
    public final Object e(Object obj) {
        r6.k.f(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    @Override // o7.a
    public final Object f(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        r6.k.f(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f6868a;
    }
}
