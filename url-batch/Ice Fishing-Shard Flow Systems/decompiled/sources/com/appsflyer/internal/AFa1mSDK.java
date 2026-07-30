package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFa1mSDK {
    private final boolean AFAdRevenueData;
    public final DeepLink getCurrencyIso4217Code;

    public AFa1mSDK(boolean z7, DeepLink deepLink) {
        this.AFAdRevenueData = z7;
        this.getCurrencyIso4217Code = deepLink;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFa1mSDK)) {
            return false;
        }
        AFa1mSDK aFa1mSDK = (AFa1mSDK) obj;
        return this.AFAdRevenueData == aFa1mSDK.AFAdRevenueData && Intrinsics.a(this.getCurrencyIso4217Code, aFa1mSDK.getCurrencyIso4217Code);
    }

    public final boolean getMonetizationNetwork() {
        return this.AFAdRevenueData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z7 = this.AFAdRevenueData;
        ?? r0 = z7;
        if (z7) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        DeepLink deepLink = this.getCurrencyIso4217Code;
        return i2 + (deepLink == null ? 0 : deepLink.hashCode());
    }

    public final String toString() {
        return "DdlResponse(secondPing=" + this.AFAdRevenueData + ", deepLink=" + this.getCurrencyIso4217Code + ")";
    }

    public /* synthetic */ AFa1mSDK(boolean z7, DeepLink deepLink, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z7, (i2 & 2) != 0 ? null : deepLink);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AFa1mSDK() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
