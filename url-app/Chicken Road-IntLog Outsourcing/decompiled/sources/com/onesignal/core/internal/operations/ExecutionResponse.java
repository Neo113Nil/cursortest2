package com.onesignal.core.internal.operations;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class ExecutionResponse {
    private final Map<String, String> idTranslations;
    private final List<Operation> operations;
    private final ExecutionResult result;
    private final Integer retryAfterSeconds;

    /* JADX WARN: Multi-variable type inference failed */
    public ExecutionResponse(ExecutionResult result, Map<String, String> map, List<? extends Operation> list, Integer num) {
        i.e(result, "result");
        this.result = result;
        this.idTranslations = map;
        this.operations = list;
        this.retryAfterSeconds = num;
    }

    public final Map<String, String> getIdTranslations() {
        return this.idTranslations;
    }

    public final List<Operation> getOperations() {
        return this.operations;
    }

    public final ExecutionResult getResult() {
        return this.result;
    }

    public final Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    public /* synthetic */ ExecutionResponse(ExecutionResult executionResult, Map map, List list, Integer num, int i2, e eVar) {
        this(executionResult, (i2 & 2) != 0 ? null : map, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? null : num);
    }
}
