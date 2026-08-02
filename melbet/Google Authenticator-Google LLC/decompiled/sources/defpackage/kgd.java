package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kgd extends kgh {
    public final jzf a;
    public volatile kbq b;
    final /* synthetic */ kge c;
    private final jxr h = jxr.k();
    private final jxb[] i;

    public kgd(kge kgeVar, jzf jzfVar, jxb[] jxbVarArr) {
        this.c = kgeVar;
        this.a = jzfVar;
        this.i = jxbVarArr;
    }

    public final Runnable b(kfj kfjVar) {
        jxr a = this.h.a();
        try {
            jzf jzfVar = this.a;
            kfg a2 = kfjVar.a(jzfVar.c, jzfVar.b, jzfVar.a, this.i);
            synchronized (this) {
                if (this.f == null) {
                    a2.getClass();
                    super.l(a2);
                    kfi kfiVar = this.e;
                    if (kfiVar == null) {
                        this.g = null;
                        this.d = true;
                    }
                    if (kfiVar != null) {
                        super.i(kfiVar);
                        return new kgf(this, 2);
                    }
                }
            }
            return null;
        } finally {
            this.h.f(a);
        }
    }

    @Override // defpackage.kgh
    protected final void c() {
        int i = 0;
        while (true) {
            jxb[] jxbVarArr = this.i;
            if (i >= jxbVarArr.length) {
                return;
            }
            jxb jxbVar = jxbVarArr[i];
            i++;
        }
    }

    @Override // defpackage.kgh, defpackage.kfg
    public final void m(khi khiVar) {
        if (this.a.a.f()) {
            khiVar.a("wait_for_ready");
            kbq kbqVar = this.b;
            if (kbqVar != null && !kbqVar.g()) {
                khiVar.b("Last Pick Failure", kbqVar);
            }
        }
        super.m(khiVar);
    }

    @Override // defpackage.kgh, defpackage.kfg
    public final void n(kbq kbqVar) {
        super.n(kbqVar);
        kge kgeVar = this.c;
        synchronized (kgeVar.a) {
            if (kgeVar.e != null) {
                boolean remove = kgeVar.g.remove(this);
                if (!kgeVar.f() && remove) {
                    kbw kbwVar = kgeVar.b;
                    kbwVar.b(kgeVar.d);
                    if (kgeVar.h.b != null) {
                        kbwVar.b(kgeVar.e);
                        kgeVar.e = null;
                    }
                }
            }
        }
        this.c.b.a();
    }
}
