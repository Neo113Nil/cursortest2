package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class goh {
    public final fee a;
    private final fed f;
    private final hac g = hoq.v(new ewf(this, 14));
    private final hac h = hoq.v(new ewf(this, 15));
    public final hac b = hoq.v(new ewf(this, 16));
    public final hac c = hoq.v(new ewf(this, 17));
    private final hac i = hoq.v(new ewf(this, 18));
    public final hac d = hoq.v(new ewf(this, 19));
    public final hac e = hoq.v(new ewf(this, 20));

    public goh(ScheduledExecutorService scheduledExecutorService, iyi iyiVar, Application application) {
        fee d = fee.d("tiktok");
        this.a = d;
        fed fedVar = d.c;
        if (fedVar == null) {
            this.f = feg.c(iyiVar, scheduledExecutorService, d, application);
        } else {
            this.f = fedVar;
            ((feg) fedVar).f = iyiVar;
        }
    }

    public final void a(String str, String str2, String str3) {
        ((fea) this.i.bB()).b(str, str2, str3);
    }

    public final void b(String str, String str2, String str3, String str4) {
        ((fea) this.g.bB()).b(str, str2, str3, str4);
    }

    public final void c(double d, String str, String str2, String str3, String str4) {
        ((fdx) this.h.bB()).b(d, str, str2, str3, str4);
    }
}
