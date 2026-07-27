package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;

/* loaded from: classes.dex */
public final class AFg1qSDK {
    final String AFInAppEventParameterName;
    final int AFInAppEventType;
    final int AFKeystoreWrapper;
    final int valueOf;
    final int values;

    public AFg1qSDK(int i2, int i4, int i5, int i6, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFKeystoreWrapper = i2;
        this.AFInAppEventType = i4;
        this.values = i5;
        this.valueOf = i6;
        this.AFInAppEventParameterName = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1qSDK)) {
            return false;
        }
        AFg1qSDK aFg1qSDK = (AFg1qSDK) obj;
        return this.AFKeystoreWrapper == aFg1qSDK.AFKeystoreWrapper && this.AFInAppEventType == aFg1qSDK.AFInAppEventType && this.values == aFg1qSDK.values && this.valueOf == aFg1qSDK.valueOf && Intrinsics.a(this.AFInAppEventParameterName, aFg1qSDK.AFInAppEventParameterName);
    }

    public final int hashCode() {
        return this.AFInAppEventParameterName.hashCode() + AbstractC0784j.c(this.valueOf, AbstractC0784j.c(this.values, AbstractC0784j.c(this.AFInAppEventType, Integer.hashCode(this.AFKeystoreWrapper) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CmpTcfData(policyVersion=");
        sb.append(this.AFKeystoreWrapper);
        sb.append(", gdprApplies=");
        sb.append(this.AFInAppEventType);
        sb.append(", cmpSdkId=");
        sb.append(this.values);
        sb.append(", cmpSdkVersion=");
        sb.append(this.valueOf);
        sb.append(", tcString=");
        sb.append(this.AFInAppEventParameterName);
        sb.append(')');
        return sb.toString();
    }
}
