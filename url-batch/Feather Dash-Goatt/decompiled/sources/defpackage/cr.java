package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class cr implements gr {
    public final /* synthetic */ int d;
    public final /* synthetic */ fr e;
    public final /* synthetic */ Runnable g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ TimeUnit j;

    public /* synthetic */ cr(fr frVar, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.d = i;
        this.e = frVar;
        this.g = runnable;
        this.h = j;
        this.i = j2;
        this.j = timeUnit;
    }

    @Override // defpackage.gr
    public final ScheduledFuture a(s40 s40Var) {
        int i = this.d;
        Runnable runnable = this.g;
        fr frVar = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return frVar.e.scheduleAtFixedRate(new dr(frVar, runnable, s40Var, 0), this.h, this.i, this.j);
            default:
                return frVar.e.scheduleWithFixedDelay(new dr(frVar, runnable, s40Var, 2), this.h, this.i, this.j);
        }
    }
}
