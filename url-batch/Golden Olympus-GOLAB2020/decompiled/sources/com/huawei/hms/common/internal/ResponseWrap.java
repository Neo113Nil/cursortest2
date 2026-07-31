package com.huawei.hms.common.internal;

import android.text.TextUtils;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import com.ironsource.b9;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ResponseWrap {

    /* renamed from: a, reason: collision with root package name */
    private String f14095a;

    /* renamed from: b, reason: collision with root package name */
    private ResponseHeader f14096b;

    public ResponseWrap(ResponseHeader responseHeader) {
        this.f14096b = responseHeader;
    }

    public boolean fromJson(String str) {
        if (this.f14096b == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f14096b.setStatusCode(JsonUtil.getIntValue(jSONObject, "status_code"));
            this.f14096b.setErrorCode(JsonUtil.getIntValue(jSONObject, "error_code"));
            this.f14096b.setErrorReason(JsonUtil.getStringValue(jSONObject, "error_reason"));
            this.f14096b.setSrvName(JsonUtil.getStringValue(jSONObject, "srv_name"));
            this.f14096b.setApiName(JsonUtil.getStringValue(jSONObject, "api_name"));
            this.f14096b.setAppID(JsonUtil.getStringValue(jSONObject, "app_id"));
            this.f14096b.setPkgName(JsonUtil.getStringValue(jSONObject, "pkg_name"));
            this.f14096b.setSessionId(JsonUtil.getStringValue(jSONObject, "session_id"));
            this.f14096b.setTransactionId(JsonUtil.getStringValue(jSONObject, "transaction_id"));
            this.f14096b.setResolution(JsonUtil.getStringValue(jSONObject, CommonCode.MapKey.HAS_RESOLUTION));
            this.f14095a = JsonUtil.getStringValue(jSONObject, b9.h.f15438E0);
            return true;
        } catch (JSONException e4) {
            HMSLog.e("ResponseWrap", "fromJson failed: " + e4.getMessage());
            return false;
        }
    }

    public String getBody() {
        if (TextUtils.isEmpty(this.f14095a)) {
            this.f14095a = new JSONObject().toString();
        }
        return this.f14095a;
    }

    public ResponseHeader getResponseHeader() {
        return this.f14096b;
    }

    public void setBody(String str) {
        this.f14095a = str;
    }

    public void setResponseHeader(ResponseHeader responseHeader) {
        this.f14096b = responseHeader;
    }

    public String toJson() {
        if (this.f14096b == null) {
            return "{}";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status_code", this.f14096b.getStatusCode());
            jSONObject.put("error_code", this.f14096b.getErrorCode());
            jSONObject.put("error_reason", this.f14096b.getErrorReason());
            jSONObject.put("srv_name", this.f14096b.getSrvName());
            jSONObject.put("api_name", this.f14096b.getApiName());
            jSONObject.put("app_id", this.f14096b.getAppID());
            jSONObject.put("pkg_name", this.f14096b.getPkgName());
            jSONObject.put("transaction_id", this.f14096b.getTransactionId());
            jSONObject.put(CommonCode.MapKey.HAS_RESOLUTION, this.f14096b.getResolution());
            String sessionId = this.f14096b.getSessionId();
            if (!TextUtils.isEmpty(sessionId)) {
                jSONObject.put("session_id", sessionId);
            }
            if (!TextUtils.isEmpty(this.f14095a)) {
                jSONObject.put(b9.h.f15438E0, this.f14095a);
            }
        } catch (JSONException e4) {
            HMSLog.e("ResponseWrap", "toJson failed: " + e4.getMessage());
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "ResponseWrap{body='" + this.f14095a + "', responseHeader=" + this.f14096b + '}';
    }
}
