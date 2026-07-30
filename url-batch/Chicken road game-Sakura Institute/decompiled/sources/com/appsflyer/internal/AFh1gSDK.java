package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AFh1gSDK {
    public AFh1hSDK AFInAppEventType;
    public final AFh1eSDK AFKeystoreWrapper;
    public final AFh1fSDK valueOf;

    public AFh1gSDK(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.AFInAppEventType = AFKeystoreWrapper(jSONObject);
        this.valueOf = valueOf(jSONObject);
        this.AFKeystoreWrapper = AFInAppEventType(jSONObject);
    }

    private static AFh1eSDK AFInAppEventType(JSONObject jSONObject) {
        Object m6819constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject AFKeystoreWrapper = AFKeystoreWrapper(jSONObject, "meta_data");
            m6819constructorimpl = Result.m6819constructorimpl(AFKeystoreWrapper != null ? new AFh1eSDK(AFKeystoreWrapper.optDouble("send_rate", 1.0d)) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m6819constructorimpl = Result.m6819constructorimpl(ResultKt.createFailure(th));
        }
        return (AFh1eSDK) (Result.m6825isFailureimpl(m6819constructorimpl) ? null : m6819constructorimpl);
    }

    private static AFh1fSDK valueOf(JSONObject jSONObject) {
        Object m6819constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject AFKeystoreWrapper = AFKeystoreWrapper(jSONObject, "exc_mngr");
            m6819constructorimpl = Result.m6819constructorimpl(AFKeystoreWrapper != null ? new AFh1fSDK(AFKeystoreWrapper.getString("sdk_ver"), AFKeystoreWrapper.optInt("min", -1), AFKeystoreWrapper.optInt("expire", -1), AFKeystoreWrapper.optLong("ttl", -1L)) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m6819constructorimpl = Result.m6819constructorimpl(ResultKt.createFailure(th));
        }
        return (AFh1fSDK) (Result.m6825isFailureimpl(m6819constructorimpl) ? null : m6819constructorimpl);
    }

    private static AFh1hSDK AFKeystoreWrapper(JSONObject jSONObject) {
        Object m6819constructorimpl;
        AFh1hSDK aFh1hSDK;
        List emptyList;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject AFKeystoreWrapper = AFKeystoreWrapper(jSONObject, "r_debugger");
            if (AFKeystoreWrapper != null) {
                long j = AFKeystoreWrapper.getLong("ttl");
                int i = AFKeystoreWrapper.getInt("counter");
                String optString = AFKeystoreWrapper.optString("app_ver", "");
                String optString2 = AFKeystoreWrapper.optString("sdk_ver", "");
                float optDouble = (float) AFKeystoreWrapper.optDouble("ratio", 1.0d);
                JSONArray optJSONArray = AFKeystoreWrapper.optJSONArray("tags");
                if (optJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(optJSONArray, "");
                    ArrayList arrayList = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string = optJSONArray.getString(i2);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        arrayList.add(string);
                    }
                    emptyList = arrayList;
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
                Intrinsics.checkNotNullExpressionValue(optString, "");
                Intrinsics.checkNotNullExpressionValue(optString2, "");
                aFh1hSDK = new AFh1hSDK(j, optDouble, emptyList, i, optString, optString2);
            } else {
                aFh1hSDK = null;
            }
            m6819constructorimpl = Result.m6819constructorimpl(aFh1hSDK);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m6819constructorimpl = Result.m6819constructorimpl(ResultKt.createFailure(th));
        }
        return (AFh1hSDK) (Result.m6825isFailureimpl(m6819constructorimpl) ? null : m6819constructorimpl);
    }

    private static JSONObject AFKeystoreWrapper(JSONObject jSONObject, String str) throws JSONException, NullPointerException {
        JSONObject optJSONObject;
        if (!jSONObject.has(str) || (optJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("v1");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            AFh1gSDK aFh1gSDK = (AFh1gSDK) obj;
            return Intrinsics.areEqual(this.valueOf, aFh1gSDK.valueOf) && Intrinsics.areEqual(this.AFKeystoreWrapper, aFh1gSDK.AFKeystoreWrapper) && Intrinsics.areEqual(this.AFInAppEventType, aFh1gSDK.AFInAppEventType);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.appsflyer.internal.model.rc.Features");
    }

    public final int hashCode() {
        AFh1fSDK aFh1fSDK = this.valueOf;
        int hashCode = (aFh1fSDK != null ? aFh1fSDK.hashCode() : 0) * 31;
        AFh1eSDK aFh1eSDK = this.AFKeystoreWrapper;
        int hashCode2 = (hashCode + (aFh1eSDK != null ? aFh1eSDK.hashCode() : 0)) * 31;
        AFh1hSDK aFh1hSDK = this.AFInAppEventType;
        return hashCode2 + (aFh1hSDK != null ? aFh1hSDK.hashCode() : 0);
    }
}
