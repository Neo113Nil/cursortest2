package defpackage;

import android.database.sqlite.SQLiteStatement;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gr2 extends hr2 {
    public final ht0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr2(zs0 zs0Var, String str) {
        super(zs0Var, str);
        zs0Var.getClass();
        str.getClass();
        str.getClass();
        SQLiteStatement compileStatement = zs0Var.m.compileStatement(str);
        compileStatement.getClass();
        this.p = new ht0(compileStatement);
    }

    @Override // defpackage.uc2
    public final boolean E() {
        b();
        this.p.n.execute();
        return false;
    }

    @Override // defpackage.uc2
    public final void a(double d, int i) {
        b();
        this.p.a(d, i);
    }

    @Override // defpackage.uc2
    public final void c(int i) {
        b();
        this.p.c(i);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.p.close();
        this.o = true;
    }

    @Override // defpackage.uc2
    public final void d(long j, int i) {
        b();
        this.p.d(j, i);
    }

    @Override // defpackage.uc2
    public final int getColumnCount() {
        b();
        return 0;
    }

    @Override // defpackage.uc2
    public final String getColumnName(int i) {
        b();
        s03.P(21, "no row");
        throw null;
    }

    @Override // defpackage.uc2
    public final double getDouble(int i) {
        b();
        s03.P(21, "no row");
        throw null;
    }

    @Override // defpackage.uc2
    public final long getLong(int i) {
        b();
        s03.P(21, "no row");
        throw null;
    }

    @Override // defpackage.uc2
    public final boolean isNull(int i) {
        b();
        s03.P(21, "no row");
        throw null;
    }

    @Override // defpackage.uc2
    public final String j(int i) {
        b();
        s03.P(21, "no row");
        throw null;
    }

    @Override // defpackage.uc2
    public final void w(int i, String str) {
        str.getClass();
        b();
        this.p.l(i, str);
    }

    @Override // defpackage.uc2
    public final void reset() {
    }
}
