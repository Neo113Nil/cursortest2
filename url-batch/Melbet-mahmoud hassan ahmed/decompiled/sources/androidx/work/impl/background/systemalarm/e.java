package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import d0.j;
import e0.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m0.g;
import m0.n;

/* loaded from: classes.dex */
public class e implements e0.b {

    /* renamed from: p, reason: collision with root package name */
    static final String f1498p = j.f("SystemAlarmDispatcher");

    /* renamed from: f, reason: collision with root package name */
    final Context f1499f;

    /* renamed from: g, reason: collision with root package name */
    private final n0.a f1500g;

    /* renamed from: h, reason: collision with root package name */
    private final n f1501h;

    /* renamed from: i, reason: collision with root package name */
    private final e0.d f1502i;

    /* renamed from: j, reason: collision with root package name */
    private final i f1503j;

    /* renamed from: k, reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f1504k;

    /* renamed from: l, reason: collision with root package name */
    private final Handler f1505l;

    /* renamed from: m, reason: collision with root package name */
    final List<Intent> f1506m;

    /* renamed from: n, reason: collision with root package name */
    Intent f1507n;

    /* renamed from: o, reason: collision with root package name */
    private c f1508o;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar;
            d dVar;
            synchronized (e.this.f1506m) {
                e eVar2 = e.this;
                eVar2.f1507n = eVar2.f1506m.get(0);
            }
            Intent intent = e.this.f1507n;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.f1507n.getIntExtra("KEY_START_ID", 0);
                j c7 = j.c();
                String str = e.f1498p;
                c7.a(str, String.format("Processing command %s, %s", e.this.f1507n, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock b7 = m0.j.b(e.this.f1499f, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    j.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, b7), new Throwable[0]);
                    b7.acquire();
                    e eVar3 = e.this;
                    eVar3.f1504k.p(eVar3.f1507n, intExtra, eVar3);
                    j.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, b7), new Throwable[0]);
                    b7.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th) {
                    try {
                        j c8 = j.c();
                        String str2 = e.f1498p;
                        c8.b(str2, "Unexpected error in onHandleIntent", th);
                        j.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, b7), new Throwable[0]);
                        b7.release();
                        eVar = e.this;
                        dVar = new d(eVar);
                    } catch (Throwable th2) {
                        j.c().a(e.f1498p, String.format("Releasing operation wake lock (%s) %s", action, b7), new Throwable[0]);
                        b7.release();
                        e eVar4 = e.this;
                        eVar4.k(new d(eVar4));
                        throw th2;
                    }
                }
                eVar.k(dVar);
            }
        }
    }

    static class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private final e f1510f;

        /* renamed from: g, reason: collision with root package name */
        private final Intent f1511g;

        /* renamed from: h, reason: collision with root package name */
        private final int f1512h;

        b(e eVar, Intent intent, int i7) {
            this.f1510f = eVar;
            this.f1511g = intent;
            this.f1512h = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1510f.b(this.f1511g, this.f1512h);
        }
    }

    interface c {
        void b();
    }

    static class d implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private final e f1513f;

        d(e eVar) {
            this.f1513f = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1513f.d();
        }
    }

    e(Context context) {
        this(context, null, null);
    }

    e(Context context, e0.d dVar, i iVar) {
        Context applicationContext = context.getApplicationContext();
        this.f1499f = applicationContext;
        this.f1504k = new androidx.work.impl.background.systemalarm.b(applicationContext);
        this.f1501h = new n();
        iVar = iVar == null ? i.k(context) : iVar;
        this.f1503j = iVar;
        dVar = dVar == null ? iVar.m() : dVar;
        this.f1502i = dVar;
        this.f1500g = iVar.p();
        dVar.d(this);
        this.f1506m = new ArrayList();
        this.f1507n = null;
        this.f1505l = new Handler(Looper.getMainLooper());
    }

    private void c() {
        if (this.f1505l.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean i(String str) {
        c();
        synchronized (this.f1506m) {
            Iterator<Intent> it = this.f1506m.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private void l() {
        c();
        PowerManager.WakeLock b7 = m0.j.b(this.f1499f, "ProcessCommand");
        try {
            b7.acquire();
            this.f1503j.p().b(new a());
        } finally {
            b7.release();
        }
    }

    @Override // e0.b
    public void a(String str, boolean z6) {
        k(new b(this, androidx.work.impl.background.systemalarm.b.d(this.f1499f, str, z6), 0));
    }

    public boolean b(Intent intent, int i7) {
        j c7 = j.c();
        String str = f1498p;
        c7.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i7)), new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            j.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i7);
        synchronized (this.f1506m) {
            boolean z6 = this.f1506m.isEmpty() ? false : true;
            this.f1506m.add(intent);
            if (!z6) {
                l();
            }
        }
        return true;
    }

    void d() {
        j c7 = j.c();
        String str = f1498p;
        c7.a(str, "Checking if commands are complete.", new Throwable[0]);
        c();
        synchronized (this.f1506m) {
            if (this.f1507n != null) {
                j.c().a(str, String.format("Removing command %s", this.f1507n), new Throwable[0]);
                if (!this.f1506m.remove(0).equals(this.f1507n)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                this.f1507n = null;
            }
            g c8 = this.f1500g.c();
            if (!this.f1504k.o() && this.f1506m.isEmpty() && !c8.a()) {
                j.c().a(str, "No more commands & intents.", new Throwable[0]);
                c cVar = this.f1508o;
                if (cVar != null) {
                    cVar.b();
                }
            } else if (!this.f1506m.isEmpty()) {
                l();
            }
        }
    }

    e0.d e() {
        return this.f1502i;
    }

    n0.a f() {
        return this.f1500g;
    }

    i g() {
        return this.f1503j;
    }

    n h() {
        return this.f1501h;
    }

    void j() {
        j.c().a(f1498p, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f1502i.i(this);
        this.f1501h.a();
        this.f1508o = null;
    }

    void k(Runnable runnable) {
        this.f1505l.post(runnable);
    }

    void m(c cVar) {
        if (this.f1508o != null) {
            j.c().b(f1498p, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f1508o = cVar;
        }
    }
}
