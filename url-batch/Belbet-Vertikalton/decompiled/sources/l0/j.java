package l0;

import android.database.sqlite.SQLiteStatement;
import k0.InterfaceC0203e;

/* loaded from: classes.dex */
public final class j extends i implements InterfaceC0203e {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f3267b;

    public j(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f3267b = sQLiteStatement;
    }

    @Override // k0.InterfaceC0203e
    public final int A() {
        return this.f3267b.executeUpdateDelete();
    }

    @Override // k0.InterfaceC0203e
    public final long s() {
        return this.f3267b.executeInsert();
    }
}
