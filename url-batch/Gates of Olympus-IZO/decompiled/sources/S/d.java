package S;

/* loaded from: classes.dex */
public final class d extends e {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(int i3, n nVar) {
        super(i3, nVar, null, r2);
        Y1.c cVar;
        synchronized (q.f3235b) {
            ?? r12 = q.f3241h;
            Z1.i.f(r12, "<this>");
            cVar = (Y1.c) (r12.size() == 1 ? r12.get(0) : null);
            cVar = cVar == null ? new C0154a(0, r12) : cVar;
        }
    }

    @Override // S.e
    public final e B(Y1.c cVar, Y1.c cVar2) {
        return (e) ((i) q.f(new p(0, new C0155b(cVar, cVar2, 0))));
    }

    @Override // S.e, S.i
    public final void c() {
        synchronized (q.f3235b) {
            int i3 = this.f3211d;
            if (i3 >= 0) {
                q.u(i3);
                this.f3211d = -1;
            }
        }
    }

    @Override // S.e, S.i
    public final void k() {
        u.g();
        throw null;
    }

    @Override // S.e, S.i
    public final void l() {
        u.g();
        throw null;
    }

    @Override // S.e, S.i
    public final void m() {
        q.a();
    }

    @Override // S.e, S.i
    public final i t(Y1.c cVar) {
        return (i) q.f(new p(0, new C0156c(0, cVar)));
    }

    @Override // S.e
    public final u v() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
