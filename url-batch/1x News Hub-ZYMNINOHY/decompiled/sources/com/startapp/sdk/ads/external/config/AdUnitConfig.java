package com.startapp.sdk.ads.external.config;

import c2.e;
import c2.n;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.e0;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import s2.l;

/* loaded from: classes.dex */
public final class AdUnitConfig implements Serializable {
    private static final String BID_PRICE_PREFIX = "bp";
    public static final e0 Companion = new e0();
    private static final long serialVersionUID = 6500875630965723979L;
    private String sioPrice;
    private String network = "gam";
    private String adUnitId = "";

    @TypeInfo(type = HashMap.class)
    private Map<String, ? extends List<String>> keyValues = n.f2638a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !r.a(AdUnitConfig.class).equals(r.a(obj.getClass()))) {
            return false;
        }
        AdUnitConfig adUnitConfig = (AdUnitConfig) obj;
        return j.a(this.adUnitId, adUnitConfig.adUnitId) && j.a(this.network, adUnitConfig.network) && si.a((Object) this.sioPrice, (Object) adUnitConfig.sioPrice) && si.a(this.keyValues, adUnitConfig.keyValues);
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getBp() {
        Object obj;
        List list;
        Iterator<T> it = this.keyValues.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (s2.n.X((String) ((Map.Entry) obj).getKey(), BID_PRICE_PREFIX)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || (list = (List) entry.getValue()) == null) {
            return null;
        }
        return (String) e.Q(list);
    }

    public final Map<String, List<String>> getKeyValues() {
        return this.keyValues;
    }

    public final String getNetwork() {
        return this.network;
    }

    public final String getSioPrice() {
        return this.sioPrice;
    }

    public int hashCode() {
        Object[] objArr = {this.adUnitId, this.keyValues, this.sioPrice, this.network};
        WeakHashMap weakHashMap = si.f4438a;
        return Arrays.deepHashCode(objArr);
    }

    public final boolean isValid() {
        String str = this.sioPrice;
        boolean z = (str != null ? l.Q(str) : null) != null;
        String bp = getBp();
        return z & ((bp != null ? l.Q(bp) : null) != null) & (!s2.n.U(this.adUnitId));
    }

    public final void setAdUnitId(String str) {
        j.e(str, "<set-?>");
        this.adUnitId = str;
    }

    public final void setKeyValues(Map<String, ? extends List<String>> map) {
        j.e(map, "<set-?>");
        this.keyValues = map;
    }

    public final void setNetwork(String str) {
        j.e(str, "<set-?>");
        this.network = str;
    }

    public final void setSioPrice(String str) {
        this.sioPrice = str;
    }
}
