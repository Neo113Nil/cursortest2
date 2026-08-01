package b5;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v implements i5.c {

    /* renamed from: d, reason: collision with root package name */
    public final i5.c f1195d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1196e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0 f1197i;

    public v(b0 b0Var, i5.c cVar) {
        cVar.getClass();
        this.f1197i = b0Var;
        this.f1195d = cVar;
        this.f1196e = a5.b.a();
    }

    @Override // i5.c
    public final boolean E() {
        if (this.f1197i.f1112e) {
            g8.b.L(21, "Statement is recycled");
            throw null;
        }
        if (this.f1196e == a5.b.a()) {
            return this.f1195d.E();
        }
        g8.b.L(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f1197i.f1112e) {
            g8.b.L(21, "Statement is recycled");
            throw null;
        }
        if (this.f1196e == a5.b.a()) {
            this.f1195d.close();
        } else {
            g8.b.L(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // i5.c
    public final void f(int i3, long j) {
        if (this.f1197i.f1112e) {
            g8.b.L(21, "Statement is recycled");
            throw null;
        }
        if (this.f1196e == a5.b.a()) {
            this.f1195d.f(i3, j);
        } else {
            g8.b.L(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // i5.c
    public final void g() {
        if (this.f1197i.f1112e) {
            g8.b.L(21, "Statement is recycled");
            throw null;
        }
        if (this.f1196e == a5.b.a()) {
            this.f1195d.g();
        } else {
            g8.b.L(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // i5.c
    public final int getColumnCount() {
        if (this.f1197i.f1112e) {
            g8.b.L(21, "Statement is recycled");
            throw null;
        }
        if (this.f1196e == a5.b.a()) {
            return this.f1195d.getColumnCount();
        }
        g8.b.L(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // i5.c
    public final String getColumnName(int i3) {
        if (this.f1197i.f1112e) {
            g8.b.L(21, "Statement is recycled");
            throw null;
        }
        if (this.f1196e == a5.b.a()) {
            return this.f1195d.getColumnName(i3);
        }
        g8.b.L(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // i5.c
    public final long getLong(int i3) {
        if (this.f1197i.f1112e) {
            g8.b.L(21, "Statement is recycled");
            throw null;
        }
        if (this.f1196e == a5.b.a()) {
            return this.f1195d.getLong(i3);
        }
        g8.b.L(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // i5.c
    public final boolean isNull(int i3) {
        if (this.f1197i.f1112e) {
            g8.b.L(21, "Statement is recycled");
            throw null;
        }
        if (this.f1196e == a5.b.a()) {
            return this.f1195d.isNull(i3);
        }
        g8.b.L(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // i5.c
    public final String k(int i3) {
        if (this.f1197i.f1112e) {
            g8.b.L(21, "Statement is recycled");
            throw null;
        }
        if (this.f1196e == a5.b.a()) {
            return this.f1195d.k(i3);
        }
        g8.b.L(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // i5.c
    public final void q(String str) {
        str.getClass();
        if (this.f1197i.f1112e) {
            g8.b.L(21, "Statement is recycled");
            throw null;
        }
        if (this.f1196e == a5.b.a()) {
            this.f1195d.q(str);
        } else {
            g8.b.L(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // i5.c
    public final void reset() {
        if (this.f1197i.f1112e) {
            g8.b.L(21, "Statement is recycled");
            throw null;
        }
        if (this.f1196e == a5.b.a()) {
            this.f1195d.reset();
        } else {
            g8.b.L(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
