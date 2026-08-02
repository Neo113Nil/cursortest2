package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class anc extends anh implements amh {
    private final anh a;

    public anc(amj amjVar, String str, anh anhVar) {
        super(amjVar, str);
        this.a = anhVar;
    }

    @Override // defpackage.amh
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.amh
    public final long b(int i) {
        return this.a.b(i);
    }

    @Override // defpackage.amh
    public final String c(int i) {
        return this.a.c(i);
    }

    @Override // defpackage.amh, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.amh
    public final String d(int i) {
        return this.a.d(i);
    }

    @Override // defpackage.amh
    public final void e(int i, byte[] bArr) {
        bArr.getClass();
        this.a.e(i, bArr);
    }

    @Override // defpackage.amh
    public final void f(int i, double d) {
        this.a.f(i, d);
    }

    @Override // defpackage.amh
    public final void g(int i, long j) {
        this.a.g(i, j);
    }

    @Override // defpackage.amh
    public final void h(int i) {
        this.a.h(i);
    }

    @Override // defpackage.amh
    public final void i(int i, String str) {
        str.getClass();
        this.a.i(i, str);
    }

    @Override // defpackage.amh
    public final void j() {
        this.a.j();
    }

    @Override // defpackage.amh
    public final boolean k(int i) {
        return this.a.k(i);
    }

    @Override // defpackage.amh
    public final boolean l() {
        boolean l = this.a.l();
        if (ksp.g(d(0), "wal", true)) {
            ((ams) this.f).e.enableWriteAheadLogging();
            return l;
        }
        ((ams) this.f).e.disableWriteAheadLogging();
        return l;
    }

    @Override // defpackage.amh
    public final byte[] m(int i) {
        return this.a.m(i);
    }

    @Override // defpackage.anh, defpackage.amh
    public final boolean n() {
        return this.a.n();
    }
}
