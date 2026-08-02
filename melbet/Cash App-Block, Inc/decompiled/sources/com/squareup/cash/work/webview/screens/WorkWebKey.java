package com.squareup.cash.work.webview.screens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class WorkWebKey {
    public static final /* synthetic */ WorkWebKey[] $VALUES;
    public static final WorkWebKey DIRECT_DEPOSIT;
    public static final WorkWebKey LINKED_ACCOUNTS;

    /* JADX INFO: Fake field, exist only in values array */
    WorkWebKey EF0;

    static {
        WorkWebKey workWebKey = new WorkWebKey("STUB_DETAIL", 0);
        WorkWebKey workWebKey2 = new WorkWebKey("DIRECT_DEPOSIT", 1);
        DIRECT_DEPOSIT = workWebKey2;
        WorkWebKey workWebKey3 = new WorkWebKey("LINKED_ACCOUNTS", 2);
        LINKED_ACCOUNTS = workWebKey3;
        $VALUES = new WorkWebKey[]{workWebKey, workWebKey2, workWebKey3, new WorkWebKey("ONBOARDING_TASKS", 3)};
    }

    public static WorkWebKey valueOf(String str) {
        return (WorkWebKey) Enum.valueOf(WorkWebKey.class, str);
    }

    public static WorkWebKey[] values() {
        return (WorkWebKey[]) $VALUES.clone();
    }
}
