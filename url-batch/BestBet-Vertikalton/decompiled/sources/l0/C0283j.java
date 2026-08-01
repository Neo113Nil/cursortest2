package l0;

import android.database.sqlite.SQLiteStatement;

/* renamed from: l0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0283j extends C0282i implements k0.b {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f3529b;

    public C0283j(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f3529b = sQLiteStatement;
    }

    public final long a() {
        return this.f3529b.executeInsert();
    }

    public final int d() {
        return this.f3529b.executeUpdateDelete();
    }
}
