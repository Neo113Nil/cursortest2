package com.ironsource.mediationsdk.logger;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.ironsource.da;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.o9;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private IronSourceLogger.IronSourceTag f17663a;

    /* renamed from: b, reason: collision with root package name */
    private String f17664b;

    /* renamed from: c, reason: collision with root package name */
    private String f17665c;

    /* renamed from: d, reason: collision with root package name */
    private int f17666d;

    public c(IronSourceLogger.IronSourceTag ironSourceTag, String str, String str2, int i4) {
        this.f17663a = ironSourceTag;
        this.f17664b = str;
        this.f17665c = str2;
        this.f17666d = i4;
    }

    public int a() {
        return this.f17666d;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(da.a.f15878d, this.f17664b);
            jSONObject.put("tag", this.f17663a);
            jSONObject.put(FirebaseAnalytics.Param.LEVEL, this.f17666d);
            jSONObject.put(CrashHianalyticsData.MESSAGE, this.f17665c);
            return jSONObject;
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return jSONObject;
        }
    }
}
