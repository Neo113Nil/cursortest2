package com.startapp.sdk.ads.external.config;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.e0;
import com.startapp.sdk.internal.si;
import d3.r;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.q;
import w3.AbstractC1510g;
import w3.m;
import w3.o;

/* loaded from: classes.dex */
public final class AdUnitConfig implements Serializable {
    private static final String BID_PRICE_PREFIX = "bp";
    public static final e0 Companion = new e0();
    private static final long serialVersionUID = 6500875630965723979L;
    private String sioPrice;
    private String network = "gam";
    private String adUnitId = "";

    @TypeInfo(type = HashMap.class)
    private Map<String, ? extends List<String>> keyValues = r.f8334a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !q.a(AdUnitConfig.class).equals(q.a(obj.getClass()))) {
            return false;
        }
        AdUnitConfig adUnitConfig = (AdUnitConfig) obj;
        return i.a(this.adUnitId, adUnitConfig.adUnitId) && i.a(this.network, adUnitConfig.network) && si.a((Object) this.sioPrice, (Object) adUnitConfig.sioPrice) && si.a(this.keyValues, adUnitConfig.keyValues);
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
            if (o.a0((String) ((Map.Entry) obj).getKey(), BID_PRICE_PREFIX, false)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || (list = (List) entry.getValue()) == null) {
            return null;
        }
        return (String) d3.i.d0(list);
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
        WeakHashMap weakHashMap = si.f7575a;
        return Arrays.deepHashCode(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isValid() {
        Double valueOf;
        String bp;
        String str = this.sioPrice;
        Double d4 = null;
        if (str != null) {
            if (m.U(str)) {
                valueOf = Double.valueOf(Double.parseDouble(str));
                boolean z = valueOf == null;
                bp = getBp();
                if (bp != null) {
                    try {
                        if (m.U(bp)) {
                            d4 = Double.valueOf(Double.parseDouble(bp));
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                return z & (d4 != null) & (!AbstractC1510g.j0(this.adUnitId));
            }
        }
        valueOf = null;
        if (valueOf == null) {
        }
        bp = getBp();
        if (bp != null) {
        }
        return z & (d4 != null) & (!AbstractC1510g.j0(this.adUnitId));
    }

    public final void setAdUnitId(String str) {
        i.e(str, "<set-?>");
        this.adUnitId = str;
    }

    public final void setKeyValues(Map<String, ? extends List<String>> map) {
        i.e(map, "<set-?>");
        this.keyValues = map;
    }

    public final void setNetwork(String str) {
        i.e(str, "<set-?>");
        this.network = str;
    }

    public final void setSioPrice(String str) {
        this.sioPrice = str;
    }
}
