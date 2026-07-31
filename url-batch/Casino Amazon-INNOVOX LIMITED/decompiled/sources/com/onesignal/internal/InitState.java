package com.onesignal.internal;

import com.onesignal.core.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InitState.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/onesignal/internal/InitState;", "", "(Ljava/lang/String;I)V", "isSDKAccessible", "", "NOT_STARTED", "IN_PROGRESS", "SUCCESS", "FAILED", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InitState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InitState[] $VALUES;
    public static final InitState NOT_STARTED = new InitState("NOT_STARTED", 0);
    public static final InitState IN_PROGRESS = new InitState("IN_PROGRESS", 1);
    public static final InitState SUCCESS = new InitState("SUCCESS", 2);
    public static final InitState FAILED = new InitState("FAILED", 3);

    private static final /* synthetic */ InitState[] $values() {
        return new InitState[]{NOT_STARTED, IN_PROGRESS, SUCCESS, FAILED};
    }

    public static EnumEntries<InitState> getEntries() {
        return $ENTRIES;
    }

    public static InitState valueOf(String str) {
        return (InitState) Enum.valueOf(InitState.class, str);
    }

    public static InitState[] values() {
        return (InitState[]) $VALUES.clone();
    }

    private InitState(String str, int i) {
    }

    static {
        InitState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public final boolean isSDKAccessible() {
        return this == IN_PROGRESS || this == SUCCESS;
    }
}
