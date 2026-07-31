package androidx.sqlite.driver.bundled;

import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteStatement;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BundledSQLiteStatement.jvmAndroid.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0016J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u001f\u001a\u00020\bH\u0016J\b\u0010 \u001a\u00020\fH\u0016J\b\u0010!\u001a\u00020\fH\u0016J\b\u0010\"\u001a\u00020\fH\u0016J\b\u0010#\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\n¨\u0006%"}, d2 = {"Landroidx/sqlite/driver/bundled/BundledSQLiteStatement;", "Landroidx/sqlite/SQLiteStatement;", "connectionPointer", "", "statementPointer", "<init>", "(JJ)V", "isClosed", "", "isClosed$annotations", "()V", "bindBlob", "", "index", "", "value", "", "bindDouble", "", "bindLong", "bindText", "", "bindNull", "getBlob", "getDouble", "getLong", "getText", "isNull", "getColumnCount", "getColumnName", "getColumnType", "step", "reset", "clearBindings", "close", "throwIfClosed", "Companion", "sqlite-bundled"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BundledSQLiteStatement implements SQLiteStatement {
    private static final int COLUMN_TYPE_BLOB = 4;
    private static final int COLUMN_TYPE_FLOAT = 2;
    private static final int COLUMN_TYPE_INTEGER = 1;
    private static final int COLUMN_TYPE_NULL = 5;
    private static final int COLUMN_TYPE_TEXT = 3;
    private static final Companion Companion = new Companion(null);
    private final long connectionPointer;
    private volatile boolean isClosed;
    private final long statementPointer;

    private static /* synthetic */ void isClosed$annotations() {
    }

    public BundledSQLiteStatement(long j, long j2) {
        this.connectionPointer = j;
        this.statementPointer = j2;
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindBlob */
    public void mo3264bindBlob(int index, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throwIfClosed();
        BundledSQLiteStatementKt.nativeBindBlob(this.statementPointer, index, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindDouble */
    public void mo3265bindDouble(int index, double value) {
        throwIfClosed();
        BundledSQLiteStatementKt.nativeBindDouble(this.statementPointer, index, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindLong */
    public void mo3266bindLong(int index, long value) {
        throwIfClosed();
        BundledSQLiteStatementKt.nativeBindLong(this.statementPointer, index, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindText */
    public void mo3268bindText(int index, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throwIfClosed();
        BundledSQLiteStatementKt.nativeBindText(this.statementPointer, index, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindNull */
    public void mo3267bindNull(int index) {
        throwIfClosed();
        BundledSQLiteStatementKt.nativeBindNull(this.statementPointer, index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public byte[] getBlob(int index) {
        byte[] nativeGetBlob;
        throwIfClosed();
        nativeGetBlob = BundledSQLiteStatementKt.nativeGetBlob(this.statementPointer, index);
        return nativeGetBlob;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public double getDouble(int index) {
        double nativeGetDouble;
        throwIfClosed();
        nativeGetDouble = BundledSQLiteStatementKt.nativeGetDouble(this.statementPointer, index);
        return nativeGetDouble;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public long getLong(int index) {
        long nativeGetLong;
        throwIfClosed();
        nativeGetLong = BundledSQLiteStatementKt.nativeGetLong(this.statementPointer, index);
        return nativeGetLong;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public String getText(int index) {
        String nativeGetText;
        throwIfClosed();
        nativeGetText = BundledSQLiteStatementKt.nativeGetText(this.statementPointer, index);
        return nativeGetText;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean isNull(int index) {
        int nativeGetColumnType;
        throwIfClosed();
        nativeGetColumnType = BundledSQLiteStatementKt.nativeGetColumnType(this.statementPointer, index);
        return nativeGetColumnType == 5;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnCount() {
        int nativeGetColumnCount;
        throwIfClosed();
        nativeGetColumnCount = BundledSQLiteStatementKt.nativeGetColumnCount(this.statementPointer);
        return nativeGetColumnCount;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public String getColumnName(int index) {
        String nativeGetColumnName;
        throwIfClosed();
        nativeGetColumnName = BundledSQLiteStatementKt.nativeGetColumnName(this.statementPointer, index);
        return nativeGetColumnName;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnType(int index) {
        int nativeGetColumnType;
        throwIfClosed();
        nativeGetColumnType = BundledSQLiteStatementKt.nativeGetColumnType(this.statementPointer, index);
        return nativeGetColumnType;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean step() {
        boolean nativeStep;
        throwIfClosed();
        nativeStep = BundledSQLiteStatementKt.nativeStep(this.statementPointer);
        return nativeStep;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void reset() {
        throwIfClosed();
        BundledSQLiteStatementKt.nativeReset(this.statementPointer);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: clearBindings */
    public void mo3269clearBindings() {
        throwIfClosed();
        BundledSQLiteStatementKt.nativeClearBindings(this.statementPointer);
    }

    @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
    public void close() {
        if (!this.isClosed) {
            BundledSQLiteStatementKt.nativeClose(this.statementPointer);
        }
        this.isClosed = true;
    }

    private final void throwIfClosed() {
        if (this.isClosed) {
            SQLite.throwSQLiteException(21, "statement is closed");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: BundledSQLiteStatement.jvmAndroid.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/sqlite/driver/bundled/BundledSQLiteStatement$Companion;", "", "<init>", "()V", "COLUMN_TYPE_INTEGER", "", "COLUMN_TYPE_FLOAT", "COLUMN_TYPE_TEXT", "COLUMN_TYPE_BLOB", "COLUMN_TYPE_NULL", "sqlite-bundled"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
