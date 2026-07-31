package w2;

import H2.AbstractC0080b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class D extends AbstractC1022a {

    /* renamed from: a, reason: collision with root package name */
    public final C f8606a;

    public D() {
        a0 a0Var = a0.f8646a;
        x2.n nVar = x2.n.f8756a;
        this.f8606a = new C(a0.f8647b, x2.n.f8757b);
    }

    @Override // w2.AbstractC1022a
    public final Object a() {
        return new LinkedHashMap();
    }

    @Override // w2.AbstractC1022a
    public final int b(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        Z1.i.f(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // w2.AbstractC1022a
    public final void d(v2.a aVar, int i3, Object obj, boolean z3) {
        int i4;
        Object i5;
        Map map = (Map) obj;
        Z1.i.f(map, "builder");
        a0 a0Var = a0.f8646a;
        C c3 = this.f8606a;
        Object i6 = aVar.i(c3, i3, a0Var, null);
        if (z3) {
            i4 = aVar.s(c3);
            if (i4 != i3 + 1) {
                throw new IllegalArgumentException(AbstractC0080b.g(i3, i4, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
            }
        } else {
            i4 = i3 + 1;
        }
        if (map.containsKey(i6)) {
            x2.n nVar = x2.n.f8756a;
            if (!(x2.n.f8757b.f8538b instanceof u2.e)) {
                i5 = aVar.i(c3, i4, nVar, M1.B.D(i6, map));
                map.put(i6, i5);
            }
        }
        i5 = aVar.i(c3, i4, x2.n.f8756a, null);
        map.put(i6, i5);
    }

    @Override // w2.AbstractC1022a
    public final Object e(Object obj) {
        Z1.i.f(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    @Override // w2.AbstractC1022a
    public final Object f(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        Z1.i.f(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f8606a;
    }
}
