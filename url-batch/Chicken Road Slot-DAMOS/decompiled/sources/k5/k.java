package k5;

import android.database.sqlite.SQLiteStatement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k extends j implements j5.e {

    /* renamed from: e, reason: collision with root package name */
    public final SQLiteStatement f5437e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        sQLiteStatement.getClass();
        this.f5437e = sQLiteStatement;
    }

    public final int a() {
        return this.f5437e.executeUpdateDelete();
    }
}
