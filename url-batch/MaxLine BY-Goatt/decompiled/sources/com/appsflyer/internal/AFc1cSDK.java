package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.o81;
import defpackage.qv;
import defpackage.up2;
import defpackage.y91;
import defpackage.ya1;
import defpackage.yt;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class AFc1cSDK {
    private static AFc1dSDK afRDLog;
    private final AFb1cSDK AFInAppEventParameterName;
    private final AFb1fSDK AFInAppEventType;
    private final y91 afErrorLog;
    public final y91 values;
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);
    public static String AFKeystoreWrapper = "https://%scdn-%ssettings.%s/android/v1/%s/settings";
    public static String valueOf = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";
    private static final List<String> afInfoLog = qv.g("googleplay", "playstore", "googleplaystore");

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    /* renamed from: com.appsflyer.internal.AFc1cSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends o81 implements Function0<String> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String packageName = AFc1cSDK.this.AFInAppEventParameterName.values.AFInAppEventParameterName.getPackageName();
            packageName.getClass();
            return AFc1cSDK.AFInAppEventParameterName(packageName, AFc1cSDK.AFInAppEventParameterName(AFc1cSDK.this));
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    /* renamed from: com.appsflyer.internal.AFc1cSDK$2, reason: invalid class name */
    public static final class AnonymousClass2 extends o81 implements Function0<String> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String values = AFa1dSDK.values(AFc1cSDK.this.AFInAppEventType, AFc1cSDK.this.AFInAppEventParameterName.AFKeystoreWrapper());
            String str = BuildConfig.FLAVOR;
            if (values != null && !up2.y(values)) {
                String obj = up2.K(values).toString();
                List<String> AFInAppEventType = AFa1ySDK.AFInAppEventType();
                Locale locale = Locale.getDefault();
                locale.getClass();
                String lowerCase = obj.toLowerCase(locale);
                lowerCase.getClass();
                if (AFInAppEventType.contains(lowerCase)) {
                    AFLogger.afWarnLog(String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{obj}, 1)));
                    values = BuildConfig.FLAVOR;
                } else {
                    values = "-".concat(obj);
                }
            }
            if (values != null) {
                str = values;
            }
            return up2.K(str).toString();
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[AFc1aSDK.values().length];
            iArr[AFc1aSDK.DEFAULT.ordinal()] = 1;
            iArr[AFc1aSDK.API.ordinal()] = 2;
            iArr[AFc1aSDK.RC.ordinal()] = 3;
            AFKeystoreWrapper = iArr;
        }
    }

    public AFc1cSDK(AFb1cSDK aFb1cSDK, AFb1fSDK aFb1fSDK) {
        aFb1cSDK.getClass();
        aFb1fSDK.getClass();
        this.AFInAppEventParameterName = aFb1cSDK;
        this.AFInAppEventType = aFb1fSDK;
        this.afErrorLog = ya1.b(new AnonymousClass2());
        this.values = ya1.b(new AnonymousClass1());
    }

    public static final /* synthetic */ String AFInAppEventParameterName(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        String obj = sb.toString();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = obj.getBytes(yt.b);
        bytes.getClass();
        byte[] digest = messageDigest.digest(bytes);
        digest.getClass();
        String encodeToString = Base64.encodeToString(digest, 2);
        encodeToString.getClass();
        String lowerCase = encodeToString.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return new Regex("[^\\w]+").replace(lowerCase, BuildConfig.FLAVOR).substring(0, 6).concat("-");
    }

    public final String AFInAppEventType() {
        int i = AFa1vSDK.AFKeystoreWrapper[(AFInAppEventParameterName() ? AFc1aSDK.DEFAULT : AFc1aSDK.API).ordinal()];
        if (i == 1) {
            return "appsflyersdk.com";
        }
        if (i == 2) {
            AFc1dSDK aFc1dSDK = afRDLog;
            String str = aFc1dSDK != null ? aFc1dSDK.values : null;
            return str == null ? BuildConfig.FLAVOR : str;
        }
        if (i == 3) {
            return BuildConfig.FLAVOR;
        }
        defpackage.a.b();
        return null;
    }

    public final String valueOf() {
        int i = AFa1vSDK.AFKeystoreWrapper[(AFInAppEventParameterName() ? AFc1aSDK.DEFAULT : AFc1aSDK.API).ordinal()];
        if (i == 1) {
            return (String) this.values.getValue();
        }
        if (i == 2) {
            AFc1dSDK aFc1dSDK = afRDLog;
            String str = aFc1dSDK != null ? aFc1dSDK.AFInAppEventParameterName : null;
            return str == null ? BuildConfig.FLAVOR : str;
        }
        if (i == 3) {
            return BuildConfig.FLAVOR;
        }
        defpackage.a.b();
        return null;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class AFa1ySDK {
        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static List<String> AFInAppEventType() {
            return AFc1cSDK.afInfoLog;
        }

        public static void values(AFc1dSDK aFc1dSDK) {
            AFc1cSDK.afRDLog = aFc1dSDK;
        }

        private AFa1ySDK() {
        }
    }

    public static final void AFInAppEventType(AFc1dSDK aFc1dSDK) {
        AFa1ySDK.values(aFc1dSDK);
    }

    public static boolean AFInAppEventParameterName() {
        return afRDLog == null;
    }

    public static final /* synthetic */ String AFInAppEventParameterName(AFc1cSDK aFc1cSDK) {
        return (String) aFc1cSDK.afErrorLog.getValue();
    }
}
