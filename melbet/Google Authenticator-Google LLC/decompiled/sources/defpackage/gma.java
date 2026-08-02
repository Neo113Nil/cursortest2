package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gma extends gmk {
    private final bd a;

    public gma(bd bdVar) {
        super(bdVar);
        this.a = bdVar;
    }

    @Override // defpackage.gmk
    protected final Object a() {
        gty aA = hoq.aA(195, this.a.getClass(), "TTFACM#Component");
        try {
            Object a = super.a();
            aA.close();
            return a;
        } catch (Throwable th) {
            try {
                aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gmk
    protected final void b(bd bdVar) {
        super.b(bdVar);
        Class<?> cls = bdVar.getClass();
        bg D = bdVar.D();
        cls.getSimpleName();
        D.getClass();
        hoq.M(bdVar.D() instanceof glp, "TikTok Fragment, %s cannot be attached to a non-TikTok Activity, %s", bdVar.getClass().getSimpleName(), bdVar.D().getClass().getSimpleName());
    }
}
