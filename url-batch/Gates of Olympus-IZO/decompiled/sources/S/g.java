package S;

import D1.C0014b;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: e, reason: collision with root package name */
    public final Y1.c f3204e;

    /* renamed from: f, reason: collision with root package name */
    public final i f3205f;

    public g(int i3, n nVar, Y1.c cVar, i iVar) {
        super(i3, nVar);
        this.f3204e = cVar;
        this.f3205f = iVar;
        iVar.k();
    }

    @Override // S.i
    public final void c() {
        if (this.f3210c) {
            return;
        }
        int i3 = this.f3209b;
        i iVar = this.f3205f;
        if (i3 != iVar.d()) {
            a();
        }
        iVar.l();
        this.f3210c = true;
        synchronized (q.f3235b) {
            int i4 = this.f3211d;
            if (i4 >= 0) {
                q.u(i4);
                this.f3211d = -1;
            }
        }
    }

    @Override // S.i
    public final Y1.c f() {
        return this.f3204e;
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
        u.g();
        throw null;
    }

    @Override // S.i
    public final void l() {
        u.g();
        throw null;
    }

    @Override // S.i
    public final void n(x xVar) {
        C0014b c0014b = q.f3234a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // S.i
    public final i t(Y1.c cVar) {
        return new g(this.f3209b, this.f3208a, q.l(cVar, this.f3204e, true), this.f3205f);
    }

    @Override // S.i
    public final void m() {
    }
}
