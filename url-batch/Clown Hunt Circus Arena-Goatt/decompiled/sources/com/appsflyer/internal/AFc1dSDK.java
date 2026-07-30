package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFc1dSDK {
    final String AFInAppEventParameterName;
    final String values;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1dSDK)) {
            return false;
        }
        AFc1dSDK aFc1dSDK = (AFc1dSDK) obj;
        return Intrinsics.areEqual(this.AFInAppEventParameterName, aFc1dSDK.AFInAppEventParameterName) && Intrinsics.areEqual(this.values, aFc1dSDK.values);
    }

    public final int hashCode() {
        return (this.AFInAppEventParameterName.hashCode() * 31) + this.values.hashCode();
    }

    public final String toString() {
        return new StringBuilder("HostConfig(prefix=").append(this.AFInAppEventParameterName).append(", host=").append(this.values).append(')').toString();
    }

    public AFc1dSDK(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AFInAppEventParameterName = str;
        this.values = str2;
    }
}
