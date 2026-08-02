package com.startapp.sdk.internal;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class sb {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f7560a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ib f7561b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f7562c;

    public sb(ib ibVar, ib ibVar2) {
        this.f7561b = ibVar;
        this.f7562c = ibVar2;
    }

    public final rb a(String str) {
        if (this.f7560a.containsKey(str)) {
            return (rb) this.f7560a.get(str);
        }
        rb rbVar = new rb(new a9(this.f7561b, this.f7562c));
        this.f7560a.put(str, rbVar);
        return rbVar;
    }
}
