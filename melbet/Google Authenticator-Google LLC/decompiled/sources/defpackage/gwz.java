package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gwz implements kbi {
    private final gva a;

    public gwz(gva gvaVar) {
        this.a = gvaVar;
    }

    @Override // defpackage.kbi
    public final ixf a(kbg kbgVar, kaa kaaVar, kbh kbhVar) {
        gup e = this.a.e(268, kbgVar.c().b, gub.a);
        try {
            gty aC = hoq.aC(267, kbgVar.c().b);
            try {
                gwx gwxVar = new gwx(kbhVar.a(new gwy(kbgVar, aC), kaaVar), gvz.b());
                aC.close();
                e.close();
                return gwxVar;
            } finally {
            }
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
