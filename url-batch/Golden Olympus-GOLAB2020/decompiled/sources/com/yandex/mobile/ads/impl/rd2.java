package com.yandex.mobile.ads.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class rd2 {
    @Nullable
    public static final Long a(@Nullable String str) {
        if (str != null) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
                return Long.valueOf(simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse("00:00:00").getTime());
            } catch (ParseException unused) {
                ap0.c(new Object[0]);
            }
        }
        return null;
    }

    @Nullable
    public static final Integer b(@Nullable String str) {
        if (str != null) {
            try {
                return Integer.valueOf(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                ap0.c(new Object[0]);
            }
        }
        return null;
    }

    public static final void a(@Nullable Object obj) {
        Intrinsics.checkNotNullParameter("AdBreak", "fieldDescription");
        if (obj != null) {
            return;
        }
        a();
        throw null;
    }

    private static void a() {
        throw new IllegalArgumentException("AdBreak not set!");
    }
}
