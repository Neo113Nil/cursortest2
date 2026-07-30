package z3;

import android.database.sqlite.SQLiteStatement;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i extends h implements y3.e {

    /* renamed from: g, reason: collision with root package name */
    public final SQLiteStatement f10091g;

    public i(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f10091g = sQLiteStatement;
    }

    @Override // y3.e
    public final long L() {
        return this.f10091g.executeInsert();
    }

    @Override // y3.e
    public final int l() {
        return this.f10091g.executeUpdateDelete();
    }
}
