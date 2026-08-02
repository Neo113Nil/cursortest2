package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class efn {
    public final fee a;
    public final hac b;
    public final hac c = hoq.v(new cud(this, 19));
    public final hac d = hoq.v(new efm(this, 0));
    public final hac e;
    public final hac f;
    public final hac g;
    public final hac h;
    public final hac i;
    public final hac j;
    public final hac k;
    private final fed l;

    public efn(ScheduledExecutorService scheduledExecutorService, iyi iyiVar, Application application) {
        int i = 17;
        this.b = hoq.v(new cud(this, i));
        hoq.v(new efm(this, 2));
        hoq.v(new efm(this, 3));
        this.e = hoq.v(new efm(this, 4));
        this.f = hoq.v(new efm(this, 5));
        this.g = hoq.v(new efm(this, 6));
        this.h = hoq.v(new efm(this, 8));
        hoq.v(new efm(this, 9));
        hoq.v(new efm(this, 7));
        hoq.v(new efm(this, 10));
        hoq.v(new efm(this, 11));
        hoq.v(new efm(this, 12));
        hoq.v(new efm(this, 13));
        this.i = hoq.v(new efm(this, 14));
        hoq.v(new efm(this, 15));
        this.j = hoq.v(new efm(this, 16));
        this.k = hoq.v(new efm(this, i));
        hoq.v(new cud(this, 18));
        hoq.v(new cud(this, 20));
        hoq.v(new efm(this, 1));
        fee d = fee.d("STREAMZ_ONEGOOGLE_ANDROID");
        this.a = d;
        fed fedVar = d.c;
        if (fedVar == null) {
            this.l = feg.c(iyiVar, scheduledExecutorService, d, application);
        } else {
            this.l = fedVar;
            ((feg) fedVar).f = iyiVar;
        }
    }
}
