package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFc1dSDK {
    final String AFInAppEventParameterName;
    final String values;

    public AFc1dSDK(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.AFInAppEventParameterName = str;
        this.values = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1dSDK)) {
            return false;
        }
        AFc1dSDK aFc1dSDK = (AFc1dSDK) obj;
        return Intrinsics.b(this.AFInAppEventParameterName, aFc1dSDK.AFInAppEventParameterName) && Intrinsics.b(this.values, aFc1dSDK.values);
    }

    public final int hashCode() {
        return this.values.hashCode() + (this.AFInAppEventParameterName.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HostConfig(prefix=");
        sb.append(this.AFInAppEventParameterName);
        sb.append(", host=");
        sb.append(this.values);
        sb.append(')');
        return sb.toString();
    }
}
