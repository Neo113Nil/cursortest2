package com.appsflyer.internal;

import M2.p;
import android.util.Base64;
import com.appsflyer.AFLogger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.y;
import y2.C1336k;
import y2.C1338m;
import y2.InterfaceC1335j;
import z2.C1441y;

@Metadata
/* loaded from: classes.dex */
public final class AFe1gSDK {

    /* renamed from: e, reason: collision with root package name */
    private static AFe1kSDK f5882e;
    public final InterfaceC1335j AFKeystoreWrapper;
    private final InterfaceC1335j registerClient;
    private final AFd1sSDK valueOf;
    private final AFd1qSDK values;
    public static final AFa1zSDK AFa1zSDK = new AFa1zSDK(null);
    public static String AFInAppEventType = "https://%scdn-%ssettings.%s/android/v1/%s/settings";
    public static String AFInAppEventParameterName = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";

    /* renamed from: d, reason: collision with root package name */
    private static final List<String> f5881d = C1441y.e("googleplay", "playstore", "googleplaystore");

    @Metadata
    /* renamed from: com.appsflyer.internal.AFe1gSDK$3, reason: invalid class name */
    public static final class AnonymousClass3 extends p implements Function0<String> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String AFKeystoreWrapper = AFb1vSDK.AFKeystoreWrapper(AFe1gSDK.this.values, AFe1gSDK.this.valueOf.d());
            if (AFKeystoreWrapper != null && !y.x(AFKeystoreWrapper)) {
                String obj = y.M(AFKeystoreWrapper).toString();
                List<String> AFInAppEventParameterName = AFa1zSDK.AFInAppEventParameterName();
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String lowerCase = obj.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (AFInAppEventParameterName.contains(lowerCase)) {
                    String format = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{obj}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "");
                    AFLogger.afWarnLog(format);
                    AFKeystoreWrapper = "";
                } else {
                    AFKeystoreWrapper = "-".concat(obj);
                }
            }
            return y.M(AFKeystoreWrapper != null ? AFKeystoreWrapper : "").toString();
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFe1gSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends p implements Function0<String> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String packageName = AFe1gSDK.this.valueOf.valueOf.AFKeystoreWrapper.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            return AFe1gSDK.valueOf(packageName, AFe1gSDK.AFKeystoreWrapper(AFe1gSDK.this));
        }
    }

    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] AFInAppEventType;

        static {
            int[] iArr = new int[AFe1eSDK.values().length];
            iArr[AFe1eSDK.DEFAULT.ordinal()] = 1;
            iArr[AFe1eSDK.API.ordinal()] = 2;
            iArr[AFe1eSDK.RC.ordinal()] = 3;
            AFInAppEventType = iArr;
        }
    }

    @Metadata
    public static final class AFa1zSDK {
        private AFa1zSDK() {
        }

        public static List<String> AFInAppEventParameterName() {
            return AFe1gSDK.f5881d;
        }

        public /* synthetic */ AFa1zSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static void AFInAppEventParameterName(AFe1kSDK aFe1kSDK) {
            AFe1gSDK.f5882e = aFe1kSDK;
        }
    }

    public AFe1gSDK(AFd1sSDK aFd1sSDK, AFd1qSDK aFd1qSDK) {
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        this.valueOf = aFd1sSDK;
        this.values = aFd1qSDK;
        this.registerClient = C1336k.a(new AnonymousClass3());
        this.AFKeystoreWrapper = C1336k.a(new AnonymousClass5());
    }

    public static final /* synthetic */ String AFKeystoreWrapper(AFe1gSDK aFe1gSDK) {
        return (String) aFe1gSDK.registerClient.getValue();
    }

    public static final void valueOf(AFe1kSDK aFe1kSDK) {
        AFa1zSDK.AFInAppEventParameterName(aFe1kSDK);
    }

    public final String AFInAppEventType() {
        int i2 = AFa1ySDK.AFInAppEventType[(valueOf() ? AFe1eSDK.DEFAULT : AFe1eSDK.API).ordinal()];
        if (i2 == 1) {
            return (String) this.AFKeystoreWrapper.getValue();
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return "";
            }
            throw new C1338m();
        }
        AFe1kSDK aFe1kSDK = f5882e;
        String str = aFe1kSDK != null ? aFe1kSDK.valueOf : null;
        return str == null ? "" : str;
    }

    public final String AFInAppEventParameterName() {
        int i2 = AFa1ySDK.AFInAppEventType[(valueOf() ? AFe1eSDK.DEFAULT : AFe1eSDK.API).ordinal()];
        if (i2 == 1) {
            return "appsflyersdk.com";
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return "";
            }
            throw new C1338m();
        }
        AFe1kSDK aFe1kSDK = f5882e;
        String str = aFe1kSDK != null ? aFe1kSDK.values : null;
        return str == null ? "" : str;
    }

    public static boolean valueOf() {
        return f5882e == null;
    }

    public static final /* synthetic */ String valueOf(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        String obj = sb2.toString();
        Intrinsics.checkNotNullParameter(obj, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = obj.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "");
        String encodeToString = Base64.encodeToString(digest, 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "");
        String lowerCase = encodeToString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String substring = new Regex("[^\\w]+").replace(lowerCase, "").substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(substring, "");
        sb.append(substring);
        sb.append('-');
        return sb.toString();
    }
}
