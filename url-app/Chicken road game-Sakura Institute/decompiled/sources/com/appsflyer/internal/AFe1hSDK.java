package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFe1hSDK {
    public final String AFInAppEventType;
    public final String AFKeystoreWrapper;
    public final AFe1eSDK values;

    public AFe1hSDK(String str, String str2, AFe1eSDK aFe1eSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFe1eSDK, "");
        this.AFKeystoreWrapper = str;
        this.AFInAppEventType = str2;
        this.values = aFe1eSDK;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1hSDK)) {
            return false;
        }
        AFe1hSDK aFe1hSDK = (AFe1hSDK) obj;
        return Intrinsics.a(this.AFKeystoreWrapper, aFe1hSDK.AFKeystoreWrapper) && Intrinsics.a(this.AFInAppEventType, aFe1hSDK.AFInAppEventType) && this.values == aFe1hSDK.values;
    }

    public final int hashCode() {
        int hashCode = this.AFKeystoreWrapper.hashCode() * 31;
        String str = this.AFInAppEventType;
        return this.values.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AFe1hSDK(values=");
        sb.append(this.AFKeystoreWrapper);
        sb.append(", AFInAppEventParameterName=");
        sb.append(this.AFInAppEventType);
        sb.append(", AFInAppEventType=");
        sb.append(this.values);
        sb.append(')');
        return sb.toString();
    }
}
