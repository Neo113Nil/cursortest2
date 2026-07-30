package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFe1kSDK {
    final String valueOf;
    final String values;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1kSDK)) {
            return false;
        }
        AFe1kSDK aFe1kSDK = (AFe1kSDK) obj;
        return Intrinsics.areEqual(this.valueOf, aFe1kSDK.valueOf) && Intrinsics.areEqual(this.values, aFe1kSDK.values);
    }

    public final int hashCode() {
        return (this.valueOf.hashCode() * 31) + this.values.hashCode();
    }

    public final String toString() {
        return new StringBuilder("HostConfig(prefix=").append(this.valueOf).append(", host=").append(this.values).append(')').toString();
    }

    public AFe1kSDK(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.valueOf = str;
        this.values = str2;
    }
}
