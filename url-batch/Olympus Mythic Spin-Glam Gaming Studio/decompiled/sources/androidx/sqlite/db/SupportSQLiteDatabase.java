package androidx.sqlite.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import com.ironsource.B5;
import com.ironsource.C4901tg;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: SupportSQLiteDatabase.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0017J\u0017\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0018H&¢\u0006\u0004\b\u0015\u0010\u0019J!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH'¢\u0006\u0004\b\u0015\u0010\u001cJ'\u0010\"\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b\"\u0010#J5\u0010(\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u00022\u0012\u0010'\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010&\u0018\u00010%H&¢\u0006\u0004\b(\u0010)JE\u0010*\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010\u00022\u0012\u0010'\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010&\u0018\u00010%H&¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b,\u0010-J)\u0010,\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010.\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010&0%H&¢\u0006\u0004\b,\u0010/J\u0017\u00101\u001a\u00020\r2\u0006\u00100\u001a\u00020\u001eH&¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u000203H&¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u001eH&¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\rH'¢\u0006\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u000fR\u001c\u0010A\u001a\u00020\u001e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u00109R\u0014\u0010D\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u001c\u0010H\u001a\u00020\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\bE\u0010C\"\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u000fR\u0014\u0010J\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\u000fR\u0016\u0010M\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020\r8gX¦\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\u000fR(\u0010S\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020P\u0018\u00010O8fX¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006UÀ\u0006\u0001"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteDatabase;", "Ljava/io/Closeable;", "", "sql", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;", "", "beginTransaction", "()V", "beginTransactionNonExclusive", "endTransaction", "setTransactionSuccessful", "", "inTransaction", "()Z", "yieldIfContendedSafely", "", "numBytes", "setMaximumSize", "(J)J", "query", "Landroid/database/Cursor;", "(Ljava/lang/String;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", B5.R, "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "insert", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "whereClause", "", "", "whereArgs", "delete", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "execSQL", "(Ljava/lang/String;)V", "bindArgs", "(Ljava/lang/String;[Ljava/lang/Object;)V", "newVersion", "needUpgrade", "(I)Z", "Ljava/util/Locale;", CommonUrlParts.LOCALE, "setLocale", "(Ljava/util/Locale;)V", "cacheSize", "setMaxSqlCacheSize", "(I)V", "enabled", "setForeignKeyConstraintsEnabled", "(Z)V", "isDbLockedByCurrentThread", C4901tg.b, "()I", "setVersion", "version", "getMaximumSize", "()J", "maximumSize", "getPageSize", "setPageSize", "(J)V", "pageSize", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", "path", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk", "sqlite_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public interface SupportSQLiteDatabase extends Closeable {
    void beginTransaction();

    void beginTransactionNonExclusive();

    SupportSQLiteStatement compileStatement(String sql);

    int delete(String table, String whereClause, Object[] whereArgs);

    void endTransaction();

    void execSQL(String sql);

    void execSQL(String sql, Object[] bindArgs);

    List getAttachedDbs();

    long getMaximumSize();

    long getPageSize();

    String getPath();

    int getVersion();

    boolean inTransaction();

    long insert(String table, int conflictAlgorithm, ContentValues values);

    boolean isDatabaseIntegrityOk();

    boolean isDbLockedByCurrentThread();

    boolean isOpen();

    boolean isReadOnly();

    boolean isWriteAheadLoggingEnabled();

    boolean needUpgrade(int newVersion);

    Cursor query(SupportSQLiteQuery query);

    Cursor query(SupportSQLiteQuery query, CancellationSignal cancellationSignal);

    Cursor query(String query);

    void setForeignKeyConstraintsEnabled(boolean enabled);

    void setLocale(Locale locale);

    void setMaxSqlCacheSize(int cacheSize);

    long setMaximumSize(long numBytes);

    void setPageSize(long j);

    void setTransactionSuccessful();

    void setVersion(int i);

    int update(String table, int conflictAlgorithm, ContentValues values, String whereClause, Object[] whereArgs);

    boolean yieldIfContendedSafely();
}
