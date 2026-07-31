package com.chartboost.sdk.impl;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes6.dex */
public final class u2 {
    public static final u2 a = new u2();

    public static final String a(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        byte[] bytes = input.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        u2 u2Var = a;
        return u2Var.a(u2Var.b(bytes));
    }

    public final byte[] b(byte[] bArr) {
        return MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(bArr);
    }

    public final String a(byte[] bArr) {
        String format = String.format("%0" + (bArr.length << 1) + VastAttributes.HORIZONTAL_POSITION, Arrays.copyOf(new Object[]{new BigInteger(1, bArr)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
