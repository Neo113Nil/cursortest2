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

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\b\u0016\u0018\u0000 \u00012\u00020\u0016:\u0001\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0005\u001a\u00020\u0002X\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0013\u0010\u0007\u001a\u00020\u0002X\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\rR\u0014\u0010\u0003\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Lcom/appsflyer/internal/AFc1cSDK;", "AFa1ySDK", "", "afErrorLog", "Lkotlin/Lazy;", "AFInAppEventType", "values", "AFInAppEventParameterName", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFb1cSDK;", "Lcom/appsflyer/internal/AFb1cSDK;", "AFKeystoreWrapper", "", "()Z", "valueOf", "Lcom/appsflyer/internal/AFb1fSDK;", "Lcom/appsflyer/internal/AFb1fSDK;", "afInfoLog", "p0", "p1", "<init>", "(Lcom/appsflyer/internal/AFb1cSDK;Lcom/appsflyer/internal/AFb1fSDK;)V", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public class AFc1cSDK {
    private static AFc1dSDK afRDLog;

    /* renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    private final AFb1cSDK AFKeystoreWrapper;

    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    private final AFb1fSDK afErrorLog;

    /* renamed from: afErrorLog, reason: from kotlin metadata */
    private final Lazy AFInAppEventType;

    /* renamed from: values, reason: from kotlin metadata */
    public final Lazy AFInAppEventParameterName;

    /* renamed from: AFa1ySDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static String AFKeystoreWrapper = "https://%scdn-%ssettings.%s/android/v1/%s/settings";
    public static String valueOf = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";
    private static final List<String> afInfoLog = CollectionsKt.listOf((Object[]) new String[]{"googleplay", "playstore", "googleplaystore"});

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

    public static final void AFInAppEventType(AFc1dSDK aFc1dSDK) {
        Companion.values(aFc1dSDK);
    }

    public AFc1cSDK(AFb1cSDK aFb1cSDK, AFb1fSDK aFb1fSDK) {
        Intrinsics.checkNotNullParameter(aFb1cSDK, "");
        Intrinsics.checkNotNullParameter(aFb1fSDK, "");
        this.AFKeystoreWrapper = aFb1cSDK;
        this.afErrorLog = aFb1fSDK;
        this.AFInAppEventType = LazyKt.lazy(new Function0<String>() { // from class: com.appsflyer.internal.AFc1cSDK.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String values = AFa1dSDK.values(AFc1cSDK.this.afErrorLog, AFc1cSDK.this.AFKeystoreWrapper.AFKeystoreWrapper());
                String str = values;
                if (str != null && !StringsKt.isBlank(str)) {
                    String obj = StringsKt.trim((CharSequence) str).toString();
                    Companion companion = AFc1cSDK.INSTANCE;
                    List<String> AFInAppEventType = Companion.AFInAppEventType();
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    String lowerCase = obj.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (!AFInAppEventType.contains(lowerCase)) {
                        values = "-".concat(String.valueOf(obj));
                    } else {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{obj}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "");
                        AFLogger.afWarnLog(format);
                        values = "";
                    }
                }
                return StringsKt.trim((CharSequence) (values != null ? values : "")).toString();
            }
        });
        this.AFInAppEventParameterName = LazyKt.lazy(new Function0<String>() { // from class: com.appsflyer.internal.AFc1cSDK.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String packageName = AFc1cSDK.this.AFKeystoreWrapper.values.AFInAppEventParameterName.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "");
                return AFc1cSDK.AFInAppEventParameterName(packageName, AFc1cSDK.AFInAppEventParameterName(AFc1cSDK.this));
            }
        });
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\b\u0086\u0003\u0018\u00002\u00020\u0012B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\t\u001a\u00020\u0002X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0012\u0010\u000b\u001a\u00020\u0002X\u0087\u0002¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\f@\u0007X\u0087\n¢\u0006\f\n\u0004\b\r\u0010\u000e\"\u0004\b\u000b\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFc1cSDK$AFa1ySDK;", "", "", "afInfoLog", "Ljava/util/List;", "AFInAppEventType", "()Ljava/util/List;", "AFKeystoreWrapper", "Ljava/lang/String;", "AFInAppEventParameterName", "valueOf", "values", "Lcom/appsflyer/internal/AFc1dSDK;", "afRDLog", "Lcom/appsflyer/internal/AFc1dSDK;", "(Lcom/appsflyer/internal/AFc1dSDK;)V", "<init>", "()V", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1cSDK$AFa1ySDK, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static List<String> AFInAppEventType() {
            return AFc1cSDK.afInfoLog;
        }

        public static void values(AFc1dSDK aFc1dSDK) {
            AFc1cSDK.afRDLog = aFc1dSDK;
        }
    }

    public static boolean AFInAppEventParameterName() {
        return afRDLog == null;
    }

    public final String valueOf() {
        AFc1aSDK aFc1aSDK;
        if (AFInAppEventParameterName()) {
            aFc1aSDK = AFc1aSDK.DEFAULT;
        } else {
            aFc1aSDK = AFc1aSDK.API;
        }
        int i = AFa1vSDK.AFKeystoreWrapper[aFc1aSDK.ordinal()];
        if (i == 1) {
            return (String) this.AFInAppEventParameterName.getValue();
        }
        if (i != 2) {
            if (i == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFc1dSDK aFc1dSDK = afRDLog;
        String str = aFc1dSDK != null ? aFc1dSDK.AFInAppEventParameterName : null;
        return str == null ? "" : str;
    }

    public final String AFInAppEventType() {
        AFc1aSDK aFc1aSDK;
        if (AFInAppEventParameterName()) {
            aFc1aSDK = AFc1aSDK.DEFAULT;
        } else {
            aFc1aSDK = AFc1aSDK.API;
        }
        int i = AFa1vSDK.AFKeystoreWrapper[aFc1aSDK.ordinal()];
        if (i == 1) {
            return "appsflyersdk.com";
        }
        if (i != 2) {
            if (i == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFc1dSDK aFc1dSDK = afRDLog;
        String str = aFc1dSDK != null ? aFc1dSDK.values : null;
        return str == null ? "" : str;
    }

    public static final /* synthetic */ String AFInAppEventParameterName(String str, String str2) {
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

    public static final /* synthetic */ String AFInAppEventParameterName(AFc1cSDK aFc1cSDK) {
        return (String) aFc1cSDK.AFInAppEventType.getValue();
    }
}
