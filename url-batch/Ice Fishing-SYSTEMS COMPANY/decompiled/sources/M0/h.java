package M0;

import J0.s;
import N2.A;
import T0.l;
import T0.n;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1859n;

    /* renamed from: u, reason: collision with root package name */
    public final j f1860u;

    public /* synthetic */ h(j jVar, int i) {
        this.f1859n = i;
        this.f1860u = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A a9;
        h hVar;
        boolean isEmpty;
        boolean isEmpty2;
        switch (this.f1859n) {
            case 0:
                synchronized (this.f1860u.f1874z) {
                    j jVar = this.f1860u;
                    jVar.f1866A = (Intent) jVar.f1874z.get(0);
                }
                Intent intent = this.f1860u.f1866A;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f1860u.f1866A.getIntExtra("KEY_START_ID", 0);
                    s d2 = s.d();
                    String str = j.f1865C;
                    d2.a(str, "Processing command " + this.f1860u.f1866A + ", " + intExtra);
                    PowerManager.WakeLock a10 = n.a(this.f1860u.f1868n, action + " (" + intExtra + ")");
                    try {
                        s.d().a(str, "Acquiring operation wake lock (" + action + ") " + a10);
                        a10.acquire();
                        j jVar2 = this.f1860u;
                        jVar2.f1873y.a(jVar2.f1866A, intExtra, jVar2);
                        s.d().a(str, "Releasing operation wake lock (" + action + ") " + a10);
                        a10.release();
                        j jVar3 = this.f1860u;
                        a9 = (A) jVar3.f1869u.f3965w;
                        hVar = new h(jVar3, 1);
                    } catch (Throwable th) {
                        try {
                            s d3 = s.d();
                            String str2 = j.f1865C;
                            d3.c(str2, "Unexpected error in onHandleIntent", th);
                            s.d().a(str2, "Releasing operation wake lock (" + action + ") " + a10);
                            a10.release();
                            j jVar4 = this.f1860u;
                            a9 = (A) jVar4.f1869u.f3965w;
                            hVar = new h(jVar4, 1);
                        } catch (Throwable th2) {
                            s.d().a(j.f1865C, "Releasing operation wake lock (" + action + ") " + a10);
                            a10.release();
                            j jVar5 = this.f1860u;
                            ((A) jVar5.f1869u.f3965w).execute(new h(jVar5, 1));
                            throw th2;
                        }
                    }
                    a9.execute(hVar);
                    return;
                }
                return;
            default:
                j jVar6 = this.f1860u;
                jVar6.getClass();
                s d9 = s.d();
                String str3 = j.f1865C;
                d9.a(str3, "Checking if commands are complete.");
                j.c();
                synchronized (jVar6.f1874z) {
                    try {
                        if (jVar6.f1866A != null) {
                            s.d().a(str3, "Removing command " + jVar6.f1866A);
                            if (!((Intent) jVar6.f1874z.remove(0)).equals(jVar6.f1866A)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            jVar6.f1866A = null;
                        }
                        l lVar = (l) jVar6.f1869u.f3963u;
                        c cVar = jVar6.f1873y;
                        synchronized (cVar.f1837v) {
                            isEmpty = cVar.f1836u.isEmpty();
                        }
                        if (isEmpty && jVar6.f1874z.isEmpty()) {
                            synchronized (lVar.f3054u) {
                                isEmpty2 = lVar.f3055v.isEmpty();
                            }
                            if (isEmpty2) {
                                s.d().a(str3, "No more commands & intents.");
                                SystemAlarmService systemAlarmService = jVar6.f1867B;
                                if (systemAlarmService != null) {
                                    systemAlarmService.a();
                                }
                            }
                        }
                        if (!jVar6.f1874z.isEmpty()) {
                            jVar6.d();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }
}
