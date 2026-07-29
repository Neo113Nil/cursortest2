package com.tapjoy.internal;

import java.io.File;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class gy implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final hm f8224a;

    /* renamed from: b, reason: collision with root package name */
    cd f8225b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f8226c;

    /* renamed from: d, reason: collision with root package name */
    private final Thread f8227d;
    private boolean e;

    public gy(File file) {
        this.f8224a = new hm(file);
        this.f8226c = this.f8224a;
        new Object[1][0] = Integer.valueOf(this.f8224a.b());
        this.f8227d = new Thread(this, "5Rocks");
        this.f8227d.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x010a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        int i = 1;
        while (true) {
            long j2 = 0;
            while (this.f8225b != null && this.f8224a.b() > 0 && j2 <= 0) {
                try {
                    try {
                        if (this.f8224a.b() > 10000) {
                            this.f8224a.a(this.f8224a.b() - 10000);
                        }
                        ew b2 = this.f8224a.b(0);
                        if (b2 == null) {
                            break;
                        }
                        fi fiVar = b2.w;
                        if (fiVar != null && fiVar.G == null) {
                            ho.f8308c.await(3L, TimeUnit.SECONDS);
                        }
                        if (!v.c()) {
                            ho.f8307b.await(3L, TimeUnit.SECONDS);
                        }
                        if (!this.e && b2.n != ez.APP && this.f8224a.b() < 100 && b2.p.longValue() <= System.currentTimeMillis()) {
                            j = Math.min(Math.max((b2.p.longValue() + 60000) - System.currentTimeMillis(), 0L), 60000L);
                            if (j > 0) {
                                il ilVar = new il();
                                ilVar.a(b2);
                                new Object[1][0] = b2;
                                for (int i2 = 1; i2 < 100 && i2 < this.f8224a.b(); i2++) {
                                    ew b3 = this.f8224a.b(i2);
                                    if (b3 == null || !ilVar.a(b3)) {
                                        break;
                                    }
                                    new Object[1][0] = b3;
                                }
                                i++;
                                try {
                                    Object[] objArr = {Integer.valueOf(ilVar.g()), Integer.valueOf(i)};
                                    this.f8225b.a(ilVar);
                                    this.f8224a.a(ilVar.g());
                                } catch (Exception e) {
                                    e = e;
                                }
                                try {
                                    new Object[1][0] = Integer.valueOf(ilVar.g());
                                    j2 = j;
                                    i = 0;
                                } catch (Exception e2) {
                                    e = e2;
                                    i = 0;
                                    Object[] objArr2 = {Integer.valueOf(ilVar.g()), e};
                                    j2 = 300000;
                                }
                            } else {
                                j2 = j;
                            }
                        }
                        j = 0;
                        if (j > 0) {
                        }
                    } catch (Exception unused) {
                        return;
                    }
                } catch (InterruptedException unused2) {
                    return;
                }
            }
            this.f8224a.flush();
            if (j2 > 0) {
                synchronized (this.f8226c) {
                    this.e = false;
                    new Object[1][0] = Long.valueOf(j2);
                    this.f8226c.wait(j2);
                }
            } else {
                synchronized (this.f8226c) {
                    this.e = false;
                    if (this.f8225b == null || this.f8224a.c()) {
                        this.f8226c.wait();
                    }
                }
            }
        }
    }

    final void a(boolean z) {
        synchronized (this.f8226c) {
            this.e = z;
            this.f8226c.notify();
        }
    }

    public final void a() {
        if (this.f8225b == null || this.f8224a.c()) {
            return;
        }
        a(true);
    }
}
