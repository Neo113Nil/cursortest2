package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Fd implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C3124yk f37535a = Ia.j().o();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2996tm[] fromModel(@NotNull Map<String, ? extends Object> map) {
        C2996tm c2996tm;
        Map<String, C2987td> c4 = this.f37535a.c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            C2987td c2987td = c4.get(key);
            if (c2987td == null || value == null) {
                c2996tm = null;
            } else {
                c2996tm = new C2996tm();
                c2996tm.f39876a = key;
                c2996tm.f39877b = (byte[]) c2987td.f39856c.fromModel(value);
            }
            if (c2996tm != null) {
                arrayList.add(c2996tm);
            }
        }
        Object[] array = arrayList.toArray(new C2996tm[0]);
        if (array != null) {
            return (C2996tm[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, Object> toModel(@NotNull C2996tm[] c2996tmArr) {
        Map<String, C2987td> c4 = this.f37535a.c();
        ArrayList arrayList = new ArrayList();
        for (C2996tm c2996tm : c2996tmArr) {
            C2987td c2987td = c4.get(c2996tm.f39876a);
            Pair pair = c2987td != null ? TuplesKt.to(c2996tm.f39876a, c2987td.f39856c.toModel(c2996tm.f39877b)) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return MapsKt.toMap(arrayList);
    }
}
