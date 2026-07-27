package a2;

import w2.C1294c;

/* renamed from: a2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0416e implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorServiceC0418g f4926e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Runnable f4927i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1294c f4928j;

    public /* synthetic */ RunnableC0416e(ScheduledExecutorServiceC0418g scheduledExecutorServiceC0418g, Runnable runnable, C1294c c1294c, int i2) {
        this.f4925d = i2;
        this.f4926e = scheduledExecutorServiceC0418g;
        this.f4927i = runnable;
        this.f4928j = c1294c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4925d) {
            case 0:
                ScheduledExecutorServiceC0418g scheduledExecutorServiceC0418g = this.f4926e;
                scheduledExecutorServiceC0418g.getClass();
                final C1294c c1294c = this.f4928j;
                final Runnable runnable = this.f4927i;
                final int i2 = 0;
                scheduledExecutorServiceC0418g.f4932d.execute(new Runnable() { // from class: a2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e4) {
                                    c1294c.o(e4);
                                    throw e4;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e5) {
                                    c1294c.o(e5);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                C1294c c1294c2 = c1294c;
                                try {
                                    runnable2.run();
                                    ScheduledFutureC0420i scheduledFutureC0420i = (ScheduledFutureC0420i) c1294c2.f11388d;
                                    scheduledFutureC0420i.getClass();
                                    if (Q0.h.f3934l.p(scheduledFutureC0420i, null, Q0.h.f3935m)) {
                                        Q0.h.e(scheduledFutureC0420i);
                                        return;
                                    }
                                    return;
                                } catch (Exception e6) {
                                    c1294c2.o(e6);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ScheduledExecutorServiceC0418g scheduledExecutorServiceC0418g2 = this.f4926e;
                scheduledExecutorServiceC0418g2.getClass();
                final C1294c c1294c2 = this.f4928j;
                final Runnable runnable2 = this.f4927i;
                final int i4 = 2;
                scheduledExecutorServiceC0418g2.f4932d.execute(new Runnable() { // from class: a2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e4) {
                                    c1294c2.o(e4);
                                    throw e4;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e5) {
                                    c1294c2.o(e5);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                C1294c c1294c22 = c1294c2;
                                try {
                                    runnable22.run();
                                    ScheduledFutureC0420i scheduledFutureC0420i = (ScheduledFutureC0420i) c1294c22.f11388d;
                                    scheduledFutureC0420i.getClass();
                                    if (Q0.h.f3934l.p(scheduledFutureC0420i, null, Q0.h.f3935m)) {
                                        Q0.h.e(scheduledFutureC0420i);
                                        return;
                                    }
                                    return;
                                } catch (Exception e6) {
                                    c1294c22.o(e6);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ScheduledExecutorServiceC0418g scheduledExecutorServiceC0418g3 = this.f4926e;
                scheduledExecutorServiceC0418g3.getClass();
                final C1294c c1294c3 = this.f4928j;
                final Runnable runnable3 = this.f4927i;
                final int i5 = 1;
                scheduledExecutorServiceC0418g3.f4932d.execute(new Runnable() { // from class: a2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e4) {
                                    c1294c3.o(e4);
                                    throw e4;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e5) {
                                    c1294c3.o(e5);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                C1294c c1294c22 = c1294c3;
                                try {
                                    runnable22.run();
                                    ScheduledFutureC0420i scheduledFutureC0420i = (ScheduledFutureC0420i) c1294c22.f11388d;
                                    scheduledFutureC0420i.getClass();
                                    if (Q0.h.f3934l.p(scheduledFutureC0420i, null, Q0.h.f3935m)) {
                                        Q0.h.e(scheduledFutureC0420i);
                                        return;
                                    }
                                    return;
                                } catch (Exception e6) {
                                    c1294c22.o(e6);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
