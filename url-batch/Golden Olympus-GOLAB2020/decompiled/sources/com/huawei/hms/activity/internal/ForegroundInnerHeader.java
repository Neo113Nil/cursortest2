package com.huawei.hms.activity.internal;

import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ForegroundInnerHeader {

    /* renamed from: a, reason: collision with root package name */
    private int f13806a;

    /* renamed from: b, reason: collision with root package name */
    private String f13807b;

    /* renamed from: c, reason: collision with root package name */
    private String f13808c;

    public void fromJson(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f13806a = JsonUtil.getIntValue(jSONObject, "apkVersion");
            this.f13807b = JsonUtil.getStringValue(jSONObject, "action");
            this.f13808c = JsonUtil.getStringValue(jSONObject, "responseCallbackKey");
        } catch (JSONException e4) {
            HMSLog.e("ForegroundInnerHeader", "fromJson failed: " + e4.getMessage());
        }
    }

    public String getAction() {
        return this.f13807b;
    }

    public int getApkVersion() {
        return this.f13806a;
    }

    public String getResponseCallbackKey() {
        return this.f13808c;
    }

    public void setAction(String str) {
        this.f13807b = str;
    }

    public void setApkVersion(int i4) {
        this.f13806a = i4;
    }

    public void setResponseCallbackKey(String str) {
        this.f13808c = str;
    }

    public String toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("apkVersion", this.f13806a);
            jSONObject.put("action", this.f13807b);
            jSONObject.put("responseCallbackKey", this.f13808c);
        } catch (JSONException e4) {
            HMSLog.e("ForegroundInnerHeader", "ForegroundInnerHeader toJson failed: " + e4.getMessage());
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "apkVersion:" + this.f13806a + ", action:" + this.f13807b + ", responseCallbackKey:" + this.f13808c;
    }
}
