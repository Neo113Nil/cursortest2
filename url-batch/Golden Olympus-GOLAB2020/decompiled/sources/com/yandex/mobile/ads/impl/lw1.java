package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class lw1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final j11 f28790a;

    public /* synthetic */ lw1() {
        this(new j11());
    }

    @NotNull
    public final String a() {
        this.f28790a.getClass();
        va2 a4 = j11.a();
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        String format = String.format(Locale.US, "%d.%d%d", Arrays.copyOf(new Object[]{Integer.valueOf(a4.a()), Integer.valueOf(a4.b()), Integer.valueOf(a4.c())}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @NotNull
    public final String b() {
        this.f28790a.getClass();
        va2 a4 = j11.a();
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        String format = String.format(Locale.US, "%d.%d.%d", Arrays.copyOf(new Object[]{Integer.valueOf(a4.a()), Integer.valueOf(a4.b()), Integer.valueOf(a4.c())}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public lw1(@NotNull j11 mobileAdsVersionInfoProvider) {
        Intrinsics.checkNotNullParameter(mobileAdsVersionInfoProvider, "mobileAdsVersionInfoProvider");
        this.f28790a = mobileAdsVersionInfoProvider;
    }
}
