package com.yandex.mobile.ads.impl;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class yu0 {
    public static byte[] a(bv0 bv0Var, String str, int i4, String str2) {
        bv0Var.getClass();
        byte[] decode = Base64.decode(str, i4);
        Intrinsics.checkNotNullExpressionValue(decode, str2);
        return decode;
    }
}
