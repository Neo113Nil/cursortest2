package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class c32 implements uc2 {
    public final uc2 m;
    public final long n;
    public final /* synthetic */ j32 o;

    public c32(j32 j32Var, uc2 uc2Var) {
        uc2Var.getClass();
        this.o = j32Var;
        this.m = uc2Var;
        this.n = dx2.a();
    }

    @Override // defpackage.uc2
    public final boolean E() {
        if (this.o.d.get()) {
            s03.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == dx2.a()) {
            return this.m.E();
        }
        s03.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.uc2
    public final void a(double d, int i) {
        if (this.o.d.get()) {
            s03.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == dx2.a()) {
            this.m.a(d, i);
        } else {
            s03.P(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.uc2
    public final void c(int i) {
        if (this.o.d.get()) {
            s03.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == dx2.a()) {
            this.m.c(i);
        } else {
            s03.P(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.o.d.get()) {
            s03.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == dx2.a()) {
            this.m.close();
        } else {
            s03.P(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.uc2
    public final void d(long j, int i) {
        if (this.o.d.get()) {
            s03.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == dx2.a()) {
            this.m.d(j, i);
        } else {
            s03.P(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.uc2
    public final int getColumnCount() {
        if (this.o.d.get()) {
            s03.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == dx2.a()) {
            return this.m.getColumnCount();
        }
        s03.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.uc2
    public final String getColumnName(int i) {
        if (this.o.d.get()) {
            s03.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == dx2.a()) {
            return this.m.getColumnName(i);
        }
        s03.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.uc2
    public final double getDouble(int i) {
        if (this.o.d.get()) {
            s03.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == dx2.a()) {
            return this.m.getDouble(i);
        }
        s03.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.uc2
    public final long getLong(int i) {
        if (this.o.d.get()) {
            s03.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == dx2.a()) {
            return this.m.getLong(i);
        }
        s03.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.uc2
    public final boolean isNull(int i) {
        if (this.o.d.get()) {
            s03.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == dx2.a()) {
            return this.m.isNull(i);
        }
        s03.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.uc2
    public final String j(int i) {
        if (this.o.d.get()) {
            s03.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == dx2.a()) {
            return this.m.j(i);
        }
        s03.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.uc2
    public final void reset() {
        if (this.o.d.get()) {
            s03.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == dx2.a()) {
            this.m.reset();
        } else {
            s03.P(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.uc2
    public final void w(int i, String str) {
        str.getClass();
        if (this.o.d.get()) {
            s03.P(21, "Statement is recycled");
            throw null;
        }
        if (this.n == dx2.a()) {
            this.m.w(i, str);
        } else {
            s03.P(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
