package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes3.dex */
public interface to1 {
    @SuppressLint({"WrongConstant"})
    static int a(int i4) {
        return i4 & UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @SuppressLint({"WrongConstant"})
    static int b(int i4) {
        return i4 & 64;
    }

    int a(yb0 yb0Var);

    int f();

    String getName();

    static int a(int i4, int i5, int i6) {
        return i4 | i5 | i6 | UserVerificationMethods.USER_VERIFY_PATTERN;
    }
}
