package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.common.AdActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class gd0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final rx1 f26112a;

    public gd0(@NotNull rx1 showActivityProvider) {
        Intrinsics.checkNotNullParameter(showActivityProvider, "showActivityProvider");
        this.f26112a = showActivityProvider;
    }

    @NotNull
    public final Intent a(@NotNull Context context, long j4) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26112a.getClass();
        Intent intent = new Intent(context, (Class<?>) AdActivity.class);
        intent.putExtra("window_type", "window_type_fullscreen");
        intent.putExtra("data_identifier", j4);
        if (!(context instanceof Activity)) {
            intent.addFlags(402653184);
        }
        return intent;
    }
}
