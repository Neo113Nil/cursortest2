package io.appmetrica.analytics.impl;

import c3.C0292d;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.pd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0872pd implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C1086xk f12578a = C0817na.k().p();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0958sm[] fromModel(Map<String, ? extends Object> map) {
        C0958sm c0958sm;
        Map<String, Yc> c4 = this.f12578a.c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Yc yc = c4.get(key);
            if (yc == null || value == null) {
                c0958sm = null;
            } else {
                c0958sm = new C0958sm();
                c0958sm.f12750a = key;
                c0958sm.f12751b = (byte[]) yc.f11303c.fromModel(value);
            }
            if (c0958sm != null) {
                arrayList.add(c0958sm);
            }
        }
        Object[] array = arrayList.toArray(new C0958sm[0]);
        if (array != null) {
            return (C0958sm[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, Object> toModel(C0958sm[] c0958smArr) {
        Map<String, Yc> c4 = this.f12578a.c();
        ArrayList arrayList = new ArrayList();
        for (C0958sm c0958sm : c0958smArr) {
            Yc yc = c4.get(c0958sm.f12750a);
            C0292d c0292d = yc != null ? new C0292d(c0958sm.f12750a, yc.f11303c.toModel(c0958sm.f12751b)) : null;
            if (c0292d != null) {
                arrayList.add(c0292d);
            }
        }
        return d3.t.F(arrayList);
    }
}
