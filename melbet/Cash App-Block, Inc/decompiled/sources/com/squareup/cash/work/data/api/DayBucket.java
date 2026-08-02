package com.squareup.cash.work.data.api;

import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class DayBucket {
    public final LocalDate date;
    public final List items;

    public DayBucket(LocalDate localDate, List list) {
        list.getClass();
        this.date = localDate;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DayBucket)) {
            return false;
        }
        DayBucket dayBucket = (DayBucket) obj;
        return this.date.equals(dayBucket.date) && Intrinsics.areEqual(this.items, dayBucket.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (this.date.hashCode() * 31);
    }

    public final String toString() {
        return "DayBucket(date=" + this.date + ", items=" + this.items + ")";
    }
}
