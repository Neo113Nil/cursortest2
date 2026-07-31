package ru.rustore.sdk.core.tasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
final class TaskThreadHelper$executorService$2 extends s implements Function0<ExecutorService> {
    public static final TaskThreadHelper$executorService$2 INSTANCE = new TaskThreadHelper$executorService$2();

    TaskThreadHelper$executorService$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ExecutorService invoke() {
        return Executors.newFixedThreadPool(1);
    }
}
