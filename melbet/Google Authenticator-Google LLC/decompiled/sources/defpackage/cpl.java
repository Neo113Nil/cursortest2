package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cpl implements cpj {
    final /* synthetic */ cpo a;

    public cpl(cpo cpoVar) {
        this.a = cpoVar;
    }

    @Override // defpackage.cpj
    public final void a(clg clgVar) {
        boolean c = clgVar.c();
        cpo cpoVar = this.a;
        if (c) {
            cpoVar.r(null, ((cqd) cpoVar).u);
            return;
        }
        kee keeVar = cpoVar.r;
        if (keeVar != null) {
            keeVar.u(clgVar);
        }
    }
}
