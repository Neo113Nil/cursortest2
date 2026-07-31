package o0;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import k.RunnableC0460t;
import l0.q;
import m0.o;
import u0.C0673c;
import u0.C0680j;
import v0.m;
import v0.u;
import x0.InterfaceC0725a;

/* loaded from: classes.dex */
public final class i implements m0.c {

    /* renamed from: o, reason: collision with root package name */
    public static final String f5594o = q.f("SystemAlarmDispatcher");

    /* renamed from: f, reason: collision with root package name */
    public final Context f5595f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0725a f5596g;

    /* renamed from: h, reason: collision with root package name */
    public final u f5597h;

    /* renamed from: i, reason: collision with root package name */
    public final m0.f f5598i;

    /* renamed from: j, reason: collision with root package name */
    public final o f5599j;

    /* renamed from: k, reason: collision with root package name */
    public final c f5600k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f5601l;

    /* renamed from: m, reason: collision with root package name */
    public Intent f5602m;

    /* renamed from: n, reason: collision with root package name */
    public SystemAlarmService f5603n;

    public i(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f5595f = applicationContext;
        this.f5600k = new c(applicationContext, new C0673c(12));
        o a7 = o.a(systemAlarmService);
        this.f5599j = a7;
        this.f5597h = new u(a7.f5374b.f5248e);
        m0.f fVar = a7.f5378f;
        this.f5598i = fVar;
        this.f5596g = a7.f5376d;
        fVar.a(this);
        this.f5601l = new ArrayList();
        this.f5602m = null;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(int i7, Intent intent) {
        q d7 = q.d();
        String str = f5594o;
        d7.a(str, "Adding command " + intent + " (" + i7 + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            q.d().g(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f5601l) {
                try {
                    ArrayList arrayList = this.f5601l;
                    int size = arrayList.size();
                    int i8 = 0;
                    while (i8 < size) {
                        Object obj = arrayList.get(i8);
                        i8++;
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i7);
        synchronized (this.f5601l) {
            try {
                boolean isEmpty = this.f5601l.isEmpty();
                this.f5601l.add(intent);
                if (isEmpty) {
                    c();
                }
            } finally {
            }
        }
    }

    public final void c() {
        b();
        PowerManager.WakeLock a7 = m.a(this.f5595f, "ProcessCommand");
        try {
            a7.acquire();
            this.f5599j.f5376d.a(new h(this, 0));
        } finally {
            a7.release();
        }
    }

    @Override // m0.c
    public final void f(C0680j c0680j, boolean z5) {
        D0.q qVar = (D0.q) ((B0.c) this.f5596g).f71g;
        String str = c.f5568j;
        Intent intent = new Intent(this.f5595f, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z5);
        c.c(intent, c0680j);
        qVar.execute(new RunnableC0460t(this, intent, 0, 1));
    }
}
