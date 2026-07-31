package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* renamed from: io.appmetrica.analytics.impl.qd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0454qd implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0660yk f1453a = C0401oa.k().p();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0537tm[] fromModel(Map<String, ? extends Object> map) {
        C0537tm c0537tm;
        Map<String, Zc> c = this.f1453a.c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Zc zc = c.get(key);
            if (zc == null || value == null) {
                c0537tm = null;
            } else {
                c0537tm = new C0537tm();
                c0537tm.f1503a = key;
                c0537tm.b = (byte[]) zc.c.fromModel(value);
            }
            if (c0537tm != null) {
                arrayList.add(c0537tm);
            }
        }
        Object[] array = arrayList.toArray(new C0537tm[0]);
        if (array != null) {
            return (C0537tm[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, Object> toModel(C0537tm[] c0537tmArr) {
        Map<String, Zc> c = this.f1453a.c();
        ArrayList arrayList = new ArrayList();
        for (C0537tm c0537tm : c0537tmArr) {
            Zc zc = c.get(c0537tm.f1503a);
            Pair pair = zc != null ? TuplesKt.to(c0537tm.f1503a, zc.c.toModel(c0537tm.b)) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return MapsKt.toMap(arrayList);
    }
}
