package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0005\u001a\u00020\u0002X\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0013\u0010\u0006\u001a\u00020\u0002X\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0011\u0010\b\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\n\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007"}, d2 = {"Lcom/appsflyer/internal/AFe1gSDK;", "", "", "registerClient", "Lkotlin/Lazy;", "AFKeystoreWrapper", "AFInAppEventParameterName", "()Ljava/lang/String;", "AFInAppEventType", "Lcom/appsflyer/internal/AFd1sSDK;", "valueOf", "Lcom/appsflyer/internal/AFd1sSDK;", "", "()Z", "values", "Lcom/appsflyer/internal/AFd1qSDK;", "Lcom/appsflyer/internal/AFd1qSDK;", "e", "unregisterClient", "p0", "p1", "<init>", "(Lcom/appsflyer/internal/AFd1sSDK;Lcom/appsflyer/internal/AFd1qSDK;)V", "AFa1zSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AFe1gSDK {
    private static AFe1kSDK e;

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    public final Lazy AFInAppEventParameterName;

    /* renamed from: registerClient, reason: from kotlin metadata */
    private final Lazy AFKeystoreWrapper;
    private final AFd1sSDK valueOf;

    /* renamed from: values, reason: from kotlin metadata */
    private final AFd1qSDK e;

    /* renamed from: AFa1zSDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static String AFInAppEventType = "https://%scdn-%ssettings.%s/android/v1/%s/settings";
    public static String AFInAppEventParameterName = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";
    private static final List<String> d = CollectionsKt.listOf((Object[]) new String[]{"googleplay", "playstore", "googleplaystore"});

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

    public static final void valueOf(AFe1kSDK aFe1kSDK) {
        Companion.AFInAppEventParameterName(aFe1kSDK);
    }

    public AFe1gSDK(AFd1sSDK aFd1sSDK, AFd1qSDK aFd1qSDK) {
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        this.valueOf = aFd1sSDK;
        this.e = aFd1qSDK;
        this.AFKeystoreWrapper = LazyKt.lazy(new Function0<String>() { // from class: com.appsflyer.internal.AFe1gSDK.3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String AFKeystoreWrapper = AFb1vSDK.AFKeystoreWrapper(AFe1gSDK.this.e, AFe1gSDK.this.valueOf.d());
                String str = AFKeystoreWrapper;
                if (str != null && !StringsKt.isBlank(str)) {
                    String obj = StringsKt.trim((CharSequence) str).toString();
                    Companion companion = AFe1gSDK.INSTANCE;
                    List<String> AFInAppEventParameterName2 = Companion.AFInAppEventParameterName();
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    String lowerCase = obj.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (!AFInAppEventParameterName2.contains(lowerCase)) {
                        AFKeystoreWrapper = "-".concat(String.valueOf(obj));
                    } else {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{obj}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "");
                        AFLogger.afWarnLog(format);
                        AFKeystoreWrapper = "";
                    }
                }
                return StringsKt.trim((CharSequence) (AFKeystoreWrapper != null ? AFKeystoreWrapper : "")).toString();
            }
        });
        this.AFInAppEventParameterName = LazyKt.lazy(new Function0<String>() { // from class: com.appsflyer.internal.AFe1gSDK.5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String packageName = AFe1gSDK.this.valueOf.valueOf.AFKeystoreWrapper.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "");
                return AFe1gSDK.valueOf(packageName, AFe1gSDK.AFKeystoreWrapper(AFe1gSDK.this));
            }
        });
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b@\u0007X\u0087\n¢\u0006\f\n\u0004\b\f\u0010\r\"\u0004\b\u0006\u0010\u000e"}, d2 = {"Lcom/appsflyer/internal/AFe1gSDK$AFa1zSDK;", "", "", "", "d", "Ljava/util/List;", "AFInAppEventParameterName", "()Ljava/util/List;", "AFInAppEventType", "Ljava/lang/String;", "valueOf", "Lcom/appsflyer/internal/AFe1kSDK;", "e", "Lcom/appsflyer/internal/AFe1kSDK;", "(Lcom/appsflyer/internal/AFe1kSDK;)V", "values", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1gSDK$AFa1zSDK, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static List<String> AFInAppEventParameterName() {
            return AFe1gSDK.d;
        }

        public static void AFInAppEventParameterName(AFe1kSDK aFe1kSDK) {
            AFe1gSDK.e = aFe1kSDK;
        }
    }

    public static boolean valueOf() {
        return e == null;
    }

    public final String AFInAppEventType() {
        AFe1eSDK aFe1eSDK;
        if (valueOf()) {
            aFe1eSDK = AFe1eSDK.DEFAULT;
        } else {
            aFe1eSDK = AFe1eSDK.API;
        }
        int i = AFa1ySDK.AFInAppEventType[aFe1eSDK.ordinal()];
        if (i == 1) {
            return (String) this.AFInAppEventParameterName.getValue();
        }
        if (i != 2) {
            if (i == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFe1kSDK aFe1kSDK = e;
        String str = aFe1kSDK != null ? aFe1kSDK.valueOf : null;
        return str == null ? "" : str;
    }

    public final String AFInAppEventParameterName() {
        AFe1eSDK aFe1eSDK;
        if (valueOf()) {
            aFe1eSDK = AFe1eSDK.DEFAULT;
        } else {
            aFe1eSDK = AFe1eSDK.API;
        }
        int i = AFa1ySDK.AFInAppEventType[aFe1eSDK.ordinal()];
        if (i == 1) {
            return "appsflyersdk.com";
        }
        if (i != 2) {
            if (i == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFe1kSDK aFe1kSDK = e;
        String str = aFe1kSDK != null ? aFe1kSDK.values : null;
        return str == null ? "" : str;
    }

    public static final /* synthetic */ String valueOf(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        String obj = new StringBuilder().append(str).append(str2).toString();
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
        return sb.append(substring).append('-').toString();
    }

    public static final /* synthetic */ String AFKeystoreWrapper(AFe1gSDK aFe1gSDK) {
        return (String) aFe1gSDK.AFKeystoreWrapper.getValue();
    }
}
