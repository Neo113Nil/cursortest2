package com.applovin.impl.adview;

import android.os.Handler;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f2535a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f2536b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<b> f2537c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f2538d = new AtomicInteger();

    interface a {
        void a();

        boolean b();
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f2542a;

        /* renamed from: b, reason: collision with root package name */
        private final a f2543b;

        /* renamed from: c, reason: collision with root package name */
        private final long f2544c;

        private b(String str, long j, a aVar) {
            this.f2542a = str;
            this.f2544c = j;
            this.f2543b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String a() {
            return this.f2542a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f2544c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a c() {
            return this.f2543b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f2542a != null ? this.f2542a.equalsIgnoreCase(bVar.f2542a) : bVar.f2542a == null;
        }

        public int hashCode() {
            if (this.f2542a != null) {
                return this.f2542a.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.f2542a + "', countdownStepMillis=" + this.f2544c + '}';
        }
    }

    public h(Handler handler, com.applovin.impl.sdk.j jVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f2536b = handler;
        this.f2535a = jVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final b bVar, final int i) {
        this.f2536b.postDelayed(new Runnable() { // from class: com.applovin.impl.adview.h.1
            @Override // java.lang.Runnable
            public void run() {
                a c2 = bVar.c();
                if (!c2.b()) {
                    h.this.f2535a.a("CountdownManager", "Ending countdown for " + bVar.a());
                    return;
                }
                if (h.this.f2538d.get() != i) {
                    h.this.f2535a.c("CountdownManager", "Killing duplicate countdown from previous generation: " + bVar.a());
                    return;
                }
                try {
                    c2.a();
                } catch (Throwable th) {
                    h.this.f2535a.b("CountdownManager", "Encountered error on countdown step for: " + bVar.a(), th);
                }
                h.this.a(bVar, i);
            }
        }, bVar.b());
    }

    public void a() {
        HashSet<b> hashSet = new HashSet(this.f2537c);
        this.f2535a.a("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        int incrementAndGet = this.f2538d.incrementAndGet();
        for (b bVar : hashSet) {
            this.f2535a.a("CountdownManager", "Starting countdown: " + bVar.a() + " for generation " + incrementAndGet + "...");
            a(bVar, incrementAndGet);
        }
    }

    public void a(String str, long j, a aVar) {
        if (j <= 0) {
            throw new IllegalArgumentException("Invalid step specified.");
        }
        if (this.f2536b == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        this.f2535a.a("CountdownManager", "Adding countdown: " + str);
        this.f2537c.add(new b(str, j, aVar));
    }

    public void b() {
        this.f2535a.a("CountdownManager", "Removing all countdowns...");
        c();
        this.f2537c.clear();
    }

    public void c() {
        this.f2535a.a("CountdownManager", "Stopping countdowns...");
        this.f2538d.incrementAndGet();
        this.f2536b.removeCallbacksAndMessages(null);
    }
}
