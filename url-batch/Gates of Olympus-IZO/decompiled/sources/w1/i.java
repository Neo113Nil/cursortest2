package w1;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final class i extends h implements v1.e {

    /* renamed from: e, reason: collision with root package name */
    public final SQLiteStatement f8600e;

    public i(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f8600e = sQLiteStatement;
    }

    @Override // v1.e
    public final long I() {
        return this.f8600e.executeInsert();
    }

    @Override // v1.e
    public final int v() {
        return this.f8600e.executeUpdateDelete();
    }
}
