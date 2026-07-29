package com.applovin.impl.sdk.d;

import com.applovin.impl.sdk.k;

/* loaded from: classes.dex */
public class i extends com.applovin.impl.sdk.d.a {

    /* renamed from: a, reason: collision with root package name */
    private final a f3094a;

    public interface a {
        void a(k.a aVar);
    }

    public i(com.applovin.impl.sdk.j jVar, a aVar) {
        super("TaskCollectAdvertisingId", jVar);
        this.f3094a = aVar;
    }

    @Override // com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.f3057b;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f3094a.a(b().G().d());
    }
}
