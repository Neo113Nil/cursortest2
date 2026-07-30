package M0;

import J0.s;
import K0.p;
import N2.A;
import S0.l;
import T0.n;
import T0.v;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import g1.C4524d;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements K0.c {

    /* renamed from: C, reason: collision with root package name */
    public static final String f1865C = s.f("SystemAlarmDispatcher");

    /* renamed from: A, reason: collision with root package name */
    public Intent f1866A;

    /* renamed from: B, reason: collision with root package name */
    public SystemAlarmService f1867B;

    /* renamed from: n, reason: collision with root package name */
    public final Context f1868n;

    /* renamed from: u, reason: collision with root package name */
    public final Y2.e f1869u;

    /* renamed from: v, reason: collision with root package name */
    public final v f1870v;

    /* renamed from: w, reason: collision with root package name */
    public final K0.f f1871w;

    /* renamed from: x, reason: collision with root package name */
    public final p f1872x;

    /* renamed from: y, reason: collision with root package name */
    public final c f1873y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f1874z;

    public j(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f1868n = applicationContext;
        this.f1873y = new c(applicationContext, new l(3));
        p b9 = p.b(systemAlarmService);
        this.f1872x = b9;
        this.f1870v = new v((C4524d) b9.f1531b.f1296h);
        K0.f fVar = b9.f1535f;
        this.f1871w = fVar;
        this.f1869u = b9.f1533d;
        fVar.a(this);
        this.f1874z = new ArrayList();
        this.f1866A = null;
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(int i, Intent intent) {
        s d2 = s.d();
        String str = f1865C;
        d2.a(str, "Adding command " + intent + " (" + i + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            s.d().g(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.f1874z) {
                try {
                    Iterator it = this.f1874z.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f1874z) {
            try {
                boolean isEmpty = this.f1874z.isEmpty();
                this.f1874z.add(intent);
                if (isEmpty) {
                    d();
                }
            } finally {
            }
        }
    }

    @Override // K0.c
    public final void b(S0.j jVar, boolean z8) {
        A a9 = (A) this.f1869u.f3965w;
        String str = c.f1834x;
        Intent intent = new Intent(this.f1868n, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z8);
        c.d(intent, jVar);
        a9.execute(new i(0, 0, this, intent));
    }

    public final void d() {
        c();
        PowerManager.WakeLock a9 = n.a(this.f1868n, "ProcessCommand");
        try {
            a9.acquire();
            this.f1872x.f1533d.i(new h(this, 0));
        } finally {
            a9.release();
        }
    }
}
