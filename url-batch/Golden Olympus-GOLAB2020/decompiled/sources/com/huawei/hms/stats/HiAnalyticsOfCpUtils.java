package com.huawei.hms.stats;

import android.content.Context;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hms.utils.HMSBIInitializer;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class HiAnalyticsOfCpUtils {

    /* renamed from: a, reason: collision with root package name */
    private static HiAnalyticsInstance f14273a;

    private static HiAnalyticsInstance a(Context context) {
        HiAnalyticsInstance analyticsInstance = HMSBIInitializer.getInstance(context).getAnalyticsInstance();
        f14273a = analyticsInstance;
        return analyticsInstance;
    }

    public static void onEvent(Context context, String str, String str2) {
        if (a(context) != null) {
            f14273a.onEvent(context, str, str2);
        }
    }

    public static void onReport(Context context, int i4) {
        if (a(context) != null) {
            f14273a.onReport(i4);
        }
    }

    public static void onStreamEvent(Context context, int i4, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a(context) != null) {
            f14273a.onStreamEvent(i4, str, linkedHashMap);
        }
    }

    public static void onEvent(Context context, int i4, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a(context) != null) {
            f14273a.onEvent(i4, str, linkedHashMap);
        }
    }
}
