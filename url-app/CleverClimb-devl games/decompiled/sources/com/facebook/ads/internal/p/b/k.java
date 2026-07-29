package com.facebook.ads.internal.p.b;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
class k {

    /* renamed from: a, reason: collision with root package name */
    private final n f5351a;

    /* renamed from: b, reason: collision with root package name */
    private final com.facebook.ads.internal.p.b.a f5352b;
    private volatile Thread f;
    private volatile boolean g;

    /* renamed from: c, reason: collision with root package name */
    private final Object f5353c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Object f5354d = new Object();
    private volatile int h = -1;
    private final AtomicInteger e = new AtomicInteger();

    private class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.e();
        }
    }

    public k(n nVar, com.facebook.ads.internal.p.b.a aVar) {
        this.f5351a = (n) j.a(nVar);
        this.f5352b = (com.facebook.ads.internal.p.b.a) j.a(aVar);
    }

    private void b() {
        int i = this.e.get();
        if (i < 1) {
            return;
        }
        this.e.set(0);
        throw new l("Error reading source " + i + " times");
    }

    private void b(long j, long j2) {
        a(j, j2);
        synchronized (this.f5353c) {
            this.f5353c.notifyAll();
        }
    }

    private synchronized void c() {
        boolean z = (this.f == null || this.f.getState() == Thread.State.TERMINATED) ? false : true;
        if (!this.g && !this.f5352b.d() && !z) {
            this.f = new Thread(new a(), "Source reader for " + this.f5351a);
            this.f.start();
        }
    }

    private void d() {
        synchronized (this.f5353c) {
            try {
                try {
                    this.f5353c.wait(1000L);
                } catch (InterruptedException e) {
                    throw new l("Waiting source data is interrupted!", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Throwable th;
        int i;
        int i2;
        Throwable th2;
        int i3;
        int i4 = 0;
        try {
            i2 = this.f5352b.a();
            try {
                this.f5351a.a(i2);
                i = this.f5351a.a();
            } catch (Throwable th3) {
                th2 = th3;
                i4 = i2;
                i3 = -1;
                try {
                    this.e.incrementAndGet();
                    a(th2);
                    h();
                    b(i4, i3);
                } catch (Throwable th4) {
                    th = th4;
                    int i5 = i3;
                    i2 = i4;
                    i = i5;
                    h();
                    b(i2, i);
                    throw th;
                }
            }
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int a2 = this.f5351a.a(bArr);
                    if (a2 == -1) {
                        f();
                        h();
                        b(i2, i);
                        return;
                    }
                    synchronized (this.f5354d) {
                        if (g()) {
                            h();
                            b(i2, i);
                            return;
                        }
                        this.f5352b.a(bArr, a2);
                    }
                    i2 += a2;
                    b(i2, i);
                }
            } catch (Throwable th5) {
                th = th5;
                h();
                b(i2, i);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            i = -1;
            i2 = 0;
        }
    }

    private void f() {
        synchronized (this.f5354d) {
            if (!g() && this.f5352b.a() == this.f5351a.a()) {
                this.f5352b.c();
            }
        }
    }

    private boolean g() {
        return Thread.currentThread().isInterrupted() || this.g;
    }

    private void h() {
        try {
            this.f5351a.b();
        } catch (l e) {
            a(new l("Error closing source " + this.f5351a, e));
        }
    }

    public int a(byte[] bArr, long j, int i) {
        m.a(bArr, j, i);
        while (!this.f5352b.d() && this.f5352b.a() < i + j && !this.g) {
            c();
            d();
            b();
        }
        int a2 = this.f5352b.a(bArr, j, i);
        if (this.f5352b.d() && this.h != 100) {
            this.h = 100;
            a(100);
        }
        return a2;
    }

    public void a() {
        synchronized (this.f5354d) {
            Log.d("ProxyCache", "Shutdown proxy for " + this.f5351a);
            try {
                this.g = true;
                if (this.f != null) {
                    this.f.interrupt();
                }
                this.f5352b.b();
            } catch (l e) {
                a(e);
            }
        }
    }

    protected void a(int i) {
    }

    protected void a(long j, long j2) {
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1)) == 0 ? 100 : (int) ((j * 100) / j2);
        boolean z = i != this.h;
        if ((j2 >= 0) && z) {
            a(i);
        }
        this.h = i;
    }

    protected final void a(Throwable th) {
        if (th instanceof i) {
            Log.d("ProxyCache", "ProxyCache is interrupted");
        } else {
            Log.e("ProxyCache", "ProxyCache error", th);
        }
    }
}
