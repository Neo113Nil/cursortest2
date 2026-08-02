package com.squareup.cash.userjourneys.tracker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class UserJourney$TerminationReason {
    public static final /* synthetic */ UserJourney$TerminationReason[] $VALUES;
    public static final UserJourney$TerminationReason JOURNEY_RESTARTED;
    public static final UserJourney$TerminationReason MISSING_BLOCKER_FLOW_OUTCOME;
    public static final UserJourney$TerminationReason TIMEOUT_WITH_ACTIVE_USER;
    public static final UserJourney$TerminationReason TIMEOUT_WITH_IDLE_USER;

    static {
        UserJourney$TerminationReason userJourney$TerminationReason = new UserJourney$TerminationReason("TIMEOUT_WITH_ACTIVE_USER", 0);
        TIMEOUT_WITH_ACTIVE_USER = userJourney$TerminationReason;
        UserJourney$TerminationReason userJourney$TerminationReason2 = new UserJourney$TerminationReason("TIMEOUT_WITH_IDLE_USER", 1);
        TIMEOUT_WITH_IDLE_USER = userJourney$TerminationReason2;
        UserJourney$TerminationReason userJourney$TerminationReason3 = new UserJourney$TerminationReason("JOURNEY_RESTARTED", 2);
        JOURNEY_RESTARTED = userJourney$TerminationReason3;
        UserJourney$TerminationReason userJourney$TerminationReason4 = new UserJourney$TerminationReason("MISSING_BLOCKER_FLOW_OUTCOME", 3);
        MISSING_BLOCKER_FLOW_OUTCOME = userJourney$TerminationReason4;
        $VALUES = new UserJourney$TerminationReason[]{userJourney$TerminationReason, userJourney$TerminationReason2, userJourney$TerminationReason3, userJourney$TerminationReason4};
    }

    public static UserJourney$TerminationReason valueOf(String str) {
        return (UserJourney$TerminationReason) Enum.valueOf(UserJourney$TerminationReason.class, str);
    }

    public static UserJourney$TerminationReason[] values() {
        return (UserJourney$TerminationReason[]) $VALUES.clone();
    }
}
