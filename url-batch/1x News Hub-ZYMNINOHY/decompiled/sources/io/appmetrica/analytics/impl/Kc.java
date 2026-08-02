package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Kc {

    /* renamed from: a, reason: collision with root package name */
    public final Map f6232a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6233b;

    public Kc(Object obj) {
        this(new HashMap(), obj);
    }

    public final void a(Object obj, Object obj2) {
        this.f6232a.put(obj, obj2);
    }

    public Kc(HashMap hashMap, Object obj) {
        this.f6232a = hashMap;
        this.f6233b = obj;
    }

    public final Object a(Object obj) {
        Object obj2 = this.f6232a.get(obj);
        return obj2 == null ? this.f6233b : obj2;
    }
}
