package com.yandex.div.storage.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import com.yandex.div.internal.Assert;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class AndroidDatabaseOpenHelper implements DatabaseOpenHelper {

    @NotNull
    private final DatabaseManager databaseManager;

    @NotNull
    private final Map<SQLiteDatabase, OpenCloseInfo> mOpenCloseInfoMap;

    @NotNull
    private final Object mOpenCloseLock;

    @NotNull
    private final SQLiteOpenHelper mSQLiteOpenHelper;

    @Metadata
    private final class AndroidSQLiteDatabase implements DatabaseOpenHelper.Database {

        @NotNull
        private final SQLiteDatabase mDb;

        @NotNull
        private final OpenCloseInfo mOpenCloseInfo;
        final /* synthetic */ AndroidDatabaseOpenHelper this$0;

        public AndroidSQLiteDatabase(@NotNull AndroidDatabaseOpenHelper androidDatabaseOpenHelper, @NotNull SQLiteDatabase mDb, OpenCloseInfo mOpenCloseInfo) {
            Intrinsics.checkNotNullParameter(mDb, "mDb");
            Intrinsics.checkNotNullParameter(mOpenCloseInfo, "mOpenCloseInfo");
            this.this$0 = androidDatabaseOpenHelper;
            this.mDb = mDb;
            this.mOpenCloseInfo = mOpenCloseInfo;
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void beginTransaction() {
            this.mDb.beginTransaction();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.this$0.databaseManager.closeDatabase(this.mDb);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        @NotNull
        public SQLiteStatement compileStatement(@NotNull String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            SQLiteStatement compileStatement = this.mDb.compileStatement(sql);
            Intrinsics.checkNotNullExpressionValue(compileStatement, "mDb.compileStatement(sql)");
            return compileStatement;
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void endTransaction() {
            this.mDb.endTransaction();
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void execSQL(@NotNull String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.mDb.execSQL(sql);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        @NotNull
        public Cursor rawQuery(@NotNull String query, @Nullable String[] strArr) {
            Intrinsics.checkNotNullParameter(query, "query");
            Cursor rawQuery = this.mDb.rawQuery(query, strArr);
            Intrinsics.checkNotNullExpressionValue(rawQuery, "mDb.rawQuery(query, selectionArgs)");
            return rawQuery;
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void setTransactionSuccessful() {
            this.mDb.setTransactionSuccessful();
        }
    }

    @Metadata
    private static final class DatabaseManager {

        @NotNull
        private final SQLiteOpenHelper databaseHelper;

        @Nullable
        private SQLiteDatabase readableDatabase;

        @NotNull
        private final Set<Thread> readableUsers;
        private int readableUsersCount;

        @Nullable
        private SQLiteDatabase writableDatabase;

        @NotNull
        private final Set<Thread> writableUsers;
        private int writableUsersCount;

        public DatabaseManager(@NotNull SQLiteOpenHelper databaseHelper) {
            Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
            this.databaseHelper = databaseHelper;
            this.readableUsers = new LinkedHashSet();
            this.writableUsers = new LinkedHashSet();
        }

        public final synchronized void closeDatabase(@NotNull SQLiteDatabase mDb) {
            try {
                Intrinsics.checkNotNullParameter(mDb, "mDb");
                if (Intrinsics.areEqual(mDb, this.writableDatabase)) {
                    this.writableUsers.remove(Thread.currentThread());
                    if (this.writableUsers.isEmpty()) {
                        while (true) {
                            int i4 = this.writableUsersCount;
                            this.writableUsersCount = i4 - 1;
                            if (i4 <= 0) {
                                break;
                            }
                            SQLiteDatabase sQLiteDatabase = this.writableDatabase;
                            Intrinsics.checkNotNull(sQLiteDatabase);
                            sQLiteDatabase.close();
                        }
                    }
                } else if (Intrinsics.areEqual(mDb, this.readableDatabase)) {
                    this.readableUsers.remove(Thread.currentThread());
                    if (this.readableUsers.isEmpty()) {
                        while (true) {
                            int i5 = this.readableUsersCount;
                            this.readableUsersCount = i5 - 1;
                            if (i5 <= 0) {
                                break;
                            }
                            SQLiteDatabase sQLiteDatabase2 = this.readableDatabase;
                            Intrinsics.checkNotNull(sQLiteDatabase2);
                            sQLiteDatabase2.close();
                        }
                    }
                } else {
                    Assert.fail("Trying to close unknown database from DatabaseManager");
                    mDb.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @NotNull
        public final synchronized SQLiteDatabase openReadableDatabase() {
            SQLiteDatabase sQLiteDatabase;
            this.readableDatabase = this.databaseHelper.getReadableDatabase();
            this.readableUsersCount++;
            Set<Thread> set = this.readableUsers;
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(currentThread, "currentThread()");
            set.add(currentThread);
            sQLiteDatabase = this.readableDatabase;
            Intrinsics.checkNotNull(sQLiteDatabase);
            return sQLiteDatabase;
        }

        @NotNull
        public final synchronized SQLiteDatabase openWritableDatabase() {
            SQLiteDatabase sQLiteDatabase;
            this.writableDatabase = this.databaseHelper.getWritableDatabase();
            this.writableUsersCount++;
            Set<Thread> set = this.writableUsers;
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(currentThread, "currentThread()");
            set.add(currentThread);
            sQLiteDatabase = this.writableDatabase;
            Intrinsics.checkNotNull(sQLiteDatabase);
            return sQLiteDatabase;
        }
    }

    @Metadata
    private static final class OpenCloseInfo {
        private int currentlyOpenedCount;

        public final int getCurrentlyOpenedCount() {
            return this.currentlyOpenedCount;
        }

        public final void setCurrentlyOpenedCount(int i4) {
            this.currentlyOpenedCount = i4;
        }
    }

    public AndroidDatabaseOpenHelper(@NotNull Context context, @NotNull String name, int i4, @NotNull final DatabaseOpenHelper.CreateCallback ccb, @NotNull final DatabaseOpenHelper.UpgradeCallback ucb) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ccb, "ccb");
        Intrinsics.checkNotNullParameter(ucb, "ucb");
        this.mOpenCloseLock = new Object();
        this.mOpenCloseInfoMap = new HashMap();
        SQLiteOpenHelper sQLiteOpenHelper = new SQLiteOpenHelper(context, name, i4) { // from class: com.yandex.div.storage.database.AndroidDatabaseOpenHelper.1
            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onConfigure(@NotNull SQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.setForeignKeyConstraintsEnabled(true);
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onCreate(@NotNull SQLiteDatabase sqLiteDatabase) {
                Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                ccb.onCreate(this.wrapDataBase(sqLiteDatabase));
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onUpgrade(@NotNull SQLiteDatabase sqLiteDatabase, int i5, int i6) {
                Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                ucb.onUpgrade(this.wrapDataBase(sqLiteDatabase), i5, i6);
            }
        };
        this.mSQLiteOpenHelper = sQLiteOpenHelper;
        this.databaseManager = new DatabaseManager(sQLiteOpenHelper);
    }

    private OpenCloseInfo getOpenCloseInfo(SQLiteDatabase sQLiteDatabase) {
        OpenCloseInfo openCloseInfo;
        synchronized (this.mOpenCloseLock) {
            try {
                openCloseInfo = this.mOpenCloseInfoMap.get(sQLiteDatabase);
                if (openCloseInfo == null) {
                    openCloseInfo = new OpenCloseInfo();
                    this.mOpenCloseInfoMap.put(sQLiteDatabase, openCloseInfo);
                }
                openCloseInfo.setCurrentlyOpenedCount(openCloseInfo.getCurrentlyOpenedCount() + 1);
                openCloseInfo.getCurrentlyOpenedCount();
            } catch (Throwable th) {
                throw th;
            }
        }
        return openCloseInfo;
    }

    @Override // com.yandex.div.storage.database.DatabaseOpenHelper
    @NotNull
    public DatabaseOpenHelper.Database getReadableDatabase() {
        return wrapDataBase(this.databaseManager.openReadableDatabase());
    }

    @Override // com.yandex.div.storage.database.DatabaseOpenHelper
    @NotNull
    public DatabaseOpenHelper.Database getWritableDatabase() {
        return wrapDataBase(this.databaseManager.openWritableDatabase());
    }

    @NotNull
    public DatabaseOpenHelper.Database wrapDataBase(@NotNull SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return new AndroidSQLiteDatabase(this, sqLiteDatabase, getOpenCloseInfo(sqLiteDatabase));
    }
}
