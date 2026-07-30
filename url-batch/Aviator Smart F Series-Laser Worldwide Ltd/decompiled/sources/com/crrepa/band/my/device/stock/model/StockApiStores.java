package com.crrepa.band.my.device.stock.model;

import io.reactivex.Observable;
import java.util.List;
import r7.f;
import r7.t;

/* loaded from: classes2.dex */
public interface StockApiStores {
    public static final String BASE_STOCK_URL = "https://wr.moyoung.com/";

    @f("stock/quotes")
    Observable<BaseResponseBean<List<StockDetailBean>>> requestStockDetail(@t("symbols") String str);

    @f("stock/spark")
    Observable<BaseResponseBean<List<StockSparkBean>>> requestStockSpark(@t("symbols") String str, @t("interval") String str2, @t("range") String str3);

    @f("stock/search")
    Observable<BaseResponseBean<List<StockSearchBean>>> searchStock(@t("q") String str);
}
