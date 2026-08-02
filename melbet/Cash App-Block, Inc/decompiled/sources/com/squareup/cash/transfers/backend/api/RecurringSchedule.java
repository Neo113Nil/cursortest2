package com.squareup.cash.transfers.backend.api;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RecurringSchedule {
    public final List daysOfPeriod;
    public final Frequency frequency;
    public final Integer timeOfDay;
    public final String timezone;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Frequency {
        public static final /* synthetic */ Frequency[] $VALUES;
        public static final Frequency EVERY_DAY;
        public static final Frequency EVERY_MONTH;
        public static final Frequency EVERY_TWO_WEEKS;
        public static final Frequency EVERY_WEEK;

        static {
            Frequency frequency = new Frequency("EVERY_DAY", 0);
            EVERY_DAY = frequency;
            Frequency frequency2 = new Frequency("EVERY_WEEK", 1);
            EVERY_WEEK = frequency2;
            Frequency frequency3 = new Frequency("EVERY_TWO_WEEKS", 2);
            EVERY_TWO_WEEKS = frequency3;
            Frequency frequency4 = new Frequency("EVERY_MONTH", 3);
            EVERY_MONTH = frequency4;
            $VALUES = new Frequency[]{frequency, frequency2, frequency3, frequency4};
        }

        public static Frequency valueOf(String str) {
            return (Frequency) Enum.valueOf(Frequency.class, str);
        }

        public static Frequency[] values() {
            return (Frequency[]) $VALUES.clone();
        }
    }

    public RecurringSchedule(Frequency frequency, List list, String str, Integer num) {
        list.getClass();
        this.frequency = frequency;
        this.daysOfPeriod = list;
        this.timezone = str;
        this.timeOfDay = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringSchedule)) {
            return false;
        }
        RecurringSchedule recurringSchedule = (RecurringSchedule) obj;
        return this.frequency == recurringSchedule.frequency && Intrinsics.areEqual(this.daysOfPeriod, recurringSchedule.daysOfPeriod) && Intrinsics.areEqual(this.timezone, recurringSchedule.timezone) && Intrinsics.areEqual(this.timeOfDay, recurringSchedule.timeOfDay);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(this.frequency.hashCode() * 31, 31, this.daysOfPeriod);
        String str = this.timezone;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.timeOfDay;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "RecurringSchedule(frequency=" + this.frequency + ", daysOfPeriod=" + this.daysOfPeriod + ", timezone=" + this.timezone + ", timeOfDay=" + this.timeOfDay + ")";
    }
}
