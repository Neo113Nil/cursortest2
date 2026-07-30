package com.crrepa.band.my.device.cricket.net;

/* loaded from: classes2.dex */
public class b extends com.moyoung.dafit.module.common.network.a {
    private com.crrepa.band.my.device.cricket.net.a apiStores;

    private static class a {
        private static final b INSTANCE = new b();

        private a() {
        }
    }

    public static b getInstance() {
        return a.INSTANCE;
    }

    public com.crrepa.band.my.device.cricket.net.a getApiStores() {
        if (this.apiStores == null) {
            this.apiStores = (com.crrepa.band.my.device.cricket.net.a) buildApiService(com.crrepa.band.my.device.cricket.net.a.BASE_URL, com.moyoung.dafit.module.common.network.b.create(), com.crrepa.band.my.device.cricket.net.a.class);
        }
        return this.apiStores;
    }
}
