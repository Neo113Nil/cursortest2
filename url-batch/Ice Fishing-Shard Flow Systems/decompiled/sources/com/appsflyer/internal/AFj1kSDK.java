package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
/* loaded from: classes.dex */
public final class AFj1kSDK {
    public static final String AFAdRevenueData;
    public static final String areAllFieldsValid;
    public static final String component1;
    public static final String component2;
    public static final String component3;
    public static final String component4;
    private static final String copy;
    public static final String getCurrencyIso4217Code;
    public static final AFa1uSDK getMediationNetwork = new AFa1uSDK(null);
    public static final String getRevenue;
    private final AFc1kSDK copydefault;
    public final AFj1bSDK getMonetizationNetwork;

    @Metadata
    public static final class AFa1uSDK {
        private AFa1uSDK() {
        }

        public /* synthetic */ AFa1uSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String c7 = r4.f.c(AFa1tSDK.AFAdRevenueData, "/androidevent?app_id=");
        copy = c7;
        getCurrencyIso4217Code = r4.f.i("https://%sattr.%s/api/v", c7);
        AFAdRevenueData = "https://%sadrevenue.%s/api/v2/generic/v6.18.0/android?app_id=";
        getRevenue = r4.f.i("https://%sconversions.%s/api/v", c7);
        component2 = r4.f.i("https://%slaunches.%s/api/v", c7);
        component4 = r4.f.i("https://%sinapps.%s/api/v", c7);
        component3 = r4.f.i("https://%sregister.%s/api/v", c7);
        component1 = r4.f.i("https://%svalidate.%s/api/v", c7);
        areAllFieldsValid = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
    }

    private AFj1kSDK(AFc1kSDK aFc1kSDK, AFj1bSDK aFj1bSDK) {
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFj1bSDK, "");
        this.copydefault = aFc1kSDK;
        this.getMonetizationNetwork = aFj1bSDK;
    }

    public static String getMediationNetwork(String str, boolean z7) {
        return r4.f.c(str, !z7 ? "&buildnumber=6.18.0" : "");
    }

    public final String AFAdRevenueData(String str) {
        return r4.f.c(str, this.copydefault.getRevenue.getCurrencyIso4217Code.getPackageName());
    }

    public final String getCurrencyIso4217Code(String str, String str2) {
        String packageName = this.copydefault.getRevenue.getCurrencyIso4217Code.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String component12 = this.copydefault.component1();
        if (component12 != null && !StringsKt.z(component12)) {
            component12 = r4.f.i("-", StringsKt.J(component12).toString());
        }
        if (component12 == null) {
            component12 = "";
        }
        String obj = StringsKt.J(component12).toString();
        Uri.Builder appendPath = Uri.parse(this.getMonetizationNetwork.getRevenue("https://%sdlsdk.%s/v1.0/android/")).buildUpon().appendPath(packageName + obj);
        Intrinsics.checkNotNullExpressionValue(appendPath, "");
        if (str == null || str2 == null) {
            String str3 = str == null ? "devKey" : "timestamp";
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, str3.concat(" is null at attempt to generate ddl event url"), new IllegalStateException(str3.concat(" is null")), true, false, false, true);
        } else {
            appendPath.appendQueryParameter("af_sig", AFj1jSDK.getCurrencyIso4217Code(str2.concat(str), str));
        }
        String obj2 = appendPath.appendQueryParameter("sdk_version", AFa1tSDK.AFAdRevenueData).build().toString();
        Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    public final String getRevenue(String str, boolean z7) {
        if (z7) {
            return str;
        }
        String component12 = this.copydefault.component1();
        String concat = component12 != null ? "&channel=".concat(component12) : null;
        if (concat == null) {
            concat = "";
        }
        return r4.f.c(str, concat);
    }

    public /* synthetic */ AFj1kSDK(AFc1kSDK aFc1kSDK, AFj1bSDK aFj1bSDK, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1kSDK, (i2 & 2) != 0 ? new AFj1fSDK() : aFj1bSDK);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFj1kSDK(AFc1kSDK aFc1kSDK) {
        this(aFc1kSDK, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
    }
}
