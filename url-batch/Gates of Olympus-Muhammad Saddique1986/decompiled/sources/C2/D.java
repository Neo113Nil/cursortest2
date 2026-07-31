package C2;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class D extends AbstractC0038a {

    /* renamed from: a, reason: collision with root package name */
    public final C f693a;

    public D() {
        a0 a0Var = a0.f733a;
        D2.n nVar = D2.n.f896a;
        this.f693a = new C(a0.f734b, D2.n.f897b);
    }

    @Override // C2.AbstractC0038a
    public final Object a() {
        return new LinkedHashMap();
    }

    @Override // C2.AbstractC0038a
    public final int b(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        f2.j.f(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // C2.AbstractC0038a
    public final void d(B2.a aVar, int i3, Object obj, boolean z3) {
        int i4;
        Object g3;
        Map map = (Map) obj;
        f2.j.f(map, "builder");
        a0 a0Var = a0.f733a;
        C c2 = this.f693a;
        Object g4 = aVar.g(c2, i3, a0Var, null);
        if (z3) {
            i4 = aVar.r(c2);
            if (i4 != i3 + 1) {
                throw new IllegalArgumentException(A.k.f(i3, i4, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
            }
        } else {
            i4 = i3 + 1;
        }
        if (map.containsKey(g4)) {
            D2.n nVar = D2.n.f896a;
            if (!(D2.n.f897b.f244b instanceof A2.e)) {
                g3 = aVar.g(c2, i4, nVar, S1.B.I(g4, map));
                map.put(g4, g3);
            }
        }
        g3 = aVar.g(c2, i4, D2.n.f896a, null);
        map.put(g4, g3);
    }

    @Override // C2.AbstractC0038a
    public final Object e(Object obj) {
        f2.j.f(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    @Override // C2.AbstractC0038a
    public final Object f(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        f2.j.f(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f693a;
    }
}
