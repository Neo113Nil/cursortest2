package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Build;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class y00 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a10 f34754a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ds0 f34755b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final os1 f34756c;

    public y00() {
        this(0);
    }

    @Nullable
    public final String a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f34755b.a(context);
    }

    @NotNull
    public final String b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String lowerCase = this.f34754a.a(context).name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @NotNull
    public final String c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f34755b.c(context);
    }

    @Nullable
    public final List<String> d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f34755b.b(context);
    }

    public /* synthetic */ y00(int i4) {
        this(new a10(), new ds0());
    }

    @Nullable
    public static String a() {
        return Build.MANUFACTURER;
    }

    public final boolean c() {
        this.f34756c.getClass();
        return os1.a();
    }

    @Nullable
    public static String b() {
        return Build.VERSION.RELEASE;
    }

    public y00(@NotNull a10 deviceTypeProvider, @NotNull ds0 localeProvider) {
        Intrinsics.checkNotNullParameter(deviceTypeProvider, "deviceTypeProvider");
        Intrinsics.checkNotNullParameter(localeProvider, "localeProvider");
        this.f34754a = deviceTypeProvider;
        this.f34755b = localeProvider;
        this.f34756c = os1.f30189a;
    }
}
