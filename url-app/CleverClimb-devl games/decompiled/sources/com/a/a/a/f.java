package com.a.a.a;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class f<T> {

    /* renamed from: a, reason: collision with root package name */
    protected int f2243a;

    /* renamed from: b, reason: collision with root package name */
    protected T f2244b;

    /* renamed from: c, reason: collision with root package name */
    protected e f2245c;

    /* renamed from: d, reason: collision with root package name */
    protected HashMap<String, String> f2246d = new HashMap<>();

    public f(e eVar, int i, T t) {
        this.f2244b = t;
        this.f2245c = eVar;
        this.f2243a = i;
    }

    public e a() {
        return this.f2245c;
    }

    public void a(Map<String, String> map) {
        this.f2246d = new HashMap<>(map);
    }

    public T b() {
        return this.f2244b;
    }

    public int c() {
        return this.f2243a;
    }
}
