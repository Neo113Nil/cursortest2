package w5;

import a1.n;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import d6.l;
import t5.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10105d;

    /* renamed from: e, reason: collision with root package name */
    public final i f10106e;

    public /* synthetic */ h(i iVar, int i3) {
        this.f10105d = i3;
        this.f10106e = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f6.b bVar;
        h hVar;
        boolean isEmpty;
        boolean isEmpty2;
        switch (this.f10105d) {
            case 0:
                synchronized (this.f10106e.f10114u) {
                    i iVar = this.f10106e;
                    iVar.f10115v = (Intent) iVar.f10114u.get(0);
                }
                Intent intent = this.f10106e.f10115v;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f10106e.f10115v.getIntExtra("KEY_START_ID", 0);
                    o d10 = o.d();
                    String str = i.f10107x;
                    d10.a(str, "Processing command " + this.f10106e.f10115v + ", " + intExtra);
                    PowerManager.WakeLock a9 = d6.o.a(this.f10106e.f10108d, action + " (" + intExtra + ")");
                    try {
                        o.d().a(str, "Acquiring operation wake lock (" + action + ") " + a9);
                        a9.acquire();
                        i iVar2 = this.f10106e;
                        iVar2.f10113t.a(iVar2.f10115v, intExtra, iVar2);
                        o.d().a(str, "Releasing operation wake lock (" + action + ") " + a9);
                        a9.release();
                        i iVar3 = this.f10106e;
                        bVar = (f6.b) ((n) iVar3.f10109e).f42r;
                        hVar = new h(iVar3, 1);
                    } catch (Throwable th) {
                        try {
                            o d11 = o.d();
                            String str2 = i.f10107x;
                            d11.c(str2, "Unexpected error in onHandleIntent", th);
                            o.d().a(str2, "Releasing operation wake lock (" + action + ") " + a9);
                            a9.release();
                            i iVar4 = this.f10106e;
                            bVar = (f6.b) ((n) iVar4.f10109e).f42r;
                            hVar = new h(iVar4, 1);
                        } catch (Throwable th2) {
                            o.d().a(i.f10107x, "Releasing operation wake lock (" + action + ") " + a9);
                            a9.release();
                            i iVar5 = this.f10106e;
                            ((f6.b) ((n) iVar5.f10109e).f42r).execute(new h(iVar5, 1));
                            throw th2;
                        }
                    }
                    bVar.execute(hVar);
                    return;
                }
                return;
            default:
                i iVar6 = this.f10106e;
                o d12 = o.d();
                String str3 = i.f10107x;
                d12.a(str3, "Checking if commands are complete.");
                i.b();
                synchronized (iVar6.f10114u) {
                    try {
                        if (iVar6.f10115v != null) {
                            o.d().a(str3, "Removing command " + iVar6.f10115v);
                            if (!((Intent) iVar6.f10114u.remove(0)).equals(iVar6.f10115v)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            iVar6.f10115v = null;
                        }
                        l lVar = (l) ((n) iVar6.f10109e).f41i;
                        c cVar = iVar6.f10113t;
                        synchronized (cVar.f10085i) {
                            isEmpty = cVar.f10084e.isEmpty();
                        }
                        if (isEmpty && iVar6.f10114u.isEmpty()) {
                            synchronized (lVar.f3642s) {
                                isEmpty2 = lVar.f3640i.isEmpty();
                            }
                            if (isEmpty2) {
                                o.d().a(str3, "No more commands & intents.");
                                SystemAlarmService systemAlarmService = iVar6.f10116w;
                                if (systemAlarmService != null) {
                                    systemAlarmService.c();
                                }
                            }
                        }
                        if (!iVar6.f10114u.isEmpty()) {
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
