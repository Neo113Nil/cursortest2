package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.ironsource.da;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
/* loaded from: classes.dex */
public final class AFj1fSDK {
    public static final AFa1vSDK AFAdRevenueData = new AFa1vSDK(null);
    public static final String areAllFieldsValid;
    public static final String component1;
    public static final String component2;
    public static final String component3;
    public static final String component4;
    public static final String getCurrencyIso4217Code;
    public static final String getMediationNetwork;
    public static final String getRevenue;
    private static final String toString;
    public final AFk1xSDK getMonetizationNetwork;
    private final AFc1pSDK hashCode;

    @Metadata
    public static final class AFa1vSDK {
        private AFa1vSDK() {
        }

        public /* synthetic */ AFa1vSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String str = AFa1tSDK.getRevenue + "/androidevent?app_id=";
        toString = str;
        getRevenue = "https://%sattr.%s/api/v" + str;
        getCurrencyIso4217Code = "https://%sadrevenue.%s/api/v2/generic/v6.17.0/android?app_id=";
        getMediationNetwork = "https://%sconversions.%s/api/v" + str;
        component1 = "https://%slaunches.%s/api/v" + str;
        component2 = "https://%sinapps.%s/api/v" + str;
        areAllFieldsValid = "https://%sregister.%s/api/v" + str;
        component3 = "https://%svalidate.%s/api/v" + str;
        component4 = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
    }

    private AFj1fSDK(AFc1pSDK aFc1pSDK, AFk1xSDK aFk1xSDK) {
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFk1xSDK, "");
        this.hashCode = aFc1pSDK;
        this.getMonetizationNetwork = aFk1xSDK;
    }

    public static String getCurrencyIso4217Code() {
        return "https://privacy-sandbox.appsflyersdk.com/api/trigger";
    }

    public final String AFAdRevenueData(String str, String str2) {
        String packageName = this.hashCode.getRevenue.getMonetizationNetwork.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String component22 = this.hashCode.component2();
        if (component22 != null && !StringsKt.z(component22)) {
            component22 = "-" + StringsKt.W0(component22).toString();
        }
        if (component22 == null) {
            component22 = "";
        }
        String obj = StringsKt.W0(component22).toString();
        Uri.Builder appendPath = Uri.parse(this.getMonetizationNetwork.AFAdRevenueData("https://%sdlsdk.%s/v1.0/android/")).buildUpon().appendPath(packageName + obj);
        Intrinsics.checkNotNullExpressionValue(appendPath, "");
        if (str == null || str2 == null) {
            String str3 = str == null ? "devKey" : da.a.f15878d;
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, str3 + " is null at attempt to generate ddl event url", new IllegalStateException(str3 + " is null"), true, false, false, true);
        } else {
            appendPath.appendQueryParameter("af_sig", AFj1cSDK.getRevenue(str2 + str, str));
        }
        String obj2 = appendPath.appendQueryParameter(HianalyticsBaseData.SDK_VERSION, AFa1tSDK.getRevenue).build().toString();
        Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    public final String getRevenue(String str, boolean z4) {
        String str2;
        if (z4) {
            return str;
        }
        String component22 = this.hashCode.component2();
        if (component22 != null) {
            str2 = "&channel=" + component22;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        return str + str2;
    }

    public final String getCurrencyIso4217Code(String str) {
        return str + this.hashCode.getRevenue.getMonetizationNetwork.getPackageName();
    }

    public /* synthetic */ AFj1fSDK(AFc1pSDK aFc1pSDK, AFk1xSDK aFk1xSDK, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1pSDK, (i4 & 2) != 0 ? new AFk1zSDK() : aFk1xSDK);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFj1fSDK(AFc1pSDK aFc1pSDK) {
        this(aFc1pSDK, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
    }

    public static String AFAdRevenueData(String str, boolean z4) {
        return str + (!z4 ? "&buildnumber=6.17.0" : "");
    }
}
