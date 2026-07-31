package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class at1<T extends View> {
    @Nullable
    public static View a(@NotNull Context context, @NotNull Class layoutClass, int i4, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(layoutClass, "layoutClass");
        try {
            return (View) layoutClass.cast(LayoutInflater.from(context).inflate(i4, viewGroup, false));
        } catch (Exception e4) {
            ap0.b(e4);
            return null;
        }
    }
}
