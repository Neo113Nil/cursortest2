package com.huawei.hms.framework.common.hianalytics;

import com.huawei.hms.framework.common.Logger;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class HianalyticsBaseData {
    public static final String EVENT_ID = "url_request";
    public static final int FALSE = 0;
    public static final String SDK_NAME = "sdk_name";
    public static final String SDK_TYPE = "sdk_type";
    public static final String SDK_VERSION = "sdk_version";
    public static final int TRUE = 1;

    /* renamed from: a, reason: collision with root package name */
    private LinkedHashMap f14156a;

    public HianalyticsBaseData() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f14156a = linkedHashMap;
        linkedHashMap.put(SDK_TYPE, "UxPP");
        this.f14156a.put(SDK_NAME, "networkkit");
    }

    public LinkedHashMap<String, String> get() {
        return this.f14156a;
    }

    public HianalyticsBaseData put(String str, String str2) {
        if (str != null && str2 != null) {
            this.f14156a.put(str, str2);
            return this;
        }
        Logger.v("HianalyticsBaseData", "key = " + str + " : value = " + str2);
        return this;
    }

    public HianalyticsBaseData putIfNotDefault(String str, long j4, long j5) {
        return j4 == j5 ? this : put(str, j4);
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : get().entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e4) {
            Logger.w("HianalyticsBaseData", "catch JSONException", e4);
        }
        return jSONObject.toString();
    }

    public HianalyticsBaseData put(String str, long j4) {
        if (str == null) {
            Logger.v("HianalyticsBaseData", "key = null : value = " + j4);
            return this;
        }
        this.f14156a.put(str, "" + j4);
        return this;
    }

    public HianalyticsBaseData put(LinkedHashMap<String, String> linkedHashMap) {
        if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
            this.f14156a.putAll(linkedHashMap);
            return this;
        }
        Logger.v("HianalyticsBaseData", "data is null");
        return this;
    }
}
