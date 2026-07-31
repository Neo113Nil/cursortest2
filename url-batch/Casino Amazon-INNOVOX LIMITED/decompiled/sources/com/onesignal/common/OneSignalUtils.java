package com.onesignal.common;

import com.onesignal.core.BuildConfig;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: OneSignalUtils.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onesignal/common/OneSignalUtils;", "", "()V", "sdkVersion", "", "getSdkVersion", "()Ljava/lang/String;", "sdkVersion$delegate", "Lkotlin/Lazy;", "formatVersion", "version", "formatVersion$com_onesignal_core", "isValidEmail", "", "email", "isValidPhoneNumber", "number", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OneSignalUtils {
    public static final OneSignalUtils INSTANCE = new OneSignalUtils();

    /* renamed from: sdkVersion$delegate, reason: from kotlin metadata */
    private static final Lazy sdkVersion = LazyKt.lazy(new Function0<String>() { // from class: com.onesignal.common.OneSignalUtils$sdkVersion$2
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return OneSignalUtils.INSTANCE.formatVersion$com_onesignal_core(BuildConfig.SDK_VERSION);
        }
    });

    private OneSignalUtils() {
    }

    public final String getSdkVersion() {
        return (String) sdkVersion.getValue();
    }

    public final String formatVersion$com_onesignal_core(String version) {
        String str;
        String str2;
        String padStart;
        Intrinsics.checkNotNullParameter(version, "version");
        List split$default = StringsKt.split$default((CharSequence) version, new String[]{TokenBuilder.TOKEN_DELIMITER}, false, 2, 2, (Object) null);
        List split$default2 = StringsKt.split$default((CharSequence) split$default.get(0), new String[]{"."}, false, 0, 6, (Object) null);
        String str3 = (String) CollectionsKt.getOrNull(split$default2, 0);
        String str4 = "00";
        if (str3 == null || (str = StringsKt.padStart(str3, 2, '0')) == null) {
            str = "00";
        }
        String str5 = (String) CollectionsKt.getOrNull(split$default2, 1);
        if (str5 == null || (str2 = StringsKt.padStart(str5, 2, '0')) == null) {
            str2 = "00";
        }
        String str6 = (String) CollectionsKt.getOrNull(split$default2, 2);
        if (str6 != null && (padStart = StringsKt.padStart(str6, 2, '0')) != null) {
            str4 = padStart;
        }
        String str7 = str + str2 + str4;
        return split$default.size() > 1 ? str7 + '-' + ((String) split$default.get(1)) : str7;
    }

    public final boolean isValidEmail(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        String str = email;
        if (str.length() == 0) {
            return false;
        }
        Pattern compile = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$");
        Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
        return compile.matcher(str).matches();
    }

    public final boolean isValidPhoneNumber(String number) {
        Intrinsics.checkNotNullParameter(number, "number");
        String str = number;
        if (str.length() == 0) {
            return false;
        }
        Pattern compile = Pattern.compile("^\\+?[1-9]\\d{1,14}$");
        Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
        return compile.matcher(str).matches();
    }
}
