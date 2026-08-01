package j0;

import android.database.sqlite.SQLiteStatement;
import i0.InterfaceC0146e;

/* loaded from: classes.dex */
public final class j extends i implements InterfaceC0146e {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f2668b;

    public j(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f2668b = sQLiteStatement;
    }

    @Override // i0.InterfaceC0146e
    public final long q() {
        return this.f2668b.executeInsert();
    }

    @Override // i0.InterfaceC0146e
    public final int w() {
        return this.f2668b.executeUpdateDelete();
    }
}
