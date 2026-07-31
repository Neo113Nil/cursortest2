package com.appsflyer.internal;

import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.ironsource.jn;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFd1fSDK extends AFd1cSDK {
    public static final AFa1tSDK AFa1tSDK = new AFa1tSDK(null);

    @Metadata
    public static final class AFa1tSDK {
        private AFa1tSDK() {
        }

        static String getCurrencyIso4217Code(String str, String str2, String str3) {
            return String.format(AFd1oSDK.AFAdRevenueData, AppsFlyerLib.getInstance().getHostPrefix(), ((com.appsflyer.internal.AFa1tSDK) com.appsflyer.internal.AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).getHostName()) + str + str3 + "?device_id=" + str2;
        }

        public static String getRevenue(String str, String str2, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return AFj1cSDK.getRevenue(TextUtils.join("\u2063", new String[]{str5, str3, str + str2}), str4);
        }

        public /* synthetic */ AFa1tSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* synthetic */ AFd1fSDK(String str, Map map, byte[] bArr, String str2, boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i4 & 4) != 0 ? null : bArr, (i4 & 8) != 0 ? jn.f16864a : str2, (i4 & 16) != 0 ? false : z4);
    }

    public static final AFd1fSDK getMonetizationNetwork(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        String currencyIso4217Code = AFa1tSDK.getCurrencyIso4217Code(str, str2, str3);
        String valueOf = String.valueOf(System.currentTimeMillis());
        AFd1fSDK aFd1fSDK = new AFd1fSDK(currencyIso4217Code, MapsKt.mapOf(TuplesKt.to("Connection", "close"), TuplesKt.to("af_request_epoch_ms", valueOf), TuplesKt.to("af_sig", AFa1tSDK.getRevenue(str, str3, str2, str4, valueOf))), null, null, false, 28, null);
        aFd1fSDK.component4 = 10000;
        return aFd1fSDK;
    }

    private AFd1fSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z4) {
        super(str, bArr, str2, map, z4);
    }
}
