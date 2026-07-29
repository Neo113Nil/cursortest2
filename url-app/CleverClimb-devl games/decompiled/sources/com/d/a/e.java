package com.d.a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FetchRunnable.java */
/* loaded from: classes.dex */
final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final long f4459a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4460b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4461c;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.d.a.d.a> f4462d;
    private final boolean e;
    private final long f;
    private final Context g;
    private final LocalBroadcastManager h;
    private final a i;
    private volatile boolean j = false;
    private HttpURLConnection k;
    private BufferedInputStream l;
    private RandomAccessFile m;
    private int n;
    private long o;
    private long p;

    private boolean a(int i) {
        return i == 200 || i == 202 || i == 206;
    }

    static IntentFilter a() {
        return new IntentFilter("com.tonyodev.fetch.action_done");
    }

    e(Context context, long j, String str, String str2, List<com.d.a.d.a> list, long j2, boolean z, long j3) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        }
        if (str == null) {
            throw new NullPointerException("Url cannot be null");
        }
        if (str2 == null) {
            throw new NullPointerException("FilePath cannot be null");
        }
        if (list == null) {
            this.f4462d = new ArrayList();
        } else {
            this.f4462d = list;
        }
        this.f4459a = j;
        this.f4460b = str;
        this.f4461c = str2;
        this.p = j2;
        this.g = context.getApplicationContext();
        this.h = LocalBroadcastManager.getInstance(this.g);
        this.i = a.a(this.g);
        this.e = z;
        this.f = j3;
        this.i.a(z);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                d();
                g.g(this.f4461c);
                this.o = g.d(this.f4461c);
                this.n = g.a(this.o, this.p);
                this.i.a(this.f4459a, this.o, this.p);
                this.k.setRequestProperty("Range", "bytes=" + this.o + "-");
            } catch (Exception e) {
                if (this.e) {
                    e.printStackTrace();
                }
                int a2 = b.a(e.getMessage());
                if (b(a2)) {
                    if (this.i.a(this.f4459a, 900, -1)) {
                        g.a(this.h, this.f4459a, 900, this.n, this.o, this.p, -1);
                    }
                } else if (this.i.a(this.f4459a, 904, a2)) {
                    g.a(this.h, this.f4459a, 904, this.n, this.o, this.p, a2);
                }
            }
            if (i()) {
                throw new com.d.a.b.a("DIE", -118);
            }
            this.k.connect();
            int responseCode = this.k.getResponseCode();
            if (a(responseCode)) {
                if (i()) {
                    throw new com.d.a.b.a("DIE", -118);
                }
                if (this.p < 1) {
                    e();
                    this.i.a(this.f4459a, this.o, this.p);
                    this.n = g.a(this.o, this.p);
                }
                this.m = new RandomAccessFile(this.f4461c, "rw");
                if (responseCode == 206) {
                    this.m.seek(this.o);
                } else {
                    this.m.seek(0L);
                }
                this.l = new BufferedInputStream(this.k.getInputStream());
                f();
                this.i.a(this.f4459a, this.o, this.p);
                if (i()) {
                    throw new com.d.a.b.a("DIE", -118);
                }
                if (this.o >= this.p && !i()) {
                    if (this.p < 1) {
                        this.p = g.d(this.f4461c);
                        this.i.a(this.f4459a, this.o, this.p);
                        this.n = g.a(this.o, this.p);
                    } else {
                        this.n = g.a(this.o, this.p);
                    }
                    if (this.i.a(this.f4459a, 903, -1)) {
                        g.a(this.h, this.f4459a, 903, this.n, this.o, this.p, -1);
                    }
                }
                return;
            }
            throw new IllegalStateException("SSRV:" + responseCode);
        } finally {
            g();
            h();
        }
    }

    private void d() throws IOException {
        this.k = (HttpURLConnection) new URL(this.f4460b).openConnection();
        this.k.setRequestMethod("GET");
        this.k.setReadTimeout(20000);
        this.k.setConnectTimeout(15000);
        this.k.setUseCaches(false);
        this.k.setDefaultUseCaches(false);
        this.k.setInstanceFollowRedirects(true);
        this.k.setDoInput(true);
        for (com.d.a.d.a aVar : this.f4462d) {
            this.k.addRequestProperty(aVar.a(), aVar.b());
        }
    }

    private void e() {
        try {
            this.p = this.o + Long.valueOf(this.k.getHeaderField("Content-Length")).longValue();
        } catch (Exception unused) {
            this.p = -1L;
        }
    }

    private void f() throws IOException {
        byte[] bArr = new byte[1024];
        long nanoTime = System.nanoTime();
        while (true) {
            int read = this.l.read(bArr, 0, 1024);
            if (read == -1 || i()) {
                return;
            }
            this.m.write(bArr, 0, read);
            this.o += read;
            if (g.a(nanoTime, System.nanoTime(), this.f) && !i()) {
                this.n = g.a(this.o, this.p);
                g.a(this.h, this.f4459a, 901, this.n, this.o, this.p, -1);
                this.i.a(this.f4459a, this.o, this.p);
                nanoTime = System.nanoTime();
            }
        }
    }

    private boolean b(int i) {
        if (g.b(this.g) && i != -118) {
            switch (i) {
            }
            return true;
        }
        return true;
    }

    private void g() {
        try {
            if (this.l != null) {
                this.l.close();
            }
        } catch (IOException e) {
            if (this.e) {
                e.printStackTrace();
            }
        }
        try {
            if (this.m != null) {
                this.m.close();
            }
        } catch (IOException e2) {
            if (this.e) {
                e2.printStackTrace();
            }
        }
        if (this.k != null) {
            this.k.disconnect();
        }
    }

    private void h() {
        Intent intent = new Intent("com.tonyodev.fetch.action_done");
        intent.putExtra("com.tonyodev.fetch.extra_id", this.f4459a);
        this.h.sendBroadcast(intent);
    }

    private boolean i() {
        return this.j;
    }

    synchronized void b() {
        this.j = true;
    }

    synchronized long c() {
        return this.f4459a;
    }

    static long a(Intent intent) {
        if (intent == null) {
            return -1L;
        }
        return intent.getLongExtra("com.tonyodev.fetch.extra_id", -1L);
    }
}
