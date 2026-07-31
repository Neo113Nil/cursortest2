package com.applovin.impl;

import org.json.JSONObject;

/* loaded from: classes8.dex */
public class n0 extends i5 {
    private final String g;
    private final com.applovin.impl.sdk.network.a h;

    public n0(String str, com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
        super("CommunicatorRequestTask", kVar, str);
        this.g = str;
        this.h = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.q0().a(new a(this.h, this.a, d()));
    }

    class a extends l6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z) {
            super(aVar, kVar, z);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i) {
            this.a.t().a(n0.this.g, n0.this.h.f(), i, jSONObject, null, true);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            this.a.t().a(n0.this.g, n0.this.h.f(), i, jSONObject, str2, false);
        }
    }
}
