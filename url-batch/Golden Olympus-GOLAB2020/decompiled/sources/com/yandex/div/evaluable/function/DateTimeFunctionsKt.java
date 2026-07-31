package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.DateTime;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class DateTimeFunctionsKt {
    @NotNull
    public static final Calendar toCalendar(@NotNull DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "<this>");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(dateTime.getTimezone$div_evaluable());
        calendar.setTimeInMillis(dateTime.getTimestampMillis$div_evaluable());
        Intrinsics.checkNotNullExpressionValue(calendar, "calendar");
        return calendar;
    }

    @NotNull
    public static final Date toDate(@NotNull DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "<this>");
        return new Date(dateTime.getTimestampMillis$div_evaluable() - dateTime.getTimezone$div_evaluable().getRawOffset());
    }
}
