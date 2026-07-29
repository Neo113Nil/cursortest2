package com.umeng.analytics.dplus;

import android.content.Context;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.statistics.common.MLog;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class UMADplus {
    public static void track(Context context, String str) {
        if (!AnalyticsConfig.FLAG_DPLUS) {
            MLog.e("UMADplus class is Dplus API, can't be use in no-Dplus scenario.");
            UMConfigure.umDebugLog.aq("A_15001", 0, "\\|");
        } else {
            MobclickAgent.getAgent().a(context, str, (Map<String, Object>) null);
        }
    }

    public static void track(Context context, String str, Map<String, Object> map) {
        if (!AnalyticsConfig.FLAG_DPLUS) {
            MLog.e("UMADplus class is Dplus API, can't be use in no-Dplus scenario.");
            UMConfigure.umDebugLog.aq("A_15001", 0, "\\|");
            return;
        }
        if (map == null || map.size() <= 0) {
            MLog.e("the map is null!");
            UMConfigure.umDebugLog.aq("A_15013", 0, "\\|");
        }
        MobclickAgent.getAgent().a(context, str, map);
    }

    public static void registerSuperProperty(Context context, String str, Object obj) {
        if (!AnalyticsConfig.FLAG_DPLUS) {
            MLog.e("UMADplus class is Dplus API, can't be use in no-Dplus scenario.");
            UMConfigure.umDebugLog.aq("A_15002", 0, "\\|");
        } else {
            MobclickAgent.getAgent().a(context, str, obj);
        }
    }

    public static void unregisterSuperProperty(Context context, String str) {
        if (!AnalyticsConfig.FLAG_DPLUS) {
            MLog.e("UMADplus class is Dplus API, can't be use in no-Dplus scenario.");
            UMConfigure.umDebugLog.aq("A_15003", 0, "\\|");
        } else {
            MobclickAgent.getAgent().d(context, str);
        }
    }

    public static Object getSuperProperty(Context context, String str) {
        if (!AnalyticsConfig.FLAG_DPLUS) {
            MLog.e("UMADplus class is Dplus API, can't be use in no-Dplus scenario.");
            UMConfigure.umDebugLog.aq("A_15004", 0, "\\|");
            return null;
        }
        return MobclickAgent.getAgent().e(context, str);
    }

    public static String getSuperProperties(Context context) {
        if (!AnalyticsConfig.FLAG_DPLUS) {
            MLog.e("UMADplus class is Dplus API, can't be use in no-Dplus scenario.");
            UMConfigure.umDebugLog.aq("A_15005", 0, "\\|");
            return null;
        }
        return MobclickAgent.getAgent().e(context);
    }

    public static void clearSuperProperties(Context context) {
        if (!AnalyticsConfig.FLAG_DPLUS) {
            MLog.e("UMADplus class is Dplus API, can't be use in no-Dplus scenario.");
            UMConfigure.umDebugLog.aq("A_15006", 0, "\\|");
        } else {
            MobclickAgent.getAgent().f(context);
        }
    }

    public static void setFirstLaunchEvent(Context context, List<String> list) {
        if (!AnalyticsConfig.FLAG_DPLUS) {
            MLog.e("UMADplus class is Dplus API, can't be use in no-Dplus scenario.");
            UMConfigure.umDebugLog.aq("A_15007", 0, "\\|");
        } else {
            MobclickAgent.getAgent().a(context, list);
        }
    }

    public static void registerPreProperties(Context context, JSONObject jSONObject) {
        if (!AnalyticsConfig.FLAG_DPLUS) {
            MLog.e("UMADplus class is Dplus API, can't be use in no-Dplus scenario.");
            UMConfigure.umDebugLog.aq("A_15008", 0, "\\|");
        } else {
            MobclickAgent.getAgent().a(context, jSONObject);
        }
    }

    public static void unregisterPreProperty(Context context, String str) {
        if (!AnalyticsConfig.FLAG_DPLUS) {
            MLog.e("UMADplus class is Dplus API, can't be use in no-Dplus scenario.");
            UMConfigure.umDebugLog.aq("A_15009", 0, "\\|");
        } else {
            MobclickAgent.getAgent().f(context, str);
        }
    }

    public static void clearPreProperties(Context context) {
        if (!AnalyticsConfig.FLAG_DPLUS) {
            MLog.e("UMADplus class is Dplus API, can't be use in no-Dplus scenario.");
            UMConfigure.umDebugLog.aq("A_15010", 0, "\\|");
        } else {
            MobclickAgent.getAgent().g(context);
        }
    }

    public static JSONObject getPreProperties(Context context) {
        if (!AnalyticsConfig.FLAG_DPLUS) {
            MLog.e("UMADplus class is Dplus API, can't be use in no-Dplus scenario.");
            UMConfigure.umDebugLog.aq("A_15011", 0, "\\|");
            return null;
        }
        return MobclickAgent.getAgent().h(context);
    }
}
