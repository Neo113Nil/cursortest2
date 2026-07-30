package com.chicken.road.cerman.fixs.data;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u000bHÆ\u0003JX\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lcom/chicken/road/cerman/fixs/data/Vaccination;", "", "id", "", "chickenId", "date", HintConstants.AUTOFILL_HINT_NAME, "", "notes", "dueDate", "done", "", "<init>", "(JLjava/lang/Long;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Z)V", "getId", "()J", "getChickenId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDate", "getName", "()Ljava/lang/String;", "getNotes", "getDueDate", "getDone", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(JLjava/lang/Long;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Z)Lcom/chicken/road/cerman/fixs/data/Vaccination;", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Vaccination {
    public static final int $stable = 0;
    private final Long chickenId;
    private final long date;
    private final boolean done;
    private final Long dueDate;
    private final long id;
    private final String name;
    private final String notes;

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
    public final String getName() {
        return this.name;
    }

    /* renamed from: component5, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getDueDate() {
        return this.dueDate;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getDone() {
        return this.done;
    }

    public final Vaccination copy(long id, Long chickenId, long date, String name, String notes, Long dueDate, boolean done) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(notes, "notes");
        return new Vaccination(id, chickenId, date, name, notes, dueDate, done);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vaccination)) {
            return false;
        }
        Vaccination vaccination = (Vaccination) other;
        return this.id == vaccination.id && Intrinsics.areEqual(this.chickenId, vaccination.chickenId) && this.date == vaccination.date && Intrinsics.areEqual(this.name, vaccination.name) && Intrinsics.areEqual(this.notes, vaccination.notes) && Intrinsics.areEqual(this.dueDate, vaccination.dueDate) && this.done == vaccination.done;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Long l = this.chickenId;
        int hashCode2 = (((((((hashCode + (l == null ? 0 : l.hashCode())) * 31) + Long.hashCode(this.date)) * 31) + this.name.hashCode()) * 31) + this.notes.hashCode()) * 31;
        Long l2 = this.dueDate;
        return ((hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31) + Boolean.hashCode(this.done);
    }

    public String toString() {
        return "Vaccination(id=" + this.id + ", chickenId=" + this.chickenId + ", date=" + this.date + ", name=" + this.name + ", notes=" + this.notes + ", dueDate=" + this.dueDate + ", done=" + this.done + ")";
    }

    public Vaccination(long j, Long l, long j2, String name, String notes, Long l2, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(notes, "notes");
        this.id = j;
        this.chickenId = l;
        this.date = j2;
        this.name = name;
        this.notes = notes;
        this.dueDate = l2;
        this.done = z;
    }

    public final long getId() {
        return this.id;
    }

    public final Long getChickenId() {
        return this.chickenId;
    }

    public /* synthetic */ Vaccination(long j, Long l, long j2, String str, String str2, Long l2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, l, (i & 4) != 0 ? System.currentTimeMillis() : j2, str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? false : z);
    }

    public final long getDate() {
        return this.date;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final Long getDueDate() {
        return this.dueDate;
    }

    public final boolean getDone() {
        return this.done;
    }
}
