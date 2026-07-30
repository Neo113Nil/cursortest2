package a8;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class B extends AbstractC0434a {

    /* renamed from: a, reason: collision with root package name */
    public final A f4427a;

    public B() {
        T t9 = T.f4451a;
        b8.p pVar = b8.p.f5617a;
        this.f4427a = new A(T.f4452b, b8.p.f5618b);
    }

    @Override // X7.a
    public final void a(c8.r rVar, Object obj) {
        g(obj);
        A descriptor = this.f4427a;
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        c8.r a9 = rVar.a(descriptor);
        Iterator f6 = f(obj);
        int i = 0;
        while (f6.hasNext()) {
            Map.Entry entry = (Map.Entry) f6.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i4 = i + 1;
            a9.l(descriptor, i, T.f4451a, key);
            i += 2;
            a9.l(descriptor, i4, b8.p.f5617a, value);
        }
        a9.p(descriptor);
    }

    @Override // X7.a
    public final Y7.e c() {
        return this.f4427a;
    }

    @Override // a8.AbstractC0434a
    public final Object d() {
        return new LinkedHashMap();
    }

    @Override // a8.AbstractC0434a
    public final int e(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        kotlin.jvm.internal.h.e(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // a8.AbstractC0434a
    public final Iterator f(Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.h.e(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // a8.AbstractC0434a
    public final int g(Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.h.e(map, "<this>");
        return map.size();
    }

    @Override // a8.AbstractC0434a
    public final void i(Z7.a aVar, int i, Object obj) {
        Object i4;
        Map builder = (Map) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        T t9 = T.f4451a;
        A a9 = this.f4427a;
        Object i9 = aVar.i(a9, i, t9, null);
        int o9 = aVar.o(a9);
        if (o9 != i + 1) {
            throw new IllegalArgumentException(AbstractC5051n.c(i, o9, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
        }
        if (builder.containsKey(i9)) {
            b8.p pVar = b8.p.f5617a;
            if (!(b8.p.f5618b.f4043b instanceof Y7.d)) {
                i4 = aVar.i(a9, o9, pVar, r7.t.y(i9, builder));
                builder.put(i9, i4);
            }
        }
        i4 = aVar.i(a9, o9, b8.p.f5617a, null);
        builder.put(i9, i4);
    }

    @Override // a8.AbstractC0434a
    public final Object j(Object obj) {
        kotlin.jvm.internal.h.e(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    @Override // a8.AbstractC0434a
    public final Object k(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        kotlin.jvm.internal.h.e(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
