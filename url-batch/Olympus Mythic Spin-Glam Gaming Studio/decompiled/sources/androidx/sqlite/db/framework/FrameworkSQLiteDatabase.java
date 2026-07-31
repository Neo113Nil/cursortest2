package androidx.sqlite.db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.ironsource.B5;
import com.ironsource.C4901tg;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FrameworkSQLiteDatabase.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 _2\u00020\u0001:\u0002`_B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001bJ\u0017\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u0019\u0010\u001dJ!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b\u0019\u0010 J'\u0010&\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J5\u0010,\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u00062\u0012\u0010+\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010*\u0018\u00010)H\u0016¢\u0006\u0004\b,\u0010-JE\u0010.\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010\u00062\u0012\u0010+\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010*\u0018\u00010)H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u00101J)\u00100\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u00102\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010*0)H\u0016¢\u0006\u0004\b0\u00103J\u0017\u00105\u001a\u00020\u00112\u0006\u00104\u001a\u00020\"H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u000b2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\"H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u0011H\u0017¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u000bH\u0016¢\u0006\u0004\bA\u0010\rJ\u0015\u0010C\u001a\u00020\u00112\u0006\u0010B\u001a\u00020\u0002¢\u0006\u0004\bC\u0010DR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010ER\u0014\u0010F\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0013R$\u0010K\u001a\u00020\"2\u0006\u0010G\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010=R$\u0010O\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bL\u0010M\"\u0004\b\u0017\u0010NR$\u0010R\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bP\u0010M\"\u0004\bQ\u0010NR\u0014\u0010S\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010\u0013R\u0014\u0010T\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010\u0013R\u0016\u0010W\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010\u0013R(\u0010]\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060Z\u0018\u00010Y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010\u0013¨\u0006a"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Landroid/database/sqlite/SQLiteDatabase;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "sql", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;", "", "beginTransaction", "()V", "beginTransactionNonExclusive", "endTransaction", "setTransactionSuccessful", "", "inTransaction", "()Z", "yieldIfContendedSafely", "", "numBytes", "setMaximumSize", "(J)J", "query", "Landroid/database/Cursor;", "(Ljava/lang/String;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", B5.R, "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "insert", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "whereClause", "", "", "whereArgs", "delete", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "execSQL", "(Ljava/lang/String;)V", "bindArgs", "(Ljava/lang/String;[Ljava/lang/Object;)V", "newVersion", "needUpgrade", "(I)Z", "Ljava/util/Locale;", CommonUrlParts.LOCALE, "setLocale", "(Ljava/util/Locale;)V", "cacheSize", "setMaxSqlCacheSize", "(I)V", "enabled", "setForeignKeyConstraintsEnabled", "(Z)V", "close", "sqLiteDatabase", "isDelegate", "(Landroid/database/sqlite/SQLiteDatabase;)Z", "Landroid/database/sqlite/SQLiteDatabase;", "isDbLockedByCurrentThread", "value", C4901tg.b, "()I", "setVersion", "version", "getMaximumSize", "()J", "(J)V", "maximumSize", "getPageSize", "setPageSize", "pageSize", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", "path", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk", "Companion", "Api30Impl", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class FrameworkSQLiteDatabase implements SupportSQLiteDatabase {
    private final SQLiteDatabase delegate;
    private static final String[] CONFLICT_VALUES = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] EMPTY_STRING_ARRAY = new String[0];

    public FrameworkSQLiteDatabase(SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public SupportSQLiteStatement compileStatement(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement compileStatement = this.delegate.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(compileStatement, "delegate.compileStatement(sql)");
        return new FrameworkSQLiteStatement(compileStatement);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
        this.delegate.beginTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        this.delegate.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void endTransaction() {
        this.delegate.endTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        this.delegate.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean inTransaction() {
        return this.delegate.inTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
        return this.delegate.isDbLockedByCurrentThread();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
        return this.delegate.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int getVersion() {
        return this.delegate.getVersion();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setVersion(int i) {
        this.delegate.setVersion(i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getMaximumSize() {
        return this.delegate.getMaximumSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long setMaximumSize(long numBytes) {
        this.delegate.setMaximumSize(numBytes);
        return this.delegate.getMaximumSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getPageSize() {
        return this.delegate.getPageSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setPageSize(long j) {
        this.delegate.setPageSize(j);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return query(new SimpleSQLiteQuery(query));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(final SupportSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final Function4 function4 = new Function4() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$query$cursorFactory$1
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            @NotNull
            public final SQLiteCursor invoke(@Nullable SQLiteDatabase sQLiteDatabase, @Nullable SQLiteCursorDriver sQLiteCursorDriver, @Nullable String str, @Nullable SQLiteQuery sQLiteQuery) {
                SupportSQLiteQuery supportSQLiteQuery = SupportSQLiteQuery.this;
                Intrinsics.checkNotNull(sQLiteQuery);
                supportSQLiteQuery.bindTo(new FrameworkSQLiteProgram(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        };
        Cursor rawQueryWithFactory = this.delegate.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$$ExternalSyntheticLambda1
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor query$lambda$0;
                query$lambda$0 = FrameworkSQLiteDatabase.query$lambda$0(Function4.this, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                return query$lambda$0;
            }
        }, query.getQuery(), EMPTY_STRING_ARRAY, null);
        Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor query$lambda$0(Function4 tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Cursor) tmp0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(final SupportSQLiteQuery query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        SQLiteDatabase sQLiteDatabase = this.delegate;
        String query2 = query.getQuery();
        String[] strArr = EMPTY_STRING_ARRAY;
        Intrinsics.checkNotNull(cancellationSignal);
        return SupportSQLiteCompat.Api16Impl.rawQueryWithFactory(sQLiteDatabase, query2, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$$ExternalSyntheticLambda0
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor query$lambda$1;
                query$lambda$1 = FrameworkSQLiteDatabase.query$lambda$1(SupportSQLiteQuery.this, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
                return query$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor query$lambda$1(SupportSQLiteQuery query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.checkNotNull(sQLiteQuery);
        query.bindTo(new FrameworkSQLiteProgram(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long insert(String table, int conflictAlgorithm, ContentValues values) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        return this.delegate.insertWithOnConflict(table, null, values, conflictAlgorithm);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int delete(String table, String whereClause, Object[] whereArgs) {
        Intrinsics.checkNotNullParameter(table, "table");
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ");
        sb.append(table);
        if (whereClause != null && whereClause.length() != 0) {
            sb.append(" WHERE ");
            sb.append(whereClause);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        SupportSQLiteStatement compileStatement = compileStatement(sb2);
        SimpleSQLiteQuery.INSTANCE.bind(compileStatement, whereArgs);
        return compileStatement.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int update(String table, int conflictAlgorithm, ContentValues values, String whereClause, Object[] whereArgs) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = whereArgs == null ? size : whereArgs.length + size;
        Object[] objArr = new Object[length];
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE ");
        sb.append(CONFLICT_VALUES[conflictAlgorithm]);
        sb.append(table);
        sb.append(" SET ");
        int i = 0;
        for (String str : values.keySet()) {
            sb.append(i > 0 ? StringUtils.COMMA : "");
            sb.append(str);
            objArr[i] = values.get(str);
            sb.append("=?");
            i++;
        }
        if (whereArgs != null) {
            for (int i2 = size; i2 < length; i2++) {
                objArr[i2] = whereArgs[i2 - size];
            }
        }
        if (!TextUtils.isEmpty(whereClause)) {
            sb.append(" WHERE ");
            sb.append(whereClause);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        SupportSQLiteStatement compileStatement = compileStatement(sb2);
        SimpleSQLiteQuery.INSTANCE.bind(compileStatement, objArr);
        return compileStatement.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.delegate.execSQL(sql);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(String sql, Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.delegate.execSQL(sql, bindArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isReadOnly() {
        return this.delegate.isReadOnly();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean needUpgrade(int newVersion) {
        return this.delegate.needUpgrade(newVersion);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public String getPath() {
        return this.delegate.getPath();
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
    public void setForeignKeyConstraintsEnabled(boolean enabled) {
        SupportSQLiteCompat.Api16Impl.setForeignKeyConstraintsEnabled(this.delegate, enabled);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isWriteAheadLoggingEnabled() {
        return SupportSQLiteCompat.Api16Impl.isWriteAheadLoggingEnabled(this.delegate);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public List getAttachedDbs() {
        return this.delegate.getAttachedDbs();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
        return this.delegate.isDatabaseIntegrityOk();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final boolean isDelegate(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return Intrinsics.areEqual(this.delegate, sqLiteDatabase);
    }

    /* compiled from: FrameworkSQLiteDatabase.kt */
    @RequiresApi
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase$Api30Impl;", "", "()V", "execPerConnectionSQL", "", "sQLiteDatabase", "Landroid/database/sqlite/SQLiteDatabase;", "sql", "", "bindArgs", "", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/Object;)V", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Api30Impl {
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        @DoNotInline
        public final void execPerConnectionSQL(@NotNull SQLiteDatabase sQLiteDatabase, @NotNull String sql, @Nullable Object[] bindArgs) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            Intrinsics.checkNotNullParameter(sql, "sql");
            sQLiteDatabase.execPerConnectionSQL(sql, bindArgs);
        }
    }
}
