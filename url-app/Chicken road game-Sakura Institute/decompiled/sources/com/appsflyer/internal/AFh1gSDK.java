package com.appsflyer.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import y2.C1342q;
import z2.C1405I;

/* loaded from: classes.dex */
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
        Object a4;
        try {
            AbstractC1341p.a aVar = AbstractC1341p.f11673d;
            JSONObject AFKeystoreWrapper = AFKeystoreWrapper(jSONObject, "meta_data");
            a4 = AFKeystoreWrapper != null ? new AFh1eSDK(AFKeystoreWrapper.optDouble("send_rate", 1.0d)) : null;
        } catch (Throwable th) {
            AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
            a4 = AbstractC1343r.a(th);
        }
        return (AFh1eSDK) (a4 instanceof C1342q ? null : a4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static AFh1hSDK AFKeystoreWrapper(JSONObject jSONObject) {
        Object a4;
        C1405I c1405i;
        try {
            AbstractC1341p.a aVar = AbstractC1341p.f11673d;
            JSONObject AFKeystoreWrapper = AFKeystoreWrapper(jSONObject, "r_debugger");
            if (AFKeystoreWrapper != null) {
                long j4 = AFKeystoreWrapper.getLong("ttl");
                int i2 = AFKeystoreWrapper.getInt("counter");
                String optString = AFKeystoreWrapper.optString("app_ver", "");
                String optString2 = AFKeystoreWrapper.optString("sdk_ver", "");
                float optDouble = (float) AFKeystoreWrapper.optDouble("ratio", 1.0d);
                JSONArray optJSONArray = AFKeystoreWrapper.optJSONArray("tags");
                if (optJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(optJSONArray, "");
                    ArrayList arrayList = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i4 = 0; i4 < length; i4++) {
                        String string = optJSONArray.getString(i4);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        arrayList.add(string);
                    }
                    c1405i = arrayList;
                } else {
                    c1405i = C1405I.f11931d;
                }
                Intrinsics.checkNotNullExpressionValue(optString, "");
                Intrinsics.checkNotNullExpressionValue(optString2, "");
                a4 = new AFh1hSDK(j4, optDouble, c1405i, i2, optString, optString2);
            } else {
                a4 = null;
            }
        } catch (Throwable th) {
            AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
            a4 = AbstractC1343r.a(th);
        }
        AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
        return (AFh1hSDK) (a4 instanceof C1342q ? null : a4);
    }

    private static AFh1fSDK valueOf(JSONObject jSONObject) {
        Object a4;
        try {
            AbstractC1341p.a aVar = AbstractC1341p.f11673d;
            JSONObject AFKeystoreWrapper = AFKeystoreWrapper(jSONObject, "exc_mngr");
            a4 = AFKeystoreWrapper != null ? new AFh1fSDK(AFKeystoreWrapper.getString("sdk_ver"), AFKeystoreWrapper.optInt("min", -1), AFKeystoreWrapper.optInt("expire", -1), AFKeystoreWrapper.optLong("ttl", -1L)) : null;
        } catch (Throwable th) {
            AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
            a4 = AbstractC1343r.a(th);
        }
        return (AFh1fSDK) (a4 instanceof C1342q ? null : a4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AFh1gSDK.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.appsflyer.internal.model.rc.Features");
        }
        AFh1gSDK aFh1gSDK = (AFh1gSDK) obj;
        return Intrinsics.a(this.valueOf, aFh1gSDK.valueOf) && Intrinsics.a(this.AFKeystoreWrapper, aFh1gSDK.AFKeystoreWrapper) && Intrinsics.a(this.AFInAppEventType, aFh1gSDK.AFInAppEventType);
    }

    public final int hashCode() {
        AFh1fSDK aFh1fSDK = this.valueOf;
        int hashCode = (aFh1fSDK != null ? aFh1fSDK.hashCode() : 0) * 31;
        AFh1eSDK aFh1eSDK = this.AFKeystoreWrapper;
        int hashCode2 = (hashCode + (aFh1eSDK != null ? aFh1eSDK.hashCode() : 0)) * 31;
        AFh1hSDK aFh1hSDK = this.AFInAppEventType;
        return hashCode2 + (aFh1hSDK != null ? aFh1hSDK.hashCode() : 0);
    }

    private static JSONObject AFKeystoreWrapper(JSONObject jSONObject, String str) {
        JSONObject optJSONObject;
        if (!jSONObject.has(str) || (optJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("v1");
    }
}
