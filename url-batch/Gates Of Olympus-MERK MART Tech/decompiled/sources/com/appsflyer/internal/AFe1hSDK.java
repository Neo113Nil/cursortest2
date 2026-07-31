package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFe1hSDK {
    final String AFInAppEventType;
    final String values;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1hSDK)) {
            return false;
        }
        AFe1hSDK aFe1hSDK = (AFe1hSDK) obj;
        return Intrinsics.areEqual(this.AFInAppEventType, aFe1hSDK.AFInAppEventType) && Intrinsics.areEqual(this.values, aFe1hSDK.values);
    }

    public final int hashCode() {
        return (this.AFInAppEventType.hashCode() * 31) + this.values.hashCode();
    }

    public final String toString() {
        return new StringBuilder("HostConfig(prefix=").append(this.AFInAppEventType).append(", host=").append(this.values).append(')').toString();
    }

    public AFe1hSDK(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AFInAppEventType = str;
        this.values = str2;
    }
}
