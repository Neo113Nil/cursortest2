package com.appsflyer.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFd1nSDK extends AFc1dSDK {
    public AFc1kSDK AFAdRevenueData;
    private final AFd1hSDK component4;
    private final boolean getRevenue;

    public /* synthetic */ AFd1nSDK(AFc1kSDK aFc1kSDK, byte[] bArr, Map map, int i2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1kSDK, bArr, (i5 & 4) != 0 ? null : map, (i5 & 8) != 0 ? 2000 : i2);
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFd1hSDK AFAdRevenueData() {
        return this.component4;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final boolean getCurrencyIso4217Code() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final String getMediationNetwork(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[RD]: " + str;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final String getMonetizationNetwork() {
        AFj1kSDK aFj1kSDK = new AFj1kSDK(this.AFAdRevenueData, null, 2, null);
        return aFj1kSDK.AFAdRevenueData(aFj1kSDK.getMonetizationNetwork.getRevenue(AFj1kSDK.areAllFieldsValid));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFd1nSDK(AFc1kSDK aFc1kSDK, byte[] bArr, Map<String, String> map, int i2) {
        super(bArr, map, i2);
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AFAdRevenueData = aFc1kSDK;
        this.component4 = AFd1hSDK.OCTET_STREAM;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFd1nSDK(AFc1kSDK aFc1kSDK, byte[] bArr) {
        this(aFc1kSDK, bArr, null, 0, 12, null);
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
    }
}
