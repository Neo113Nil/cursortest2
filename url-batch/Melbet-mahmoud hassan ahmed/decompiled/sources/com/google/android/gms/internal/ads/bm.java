package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class bm {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f3465a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f3466b;

    public final synchronized Map<String, String> a() {
        if (this.f3466b == null) {
            this.f3466b = Collections.unmodifiableMap(new HashMap(this.f3465a));
        }
        return this.f3466b;
    }
}
