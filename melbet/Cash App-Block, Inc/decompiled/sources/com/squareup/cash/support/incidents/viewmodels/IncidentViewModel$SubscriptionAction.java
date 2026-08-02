package com.squareup.cash.support.incidents.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class IncidentViewModel$SubscriptionAction {
    public static final /* synthetic */ IncidentViewModel$SubscriptionAction[] $VALUES;
    public static final IncidentViewModel$SubscriptionAction SUBSCRIBE;
    public static final IncidentViewModel$SubscriptionAction UNSUBSCRIBE;

    static {
        IncidentViewModel$SubscriptionAction incidentViewModel$SubscriptionAction = new IncidentViewModel$SubscriptionAction("SUBSCRIBE", 0);
        SUBSCRIBE = incidentViewModel$SubscriptionAction;
        IncidentViewModel$SubscriptionAction incidentViewModel$SubscriptionAction2 = new IncidentViewModel$SubscriptionAction("UNSUBSCRIBE", 1);
        UNSUBSCRIBE = incidentViewModel$SubscriptionAction2;
        $VALUES = new IncidentViewModel$SubscriptionAction[]{incidentViewModel$SubscriptionAction, incidentViewModel$SubscriptionAction2};
    }

    public static IncidentViewModel$SubscriptionAction valueOf(String str) {
        return (IncidentViewModel$SubscriptionAction) Enum.valueOf(IncidentViewModel$SubscriptionAction.class, str);
    }

    public static IncidentViewModel$SubscriptionAction[] values() {
        return (IncidentViewModel$SubscriptionAction[]) $VALUES.clone();
    }
}
