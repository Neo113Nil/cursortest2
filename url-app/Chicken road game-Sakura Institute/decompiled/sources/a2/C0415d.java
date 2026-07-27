package a2;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import w2.C1294c;

/* renamed from: a2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0415d implements InterfaceC0419h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorServiceC0418g f4920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f4921c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f4922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f4923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f4924f;

    public /* synthetic */ C0415d(ScheduledExecutorServiceC0418g scheduledExecutorServiceC0418g, Runnable runnable, long j4, long j5, TimeUnit timeUnit, int i2) {
        this.f4919a = i2;
        this.f4920b = scheduledExecutorServiceC0418g;
        this.f4921c = runnable;
        this.f4922d = j4;
        this.f4923e = j5;
        this.f4924f = timeUnit;
    }

    @Override // a2.InterfaceC0419h
    public final ScheduledFuture a(C1294c c1294c) {
        switch (this.f4919a) {
            case 0:
                ScheduledExecutorServiceC0418g scheduledExecutorServiceC0418g = this.f4920b;
                scheduledExecutorServiceC0418g.getClass();
                return scheduledExecutorServiceC0418g.f4933e.scheduleAtFixedRate(new RunnableC0416e(scheduledExecutorServiceC0418g, this.f4921c, c1294c, 0), this.f4922d, this.f4923e, this.f4924f);
            default:
                ScheduledExecutorServiceC0418g scheduledExecutorServiceC0418g2 = this.f4920b;
                scheduledExecutorServiceC0418g2.getClass();
                return scheduledExecutorServiceC0418g2.f4933e.scheduleWithFixedDelay(new RunnableC0416e(scheduledExecutorServiceC0418g2, this.f4921c, c1294c, 2), this.f4922d, this.f4923e, this.f4924f);
        }
    }
}
