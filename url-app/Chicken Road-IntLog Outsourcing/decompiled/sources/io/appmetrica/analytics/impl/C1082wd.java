package io.appmetrica.analytics.impl;

import f4.C0430g;
import g4.AbstractC0476u;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.wd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1082wd implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Ck f9521a = C1027ua.k().p();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1091wm[] fromModel(Map<String, ? extends Object> map) {
        C1091wm c1091wm;
        Map<String, C0642fd> c2 = this.f9521a.c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            C0642fd c0642fd = c2.get(key);
            if (c0642fd == null || value == null) {
                c1091wm = null;
            } else {
                c1091wm = new C1091wm();
                c1091wm.f9553a = key;
                c1091wm.f9554b = (byte[]) c0642fd.f8184c.fromModel(value);
            }
            if (c1091wm != null) {
                arrayList.add(c1091wm);
            }
        }
        Object[] array = arrayList.toArray(new C1091wm[0]);
        if (array != null) {
            return (C1091wm[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, Object> toModel(C1091wm[] c1091wmArr) {
        Map<String, C0642fd> c2 = this.f9521a.c();
        ArrayList arrayList = new ArrayList();
        for (C1091wm c1091wm : c1091wmArr) {
            C0642fd c0642fd = c2.get(c1091wm.f9553a);
            C0430g c0430g = c0642fd != null ? new C0430g(c1091wm.f9553a, c0642fd.f8184c.toModel(c1091wm.f9554b)) : null;
            if (c0430g != null) {
                arrayList.add(c0430g);
            }
        }
        return AbstractC0476u.c0(arrayList);
    }
}
