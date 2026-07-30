package com.anythink.core.api;

import android.util.Log;
import android.util.Pair;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATWaterfallFilter;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ca;
import com.anythink.core.common.v.ab;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* loaded from: classes.dex */
public abstract class ATAdFilter {
    private static final String KEY_BIDDING_TYPE = "biddingType";
    private static final String KEY_E_CPM = "e_cpm";
    private static final String KEY_NETWORK_ID = "networkId";
    private static final String KEY_NETWORK_PLACEMENT_ID = "networkPlacementId";
    private static final String TAG = "anythink_ad_filter";
    private final Stack<Map<String, Object>> stack = new Stack<>();

    public static class a {
        Map<String, Object> filterCondition;
        ca filterData;
        List<b> list;

        public a(Map<String, Object> map, ca caVar) {
            this.filterCondition = map;
            this.filterData = caVar;
            ArrayList arrayList = new ArrayList();
            this.list = arrayList;
            arrayList.add(new e());
            this.list.add(new d());
            this.list.add(new f());
            this.list.add(new c());
        }

        public final AdError filter() {
            Object obj;
            ArrayList arrayList = new ArrayList();
            List<b> list = this.list;
            if (list == null || list.isEmpty()) {
                return null;
            }
            Iterator<b> it = this.list.iterator();
            int i = 0;
            while (it.hasNext()) {
                Pair<Boolean, AdError> filter = it.next().filter(this.filterCondition, this.filterData);
                if (filter != null && (obj = filter.first) != null && ((Boolean) obj).booleanValue()) {
                    i++;
                    Object obj2 = filter.second;
                    if (obj2 != null) {
                        arrayList.add((AdError) obj2);
                    }
                }
            }
            if (arrayList.isEmpty() || arrayList.size() != i) {
                return null;
            }
            return (AdError) arrayList.get(arrayList.size() - 1);
        }
    }

    public interface b {
        Pair<Boolean, AdError> filter(Map<String, Object> map, ca caVar);
    }

