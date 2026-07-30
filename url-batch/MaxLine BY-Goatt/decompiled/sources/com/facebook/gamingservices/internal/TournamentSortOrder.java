package com.facebook.gamingservices.internal;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public enum TournamentSortOrder {
    LowerIsBetter("LOWER_IS_BETTER"),
    HigherIsBetter("HIGHER_IS_BETTER");

    private final String rawValue;

    TournamentSortOrder(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.rawValue;
    }
}
