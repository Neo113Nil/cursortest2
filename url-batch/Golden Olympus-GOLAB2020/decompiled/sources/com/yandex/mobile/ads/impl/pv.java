package com.yandex.mobile.ads.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class pv {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a f30584a = new a();

    public static final class a extends ThreadLocal<DateFormat> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        public final DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(v82.f33553d);
            return simpleDateFormat;
        }
    }

    @NotNull
    public static final String a(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        String format = f30584a.get().format(date);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
