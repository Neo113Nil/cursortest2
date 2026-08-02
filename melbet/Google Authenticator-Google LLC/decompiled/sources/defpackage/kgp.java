package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgp extends kjl {
    private boolean b;
    private final kbq c;
    private final kfh d;
    private final jxb[] e;

    public kgp(kbq kbqVar, kfh kfhVar, jxb[] jxbVarArr) {
        hoq.y(!kbqVar.g(), "error must not be OK");
        this.c = kbqVar;
        this.d = kfhVar;
        this.e = jxbVarArr;
    }

    @Override // defpackage.kjl, defpackage.kfg
    public final void m(khi khiVar) {
        khiVar.b("error", this.c);
        khiVar.b("progress", this.d);
    }

    @Override // defpackage.kjl, defpackage.kfg
    public final void t(kfi kfiVar) {
        hoq.I(!this.b, "already started");
        this.b = true;
        int i = 0;
        while (true) {
            jxb[] jxbVarArr = this.e;
            if (i >= jxbVarArr.length) {
                kfiVar.a(this.c, this.d, new kaa());
                return;
            } else {
                jxb jxbVar = jxbVarArr[i];
                i++;
            }
        }
    }

    public kgp(kbq kbqVar, jxb[] jxbVarArr) {
        this(kbqVar, kfh.a, jxbVarArr);
    }
}
