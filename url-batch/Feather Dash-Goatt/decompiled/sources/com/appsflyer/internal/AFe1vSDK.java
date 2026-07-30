package com.appsflyer.internal;

import android.util.Base64;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.AFLogger;
import defpackage.ae0;
import defpackage.ee0;
import defpackage.pc0;
import defpackage.ry0;
import defpackage.zh;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0015\u0010\b\u001a\u00020\u000e8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0011\u001a\u00020\u000e8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0015R\u0011\u0010\u0013\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0015"}, d2 = {"Lcom/appsflyer/internal/AFe1vSDK;", "", "Lcom/appsflyer/internal/AFc1kSDK;", "p0", "Lcom/appsflyer/internal/AFc1jSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/internal/AFc1jSDK;)V", "AFAdRevenueData", "Lcom/appsflyer/internal/AFc1kSDK;", "getMonetizationNetwork", "getCurrencyIso4217Code", "Lcom/appsflyer/internal/AFc1jSDK;", "component3", "", "component2", "Lae0;", "getRevenue", "", "getMediationNetwork", "()Z", "()Ljava/lang/String;", "areAllFieldsValid", "AFa1tSDK"}, k = 1, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
public final class AFe1vSDK {
    private static AFe1xSDK areAllFieldsValid;

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    private final AFc1kSDK getMonetizationNetwork;

    /* renamed from: component2, reason: from kotlin metadata */
    private final ae0 AFAdRevenueData;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    private final AFc1jSDK component3;
    public final ae0 getRevenue;

    /* renamed from: AFa1tSDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static String getMonetizationNetwork = "https://%scdn-%ssettings.%s/android/v2/%s/settings";
    public static String getMediationNetwork = "https://%scdn-%stestsettings.%s/android/v2/%s/settings";
    private static final List<String> component1 = zh.e("googleplay", "playstore", "googleplaystore");

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getCurrencyIso4217Code", "()Ljava/lang/String;"}, k = 3, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1vSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends pc0 implements Function0<String> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String str = (String) AFa1tSDK.getMonetizationNetwork(new Object[]{AFe1vSDK.this.component3, AFe1vSDK.this.getMonetizationNetwork.component1()}, -195097357, 195097363, (int) System.currentTimeMillis());
            if (str != null && !StringsKt.n(str)) {
                String obj = StringsKt.s(str).toString();
                List<String> AFAdRevenueData = Companion.AFAdRevenueData();
                Locale locale = Locale.getDefault();
                locale.getClass();
                String lowerCase = obj.toLowerCase(locale);
                lowerCase.getClass();
                if (AFAdRevenueData.contains(lowerCase)) {
                    AFLogger.afWarnLog(String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{obj}, 1)));
                    str = "";
                } else {
                    str = "-".concat(obj);
                }
            }
            return StringsKt.s(str != null ? str : "").toString();
        }
    }

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getMediationNetwork", "()Ljava/lang/String;"}, k = 3, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1vSDK$2, reason: invalid class name */
    public static final class AnonymousClass2 extends pc0 implements Function0<String> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String packageName = AFe1vSDK.this.getMonetizationNetwork.getRevenue.getCurrencyIso4217Code.getPackageName();
            packageName.getClass();
            return AFe1vSDK.getRevenue(packageName, AFe1vSDK.getMonetizationNetwork(AFe1vSDK.this));
        }
    }

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] getMonetizationNetwork;

        static {
            int[] iArr = new int[AFe1sSDK.values().length];
            try {
                iArr[AFe1sSDK.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1sSDK.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFe1sSDK.RC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getMonetizationNetwork = iArr;
        }
    }

    public AFe1vSDK(AFc1kSDK aFc1kSDK, AFc1jSDK aFc1jSDK) {
        aFc1kSDK.getClass();
        aFc1jSDK.getClass();
        this.getMonetizationNetwork = aFc1kSDK;
        this.component3 = aFc1jSDK;
        this.AFAdRevenueData = ee0.b(new AnonymousClass1());
        this.getRevenue = ee0.b(new AnonymousClass2());
    }

    public static boolean getMediationNetwork() {
        return areAllFieldsValid == null;
    }

    public static final /* synthetic */ String getRevenue(String str, String str2) {
        String str3 = str + str2;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str3.getBytes(Charsets.UTF_8);
        bytes.getClass();
        byte[] digest = messageDigest.digest(bytes);
        digest.getClass();
        String encodeToString = Base64.encodeToString(digest, 2);
        encodeToString.getClass();
        String lowerCase = encodeToString.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return new Regex("[^\\w]+").replace(lowerCase, "").substring(0, 6).concat(".");
    }

    public final String getCurrencyIso4217Code() {
        int i = AFa1uSDK.getMonetizationNetwork[(getMediationNetwork() ? AFe1sSDK.DEFAULT : AFe1sSDK.API).ordinal()];
        if (i == 1) {
            return "appsflyersdk.com";
        }
        if (i == 2) {
            AFe1xSDK aFe1xSDK = areAllFieldsValid;
            String str = aFe1xSDK != null ? aFe1xSDK.getCurrencyIso4217Code : null;
            return str == null ? "" : str;
        }
        if (i == 3) {
            return "";
        }
        l.a();
        return null;
    }

    public final String getMonetizationNetwork() {
        int i = AFa1uSDK.getMonetizationNetwork[(getMediationNetwork() ? AFe1sSDK.DEFAULT : AFe1sSDK.API).ordinal()];
        if (i == 1) {
            return (String) this.getRevenue.getValue();
        }
        if (i == 2) {
            AFe1xSDK aFe1xSDK = areAllFieldsValid;
            String str = aFe1xSDK != null ? aFe1xSDK.getMonetizationNetwork : null;
            return str == null ? "" : str;
        }
        if (i == 3) {
            return "";
        }
        l.a();
        return null;
    }

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\n\u0010\fR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\"\u0004\b\u000b\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFe1vSDK$AFa1tSDK;", "", "<init>", "()V", "", "", "component1", "Ljava/util/List;", "AFAdRevenueData", "()Ljava/util/List;", "getMediationNetwork", "getMonetizationNetwork", "Ljava/lang/String;", "getRevenue", "Lcom/appsflyer/internal/AFe1xSDK;", "areAllFieldsValid", "Lcom/appsflyer/internal/AFe1xSDK;", "(Lcom/appsflyer/internal/AFe1xSDK;)V"}, k = 1, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1vSDK$AFa1tSDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static List<String> AFAdRevenueData() {
            return AFe1vSDK.component1;
        }

        public static void getMonetizationNetwork(AFe1xSDK aFe1xSDK) {
            AFe1vSDK.areAllFieldsValid = aFe1xSDK;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final void getMediationNetwork(AFe1xSDK aFe1xSDK) {
        Companion.getMonetizationNetwork(aFe1xSDK);
    }

    public static final /* synthetic */ String getMonetizationNetwork(AFe1vSDK aFe1vSDK) {
        return (String) aFe1vSDK.AFAdRevenueData.getValue();
    }
}
