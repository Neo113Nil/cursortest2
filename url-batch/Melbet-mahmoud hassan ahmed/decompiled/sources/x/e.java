package x;

import android.database.sqlite.SQLiteStatement;
import w.f;

/* loaded from: classes.dex */
class e extends d implements f {

    /* renamed from: g, reason: collision with root package name */
    private final SQLiteStatement f23058g;

    e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f23058g = sQLiteStatement;
    }

    @Override // w.f
    public long K() {
        return this.f23058g.executeInsert();
    }

    @Override // w.f
    public int m() {
        return this.f23058g.executeUpdateDelete();
    }
}
