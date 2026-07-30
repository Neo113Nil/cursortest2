package com.crrepa.band.my.profile.strava.model;

import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class StravaRetrofitClient extends com.moyoung.dafit.module.common.network.a {
    private StravaApiStores apiStores;

    private static class RetrofitClientHolder {
        private static final StravaRetrofitClient INSTANCE = new StravaRetrofitClient();

        private RetrofitClientHolder() {
        }
    }

    public static StravaRetrofitClient getInstance() {
        return RetrofitClientHolder.INSTANCE;
    }

    public StravaApiStores getApiStores() {
        if (this.apiStores == null) {
            resetApiStores();
        }
        return this.apiStores;
    }

    public void resetApiStores() {
        this.apiStores = (StravaApiStores) buildApiService(StravaApiStores.BASE_STRAVA_URL, "Bearer " + g.getInstance().getString("access_token", ""), com.moyoung.dafit.module.common.network.b.create(), StravaApiStores.class);
    }

    private StravaRetrofitClient() {
        com.moyoung.dafit.module.common.network.e.setErrorHandler();
    }
}
