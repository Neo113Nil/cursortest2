package com.startapp.sdk.internal;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class sb {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f4423a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ib f4424b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f4425c;

    public sb(ib ibVar, ib ibVar2) {
        this.f4424b = ibVar;
        this.f4425c = ibVar2;
    }

    public final rb a(String str) {
        if (this.f4423a.containsKey(str)) {
            return (rb) this.f4423a.get(str);
        }
        rb rbVar = new rb(new a9(this.f4424b, this.f4425c));
        this.f4423a.put(str, rbVar);
        return rbVar;
    }
}
