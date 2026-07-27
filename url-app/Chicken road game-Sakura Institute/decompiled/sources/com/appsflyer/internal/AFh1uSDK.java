package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFh1uSDK {
    public Boolean AFInAppEventParameterName;
    public Boolean AFInAppEventType;
    public String AFKeystoreWrapper;
    public Map<String, Object> AFLogger;

    /* renamed from: d, reason: collision with root package name */
    public String f5952d;
    public Boolean registerClient;
    public Boolean valueOf;
    public Boolean values;

    public AFh1uSDK() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFh1uSDK)) {
            return false;
        }
        AFh1uSDK aFh1uSDK = (AFh1uSDK) obj;
        return Intrinsics.a(this.AFKeystoreWrapper, aFh1uSDK.AFKeystoreWrapper) && Intrinsics.a(this.AFInAppEventParameterName, aFh1uSDK.AFInAppEventParameterName) && Intrinsics.a(this.valueOf, aFh1uSDK.valueOf) && Intrinsics.a(this.AFInAppEventType, aFh1uSDK.AFInAppEventType) && Intrinsics.a(this.values, aFh1uSDK.values) && Intrinsics.a(this.f5952d, aFh1uSDK.f5952d) && Intrinsics.a(this.registerClient, aFh1uSDK.registerClient) && Intrinsics.a(this.AFLogger, aFh1uSDK.AFLogger);
    }

    public final int hashCode() {
        String str = this.AFKeystoreWrapper;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.AFInAppEventParameterName;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.valueOf;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.AFInAppEventType;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.values;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.f5952d;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.registerClient;
        return this.AFLogger.hashCode() + ((hashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AFh1uSDK(values=");
        sb.append(this.AFKeystoreWrapper);
        sb.append(", registerClient=");
        sb.append(this.AFInAppEventParameterName);
        sb.append(", AFInAppEventParameterName=");
        sb.append(this.valueOf);
        sb.append(", AFInAppEventType=");
        sb.append(this.AFInAppEventType);
        sb.append(", valueOf=");
        sb.append(this.values);
        sb.append(", AFKeystoreWrapper=");
        sb.append(this.f5952d);
        sb.append(", unregisterClient=");
        sb.append(this.registerClient);
        sb.append(", AFLogger=");
        sb.append(this.AFLogger);
        sb.append(')');
        return sb.toString();
    }

    private AFh1uSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.AFKeystoreWrapper = str;
        this.AFInAppEventParameterName = bool;
        this.valueOf = bool2;
        this.AFInAppEventType = bool3;
        this.values = bool4;
        this.f5952d = str2;
        this.registerClient = bool5;
        this.AFLogger = map;
    }

    public /* synthetic */ AFh1uSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? null : bool2, (i2 & 8) != 0 ? null : bool3, (i2 & 16) != 0 ? null : bool4, (i2 & 32) != 0 ? null : str2, (i2 & 64) == 0 ? bool5 : null, (i2 & 128) != 0 ? new HashMap() : map);
    }
}
