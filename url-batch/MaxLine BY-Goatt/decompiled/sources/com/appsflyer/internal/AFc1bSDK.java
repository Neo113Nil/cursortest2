package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFc1bSDK {
    public final String AFInAppEventType;
    public final String AFKeystoreWrapper;
    public final AFc1aSDK valueOf;

    public AFc1bSDK(String str, String str2, AFc1aSDK aFc1aSDK) {
        str.getClass();
        aFc1aSDK.getClass();
        this.AFKeystoreWrapper = str;
        this.AFInAppEventType = str2;
        this.valueOf = aFc1aSDK;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1bSDK)) {
            return false;
        }
        AFc1bSDK aFc1bSDK = (AFc1bSDK) obj;
        return Intrinsics.b(this.AFKeystoreWrapper, aFc1bSDK.AFKeystoreWrapper) && Intrinsics.b(this.AFInAppEventType, aFc1bSDK.AFInAppEventType) && this.valueOf == aFc1bSDK.valueOf;
    }

    public final int hashCode() {
        int hashCode = this.AFKeystoreWrapper.hashCode() * 31;
        String str = this.AFInAppEventType;
        return this.valueOf.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AFc1bSDK(AFInAppEventType=");
        sb.append(this.AFKeystoreWrapper);
        sb.append(", AFInAppEventParameterName=");
        sb.append(this.AFInAppEventType);
        sb.append(", valueOf=");
        sb.append(this.valueOf);
        sb.append(')');
        return sb.toString();
    }
}
