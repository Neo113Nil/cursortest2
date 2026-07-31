package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jh2 {
    @NotNull
    public static String a(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        String obj = StringsKt.W0(string).toString();
        if (obj.length() <= 0) {
            return "";
        }
        return "yma_" + obj;
    }
}
