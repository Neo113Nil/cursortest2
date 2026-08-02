package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afb extends afc {
    public final ov i;

    public afb(Object obj) {
        super(obj);
        this.i = new ov();
    }

    @Override // defpackage.aez
    protected void f() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((afa) ((or) ((ot) it).next()).b).b();
        }
    }

    @Override // defpackage.aez
    protected void g() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            afa afaVar = (afa) ((or) ((ot) it).next()).b;
            afaVar.a.h(afaVar);
        }
    }
}
