package com.yandex.div.storage.database;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface StorageStatement {
    void execute(@NotNull SqlCompiler sqlCompiler);
}
