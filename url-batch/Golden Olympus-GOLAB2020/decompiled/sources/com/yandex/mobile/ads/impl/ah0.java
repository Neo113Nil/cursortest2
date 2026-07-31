package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ah0 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f23277a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f23278b;

    public final synchronized Map<String, String> a() {
        try {
            if (this.f23278b == null) {
                this.f23278b = Collections.unmodifiableMap(new HashMap(this.f23277a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f23278b;
    }
}
