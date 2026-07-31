package com.onesignal.common;

import java.util.List;
import java.util.regex.Pattern;
import k5.InterfaceC0475e;
import l5.AbstractC0506j;
import m1.AbstractC0521b;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class h {
    public static final h INSTANCE = new h();
    private static final InterfaceC0475e sdkVersion$delegate = AbstractC0521b.x(a.INSTANCE);

    public static final class a extends kotlin.jvm.internal.j implements InterfaceC0732a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final String invoke() {
            return h.INSTANCE.formatVersion$com_onesignal_core("5.9.6");
        }
    }

    private h() {
    }

    public final String formatVersion$com_onesignal_core(String version) {
        String str;
        String str2;
        String W6;
        kotlin.jvm.internal.i.e(version, "version");
        List b02 = F5.j.b0(version, new String[]{"-"}, 2);
        List b03 = F5.j.b0((CharSequence) b02.get(0), new String[]{"."}, 6);
        String str3 = (String) AbstractC0506j.F(0, b03);
        String str4 = "00";
        if (str3 == null || (str = F5.j.W(str3, 2)) == null) {
            str = "00";
        }
        String str5 = (String) AbstractC0506j.F(1, b03);
        if (str5 == null || (str2 = F5.j.W(str5, 2)) == null) {
            str2 = "00";
        }
        String str6 = (String) AbstractC0506j.F(2, b03);
        if (str6 != null && (W6 = F5.j.W(str6, 2)) != null) {
            str4 = W6;
        }
        String str7 = str + str2 + str4;
        if (b02.size() <= 1) {
            return str7;
        }
        return str7 + '-' + ((String) b02.get(1));
    }

    public final String getSdkVersion() {
        return (String) sdkVersion$delegate.getValue();
    }

    public final boolean isValidEmail(String email) {
        kotlin.jvm.internal.i.e(email, "email");
        if (email.length() == 0) {
            return false;
        }
        Pattern compile = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$");
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        return compile.matcher(email).matches();
    }

    public final boolean isValidPhoneNumber(String number) {
        kotlin.jvm.internal.i.e(number, "number");
        if (number.length() == 0) {
            return false;
        }
        Pattern compile = Pattern.compile("^\\+?[1-9]\\d{1,14}$");
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        return compile.matcher(number).matches();
    }
}
