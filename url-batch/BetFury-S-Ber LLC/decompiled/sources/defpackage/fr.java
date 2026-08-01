package defpackage;

import android.database.sqlite.SQLiteProgram;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class fr implements ng0 {
    public final SQLiteProgram f;

    public fr(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.f = sQLiteProgram;
    }

    @Override // defpackage.ng0
    public final void E(int i, byte[] bArr) {
        this.f.bindBlob(i, bArr);
    }

    @Override // defpackage.ng0
    public final void F(String str, int i) {
        str.getClass();
        this.f.bindString(i, str);
    }

    @Override // defpackage.ng0
    public final void b(int i, long j) {
        this.f.bindLong(i, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f.close();
    }

    @Override // defpackage.ng0
    public final void l(int i) {
        this.f.bindNull(i);
    }

    @Override // defpackage.ng0
    public final void o(int i, double d) {
        this.f.bindDouble(i, d);
    }
}
