package com.chicken.road.whale.store;

import l.h;
import r6.e;
import r6.i;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class PlanEntry {
    public static final int $stable = 0;
    private final int dayIndex;
    private final long id;
    private final long mealId;
    private final String slot;

    public PlanEntry(long j8, int i7, String str, long j9) {
        k.f(str, "slot");
        this.id = j8;
        this.dayIndex = i7;
        this.slot = str;
        this.mealId = j9;
    }

    public static /* synthetic */ PlanEntry copy$default(PlanEntry planEntry, long j8, int i7, String str, long j9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = planEntry.id;
        }
        long j10 = j8;
        if ((i8 & 2) != 0) {
            i7 = planEntry.dayIndex;
        }
        int i9 = i7;
        if ((i8 & 4) != 0) {
            str = planEntry.slot;
        }
        String str2 = str;
        if ((i8 & 8) != 0) {
            j9 = planEntry.mealId;
        }
        return planEntry.copy(j10, i9, str2, j9);
    }

    public final long component1() {
        return this.id;
    }

    public final int component2() {
        return this.dayIndex;
    }

    public final String component3() {
        return this.slot;
    }

    public final long component4() {
        return this.mealId;
    }

    public final PlanEntry copy(long j8, int i7, String str, long j9) {
        k.f(str, "slot");
        return new PlanEntry(j8, i7, str, j9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlanEntry)) {
            return false;
        }
        PlanEntry planEntry = (PlanEntry) obj;
        return this.id == planEntry.id && this.dayIndex == planEntry.dayIndex && k.a(this.slot, planEntry.slot) && this.mealId == planEntry.mealId;
    }

    public final int getDayIndex() {
        return this.dayIndex;
    }

    public final long getId() {
        return this.id;
    }

    public final long getMealId() {
        return this.mealId;
    }

    public final String getSlot() {
        return this.slot;
    }

    public int hashCode() {
        return Long.hashCode(this.mealId) + i.a(h.c(this.dayIndex, Long.hashCode(this.id) * 31, 31), 31, this.slot);
    }

    public String toString() {
        return "PlanEntry(id=" + this.id + ", dayIndex=" + this.dayIndex + ", slot=" + this.slot + ", mealId=" + this.mealId + ")";
    }

    public /* synthetic */ PlanEntry(long j8, int i7, String str, long j9, int i8, e eVar) {
        this((i8 & 1) != 0 ? 0L : j8, i7, str, j9);
    }
}
