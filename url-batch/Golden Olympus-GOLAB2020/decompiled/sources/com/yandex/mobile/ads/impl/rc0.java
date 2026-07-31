package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import com.yandex.mobile.ads.impl.od0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface rc0<T extends od0<T>> {
    @NotNull
    Object a(@NotNull T t4, @NotNull Activity activity);

    void a(@NotNull Context context);

    void a(@NotNull Context context, @NotNull C2360y7<String> c2360y7);

    @Nullable
    String getAdInfo();
}
