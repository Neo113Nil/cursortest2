package com.onesignal.user.internal.customEvents.impl;

import com.onesignal.common.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {
    private static final String APP_VERSION = "app_version";
    public static final a Companion = new a(null);
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

    public c(String str, String str2, String str3, String str4, String str5, String str6) {
        this.deviceType = str;
        this.sdk = str2;
        this.appVersion = str3;
        this.type = str4;
        this.deviceModel = str5;
        this.deviceOS = str6;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDeviceOS() {
        return this.deviceOS;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final String getSdk() {
        return this.sdk;
    }

    public final String getType() {
        return this.type;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        e.putSafe(jSONObject, SDK, this.sdk);
        e.putSafe(jSONObject, APP_VERSION, this.appVersion);
        e.putSafe(jSONObject, "type", this.type);
        e.putSafe(jSONObject, DEVICE_TYPE, this.deviceType);
        e.putSafe(jSONObject, DEVICE_MODEL, this.deviceModel);
        e.putSafe(jSONObject, DEVICE_OS, this.deviceOS);
        return jSONObject;
    }

    public String toString() {
        String jSONObject = toJSONObject().toString();
        jSONObject.getClass();
        return jSONObject;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
