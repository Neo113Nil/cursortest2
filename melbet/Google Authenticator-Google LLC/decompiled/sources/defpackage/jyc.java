package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyc extends ixe {
    public final kly a;
    public final kcn b;
    public boolean c;

    public jyc(kca kcaVar, kcd kcdVar) {
        kcn kcnVar = new kcn();
        this.b = kcnVar;
        kcnVar.a = kcaVar;
        kly klyVar = new kly(new khq(this, kcdVar));
        this.a = klyVar;
        klyVar.m = false;
        klyVar.p = false;
    }

    @Override // defpackage.ixe
    public final void a(kbi kbiVar) {
        List list = this.a.e;
        kbiVar.getClass();
        list.add(kbiVar);
    }

    public final String toString() {
        kly klyVar = this.a;
        gzo T = hoq.T(this);
        T.b("delegate", klyVar);
        return T.toString();
    }
}
