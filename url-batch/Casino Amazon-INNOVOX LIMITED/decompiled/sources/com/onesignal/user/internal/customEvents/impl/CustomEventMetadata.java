package com.onesignal.user.internal.customEvents.impl;

import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.core.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CustomEventMetadata.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/onesignal/user/internal/customEvents/impl/CustomEventMetadata;", "", "deviceType", "", "sdk", "appVersion", "type", "deviceModel", "deviceOS", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppVersion", "()Ljava/lang/String;", "getDeviceModel", "getDeviceOS", "getDeviceType", "getSdk", "getType", "toJSONObject", "Lorg/json/JSONObject;", "toString", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomEventMetadata {
    private static final String APP_VERSION = "app_version";
    private static final String DEVICE_MODEL = "device_model";
    private static final String DEVICE_OS = "device_os";
    private static final String DEVICE_TYPE = "device_type";
    private static final String SDK = "sdk";
    private static final String TYPE = "type";
    private final String appVersion;
    private final String deviceModel;
    private final String deviceOS;
    private final String deviceType;
    private final String sdk;
    private final String type;

    public CustomEventMetadata(String str, String str2, String str3, String str4, String str5, String str6) {
        this.deviceType = str;
        this.sdk = str2;
        this.appVersion = str3;
        this.type = str4;
        this.deviceModel = str5;
        this.deviceOS = str6;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final String getSdk() {
        return this.sdk;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getType() {
        return this.type;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDeviceOS() {
        return this.deviceOS;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObjectExtensionsKt.putSafe(jSONObject, "sdk", this.sdk);
        JSONObjectExtensionsKt.putSafe(jSONObject, APP_VERSION, this.appVersion);
        JSONObjectExtensionsKt.putSafe(jSONObject, "type", this.type);
        JSONObjectExtensionsKt.putSafe(jSONObject, "device_type", this.deviceType);
        JSONObjectExtensionsKt.putSafe(jSONObject, DEVICE_MODEL, this.deviceModel);
        JSONObjectExtensionsKt.putSafe(jSONObject, DEVICE_OS, this.deviceOS);
        return jSONObject;
    }

    public String toString() {
        String jSONObject = toJSONObject().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }
}
