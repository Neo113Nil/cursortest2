package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gmz extends ikg {
    private final jpt b;

    public gmz(jpt jptVar) {
        super(null, null);
        this.b = jptVar;
    }

    @Override // defpackage.ikg
    public final gzp a(hlu hluVar) {
        gzp a = super.a(hluVar);
        if (a.f()) {
            return a;
        }
        jpt jptVar = this.b;
        gzp g = gzp.g((frv) ign.a(hluVar, gmy.a));
        if (!g.f()) {
            gtz aY = hoq.aY(frw.a);
            if (aY.b()) {
                g = gzp.h((frv) aY.a());
            }
        }
        return g.f() ? gzp.h(((fwm) jptVar.b()).c((frv) g.b())) : gyf.a;
    }
}
