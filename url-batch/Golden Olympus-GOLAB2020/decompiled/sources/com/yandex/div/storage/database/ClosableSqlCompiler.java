package com.yandex.div.storage.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import com.yandex.div.storage.util.SqlExtensionsKt;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class ClosableSqlCompiler implements SqlCompiler, Closeable, AutoCloseable {

    @NotNull
    private final List<Cursor> createdCursors;

    @NotNull
    private final List<SQLiteStatement> createdStatements;

    @NotNull
    private final DatabaseOpenHelper.Database db;

    public ClosableSqlCompiler(@NotNull DatabaseOpenHelper.Database db) {
        Intrinsics.checkNotNullParameter(db, "db");
        this.db = db;
        this.createdStatements = new ArrayList();
        this.createdCursors = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor compileQuery$lambda$2(ClosableSqlCompiler this$0, String sql, String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sql, "$sql");
        Intrinsics.checkNotNullParameter(selectionArgs, "$selectionArgs");
        Cursor rawQuery = this$0.db.rawQuery(sql, selectionArgs);
        this$0.createdCursors.add(rawQuery);
        return rawQuery;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Iterator<T> it = this.createdStatements.iterator();
        while (it.hasNext()) {
            SqlExtensionsKt.closeSilently((SQLiteStatement) it.next());
        }
        this.createdStatements.clear();
        for (Cursor cursor : this.createdCursors) {
            if (!cursor.isClosed()) {
                SqlExtensionsKt.closeSilently(cursor);
            }
        }
        this.createdCursors.clear();
    }

    @Override // com.yandex.div.storage.database.SqlCompiler
    @NotNull
    public ReadState compileQuery(@NotNull final String sql, @NotNull final String... selectionArgs) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(selectionArgs, "selectionArgs");
        return new ReadState(null, new V1.a() { // from class: com.yandex.div.storage.database.a
            @Override // V1.a
            public final Object get() {
                Cursor compileQuery$lambda$2;
                compileQuery$lambda$2 = ClosableSqlCompiler.compileQuery$lambda$2(ClosableSqlCompiler.this, sql, selectionArgs);
                return compileQuery$lambda$2;
            }
        }, 1, null);
    }

    @Override // com.yandex.div.storage.database.SqlCompiler
    @NotNull
    public SQLiteStatement compileStatement(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement compileStatement = this.db.compileStatement(sql);
        this.createdStatements.add(compileStatement);
        return compileStatement;
    }
}
