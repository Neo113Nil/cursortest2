package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gmd extends jrc {
    @Override // defpackage.jrc, defpackage.jrq
    public final /* bridge */ /* synthetic */ Object C() {
        return C();
    }

    @Override // defpackage.jrc
    /* renamed from: a */
    public final jpy C() {
        if (!gta.u()) {
            return super.C();
        }
        gty aC = hoq.aC(198, "ScrRet#Comp");
        try {
            jpy C = super.C();
            aC.close();
            return C;
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
