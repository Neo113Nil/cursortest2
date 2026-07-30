package J0;

import G0.s;
import H0.p;
import K1.o;
import Q0.x;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j implements H0.c {

    /* renamed from: r, reason: collision with root package name */
    public static final String f1350r = s.f("SystemAlarmDispatcher");

    /* renamed from: d, reason: collision with root package name */
    public final Context f1351d;

    /* renamed from: e, reason: collision with root package name */
    public final S0.a f1352e;

    /* renamed from: i, reason: collision with root package name */
    public final x f1353i;

    /* renamed from: l, reason: collision with root package name */
    public final H0.f f1354l;

    /* renamed from: m, reason: collision with root package name */
    public final p f1355m;

    /* renamed from: n, reason: collision with root package name */
    public final c f1356n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f1357o;

    /* renamed from: p, reason: collision with root package name */
    public Intent f1358p;

    /* renamed from: q, reason: collision with root package name */
    public SystemAlarmService f1359q;

    public j(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f1351d = applicationContext;
        this.f1356n = new c(applicationContext, new P0.e(1));
        p a7 = p.a(systemAlarmService);
        this.f1355m = a7;
        this.f1353i = new x(a7.f919b.f787e);
        H0.f fVar = a7.f923f;
        this.f1354l = fVar;
        this.f1352e = a7.f921d;
        fVar.a(this);
        this.f1357o = new ArrayList();
        this.f1358p = null;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(int i2, Intent intent) {
        s d7 = s.d();
        String str = f1350r;
        d7.a(str, "Adding command " + intent + " (" + i2 + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            s.d().g(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f1357o) {
                try {
                    ArrayList arrayList = this.f1357o;
                    int size = arrayList.size();
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj = arrayList.get(i5);
                        i5++;
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i2);
        synchronized (this.f1357o) {
            try {
                boolean isEmpty = this.f1357o.isEmpty();
                this.f1357o.add(intent);
                if (isEmpty) {
                    d();
                }
            } finally {
            }
        }
    }

    @Override // H0.c
    public final void c(P0.j jVar, boolean z7) {
        o oVar = (o) ((D0.j) this.f1352e).f332l;
        String str = c.f1320m;
        Intent intent = new Intent(this.f1351d, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z7);
        c.d(intent, jVar);
        oVar.execute(new i(0, 0, this, intent));
    }

    public final void d() {
        b();
        PowerManager.WakeLock a7 = Q0.o.a(this.f1351d, "ProcessCommand");
        try {
            a7.acquire();
            this.f1355m.f921d.r(new h(this, 0));
        } finally {
            a7.release();
        }
    }
}
