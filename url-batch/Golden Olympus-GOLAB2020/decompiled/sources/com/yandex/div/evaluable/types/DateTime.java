package com.yandex.div.evaluable.types;

import W1.h;
import W1.i;
import W1.l;
import com.huawei.hms.iap.entity.OrderStatusCode;
import java.util.Calendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DateTime implements Comparable<DateTime> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final SimpleTimeZone utcTimezone = new SimpleTimeZone(0, "UTC");

    @NotNull
    private final h calendar$delegate;
    private final long timestampMillis;
    private final long timestampUtc;

    @NotNull
    private final TimeZone timezone;
    private final int timezoneMinutes;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String formatDate$div_evaluable(@NotNull Calendar c4) {
            Intrinsics.checkNotNullParameter(c4, "c");
            return String.valueOf(c4.get(1)) + '-' + StringsKt.p0(String.valueOf(c4.get(2) + 1), 2, '0') + '-' + StringsKt.p0(String.valueOf(c4.get(5)), 2, '0') + ' ' + StringsKt.p0(String.valueOf(c4.get(11)), 2, '0') + ':' + StringsKt.p0(String.valueOf(c4.get(12)), 2, '0') + ':' + StringsKt.p0(String.valueOf(c4.get(13)), 2, '0');
        }

        private Companion() {
        }
    }

    public DateTime(long j4, @NotNull TimeZone timezone) {
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        this.timestampMillis = j4;
        this.timezone = timezone;
        this.calendar$delegate = i.a(l.f9608d, new DateTime$calendar$2(this));
        this.timezoneMinutes = timezone.getRawOffset() / 60;
        this.timestampUtc = j4 - (r5 * OrderStatusCode.ORDER_STATE_CANCEL);
    }

    private final Calendar getCalendar() {
        return (Calendar) this.calendar$delegate.getValue();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateTime) && this.timestampUtc == ((DateTime) obj).timestampUtc;
    }

    public final long getTimestampMillis$div_evaluable() {
        return this.timestampMillis;
    }

    @NotNull
    public final TimeZone getTimezone$div_evaluable() {
        return this.timezone;
    }

    public int hashCode() {
        return Long.hashCode(this.timestampUtc);
    }

    @NotNull
    public String toString() {
        Companion companion = Companion;
        Calendar calendar = getCalendar();
        Intrinsics.checkNotNullExpressionValue(calendar, "calendar");
        return companion.formatDate$div_evaluable(calendar);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull DateTime other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.compare(this.timestampUtc, other.timestampUtc);
    }
}
