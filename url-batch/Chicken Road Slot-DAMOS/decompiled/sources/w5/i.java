package w5;

import a1.n;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c6.j;
import d6.w;
import java.util.ArrayList;
import kotlin.collections.i0;
import t5.o;
import u5.m;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i implements u5.c {

    /* renamed from: x, reason: collision with root package name */
    public static final String f10107x = o.f("SystemAlarmDispatcher");

    /* renamed from: d, reason: collision with root package name */
    public final Context f10108d;

    /* renamed from: e, reason: collision with root package name */
    public final f6.a f10109e;

    /* renamed from: i, reason: collision with root package name */
    public final w f10110i;

    /* renamed from: r, reason: collision with root package name */
    public final u5.e f10111r;

    /* renamed from: s, reason: collision with root package name */
    public final m f10112s;

    /* renamed from: t, reason: collision with root package name */
    public final c f10113t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f10114u;

    /* renamed from: v, reason: collision with root package name */
    public Intent f10115v;

    /* renamed from: w, reason: collision with root package name */
    public SystemAlarmService f10116w;

    public i(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f10108d = applicationContext;
        this.f10113t = new c(applicationContext, new c6.e(13));
        m a9 = m.a(systemAlarmService);
        this.f10112s = a9;
        this.f10110i = new w(a9.f9650b.f9287e);
        u5.e eVar = a9.f9654f;
        this.f10111r = eVar;
        this.f10109e = a9.f9652d;
        eVar.a(this);
        this.f10114u = new ArrayList();
        this.f10115v = null;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        i0.l("Needs to be invoked on the main thread.");
    }

    public final void a(int i3, Intent intent) {
        o d10 = o.d();
        String str = f10107x;
        d10.a(str, "Adding command " + intent + " (" + i3 + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            o.d().g(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f10114u) {
                try {
                    ArrayList arrayList = this.f10114u;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i3);
        synchronized (this.f10114u) {
            try {
                boolean isEmpty = this.f10114u.isEmpty();
                this.f10114u.add(intent);
                if (isEmpty) {
                    c();
                }
            } finally {
            }
        }
    }

    public final void c() {
        b();
        PowerManager.WakeLock a9 = d6.o.a(this.f10108d, "ProcessCommand");
        try {
            a9.acquire();
            this.f10112s.f9652d.a(new h(this, 0));
        } finally {
            a9.release();
        }
    }

    @Override // u5.c
    public final void f(j jVar, boolean z10) {
        f6.b bVar = (f6.b) ((n) this.f10109e).f42r;
        String str = c.f10082s;
        Intent intent = new Intent(this.f10108d, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        c.c(intent, jVar);
        bVar.execute(new b6.c(0, 2, this, intent));
    }
}
