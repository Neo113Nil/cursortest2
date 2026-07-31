package androidx.room;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.ironsource.B5;
import com.ironsource.C4901tg;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QueryInterceptorDatabase.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0011\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0015H\u0097\u0001¢\u0006\u0004\b\"\u0010#J\u0018\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020$H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b)\u0010*J\u0018\u0010,\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u001bH\u0096\u0001¢\u0006\u0004\b,\u0010-JF\u0010.\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0011\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fH\u0096\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b0\u0010\u0017J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u00020\fH\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\tH\u0016¢\u0006\u0004\b5\u0010\u000bJ\u000f\u00106\u001a\u00020\tH\u0016¢\u0006\u0004\b6\u0010\u000bJ\u000f\u00107\u001a\u00020\tH\u0016¢\u0006\u0004\b7\u0010\u000bJ\u000f\u00108\u001a\u00020\tH\u0016¢\u0006\u0004\b8\u0010\u000bJ\u0017\u00109\u001a\u00020:2\u0006\u00109\u001a\u00020\fH\u0016¢\u0006\u0004\b9\u0010;J\u0017\u00109\u001a\u00020:2\u0006\u00109\u001a\u00020<H\u0016¢\u0006\u0004\b9\u0010=J!\u00109\u001a\u00020:2\u0006\u00109\u001a\u00020<2\b\u0010?\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\b9\u0010@J\u0017\u0010A\u001a\u00020\t2\u0006\u00101\u001a\u00020\fH\u0016¢\u0006\u0004\bA\u0010BJ)\u0010A\u001a\u00020\t2\u0006\u00101\u001a\u00020\f2\u0010\u0010C\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\u000fH\u0016¢\u0006\u0004\bA\u0010DR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010ER\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010FR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010GR(\u0010L\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0I\u0018\u00010H8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020\u00158\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010\u0017R\u0014\u0010N\u001a\u00020\u00158\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bN\u0010\u0017R\u0014\u0010O\u001a\u00020\u00158\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bO\u0010\u0017R\u0014\u0010P\u001a\u00020\u00158\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010\u0017R\u0014\u0010Q\u001a\u00020\u00158WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bQ\u0010\u0017R\u0014\u0010T\u001a\u00020\u001b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010SR\u001c\u0010X\u001a\u00020\u001b8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bU\u0010S\"\u0004\bV\u0010WR\u0016\u0010[\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u001c\u0010_\u001a\u00020\u00128\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010*¨\u0006`"}, d2 = {"Landroidx/room/QueryInterceptorDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "delegate", "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "Landroidx/room/RoomDatabase$QueryCallback;", "queryCallback", "<init>", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/util/concurrent/Executor;Landroidx/room/RoomDatabase$QueryCallback;)V", "", "close", "()V", "", B5.R, "whereClause", "", "", "whereArgs", "", "delete", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "", "inTransaction", "()Z", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "", "insert", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "newVersion", "needUpgrade", "(I)Z", "enabled", "setForeignKeyConstraintsEnabled", "(Z)V", "Ljava/util/Locale;", CommonUrlParts.LOCALE, "setLocale", "(Ljava/util/Locale;)V", "cacheSize", "setMaxSqlCacheSize", "(I)V", "numBytes", "setMaximumSize", "(J)J", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "yieldIfContendedSafely", "sql", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;", "beginTransaction", "beginTransactionNonExclusive", "endTransaction", "setTransactionSuccessful", "query", "Landroid/database/Cursor;", "(Ljava/lang/String;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "execSQL", "(Ljava/lang/String;)V", "bindArgs", "(Ljava/lang/String;[Ljava/lang/Object;)V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Ljava/util/concurrent/Executor;", "Landroidx/room/RoomDatabase$QueryCallback;", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk", "isDbLockedByCurrentThread", "isOpen", "isReadOnly", "isWriteAheadLoggingEnabled", "getMaximumSize", "()J", "maximumSize", "getPageSize", "setPageSize", "(J)V", "pageSize", "getPath", "()Ljava/lang/String;", "path", C4901tg.b, "()I", "setVersion", "version", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class QueryInterceptorDatabase implements SupportSQLiteDatabase {
    private final SupportSQLiteDatabase delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final Executor queryCallbackExecutor;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int delete(String table, String whereClause, Object[] whereArgs) {
        Intrinsics.checkNotNullParameter(table, "table");
        return this.delegate.delete(table, whereClause, whereArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public List getAttachedDbs() {
        return this.delegate.getAttachedDbs();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getMaximumSize() {
        return this.delegate.getMaximumSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getPageSize() {
        return this.delegate.getPageSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public String getPath() {
        return this.delegate.getPath();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int getVersion() {
        return this.delegate.getVersion();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean inTransaction() {
        return this.delegate.inTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long insert(String table, int conflictAlgorithm, ContentValues values) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        return this.delegate.insert(table, conflictAlgorithm, values);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
        return this.delegate.isDatabaseIntegrityOk();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
        return this.delegate.isDbLockedByCurrentThread();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isReadOnly() {
        return this.delegate.isReadOnly();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isWriteAheadLoggingEnabled() {
        return this.delegate.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean needUpgrade(int newVersion) {
        return this.delegate.needUpgrade(newVersion);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setForeignKeyConstraintsEnabled(boolean enabled) {
        this.delegate.setForeignKeyConstraintsEnabled(enabled);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setLocale(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.delegate.setLocale(locale);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setMaxSqlCacheSize(int cacheSize) {
        this.delegate.setMaxSqlCacheSize(cacheSize);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long setMaximumSize(long numBytes) {
        return this.delegate.setMaximumSize(numBytes);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setPageSize(long j) {
        this.delegate.setPageSize(j);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setVersion(int i) {
        this.delegate.setVersion(i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int update(String table, int conflictAlgorithm, ContentValues values, String whereClause, Object[] whereArgs) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        return this.delegate.update(table, conflictAlgorithm, values, whereClause, whereArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
        return this.delegate.yieldIfContendedSafely();
    }

    public QueryInterceptorDatabase(SupportSQLiteDatabase delegate, Executor queryCallbackExecutor, RoomDatabase.QueryCallback queryCallback) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(queryCallbackExecutor, "queryCallbackExecutor");
        Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.queryCallbackExecutor = queryCallbackExecutor;
        this.queryCallback = queryCallback;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public SupportSQLiteStatement compileStatement(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        return new QueryInterceptorStatement(this.delegate.compileStatement(sql), sql, this.queryCallbackExecutor, this.queryCallback);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.beginTransaction$lambda$0(QueryInterceptorDatabase.this);
            }
        });
        this.delegate.beginTransaction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void beginTransaction$lambda$0(QueryInterceptorDatabase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery("BEGIN EXCLUSIVE TRANSACTION", CollectionsKt.emptyList());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.beginTransactionNonExclusive$lambda$1(QueryInterceptorDatabase.this);
            }
        });
        this.delegate.beginTransactionNonExclusive();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void beginTransactionNonExclusive$lambda$1(QueryInterceptorDatabase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery("BEGIN DEFERRED TRANSACTION", CollectionsKt.emptyList());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void endTransaction() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.endTransaction$lambda$4(QueryInterceptorDatabase.this);
            }
        });
        this.delegate.endTransaction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endTransaction$lambda$4(QueryInterceptorDatabase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery("END TRANSACTION", CollectionsKt.emptyList());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.setTransactionSuccessful$lambda$5(QueryInterceptorDatabase.this);
            }
        });
        this.delegate.setTransactionSuccessful();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTransactionSuccessful$lambda$5(QueryInterceptorDatabase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery("TRANSACTION SUCCESSFUL", CollectionsKt.emptyList());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(final String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.query$lambda$6(QueryInterceptorDatabase.this, query);
            }
        });
        return this.delegate.query(query);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void query$lambda$6(QueryInterceptorDatabase this$0, String query) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(query, "$query");
        this$0.queryCallback.onQuery(query, CollectionsKt.emptyList());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(final SupportSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        query.bindTo(queryInterceptorProgram);
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.query$lambda$8(QueryInterceptorDatabase.this, query, queryInterceptorProgram);
            }
        });
        return this.delegate.query(query);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void query$lambda$8(QueryInterceptorDatabase this$0, SupportSQLiteQuery query, QueryInterceptorProgram queryInterceptorProgram) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.checkNotNullParameter(queryInterceptorProgram, "$queryInterceptorProgram");
        this$0.queryCallback.onQuery(query.getQuery(), queryInterceptorProgram.getBindArgsCache());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(final SupportSQLiteQuery query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        final QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        query.bindTo(queryInterceptorProgram);
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.query$lambda$9(QueryInterceptorDatabase.this, query, queryInterceptorProgram);
            }
        });
        return this.delegate.query(query);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void query$lambda$9(QueryInterceptorDatabase this$0, SupportSQLiteQuery query, QueryInterceptorProgram queryInterceptorProgram) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.checkNotNullParameter(queryInterceptorProgram, "$queryInterceptorProgram");
        this$0.queryCallback.onQuery(query.getQuery(), queryInterceptorProgram.getBindArgsCache());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(final String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.execSQL$lambda$10(QueryInterceptorDatabase.this, sql);
            }
        });
        this.delegate.execSQL(sql);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execSQL$lambda$10(QueryInterceptorDatabase this$0, String sql) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sql, "$sql");
        this$0.queryCallback.onQuery(sql, CollectionsKt.emptyList());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(final String sql, Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(CollectionsKt.listOf((Object) bindArgs));
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.execSQL$lambda$11(QueryInterceptorDatabase.this, sql, arrayList);
            }
        });
        this.delegate.execSQL(sql, new List[]{arrayList});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execSQL$lambda$11(QueryInterceptorDatabase this$0, String sql, List inputArguments) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sql, "$sql");
        Intrinsics.checkNotNullParameter(inputArguments, "$inputArguments");
        this$0.queryCallback.onQuery(sql, inputArguments);
    }
}
