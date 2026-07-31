package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class sq1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f11932a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f11933b;

    public final synchronized Map<String, String> a() {
        if (this.f11933b == null) {
            this.f11933b = Collections.unmodifiableMap(new HashMap(this.f11932a));
        }
        return this.f11933b;
    }
}
