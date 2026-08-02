package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gos extends jya {
    final gvz a;
    final String b;

    public gos(iws iwsVar, String str, gvz gvzVar) {
        super(iwsVar);
        this.b = str;
        this.a = gvzVar;
    }

    @Override // defpackage.jyb, defpackage.iws
    public final void a(iwr iwrVar, kaa kaaVar) {
        gvz.d(this.a, new gbm(this, iwrVar, kaaVar, 8)).run();
    }

    public final /* synthetic */ void b(iwr iwrVar, kaa kaaVar) {
        gty aC = hoq.aC(205, this.b);
        try {
            hvw hvwVar = new hvw();
            aC.b(hvwVar);
            super.a(new got(iwrVar, hvwVar), kaaVar);
            aC.close();
        } catch (Throwable th) {
            try {
                aC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
