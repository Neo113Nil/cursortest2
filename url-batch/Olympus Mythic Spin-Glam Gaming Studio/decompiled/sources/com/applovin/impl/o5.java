package com.applovin.impl;

import com.applovin.impl.v;

/* loaded from: classes.dex */
public class o5 extends i5 {
    private final a g;

    public interface a {
        void a(v.a aVar);
    }

    public o5(com.applovin.impl.sdk.k kVar, a aVar) {
        super("TaskCollectAdvertisingId", kVar, true);
        this.g = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.g.a(this.a.A().f());
    }
}
