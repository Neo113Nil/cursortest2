package com.onesignal.internal;

import n4.InterfaceC1344a;
import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class InitState {
    private static final /* synthetic */ InterfaceC1344a $ENTRIES;
    private static final /* synthetic */ InitState[] $VALUES;
    public static final InitState NOT_STARTED = new InitState("NOT_STARTED", 0);
    public static final InitState IN_PROGRESS = new InitState("IN_PROGRESS", 1);
    public static final InitState SUCCESS = new InitState("SUCCESS", 2);
    public static final InitState FAILED = new InitState("FAILED", 3);

    private static final /* synthetic */ InitState[] $values() {
        return new InitState[]{NOT_STARTED, IN_PROGRESS, SUCCESS, FAILED};
    }

    static {
        InitState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC1477a.n($values);
    }

    private InitState(String str, int i2) {
    }

    public static InterfaceC1344a getEntries() {
        return $ENTRIES;
    }

    public static InitState valueOf(String str) {
        return (InitState) Enum.valueOf(InitState.class, str);
    }

    public static InitState[] values() {
        return (InitState[]) $VALUES.clone();
    }

    public final boolean isSDKAccessible() {
        return this == IN_PROGRESS || this == SUCCESS;
    }
}
