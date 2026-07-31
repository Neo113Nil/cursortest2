package com.ironsource.sdk.controller;

import com.ironsource.b9;
import com.ironsource.dh;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.nm;
import com.ironsource.o8;
import com.ironsource.o9;
import com.ironsource.p8;
import com.ironsource.sdk.utils.SDKUtils;
import com.ironsource.se;
import com.ironsource.ts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FeaturesManager {

    /* renamed from: d, reason: collision with root package name */
    private static volatile FeaturesManager f19088d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final String f19089e = "debugMode";

    /* renamed from: a, reason: collision with root package name */
    private Map<String, ?> f19090a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f19091b = new a();

    /* renamed from: c, reason: collision with root package name */
    private dh f19092c = nm.S().z();

    class a extends ArrayList<String> {
        a() {
            add(b9.d.f15351f);
            add(b9.d.f15350e);
            add(b9.d.f15352g);
            add(b9.d.f15353h);
            add(b9.d.f15354i);
            add(b9.d.f15355j);
            add(b9.d.f15356k);
            add(b9.d.f15357l);
            add(b9.d.f15358m);
        }
    }

    private FeaturesManager() {
        if (f19088d != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
        this.f19090a = new HashMap();
    }

    public static FeaturesManager getInstance() {
        if (f19088d == null) {
            synchronized (FeaturesManager.class) {
                try {
                    if (f19088d == null) {
                        f19088d = new FeaturesManager();
                    }
                } finally {
                }
            }
        }
        return f19088d;
    }

    ArrayList<String> a() {
        return new ArrayList<>(this.f19091b);
    }

    public JSONObject getDataManagerConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return networkConfiguration.has(b9.a.f15290d) ? networkConfiguration.optJSONObject(b9.a.f15290d) : new JSONObject();
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.f19090a.containsKey("debugMode")) {
                num = (Integer) this.f19090a.get("debugMode");
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public o8 getFeatureFlagCatchUrlError() {
        return new o8(SDKUtils.getNetworkConfiguration().optJSONObject(o8.a.f18494c));
    }

    public p8 getFeatureFlagClickCheck() {
        return new p8(SDKUtils.getNetworkConfiguration());
    }

    public se getFeatureFlagHealthCheck() {
        JSONObject a4 = this.f19092c.a(b9.a.f15304r);
        return a4 != null ? new se(a4) : new se(null);
    }

    public int getInitRecoverTrials() {
        JSONObject optJSONObject = SDKUtils.getNetworkConfiguration().optJSONObject(b9.a.f15292f);
        if (optJSONObject != null) {
            return optJSONObject.optInt(b9.a.f15291e, 0);
        }
        return 0;
    }

    public ts getSessionHistoryConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return new ts(networkConfiguration.has(b9.a.f15305s) ? networkConfiguration.optJSONObject(b9.a.f15305s) : new JSONObject());
    }

    public boolean getStopUseOnResumeAndPause() {
        return Boolean.TRUE.equals(this.f19092c.c(b9.a.f15307u));
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f19090a = map;
    }
}
