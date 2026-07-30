package com.crrepa.band.my.device.appmarket.model;

import com.moyoung.dafit.module.common.network.e;

/* loaded from: classes2.dex */
public class AppMarketRetrofitClient extends com.moyoung.dafit.module.common.network.a {
    private AppMarketApiStores apiStores;

    private static class RetrofitClientHolder {
        private static final AppMarketRetrofitClient INSTANCE = new AppMarketRetrofitClient();

        private RetrofitClientHolder() {
        }
    }

    public static AppMarketRetrofitClient get() {
        return RetrofitClientHolder.INSTANCE;
    }

    public AppMarketApiStores getApiStores() {
        if (this.apiStores == null) {
            this.apiStores = (AppMarketApiStores) buildApiService("https://api.moyoung.com/", com.moyoung.dafit.module.common.network.b.create(), AppMarketApiStores.class);
        }
        return this.apiStores;
    }

    private AppMarketRetrofitClient() {
        e.setErrorHandler();
    }
}
