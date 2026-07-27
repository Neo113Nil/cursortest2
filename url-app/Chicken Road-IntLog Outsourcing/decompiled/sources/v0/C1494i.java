package v0;

import B0.j;
import C0.q;
import C0.z;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import s0.s;
import t0.InterfaceC1425d;
import t0.o;

/* renamed from: v0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1494i implements InterfaceC1425d {

    /* renamed from: j, reason: collision with root package name */
    public static final String f12083j = s.f("SystemAlarmDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final Context f12084a;

    /* renamed from: b, reason: collision with root package name */
    public final B4.i f12085b;

    /* renamed from: c, reason: collision with root package name */
    public final z f12086c;

    /* renamed from: d, reason: collision with root package name */
    public final t0.f f12087d;

    /* renamed from: e, reason: collision with root package name */
    public final o f12088e;

    /* renamed from: f, reason: collision with root package name */
    public final C1488c f12089f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f12090g;

    /* renamed from: h, reason: collision with root package name */
    public Intent f12091h;

    /* renamed from: i, reason: collision with root package name */
    public SystemAlarmService f12092i;

    public C1494i(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f12084a = applicationContext;
        this.f12089f = new C1488c(applicationContext, new x1.e());
        o a6 = o.a(systemAlarmService);
        this.f12088e = a6;
        this.f12086c = new z(a6.f11883b.f11755e);
        t0.f fVar = a6.f11887f;
        this.f12087d = fVar;
        this.f12085b = a6.f11885d;
        fVar.a(this);
        this.f12090g = new ArrayList();
        this.f12091h = null;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(int i2, Intent intent) {
        s d6 = s.d();
        String str = f12083j;
        d6.a(str, "Adding command " + intent + " (" + i2 + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            s.d().g(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f12090g) {
                try {
                    Iterator it = this.f12090g.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i2);
        synchronized (this.f12090g) {
            try {
                boolean isEmpty = this.f12090g.isEmpty();
                this.f12090g.add(intent);
                if (isEmpty) {
                    c();
                }
            } finally {
            }
        }
    }

    public final void c() {
        b();
        PowerManager.WakeLock a6 = q.a(this.f12084a, "ProcessCommand");
        try {
            a6.acquire();
            this.f12088e.f11885d.o(new RunnableC1493h(this, 0));
        } finally {
            a6.release();
        }
    }

    @Override // t0.InterfaceC1425d
    public final void d(j jVar, boolean z) {
        A.c cVar = (A.c) this.f12085b.f313d;
        String str = C1488c.f12056e;
        Intent intent = new Intent(this.f12084a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        C1488c.c(intent, jVar);
        cVar.execute(new A0.d(0, intent, this));
    }
}
