package com.yandex.div.storage.database;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class ExecutionResult {

    @NotNull
    private final List<StorageException> errors;

    /* JADX WARN: Multi-variable type inference failed */
    public ExecutionResult(@NotNull List<? extends StorageException> errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.errors = errors;
    }

    @NotNull
    public List<StorageException> getErrors() {
        return this.errors;
    }
}
