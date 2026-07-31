package com.yandex.div.storage.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface DatabaseOpenHelper {

    @Metadata
    public interface CreateCallback {
        void onCreate(@NotNull Database database);
    }

    @Metadata
    public interface Database extends Closeable {
        void beginTransaction();

        @NotNull
        SQLiteStatement compileStatement(@NotNull String str);

        void endTransaction();

        void execSQL(@NotNull String str);

        @NotNull
        Cursor rawQuery(@NotNull String str, @Nullable String[] strArr);

        void setTransactionSuccessful();
    }

    @Metadata
    public interface UpgradeCallback {
        void onUpgrade(@NotNull Database database, int i4, int i5);
    }

    @NotNull
    Database getReadableDatabase();

    @NotNull
    Database getWritableDatabase();
}
