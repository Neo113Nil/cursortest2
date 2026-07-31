package com.yandex.mobile.ads.impl;

import com.appsflyer.AdRevenueScheme;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lp1 {
    @Nullable
    public static C2366yd a(@NotNull ip1.b reportType, @NotNull Map reportData, @Nullable String str, @Nullable C1795a4 c1795a4) {
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        try {
            int ordinal = reportType.ordinal();
            if (ordinal == 0) {
                return new C2366yd(EnumC2389zd.f35554e, c(str, reportData));
            }
            if (ordinal == 4) {
                return new C2366yd(EnumC2389zd.f35553d, a(str, reportData));
            }
            if (ordinal == 8) {
                return new C2366yd(EnumC2389zd.f35552c, a(reportData));
            }
            if (ordinal == 21) {
                return new C2366yd(EnumC2389zd.f35555f, a(reportData, c1795a4, str));
            }
            if (ordinal == 26) {
                return new C2366yd(EnumC2389zd.f35556g, b(str, reportData));
            }
            if (ordinal != 37) {
                return null;
            }
            return new C2366yd(EnumC2389zd.f35557h, d(str, reportData));
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r3 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static JSONObject b(String str, Map map) {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        Object obj2 = map.get(AdRevenueScheme.AD_TYPE);
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put(AdRevenueScheme.AD_TYPE, obj2);
        Object obj3 = map.get("block_id");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("block_id", obj3);
        Object obj4 = map.get(HianalyticsBaseData.SDK_VERSION);
        if (obj4 == null) {
            obj4 = JSONObject.NULL;
        }
        jSONObject.put(HianalyticsBaseData.SDK_VERSION, obj4);
        if (str != null) {
            obj = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(obj, "toLowerCase(...)");
        }
        obj = JSONObject.NULL;
        jSONObject.put("ad_network", obj);
        Object obj5 = map.get("ad_id");
        if (obj5 != null) {
            jSONObject.put("banner_id", obj5);
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r3 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static JSONObject c(String str, Map map) {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        Object obj2 = map.get(AdRevenueScheme.AD_TYPE);
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put(AdRevenueScheme.AD_TYPE, obj2);
        Object obj3 = map.get("block_id");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("block_id", obj3);
        Object obj4 = map.get(HianalyticsBaseData.SDK_VERSION);
        if (obj4 == null) {
            obj4 = JSONObject.NULL;
        }
        jSONObject.put(HianalyticsBaseData.SDK_VERSION, obj4);
        if (str != null) {
            obj = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(obj, "toLowerCase(...)");
        }
        obj = JSONObject.NULL;
        jSONObject.put("ad_network", obj);
        Object obj5 = map.get("ad_id");
        if (obj5 != null) {
            jSONObject.put("banner_id", obj5);
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r3 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static JSONObject d(String str, Map map) {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        Object obj2 = map.get(AdRevenueScheme.AD_TYPE);
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put(AdRevenueScheme.AD_TYPE, obj2);
        Object obj3 = map.get("block_id");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("block_id", obj3);
        Object obj4 = map.get(HianalyticsBaseData.SDK_VERSION);
        if (obj4 == null) {
            obj4 = JSONObject.NULL;
        }
        jSONObject.put(HianalyticsBaseData.SDK_VERSION, obj4);
        if (str != null) {
            obj = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(obj, "toLowerCase(...)");
        }
        obj = JSONObject.NULL;
        jSONObject.put("ad_network", obj);
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r3 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static JSONObject a(String str, Map map) {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        Object obj2 = map.get(AdRevenueScheme.AD_TYPE);
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put(AdRevenueScheme.AD_TYPE, obj2);
        Object obj3 = map.get("block_id");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("block_id", obj3);
        Object obj4 = map.get(HianalyticsBaseData.SDK_VERSION);
        if (obj4 == null) {
            obj4 = JSONObject.NULL;
        }
        jSONObject.put(HianalyticsBaseData.SDK_VERSION, obj4);
        if (str != null) {
            obj = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(obj, "toLowerCase(...)");
        }
        obj = JSONObject.NULL;
        jSONObject.put("ad_network", obj);
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r5 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static JSONObject a(Map map, C1795a4 c1795a4, String str) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        JSONObject jSONObject = new JSONObject();
        Object obj5 = map.get(AdRevenueScheme.AD_TYPE);
        if (obj5 == null) {
            obj5 = JSONObject.NULL;
        }
        jSONObject.put(AdRevenueScheme.AD_TYPE, obj5);
        Object obj6 = map.get("block_id");
        if (obj6 == null) {
            obj6 = JSONObject.NULL;
        }
        jSONObject.put("block_id", obj6);
        Object obj7 = map.get(HianalyticsBaseData.SDK_VERSION);
        if (obj7 == null) {
            obj7 = JSONObject.NULL;
        }
        jSONObject.put(HianalyticsBaseData.SDK_VERSION, obj7);
        if (str != null) {
            obj = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(obj, "toLowerCase(...)");
        }
        obj = JSONObject.NULL;
        jSONObject.put("ad_network", obj);
        Object obj8 = map.get("ad_id");
        if (obj8 != null) {
            jSONObject.put("banner_id", obj8);
        }
        JSONObject jSONObject2 = null;
        String c4 = c1795a4 != null ? c1795a4.c() : null;
        if (c4 != null) {
            try {
                jSONObject2 = new JSONObject(c4);
            } catch (Throwable unused) {
                Object[] args = new Object[0];
                int i4 = ap0.f23396b;
                Intrinsics.checkNotNullParameter(args, "args");
            }
        }
        if (jSONObject2 == null || (obj2 = jSONObject2.optString("revenue")) == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("ad_revenue", obj2);
        if (jSONObject2 == null || (obj3 = jSONObject2.optString("currency")) == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("currency", obj3);
        if (jSONObject2 == null || (obj4 = jSONObject2.optString("precision")) == null) {
            obj4 = JSONObject.NULL;
        }
        jSONObject.put("precision", obj4);
        return jSONObject;
    }

    private static JSONObject a(Map map) {
        JSONObject jSONObject = new JSONObject();
        Object obj = map.get(AdRevenueScheme.AD_TYPE);
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put(AdRevenueScheme.AD_TYPE, obj);
        Object obj2 = map.get("block_id");
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("block_id", obj2);
        Object obj3 = map.get(HianalyticsBaseData.SDK_VERSION);
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put(HianalyticsBaseData.SDK_VERSION, obj3);
        return jSONObject;
    }
}
