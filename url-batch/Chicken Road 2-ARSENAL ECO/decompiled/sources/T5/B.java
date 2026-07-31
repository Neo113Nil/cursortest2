package T5;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class B extends AbstractC0185a {

    /* renamed from: a, reason: collision with root package name */
    public final A f2383a;

    public B() {
        U u6 = U.f2407a;
        U5.o oVar = U5.o.f2662a;
        this.f2383a = new A(U.f2408b, U5.o.f2663b);
    }

    @Override // Q5.a
    public final void a(V5.s sVar, Object obj) {
        g(obj);
        A descriptor = this.f2383a;
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        V5.s a7 = sVar.a(descriptor);
        Iterator f7 = f(obj);
        int i7 = 0;
        while (f7.hasNext()) {
            Map.Entry entry = (Map.Entry) f7.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i8 = i7 + 1;
            a7.l(descriptor, i7, U.f2407a, key);
            i7 += 2;
            a7.l(descriptor, i8, U5.o.f2662a, value);
        }
        a7.p(descriptor);
    }

    @Override // Q5.a
    public final R5.e c() {
        return this.f2383a;
    }

    @Override // T5.AbstractC0185a
    public final Object d() {
        return new LinkedHashMap();
    }

    @Override // T5.AbstractC0185a
    public final int e(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        kotlin.jvm.internal.i.e(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // T5.AbstractC0185a
    public final Iterator f(Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.i.e(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // T5.AbstractC0185a
    public final int g(Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.i.e(map, "<this>");
        return map.size();
    }

    @Override // T5.AbstractC0185a
    public final void i(S5.a aVar, int i7, Object obj) {
        Map builder = (Map) obj;
        U5.o oVar = U5.o.f2662a;
        kotlin.jvm.internal.i.e(builder, "builder");
        U u6 = U.f2407a;
        A a7 = this.f2383a;
        Object k4 = aVar.k(a7, i7, u6, null);
        int j4 = aVar.j(a7);
        if (j4 != i7 + 1) {
            throw new IllegalArgumentException(C1.c.f(i7, j4, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
        }
        builder.put(k4, (!builder.containsKey(k4) || (U5.o.f2663b.f2158b instanceof R5.d)) ? aVar.k(a7, j4, oVar, null) : aVar.k(a7, j4, oVar, l5.t.o0(builder, k4)));
    }

    @Override // T5.AbstractC0185a
    public final Object j(Object obj) {
        kotlin.jvm.internal.i.e(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    @Override // T5.AbstractC0185a
    public final Object k(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        kotlin.jvm.internal.i.e(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
