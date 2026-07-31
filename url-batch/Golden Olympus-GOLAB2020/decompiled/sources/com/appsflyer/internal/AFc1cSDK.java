package com.appsflyer.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class AFc1cSDK {
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);
    public String AFAdRevenueData;
    int getMediationNetwork;
    final String getMonetizationNetwork;
    public String getRevenue;

    @Metadata
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        private static boolean getMediationNetwork(Integer num, String... strArr) {
            boolean z4 = num == null;
            int length = strArr.length;
            for (int i4 = 0; i4 < 3; i4++) {
                String str = strArr[i4];
                z4 = z4 || str == null || str.length() == 0;
            }
            return z4;
        }

        public static AFc1cSDK getRevenue(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            List<String> split$default = StringsKt.split$default(str, new String[]{"\n"}, false, 0, 6, null);
            if (split$default.size() != 4) {
                return null;
            }
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Integer num = null;
            for (String str5 : split$default) {
                if (StringsKt.K(str5, "label=", false, 2, null)) {
                    str2 = getRevenue(str5, "label=");
                } else if (StringsKt.K(str5, "hashName=", false, 2, null)) {
                    str3 = getRevenue(str5, "hashName=");
                } else if (!StringsKt.K(str5, "stackTrace=", false, 2, null)) {
                    if (!StringsKt.K(str5, "c=", false, 2, null)) {
                        break;
                    }
                    String substring = str5.substring(2);
                    Intrinsics.checkNotNullExpressionValue(substring, "");
                    num = Integer.valueOf(Integer.parseInt(StringsKt.W0(substring).toString()));
                } else {
                    str4 = getRevenue(str5, "stackTrace=");
                }
            }
            if (getMediationNetwork(num, str2, str3, str4)) {
                return null;
            }
            Intrinsics.checkNotNull(str2);
            Intrinsics.checkNotNull(str3);
            Intrinsics.checkNotNull(str4);
            Intrinsics.checkNotNull(num);
            return new AFc1cSDK(str2, str3, str4, num.intValue());
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static String getRevenue(String str, String str2) {
            String substring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(substring, "");
            String obj = StringsKt.W0(substring).toString();
            Intrinsics.checkNotNullParameter(obj, "");
            Charset charset = Charsets.UTF_8;
            byte[] bytes = obj.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.checkNotNullParameter(bytes, "");
            byte[] decode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(decode, "");
            return new String(decode, charset);
        }
    }

    public AFc1cSDK(String str, String str2, String str3, int i4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.getRevenue = str;
        this.getMonetizationNetwork = str2;
        this.AFAdRevenueData = str3;
        this.getMediationNetwork = i4;
    }

    public final String AFAdRevenueData() {
        String str = this.getRevenue;
        Intrinsics.checkNotNullParameter(str, "");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        String encodeToString = Base64.encodeToString(bytes, 2);
        String str2 = this.getMonetizationNetwork;
        Intrinsics.checkNotNullParameter(str2, "");
        byte[] bytes2 = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "");
        String encodeToString2 = Base64.encodeToString(bytes2, 2);
        String str3 = this.AFAdRevenueData;
        Intrinsics.checkNotNullParameter(str3, "");
        byte[] bytes3 = str3.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes3, "");
        return "label=" + encodeToString + "\nhashName=" + encodeToString2 + "\nstackTrace=" + Base64.encodeToString(bytes3, 2) + "\nc=" + this.getMediationNetwork;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1cSDK)) {
            return false;
        }
        AFc1cSDK aFc1cSDK = (AFc1cSDK) obj;
        return Intrinsics.areEqual(this.getRevenue, aFc1cSDK.getRevenue) && Intrinsics.areEqual(this.getMonetizationNetwork, aFc1cSDK.getMonetizationNetwork) && Intrinsics.areEqual(this.AFAdRevenueData, aFc1cSDK.AFAdRevenueData) && this.getMediationNetwork == aFc1cSDK.getMediationNetwork;
    }

    public final JSONObject getRevenue() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.getRevenue);
        jSONObject.put("hash_name", this.getMonetizationNetwork);
        jSONObject.put("st", this.AFAdRevenueData);
        jSONObject.put("c", String.valueOf(this.getMediationNetwork));
        return jSONObject;
    }

    public final int hashCode() {
        return (((((this.getRevenue.hashCode() * 31) + this.getMonetizationNetwork.hashCode()) * 31) + this.AFAdRevenueData.hashCode()) * 31) + Integer.hashCode(this.getMediationNetwork);
    }

    public final String toString() {
        return "ExceptionInfo(label=" + this.getRevenue + ", hashName=" + this.getMonetizationNetwork + ", stackTrace=" + this.AFAdRevenueData + ", counter=" + this.getMediationNetwork + ")";
    }

    public /* synthetic */ AFc1cSDK(String str, String str2, String str3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i5 & 8) != 0 ? 1 : i4);
    }
}
