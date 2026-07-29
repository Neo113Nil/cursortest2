package com.moat.analytics.mobile.you;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.helper.ItemTouchHelper;
import com.tapjoy.TapjoyConstants;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
class w {
    private static w h;
    private static final Queue<c> i = new ConcurrentLinkedQueue();
    private Handler j;
    private long f = TapjoyConstants.SESSION_ID_INACTIVITY_TIME;
    private long g = 60000;

    /* renamed from: a, reason: collision with root package name */
    volatile d f7538a = d.OFF;

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f7539b = false;

    /* renamed from: c, reason: collision with root package name */
    volatile boolean f7540c = false;

    /* renamed from: d, reason: collision with root package name */
    volatile int f7541d = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;
    volatile int e = 10;
    private final AtomicBoolean k = new AtomicBoolean(false);
    private volatile long l = 0;
    private final AtomicInteger m = new AtomicInteger(0);
    private final AtomicBoolean n = new AtomicBoolean(false);

    private class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final Handler f7547b;

        /* renamed from: c, reason: collision with root package name */
        private final String f7548c;

        /* renamed from: d, reason: collision with root package name */
        private final e f7549d;

        private a(String str, Handler handler, e eVar) {
            this.f7549d = eVar;
            this.f7547b = handler;
            this.f7548c = "https://z.moatads.com/" + str + "/android/" + "9d24c90729bf464dce5d8fd1ace14a60656dbb2d".substring(0, 7) + "/status.json";
        }

        private void a() {
            String b2 = b();
            final l lVar = new l(b2);
            w.this.f7539b = lVar.a();
            w.this.f7540c = lVar.b();
            w.this.f7541d = lVar.c();
            w.this.e = lVar.d();
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.moat.analytics.mobile.you.w.a.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a.this.f7549d.a(lVar);
                    } catch (Exception e) {
                        m.a(e);
                    }
                }
            });
            w.this.l = System.currentTimeMillis();
            w.this.n.compareAndSet(true, false);
            if (b2 != null) {
                w.this.m.set(0);
            } else if (w.this.m.incrementAndGet() < 10) {
                w.this.a(w.this.g);
            }
        }

        private String b() {
            try {
                return q.a(this.f7548c + "?ts=" + System.currentTimeMillis() + "&v=2.4.5").b();
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Exception e) {
                m.a(e);
            }
            this.f7547b.removeCallbacks(this);
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                myLooper.quit();
            }
        }
    }

    interface b {
        void c();

        void d();
    }

    private class c {

        /* renamed from: a, reason: collision with root package name */
        final Long f7552a;

        /* renamed from: b, reason: collision with root package name */
        final b f7553b;

        c(Long l, b bVar) {
            this.f7552a = l;
            this.f7553b = bVar;
        }
    }

    enum d {
        OFF,
        ON
    }

    interface e {
        void a(l lVar);
    }

    private w() {
        try {
            this.j = new Handler(Looper.getMainLooper());
        } catch (Exception e2) {
            m.a(e2);
        }
    }

    static synchronized w a() {
        w wVar;
        synchronized (w.class) {
            if (h == null) {
                h = new w();
            }
            wVar = h;
        }
        return wVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final long j) {
        if (this.n.compareAndSet(false, true)) {
            p.a(3, "OnOff", this, "Performing status check.");
            new Thread() { // from class: com.moat.analytics.mobile.you.w.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    Looper.prepare();
                    Handler handler = new Handler();
                    handler.postDelayed(new a("YOU", handler, new e() { // from class: com.moat.analytics.mobile.you.w.1.1
                        @Override // com.moat.analytics.mobile.you.w.e
                        public void a(l lVar) {
                            synchronized (w.i) {
                                boolean z = ((k) MoatAnalytics.getInstance()).f7499a;
                                if (w.this.f7538a != lVar.e() || (w.this.f7538a == d.OFF && z)) {
                                    w.this.f7538a = lVar.e();
                                    if (w.this.f7538a == d.OFF && z) {
                                        w.this.f7538a = d.ON;
                                    }
                                    if (w.this.f7538a == d.ON) {
                                        p.a(3, "OnOff", this, "Moat enabled - Version 2.4.5");
                                    }
                                    for (c cVar : w.i) {
                                        if (w.this.f7538a == d.ON) {
                                            cVar.f7553b.c();
                                        } else {
                                            cVar.f7553b.d();
                                        }
                                    }
                                }
                                while (!w.i.isEmpty()) {
                                    w.i.remove();
                                }
                            }
                        }
                    }), j);
                    Looper.loop();
                }
            }.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        synchronized (i) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator<c> it = i.iterator();
            while (it.hasNext()) {
                if (currentTimeMillis - it.next().f7552a.longValue() >= 60000) {
                    it.remove();
                }
            }
            if (i.size() >= 15) {
                for (int i2 = 0; i2 < 5; i2++) {
                    i.remove();
                }
            }
        }
    }

    private void e() {
        if (this.k.compareAndSet(false, true)) {
            this.j.postDelayed(new Runnable() { // from class: com.moat.analytics.mobile.you.w.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (w.i.size() > 0) {
                            w.this.d();
                            w.this.j.postDelayed(this, 60000L);
                        } else {
                            w.this.k.compareAndSet(true, false);
                            w.this.j.removeCallbacks(this);
                        }
                    } catch (Exception e2) {
                        m.a(e2);
                    }
                }
            }, 60000L);
        }
    }

    void a(b bVar) {
        if (this.f7538a == d.ON) {
            bVar.c();
            return;
        }
        d();
        i.add(new c(Long.valueOf(System.currentTimeMillis()), bVar));
        e();
    }

    void b() {
        if (System.currentTimeMillis() - this.l > this.f) {
            a(0L);
        }
    }
}
