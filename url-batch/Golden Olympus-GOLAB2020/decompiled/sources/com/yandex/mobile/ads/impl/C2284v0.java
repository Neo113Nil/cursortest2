package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2284v0 {
    public static String a(Object[] objArr, int i4, String str, String str2) {
        String format = String.format(str, Arrays.copyOf(objArr, i4));
        Intrinsics.checkNotNullExpressionValue(format, str2);
        return format;
    }
}
