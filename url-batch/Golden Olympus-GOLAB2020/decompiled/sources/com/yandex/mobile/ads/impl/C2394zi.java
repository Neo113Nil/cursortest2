package com.yandex.mobile.ads.impl;

import android.util.Base64;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.zi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2394zi {
    @NotNull
    public static String a(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        byte[] bytes = value.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return a(bytes);
    }

    @Nullable
    public static String b(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = value.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        try {
            byte[] decode = Base64.decode(bytes, 0);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
            return new String(decode, charset);
        } catch (Exception unused) {
            Object[] args = new Object[0];
            int i4 = ap0.f23396b;
            Intrinsics.checkNotNullParameter(args, "args");
            return null;
        }
    }

    @NotNull
    public static String a(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            byte[] decode = Base64.decode(data, 0);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
            return new String(decode, Charsets.UTF_8);
        } catch (Exception unused) {
            String str = new String(data, Charsets.UTF_8);
            Object[] args = new Object[0];
            int i4 = ap0.f23396b;
            Intrinsics.checkNotNullParameter(args, "args");
            return str;
        }
    }
}
