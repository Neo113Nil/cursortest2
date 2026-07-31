package com.yandex.mobile.ads.impl;

import android.util.Log;
import com.yandex.mobile.ads.impl.i11;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class um1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final i11 f33178a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f33179b = 0;

    static {
        int i4 = i11.f27051d;
        f33178a = i11.a.a();
    }

    public static void a(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        if (ap0.a() || y01.f34757a.a()) {
            kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
            Locale locale = Locale.US;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            if (ap0.a()) {
                Log.w("Yandex Mobile Ads", format2);
            }
            if (y01.f34757a.a()) {
                f33178a.a(x01.f34360c, "Yandex Mobile Ads", format2);
            }
        }
    }
}
