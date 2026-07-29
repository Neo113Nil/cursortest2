package com.moat.analytics.mobile.iro;

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
    private static final Queue<b> f1225 = new ConcurrentLinkedQueue();

    /* renamed from: ʽ, reason: contains not printable characters */
    private static t f1226;

    /* renamed from: ᐝ, reason: contains not printable characters */
    private Handler f1238;

    /* renamed from: ˊॱ, reason: contains not printable characters */
    private long f1229 = TapjoyConstants.SESSION_ID_INACTIVITY_TIME;

    /* renamed from: ʼ, reason: contains not printable characters */
    private long f1227 = 60000;

    /* renamed from: ˋ, reason: contains not printable characters */
    volatile int f1230 = c.f1246;

    /* renamed from: ˎ, reason: contains not printable characters */
    volatile boolean f1232 = false;

    /* renamed from: ˏ, reason: contains not printable characters */
    volatile boolean f1233 = false;

    /* renamed from: ॱ, reason: contains not printable characters */
    volatile int f1235 = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;

    /* renamed from: ˊ, reason: contains not printable characters */
    volatile int f1228 = 10;

    /* renamed from: ॱˊ, reason: contains not printable characters */
    private final AtomicBoolean f1236 = new AtomicBoolean(false);

    /* renamed from: ॱˋ, reason: contains not printable characters */
    private volatile long f1237 = 0;

    /* renamed from: ˋॱ, reason: contains not printable characters */
    private final AtomicInteger f1231 = new AtomicInteger(0);

    /* renamed from: ˏॱ, reason: contains not printable characters */
    private final AtomicBoolean f1234 = new AtomicBoolean(false);

    interface a {
        /* renamed from: ॱ */
        void mo1265() throws o;
    }

    interface e {
        /* renamed from: ˋ */
        void mo1330(i iVar) throws o;
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class c {

        /* renamed from: ˊ, reason: contains not printable characters */
        public static final int f1246 = 1;

        /* renamed from: ॱ, reason: contains not printable characters */
        public static final int f1247 = 2;

        static {
            int[] iArr = {1, 2};
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    static synchronized t m1319() {
        t tVar;
        synchronized (t.class) {
            if (f1226 == null) {
                f1226 = new t();
            }
            tVar = f1226;
        }
        return tVar;
    }

    private t() {
        try {
            this.f1238 = new Handler(Looper.getMainLooper());
        } catch (Exception e2) {
            o.m1290(e2);
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    final void m1328() {
        if (System.currentTimeMillis() - this.f1237 > this.f1229) {
            m1321(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˋ, reason: contains not printable characters */
    public void m1321(final long j) {
        if (this.f1234.compareAndSet(false, true)) {
            com.moat.analytics.mobile.iro.b.m1182(3, "OnOff", this, "Performing status check.");
            new Thread() { // from class: com.moat.analytics.mobile.iro.t.5
                /* JADX WARN: Type inference failed for: r4v0, types: [com.moat.analytics.mobile.iro.t$5$2] */
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    Looper.prepare();
                    Handler handler = new Handler();
                    handler.postDelayed(new d("IRO", handler, new e() { // from class: com.moat.analytics.mobile.iro.t.5.2
                        @Override // com.moat.analytics.mobile.iro.t.e
                        /* renamed from: ˋ, reason: contains not printable characters */
                        public final void mo1330(i iVar) throws o {
                            synchronized (t.f1225) {
                                boolean z = ((j) MoatAnalytics.getInstance()).f1171;
                                if (t.this.f1230 != iVar.m1260() || (t.this.f1230 == c.f1246 && z)) {
                                    t.this.f1230 = iVar.m1260();
                                    if (t.this.f1230 == c.f1246 && z) {
                                        t.this.f1230 = c.f1247;
                                    }
                                    if (t.this.f1230 == c.f1247) {
                                        com.moat.analytics.mobile.iro.b.m1182(3, "OnOff", this, "Moat enabled - Version 2.4.0");
                                    }
                                    for (b bVar : t.f1225) {
                                        if (t.this.f1230 == c.f1247) {
                                            bVar.f1243.mo1265();
                                        }
                                    }
                                }
                                while (!t.f1225.isEmpty()) {
                                    t.f1225.remove();
                                }
                            }
                        }
                    }), j);
                    Looper.loop();
                }
            }.start();
        }
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    final void m1329(a aVar) throws o {
        if (this.f1230 == c.f1247) {
            aVar.mo1265();
            return;
        }
        m1317();
        f1225.add(new b(Long.valueOf(System.currentTimeMillis()), aVar));
        if (this.f1236.compareAndSet(false, true)) {
            this.f1238.postDelayed(new Runnable() { // from class: com.moat.analytics.mobile.iro.t.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (t.f1225.size() > 0) {
                            t.m1317();
                            t.this.f1238.postDelayed(this, 60000L);
                        } else {
                            t.this.f1236.compareAndSet(true, false);
                            t.this.f1238.removeCallbacks(this);
                        }
                    } catch (Exception e2) {
                        o.m1290(e2);
                    }
                }
            }, 60000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m1317() {
        synchronized (f1225) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator<b> it = f1225.iterator();
            while (it.hasNext()) {
                if (currentTimeMillis - it.next().f1245.longValue() >= 60000) {
                    it.remove();
                }
            }
            if (f1225.size() >= 15) {
                for (int i = 0; i < 5; i++) {
                    f1225.remove();
                }
            }
        }
    }

    class d implements Runnable {

        /* renamed from: ˋ, reason: contains not printable characters */
        private final Handler f1248;

        /* renamed from: ˎ, reason: contains not printable characters */
        private final AnonymousClass5.AnonymousClass2 f1249;

        /* renamed from: ˏ, reason: contains not printable characters */
        private final String f1250;

        private d(String str, Handler handler, AnonymousClass5.AnonymousClass2 anonymousClass2) {
            this.f1249 = anonymousClass2;
            this.f1248 = handler;
            this.f1250 = "https://z.moatads.com/" + str + "/android/" + "2bc3418b93f01686fcbd1ebebcc04694651821b2".substring(0, 7) + "/status.json";
        }

        /* renamed from: ॱ, reason: contains not printable characters */
        private String m1332() {
            try {
                return l.m1286(this.f1250 + "?ts=" + System.currentTimeMillis() + "&v=2.4.0").get();
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                String m1332 = m1332();
                final i iVar = new i(m1332);
                t.this.f1232 = iVar.m1257();
                t.this.f1233 = iVar.m1259();
                t.this.f1235 = iVar.m1258();
                t.this.f1228 = iVar.m1261();
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.moat.analytics.mobile.iro.t.d.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            mo1330(iVar);
                        } catch (Exception e) {
                            o.m1290(e);
                        }
                    }
                });
                t.this.f1237 = System.currentTimeMillis();
                t.this.f1234.compareAndSet(true, false);
                if (m1332 == null) {
                    if (t.this.f1231.incrementAndGet() < 10) {
                        t.this.m1321(t.this.f1227);
                    }
                } else {
                    t.this.f1231.set(0);
                }
            } catch (Exception e) {
                o.m1290(e);
            }
            this.f1248.removeCallbacks(this);
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                myLooper.quit();
            }
        }
    }

    class b {

        /* renamed from: ˋ, reason: contains not printable characters */
        final a f1243;

        /* renamed from: ॱ, reason: contains not printable characters */
        final Long f1245;

        b(Long l, a aVar) {
            this.f1245 = l;
            this.f1243 = aVar;
        }
    }
}
