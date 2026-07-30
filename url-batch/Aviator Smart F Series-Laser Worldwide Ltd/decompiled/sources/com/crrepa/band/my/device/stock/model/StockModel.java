package com.crrepa.band.my.device.stock.model;

import android.accounts.NetworkErrorException;
import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.baidu.ar.util.SystemInfoUtil;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.ble.conn.bean.CRPStockInfo;
import com.crrepa.ble.conn.bean.CRPStockPriceInfo;
import com.github.mikephil.charting.utils.i;
import com.moyoung.dafit.module.common.network.provider.g;
import com.orhanobut.logger.f;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public class StockModel {
    private static final int NET_RESULT_OK = 200;
    public static final String STOCK_SORT_SYMBOL_MAP = "stock_sort_symbol_map";
    private final StockApiStores apiStores = StockRetrofitClient.getInstance().getApiStores();

    private List<StockDetailBean> convertStockItemListBySpark(List<StockDetailBean> list, List<StockSparkBean> list2) {
        for (StockDetailBean stockDetailBean : list) {
            Iterator<StockSparkBean> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    StockSparkBean next = it.next();
                    if (Objects.equals(stockDetailBean.getSymbol(), next.getSymbol())) {
                        stockDetailBean.setMarkup(getStockMarkup(next, stockDetailBean));
                        break;
                    }
                }
            }
        }
        return list;
    }

    private List<CRPStockBean> covert2CRPStockList(List<StockDetailBean> list) {
        LinkedHashMap<String, Object> savedStockMap = getSavedStockMap();
        ArrayList arrayList = new ArrayList();
        for (StockDetailBean stockDetailBean : list) {
            Integer num = (Integer) savedStockMap.get(stockDetailBean.getSymbol());
            if (num != null) {
                CRPStockInfo cRPStockInfo = new CRPStockInfo();
                cRPStockInfo.setId(num.byteValue());
                cRPStockInfo.setAbbreviation(stockDetailBean.getShortName());
                cRPStockInfo.setCode(stockDetailBean.getSymbol());
                cRPStockInfo.setCurrency(stockDetailBean.getCurrency());
                cRPStockInfo.setExchange(stockDetailBean.getExchange());
                float regularMarketPrice = (float) (((stockDetailBean.getRegularMarketPrice() - stockDetailBean.getRegularMarketPreviousClose()) / stockDetailBean.getRegularMarketPreviousClose()) * 100.0d);
                f.d("changePercent: " + regularMarketPrice);
                CRPStockPriceInfo cRPStockPriceInfo = new CRPStockPriceInfo();
                cRPStockPriceInfo.setId(num.byteValue());
                cRPStockPriceInfo.setEnable(stockDetailBean.isStockOpening());
                cRPStockPriceInfo.setMarketValue(stockDetailBean.getMarketCap());
                cRPStockPriceInfo.setHighestPrice((float) stockDetailBean.getRegularMarketDayHigh());
                cRPStockPriceInfo.setLowestPrice((float) stockDetailBean.getRegularMarketDayLow());
                cRPStockPriceInfo.setChange(stockDetailBean.getMarkup().floatValue());
                cRPStockPriceInfo.setAverage(stockDetailBean.getAverageDailyVolume3Month());
                cRPStockPriceInfo.setChangePercent(regularMarketPrice);
                cRPStockPriceInfo.setOpeningPrice((float) stockDetailBean.getRegularMarketOpen());
                cRPStockPriceInfo.setPe(stockDetailBean.getPeRatio());
                cRPStockPriceInfo.setPrice((float) stockDetailBean.getRegularMarketPrice());
                cRPStockPriceInfo.setTurnover(stockDetailBean.getRegularMarketVolume());
                cRPStockPriceInfo.setYearHighestPrice((float) stockDetailBean.getFiftyTwoWeekHigh());
                cRPStockPriceInfo.setYearLowestPrice((float) stockDetailBean.getFiftyTwoWeekLow());
                arrayList.add(new CRPStockBean(cRPStockInfo, cRPStockPriceInfo));
            }
        }
        return arrayList;
    }

    public static void deleteSortAndSymbol(String str) {
        LinkedHashMap<String, Object> savedStockMap = getSavedStockMap();
        if (savedStockMap.isEmpty()) {
            return;
        }
        Integer num = (Integer) savedStockMap.get(str);
        if (num != null) {
            i4.getInstance().deleteStock(num.byteValue());
        }
        savedStockMap.remove(str);
        g.getInstance().putMap(STOCK_SORT_SYMBOL_MAP, savedStockMap);
    }

    private static LinkedHashMap<String, Object> getSavedStockMap() {
        return g.getInstance().getMap(STOCK_SORT_SYMBOL_MAP);
    }

    public static byte[] getSavedStockSortIdArray() {
        LinkedHashMap<String, Object> savedStockMap = getSavedStockMap();
        if (savedStockMap.isEmpty()) {
            return null;
        }
        Set<String> keySet = savedStockMap.keySet();
        byte[] bArr = new byte[keySet.size()];
        Iterator<String> it = keySet.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Integer num = (Integer) savedStockMap.get(it.next());
            if (num != null) {
                bArr[i8] = num.byteValue();
                i8++;
            }
        }
        return bArr;
    }

    public static String getSavedSymbols() {
        LinkedHashMap<String, Object> savedStockMap = getSavedStockMap();
        if (savedStockMap.isEmpty()) {
            return null;
        }
        Set<String> keySet = savedStockMap.keySet();
        StringBuilder sb = new StringBuilder();
        for (String str : keySet) {
            if (sb.length() == 0) {
                sb = new StringBuilder(str);
            } else {
                sb.append(SystemInfoUtil.COMMA);
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static BigDecimal getStockMarkup(StockSparkBean stockSparkBean, StockDetailBean stockDetailBean) {
        double regularMarketPrice = stockDetailBean.getRegularMarketPrice();
        return regularMarketPrice == i.DOUBLE_EPSILON ? new BigDecimal("0") : new BigDecimal(Double.toString(regularMarketPrice)).subtract(new BigDecimal(Double.toString(stockSparkBean.getPreviousClose())));
    }

    public static String getSymbols(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            if (sb.length() == 0) {
                sb = new StringBuilder(str);
            } else {
                sb.append(SystemInfoUtil.COMMA);
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static boolean isAddedSymbol(String[] strArr, String str) {
        if (strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$requestStockDetail$1(BaseResponseBean baseResponseBean) {
        if (baseResponseBean == null || baseResponseBean.getCod() != 200 || baseResponseBean.getData() == null) {
            throw new NetworkErrorException("net error");
        }
        return (List) baseResponseBean.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestStockDetailForWatch$3(String str, List list) {
        if (list != null) {
            requestStockSparkForWatch(list, str);
        } else {
            i4.getInstance().clearStock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$requestStockSpark$2(List list, BaseResponseBean baseResponseBean) {
        if (baseResponseBean == null || baseResponseBean.getCod() != 200 || baseResponseBean.getData() == null) {
            throw new NetworkErrorException("net error");
        }
        return convertStockItemListBySpark(list, (List) baseResponseBean.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestStockSparkForWatch$4(List list) {
        if (list != null) {
            sendStock2Watch(list);
        } else {
            i4.getInstance().clearStock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$searchStock$0(BaseResponseBean baseResponseBean) {
        if (baseResponseBean == null || baseResponseBean.getCod() != 200 || baseResponseBean.getData() == null) {
            throw new NetworkErrorException("net error");
        }
        return (List) baseResponseBean.getData();
    }

    @SuppressLint({"CheckResult"})
    private void requestStockSparkForWatch(List<StockDetailBean> list, String str) {
        requestStockSpark(list, str).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.stock.model.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                StockModel.this.lambda$requestStockSparkForWatch$4((List) obj);
            }
        });
    }

    public static void resetStockSort(List<String> list) {
        LinkedHashMap<String, Object> savedStockMap = getSavedStockMap();
        if (savedStockMap.isEmpty()) {
            return;
        }
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        for (int i8 = 0; i8 < list.size(); i8++) {
            String str = list.get(i8);
            Integer num = (Integer) savedStockMap.get(str);
            if (num != null) {
                linkedHashMap.put(str, Byte.valueOf(num.byteValue()));
            }
        }
        g.getInstance().putMap(STOCK_SORT_SYMBOL_MAP, linkedHashMap);
        i4.getInstance().resetStockList(getSavedStockSortIdArray());
    }

    private void sendStock2Watch(List<StockDetailBean> list) {
        i4.getInstance().clearStock();
        for (CRPStockBean cRPStockBean : covert2CRPStockList(list)) {
            i4.getInstance().sendStock(cRPStockBean.getStockInfo(), cRPStockBean.getStockPriceInfo());
        }
    }

    public Observable<List<StockDetailBean>> requestStockDetail(String str) {
        return this.apiStores.requestStockDetail(str).map(new Function() { // from class: com.crrepa.band.my.device.stock.model.d
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List lambda$requestStockDetail$1;
                lambda$requestStockDetail$1 = StockModel.lambda$requestStockDetail$1((BaseResponseBean) obj);
                return lambda$requestStockDetail$1;
            }
        });
    }

    @SuppressLint({"CheckResult"})
    public void requestStockDetailForWatch() {
        final String savedSymbols = getSavedSymbols();
        if (TextUtils.isEmpty(savedSymbols)) {
            i4.getInstance().clearStock();
        } else {
            requestStockDetail(savedSymbols).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.stock.model.e
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    StockModel.this.lambda$requestStockDetailForWatch$3(savedSymbols, (List) obj);
                }
            });
        }
    }

    public Observable<List<StockDetailBean>> requestStockSpark(final List<StockDetailBean> list, String str) {
        return this.apiStores.requestStockSpark(str, "30m", "1d").map(new Function() { // from class: com.crrepa.band.my.device.stock.model.a
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List lambda$requestStockSpark$2;
                lambda$requestStockSpark$2 = StockModel.this.lambda$requestStockSpark$2(list, (BaseResponseBean) obj);
                return lambda$requestStockSpark$2;
            }
        });
    }

    public void saveSortAndSymbol(String str) {
        LinkedHashMap<String, Object> savedStockMap = getSavedStockMap();
        byte b8 = 0;
        if (savedStockMap.isEmpty()) {
            savedStockMap = new LinkedHashMap<>();
        } else {
            Collection<Object> values = savedStockMap.values();
            int supportStockCount = com.crrepa.band.my.device.stock.c.getSupportStockCount();
            int i8 = 0;
            while (true) {
                if (i8 >= supportStockCount) {
                    break;
                }
                if (!values.contains(Integer.valueOf(i8))) {
                    b8 = Integer.valueOf(i8).byteValue();
                    break;
                }
                i8++;
            }
        }
        savedStockMap.put(str, Byte.valueOf(b8));
        g.getInstance().putMap(STOCK_SORT_SYMBOL_MAP, savedStockMap);
        requestStockDetailForWatch();
    }

    @SuppressLint({"CheckResult"})
    public Observable<List<StockSearchBean>> searchStock(String str) {
        return this.apiStores.searchStock(str).map(new Function() { // from class: com.crrepa.band.my.device.stock.model.b
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List lambda$searchStock$0;
                lambda$searchStock$0 = StockModel.lambda$searchStock$0((BaseResponseBean) obj);
                return lambda$searchStock$0;
            }
        });
    }
}
