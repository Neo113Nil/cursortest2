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

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0005\u001a\u00020\u0002X\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0013\u0010\u0007\u001a\u00020\u0002X\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0011\u0010\b\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0006\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\t"}, d2 = {"Lcom/appsflyer/internal/AFe1gSDK;", "", "", "d", "Lkotlin/Lazy;", "AFInAppEventParameterName", "values", "AFInAppEventType", "AFKeystoreWrapper", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFd1pSDK;", "Lcom/appsflyer/internal/AFd1pSDK;", "", "()Z", "valueOf", "Lcom/appsflyer/internal/AFd1xSDK;", "Lcom/appsflyer/internal/AFd1xSDK;", "AFLogger", "p0", "p1", "<init>", "(Lcom/appsflyer/internal/AFd1pSDK;Lcom/appsflyer/internal/AFd1xSDK;)V", "AFa1zSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AFe1gSDK {
    private static AFe1hSDK AFLogger;

    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    private final AFd1xSDK AFLogger;

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    private final AFd1pSDK values;

    /* renamed from: d, reason: from kotlin metadata */
    private final Lazy AFInAppEventParameterName;

    /* renamed from: values, reason: from kotlin metadata */
    public final Lazy AFInAppEventType;

    /* renamed from: AFa1zSDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static String valueOf = "https://%scdn-%ssettings.%s/android/v1/%s/settings";
    public static String AFInAppEventParameterName = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";
    private static final List<String> unregisterClient = CollectionsKt.listOf((Object[]) new String[]{"googleplay", "playstore", "googleplaystore"});

    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] AFInAppEventType;

        static {
            int[] iArr = new int[AFe1kSDK.values().length];
            iArr[AFe1kSDK.DEFAULT.ordinal()] = 1;
            iArr[AFe1kSDK.API.ordinal()] = 2;
            iArr[AFe1kSDK.RC.ordinal()] = 3;
            AFInAppEventType = iArr;
        }
    }

    public static final void values(AFe1hSDK aFe1hSDK) {
        Companion.values(aFe1hSDK);
    }

    public AFe1gSDK(AFd1pSDK aFd1pSDK, AFd1xSDK aFd1xSDK) {
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        Intrinsics.checkNotNullParameter(aFd1xSDK, "");
        this.values = aFd1pSDK;
        this.AFLogger = aFd1xSDK;
        this.AFInAppEventParameterName = LazyKt.lazy(new Function0<String>() { // from class: com.appsflyer.internal.AFe1gSDK.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String AFInAppEventType = AFb1tSDK.AFInAppEventType(AFe1gSDK.this.AFLogger, AFe1gSDK.this.values.AFInAppEventParameterName());
                String str = AFInAppEventType;
                if (str != null && !StringsKt.isBlank(str)) {
                    String obj = StringsKt.trim((CharSequence) str).toString();
                    Companion companion = AFe1gSDK.INSTANCE;
                    List<String> valueOf2 = Companion.valueOf();
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    String lowerCase = obj.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (!valueOf2.contains(lowerCase)) {
                        AFInAppEventType = "-".concat(String.valueOf(obj));
                    } else {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{obj}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "");
                        AFLogger.afWarnLog(format);
                        AFInAppEventType = "";
                    }
                }
                return StringsKt.trim((CharSequence) (AFInAppEventType != null ? AFInAppEventType : "")).toString();
            }
        });
        this.AFInAppEventType = LazyKt.lazy(new Function0<String>() { // from class: com.appsflyer.internal.AFe1gSDK.5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String packageName = AFe1gSDK.this.values.AFInAppEventParameterName.AFKeystoreWrapper.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "");
                return AFe1gSDK.AFKeystoreWrapper(packageName, AFe1gSDK.values(AFe1gSDK.this));
            }
        });
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\n\u001a\u00020\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u0012\u0010\u000b\u001a\u00020\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\f@\u0007X\u0087\n¢\u0006\f\n\u0004\b\r\u0010\u000e\"\u0004\b\n\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFe1gSDK$AFa1zSDK;", "", "", "", "unregisterClient", "Ljava/util/List;", "valueOf", "()Ljava/util/List;", "AFInAppEventParameterName", "Ljava/lang/String;", "values", "AFInAppEventType", "Lcom/appsflyer/internal/AFe1hSDK;", "AFLogger", "Lcom/appsflyer/internal/AFe1hSDK;", "(Lcom/appsflyer/internal/AFe1hSDK;)V", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1gSDK$AFa1zSDK, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static List<String> valueOf() {
            return AFe1gSDK.unregisterClient;
        }

        public static void values(AFe1hSDK aFe1hSDK) {
            AFe1gSDK.AFLogger = aFe1hSDK;
        }
    }

    public static boolean AFInAppEventType() {
        return AFLogger == null;
    }

    public final String AFInAppEventParameterName() {
        AFe1kSDK aFe1kSDK;
        if (AFInAppEventType()) {
            aFe1kSDK = AFe1kSDK.DEFAULT;
        } else {
            aFe1kSDK = AFe1kSDK.API;
        }
        int i = AFa1vSDK.AFInAppEventType[aFe1kSDK.ordinal()];
        if (i == 1) {
            return (String) this.AFInAppEventType.getValue();
        }
        if (i != 2) {
            if (i == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFe1hSDK aFe1hSDK = AFLogger;
        String str = aFe1hSDK != null ? aFe1hSDK.AFInAppEventType : null;
        return str == null ? "" : str;
    }

    public final String AFKeystoreWrapper() {
        AFe1kSDK aFe1kSDK;
        if (AFInAppEventType()) {
            aFe1kSDK = AFe1kSDK.DEFAULT;
        } else {
            aFe1kSDK = AFe1kSDK.API;
        }
        int i = AFa1vSDK.AFInAppEventType[aFe1kSDK.ordinal()];
        if (i == 1) {
            return "appsflyersdk.com";
        }
        if (i != 2) {
            if (i == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFe1hSDK aFe1hSDK = AFLogger;
        String str = aFe1hSDK != null ? aFe1hSDK.values : null;
        return str == null ? "" : str;
    }

    public static final /* synthetic */ String AFKeystoreWrapper(String str, String str2) {
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

    public static final /* synthetic */ String values(AFe1gSDK aFe1gSDK) {
        return (String) aFe1gSDK.AFInAppEventParameterName.getValue();
    }
}
