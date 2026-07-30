package com.crrepa.band.my.device.stock.model;

/* loaded from: classes2.dex */
public class StockRetrofitClient extends com.moyoung.dafit.module.common.network.a {
    private StockApiStores apiStores;

    private static class RetrofitClientHolder {
        private static final StockRetrofitClient INSTANCE = new StockRetrofitClient();

        private RetrofitClientHolder() {
        }
    }

    public static StockRetrofitClient getInstance() {
        return RetrofitClientHolder.INSTANCE;
    }

    public StockApiStores getApiStores() {
        if (this.apiStores == null) {
            this.apiStores = (StockApiStores) buildApiService(StockApiStores.BASE_STOCK_URL, com.moyoung.dafit.module.common.network.b.create(), StockApiStores.class);
        }
        return this.apiStores;
    }

    private StockRetrofitClient() {
        com.moyoung.dafit.module.common.network.e.setErrorHandler();
    }
}
