package androidx.room;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.AutoClosingRoomOpenHelper;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.ironsource.B5;
import com.ironsource.C4901tg;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AutoClosingRoomOpenHelper.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001a\u001b\u001cB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0011\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0097\u0001R\u0010\u0010\u0004\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u001d"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/DelegatingOpenHelper;", "delegate", "autoCloser", "Landroidx/room/AutoCloser;", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper;Landroidx/room/AutoCloser;)V", "autoClosingDb", "Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "databaseName", "", "getDatabaseName", "()Ljava/lang/String;", "getDelegate", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "readableDatabase", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getReadableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "getWritableDatabase", "close", "", "setWriteAheadLoggingEnabled", "enabled", "", "AutoClosingSupportSQLiteDatabase", "AutoClosingSupportSqliteStatement", "KeepAliveCursor", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class AutoClosingRoomOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {
    public final AutoCloser autoCloser;
    private final AutoClosingSupportSQLiteDatabase autoClosingDb;
    private final SupportSQLiteOpenHelper delegate;

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    /* renamed from: getDatabaseName */
    public String getName() {
        return this.delegate.getName();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        this.delegate.setWriteAheadLoggingEnabled(enabled);
    }

    public AutoClosingRoomOpenHelper(SupportSQLiteOpenHelper delegate, AutoCloser autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.delegate = delegate;
        this.autoCloser = autoCloser;
        autoCloser.init(getDelegate());
        this.autoClosingDb = new AutoClosingSupportSQLiteDatabase(autoCloser);
    }

    @Override // androidx.room.DelegatingOpenHelper
    public SupportSQLiteOpenHelper getDelegate() {
        return this.delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getWritableDatabase() {
        this.autoClosingDb.pokeOpen();
        return this.autoClosingDb;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getReadableDatabase() {
        this.autoClosingDb.pokeOpen();
        return this.autoClosingDb;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.autoClosingDb.close();
    }

    /* compiled from: AutoClosingRoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ\u0017\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001a\u0010\u001eJ!\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0004\b\u001a\u0010!J'\u0010'\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\t2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J5\u0010-\u001a\u00020#2\u0006\u0010\"\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\t2\u0012\u0010,\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010+\u0018\u00010*H\u0016¢\u0006\u0004\b-\u0010.JE\u0010/\u001a\u00020#2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010\t2\u0012\u0010,\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010+\u0018\u00010*H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b1\u00102J)\u00101\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0010\u00103\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010+0*H\u0016¢\u0006\u0004\b1\u00104J\u0017\u00106\u001a\u00020\u00122\u0006\u00105\u001a\u00020#H\u0016¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u00062\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00062\u0006\u0010<\u001a\u00020#H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u0012H\u0017¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0006H\u0016¢\u0006\u0004\bB\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010CR\u0014\u0010D\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0014R$\u0010E\u001a\u00020#2\u0006\u0010E\u001a\u00020#8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010>R\u0014\u0010K\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR$\u0010O\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bL\u0010J\"\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\u0014R\u0014\u0010Q\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0014R\u0016\u0010T\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\u0014R(\u0010Z\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0W\u0018\u00010V8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\u0014¨\u0006\\"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Landroidx/room/AutoCloser;", "autoCloser", "<init>", "(Landroidx/room/AutoCloser;)V", "", "pokeOpen", "()V", "", "sql", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;", "beginTransaction", "beginTransactionNonExclusive", "endTransaction", "setTransactionSuccessful", "", "inTransaction", "()Z", "yieldIfContendedSafely", "", "numBytes", "setMaximumSize", "(J)J", "query", "Landroid/database/Cursor;", "(Ljava/lang/String;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", B5.R, "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "insert", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "whereClause", "", "", "whereArgs", "delete", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "execSQL", "(Ljava/lang/String;)V", "bindArgs", "(Ljava/lang/String;[Ljava/lang/Object;)V", "newVersion", "needUpgrade", "(I)Z", "Ljava/util/Locale;", CommonUrlParts.LOCALE, "setLocale", "(Ljava/util/Locale;)V", "cacheSize", "setMaxSqlCacheSize", "(I)V", "enabled", "setForeignKeyConstraintsEnabled", "(Z)V", "close", "Landroidx/room/AutoCloser;", "isDbLockedByCurrentThread", "version", C4901tg.b, "()I", "setVersion", "getMaximumSize", "()J", "maximumSize", "getPageSize", "setPageSize", "(J)V", "pageSize", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", "path", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AutoClosingSupportSQLiteDatabase implements SupportSQLiteDatabase {
        private final AutoCloser autoCloser;

        public AutoClosingSupportSQLiteDatabase(AutoCloser autoCloser) {
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.autoCloser = autoCloser;
        }

        public final void pokeOpen() {
            this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pokeOpen$1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@NotNull SupportSQLiteDatabase it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public SupportSQLiteStatement compileStatement(String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            return new AutoClosingSupportSqliteStatement(sql, this.autoCloser);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransaction() {
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransaction();
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionNonExclusive() {
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionNonExclusive();
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void endTransaction() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                SupportSQLiteDatabase delegateDatabase = this.autoCloser.getDelegateDatabase();
                Intrinsics.checkNotNull(delegateDatabase);
                delegateDatabase.endTransaction();
            } finally {
                this.autoCloser.decrementCountAndScheduleClose();
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setTransactionSuccessful() {
            Unit unit;
            SupportSQLiteDatabase delegateDatabase = this.autoCloser.getDelegateDatabase();
            if (delegateDatabase != null) {
                delegateDatabase.setTransactionSuccessful();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean inTransaction() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.executeRefCountingFunction(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isDbLockedByCurrentThread() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new PropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDbLockedByCurrentThread$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                @Nullable
                public Object get(@Nullable Object obj) {
                    return Boolean.valueOf(((SupportSQLiteDatabase) obj).isDbLockedByCurrentThread());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean yieldIfContendedSafely() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$1.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int getVersion() {
            return ((Number) this.autoCloser.executeRefCountingFunction(new MutablePropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
                @Nullable
                public Object get(@Nullable Object obj) {
                    return Integer.valueOf(((SupportSQLiteDatabase) obj).getVersion());
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
                public void set(@Nullable Object obj, @Nullable Object obj2) {
                    ((SupportSQLiteDatabase) obj).setVersion(((Number) obj2).intValue());
                }
            })).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setVersion(final int i) {
            this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@NotNull SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    db.setVersion(i);
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long getMaximumSize() {
            return ((Number) this.autoCloser.executeRefCountingFunction(new PropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                @Nullable
                public Object get(@Nullable Object obj) {
                    return Long.valueOf(((SupportSQLiteDatabase) obj).getMaximumSize());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long setMaximumSize(final long numBytes) {
            return ((Number) this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaximumSize$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Long invoke(@NotNull SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    return Long.valueOf(db.setMaximumSize(numBytes));
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long getPageSize() {
            return ((Number) this.autoCloser.executeRefCountingFunction(new MutablePropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
                @Nullable
                public Object get(@Nullable Object obj) {
                    return Long.valueOf(((SupportSQLiteDatabase) obj).getPageSize());
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
                public void set(@Nullable Object obj, @Nullable Object obj2) {
                    ((SupportSQLiteDatabase) obj).setPageSize(((Number) obj2).longValue());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setPageSize(final long j) {
            this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@NotNull SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    db.setPageSize(j);
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public Cursor query(String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public Cursor query(SupportSQLiteQuery query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public Cursor query(SupportSQLiteQuery query, CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query, cancellationSignal), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long insert(final String table, final int conflictAlgorithm, final ContentValues values) {
            Intrinsics.checkNotNullParameter(table, "table");
            Intrinsics.checkNotNullParameter(values, "values");
            return ((Number) this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$insert$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Long invoke(@NotNull SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    return Long.valueOf(db.insert(table, conflictAlgorithm, values));
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int delete(final String table, final String whereClause, final Object[] whereArgs) {
            Intrinsics.checkNotNullParameter(table, "table");
            return ((Number) this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$delete$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Integer invoke(@NotNull SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    return Integer.valueOf(db.delete(table, whereClause, whereArgs));
                }
            })).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int update(final String table, final int conflictAlgorithm, final ContentValues values, final String whereClause, final Object[] whereArgs) {
            Intrinsics.checkNotNullParameter(table, "table");
            Intrinsics.checkNotNullParameter(values, "values");
            return ((Number) this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$update$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Integer invoke(@NotNull SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    return Integer.valueOf(db.update(table, conflictAlgorithm, values, whereClause, whereArgs));
                }
            })).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void execSQL(final String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@NotNull SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    db.execSQL(sql);
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void execSQL(final String sql, final Object[] bindArgs) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@NotNull SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    db.execSQL(sql, bindArgs);
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isReadOnly() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isReadOnly$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull SupportSQLiteDatabase obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    return Boolean.valueOf(obj.isReadOnly());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isOpen() {
            SupportSQLiteDatabase delegateDatabase = this.autoCloser.getDelegateDatabase();
            if (delegateDatabase == null) {
                return false;
            }
            return delegateDatabase.isOpen();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean needUpgrade(final int newVersion) {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$needUpgrade$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    return Boolean.valueOf(db.needUpgrade(newVersion));
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public String getPath() {
            return (String) this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final String invoke(@NotNull SupportSQLiteDatabase obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    return obj.getPath();
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setLocale(final Locale locale) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setLocale$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@NotNull SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    db.setLocale(locale);
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setMaxSqlCacheSize(final int cacheSize) {
            this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaxSqlCacheSize$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@NotNull SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    db.setMaxSqlCacheSize(cacheSize);
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setForeignKeyConstraintsEnabled(final boolean enabled) {
            this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setForeignKeyConstraintsEnabled$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@NotNull SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    db.setForeignKeyConstraintsEnabled(enabled);
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isWriteAheadLoggingEnabled() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isWriteAheadLoggingEnabled$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    return Boolean.valueOf(db.isWriteAheadLoggingEnabled());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public List getAttachedDbs() {
            return (List) this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final List<Pair<String, String>> invoke(@NotNull SupportSQLiteDatabase obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    return obj.getAttachedDbs();
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isDatabaseIntegrityOk() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDatabaseIntegrityOk$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull SupportSQLiteDatabase obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    return Boolean.valueOf(obj.isDatabaseIntegrityOk());
                }
            })).booleanValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.autoCloser.closeDatabaseIfOpen();
        }
    }

    /* compiled from: AutoClosingRoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J!\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fH\u0096\u0001J\t\u0010\u000e\u001a\u00020\u0007H\u0097\u0001J\u0019\u0010\u000f\u001a\n \r*\u0004\u0018\u00010\u00100\u00102\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J\t\u0010\u0011\u001a\u00020\nH\u0096\u0001J\u0019\u0010\u0012\u001a\u00020\n2\u000e\u0010\t\u001a\n \r*\u0004\u0018\u00010\u00130\u0013H\u0096\u0001J\u0019\u0010\u0014\u001a\u00020\n2\u000e\u0010\t\u001a\n \r*\u0004\u0018\u00010\u00130\u0013H\u0096\u0001J\u0019\u0010\u0015\u001a\n \r*\u0004\u0018\u00010\u00130\u00132\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J4\u0010\u0016\u001a(\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00130\u0013 \r*\u0014\u0012\u000e\b\u0001\u0012\n \r*\u0004\u0018\u00010\u00130\u0013\u0018\u00010\u00170\u0017H\u0096\u0001¢\u0006\u0002\u0010\u0018J\t\u0010\u0019\u001a\u00020\nH\u0096\u0001J\u0011\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J\u0011\u0010\u001c\u001a\n \r*\u0004\u0018\u00010\u001d0\u001dH\u0096\u0001J\u0011\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J\u0011\u0010 \u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J\u0011\u0010!\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J\b\u0010#\u001a\u00020$H\u0017J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020$0&H\u0017J\t\u0010'\u001a\u00020\nH\u0096\u0001J\u0011\u0010(\u001a\u00020)2\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J\u0019\u0010*\u001a\n \r*\u0004\u0018\u00010\u00130\u00132\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J\u0011\u0010+\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J\t\u0010,\u001a\u00020-H\u0096\u0001J\t\u0010.\u001a\u00020-H\u0096\u0001J\t\u0010/\u001a\u00020-H\u0096\u0001J\t\u00100\u001a\u00020-H\u0096\u0001J\t\u00101\u001a\u00020-H\u0096\u0001J\t\u00102\u001a\u00020-H\u0096\u0001J\u0011\u00103\u001a\u00020-2\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J\u0011\u00104\u001a\u00020-2\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J\t\u00105\u001a\u00020-H\u0096\u0001J\t\u00106\u001a\u00020-H\u0096\u0001J\t\u00107\u001a\u00020-H\u0096\u0001J\u0011\u00108\u001a\u00020-2\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J\t\u00109\u001a\u00020-H\u0096\u0001J\u0019\u0010:\u001a\u00020\u00072\u000e\u0010\t\u001a\n \r*\u0004\u0018\u00010;0;H\u0096\u0001J\u0019\u0010<\u001a\u00020\u00072\u000e\u0010\t\u001a\n \r*\u0004\u0018\u00010=0=H\u0096\u0001J\t\u0010>\u001a\u00020-H\u0097\u0001J!\u0010?\u001a\n \r*\u0004\u0018\u00010\u001d0\u001d2\u000e\u0010\t\u001a\n \r*\u0004\u0018\u00010\u001d0\u001dH\u0096\u0001J\u0010\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u001dH\u0017J)\u0010B\u001a\u00020\u00072\u000e\u0010\t\u001a\n \r*\u0004\u0018\u00010C0C2\u000e\u0010\u000b\u001a\n \r*\u0004\u0018\u00010$0$H\u0096\u0001J\u001e\u0010D\u001a\u00020\u00072\u0006\u0010E\u001a\u00020C2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020$0&H\u0017J\u0019\u0010G\u001a\u00020\u00072\u000e\u0010\t\u001a\n \r*\u0004\u0018\u00010;0;H\u0096\u0001J\u0019\u0010H\u001a\u00020\u00072\u000e\u0010\t\u001a\n \r*\u0004\u0018\u00010=0=H\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$KeepAliveCursor;", "Landroid/database/Cursor;", "delegate", "autoCloser", "Landroidx/room/AutoCloser;", "(Landroid/database/Cursor;Landroidx/room/AutoCloser;)V", "close", "", "copyStringToBuffer", "p0", "", "p1", "Landroid/database/CharArrayBuffer;", "kotlin.jvm.PlatformType", "deactivate", "getBlob", "", "getColumnCount", "getColumnIndex", "", "getColumnIndexOrThrow", "getColumnName", "getColumnNames", "", "()[Ljava/lang/String;", "getCount", "getDouble", "", "getExtras", "Landroid/os/Bundle;", "getFloat", "", "getInt", "getLong", "", "getNotificationUri", "Landroid/net/Uri;", "getNotificationUris", "", "getPosition", "getShort", "", "getString", "getType", "getWantsAllOnMoveCalls", "", "isAfterLast", "isBeforeFirst", "isClosed", "isFirst", "isLast", "isNull", "move", "moveToFirst", "moveToLast", "moveToNext", "moveToPosition", "moveToPrevious", "registerContentObserver", "Landroid/database/ContentObserver;", "registerDataSetObserver", "Landroid/database/DataSetObserver;", "requery", "respond", "setExtras", "extras", "setNotificationUri", "Landroid/content/ContentResolver;", "setNotificationUris", "cr", "uris", "unregisterContentObserver", "unregisterDataSetObserver", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    private static final class KeepAliveCursor implements Cursor {
        private final AutoCloser autoCloser;
        private final Cursor delegate;

        @Override // android.database.Cursor
        public void copyStringToBuffer(int p0, CharArrayBuffer p1) {
            this.delegate.copyStringToBuffer(p0, p1);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.delegate.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int p0) {
            return this.delegate.getBlob(p0);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String p0) {
            return this.delegate.getColumnIndex(p0);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String p0) {
            return this.delegate.getColumnIndexOrThrow(p0);
        }

        @Override // android.database.Cursor
        public String getColumnName(int p0) {
            return this.delegate.getColumnName(p0);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.delegate.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.delegate.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int p0) {
            return this.delegate.getDouble(p0);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.delegate.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int p0) {
            return this.delegate.getFloat(p0);
        }

        @Override // android.database.Cursor
        public int getInt(int p0) {
            return this.delegate.getInt(p0);
        }

        @Override // android.database.Cursor
        public long getLong(int p0) {
            return this.delegate.getLong(p0);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.delegate.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int p0) {
            return this.delegate.getShort(p0);
        }

        @Override // android.database.Cursor
        public String getString(int p0) {
            return this.delegate.getString(p0);
        }

        @Override // android.database.Cursor
        public int getType(int p0) {
            return this.delegate.getType(p0);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.delegate.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.delegate.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.delegate.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.delegate.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.delegate.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.delegate.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int p0) {
            return this.delegate.isNull(p0);
        }

        @Override // android.database.Cursor
        public boolean move(int p0) {
            return this.delegate.move(p0);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.delegate.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.delegate.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.delegate.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int p0) {
            return this.delegate.moveToPosition(p0);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.delegate.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver p0) {
            this.delegate.registerContentObserver(p0);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver p0) {
            this.delegate.registerDataSetObserver(p0);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.delegate.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle p0) {
            return this.delegate.respond(p0);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver p0, Uri p1) {
            this.delegate.setNotificationUri(p0, p1);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver p0) {
            this.delegate.unregisterContentObserver(p0);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver p0) {
            this.delegate.unregisterDataSetObserver(p0);
        }

        public KeepAliveCursor(Cursor delegate, AutoCloser autoCloser) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.delegate = delegate;
            this.autoCloser = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
            this.autoCloser.decrementCountAndScheduleClose();
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver cr, List uris) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(uris, "uris");
            SupportSQLiteCompat.Api29Impl.setNotificationUris(this.delegate, cr, uris);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return SupportSQLiteCompat.Api19Impl.getNotificationUri(this.delegate);
        }

        @Override // android.database.Cursor
        public List getNotificationUris() {
            return SupportSQLiteCompat.Api29Impl.getNotificationUris(this.delegate);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle extras) {
            Intrinsics.checkNotNullParameter(extras, "extras");
            SupportSQLiteCompat.Api23Impl.setExtras(this.delegate, extras);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutoClosingRoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R(\u00103\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001301j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0013`28\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "", "sql", "Landroidx/room/AutoCloser;", "autoCloser", "<init>", "(Ljava/lang/String;Landroidx/room/AutoCloser;)V", "T", "Lkotlin/Function1;", "block", "executeSqliteStatementWithRefCount", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "supportSQLiteStatement", "", "doBinds", "(Landroidx/sqlite/db/SupportSQLiteStatement;)V", "", "bindIndex", "", "value", "saveBinds", "(ILjava/lang/Object;)V", "close", "()V", "execute", "executeUpdateDelete", "()I", "", "executeInsert", "()J", "simpleQueryForLong", "simpleQueryForString", "()Ljava/lang/String;", "index", "bindNull", "(I)V", "bindLong", "(IJ)V", "", "bindDouble", "(ID)V", "bindString", "(ILjava/lang/String;)V", "", "bindBlob", "(I[B)V", "Ljava/lang/String;", "Landroidx/room/AutoCloser;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "binds", "Ljava/util/ArrayList;", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final class AutoClosingSupportSqliteStatement implements SupportSQLiteStatement {
        private final AutoCloser autoCloser;
        private final ArrayList binds;
        private final String sql;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public AutoClosingSupportSqliteStatement(String sql, AutoCloser autoCloser) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.sql = sql;
            this.autoCloser = autoCloser;
            this.binds = new ArrayList();
        }

        private final Object executeSqliteStatementWithRefCount(final Function1 block) {
            return this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeSqliteStatementWithRefCount$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(@NotNull SupportSQLiteDatabase db) {
                    String str;
                    Intrinsics.checkNotNullParameter(db, "db");
                    str = AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.this.sql;
                    SupportSQLiteStatement compileStatement = db.compileStatement(str);
                    AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.this.doBinds(compileStatement);
                    return block.invoke(compileStatement);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void doBinds(SupportSQLiteStatement supportSQLiteStatement) {
            Iterator it = this.binds.iterator();
            int i = 0;
            while (it.hasNext()) {
                it.next();
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Object obj = this.binds.get(i);
                if (obj == null) {
                    supportSQLiteStatement.bindNull(i2);
                } else if (obj instanceof Long) {
                    supportSQLiteStatement.bindLong(i2, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    supportSQLiteStatement.bindDouble(i2, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    supportSQLiteStatement.bindString(i2, (String) obj);
                } else if (obj instanceof byte[]) {
                    supportSQLiteStatement.bindBlob(i2, (byte[]) obj);
                }
                i = i2;
            }
        }

        private final void saveBinds(int bindIndex, Object value) {
            int size;
            int i = bindIndex - 1;
            if (i >= this.binds.size() && (size = this.binds.size()) <= i) {
                while (true) {
                    this.binds.add(null);
                    if (size == i) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.binds.set(i, value);
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public void execute() {
            executeSqliteStatementWithRefCount(new Function1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$execute$1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@NotNull SupportSQLiteStatement statement) {
                    Intrinsics.checkNotNullParameter(statement, "statement");
                    statement.execute();
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public int executeUpdateDelete() {
            return ((Number) executeSqliteStatementWithRefCount(new Function1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeUpdateDelete$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Integer invoke(@NotNull SupportSQLiteStatement obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    return Integer.valueOf(obj.executeUpdateDelete());
                }
            })).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public long executeInsert() {
            return ((Number) executeSqliteStatementWithRefCount(new Function1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeInsert$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Long invoke(@NotNull SupportSQLiteStatement obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    return Long.valueOf(obj.executeInsert());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public long simpleQueryForLong() {
            return ((Number) executeSqliteStatementWithRefCount(new Function1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForLong$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Long invoke(@NotNull SupportSQLiteStatement obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    return Long.valueOf(obj.simpleQueryForLong());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public String simpleQueryForString() {
            return (String) executeSqliteStatementWithRefCount(new Function1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForString$1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final String invoke(@NotNull SupportSQLiteStatement obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    return obj.simpleQueryForString();
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindNull(int index) {
            saveBinds(index, null);
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindLong(int index, long value) {
            saveBinds(index, Long.valueOf(value));
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindDouble(int index, double value) {
            saveBinds(index, Double.valueOf(value));
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindString(int index, String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            saveBinds(index, value);
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindBlob(int index, byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            saveBinds(index, value);
        }
    }
}
