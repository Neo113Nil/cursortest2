package androidx.sqlite.driver.bundled;

import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BundledSQLiteConnection.jvmAndroid.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001f\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0002\b\u0013J\b\u0010\u0014\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Landroidx/sqlite/driver/bundled/BundledSQLiteConnection;", "Landroidx/sqlite/SQLiteConnection;", "connectionPointer", "", "<init>", "(J)V", "isClosed", "", "isClosed$annotations", "()V", "inTransaction", "prepare", "Landroidx/sqlite/SQLiteStatement;", "sql", "", "loadExtension", "", "fileName", "entryPoint", "loadExtension$sqlite_bundled", "close", "sqlite-bundled"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BundledSQLiteConnection implements SQLiteConnection {
    private final long connectionPointer;
    private volatile boolean isClosed;

    private static /* synthetic */ void isClosed$annotations() {
    }

    public BundledSQLiteConnection(long j) {
        this.connectionPointer = j;
    }

    @Override // androidx.sqlite.SQLiteConnection
    public boolean inTransaction() {
        boolean nativeInTransaction;
        if (!this.isClosed) {
            nativeInTransaction = BundledSQLiteConnectionKt.nativeInTransaction(this.connectionPointer);
            return nativeInTransaction;
        }
        SQLite.throwSQLiteException(21, "connection is closed");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.sqlite.SQLiteConnection
    public SQLiteStatement prepare(String sql) {
        long nativePrepare;
        Intrinsics.checkNotNullParameter(sql, "sql");
        if (!this.isClosed) {
            nativePrepare = BundledSQLiteConnectionKt.nativePrepare(this.connectionPointer, sql);
            return new BundledSQLiteStatement(this.connectionPointer, nativePrepare);
        }
        SQLite.throwSQLiteException(21, "connection is closed");
        throw new KotlinNothingValueException();
    }

    public final void loadExtension$sqlite_bundled(String fileName, String entryPoint) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (!this.isClosed) {
            BundledSQLiteConnectionKt.nativeLoadExtension(this.connectionPointer, fileName, entryPoint);
        } else {
            SQLite.throwSQLiteException(21, "connection is closed");
            throw new KotlinNothingValueException();
        }
    }

    @Override // androidx.sqlite.SQLiteConnection, java.lang.AutoCloseable
    public void close() {
        if (!this.isClosed) {
            BundledSQLiteConnectionKt.nativeClose(this.connectionPointer);
        }
        this.isClosed = true;
    }
}
