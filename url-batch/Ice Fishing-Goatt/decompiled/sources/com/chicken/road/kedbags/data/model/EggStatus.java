package com.chicken.road.kedbags.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TreasureEgg.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/chicken/road/kedbags/data/model/EggStatus;", "", "eggId", "", "pinned", "", "explored", "note", "", "<init>", "(IZZLjava/lang/String;)V", "getEggId", "()I", "getPinned", "()Z", "getExplored", "getNote", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EggStatus {
    public static final int $stable = 0;
    private final int eggId;
    private final boolean explored;
    private final String note;
    private final boolean pinned;

    public static /* synthetic */ EggStatus copy$default(EggStatus eggStatus, int i, boolean z, boolean z2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = eggStatus.eggId;
        }
        if ((i2 & 2) != 0) {
            z = eggStatus.pinned;
        }
        if ((i2 & 4) != 0) {
            z2 = eggStatus.explored;
        }
        if ((i2 & 8) != 0) {
            str = eggStatus.note;
        }
        return eggStatus.copy(i, z, z2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getEggId() {
        return this.eggId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getPinned() {
        return this.pinned;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getExplored() {
        return this.explored;
    }

    /* renamed from: component4, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    public final EggStatus copy(int eggId, boolean pinned, boolean explored, String note) {
        Intrinsics.checkNotNullParameter(note, "note");
        return new EggStatus(eggId, pinned, explored, note);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EggStatus)) {
            return false;
        }
        EggStatus eggStatus = (EggStatus) other;
        return this.eggId == eggStatus.eggId && this.pinned == eggStatus.pinned && this.explored == eggStatus.explored && Intrinsics.areEqual(this.note, eggStatus.note);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.eggId) * 31) + Boolean.hashCode(this.pinned)) * 31) + Boolean.hashCode(this.explored)) * 31) + this.note.hashCode();
    }

    public String toString() {
        return "EggStatus(eggId=" + this.eggId + ", pinned=" + this.pinned + ", explored=" + this.explored + ", note=" + this.note + ")";
    }

    public EggStatus(int i, boolean z, boolean z2, String note) {
        Intrinsics.checkNotNullParameter(note, "note");
        this.eggId = i;
        this.pinned = z;
        this.explored = z2;
        this.note = note;
    }

    public final int getEggId() {
        return this.eggId;
    }

    public final boolean getPinned() {
        return this.pinned;
    }

    public final boolean getExplored() {
        return this.explored;
    }

    public /* synthetic */ EggStatus(int i, boolean z, boolean z2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? "" : str);
    }

    public final String getNote() {
        return this.note;
    }
}
