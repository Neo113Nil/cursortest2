package o0;

import D0.q;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import v0.k;
import v0.m;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5592f;

    /* renamed from: g, reason: collision with root package name */
    public final i f5593g;

    public /* synthetic */ h(i iVar, int i7) {
        this.f5592f = i7;
        this.f5593g = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar;
        h hVar;
        boolean isEmpty;
        boolean isEmpty2;
        switch (this.f5592f) {
            case 0:
                synchronized (this.f5593g.f5601l) {
                    i iVar = this.f5593g;
                    iVar.f5602m = (Intent) iVar.f5601l.get(0);
                }
                Intent intent = this.f5593g.f5602m;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f5593g.f5602m.getIntExtra("KEY_START_ID", 0);
                    l0.q d7 = l0.q.d();
                    String str = i.f5594o;
                    d7.a(str, "Processing command " + this.f5593g.f5602m + ", " + intExtra);
                    PowerManager.WakeLock a7 = m.a(this.f5593g.f5595f, action + " (" + intExtra + ")");
                    try {
                        l0.q.d().a(str, "Acquiring operation wake lock (" + action + ") " + a7);
                        a7.acquire();
                        i iVar2 = this.f5593g;
                        iVar2.f5600k.a(iVar2.f5602m, intExtra, iVar2);
                        l0.q.d().a(str, "Releasing operation wake lock (" + action + ") " + a7);
                        a7.release();
                        i iVar3 = this.f5593g;
                        qVar = (q) ((B0.c) iVar3.f5596g).f71g;
                        hVar = new h(iVar3, 1);
                    } catch (Throwable th) {
                        try {
                            l0.q d8 = l0.q.d();
                            String str2 = i.f5594o;
                            d8.c(str2, "Unexpected error in onHandleIntent", th);
                            l0.q.d().a(str2, "Releasing operation wake lock (" + action + ") " + a7);
                            a7.release();
                            i iVar4 = this.f5593g;
                            qVar = (q) ((B0.c) iVar4.f5596g).f71g;
                            hVar = new h(iVar4, 1);
                        } catch (Throwable th2) {
                            l0.q.d().a(i.f5594o, "Releasing operation wake lock (" + action + ") " + a7);
                            a7.release();
                            i iVar5 = this.f5593g;
                            ((q) ((B0.c) iVar5.f5596g).f71g).execute(new h(iVar5, 1));
                            throw th2;
                        }
                    }
                    qVar.execute(hVar);
                    return;
                }
                return;
            default:
                i iVar6 = this.f5593g;
                l0.q d9 = l0.q.d();
                String str3 = i.f5594o;
                d9.a(str3, "Checking if commands are complete.");
                i.b();
                synchronized (iVar6.f5601l) {
                    try {
                        if (iVar6.f5602m != null) {
                            l0.q.d().a(str3, "Removing command " + iVar6.f5602m);
                            if (!((Intent) iVar6.f5601l.remove(0)).equals(iVar6.f5602m)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            iVar6.f5602m = null;
                        }
                        k kVar = (k) ((B0.c) iVar6.f5596g).f72h;
                        c cVar = iVar6.f5600k;
                        synchronized (cVar.f5571h) {
                            isEmpty = cVar.f5570g.isEmpty();
                        }
                        if (isEmpty && iVar6.f5601l.isEmpty()) {
                            synchronized (kVar.f6073i) {
                                isEmpty2 = kVar.f6070f.isEmpty();
                            }
                            if (isEmpty2) {
                                l0.q.d().a(str3, "No more commands & intents.");
                                SystemAlarmService systemAlarmService = iVar6.f5603n;
                                if (systemAlarmService != null) {
                                    systemAlarmService.a();
                                }
                            }
                        }
                        if (!iVar6.f5601l.isEmpty()) {
                            iVar6.c();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }
}
