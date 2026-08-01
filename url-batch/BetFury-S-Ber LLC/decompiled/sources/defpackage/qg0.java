package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class qg0 extends sg0 {
    public final rg0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg0(ig0 ig0Var, String str) {
        super(ig0Var, str);
        ig0Var.getClass();
        str.getClass();
        this.i = ig0Var.k(str);
    }

    @Override // defpackage.eb0
    public final boolean G() {
        i();
        this.i.p();
        return false;
    }

    @Override // defpackage.eb0
    public final void b(int i, long j) {
        i();
        this.i.b(i, j);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.i.close();
        this.h = true;
    }

    @Override // defpackage.eb0
    public final void g(String str, int i) {
        str.getClass();
        i();
        this.i.F(str, i);
    }

    @Override // defpackage.eb0
    public final int getColumnCount() {
        i();
        return 0;
    }

    @Override // defpackage.eb0
    public final String getColumnName(int i) {
        i();
        gk0.S("no row", 21);
        throw null;
    }

    @Override // defpackage.eb0
    public final long getLong(int i) {
        i();
        gk0.S("no row", 21);
        throw null;
    }

    @Override // defpackage.eb0
    public final String h(int i) {
        i();
        gk0.S("no row", 21);
        throw null;
    }

    @Override // defpackage.eb0
    public final boolean isNull(int i) {
        i();
        gk0.S("no row", 21);
        throw null;
    }

    @Override // defpackage.eb0
    public final void s() {
        i();
        this.i.l(6);
    }

    @Override // defpackage.eb0
    public final void reset() {
    }
}
