package A1;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final class k extends j implements z1.b {

    /* renamed from: e, reason: collision with root package name */
    public final SQLiteStatement f222e;

    public k(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f222e = sQLiteStatement;
    }

    public final long a() {
        return this.f222e.executeInsert();
    }

    public final int b() {
        return this.f222e.executeUpdateDelete();
    }
}
