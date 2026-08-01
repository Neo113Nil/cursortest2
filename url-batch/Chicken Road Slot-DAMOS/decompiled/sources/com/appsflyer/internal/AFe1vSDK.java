package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0015\u0010\n\u001a\u00020\r8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0011\u001a\u00020\r8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0014\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0015"}, d2 = {"Lcom/appsflyer/internal/AFe1vSDK;", "", "Lcom/appsflyer/internal/AFc1oSDK;", "p0", "Lcom/appsflyer/internal/AFc1qSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1oSDK;Lcom/appsflyer/internal/AFc1qSDK;)V", "getRevenue", "Lcom/appsflyer/internal/AFc1oSDK;", "getMediationNetwork", "Lcom/appsflyer/internal/AFc1qSDK;", "component1", "", "component2", "Lhd/g;", "AFAdRevenueData", "getMonetizationNetwork", "", "()Z", "getCurrencyIso4217Code", "()Ljava/lang/String;", "component3", "AFa1ySDK"}, k = 1, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFe1vSDK {
    private static AFe1ySDK component1;

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    public final hd.g getMonetizationNetwork;

    /* renamed from: component2, reason: from kotlin metadata */
    private final hd.g getMediationNetwork;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    private final AFc1qSDK component1;
    private final AFc1oSDK getRevenue;

    /* renamed from: AFa1ySDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static String getMonetizationNetwork = "https://%scdn-%ssettings.%s/android/v1/%s/settings";
    public static String getCurrencyIso4217Code = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";
    private static final List<String> component4 = y.f("googleplay", "playstore", "googleplaystore");

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getRevenue", "()Ljava/lang/String;"}, k = a4.j.INTEGER_FIELD_NUMBER, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1vSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends wd.p implements Function0<String> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String packageName = AFe1vSDK.this.getRevenue.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName();
            packageName.getClass();
            return AFe1vSDK.getMediationNetwork(packageName, AFe1vSDK.AFAdRevenueData(AFe1vSDK.this));
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getMediationNetwork", "()Ljava/lang/String;"}, k = a4.j.INTEGER_FIELD_NUMBER, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1vSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends wd.p implements Function0<String> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String AFAdRevenueData = AFa1ySDK.AFAdRevenueData(AFe1vSDK.this.component1, AFe1vSDK.this.getRevenue.component3());
            if (AFAdRevenueData != null && !StringsKt.r(AFAdRevenueData)) {
                String obj = StringsKt.y(AFAdRevenueData).toString();
                List<String> monetizationNetwork = Companion.getMonetizationNetwork();
                Locale locale = Locale.getDefault();
                locale.getClass();
                String lowerCase = obj.toLowerCase(locale);
                lowerCase.getClass();
                if (monetizationNetwork.contains(lowerCase)) {
                    AFLogger.afWarnLog(String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{obj}, 1)));
                    AFAdRevenueData = "";
                } else {
                    AFAdRevenueData = "-".concat(obj);
                }
            }
            return StringsKt.y(AFAdRevenueData != null ? AFAdRevenueData : "").toString();
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] AFAdRevenueData;

        static {
            int[] iArr = new int[AFe1tSDK.values().length];
            try {
                iArr[AFe1tSDK.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1tSDK.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFe1tSDK.RC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AFAdRevenueData = iArr;
        }
    }

    public AFe1vSDK(AFc1oSDK aFc1oSDK, AFc1qSDK aFc1qSDK) {
        aFc1oSDK.getClass();
        aFc1qSDK.getClass();
        this.getRevenue = aFc1oSDK;
        this.component1 = aFc1qSDK;
        this.getMediationNetwork = hd.h.b(new AnonymousClass5());
        this.getMonetizationNetwork = hd.h.b(new AnonymousClass1());
    }

    public static final /* synthetic */ String getMediationNetwork(String str, String str2) {
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

    public static final void getMonetizationNetwork(AFe1ySDK aFe1ySDK) {
        Companion.getMonetizationNetwork(aFe1ySDK);
    }

    public final String AFAdRevenueData() {
        int i3 = AFa1uSDK.AFAdRevenueData[(getMediationNetwork() ? AFe1tSDK.DEFAULT : AFe1tSDK.API).ordinal()];
        if (i3 == 1) {
            return "appsflyersdk.com";
        }
        if (i3 == 2) {
            AFe1ySDK aFe1ySDK = component1;
            String str = aFe1ySDK != null ? aFe1ySDK.getCurrencyIso4217Code : null;
            return str == null ? "" : str;
        }
        if (i3 == 3) {
            return "";
        }
        a2.r.p();
        return null;
    }

    public final String getCurrencyIso4217Code() {
        int i3 = AFa1uSDK.AFAdRevenueData[(getMediationNetwork() ? AFe1tSDK.DEFAULT : AFe1tSDK.API).ordinal()];
        if (i3 == 1) {
            return (String) this.getMonetizationNetwork.getValue();
        }
        if (i3 == 2) {
            AFe1ySDK aFe1ySDK = component1;
            String str = aFe1ySDK != null ? aFe1ySDK.getMonetizationNetwork : null;
            return str == null ? "" : str;
        }
        if (i3 == 3) {
            return "";
        }
        a2.r.p();
        return null;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u001e\u0010\b\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\"\u0004\b\b\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFe1vSDK$AFa1ySDK;", "", "<init>", "()V", "", "", "component4", "Ljava/util/List;", "getMonetizationNetwork", "()Ljava/util/List;", "AFAdRevenueData", "Ljava/lang/String;", "getMediationNetwork", "getCurrencyIso4217Code", "Lcom/appsflyer/internal/AFe1ySDK;", "component1", "Lcom/appsflyer/internal/AFe1ySDK;", "(Lcom/appsflyer/internal/AFe1ySDK;)V"}, k = 1, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1vSDK$AFa1ySDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static List<String> getMonetizationNetwork() {
            return AFe1vSDK.component4;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static void getMonetizationNetwork(AFe1ySDK aFe1ySDK) {
            AFe1vSDK.component1 = aFe1ySDK;
        }
    }

    public static final /* synthetic */ String AFAdRevenueData(AFe1vSDK aFe1vSDK) {
        return (String) aFe1vSDK.getMediationNetwork.getValue();
    }

    public static boolean getMediationNetwork() {
        return component1 == null;
    }
}
