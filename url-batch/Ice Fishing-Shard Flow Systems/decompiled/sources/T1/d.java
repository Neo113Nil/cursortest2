package T1;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f2577e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Runnable f2578i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f2579l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f2580m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f2581n;

    public /* synthetic */ d(f fVar, Runnable runnable, long j, long j7, TimeUnit timeUnit, int i2) {
        this.f2576d = i2;
        this.f2577e = fVar;
        this.f2578i = runnable;
        this.f2579l = j;
        this.f2580m = j7;
        this.f2581n = timeUnit;
    }

    @Override // T1.g
    public final ScheduledFuture a(B.f fVar) {
        switch (this.f2576d) {
            case 0:
                f fVar2 = this.f2577e;
                return fVar2.f2587e.scheduleAtFixedRate(new e(fVar2, this.f2578i, fVar, 0), this.f2579l, this.f2580m, this.f2581n);
            default:
                f fVar3 = this.f2577e;
                return fVar3.f2587e.scheduleWithFixedDelay(new e(fVar3, this.f2578i, fVar, 2), this.f2579l, this.f2580m, this.f2581n);
        }
    }
}
