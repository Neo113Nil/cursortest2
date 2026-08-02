package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lee implements ddc {
    final /* synthetic */ kuv a;

    public lee(kuv kuvVar) {
        this.a = kuvVar;
    }

    @Override // defpackage.ddc
    public final void a(ddi ddiVar) {
        Exception c = ddiVar.c();
        if (c != null) {
            this.a.ca(ixc.X(c));
            return;
        }
        boolean z = ((ddm) ddiVar).c;
        kuv kuvVar = this.a;
        if (z) {
            kuvVar.j(null);
        } else {
            kuvVar.ca(ddiVar.d());
        }
    }
}
