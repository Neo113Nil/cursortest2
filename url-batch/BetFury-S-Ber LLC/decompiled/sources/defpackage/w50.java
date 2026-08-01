package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class w50 implements eb0 {
    public final eb0 f;
    public final long g;
    public final /* synthetic */ e60 h;

    public w50(e60 e60Var, eb0 eb0Var) {
        eb0Var.getClass();
        this.h = e60Var;
        this.f = eb0Var;
        this.g = bd0.b();
    }

    @Override // defpackage.eb0
    public final boolean G() {
        if (this.h.d.get()) {
            gk0.S("Statement is recycled", 21);
            throw null;
        }
        if (this.g == bd0.b()) {
            return this.f.G();
        }
        gk0.S("Attempted to use statement on a different thread", 21);
        throw null;
    }

    @Override // defpackage.eb0
    public final void b(int i, long j) {
        if (this.h.d.get()) {
            gk0.S("Statement is recycled", 21);
            throw null;
        }
        if (this.g == bd0.b()) {
            this.f.b(i, j);
        } else {
            gk0.S("Attempted to use statement on a different thread", 21);
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.h.d.get()) {
            gk0.S("Statement is recycled", 21);
            throw null;
        }
        if (this.g == bd0.b()) {
            this.f.close();
        } else {
            gk0.S("Attempted to use statement on a different thread", 21);
            throw null;
        }
    }

    @Override // defpackage.eb0
    public final void g(String str, int i) {
        str.getClass();
        if (this.h.d.get()) {
            gk0.S("Statement is recycled", 21);
            throw null;
        }
        if (this.g == bd0.b()) {
            this.f.g(str, i);
        } else {
            gk0.S("Attempted to use statement on a different thread", 21);
            throw null;
        }
    }

    @Override // defpackage.eb0
    public final int getColumnCount() {
        if (this.h.d.get()) {
            gk0.S("Statement is recycled", 21);
            throw null;
        }
        if (this.g == bd0.b()) {
            return this.f.getColumnCount();
        }
        gk0.S("Attempted to use statement on a different thread", 21);
        throw null;
    }

    @Override // defpackage.eb0
    public final String getColumnName(int i) {
        if (this.h.d.get()) {
            gk0.S("Statement is recycled", 21);
            throw null;
        }
        if (this.g == bd0.b()) {
            return this.f.getColumnName(i);
        }
        gk0.S("Attempted to use statement on a different thread", 21);
        throw null;
    }

    @Override // defpackage.eb0
    public final long getLong(int i) {
        if (this.h.d.get()) {
            gk0.S("Statement is recycled", 21);
            throw null;
        }
        if (this.g == bd0.b()) {
            return this.f.getLong(i);
        }
        gk0.S("Attempted to use statement on a different thread", 21);
        throw null;
    }

    @Override // defpackage.eb0
    public final String h(int i) {
        if (this.h.d.get()) {
            gk0.S("Statement is recycled", 21);
            throw null;
        }
        if (this.g == bd0.b()) {
            return this.f.h(i);
        }
        gk0.S("Attempted to use statement on a different thread", 21);
        throw null;
    }

    @Override // defpackage.eb0
    public final boolean isNull(int i) {
        if (this.h.d.get()) {
            gk0.S("Statement is recycled", 21);
            throw null;
        }
        if (this.g == bd0.b()) {
            return this.f.isNull(i);
        }
        gk0.S("Attempted to use statement on a different thread", 21);
        throw null;
    }

    @Override // defpackage.eb0
    public final void reset() {
        if (this.h.d.get()) {
            gk0.S("Statement is recycled", 21);
            throw null;
        }
        if (this.g == bd0.b()) {
            this.f.reset();
        } else {
            gk0.S("Attempted to use statement on a different thread", 21);
            throw null;
        }
    }

    @Override // defpackage.eb0
    public final void s() {
        if (this.h.d.get()) {
            gk0.S("Statement is recycled", 21);
            throw null;
        }
        if (this.g == bd0.b()) {
            this.f.s();
        } else {
            gk0.S("Attempted to use statement on a different thread", 21);
            throw null;
        }
    }
}
