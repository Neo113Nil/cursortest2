package J0;

import G0.s;
import K1.o;
import Q0.m;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1344d;

    /* renamed from: e, reason: collision with root package name */
    public final j f1345e;

    public /* synthetic */ h(j jVar, int i2) {
        this.f1344d = i2;
        this.f1345e = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar;
        h hVar;
        boolean isEmpty;
        boolean isEmpty2;
        switch (this.f1344d) {
            case 0:
                synchronized (this.f1345e.f1357o) {
                    j jVar = this.f1345e;
                    jVar.f1358p = (Intent) jVar.f1357o.get(0);
                }
                Intent intent = this.f1345e.f1358p;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f1345e.f1358p.getIntExtra("KEY_START_ID", 0);
                    s d7 = s.d();
                    String str = j.f1350r;
                    d7.a(str, "Processing command " + this.f1345e.f1358p + ", " + intExtra);
                    PowerManager.WakeLock a7 = Q0.o.a(this.f1345e.f1351d, action + " (" + intExtra + ")");
                    try {
                        s.d().a(str, "Acquiring operation wake lock (" + action + ") " + a7);
                        a7.acquire();
                        j jVar2 = this.f1345e;
                        jVar2.f1356n.a(jVar2.f1358p, intExtra, jVar2);
                        s.d().a(str, "Releasing operation wake lock (" + action + ") " + a7);
                        a7.release();
                        j jVar3 = this.f1345e;
                        oVar = (o) ((D0.j) jVar3.f1352e).f332l;
                        hVar = new h(jVar3, 1);
                    } catch (Throwable th) {
                        try {
                            s d8 = s.d();
                            String str2 = j.f1350r;
                            d8.c(str2, "Unexpected error in onHandleIntent", th);
                            s.d().a(str2, "Releasing operation wake lock (" + action + ") " + a7);
                            a7.release();
                            j jVar4 = this.f1345e;
                            oVar = (o) ((D0.j) jVar4.f1352e).f332l;
                            hVar = new h(jVar4, 1);
                        } catch (Throwable th2) {
                            s.d().a(j.f1350r, "Releasing operation wake lock (" + action + ") " + a7);
                            a7.release();
                            j jVar5 = this.f1345e;
                            ((o) ((D0.j) jVar5.f1352e).f332l).execute(new h(jVar5, 1));
                            throw th2;
                        }
                    }
                    oVar.execute(hVar);
                    return;
                }
                return;
            default:
                j jVar6 = this.f1345e;
                s d9 = s.d();
                String str3 = j.f1350r;
                d9.a(str3, "Checking if commands are complete.");
                j.b();
                synchronized (jVar6.f1357o) {
                    try {
                        if (jVar6.f1358p != null) {
                            s.d().a(str3, "Removing command " + jVar6.f1358p);
                            if (!((Intent) jVar6.f1357o.remove(0)).equals(jVar6.f1358p)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            jVar6.f1358p = null;
                        }
                        m mVar = (m) ((D0.j) jVar6.f1352e).f330e;
                        c cVar = jVar6.f1356n;
                        synchronized (cVar.f1323i) {
                            isEmpty = cVar.f1322e.isEmpty();
                        }
                        if (isEmpty && jVar6.f1357o.isEmpty()) {
                            synchronized (mVar.f2311e) {
                                isEmpty2 = mVar.f2312i.isEmpty();
                            }
                            if (isEmpty2) {
                                s.d().a(str3, "No more commands & intents.");
                                SystemAlarmService systemAlarmService = jVar6.f1359q;
                                if (systemAlarmService != null) {
                                    systemAlarmService.a();
                                }
                            }
                        }
                        if (!jVar6.f1357o.isEmpty()) {
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
