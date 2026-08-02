package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gmc extends jqy {
    public gmc(Object obj, jpu jpuVar) {
        super(obj, jpuVar);
    }

    @Override // defpackage.jqy
    protected final bnh a() {
        gty aC = hoq.aC(197, "Scr#Comp");
        try {
            bnh a = super.a();
            aC.close();
            return a;
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
