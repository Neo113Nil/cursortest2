package io.appmetrica.analytics.impl;

import b2.C0190d;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.wd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0931wd implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Ck f8567a = C0876ua.k().p();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0940wm[] fromModel(Map<String, ? extends Object> map) {
        C0940wm c0940wm;
        Map<String, C0491fd> c3 = this.f8567a.c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            C0491fd c0491fd = c3.get(key);
            if (c0491fd == null || value == null) {
                c0940wm = null;
            } else {
                c0940wm = new C0940wm();
                c0940wm.f8597a = key;
                c0940wm.f8598b = (byte[]) c0491fd.f7317c.fromModel(value);
            }
            if (c0940wm != null) {
                arrayList.add(c0940wm);
            }
        }
        Object[] array = arrayList.toArray(new C0940wm[0]);
        if (array != null) {
            return (C0940wm[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, Object> toModel(C0940wm[] c0940wmArr) {
        Map<String, C0491fd> c3 = this.f8567a.c();
        ArrayList arrayList = new ArrayList();
        for (C0940wm c0940wm : c0940wmArr) {
            C0491fd c0491fd = c3.get(c0940wm.f8597a);
            C0190d c0190d = c0491fd != null ? new C0190d(c0940wm.f8597a, c0491fd.f7317c.toModel(c0940wm.f8598b)) : null;
            if (c0190d != null) {
                arrayList.add(c0190d);
            }
        }
        return c2.p.f0(arrayList);
    }
}
