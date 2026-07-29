package com.moat.analytics.mobile.vng;

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
    private static w g;
    private static final Queue<c> h = new ConcurrentLinkedQueue();
    private Handler i;
    private long e = TapjoyConstants.SESSION_ID_INACTIVITY_TIME;
    private long f = 60000;

    /* renamed from: a, reason: collision with root package name */
    volatile d f7405a = d.OFF;

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f7406b = false;

    /* renamed from: c, reason: collision with root package name */
    volatile boolean f7407c = false;

    /* renamed from: d, reason: collision with root package name */
    volatile int f7408d = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;
    private final AtomicBoolean j = new AtomicBoolean(false);
    private volatile long k = 0;
    private final AtomicInteger l = new AtomicInteger(0);
    private final AtomicBoolean m = new AtomicBoolean(false);

    private class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final Handler f7414b;

        /* renamed from: c, reason: collision with root package name */
        private final String f7415c;

        /* renamed from: d, reason: collision with root package name */
        private final e f7416d;

        private a(String str, Handler handler, e eVar) {
            this.f7416d = eVar;
            this.f7414b = handler;
            this.f7415c = "https://z.moatads.com/" + str + "/android/" + "3f2ae9c1894282b5e0222f0d06bbf457191f816f".substring(0, 7) + "/status.json";
        }

        private void a() {
            String b2 = b();
            final l lVar = new l(b2);
            w.this.f7406b = lVar.a();
            w.this.f7407c = lVar.b();
            w.this.f7408d = lVar.c();
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.moat.analytics.mobile.vng.w.a.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a.this.f7416d.a(lVar);
                    } catch (Exception e) {
                        m.a(e);
                    }
                }
            });
            w.this.k = System.currentTimeMillis();
            w.this.m.compareAndSet(true, false);
            if (b2 != null) {
                w.this.l.set(0);
            } else if (w.this.l.incrementAndGet() < 10) {
                w.this.a(w.this.f);
            }
        }

        private String b() {
            try {
                return q.a(this.f7415c + "?ts=" + System.currentTimeMillis() + "&v=2.2.0").b();
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
            this.f7414b.removeCallbacks(this);
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                myLooper.quit();
            }
        }
    }

    interface b {
        void b();

        void c();
    }

    private class c {

        /* renamed from: a, reason: collision with root package name */
        final Long f7419a;

        /* renamed from: b, reason: collision with root package name */
        final b f7420b;

        c(Long l, b bVar) {
            this.f7419a = l;
            this.f7420b = bVar;
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
            this.i = new Handler(Looper.getMainLooper());
        } catch (Exception e2) {
            m.a(e2);
        }
    }

    static synchronized w a() {
        w wVar;
        synchronized (w.class) {
            if (g == null) {
                g = new w();
            }
            wVar = g;
        }
        return wVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final long j) {
        if (this.m.compareAndSet(false, true)) {
            p.a(3, "OnOff", this, "Performing status check.");
            new Thread() { // from class: com.moat.analytics.mobile.vng.w.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    Looper.prepare();
                    Handler handler = new Handler();
                    handler.postDelayed(new a("VNG", handler, new e() { // from class: com.moat.analytics.mobile.vng.w.1.1
                        @Override // com.moat.analytics.mobile.vng.w.e
                        public void a(l lVar) {
                            synchronized (w.h) {
                                boolean z = ((k) MoatAnalytics.getInstance()).f7377a;
                                if (w.this.f7405a != lVar.d() || (w.this.f7405a == d.OFF && z)) {
                                    w.this.f7405a = lVar.d();
                                    if (w.this.f7405a == d.OFF && z) {
                                        w.this.f7405a = d.ON;
                                    }
                                    if (w.this.f7405a == d.ON) {
                                        p.a(3, "OnOff", this, "Moat enabled - Version 2.2.0");
                                    }
                                    for (c cVar : w.h) {
                                        if (w.this.f7405a == d.ON) {
                                            cVar.f7420b.b();
                                        } else {
                                            cVar.f7420b.c();
                                        }
                                    }
                                }
                                while (!w.h.isEmpty()) {
                                    w.h.remove();
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
        synchronized (h) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator<c> it = h.iterator();
            while (it.hasNext()) {
                if (currentTimeMillis - it.next().f7419a.longValue() >= 60000) {
                    it.remove();
                }
            }
            if (h.size() >= 15) {
                for (int i = 0; i < 5; i++) {
                    h.remove();
                }
            }
        }
    }

    private void e() {
        if (this.j.compareAndSet(false, true)) {
            this.i.postDelayed(new Runnable() { // from class: com.moat.analytics.mobile.vng.w.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (w.h.size() > 0) {
                            w.this.d();
                            w.this.i.postDelayed(this, 60000L);
                        } else {
                            w.this.j.compareAndSet(true, false);
                            w.this.i.removeCallbacks(this);
                        }
                    } catch (Exception e2) {
                        m.a(e2);
                    }
                }
            }, 60000L);
        }
    }

    void a(b bVar) {
        if (this.f7405a == d.ON) {
            bVar.b();
            return;
        }
        d();
        h.add(new c(Long.valueOf(System.currentTimeMillis()), bVar));
        e();
    }

    void b() {
        if (System.currentTimeMillis() - this.k > this.e) {
            a(0L);
        }
    }
}
