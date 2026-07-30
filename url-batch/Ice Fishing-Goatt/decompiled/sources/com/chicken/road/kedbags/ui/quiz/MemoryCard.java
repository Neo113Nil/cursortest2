package com.chicken.road.kedbags.ui.quiz;

import com.chicken.road.kedbags.data.model.TreasureEgg;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NestPairTrialScreen.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/chicken/road/kedbags/ui/quiz/MemoryCard;", "", "key", "", "egg", "Lcom/chicken/road/kedbags/data/model/TreasureEgg;", "pair", "revealed", "", "matched", "<init>", "(ILcom/chicken/road/kedbags/data/model/TreasureEgg;IZZ)V", "getKey", "()I", "getEgg", "()Lcom/chicken/road/kedbags/data/model/TreasureEgg;", "getPair", "getRevealed", "()Z", "getMatched", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class MemoryCard {
    private final TreasureEgg egg;
    private final int key;
    private final boolean matched;
    private final int pair;
    private final boolean revealed;

    public static /* synthetic */ MemoryCard copy$default(MemoryCard memoryCard, int i, TreasureEgg treasureEgg, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = memoryCard.key;
        }
        if ((i3 & 2) != 0) {
            treasureEgg = memoryCard.egg;
        }
        if ((i3 & 4) != 0) {
            i2 = memoryCard.pair;
        }
        if ((i3 & 8) != 0) {
            z = memoryCard.revealed;
        }
        if ((i3 & 16) != 0) {
            z2 = memoryCard.matched;
        }
        boolean z3 = z2;
        int i4 = i2;
        return memoryCard.copy(i, treasureEgg, i4, z, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final TreasureEgg getEgg() {
        return this.egg;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPair() {
        return this.pair;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getRevealed() {
        return this.revealed;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getMatched() {
        return this.matched;
    }

    public final MemoryCard copy(int key, TreasureEgg egg, int pair, boolean revealed, boolean matched) {
        Intrinsics.checkNotNullParameter(egg, "egg");
        return new MemoryCard(key, egg, pair, revealed, matched);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemoryCard)) {
            return false;
        }
        MemoryCard memoryCard = (MemoryCard) other;
        return this.key == memoryCard.key && Intrinsics.areEqual(this.egg, memoryCard.egg) && this.pair == memoryCard.pair && this.revealed == memoryCard.revealed && this.matched == memoryCard.matched;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.key) * 31) + this.egg.hashCode()) * 31) + Integer.hashCode(this.pair)) * 31) + Boolean.hashCode(this.revealed)) * 31) + Boolean.hashCode(this.matched);
    }

    public String toString() {
        return "MemoryCard(key=" + this.key + ", egg=" + this.egg + ", pair=" + this.pair + ", revealed=" + this.revealed + ", matched=" + this.matched + ")";
    }

    public MemoryCard(int i, TreasureEgg egg, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(egg, "egg");
        this.key = i;
        this.egg = egg;
        this.pair = i2;
        this.revealed = z;
        this.matched = z2;
    }

    public /* synthetic */ MemoryCard(int i, TreasureEgg treasureEgg, int i2, boolean z, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, treasureEgg, i2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2);
    }

    public final TreasureEgg getEgg() {
        return this.egg;
    }

    public final int getKey() {
        return this.key;
    }

    public final boolean getMatched() {
        return this.matched;
    }

    public final int getPair() {
        return this.pair;
    }

    public final boolean getRevealed() {
        return this.revealed;
    }
}
