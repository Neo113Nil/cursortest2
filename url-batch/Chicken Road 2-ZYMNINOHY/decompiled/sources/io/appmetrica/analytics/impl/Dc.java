package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Dc {

    /* renamed from: a, reason: collision with root package name */
    public final Map f10195a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10196b;

    public Dc(Object obj) {
        this(new HashMap(), obj);
    }

    public final void a(Object obj, Object obj2) {
        this.f10195a.put(obj, obj2);
    }

    public Dc(HashMap hashMap, Object obj) {
        this.f10195a = hashMap;
        this.f10196b = obj;
    }

    public final Object a(Object obj) {
        Object obj2 = this.f10195a.get(obj);
        return obj2 == null ? this.f10196b : obj2;
    }
}
