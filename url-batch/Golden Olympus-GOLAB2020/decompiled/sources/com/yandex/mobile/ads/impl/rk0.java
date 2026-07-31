package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class rk0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f31253a;

    public rk0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31253a = context;
    }

    @NotNull
    public final File a() {
        File file = new File(this.f31253a.getCacheDir(), "debug_panel");
        file.mkdir();
        return new File(file, "monetization_ads_debug_panel_report.txt");
    }
}
