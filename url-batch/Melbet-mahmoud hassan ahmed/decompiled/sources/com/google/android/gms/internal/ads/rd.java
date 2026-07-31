package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class rd<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, AtomicReference<T>> f11106a = new HashMap();

    public final AtomicReference<T> a(String str) {
        synchronized (this) {
            if (!this.f11106a.containsKey(str)) {
                this.f11106a.put(str, new AtomicReference<>());
            }
        }
        return this.f11106a.get(str);
    }
}
