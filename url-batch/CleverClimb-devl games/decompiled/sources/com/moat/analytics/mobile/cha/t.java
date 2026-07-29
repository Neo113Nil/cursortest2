package com.moat.analytics.mobile.cha;

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
final class t {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static t f1004;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final Queue<e> f1005 = new ConcurrentLinkedQueue();

    /* renamed from: ᐝ, reason: contains not printable characters */
    private Handler f1017;

    /* renamed from: ˊॱ, reason: contains not printable characters */
    private long f1008 = TapjoyConstants.SESSION_ID_INACTIVITY_TIME;

    /* renamed from: ʼ, reason: contains not printable characters */
    private long f1006 = 60000;

    /* renamed from: ˎ, reason: contains not printable characters */
    volatile int f1011 = a.f1023;

    /* renamed from: ˏ, reason: contains not printable characters */
    volatile boolean f1012 = false;

    /* renamed from: ˋ, reason: contains not printable characters */
    volatile boolean f1009 = false;

    /* renamed from: ˊ, reason: contains not printable characters */
    volatile int f1007 = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;

    /* renamed from: ॱ, reason: contains not printable characters */
    volatile int f1014 = 10;

    /* renamed from: ˋॱ, reason: contains not printable characters */
    private final AtomicBoolean f1010 = new AtomicBoolean(false);

    /* renamed from: ॱˋ, reason: contains not printable characters */
    private volatile long f1016 = 0;

    /* renamed from: ॱˊ, reason: contains not printable characters */
    private final AtomicInteger f1015 = new AtomicInteger(0);

    /* renamed from: ˏॱ, reason: contains not printable characters */
    private final AtomicBoolean f1013 = new AtomicBoolean(false);

    interface b {
        /* renamed from: ˎ */
        void mo1033() throws o;
    }

    interface c {
        /* renamed from: ˏ */
        void mo1151(g gVar) throws o;
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class a {

        /* renamed from: ˎ, reason: contains not printable characters */
        public static final int f1022 = 2;

        /* renamed from: ॱ, reason: contains not printable characters */
        public static final int f1023 = 1;

        static {
            int[] iArr = {1, 2};
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    static synchronized t m1144() {
        t tVar;
        synchronized (t.class) {
            if (f1004 == null) {
                f1004 = new t();
            }
            tVar = f1004;
        }
        return tVar;
    }

    private t() {
        try {
            this.f1017 = new Handler(Looper.getMainLooper());
        } catch (Exception e2) {
            o.m1110(e2);
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    final void m1150() {
        if (System.currentTimeMillis() - this.f1016 > this.f1008) {
            m1145(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˏ, reason: contains not printable characters */
    public void m1145(final long j) {
        if (this.f1013.compareAndSet(false, true)) {
            com.moat.analytics.mobile.cha.a.m994(3, "OnOff", this, "Performing status check.");
            new Thread() { // from class: com.moat.analytics.mobile.cha.t.2
                /* JADX WARN: Type inference failed for: r4v0, types: [com.moat.analytics.mobile.cha.t$2$2] */
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    Looper.prepare();
                    Handler handler = new Handler();
                    handler.postDelayed(new d(BuildConfig.NAMESPACE, handler, new c() { // from class: com.moat.analytics.mobile.cha.t.2.2
                        @Override // com.moat.analytics.mobile.cha.t.c
                        /* renamed from: ˏ, reason: contains not printable characters */
                        public final void mo1151(g gVar) throws o {
                            synchronized (t.f1005) {
                                boolean z = ((f) MoatAnalytics.getInstance()).f888;
                                if (t.this.f1011 != gVar.m1040() || (t.this.f1011 == a.f1023 && z)) {
                                    t.this.f1011 = gVar.m1040();
                                    if (t.this.f1011 == a.f1023 && z) {
                                        t.this.f1011 = a.f1022;
                                    }
                                    if (t.this.f1011 == a.f1022) {
                                        com.moat.analytics.mobile.cha.a.m994(3, "OnOff", this, "Moat enabled - Version 2.4.1");
                                    }
                                    for (e eVar : t.f1005) {
                                        if (t.this.f1011 == a.f1022) {
                                            eVar.f1032.mo1033();
                                        }
                                    }
                                }
                                while (!t.f1005.isEmpty()) {
                                    t.f1005.remove();
                                }
                            }
                        }
                    }), j);
                    Looper.loop();
                }
            }.start();
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    final void m1149(b bVar) throws o {
        if (this.f1011 == a.f1022) {
            bVar.mo1033();
            return;
        }
        m1138();
        f1005.add(new e(Long.valueOf(System.currentTimeMillis()), bVar));
        if (this.f1010.compareAndSet(false, true)) {
            this.f1017.postDelayed(new Runnable() { // from class: com.moat.analytics.mobile.cha.t.4
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (t.f1005.size() > 0) {
                            t.m1138();
                            t.this.f1017.postDelayed(this, 60000L);
                        } else {
                            t.this.f1010.compareAndSet(true, false);
                            t.this.f1017.removeCallbacks(this);
                        }
                    } catch (Exception e2) {
                        o.m1110(e2);
                    }
                }
            }, 60000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m1138() {
        synchronized (f1005) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator<e> it = f1005.iterator();
            while (it.hasNext()) {
                if (currentTimeMillis - it.next().f1030.longValue() >= 60000) {
                    it.remove();
                }
            }
            if (f1005.size() >= 15) {
                for (int i = 0; i < 5; i++) {
                    f1005.remove();
                }
            }
        }
    }

    class d implements Runnable {

        /* renamed from: ˎ, reason: contains not printable characters */
        private final String f1025;

        /* renamed from: ˏ, reason: contains not printable characters */
        private final AnonymousClass2.C03782 f1026;

        /* renamed from: ॱ, reason: contains not printable characters */
        private final Handler f1027;

        private d(String str, Handler handler, AnonymousClass2.C03782 c03782) {
            this.f1026 = c03782;
            this.f1027 = handler;
            this.f1025 = "https://z.moatads.com/" + str + "/android/" + BuildConfig.REVISION.substring(0, 7) + "/status.json";
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        private String m1152() {
            try {
                return m.m1088(this.f1025 + "?ts=" + System.currentTimeMillis() + "&v=2.4.1").get();
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                String m1152 = m1152();
                final g gVar = new g(m1152);
                t.this.f1012 = gVar.m1039();
                t.this.f1009 = gVar.m1043();
                t.this.f1007 = gVar.m1042();
                t.this.f1014 = gVar.m1041();
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.moat.analytics.mobile.cha.t.d.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            mo1151(gVar);
                        } catch (Exception e) {
                            o.m1110(e);
                        }
                    }
                });
                t.this.f1016 = System.currentTimeMillis();
                t.this.f1013.compareAndSet(true, false);
                if (m1152 == null) {
                    if (t.this.f1015.incrementAndGet() < 10) {
                        t.this.m1145(t.this.f1006);
                    }
                } else {
                    t.this.f1015.set(0);
                }
            } catch (Exception e) {
                o.m1110(e);
            }
            this.f1027.removeCallbacks(this);
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                myLooper.quit();
            }
        }
    }

    class e {

        /* renamed from: ˎ, reason: contains not printable characters */
        final Long f1030;

        /* renamed from: ॱ, reason: contains not printable characters */
        final b f1032;

        e(Long l, b bVar) {
            this.f1030 = l;
            this.f1032 = bVar;
        }
    }
}
