package V;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final class i extends h implements U.d {

    /* renamed from: g, reason: collision with root package name */
    public final SQLiteStatement f2704g;

    public i(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f2704g = sQLiteStatement;
    }

    public final int a() {
        return this.f2704g.executeUpdateDelete();
    }
}
