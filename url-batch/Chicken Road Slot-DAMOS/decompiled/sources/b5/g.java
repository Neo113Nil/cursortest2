package b5;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g implements i5.c {

    /* renamed from: d, reason: collision with root package name */
    public final i5.c f1138d;

    public g(i5.c cVar) {
        this.f1138d = cVar;
    }

    @Override // i5.c
    public final boolean A() {
        return this.f1138d.A();
    }

    @Override // i5.c
    public final boolean E() {
        return this.f1138d.E();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        i5.c cVar = this.f1138d;
        cVar.reset();
        cVar.g();
    }

    @Override // i5.c
    public final void f(int i3, long j) {
        this.f1138d.f(i3, j);
    }

    @Override // i5.c
    public final void g() {
        this.f1138d.g();
    }

    @Override // i5.c
    public final int getColumnCount() {
        return this.f1138d.getColumnCount();
    }

    @Override // i5.c
    public final String getColumnName(int i3) {
        return this.f1138d.getColumnName(i3);
    }

    @Override // i5.c
    public final long getLong(int i3) {
        return this.f1138d.getLong(i3);
    }

    @Override // i5.c
    public final boolean isNull(int i3) {
        return this.f1138d.isNull(i3);
    }

    @Override // i5.c
    public final String k(int i3) {
        return this.f1138d.k(i3);
    }

    @Override // i5.c
    public final void q(String str) {
        str.getClass();
        this.f1138d.q(str);
    }

    @Override // i5.c
    public final void reset() {
        this.f1138d.reset();
    }
}
