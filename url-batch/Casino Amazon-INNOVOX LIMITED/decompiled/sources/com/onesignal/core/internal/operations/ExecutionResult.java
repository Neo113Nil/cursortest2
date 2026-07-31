package com.onesignal.core.internal.operations;

import com.onesignal.core.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IOperationExecutor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/onesignal/core/internal/operations/ExecutionResult;", "", "(Ljava/lang/String;I)V", "SUCCESS", "SUCCESS_STARTING_ONLY", "FAIL_RETRY", "FAIL_NORETRY", "FAIL_UNAUTHORIZED", "FAIL_CONFLICT", "FAIL_PAUSE_OPREPO", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExecutionResult {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExecutionResult[] $VALUES;
    public static final ExecutionResult SUCCESS = new ExecutionResult("SUCCESS", 0);
    public static final ExecutionResult SUCCESS_STARTING_ONLY = new ExecutionResult("SUCCESS_STARTING_ONLY", 1);
    public static final ExecutionResult FAIL_RETRY = new ExecutionResult("FAIL_RETRY", 2);
    public static final ExecutionResult FAIL_NORETRY = new ExecutionResult("FAIL_NORETRY", 3);
    public static final ExecutionResult FAIL_UNAUTHORIZED = new ExecutionResult("FAIL_UNAUTHORIZED", 4);
    public static final ExecutionResult FAIL_CONFLICT = new ExecutionResult("FAIL_CONFLICT", 5);
    public static final ExecutionResult FAIL_PAUSE_OPREPO = new ExecutionResult("FAIL_PAUSE_OPREPO", 6);

    private static final /* synthetic */ ExecutionResult[] $values() {
        return new ExecutionResult[]{SUCCESS, SUCCESS_STARTING_ONLY, FAIL_RETRY, FAIL_NORETRY, FAIL_UNAUTHORIZED, FAIL_CONFLICT, FAIL_PAUSE_OPREPO};
    }

    public static EnumEntries<ExecutionResult> getEntries() {
        return $ENTRIES;
    }

    public static ExecutionResult valueOf(String str) {
        return (ExecutionResult) Enum.valueOf(ExecutionResult.class, str);
    }

    public static ExecutionResult[] values() {
        return (ExecutionResult[]) $VALUES.clone();
    }

    private ExecutionResult(String str, int i) {
    }

    static {
        ExecutionResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
