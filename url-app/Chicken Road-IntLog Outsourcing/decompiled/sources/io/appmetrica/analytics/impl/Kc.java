package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Kc {

    /* renamed from: a, reason: collision with root package name */
    public final Map f7035a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7036b;

    public Kc(Object obj) {
        this(new HashMap(), obj);
    }

    public final void a(Object obj, Object obj2) {
        this.f7035a.put(obj, obj2);
    }

    public Kc(HashMap hashMap, Object obj) {
        this.f7035a = hashMap;
        this.f7036b = obj;
    }

    public final Object a(Object obj) {
        Object obj2 = this.f7035a.get(obj);
        return obj2 == null ? this.f7036b : obj2;
    }
}
