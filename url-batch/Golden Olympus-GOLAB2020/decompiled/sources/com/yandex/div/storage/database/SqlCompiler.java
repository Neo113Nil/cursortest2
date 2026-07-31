package com.yandex.div.storage.database;

import android.database.sqlite.SQLiteStatement;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface SqlCompiler {
    @NotNull
    ReadState compileQuery(@NotNull String str, @NotNull String... strArr);

    @NotNull
    SQLiteStatement compileStatement(@NotNull String str);
}