    public static class c implements b {
        @Override // com.anythink.core.api.ATAdFilter.b
        public final Pair<Boolean, AdError> filter(Map<String, Object> map, ca caVar) {
            try {
                Object obj = map.get(ATAdFilter.KEY_NETWORK_PLACEMENT_ID);
                if (obj != null && caVar != null && (obj instanceof List)) {
                    List list = (List) obj;
                    if (!list.isEmpty()) {
                        return list.contains(caVar.f14037b) ? new Pair<>(Boolean.TRUE, ErrorCode.getErrorCode(ErrorCode.adSourceLoadUnitFilterError, "", "Filter by network adUnitId.")) : new Pair<>(Boolean.TRUE, null);
                    }
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            return new Pair<>(Boolean.FALSE, null);
        }
    }

    public static class d implements b {
        @Override // com.anythink.core.api.ATAdFilter.b
        public final Pair<Boolean, AdError> filter(Map<String, Object> map, ca caVar) {
            try {
                Object obj = map.get(ATAdFilter.KEY_BIDDING_TYPE);
                if (obj != null && caVar != null && (obj instanceof List)) {
                    List list = (List) obj;
                    if (!list.isEmpty()) {
                        return list.contains(caVar.b()) ? new Pair<>(Boolean.TRUE, ErrorCode.getErrorCode(ErrorCode.adSourceLoadBidTypeFilterError, "", "Filter by bid type.")) : new Pair<>(Boolean.TRUE, null);
                    }
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            return new Pair<>(Boolean.FALSE, null);
        }
    }

    public static class e implements b {
        @Override // com.anythink.core.api.ATAdFilter.b
        public final Pair<Boolean, AdError> filter(Map<String, Object> map, ca caVar) {
            try {
                Object obj = map.get(ATAdFilter.KEY_NETWORK_ID);
                if (obj != null && caVar != null && (obj instanceof List)) {
                    List list = (List) obj;
                    if (!list.isEmpty()) {
                        return list.contains(caVar.f14036a) ? new Pair<>(Boolean.TRUE, ErrorCode.getErrorCode(ErrorCode.networkFirmIdFilterSourceError, "", "Filter by network firm id.")) : new Pair<>(Boolean.TRUE, null);
                    }
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            return new Pair<>(Boolean.FALSE, null);
        }
    }

    public static class f implements b {
        @Override // com.anythink.core.api.ATAdFilter.b
        public final Pair<Boolean, AdError> filter(Map<String, Object> map, ca caVar) {
            ATWaterfallFilter.PriceInterval priceInterval;
            ATAdConst.CURRENCY scurrency;
            try {
                Object obj = map.get(ATAdFilter.KEY_E_CPM);
                if (obj != null && caVar != null && (obj instanceof ATWaterfallFilter.PriceInterval) && (scurrency = (priceInterval = (ATWaterfallFilter.PriceInterval) obj).getScurrency()) != null) {
                    double rmbChangeToUsdRate = scurrency == ATAdConst.CURRENCY.RMB ? ATSDKUtils.getRmbChangeToUsdRate() : scurrency == ATAdConst.CURRENCY.RMB_CENT ? ATSDKUtils.getRmbChangeToUsdRate() * 100.0d : 1.0d;
                    ab.b(ATAdFilter.TAG, "filter price coefficient:".concat(String.valueOf(rmbChangeToUsdRate)));
                    if (rmbChangeToUsdRate != 0.0d) {
                        if (priceInterval.getMorePrice() != null && priceInterval.getLessPrice() != null) {
                            ab.b(ATAdFilter.TAG, "filter price getMorePrice:" + (priceInterval.getMorePrice().doubleValue() * rmbChangeToUsdRate));
                            ab.b(ATAdFilter.TAG, "filter price getLessPrice:" + (priceInterval.getLessPrice().doubleValue() * rmbChangeToUsdRate));
                            ab.b(ATAdFilter.TAG, "filter price getPrice:" + caVar.a());
                            if (priceInterval.getMorePrice().doubleValue() == priceInterval.getLessPrice().doubleValue()) {
                                return caVar.a() == priceInterval.getMorePrice().doubleValue() * rmbChangeToUsdRate ? new Pair<>(Boolean.TRUE, ErrorCode.getErrorCode(ErrorCode.adSourceLoadPriceFilterError, "", "Filter by bid price.")) : new Pair<>(Boolean.TRUE, null);
                            }
                            if (priceInterval.getLessPrice().doubleValue() > priceInterval.getMorePrice().doubleValue()) {
                                return (caVar.a() < priceInterval.getMorePrice().doubleValue() * rmbChangeToUsdRate || caVar.a() > priceInterval.getLessPrice().doubleValue() * rmbChangeToUsdRate) ? new Pair<>(Boolean.TRUE, null) : new Pair<>(Boolean.TRUE, ErrorCode.getErrorCode(ErrorCode.adSourceLoadPriceFilterError, "", "Filter by bid price."));
                            }
                            if (t.b().F()) {
                                Log.e(ATAdFilter.TAG, "filter price min and max is exception:" + priceInterval.getLessPrice() + ":" + priceInterval.getMorePrice());
                            }
                            return new Pair<>(Boolean.TRUE, null);
                        }
                        if (priceInterval.getMorePrice() != null) {
                            ab.b(ATAdFilter.TAG, "filter price getMorePrice:" + (priceInterval.getMorePrice().doubleValue() * rmbChangeToUsdRate));
                            ab.b(ATAdFilter.TAG, "filter price getPrice:" + caVar.a());
                            return caVar.a() >= priceInterval.getMorePrice().doubleValue() * rmbChangeToUsdRate ? new Pair<>(Boolean.TRUE, ErrorCode.getErrorCode(ErrorCode.adSourceLoadPriceFilterError, "", "Filter by bid price.")) : new Pair<>(Boolean.TRUE, null);
                        }
                        if (priceInterval.getLessPrice() != null) {
                            ab.b(ATAdFilter.TAG, "filter price getLessPrice:" + (priceInterval.getLessPrice().doubleValue() * rmbChangeToUsdRate));
                            ab.b(ATAdFilter.TAG, "filter price getPrice:" + caVar.a());
                            return (caVar.a() <= 0.0d || caVar.a() > priceInterval.getLessPrice().doubleValue() * rmbChangeToUsdRate) ? new Pair<>(Boolean.TRUE, null) : new Pair<>(Boolean.TRUE, ErrorCode.getErrorCode(ErrorCode.adSourceLoadPriceFilterError, "", "Filter by bid price."));
                        }
                    } else if (t.b().F()) {
                        Log.e(ATAdFilter.TAG, "filter price coefficient is exception:".concat(String.valueOf(rmbChangeToUsdRate)));
                    }
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            return new Pair<>(Boolean.FALSE, null);
        }
    }

    private synchronized ATAdFilter filter(String str, Object obj) {
        try {
            Map<String, Object> pop = !this.stack.isEmpty() ? this.stack.pop() : null;
            if (pop == null) {
                pop = new HashMap<>();
            }
            pop.put(str, obj);
            this.stack.push(pop);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final AdError doFilter(ca caVar) {
        if (caVar == null) {
            return null;
        }
        try {
            if (this.stack.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(this.stack);
            for (int i = 0; i < arrayList.size(); i++) {
                Map map = (Map) arrayList.get(i);
                if (map != null && !map.isEmpty()) {
                    if (caVar.f14038c != 1 || !map.containsKey(KEY_E_CPM)) {
                        ab.b(TAG, "doFilter start filterData:" + i + ":" + caVar);
                        AdError filter = new a(map, caVar).filter();
                        if (filter != null) {
                            if (t.b().F()) {
                                Log.e(TAG, "doFilter  filter reason:".concat(String.valueOf(filter)));
                            }
                            return filter;
                        }
                    } else if (t.b().F()) {
                        Log.e(TAG, "doFilter start filterData continue:" + i + ":" + caVar);
                    }
                }
                if (t.b().F()) {
                    Log.e(TAG, "doFilter start filterData useless filterCondition" + i + ":" + caVar);
                }
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public ATAdFilter filterAdPrice(ATWaterfallFilter.PriceInterval priceInterval) {
        return filter(KEY_E_CPM, priceInterval);
    }

    public ATAdFilter filterBidTypes(List<String> list) {
        return filter(KEY_BIDDING_TYPE, list);
    }

    public ATAdFilter filterNetworkIds(List<String> list) {
        return filter(KEY_NETWORK_ID, list);
    }

    public ATAdFilter filterNetworkPlacementIds(List<String> list) {
        return filter(KEY_NETWORK_PLACEMENT_ID, list);
    }

    public synchronized ATAdFilter orFilter() {
        this.stack.push(new HashMap());
        return this;
    }
}
