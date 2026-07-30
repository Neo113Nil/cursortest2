package z6;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class B extends AbstractC1061a {

    /* renamed from: a, reason: collision with root package name */
    public final A f8732a;

    public B() {
        U kSerializer = U.f8759a;
        A6.p vSerializer = A6.p.f131a;
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        this.f8732a = new A(U.f8760b, A6.p.f132b);
    }

    @Override // w6.a
    public final void b(B6.t encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        g(obj);
        A descriptor = this.f8732a;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        B6.t a7 = encoder.a(descriptor);
        Iterator f7 = f(obj);
        int i2 = 0;
        while (f7.hasNext()) {
            Map.Entry entry = (Map.Entry) f7.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i5 = i2 + 1;
            a7.l(descriptor, i2, U.f8759a, key);
            i2 += 2;
            a7.l(descriptor, i5, A6.p.f131a, value);
        }
        a7.p(descriptor);
    }

    @Override // w6.a
    public final x6.e c() {
        return this.f8732a;
    }

    @Override // z6.AbstractC1061a
    public final Object d() {
        return new LinkedHashMap();
    }

    @Override // z6.AbstractC1061a
    public final int e(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // z6.AbstractC1061a
    public final Iterator f(Object obj) {
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // z6.AbstractC1061a
    public final int g(Object obj) {
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size();
    }

    @Override // z6.AbstractC1061a
    public final void i(y6.a decoder, int i2, Object obj) {
        Map builder = (Map) obj;
        A6.p pVar = A6.p.f131a;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        U u7 = U.f8759a;
        A a7 = this.f8732a;
        Object g7 = decoder.g(a7, i2, u7, null);
        int o7 = decoder.o(a7);
        if (o7 != i2 + 1) {
            throw new IllegalArgumentException(C4.p.j("Value must follow key in a map, index for key: ", ", returned index for value: ", i2, o7).toString());
        }
        builder.put(g7, (!builder.containsKey(g7) || (A6.p.f132b.f8430b instanceof x6.d)) ? decoder.g(a7, o7, pVar, null) : decoder.g(a7, o7, pVar, kotlin.collections.I.d(builder, g7)));
    }

    @Override // z6.AbstractC1061a
    public final Object j(Object obj) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    @Override // z6.AbstractC1061a
    public final Object k(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
