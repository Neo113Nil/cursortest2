package defpackage;

import android.database.sqlite.SQLiteProgram;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class xd0 implements ub2 {
    public final SQLiteProgram rtx2ld2ELZv4;

    public xd0(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.rtx2ld2ELZv4 = sQLiteProgram;
    }

    @Override // defpackage.ub2
    public final void BRwzKIf41E4i(int i) {
        this.rtx2ld2ELZv4.bindNull(i);
    }

    @Override // defpackage.ub2
    public final void BjEWd04qc7Mw(int i, byte[] bArr) {
        this.rtx2ld2ELZv4.bindBlob(i, bArr);
    }

    @Override // defpackage.ub2
    public final void QrzZRwfaDlRX(double d, int i) {
        this.rtx2ld2ELZv4.bindDouble(i, d);
    }

    @Override // defpackage.ub2
    public final void Y1f8riQaR6yg(int i, long j) {
        this.rtx2ld2ELZv4.bindLong(i, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.rtx2ld2ELZv4.close();
    }

    @Override // defpackage.ub2
    public final void e9gEMXR7LXtO() {
        this.rtx2ld2ELZv4.clearBindings();
    }

    @Override // defpackage.ub2
    public final void ozEBbv0hFTAB(String str, int i) {
        str.getClass();
        this.rtx2ld2ELZv4.bindString(i, str);
    }
}
