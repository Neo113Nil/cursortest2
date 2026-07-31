package q1;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements f {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5762f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f5763g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Runnable f5764h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f5765i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f5766j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f5767k;

    public /* synthetic */ c(e eVar, Runnable runnable, long j4, long j7, TimeUnit timeUnit, int i7) {
        this.f5762f = i7;
        this.f5763g = eVar;
        this.f5764h = runnable;
        this.f5765i = j4;
        this.f5766j = j7;
        this.f5767k = timeUnit;
    }

    @Override // q1.f
    public final ScheduledFuture a(a6.d dVar) {
        switch (this.f5762f) {
            case 0:
                e eVar = this.f5763g;
                return eVar.f5773g.scheduleAtFixedRate(new d(eVar, this.f5764h, dVar, 0), this.f5765i, this.f5766j, this.f5767k);
            default:
                e eVar2 = this.f5763g;
                return eVar2.f5773g.scheduleWithFixedDelay(new d(eVar2, this.f5764h, dVar, 2), this.f5765i, this.f5766j, this.f5767k);
        }
    }
}
