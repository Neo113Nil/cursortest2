package androidx.room;

import androidx.sqlite.db.SupportSQLiteProgram;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RoomSQLiteQuery.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"androidx/room/RoomSQLiteQuery$Companion$copyFrom$1", "Landroidx/sqlite/db/SupportSQLiteProgram;", "", "index", "", "value", "", "bindBlob", "(I[B)V", "", "bindDouble", "(ID)V", "", "bindLong", "(IJ)V", "bindNull", "(I)V", "", "bindString", "(ILjava/lang/String;)V", "close", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes15.dex */
public final class RoomSQLiteQuery$Companion$copyFrom$1 implements SupportSQLiteProgram {
    private final /* synthetic */ RoomSQLiteQuery $$delegate_0;

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int index, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.$$delegate_0.bindBlob(index, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int index, double value) {
        this.$$delegate_0.bindDouble(index, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int index, long value) {
        this.$$delegate_0.bindLong(index, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int index) {
        this.$$delegate_0.bindNull(index);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int index, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.$$delegate_0.bindString(index, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.$$delegate_0.close();
    }
}
