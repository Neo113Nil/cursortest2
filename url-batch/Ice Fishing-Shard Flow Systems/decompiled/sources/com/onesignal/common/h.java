package com.onesignal.common;

import R5.InterfaceC0168h;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes.dex */
public final class h {
    public static final h INSTANCE = new h();
    private static final InterfaceC0168h sdkVersion$delegate = R5.i.b(a.INSTANCE);

    public static final class a extends p implements Function0 {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return h.INSTANCE.formatVersion$com_onesignal_core("5.9.5");
        }
    }

    private h() {
    }

    public final String formatVersion$com_onesignal_core(String version) {
        List split$default;
        List split$default2;
        String str;
        String str2;
        String C7;
        Intrinsics.checkNotNullParameter(version, "version");
        split$default = StringsKt__StringsKt.split$default(version, new String[]{"-"}, false, 2, 2, null);
        split$default2 = StringsKt__StringsKt.split$default((CharSequence) split$default.get(0), new String[]{"."}, false, 0, 6, null);
        String str3 = (String) CollectionsKt.q(0, split$default2);
        String str4 = "00";
        if (str3 == null || (str = StringsKt.C(2, str3)) == null) {
            str = "00";
        }
        String str5 = (String) CollectionsKt.q(1, split$default2);
        if (str5 == null || (str2 = StringsKt.C(2, str5)) == null) {
            str2 = "00";
        }
        String str6 = (String) CollectionsKt.q(2, split$default2);
        if (str6 != null && (C7 = StringsKt.C(2, str6)) != null) {
            str4 = C7;
        }
        String str7 = str + str2 + str4;
        if (split$default.size() <= 1) {
            return str7;
        }
        return str7 + '-' + ((String) split$default.get(1));
    }

    public final String getSdkVersion() {
        return (String) sdkVersion$delegate.getValue();
    }

    public final boolean isValidEmail(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        if (email.length() == 0) {
            return false;
        }
        Pattern compile = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$");
        Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
        return compile.matcher(email).matches();
    }

    public final boolean isValidPhoneNumber(String number) {
        Intrinsics.checkNotNullParameter(number, "number");
        if (number.length() == 0) {
            return false;
        }
        Pattern compile = Pattern.compile("^\\+?[1-9]\\d{1,14}$");
        Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
        return compile.matcher(number).matches();
    }
}
