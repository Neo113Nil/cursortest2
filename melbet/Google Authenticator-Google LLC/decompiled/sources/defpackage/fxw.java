package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fxw implements fth, fti {
    private static final Duration a = Duration.ofDays(1);
    private final boolean b;
    private final iyi c;

    public fxw(iyi iyiVar, gzp gzpVar) {
        this.c = iyiVar;
        this.b = ((Boolean) gzpVar.d(false)).booleanValue();
    }

    @Override // defpackage.fth, defpackage.ftg
    public final hvi a(ftk ftkVar) {
        boolean z = this.b;
        iyi iyiVar = this.c;
        if (!z) {
            geh gehVar = geh.SAME_DAY;
            gty aC = hoq.aC(106, "AutoSelect Account Legacy");
            try {
                hvi f = hti.f(((cbp) iyiVar.a).e(((fug) iyiVar.b).a(), gehVar), gvx.a(new fxn(2)), huf.a);
                aC.b(f);
                aC.close();
                return f;
            } catch (Throwable th) {
                try {
                    aC.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        Duration duration = a;
        gty aC2 = hoq.aC(107, "AutoSelect Account New");
        try {
            Object obj = iyiVar.b;
            boolean z2 = true;
            hoq.y(!duration.isNegative(), "maxAge cannot be negative");
            if (!duration.equals(fuj.a) && duration.compareTo(fuj.c) > 0) {
                z2 = false;
            }
            hoq.y(z2, "Instead of a custom long Duration, use AccountDataService#DONT_CARE");
            Instant now = Instant.now();
            hvi ap = hoq.ap(((fuj) obj).f(duration, now), fui.class, new bpp(obj, duration, now, 11), ((fuj) obj).e);
            dkp dkpVar = new dkp(4);
            huf hufVar = huf.a;
            hnu.aS(ap, dkpVar, hufVar);
            hvi f2 = hti.f(ap, gvx.a(new fxn(2)), hufVar);
            aC2.b(f2);
            aC2.close();
            return f2;
        } catch (Throwable th3) {
            try {
                aC2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.fth
    public final /* synthetic */ hvi b(frv frvVar) {
        return ((fwm) this.c.c).e(frvVar);
    }
}
