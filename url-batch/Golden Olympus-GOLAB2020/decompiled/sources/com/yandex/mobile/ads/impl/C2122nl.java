package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.common.AdActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.nl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2122nl {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final rx1 f29668a;

    public C2122nl(@NotNull rx1 showActivityProvider) {
        Intrinsics.checkNotNullParameter(showActivityProvider, "showActivityProvider");
        this.f29668a = showActivityProvider;
    }

    @NotNull
    public final Intent a(@NotNull Context context, @NotNull String browserUrl, long j4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(browserUrl, "browserUrl");
        this.f29668a.getClass();
        Intent intent = new Intent(context, (Class<?>) AdActivity.class);
        intent.putExtra("window_type", "window_type_browser");
        intent.putExtra("extra_browser_url", browserUrl);
        if (!(context instanceof Activity)) {
            intent.addFlags(402653184);
        }
        intent.putExtra("data_identifier", j4);
        return intent;
    }
}
