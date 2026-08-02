package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bws implements Callable {
    private final /* synthetic */ int a;

    public /* synthetic */ bws(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 9:
                iwq iwqVar = gjw.m;
                break;
            case 10:
                iwq iwqVar2 = gjw.m;
                break;
            case 15:
                ((hkf) ((hkf) grg.a.e()).i("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerOneTimeScheduler", "scheduleNextSyncSystemWakeup", 113, "SyncWorkManagerOneTimeScheduler.java")).s("Successfully scheduled next onetime workers");
                break;
            case 16:
                ((hkf) ((hkf) gri.a.e()).i("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler", "scheduleNextSyncSystemWakeup", 124, "SyncWorkManagerPeriodicScheduler.java")).s("Successfully scheduled next periodic workers");
                break;
            case 17:
                hkh hkhVar = gri.a;
                break;
        }
        return null;
    }
}
