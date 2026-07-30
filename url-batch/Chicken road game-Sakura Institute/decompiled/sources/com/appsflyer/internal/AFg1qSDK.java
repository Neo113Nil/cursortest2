package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFg1qSDK {
    final String AFInAppEventParameterName;
    final int AFInAppEventType;
    final int AFKeystoreWrapper;
    final int valueOf;
    final int values;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1qSDK)) {
            return false;
        }
        AFg1qSDK aFg1qSDK = (AFg1qSDK) obj;
        return this.AFKeystoreWrapper == aFg1qSDK.AFKeystoreWrapper && this.AFInAppEventType == aFg1qSDK.AFInAppEventType && this.values == aFg1qSDK.values && this.valueOf == aFg1qSDK.valueOf && Intrinsics.areEqual(this.AFInAppEventParameterName, aFg1qSDK.AFInAppEventParameterName);
    }

    public final int hashCode() {
        return (((((((Integer.hashCode(this.AFKeystoreWrapper) * 31) + Integer.hashCode(this.AFInAppEventType)) * 31) + Integer.hashCode(this.values)) * 31) + Integer.hashCode(this.valueOf)) * 31) + this.AFInAppEventParameterName.hashCode();
    }

    public final String toString() {
        return new StringBuilder("CmpTcfData(policyVersion=").append(this.AFKeystoreWrapper).append(", gdprApplies=").append(this.AFInAppEventType).append(", cmpSdkId=").append(this.values).append(", cmpSdkVersion=").append(this.valueOf).append(", tcString=").append(this.AFInAppEventParameterName).append(')').toString();
    }

    public AFg1qSDK(int i, int i2, int i3, int i4, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFKeystoreWrapper = i;
        this.AFInAppEventType = i2;
        this.values = i3;
        this.valueOf = i4;
        this.AFInAppEventParameterName = str;
    }
}
