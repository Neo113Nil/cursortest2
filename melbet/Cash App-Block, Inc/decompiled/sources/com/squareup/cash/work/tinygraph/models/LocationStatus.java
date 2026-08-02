package com.squareup.cash.work.tinygraph.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class LocationStatus {
    public static final /* synthetic */ LocationStatus[] $VALUES;
    public static final LocationStatus ACTIVE;

    static {
        LocationStatus locationStatus = new LocationStatus("ACTIVE", 0);
        ACTIVE = locationStatus;
        $VALUES = new LocationStatus[]{locationStatus, new LocationStatus("INACTIVE", 1)};
    }

    public static LocationStatus valueOf(String str) {
        return (LocationStatus) Enum.valueOf(LocationStatus.class, str);
    }

    public static LocationStatus[] values() {
        return (LocationStatus[]) $VALUES.clone();
    }
}
