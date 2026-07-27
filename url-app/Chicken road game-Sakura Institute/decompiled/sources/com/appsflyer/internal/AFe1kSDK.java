package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFe1kSDK {
    final String valueOf;
    final String values;

    public AFe1kSDK(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.valueOf = str;
        this.values = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1kSDK)) {
            return false;
        }
        AFe1kSDK aFe1kSDK = (AFe1kSDK) obj;
        return Intrinsics.a(this.valueOf, aFe1kSDK.valueOf) && Intrinsics.a(this.values, aFe1kSDK.values);
    }

    public final int hashCode() {
        return this.values.hashCode() + (this.valueOf.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HostConfig(prefix=");
        sb.append(this.valueOf);
        sb.append(", host=");
        sb.append(this.values);
        sb.append(')');
        return sb.toString();
    }
}
