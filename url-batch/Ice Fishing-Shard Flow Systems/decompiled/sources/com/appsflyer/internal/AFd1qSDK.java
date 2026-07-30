package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFd1qSDK extends AFc1dSDK {
    public static final AFa1tSDK AFa1tSDK = new AFa1tSDK(null);
    public static String getRevenue = "https://%smonitorsdk.%s/remote-debug/exception-manager";
    private final AFd1hSDK AFAdRevenueData;

    @Metadata
    public static final class AFa1tSDK {
        private AFa1tSDK() {
        }

        public /* synthetic */ AFa1tSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFd1qSDK(byte[] bArr, Map<String, String> map, int i2) {
        super(bArr, map, i2);
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AFAdRevenueData = AFd1hSDK.JSON;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFd1hSDK AFAdRevenueData() {
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final String getMediationNetwork(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AFd1pSDK.AFAdRevenueData(str);
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final String getMonetizationNetwork() {
        String format = String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), com.appsflyer.internal.AFa1tSDK.getMediationNetwork().getHostName());
        Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
