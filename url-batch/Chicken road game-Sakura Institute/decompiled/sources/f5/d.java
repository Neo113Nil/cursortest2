package f5;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f3378b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f3379c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f3380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f3381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f3382f;

    public /* synthetic */ d(g gVar, Runnable runnable, long j8, long j9, TimeUnit timeUnit, int i7) {
        this.f3377a = i7;
        this.f3378b = gVar;
        this.f3379c = runnable;
        this.f3380d = j8;
        this.f3381e = j9;
        this.f3382f = timeUnit;
    }

    @Override // f5.h
    public final ScheduledFuture a(b6.c cVar) {
        switch (this.f3377a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g gVar = this.f3378b;
                return gVar.f3391g.scheduleAtFixedRate(new e(gVar, this.f3379c, cVar, 0), this.f3380d, this.f3381e, this.f3382f);
            default:
                g gVar2 = this.f3378b;
                return gVar2.f3391g.scheduleWithFixedDelay(new e(gVar2, this.f3379c, cVar, 2), this.f3380d, this.f3381e, this.f3382f);
        }
    }
}
