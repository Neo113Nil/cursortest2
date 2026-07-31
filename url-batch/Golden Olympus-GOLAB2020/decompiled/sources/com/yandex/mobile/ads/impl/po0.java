package com.yandex.mobile.ads.impl;

import android.util.Log;
import com.yandex.mobile.ads.impl.i11;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class po0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final i11 f30511a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f30512b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f30513c;

    static {
        int i4 = i11.f27051d;
        f30511a = i11.a.a();
        f30512b = "YandexAds";
        f30513c = true;
    }

    private static String a(String str) {
        return "[Integration] " + str;
    }

    public static final void b(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        if (f30513c || y01.f34757a.a()) {
            kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
            Locale locale = Locale.US;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            String a4 = a(format2);
            if (f30513c) {
                Log.i(f30512b, a4);
            }
            if (y01.f34757a.a()) {
                f30511a.a(x01.f34359b, f30512b, a4);
            }
        }
    }

    public static final void c(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        if (f30513c || y01.f34757a.a()) {
            kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
            Locale locale = Locale.US;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            String a4 = a(format2);
            if (f30513c) {
                Log.w(f30512b, a4);
            }
            if (y01.f34757a.a()) {
                f30511a.a(x01.f34360c, f30512b, a4);
            }
        }
    }

    public static final void a(boolean z4) {
        f30513c = z4;
    }

    public static final void a(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        if (f30513c || y01.f34757a.a()) {
            kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
            Locale locale = Locale.US;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            String a4 = a(format2);
            if (f30513c) {
                Log.e(f30512b, a4);
            }
            if (y01.f34757a.a()) {
                f30511a.a(x01.f34361d, f30512b, a4);
            }
        }
    }
}
