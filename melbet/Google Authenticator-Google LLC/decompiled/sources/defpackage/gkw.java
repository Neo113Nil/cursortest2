package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gkw {
    private static final hkh c = hkh.l("com/google/apps/tiktok/inject/account/TikTokActivityAccountRetainedComponentManager");
    public final glu a;
    public final ikj b;

    public gkw(ikj ikjVar, gzp gzpVar, glu gluVar) {
        this.b = ikjVar;
        if (gzpVar.f()) {
            hoq.H(gzpVar.b() instanceof ng);
        }
        this.a = gluVar;
    }

    public final gku a(frv frvVar) {
        try {
            return (gku) new agj(this.a, new gkv(this, frvVar)).c("tt_activity_account_retained:".concat((frvVar == null ? "null" : Integer.valueOf(frvVar.a)).toString()), gku.class);
        } catch (IllegalArgumentException e) {
            glu gluVar = this.a;
            ((hkf) ((hkf) ((hkf) c.f()).h(e)).i("com/google/apps/tiktok/inject/account/TikTokActivityAccountRetainedComponentManager", "getViewModel", 89, "TikTokActivityAccountRetainedComponentManager.java")).w("Failed to get ViewModel for ActivityAccountRetained, fragmentHost: %s, lifecycle: %s", new ekn(gluVar instanceof glu ? gluVar.a.getClass() : gluVar.getClass()), new ekn(gluVar.L().c));
            throw e;
        }
    }

    public final Object b(frv frvVar) {
        Object obj;
        gku a = a(frvVar);
        synchronized (a.e) {
            if (a.f == null) {
                gty aC = hoq.aC(187, "ActAccRet#comp");
                try {
                    bnr k = ((gks) imq.a(a.g.a(a.b), gks.class)).k();
                    k.a = a.a;
                    jpw jpwVar = a.c;
                    jpwVar.getClass();
                    k.b = jpwVar;
                    k.c = a.d;
                    iwm.a(k.a, afr.class);
                    iwm.a(k.b, jpw.class);
                    iwm.a(k.c, jrn.class);
                    a.f = new bmy(k.d, k.e);
                    aC.close();
                } finally {
                }
            }
            obj = a.f;
        }
        return obj;
    }
}
