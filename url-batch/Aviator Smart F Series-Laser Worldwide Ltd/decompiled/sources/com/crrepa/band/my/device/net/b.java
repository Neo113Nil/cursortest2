package com.crrepa.band.my.device.net;

import com.moyoung.dafit.module.common.network.e;

/* loaded from: classes2.dex */
public class b extends com.moyoung.dafit.module.common.network.a {
    private com.crrepa.band.my.device.net.a apiStores;

    /* renamed from: com.crrepa.band.my.device.net.b$b, reason: collision with other inner class name */
    private static class C0181b {
        private static final b INSTANCE = new b();

        private C0181b() {
        }
    }

    public static b getInstance() {
        return C0181b.INSTANCE;
    }

    public com.crrepa.band.my.device.net.a getApiStores() {
        if (this.apiStores == null) {
            this.apiStores = (com.crrepa.band.my.device.net.a) buildApiService("https://api.moyoung.com/", com.moyoung.dafit.module.common.network.b.create(), com.crrepa.band.my.device.net.a.class);
        }
        return this.apiStores;
    }

    private b() {
        e.setErrorHandler();
    }
}
