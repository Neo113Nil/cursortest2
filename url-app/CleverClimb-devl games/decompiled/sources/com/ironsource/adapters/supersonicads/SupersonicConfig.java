package com.ironsource.adapters.supersonicads;

import android.text.TextUtils;
import com.ironsource.b.d.c;
import com.ironsource.b.e.o;
import com.ironsource.b.e.p;
import com.umeng.commonsdk.proguard.d;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class SupersonicConfig {
    private static SupersonicConfig mInstance;
    private Map<String, String> mOfferwallCustomParams;
    private Map<String, String> mRewardedVideoCustomParams;
    private final String CUSTOM_PARAM_PREFIX = "custom_";
    private final String CLIENT_SIDE_CALLBACKS = "useClientSideCallbacks";
    private final String MAX_VIDEO_LENGTH = "maxVideoLength";
    private final String DYNAMIC_CONTROLLER_URL = "controllerUrl";
    private final String DYNAMIC_CONTROLLER_DEBUG_MODE = "debugMode";
    private final String CAMPAIGN_ID = "campaignId";
    private final String LANGUAGE = d.M;
    private final String APPLICATION_PRIVATE_KEY = "privateKey";
    private final String ITEM_NAME = "itemName";
    private final String ITEM_COUNT = "itemCount";
    o mProviderSettings = new o(p.a().a("Mediation"));

    public static SupersonicConfig getConfigObj() {
        if (mInstance == null) {
            mInstance = new SupersonicConfig();
        }
        return mInstance;
    }

    private SupersonicConfig() {
    }

    public void setClientSideCallbacks(boolean z) {
        this.mProviderSettings.a("useClientSideCallbacks", String.valueOf(z));
    }

    public void setCustomControllerUrl(String str) {
        this.mProviderSettings.a("controllerUrl", str);
        this.mProviderSettings.b("controllerUrl", str);
    }

    public void setDebugMode(int i) {
        this.mProviderSettings.a("debugMode", Integer.valueOf(i));
        this.mProviderSettings.b("debugMode", Integer.valueOf(i));
    }

    public void setCampaignId(String str) {
        this.mProviderSettings.a("campaignId", str);
    }

    public void setLanguage(String str) {
        this.mProviderSettings.a(d.M, str);
        this.mProviderSettings.b(d.M, str);
    }

    public void setRewardedVideoCustomParams(Map<String, String> map) {
        this.mRewardedVideoCustomParams = convertCustomParams(map);
    }

    public void setOfferwallCustomParams(Map<String, String> map) {
        this.mOfferwallCustomParams = convertCustomParams(map);
    }

    private Map<String, String> convertCustomParams(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            try {
                Set<String> keySet = map.keySet();
                if (keySet != null) {
                    for (String str : keySet) {
                        if (!TextUtils.isEmpty(str)) {
                            String str2 = map.get(str);
                            if (!TextUtils.isEmpty(str2)) {
                                hashMap.put("custom_" + str, str2);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                com.ironsource.b.d.d.c().a(c.a.NATIVE, ":convertCustomParams()", e);
            }
        }
        return hashMap;
    }

    public boolean getClientSideCallbacks() {
        if (this.mProviderSettings == null || this.mProviderSettings.b() == null || !this.mProviderSettings.b().has("useClientSideCallbacks")) {
            return false;
        }
        return this.mProviderSettings.b().optBoolean("useClientSideCallbacks", false);
    }

    Map<String, String> getOfferwallCustomParams() {
        return this.mOfferwallCustomParams;
    }

    Map<String, String> getRewardedVideoCustomParams() {
        return this.mRewardedVideoCustomParams;
    }
}
