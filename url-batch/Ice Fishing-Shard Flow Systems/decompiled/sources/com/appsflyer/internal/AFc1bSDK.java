package com.appsflyer.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class AFc1bSDK {
    public static final AFa1tSDK AFa1tSDK = new AFa1tSDK(null);
    int AFAdRevenueData;
    final String getMediationNetwork;
    public String getMonetizationNetwork;
    public String getRevenue;

    @Metadata
    public static final class AFa1tSDK {
        private AFa1tSDK() {
        }

        public static AFc1bSDK AFAdRevenueData(String str) {
            List<String> split$default;
            Intrinsics.checkNotNullParameter(str, "");
            split$default = StringsKt__StringsKt.split$default(str, new String[]{"\n"}, false, 0, 6, null);
            if (split$default.size() == 4) {
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Integer num = null;
                for (String str5 : split$default) {
                    if (kotlin.text.p.l(str5, "label=")) {
                        str2 = AFAdRevenueData(str5, "label=");
                    } else if (kotlin.text.p.l(str5, "hashName=")) {
                        str3 = AFAdRevenueData(str5, "hashName=");
                    } else if (!kotlin.text.p.l(str5, "stackTrace=")) {
                        if (!kotlin.text.p.l(str5, "c=")) {
                            break;
                        }
                        String substring = str5.substring(2);
                        Intrinsics.checkNotNullExpressionValue(substring, "");
                        num = Integer.valueOf(Integer.parseInt(StringsKt.J(substring).toString()));
                    } else {
                        str4 = AFAdRevenueData(str5, "stackTrace=");
                    }
                }
                if (!getMediationNetwork(num, str2, str3, str4)) {
                    Intrinsics.b(str2);
                    Intrinsics.b(str3);
                    Intrinsics.b(str4);
                    Intrinsics.b(num);
                    return new AFc1bSDK(str2, str3, str4, num.intValue());
                }
            }
            return null;
        }

        private static boolean getMediationNetwork(Integer num, String... strArr) {
            boolean z7 = num == null;
            int length = strArr.length;
            for (int i2 = 0; i2 < 3; i2++) {
                String str = strArr[i2];
                z7 = z7 || str == null || str.length() == 0;
            }
            return z7;
        }

        public /* synthetic */ AFa1tSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static String AFAdRevenueData(String str, String str2) {
            String substring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(substring, "");
            String obj = StringsKt.J(substring).toString();
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

    public AFc1bSDK(String str, String str2, String str3, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.getRevenue = str;
        this.getMediationNetwork = str2;
        this.getMonetizationNetwork = str3;
        this.AFAdRevenueData = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1bSDK)) {
            return false;
        }
        AFc1bSDK aFc1bSDK = (AFc1bSDK) obj;
        return Intrinsics.a(this.getRevenue, aFc1bSDK.getRevenue) && Intrinsics.a(this.getMediationNetwork, aFc1bSDK.getMediationNetwork) && Intrinsics.a(this.getMonetizationNetwork, aFc1bSDK.getMonetizationNetwork) && this.AFAdRevenueData == aFc1bSDK.AFAdRevenueData;
    }

    public final JSONObject getMonetizationNetwork() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.getRevenue);
        jSONObject.put("hash_name", this.getMediationNetwork);
        jSONObject.put("st", this.getMonetizationNetwork);
        jSONObject.put("c", String.valueOf(this.AFAdRevenueData));
        return jSONObject;
    }

    public final String getRevenue() {
        String str = this.getRevenue;
        Intrinsics.checkNotNullParameter(str, "");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        String encodeToString = Base64.encodeToString(bytes, 2);
        String str2 = this.getMediationNetwork;
        Intrinsics.checkNotNullParameter(str2, "");
        byte[] bytes2 = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "");
        String encodeToString2 = Base64.encodeToString(bytes2, 2);
        String str3 = this.getMonetizationNetwork;
        Intrinsics.checkNotNullParameter(str3, "");
        byte[] bytes3 = str3.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes3, "");
        return "label=" + encodeToString + "\nhashName=" + encodeToString2 + "\nstackTrace=" + Base64.encodeToString(bytes3, 2) + "\nc=" + this.AFAdRevenueData;
    }

    public final int hashCode() {
        return Integer.hashCode(this.AFAdRevenueData) + ((this.getMonetizationNetwork.hashCode() + ((this.getMediationNetwork.hashCode() + (this.getRevenue.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ExceptionInfo(label=" + this.getRevenue + ", hashName=" + this.getMediationNetwork + ", stackTrace=" + this.getMonetizationNetwork + ", counter=" + this.AFAdRevenueData + ")";
    }

    public /* synthetic */ AFc1bSDK(String str, String str2, String str3, int i2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i5 & 8) != 0 ? 1 : i2);
    }
}
