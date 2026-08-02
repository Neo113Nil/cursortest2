package com.squareup.cash.work.tinygraph.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class MembershipStatus {
    public static final /* synthetic */ MembershipStatus[] $VALUES;
    public static final MembershipStatus ACTIVE;

    static {
        MembershipStatus membershipStatus = new MembershipStatus("ACTIVE", 0);
        ACTIVE = membershipStatus;
        $VALUES = new MembershipStatus[]{membershipStatus, new MembershipStatus("INACTIVE", 1), new MembershipStatus("INVITED", 2), new MembershipStatus("UNKNOWN", 3)};
    }

    public static MembershipStatus valueOf(String str) {
        return (MembershipStatus) Enum.valueOf(MembershipStatus.class, str);
    }

    public static MembershipStatus[] values() {
        return (MembershipStatus[]) $VALUES.clone();
    }
}
