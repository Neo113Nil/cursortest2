package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eby extends afb {
    private static final Set l = ixc.M(new ebm[]{ebm.f, ebm.e});
    public final dsg j;
    public final afd k;
    private final ebx m;
    private final dqv n;
    private boolean o;
    private boolean p;
    private dja q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eby(ebv ebvVar, dsg dsgVar) {
        super(false);
        ebvVar.getClass();
        dsgVar.getClass();
        this.j = dsgVar;
        ph phVar = new ph(this, 7);
        this.k = phVar;
        this.m = new ebx(this);
        dqv dqvVar = (dqv) ebvVar.g.e();
        this.n = dqvVar;
        if (dqvVar != null) {
            afa afaVar = new afa(dqvVar, phVar);
            afa afaVar2 = (afa) ((afb) this).i.b(dqvVar, afaVar);
            if (afaVar2 != null && afaVar2.b != phVar) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            }
            if (afaVar2 == null && j()) {
                afaVar.b();
            }
        }
    }

    @Override // defpackage.afb, defpackage.aez
    protected final void f() {
        fao.c();
        super.f();
        dsg dsgVar = this.j;
        dsgVar.e(this.m);
        dsgVar.a();
        m();
        hel g = dsgVar.g();
        g.getClass();
        l(g);
    }

    @Override // defpackage.afb, defpackage.aez
    protected final void g() {
        fao.c();
        super.g();
        this.j.f(this.m);
        m();
        int i = hel.d;
        hel helVar = his.a;
        helVar.getClass();
        l(helVar);
    }

    public final void l(hel helVar) {
        dqv dqvVar = this.n;
        boolean z = dqvVar != null && dqvVar.m(helVar);
        if (z != this.o) {
            fao.c();
            this.o = z;
            i(Boolean.valueOf(z || this.p));
        }
    }

    public final void m() {
        this.q = null;
        boolean t = ixc.t(l, null);
        if (t != this.p) {
            fao.c();
            this.p = t;
            boolean z = true;
            if (!this.o && !t) {
                z = false;
            }
            i(Boolean.valueOf(z));
        }
    }
}
