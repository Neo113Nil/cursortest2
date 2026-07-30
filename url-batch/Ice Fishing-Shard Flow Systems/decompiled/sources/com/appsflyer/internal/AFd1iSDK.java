package com.appsflyer.internal;

import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.I;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFd1iSDK extends AFd1cSDK {
    public static final AFa1zSDK AFa1zSDK = new AFa1zSDK(null);

    @Metadata
    public static final class AFa1zSDK {
        private AFa1zSDK() {
        }

        public static String getCurrencyIso4217Code(String str, String str2, String str3) {
            return String.format(AFd1mSDK.getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.getMediationNetwork().getHostName()) + str + str3 + "?device_id=" + str2;
        }

        public static String getMediationNetwork(String str, String str2, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return AFj1jSDK.getCurrencyIso4217Code(TextUtils.join("\u2063", new String[]{str5, str3, str + str2}), str4);
        }

        public /* synthetic */ AFa1zSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AFd1iSDK(String str, Map map, byte[] bArr, String str2, boolean z7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i2 & 4) != 0 ? null : bArr, (i2 & 8) != 0 ? "GET" : str2, (i2 & 16) != 0 ? false : z7);
    }

    public static final AFd1iSDK getMonetizationNetwork(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        String currencyIso4217Code = AFa1zSDK.getCurrencyIso4217Code(str, str2, str3);
        String valueOf = String.valueOf(System.currentTimeMillis());
        AFd1iSDK aFd1iSDK = new AFd1iSDK(currencyIso4217Code, I.e(new Pair("Connection", "close"), new Pair("af_request_epoch_ms", valueOf), new Pair("af_sig", AFa1zSDK.getMediationNetwork(str, str3, str2, str4, valueOf))), null, null, false, 28, null);
        aFd1iSDK.areAllFieldsValid = 10000;
        return aFd1iSDK;
    }

    private AFd1iSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z7) {
        super(str, bArr, str2, map, z7);
    }
}
