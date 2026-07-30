package com.appsflyer.internal;

import R5.InterfaceC0168h;
import android.util.Base64;
import com.appsflyer.AFLogger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata
/* loaded from: classes.dex */
public final class AFe1vSDK {
    private static AFe1xSDK areAllFieldsValid;
    private final AFc1kSDK AFAdRevenueData;
    private final InterfaceC0168h component2;
    private final AFc1jSDK getCurrencyIso4217Code;
    public final InterfaceC0168h getRevenue;
    public static final AFa1tSDK AFa1tSDK = new AFa1tSDK(null);
    public static String getMonetizationNetwork = "https://%scdn-%ssettings.%s/android/v2/%s/settings";
    public static String getMediationNetwork = "https://%scdn-%stestsettings.%s/android/v2/%s/settings";
    private static final List<String> component1 = r.d("googleplay", "playstore", "googleplaystore");

    @Metadata
    /* renamed from: com.appsflyer.internal.AFe1vSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.p implements Function0<String> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String str = (String) com.appsflyer.internal.AFa1tSDK.getMonetizationNetwork(new Object[]{AFe1vSDK.this.getCurrencyIso4217Code, AFe1vSDK.this.AFAdRevenueData.component1()}, -195097357, 195097363, (int) System.currentTimeMillis());
            if (str != null && !StringsKt.z(str)) {
                String obj = StringsKt.J(str).toString();
                List<String> AFAdRevenueData = AFa1tSDK.AFAdRevenueData();
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String lowerCase = obj.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (AFAdRevenueData.contains(lowerCase)) {
                    String format = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{obj}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "");
                    AFLogger.afWarnLog(format);
                    str = "";
                } else {
                    str = "-".concat(obj);
                }
            }
            return StringsKt.J(str != null ? str : "").toString();
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFe1vSDK$2, reason: invalid class name */
    public static final class AnonymousClass2 extends kotlin.jvm.internal.p implements Function0<String> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String packageName = AFe1vSDK.this.AFAdRevenueData.getRevenue.getCurrencyIso4217Code.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            return AFe1vSDK.getRevenue(packageName, AFe1vSDK.getMonetizationNetwork(AFe1vSDK.this));
        }
    }

    @Metadata
    public static final class AFa1tSDK {
        private AFa1tSDK() {
        }

        public static List<String> AFAdRevenueData() {
            return AFe1vSDK.component1;
        }

        public static void getMonetizationNetwork(AFe1xSDK aFe1xSDK) {
            AFe1vSDK.areAllFieldsValid = aFe1xSDK;
        }

        public /* synthetic */ AFa1tSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

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
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFc1jSDK, "");
        this.AFAdRevenueData = aFc1kSDK;
        this.getCurrencyIso4217Code = aFc1jSDK;
        this.component2 = R5.i.b(new AnonymousClass1());
        this.getRevenue = R5.i.b(new AnonymousClass2());
    }

    public static boolean getMediationNetwork() {
        return areAllFieldsValid == null;
    }

    public static final void getMediationNetwork(AFe1xSDK aFe1xSDK) {
        AFa1tSDK.getMonetizationNetwork(aFe1xSDK);
    }

    public final String getCurrencyIso4217Code() {
        int i2 = AFa1uSDK.getMonetizationNetwork[(getMediationNetwork() ? AFe1sSDK.DEFAULT : AFe1sSDK.API).ordinal()];
        if (i2 == 1) {
            return "appsflyersdk.com";
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return "";
            }
            throw new R5.k();
        }
        AFe1xSDK aFe1xSDK = areAllFieldsValid;
        String str = aFe1xSDK != null ? aFe1xSDK.getCurrencyIso4217Code : null;
        return str == null ? "" : str;
    }

    public final String getMonetizationNetwork() {
        int i2 = AFa1uSDK.getMonetizationNetwork[(getMediationNetwork() ? AFe1sSDK.DEFAULT : AFe1sSDK.API).ordinal()];
        if (i2 == 1) {
            return (String) this.getRevenue.getValue();
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return "";
            }
            throw new R5.k();
        }
        AFe1xSDK aFe1xSDK = areAllFieldsValid;
        String str = aFe1xSDK != null ? aFe1xSDK.getMonetizationNetwork : null;
        return str == null ? "" : str;
    }

    public static final /* synthetic */ String getRevenue(String str, String str2) {
        String str3 = str + str2;
        Intrinsics.checkNotNullParameter(str3, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str3.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "");
        String encodeToString = Base64.encodeToString(digest, 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "");
        String lowerCase = encodeToString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String substring = new Regex("[^\\w]+").replace(lowerCase, "").substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring + ".";
    }

    public static final /* synthetic */ String getMonetizationNetwork(AFe1vSDK aFe1vSDK) {
        return (String) aFe1vSDK.component2.getValue();
    }
}
