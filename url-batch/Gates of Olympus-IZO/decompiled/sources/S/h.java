package S;

import D1.C0014b;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: e, reason: collision with root package name */
    public final Y1.c f3206e;

    /* renamed from: f, reason: collision with root package name */
    public int f3207f;

    public h(int i3, n nVar, Y1.c cVar) {
        super(i3, nVar);
        this.f3206e = cVar;
        this.f3207f = 1;
    }

    @Override // S.i
    public final void c() {
        if (this.f3210c) {
            return;
        }
        l();
        this.f3210c = true;
        synchronized (q.f3235b) {
            int i3 = this.f3211d;
            if (i3 >= 0) {
                q.u(i3);
                this.f3211d = -1;
            }
        }
    }

    @Override // S.i
    public final Y1.c f() {
        return this.f3206e;
    }

    @Override // S.i
    public final boolean g() {
        return true;
    }

    @Override // S.i
    public final Y1.c i() {
        return null;
    }

    @Override // S.i
    public final void k() {
        this.f3207f++;
    }

    @Override // S.i
    public final void l() {
        int i3 = this.f3207f - 1;
        this.f3207f = i3;
        if (i3 == 0) {
            a();
        }
    }

    @Override // S.i
    public final void n(x xVar) {
        C0014b c0014b = q.f3234a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // S.i
    public final i t(Y1.c cVar) {
        q.d(this);
        return new g(this.f3209b, this.f3208a, q.l(cVar, this.f3206e, true), this);
    }

    @Override // S.i
    public final void m() {
    }
}
