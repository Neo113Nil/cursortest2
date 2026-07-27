package com.appsflyer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFPurchaseDetails {
    private final String AFInAppEventParameterName;
    private final AFPurchaseType AFInAppEventType;
    private final String AFKeystoreWrapper;
    private final String valueOf;
    private final String values;

    public AFPurchaseDetails(AFPurchaseType aFPurchaseType, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(aFPurchaseType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.AFInAppEventType = aFPurchaseType;
        this.AFKeystoreWrapper = str;
        this.valueOf = str2;
        this.values = str3;
        this.AFInAppEventParameterName = str4;
    }

    public static /* synthetic */ AFPurchaseDetails copy$default(AFPurchaseDetails aFPurchaseDetails, AFPurchaseType aFPurchaseType, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aFPurchaseType = aFPurchaseDetails.AFInAppEventType;
        }
        if ((i2 & 2) != 0) {
            str = aFPurchaseDetails.AFKeystoreWrapper;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = aFPurchaseDetails.valueOf;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = aFPurchaseDetails.values;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = aFPurchaseDetails.AFInAppEventParameterName;
        }
        return aFPurchaseDetails.copy(aFPurchaseType, str5, str6, str7, str4);
    }

    public final AFPurchaseType component1() {
        return this.AFInAppEventType;
    }

    public final String component2() {
        return this.AFKeystoreWrapper;
    }

    public final String component3() {
        return this.valueOf;
    }

    public final String component4() {
        return this.values;
    }

    public final String component5() {
        return this.AFInAppEventParameterName;
    }

    public final AFPurchaseDetails copy(AFPurchaseType aFPurchaseType, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(aFPurchaseType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new AFPurchaseDetails(aFPurchaseType, str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFPurchaseDetails)) {
            return false;
        }
        AFPurchaseDetails aFPurchaseDetails = (AFPurchaseDetails) obj;
        return this.AFInAppEventType == aFPurchaseDetails.AFInAppEventType && Intrinsics.a(this.AFKeystoreWrapper, aFPurchaseDetails.AFKeystoreWrapper) && Intrinsics.a(this.valueOf, aFPurchaseDetails.valueOf) && Intrinsics.a(this.values, aFPurchaseDetails.values) && Intrinsics.a(this.AFInAppEventParameterName, aFPurchaseDetails.AFInAppEventParameterName);
    }

    public final String getCurrency() {
        return this.AFInAppEventParameterName;
    }

    public final String getPrice() {
        return this.values;
    }

    public final String getProductId() {
        return this.valueOf;
    }

    public final String getPurchaseToken() {
        return this.AFKeystoreWrapper;
    }

    public final AFPurchaseType getPurchaseType() {
        return this.AFInAppEventType;
    }

    public final int hashCode() {
        return this.AFInAppEventParameterName.hashCode() + ((this.values.hashCode() + ((this.valueOf.hashCode() + ((this.AFKeystoreWrapper.hashCode() + (this.AFInAppEventType.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AFPurchaseDetails(purchaseType=");
        sb.append(this.AFInAppEventType);
        sb.append(", purchaseToken=");
        sb.append(this.AFKeystoreWrapper);
        sb.append(", productId=");
        sb.append(this.valueOf);
        sb.append(", price=");
        sb.append(this.values);
        sb.append(", currency=");
        sb.append(this.AFInAppEventParameterName);
        sb.append(')');
        return sb.toString();
    }
}
