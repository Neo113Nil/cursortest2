package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dtr extends agd {
    public final lai a;
    public dum b;
    private kwu c;
    private final lao d;
    private final lao e;

    public dtr() {
        lao a = lak.a(jga.a);
        this.d = a;
        this.a = a;
        this.e = lak.a(new jhu(false, null, true, null));
    }

    public final void a(eia eiaVar, dui duiVar) {
        agq agqVar;
        kqn kqnVar;
        eiaVar.getClass();
        duiVar.getClass();
        if (this.b == null) {
            duq duqVar = duiVar.a;
            this.b = new dum(duqVar.k(), duqVar.h(), (ikm) duqVar.j().a);
        }
        duq duqVar2 = duiVar.a;
        hrz j = duqVar2.j();
        dum dumVar = this.b;
        if (dumVar == null) {
            ksp.a("persistentObjects");
            dumVar = null;
        }
        j.a = dumVar.b;
        kwu kwuVar = this.c;
        if (kwuVar != null) {
            kwuVar.s(null);
        }
        final int i = 1;
        jpt jptVar = new jpt(this) { // from class: dtq
            public final /* synthetic */ dtr a;

            {
                this.a = this;
            }

            @Override // defpackage.jpt
            public final Object b() {
                int i2 = i;
                dum dumVar2 = null;
                dum dumVar3 = this.a.b;
                if (i2 != 0) {
                    if (dumVar3 == null) {
                        ksp.a("persistentObjects");
                    } else {
                        dumVar2 = dumVar3;
                    }
                    return dumVar2.c;
                }
                if (dumVar3 == null) {
                    ksp.a("persistentObjects");
                } else {
                    dumVar2 = dumVar3;
                }
                return dumVar2.a;
            }
        };
        final int i2 = 0;
        dtj dtjVar = new dtj(new dui(duiVar.d, new duq(duqVar2.a, duqVar2.b, new jpt(this) { // from class: dtq
            public final /* synthetic */ dtr a;

            {
                this.a = this;
            }

            @Override // defpackage.jpt
            public final Object b() {
                int i22 = i2;
                dum dumVar2 = null;
                dum dumVar3 = this.a.b;
                if (i22 != 0) {
                    if (dumVar3 == null) {
                        ksp.a("persistentObjects");
                    } else {
                        dumVar2 = dumVar3;
                    }
                    return dumVar2.c;
                }
                if (dumVar3 == null) {
                    ksp.a("persistentObjects");
                } else {
                    dumVar2 = dumVar3;
                }
                return dumVar2.a;
            }
        }, duqVar2.c, duqVar2.d, duqVar2.e, duqVar2.f, duqVar2.g, duqVar2.h, duqVar2.i, duqVar2.j, duqVar2.k, duqVar2.l, duqVar2.m, jptVar, duqVar2.n, duqVar2.o, duqVar2.p, duqVar2.q, duqVar2.r, duqVar2.s, duqVar2.t, duqVar2.u, duqVar2.v, duqVar2.w, duqVar2.x), duiVar.b, duiVar.c), this.d, eiaVar, this.e);
        synchronized (age.a) {
            agqVar = (agq) s("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (agqVar == null) {
                try {
                    kvj kvjVar = kwa.a;
                    kqnVar = lcv.a.i();
                } catch (IllegalStateException | kok unused) {
                    kqnVar = kqo.a;
                }
                agq agqVar2 = new agq(kqnVar.plus(new kxt()));
                u("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", agqVar2);
                agqVar = agqVar2;
            }
        }
        this.c = ixg.i(agqVar, null, 0, new aki(dtjVar, (kqj) null, 10), 3);
    }

    public final void b() {
        kwu kwuVar = this.c;
        if (kwuVar != null) {
            kwuVar.s(null);
        }
        this.d.d(jga.a);
    }

    @Override // defpackage.agd
    public final void c() {
    }
}
