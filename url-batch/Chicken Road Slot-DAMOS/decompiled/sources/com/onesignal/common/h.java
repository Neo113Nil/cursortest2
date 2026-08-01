package com.onesignal.common;

import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h {
    public static final h INSTANCE = new h();
    private static final hd.g sdkVersion$delegate = hd.h.b(a.INSTANCE);

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends p implements Function0 {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return h.INSTANCE.formatVersion$com_onesignal_core("5.6.2");
        }
    }

    private h() {
    }

    public final String formatVersion$com_onesignal_core(String str) {
        List split$default;
        List split$default2;
        String str2;
        String str3;
        String t6;
        str.getClass();
        split$default = StringsKt__StringsKt.split$default(str, new String[]{"-"}, false, 2, 2, null);
        split$default2 = StringsKt__StringsKt.split$default((CharSequence) split$default.get(0), new String[]{"."}, false, 0, 6, null);
        String str4 = (String) CollectionsKt.y(0, split$default2);
        String str5 = "00";
        if (str4 == null || (str2 = StringsKt.t(2, str4)) == null) {
            str2 = "00";
        }
        String str6 = (String) CollectionsKt.y(1, split$default2);
        if (str6 == null || (str3 = StringsKt.t(2, str6)) == null) {
            str3 = "00";
        }
        String str7 = (String) CollectionsKt.y(2, split$default2);
        if (str7 != null && (t6 = StringsKt.t(2, str7)) != null) {
            str5 = t6;
        }
        String str8 = str2 + str3 + str5;
        if (split$default.size() <= 1) {
            return str8;
        }
        return str8 + '-' + ((String) split$default.get(1));
    }

    public final String getSdkVersion() {
        return (String) sdkVersion$delegate.getValue();
    }

    public final boolean isValidEmail(String str) {
        str.getClass();
        if (str.length() == 0) {
            return false;
        }
        Pattern compile = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$");
        compile.getClass();
        return compile.matcher(str).matches();
    }

    public final boolean isValidPhoneNumber(String str) {
        str.getClass();
        if (str.length() == 0) {
            return false;
        }
        Pattern compile = Pattern.compile("^\\+?[1-9]\\d{1,14}$");
        compile.getClass();
        return compile.matcher(str).matches();
    }
}
