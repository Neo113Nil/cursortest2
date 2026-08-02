package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class and extends anh {
    private final amz a;

    public and(amj amjVar, String str) {
        super(amjVar, str);
        this.a = amjVar.i(str);
    }

    @Override // defpackage.amh
    public final int a() {
        o();
        return 0;
    }

    @Override // defpackage.amh
    public final long b(int i) {
        o();
        yi.h(21, "no row");
        throw new koh();
    }

    @Override // defpackage.amh
    public final String c(int i) {
        o();
        yi.h(21, "no row");
        throw new koh();
    }

    @Override // defpackage.amh, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        p();
    }

    @Override // defpackage.amh
    public final String d(int i) {
        o();
        yi.h(21, "no row");
        throw new koh();
    }

    @Override // defpackage.amh
    public final void e(int i, byte[] bArr) {
        bArr.getClass();
        o();
        this.a.a(i, bArr);
    }

    @Override // defpackage.amh
    public final void f(int i, double d) {
        o();
        this.a.b(i, d);
    }

    @Override // defpackage.amh
    public final void g(int i, long j) {
        o();
        this.a.c(i, j);
    }

    @Override // defpackage.amh
    public final void h(int i) {
        o();
        this.a.d(i);
    }

    @Override // defpackage.amh
    public final void i(int i, String str) {
        str.getClass();
        o();
        this.a.e(i, str);
    }

    @Override // defpackage.amh
    public final void j() {
        o();
    }

    @Override // defpackage.amh
    public final boolean k(int i) {
        o();
        yi.h(21, "no row");
        throw new koh();
    }

    @Override // defpackage.amh
    public final boolean l() {
        o();
        this.a.a.execute();
        return false;
    }

    @Override // defpackage.amh
    public final byte[] m(int i) {
        o();
        yi.h(21, "no row");
        throw new koh();
    }
}
