package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.common.AdActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.l1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2055l1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final rx1 f28382a;

    public C2055l1(@NotNull rx1 showActivityProvider) {
        Intrinsics.checkNotNullParameter(showActivityProvider, "showActivityProvider");
        this.f28382a = showActivityProvider;
    }

    @NotNull
    public final Intent a(@NotNull Context context, long j4) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28382a.getClass();
        Intent intent = new Intent(context, (Class<?>) AdActivity.class);
        intent.putExtra("window_type", "window_type_activity_result");
        intent.putExtra("data_identifier", j4);
        return intent;
    }
}
