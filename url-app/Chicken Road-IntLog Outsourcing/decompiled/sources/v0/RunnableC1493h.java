package v0;

import C0.n;
import C0.q;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import s0.s;

/* renamed from: v0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1493h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12081a;

    /* renamed from: b, reason: collision with root package name */
    public final C1494i f12082b;

    public /* synthetic */ RunnableC1493h(C1494i c1494i, int i2) {
        this.f12081a = i2;
        this.f12082b = c1494i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A.c cVar;
        RunnableC1493h runnableC1493h;
        boolean isEmpty;
        boolean isEmpty2;
        switch (this.f12081a) {
            case 0:
                synchronized (this.f12082b.f12090g) {
                    C1494i c1494i = this.f12082b;
                    c1494i.f12091h = (Intent) c1494i.f12090g.get(0);
                }
                Intent intent = this.f12082b.f12091h;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f12082b.f12091h.getIntExtra("KEY_START_ID", 0);
                    s d6 = s.d();
                    String str = C1494i.f12083j;
                    d6.a(str, "Processing command " + this.f12082b.f12091h + ", " + intExtra);
                    PowerManager.WakeLock a6 = q.a(this.f12082b.f12084a, action + " (" + intExtra + ")");
                    try {
                        s.d().a(str, "Acquiring operation wake lock (" + action + ") " + a6);
                        a6.acquire();
                        C1494i c1494i2 = this.f12082b;
                        c1494i2.f12089f.a(intExtra, c1494i2.f12091h, c1494i2);
                        s.d().a(str, "Releasing operation wake lock (" + action + ") " + a6);
                        a6.release();
                        C1494i c1494i3 = this.f12082b;
                        cVar = (A.c) c1494i3.f12085b.f313d;
                        runnableC1493h = new RunnableC1493h(c1494i3, 1);
                    } catch (Throwable th) {
                        try {
                            s d7 = s.d();
                            String str2 = C1494i.f12083j;
                            d7.c(str2, "Unexpected error in onHandleIntent", th);
                            s.d().a(str2, "Releasing operation wake lock (" + action + ") " + a6);
                            a6.release();
                            C1494i c1494i4 = this.f12082b;
                            cVar = (A.c) c1494i4.f12085b.f313d;
                            runnableC1493h = new RunnableC1493h(c1494i4, 1);
                        } catch (Throwable th2) {
                            s.d().a(C1494i.f12083j, "Releasing operation wake lock (" + action + ") " + a6);
                            a6.release();
                            C1494i c1494i5 = this.f12082b;
                            ((A.c) c1494i5.f12085b.f313d).execute(new RunnableC1493h(c1494i5, 1));
                            throw th2;
                        }
                    }
                    cVar.execute(runnableC1493h);
                    return;
                }
                return;
            default:
                C1494i c1494i6 = this.f12082b;
                c1494i6.getClass();
                s d8 = s.d();
                String str3 = C1494i.f12083j;
                d8.a(str3, "Checking if commands are complete.");
                C1494i.b();
                synchronized (c1494i6.f12090g) {
                    try {
                        if (c1494i6.f12091h != null) {
                            s.d().a(str3, "Removing command " + c1494i6.f12091h);
                            if (!((Intent) c1494i6.f12090g.remove(0)).equals(c1494i6.f12091h)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            c1494i6.f12091h = null;
                        }
                        n nVar = (n) c1494i6.f12085b.f311b;
                        C1488c c1488c = c1494i6.f12089f;
                        synchronized (c1488c.f12059c) {
                            isEmpty = c1488c.f12058b.isEmpty();
                        }
                        if (isEmpty && c1494i6.f12090g.isEmpty()) {
                            synchronized (nVar.f346d) {
                                isEmpty2 = nVar.f343a.isEmpty();
                            }
                            if (isEmpty2) {
                                s.d().a(str3, "No more commands & intents.");
                                SystemAlarmService systemAlarmService = c1494i6.f12092i;
                                if (systemAlarmService != null) {
                                    systemAlarmService.a();
                                }
                            }
                        }
                        if (!c1494i6.f12090g.isEmpty()) {
                            c1494i6.c();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }
}
