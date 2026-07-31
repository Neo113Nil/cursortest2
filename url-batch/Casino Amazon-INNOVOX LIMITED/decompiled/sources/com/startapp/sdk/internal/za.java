package com.startapp.sdk.internal;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class za {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f523a = new ConcurrentHashMap();
    public final pa b;
    public final pa c;

    public za(pa paVar, pa paVar2) {
        this.b = paVar;
        this.c = paVar2;
    }

    public final ya a(String str) {
        if (this.f523a.containsKey(str)) {
            return (ya) this.f523a.get(str);
        }
        ya yaVar = new ya(new l8(this.b, this.c));
        this.f523a.put(str, yaVar);
        return yaVar;
    }
}
