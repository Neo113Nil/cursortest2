package com.squareup.cash.work.data.real;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RealShiftTimeFormatter {
    public volatile Pair cachedFormatters;
    public final AndroidClock clock;
    public final RealLocaleManager localeManager;
    public final AndroidStringManager stringManager;

    public final class Formatters {
        public final DateTimeFormatter dashboardCardTime;
        public final DateTimeFormatter date;
        public final DateTimeFormatter day;
        public final DateTimeFormatter dayAndDate;
        public final DateTimeFormatter monthYear;
        public final DateTimeFormatter time;
        public final DateTimeFormatter zoneAbbrev;

        public Formatters(DateTimeFormatter dateTimeFormatter, DateTimeFormatter dateTimeFormatter2, DateTimeFormatter dateTimeFormatter3, DateTimeFormatter dateTimeFormatter4, DateTimeFormatter dateTimeFormatter5, DateTimeFormatter dateTimeFormatter6, DateTimeFormatter dateTimeFormatter7) {
            dateTimeFormatter.getClass();
            dateTimeFormatter2.getClass();
            dateTimeFormatter3.getClass();
            dateTimeFormatter4.getClass();
            dateTimeFormatter5.getClass();
            dateTimeFormatter7.getClass();
            this.dayAndDate = dateTimeFormatter;
            this.date = dateTimeFormatter2;
            this.day = dateTimeFormatter3;
            this.monthYear = dateTimeFormatter4;
            this.time = dateTimeFormatter5;
            this.dashboardCardTime = dateTimeFormatter6;
            this.zoneAbbrev = dateTimeFormatter7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Formatters)) {
                return false;
            }
            Formatters formatters = (Formatters) obj;
            return Intrinsics.areEqual(this.dayAndDate, formatters.dayAndDate) && Intrinsics.areEqual(this.date, formatters.date) && Intrinsics.areEqual(this.day, formatters.day) && Intrinsics.areEqual(this.monthYear, formatters.monthYear) && Intrinsics.areEqual(this.time, formatters.time) && this.dashboardCardTime.equals(formatters.dashboardCardTime) && Intrinsics.areEqual(this.zoneAbbrev, formatters.zoneAbbrev);
        }

        public final int hashCode() {
            return this.zoneAbbrev.hashCode() + ((this.dashboardCardTime.hashCode() + ((this.time.hashCode() + ((this.monthYear.hashCode() + ((this.day.hashCode() + ((this.date.hashCode() + (this.dayAndDate.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Formatters(dayAndDate=" + this.dayAndDate + ", date=" + this.date + ", day=" + this.day + ", monthYear=" + this.monthYear + ", time=" + this.time + ", dashboardCardTime=" + this.dashboardCardTime + ", zoneAbbrev=" + this.zoneAbbrev + ")";
        }
    }

    public RealShiftTimeFormatter(AndroidClock androidClock, AndroidStringManager androidStringManager, RealLocaleManager realLocaleManager) {
        this.clock = androidClock;
        this.stringManager = androidStringManager;
        this.localeManager = realLocaleManager;
    }

    public static String formatTimeRange$default(RealShiftTimeFormatter realShiftTimeFormatter, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2) {
        DateTimeFormatter dateTimeFormatter = realShiftTimeFormatter.formatters().time;
        String format2 = offsetDateTime.format(dateTimeFormatter);
        String format3 = offsetDateTime2.format(dateTimeFormatter);
        AndroidStringManager androidStringManager = realShiftTimeFormatter.stringManager;
        format2.getClass();
        format3.getClass();
        ArrayMap arrayMap = new ArrayMap(2);
        arrayMap.put("start_time", format2);
        arrayMap.put("end_time", format3);
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format4 = new MessageFormat(resources.getString(R.string.work_shift_time_range)).format(arrayMap);
        format4.getClass();
        return format4;
    }

    public final ZoneOffset deviceOffsetAt(Instant instant) {
        ZoneOffset offset = instant.atZone(this.clock.timeZone().toZoneId()).getOffset();
        offset.getClass();
        return offset;
    }

    public final String formatDashboardCardTimeRange(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str) {
        String timeZoneAbbreviation;
        offsetDateTime.getClass();
        offsetDateTime2.getClass();
        DateTimeFormatter dateTimeFormatter = formatters().dashboardCardTime;
        String format2 = offsetDateTime.format(dateTimeFormatter);
        String format3 = offsetDateTime2.format(dateTimeFormatter);
        format2.getClass();
        format3.getClass();
        ArrayMap arrayMap = new ArrayMap(2);
        arrayMap.put("start_time", format2);
        arrayMap.put("end_time", format3);
        Resources resources = this.stringManager.resources;
        resources.getClass();
        String format4 = new MessageFormat(resources.getString(R.string.work_shift_time_range_dashboard)).format(arrayMap);
        format4.getClass();
        if (str != null) {
            ZoneOffset offset = offsetDateTime.getOffset();
            Instant instant = offsetDateTime.toInstant();
            instant.getClass();
            if (!Intrinsics.areEqual(offset, deviceOffsetAt(instant)) && (timeZoneAbbreviation = timeZoneAbbreviation(offsetDateTime, str)) != null) {
                return Boxes$$ExternalSyntheticOutline1.m(format4, " (", timeZoneAbbreviation, ")");
            }
        }
        return format4;
    }

    public final String formatDate(OffsetDateTime offsetDateTime) {
        LocalDate localDate = offsetDateTime.toLocalDate();
        ZoneOffset offset = offsetDateTime.getOffset();
        Instant instant = offsetDateTime.toInstant();
        instant.getClass();
        if (!Intrinsics.areEqual(offset, deviceOffsetAt(instant))) {
            String format2 = localDate.format(formatters().date);
            format2.getClass();
            return format2;
        }
        LocalDate localDate2 = DimensionKt.now(this.clock).atOffset(offsetDateTime.getOffset()).toLocalDate();
        boolean areEqual = Intrinsics.areEqual(localDate, localDate2);
        AndroidStringManager androidStringManager = this.stringManager;
        if (areEqual) {
            return androidStringManager.get(R.string.work_shift_date_today);
        }
        if (Intrinsics.areEqual(localDate, localDate2.plusDays(1L))) {
            return androidStringManager.get(R.string.work_shift_date_tomorrow);
        }
        if (Intrinsics.areEqual(localDate, localDate2.minusDays(1L))) {
            return androidStringManager.get(R.string.work_shift_date_yesterday);
        }
        String format3 = localDate.format(formatters().date);
        format3.getClass();
        return format3;
    }

    public final String formatDayDate(OffsetDateTime offsetDateTime) {
        offsetDateTime.getClass();
        LocalDate localDate = offsetDateTime.toLocalDate();
        ZoneOffset offset = offsetDateTime.getOffset();
        Instant instant = offsetDateTime.toInstant();
        instant.getClass();
        if (!Intrinsics.areEqual(offset, deviceOffsetAt(instant))) {
            String format2 = localDate.format(formatters().dayAndDate);
            format2.getClass();
            return format2;
        }
        LocalDate nowLocalDate = DimensionKt.nowLocalDate(this.clock);
        boolean areEqual = Intrinsics.areEqual(localDate, nowLocalDate);
        AndroidStringManager androidStringManager = this.stringManager;
        if (areEqual) {
            return androidStringManager.get(R.string.work_shift_date_today);
        }
        if (Intrinsics.areEqual(localDate, nowLocalDate.plusDays(1L))) {
            return androidStringManager.get(R.string.work_shift_date_tomorrow);
        }
        if (Intrinsics.areEqual(localDate, nowLocalDate.minusDays(1L))) {
            return androidStringManager.get(R.string.work_shift_date_yesterday);
        }
        String format3 = localDate.format(formatters().dayAndDate);
        format3.getClass();
        return format3;
    }

    public final String formatDuration(int i) {
        Resources resources = this.stringManager.resources;
        int i2 = i / 3600;
        int i3 = (i % 3600) / 60;
        if (i2 == 0) {
            String valueOf = String.valueOf(i3);
            valueOf.getClass();
            ArrayMap arrayMap = new ArrayMap(1);
            arrayMap.put("minutes", valueOf);
            resources.getClass();
            String format2 = new MessageFormat(resources.getString(R.string.work_shift_duration_minutes)).format(arrayMap);
            format2.getClass();
            return format2;
        }
        if (i3 == 0) {
            String valueOf2 = String.valueOf(i2);
            valueOf2.getClass();
            ArrayMap arrayMap2 = new ArrayMap(1);
            arrayMap2.put("hours", valueOf2);
            resources.getClass();
            String format3 = new MessageFormat(resources.getString(R.string.work_shift_duration_hours)).format(arrayMap2);
            format3.getClass();
            return format3;
        }
        String valueOf3 = String.valueOf(i2);
        String valueOf4 = String.valueOf(i3);
        valueOf3.getClass();
        valueOf4.getClass();
        ArrayMap arrayMap3 = new ArrayMap(2);
        arrayMap3.put("hours", valueOf3);
        arrayMap3.put("minutes", valueOf4);
        resources.getClass();
        String format4 = new MessageFormat(resources.getString(R.string.work_shift_duration_hours_minutes)).format(arrayMap3);
        format4.getClass();
        return format4;
    }

    public final String formatPayPeriod(String str, String str2) {
        Object failure;
        Object failure2;
        if (str != null && str2 != null) {
            try {
                Result.Companion companion = Result.Companion;
                failure = LocalDateTime.parse(str);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            LocalDateTime localDateTime = (LocalDateTime) failure;
            if (localDateTime != null) {
                try {
                    failure2 = LocalDateTime.parse(str2);
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.Companion;
                    failure2 = new Result.Failure(th2);
                }
                if (failure2 instanceof Result.Failure) {
                    failure2 = null;
                }
                LocalDateTime localDateTime2 = (LocalDateTime) failure2;
                if (localDateTime2 != null) {
                    LocalDateTime minusDays = localDateTime2.minusDays(1L);
                    Formatters formatters = formatters();
                    return Recorder$$ExternalSyntheticOutline2.m(localDateTime.format(formatters.date), " – ", localDateTime.getMonth() == minusDays.getMonth() ? minusDays.format(formatters.day) : minusDays.format(formatters.date));
                }
            }
        }
        return null;
    }

    public final String formatShiftTimeRange(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str) {
        DateTimeFormatter dateTimeFormatter = formatters().time;
        String format2 = offsetDateTime.format(dateTimeFormatter);
        String format3 = offsetDateTime2.format(dateTimeFormatter);
        String str2 = "";
        if (str != null) {
            ZoneOffset offset = offsetDateTime.getOffset();
            Instant instant = offsetDateTime.toInstant();
            instant.getClass();
            if (!Intrinsics.areEqual(offset, deviceOffsetAt(instant))) {
                String timeZoneAbbreviation = timeZoneAbbreviation(offsetDateTime, str);
                String m = timeZoneAbbreviation != null ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(" (", timeZoneAbbreviation, ")") : null;
                if (m != null) {
                    str2 = m;
                }
            }
        }
        return Boxes$$ExternalSyntheticOutline1.m(format2, " – ", format3, str2);
    }

    public final String formatTime(OffsetDateTime offsetDateTime, String str) {
        offsetDateTime.getClass();
        String format2 = offsetDateTime.format(formatters().time);
        String str2 = "";
        if (str != null) {
            ZoneOffset offset = offsetDateTime.getOffset();
            Instant instant = offsetDateTime.toInstant();
            instant.getClass();
            if (!Intrinsics.areEqual(offset, deviceOffsetAt(instant))) {
                String timeZoneAbbreviation = timeZoneAbbreviation(offsetDateTime, str);
                String m = timeZoneAbbreviation != null ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(" (", timeZoneAbbreviation, ")") : null;
                if (m != null) {
                    str2 = m;
                }
            }
        }
        return Recorder$$ExternalSyntheticOutline2.m$1(format2, str2);
    }

    public final Formatters formatters() {
        Locale locale = (Locale) this.localeManager.resolvedLocale.$$delegate_0.getValue();
        Pair pair = this.cachedFormatters;
        if (pair != null) {
            Locale locale2 = (Locale) pair.first;
            Formatters formatters = (Formatters) pair.second;
            if (Intrinsics.areEqual(locale2, locale)) {
                return formatters;
            }
        }
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("EEE, MMM d", locale);
        ofPattern.getClass();
        DateTimeFormatter ofPattern2 = DateTimeFormatter.ofPattern("MMM d", locale);
        ofPattern2.getClass();
        DateTimeFormatter ofPattern3 = DateTimeFormatter.ofPattern("d", locale);
        ofPattern3.getClass();
        DateTimeFormatter ofPattern4 = DateTimeFormatter.ofPattern("MMM yyyy", locale);
        ofPattern4.getClass();
        DateTimeFormatter ofPattern5 = DateTimeFormatter.ofPattern("h:mm a", locale);
        ofPattern5.getClass();
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendPattern("h:mm").appendText(ChronoField.AMPM_OF_DAY, MapsKt__MapsKt.mapOf(new Pair(0L, "am"), new Pair(1L, "pm"))).toFormatter(locale);
        formatter.getClass();
        DateTimeFormatter ofPattern6 = DateTimeFormatter.ofPattern("z", locale);
        ofPattern6.getClass();
        Formatters formatters2 = new Formatters(ofPattern, ofPattern2, ofPattern3, ofPattern4, ofPattern5, formatter, ofPattern6);
        this.cachedFormatters = new Pair(locale, formatters2);
        return formatters2;
    }

    public final String timeZoneAbbreviation(OffsetDateTime offsetDateTime, String str) {
        Object failure;
        try {
            Result.Companion companion = Result.Companion;
            failure = str != null ? ZoneId.of(str) : null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        ZoneId zoneId = (ZoneId) failure;
        if (zoneId != null && Intrinsics.areEqual(zoneId.getRules().getOffset(offsetDateTime.toInstant()), offsetDateTime.getOffset())) {
            return offsetDateTime.toInstant().atZone(zoneId).format(formatters().zoneAbbrev);
        }
        return null;
    }
}
