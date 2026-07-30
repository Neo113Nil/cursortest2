package com.chicken.road.cerman.fixs.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J8\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/chicken/road/cerman/fixs/data/EggLog;", "", "id", "", "chickenId", "date", "count", "", "<init>", "(JLjava/lang/Long;JI)V", "getId", "()J", "getChickenId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDate", "getCount", "()I", "component1", "component2", "component3", "component4", "copy", "(JLjava/lang/Long;JI)Lcom/chicken/road/cerman/fixs/data/EggLog;", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EggLog {
    public static final int $stable = 0;
    private final Long chickenId;
    private final int count;
    private final long date;
    private final long id;

    public static /* synthetic */ EggLog copy$default(EggLog eggLog, long j, Long l, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = eggLog.id;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            l = eggLog.chickenId;
        }
        Long l2 = l;
        if ((i2 & 4) != 0) {
            j2 = eggLog.date;
        }
        long j4 = j2;
        if ((i2 & 8) != 0) {
            i = eggLog.count;
        }
        return eggLog.copy(j3, l2, j4, i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getChickenId() {
        return this.chickenId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public final EggLog copy(long id, Long chickenId, long date, int count) {
        return new EggLog(id, chickenId, date, count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EggLog)) {
            return false;
        }
        EggLog eggLog = (EggLog) other;
        return this.id == eggLog.id && Intrinsics.areEqual(this.chickenId, eggLog.chickenId) && this.date == eggLog.date && this.count == eggLog.count;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Long l = this.chickenId;
        return ((((hashCode + (l == null ? 0 : l.hashCode())) * 31) + Long.hashCode(this.date)) * 31) + Integer.hashCode(this.count);
    }

    public String toString() {
        return "EggLog(id=" + this.id + ", chickenId=" + this.chickenId + ", date=" + this.date + ", count=" + this.count + ")";
    }

    public EggLog(long j, Long l, long j2, int i) {
        this.id = j;
        this.chickenId = l;
        this.date = j2;
        this.count = i;
    }

    public final long getId() {
        return this.id;
    }

    public final Long getChickenId() {
        return this.chickenId;
    }

    public /* synthetic */ EggLog(long j, Long l, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, l, (i2 & 4) != 0 ? System.currentTimeMillis() : j2, i);
    }

    public final long getDate() {
        return this.date;
    }

    public final int getCount() {
        return this.count;
    }
}
