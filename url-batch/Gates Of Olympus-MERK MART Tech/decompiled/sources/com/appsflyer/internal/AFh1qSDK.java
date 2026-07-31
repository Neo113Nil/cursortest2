package com.appsflyer.internal;

import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AFh1qSDK {
    public final AFh1rSDK AFInAppEventParameterName;
    public final AFh1pSDK AFKeystoreWrapper;
    public AFh1sSDK values;

    public AFh1qSDK(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.values = AFInAppEventParameterName(jSONObject);
        this.AFKeystoreWrapper = values(jSONObject);
        this.AFInAppEventParameterName = valueOf(jSONObject);
    }

    private static AFh1rSDK valueOf(JSONObject jSONObject) {
        Object m9577constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject AFKeystoreWrapper = AFKeystoreWrapper(jSONObject, "meta_data");
            m9577constructorimpl = Result.m9577constructorimpl(AFKeystoreWrapper != null ? new AFh1rSDK(AFKeystoreWrapper.optDouble("send_rate", 1.0d)) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m9577constructorimpl = Result.m9577constructorimpl(ResultKt.createFailure(th));
        }
        return (AFh1rSDK) (Result.m9583isFailureimpl(m9577constructorimpl) ? null : m9577constructorimpl);
    }

    private static AFh1pSDK values(JSONObject jSONObject) {
        Object m9577constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject AFKeystoreWrapper = AFKeystoreWrapper(jSONObject, "exc_mngr");
            m9577constructorimpl = Result.m9577constructorimpl(AFKeystoreWrapper != null ? new AFh1pSDK(AFKeystoreWrapper.getString("sdk_ver"), AFKeystoreWrapper.optInt("min", -1), AFKeystoreWrapper.optInt("expire", -1), AFKeystoreWrapper.optLong("ttl", -1L)) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m9577constructorimpl = Result.m9577constructorimpl(ResultKt.createFailure(th));
        }
        return (AFh1pSDK) (Result.m9583isFailureimpl(m9577constructorimpl) ? null : m9577constructorimpl);
    }

    private static AFh1sSDK AFInAppEventParameterName(JSONObject jSONObject) {
        Object m9577constructorimpl;
        AFh1sSDK aFh1sSDK;
        ArrayList emptyList;
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
                    emptyList = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string = optJSONArray.getString(i2);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        emptyList.add(string);
                    }
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
                Intrinsics.checkNotNullExpressionValue(optString, "");
                Intrinsics.checkNotNullExpressionValue(optString2, "");
                aFh1sSDK = new AFh1sSDK(j, optDouble, emptyList, i, optString, optString2);
            } else {
                aFh1sSDK = null;
            }
            m9577constructorimpl = Result.m9577constructorimpl(aFh1sSDK);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m9577constructorimpl = Result.m9577constructorimpl(ResultKt.createFailure(th));
        }
        return (AFh1sSDK) (Result.m9583isFailureimpl(m9577constructorimpl) ? null : m9577constructorimpl);
    }

    private static JSONObject AFKeystoreWrapper(JSONObject jSONObject, String str) throws JSONException, NullPointerException {
        JSONObject optJSONObject;
        if (!jSONObject.has(str) || (optJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) == null) {
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
            AFh1qSDK aFh1qSDK = (AFh1qSDK) obj;
            return Intrinsics.areEqual(this.AFKeystoreWrapper, aFh1qSDK.AFKeystoreWrapper) && Intrinsics.areEqual(this.AFInAppEventParameterName, aFh1qSDK.AFInAppEventParameterName) && Intrinsics.areEqual(this.values, aFh1qSDK.values);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.appsflyer.internal.model.rc.Features");
    }

    public final int hashCode() {
        AFh1pSDK aFh1pSDK = this.AFKeystoreWrapper;
        int hashCode = (aFh1pSDK != null ? aFh1pSDK.hashCode() : 0) * 31;
        AFh1rSDK aFh1rSDK = this.AFInAppEventParameterName;
        int hashCode2 = (hashCode + (aFh1rSDK != null ? aFh1rSDK.hashCode() : 0)) * 31;
        AFh1sSDK aFh1sSDK = this.values;
        return hashCode2 + (aFh1sSDK != null ? aFh1sSDK.hashCode() : 0);
    }
}
