package com.squareup.cash.work.data.api;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;

/* loaded from: classes7.dex */
public final class DateRangedFeed implements ClosedRange {
    public final List itemsByDay;
    public final LoadPhase load;

    public DateRangedFeed(List list, LoadPhase loadPhase) {
        list.getClass();
        loadPhase.getClass();
        this.itemsByDay = list;
        this.load = loadPhase;
        if (list.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$3("DateRangedFeed requires at least one day.");
            throw null;
        }
        int size = list.size();
        for (int i = 1; i < size; i++) {
            LocalDate plusDays = ((DayBucket) this.itemsByDay.get(i - 1)).date.plusDays(1L);
            if (!((DayBucket) this.itemsByDay.get(i)).date.equals(plusDays)) {
                throw new IllegalArgumentException(("Non-contiguous day at index " + i + ": expected " + plusDays + " but was " + ((DayBucket) this.itemsByDay.get(i)).date).toString());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateRangedFeed)) {
            return false;
        }
        DateRangedFeed dateRangedFeed = (DateRangedFeed) obj;
        return Intrinsics.areEqual(this.itemsByDay, dateRangedFeed.itemsByDay) && Intrinsics.areEqual(this.load, dateRangedFeed.load);
    }

    public final List get(LocalDate localDate) {
        List list;
        DayBucket dayBucket = (DayBucket) CollectionsKt.getOrNull((int) ChronoUnit.DAYS.between(getStart(), localDate), this.itemsByDay);
        return (dayBucket == null || (list = dayBucket.items) == null) ? EmptyList.INSTANCE : list;
    }

    @Override // kotlin.ranges.ClosedRange
    public final LocalDate getEndInclusive() {
        return ((DayBucket) CollectionsKt.last(this.itemsByDay)).date;
    }

    @Override // kotlin.ranges.ClosedRange
    public final LocalDate getStart() {
        return ((DayBucket) CollectionsKt.first(this.itemsByDay)).date;
    }

    public final int hashCode() {
        return this.load.hashCode() + (this.itemsByDay.hashCode() * 31);
    }

    public final String toString() {
        return "DateRangedFeed(itemsByDay=" + this.itemsByDay + ", load=" + this.load + ")";
    }
}
