package com.gates.olympus.miruv.data;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class a {
    public static final int $stable = 0;
    private final int bestScore;
    private final int lastScore;
    private final int plays;

    public a(int i3, int i4, int i5) {
        this.bestScore = i3;
        this.lastScore = i4;
        this.plays = i5;
    }

    public static /* synthetic */ a copy$default(a aVar, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i3 = aVar.bestScore;
        }
        if ((i6 & 2) != 0) {
            i4 = aVar.lastScore;
        }
        if ((i6 & 4) != 0) {
            i5 = aVar.plays;
        }
        return aVar.copy(i3, i4, i5);
    }

    public final int component1() {
        return this.bestScore;
    }

    public final int component2() {
        return this.lastScore;
    }

    public final int component3() {
        return this.plays;
    }

    public final a copy(int i3, int i4, int i5) {
        return new a(i3, i4, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.bestScore == aVar.bestScore && this.lastScore == aVar.lastScore && this.plays == aVar.plays;
    }

    public final int getBestScore() {
        return this.bestScore;
    }

    public final int getLastScore() {
        return this.lastScore;
    }

    public final int getPlays() {
        return this.plays;
    }

    public int hashCode() {
        return Integer.hashCode(this.plays) + AbstractC0080b.b(this.lastScore, Integer.hashCode(this.bestScore) * 31, 31);
    }

    public String toString() {
        return "GameStat(bestScore=" + this.bestScore + ", lastScore=" + this.lastScore + ", plays=" + this.plays + ")";
    }
}
