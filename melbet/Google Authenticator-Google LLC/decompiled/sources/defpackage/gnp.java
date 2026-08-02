package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gnp {
    public static final hkh a = hkh.l("com/google/apps/tiktok/monitoring/checkbox/TikTokCheckboxCheckerImpl");
    public final AtomicReference b = new AtomicReference(null);
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final ddw d;

    public gnp(ddw ddwVar) {
        this.d = ddwVar;
    }

    public final hvi a() {
        if (!this.c.getAndSet(true)) {
            this.d.b(new gno(this, 0));
        }
        Boolean bool = (Boolean) this.b.get();
        if (bool != null) {
            return hnu.aJ(bool);
        }
        hvc v = hvc.v(dih.d(this.d.a()));
        gzf a2 = gvx.a(new gia(this, 16));
        huf hufVar = huf.a;
        return hso.f(hti.f(v, a2, hufVar), Throwable.class, new gia(this, 17), hufVar);
    }
}
