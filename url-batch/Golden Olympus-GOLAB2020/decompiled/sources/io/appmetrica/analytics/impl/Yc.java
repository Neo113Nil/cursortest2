package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class Yc {

    /* renamed from: a, reason: collision with root package name */
    public final Map f38555a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f38556b;

    public Yc(Object obj) {
        this(new HashMap(), obj);
    }

    public final void a(Object obj, Object obj2) {
        this.f38555a.put(obj, obj2);
    }

    public Yc(HashMap hashMap, Object obj) {
        this.f38555a = hashMap;
        this.f38556b = obj;
    }

    public final Object a(Object obj) {
        Object obj2 = this.f38555a.get(obj);
        return obj2 == null ? this.f38556b : obj2;
    }
}
