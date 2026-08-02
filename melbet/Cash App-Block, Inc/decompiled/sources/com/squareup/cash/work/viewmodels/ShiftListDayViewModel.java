package com.squareup.cash.work.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes7.dex */
public final class ShiftListDayViewModel {
    public final LocalDate date;
    public final String dateHeader;
    public final boolean isPast;
    public final boolean isToday;
    public final ImmutableList schedules;
    public final ImmutableList timecards;

    public ShiftListDayViewModel(LocalDate localDate, String str, boolean z, boolean z2, ImmutableList immutableList, ImmutableList immutableList2) {
        immutableList.getClass();
        immutableList2.getClass();
        this.date = localDate;
        this.dateHeader = str;
        this.isToday = z;
        this.isPast = z2;
        this.schedules = immutableList;
        this.timecards = immutableList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftListDayViewModel)) {
            return false;
        }
        ShiftListDayViewModel shiftListDayViewModel = (ShiftListDayViewModel) obj;
        return this.date.equals(shiftListDayViewModel.date) && this.dateHeader.equals(shiftListDayViewModel.dateHeader) && this.isToday == shiftListDayViewModel.isToday && this.isPast == shiftListDayViewModel.isPast && Intrinsics.areEqual(this.schedules, shiftListDayViewModel.schedules) && Intrinsics.areEqual(this.timecards, shiftListDayViewModel.timecards);
    }

    public final int hashCode() {
        return this.timecards.hashCode() + BalanceFeedKt$$ExternalSyntheticOutline0.m(this.schedules, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.date.hashCode() * 31, 31, this.dateHeader), 31, this.isToday), 31, this.isPast), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShiftListDayViewModel(date=");
        sb.append(this.date);
        sb.append(", dateHeader=");
        sb.append(this.dateHeader);
        sb.append(", isToday=");
        re$$ExternalSyntheticOutline0.m(sb, this.isToday, ", isPast=", this.isPast, ", schedules=");
        sb.append(this.schedules);
        sb.append(", timecards=");
        sb.append(this.timecards);
        sb.append(")");
        return sb.toString();
    }
}
