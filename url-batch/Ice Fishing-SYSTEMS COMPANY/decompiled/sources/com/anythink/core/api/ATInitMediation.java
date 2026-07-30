package com.anythink.core.api;

import android.content.Context;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.u.e;
import com.anythink.core.common.v.q;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ATInitMediation {
    public static final String KEY_LOCAL = "anythink_local";
    protected String devBundleName;

    public static boolean getBooleanFromMap(Map<String, Object> map, String str) {
        return getBooleanFromMap(map, str, false);
    }

    public static double getDoubleFromMap(Map<String, Object> map, String str) {
        return getDoubleFromMap(map, str, 0.0d);
    }

    public static int getIntFromMap(Map<String, Object> map, String str) {
        return getIntFromMap(map, str, 0);
    }

    public static long getLongFromMap(Map<String, Object> map, String str) {
        return getLongFromMap(map, str, 0L);
    }

    public static String getStringFromMap(Map<String, Object> map, String str) {
        return getStringFromMap(map, str, "");
    }

    public final void checkToSaveInitData(String str, Map<String, Object> map, String... strArr) {
        t.b().a(str, map, strArr);
    }

    public List getActivityStatus() {
        return null;
    }

    public String getAdapterVersion() {
        return "";
    }

    public String getBundleName() {
        return t.b().U();
    }

    public String getDevBundleName() {
        return this.devBundleName;
    }

    public List getMetaValutStatus() {
        return null;
    }

    public String getNetworkName() {
        return "";
    }

    public String getNetworkSDKClass() {
        return "";
    }

    public String getNetworkVersion() {
        return "";
    }

    public List getPermissionStatus() {
        return null;
    }

    public Map<String, Boolean> getPluginClassStatus() {
        return null;
    }

    public List getProviderStatus() {
        return null;
    }

    public List getResourceStatus() {
        return null;
    }

    public List getServiceStatus() {
        return null;
    }

    public String getUserId() {
        Map<String, Object> m8 = t.b().m();
        return m8 != null ? getStringFromMap(m8, "user_id") : "";
    }

    public abstract void initSDK(Context context, Map<String, Object> map, MediationInitCallback mediationInitCallback);

    public boolean needCheckAdapterVersion() {
        return true;
    }

    public final void runOnMainThread(Runnable runnable) {
        t.b().b(runnable);
    }

    public final void runOnThreadPool(Runnable runnable) {
        t.b();
        t.c(runnable);
    }

    public final void sendNetworkEvent(final int i, final int i4, final Map<String, Object> map) {
        runOnThreadPool(new Runnable() { // from class: com.anythink.core.api.ATInitMediation.1
            @Override // java.lang.Runnable
            public final void run() {
                int i9 = i;
                int i10 = i4;
                Map map2 = map;
                if (i9 == 2 && i10 == 10001 && map2 != null) {
                    try {
                        long b9 = q.b((Map<String, Object>) map2, "init_st");
                        long b10 = q.b((Map<String, Object>) map2, "init_et");
                        long b11 = q.b((Map<String, Object>) map2, "token_st");
                        long b12 = q.b((Map<String, Object>) map2, "token_et");
                        e.a(q.a((Map<String, Object>) map2, ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "-1"), q.a((Map<String, Object>) map2, "admob_init_adsource_id", ""), q.a((Map<String, Object>) map2, "admob_token_adsource_id", ""), q.a((Map<String, Object>) map2, j.w.f12767G, 0), b9, b10, b11, b12, (b9 <= 0 || b10 <= 0 || b11 <= 0 || b12 <= 0 || b9 <= b11) ? -1L : b10 - b11);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    public void setDevBundleName(String str) {
        this.devBundleName = str;
    }

    public boolean setUserDataConsent(Context context, boolean z8, boolean z9) {
        return false;
    }

    public static boolean getBooleanFromMap(Map<String, Object> map, String str, boolean z8) {
        return ((Boolean) q.a(map, str, Boolean.valueOf(z8))).booleanValue();
    }

    public static double getDoubleFromMap(Map<String, Object> map, String str, double d2) {
        return ((Double) q.a(map, str, Double.valueOf(d2))).doubleValue();
    }

    public static int getIntFromMap(Map<String, Object> map, String str, int i) {
        return ((Integer) q.a(map, str, Integer.valueOf(i))).intValue();
    }

    public static long getLongFromMap(Map<String, Object> map, String str, long j9) {
        return ((Long) q.a(map, str, Long.valueOf(j9))).longValue();
    }

    public static String getStringFromMap(Map<String, Object> map, String str, String str2) {
        return (String) q.a(map, str, str2);
    }
}
