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

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018"}, d2 = {"Lcom/appsflyer/internal/AFc1aSDK;", "", "", "p0", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lorg/json/JSONObject;", "getRevenue", "()Lorg/json/JSONObject;", "getMonetizationNetwork", "()Ljava/lang/String;", "toString", "getMediationNetwork", "I", "AFAdRevenueData", "Ljava/lang/String;", "getCurrencyIso4217Code", "AFa1zSDK"}, k = 1, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AFc1aSDK {

    /* renamed from: AFa1zSDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    final String getCurrencyIso4217Code;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    public String getMediationNetwork;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    int AFAdRevenueData;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    public String getMonetizationNetwork;

    public AFc1aSDK(String str, String str2, String str3, int i3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.getMediationNetwork = str;
        this.getCurrencyIso4217Code = str2;
        this.getMonetizationNetwork = str3;
        this.AFAdRevenueData = i3;
    }

    public final boolean equals(Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof AFc1aSDK)) {
            return false;
        }
        AFc1aSDK aFc1aSDK = (AFc1aSDK) p02;
        return Intrinsics.a(this.getMediationNetwork, aFc1aSDK.getMediationNetwork) && Intrinsics.a(this.getCurrencyIso4217Code, aFc1aSDK.getCurrencyIso4217Code) && Intrinsics.a(this.getMonetizationNetwork, aFc1aSDK.getMonetizationNetwork) && this.AFAdRevenueData == aFc1aSDK.AFAdRevenueData;
    }

    public final String getMonetizationNetwork() {
        String str = this.getMediationNetwork;
        str.getClass();
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        String encodeToString = Base64.encodeToString(bytes, 2);
        String str2 = this.getCurrencyIso4217Code;
        str2.getClass();
        byte[] bytes2 = str2.getBytes(charset);
        bytes2.getClass();
        String encodeToString2 = Base64.encodeToString(bytes2, 2);
        String str3 = this.getMonetizationNetwork;
        str3.getClass();
        byte[] bytes3 = str3.getBytes(charset);
        bytes3.getClass();
        return "label=" + encodeToString + "\nhashName=" + encodeToString2 + "\nstackTrace=" + Base64.encodeToString(bytes3, 2) + "\nc=" + this.AFAdRevenueData;
    }

    public final JSONObject getRevenue() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.getMediationNetwork);
        jSONObject.put("hash_name", this.getCurrencyIso4217Code);
        jSONObject.put("st", this.getMonetizationNetwork);
        jSONObject.put("c", String.valueOf(this.AFAdRevenueData));
        return jSONObject;
    }

    public final int hashCode() {
        return Integer.hashCode(this.AFAdRevenueData) + ((this.getMonetizationNetwork.hashCode() + ((this.getCurrencyIso4217Code.hashCode() + (this.getMediationNetwork.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ExceptionInfo(label=" + this.getMediationNetwork + ", hashName=" + this.getCurrencyIso4217Code + ", stackTrace=" + this.getMonetizationNetwork + ", counter=" + this.AFAdRevenueData + ")";
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/appsflyer/internal/AFc1aSDK$AFa1zSDK;", "", "<init>", "()V", "", "p0", "", "", "p1", "", "AFAdRevenueData", "(Ljava/lang/Integer;[Ljava/lang/String;)Z", "Lcom/appsflyer/internal/AFc1aSDK;", "getMediationNetwork", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFc1aSDK;", "getRevenue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1aSDK$AFa1zSDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private static boolean AFAdRevenueData(Integer p02, String... p12) {
            boolean z10 = p02 == null;
            int length = p12.length;
            for (int i3 = 0; i3 < 3; i3++) {
                String str = p12[i3];
                z10 = z10 || str == null || str.length() == 0;
            }
            return z10;
        }

        public static AFc1aSDK getMediationNetwork(String p02) {
            List<String> split$default;
            p02.getClass();
            split$default = StringsKt__StringsKt.split$default(p02, new String[]{"\n"}, false, 0, 6, null);
            if (split$default.size() == 4) {
                String str = null;
                String str2 = null;
                String str3 = null;
                Integer num = null;
                for (String str4 : split$default) {
                    if (kotlin.text.o.h(str4, "label=")) {
                        str = getRevenue(str4, "label=");
                    } else if (str4.startsWith("hashName=")) {
                        str2 = getRevenue(str4, "hashName=");
                    } else if (!str4.startsWith("stackTrace=")) {
                        if (!str4.startsWith("c=")) {
                            break;
                        }
                        num = Integer.valueOf(Integer.parseInt(StringsKt.y(str4.substring(2)).toString()));
                    } else {
                        str3 = getRevenue(str4, "stackTrace=");
                    }
                }
                if (!AFAdRevenueData(num, str, str2, str3)) {
                    str.getClass();
                    str2.getClass();
                    str3.getClass();
                    num.getClass();
                    return new AFc1aSDK(str, str2, str3, num.intValue());
                }
            }
            return null;
        }

        private static String getRevenue(String str, String str2) {
            String obj = StringsKt.y(str.substring(str2.length())).toString();
            obj.getClass();
            Charset charset = Charsets.UTF_8;
            byte[] bytes = obj.getBytes(charset);
            bytes.getClass();
            byte[] decode = Base64.decode(bytes, 2);
            decode.getClass();
            return new String(decode, charset);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AFc1aSDK(String str, String str2, String str3, int i3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? 1 : i3);
    }
}
