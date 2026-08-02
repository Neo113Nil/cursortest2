package com.withpersona.sdk2.inquiry.steps.ui.styling;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class StackState {
    public static final /* synthetic */ StackState[] $VALUES;
    public static final StackState ACTIVE;
    public static final StackState BASE;
    public static final StackState DISABLED;

    static {
        StackState stackState = new StackState("BASE", 0);
        BASE = stackState;
        StackState stackState2 = new StackState("ACTIVE", 1);
        ACTIVE = stackState2;
        StackState stackState3 = new StackState("DISABLED", 2);
        DISABLED = stackState3;
        $VALUES = new StackState[]{stackState, stackState2, stackState3};
    }

    public static StackState valueOf(String str) {
        return (StackState) Enum.valueOf(StackState.class, str);
    }

    public static StackState[] values() {
        return (StackState[]) $VALUES.clone();
    }
}
