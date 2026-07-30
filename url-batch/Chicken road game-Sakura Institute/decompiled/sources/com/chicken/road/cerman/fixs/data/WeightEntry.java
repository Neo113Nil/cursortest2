package com.chicken.road.cerman.fixs.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/chicken/road/cerman/fixs/data/WeightEntry;", "", "id", "", "chickenId", "date", "weightGrams", "", "<init>", "(JJJI)V", "getId", "()J", "getChickenId", "getDate", "getWeightGrams", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WeightEntry {
    public static final int $stable = 0;
    private final long chickenId;
    private final long date;
    private final long id;
    private final int weightGrams;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getChickenId() {
        return this.chickenId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    /* renamed from: component4, reason: from getter */
    public final int getWeightGrams() {
        return this.weightGrams;
    }

    public final WeightEntry copy(long id, long chickenId, long date, int weightGrams) {
        return new WeightEntry(id, chickenId, date, weightGrams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeightEntry)) {
            return false;
        }
        WeightEntry weightEntry = (WeightEntry) other;
        return this.id == weightEntry.id && this.chickenId == weightEntry.chickenId && this.date == weightEntry.date && this.weightGrams == weightEntry.weightGrams;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.id) * 31) + Long.hashCode(this.chickenId)) * 31) + Long.hashCode(this.date)) * 31) + Integer.hashCode(this.weightGrams);
    }

    public String toString() {
        return "WeightEntry(id=" + this.id + ", chickenId=" + this.chickenId + ", date=" + this.date + ", weightGrams=" + this.weightGrams + ")";
    }

    public WeightEntry(long j, long j2, long j3, int i) {
        this.id = j;
        this.chickenId = j2;
        this.date = j3;
        this.weightGrams = i;
    }

    public final long getId() {
        return this.id;
    }

    public final long getChickenId() {
        return this.chickenId;
    }

    public /* synthetic */ WeightEntry(long j, long j2, long j3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, j2, (i2 & 4) != 0 ? System.currentTimeMillis() : j3, i);
    }

    public final long getDate() {
        return this.date;
    }

    public final int getWeightGrams() {
        return this.weightGrams;
    }
}
