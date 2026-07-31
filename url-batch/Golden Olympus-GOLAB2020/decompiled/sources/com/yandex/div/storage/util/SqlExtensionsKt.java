package com.yandex.div.storage.util;

import com.yandex.div.storage.database.DatabaseOpenHelper;
import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class SqlExtensionsKt {
    public static final void closeSilently(@NotNull Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static final void endTransactionSilently(@NotNull DatabaseOpenHelper.Database database) {
        Intrinsics.checkNotNullParameter(database, "<this>");
        try {
            database.endTransaction();
        } catch (IllegalStateException unused) {
        }
    }
}
