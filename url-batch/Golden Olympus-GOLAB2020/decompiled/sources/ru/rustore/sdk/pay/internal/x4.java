package ru.rustore.sdk.pay.internal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class x4 {
    @NotNull
    public static Date a(@NotNull String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", new Locale("ru", "RU"));
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date parse = simpleDateFormat.parse(time);
        if (parse != null) {
            return parse;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
