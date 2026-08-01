package defpackage;

import android.database.sqlite.SQLiteStatement;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class gr extends fr implements rg0 {
    public final SQLiteStatement g;

    public gr(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.g = sQLiteStatement;
    }

    @Override // defpackage.rg0
    public final void p() {
        this.g.execute();
    }
}
