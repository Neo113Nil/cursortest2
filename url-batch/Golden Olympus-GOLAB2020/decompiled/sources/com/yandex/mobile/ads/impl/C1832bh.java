package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.TypedArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.bh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1832bh {
    public static final int a(@NotNull Context context, int i4) {
        int i5;
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i4});
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            i5 = obtainStyledAttributes.getColor(0, 0);
        } catch (Exception unused) {
            i5 = -16777216;
        }
        obtainStyledAttributes.recycle();
        return i5;
    }
}
