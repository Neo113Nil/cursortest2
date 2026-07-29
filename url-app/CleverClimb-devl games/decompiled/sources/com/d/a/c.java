package com.d.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import com.cmplay.policy.gdpr.DimenUtils;
import com.d.a.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: Fetch.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Handler f4431a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentMap<com.d.a.d.b, d> f4432b = new ConcurrentHashMap();
    private static final d.a h = new d.a() { // from class: com.d.a.c.1
        @Override // com.d.a.d.a
        public void a(com.d.a.d.b bVar) {
            c.f4432b.remove(bVar);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private final Context f4433c;

    /* renamed from: d, reason: collision with root package name */
    private final LocalBroadcastManager f4434d;
    private final com.d.a.a f;
    private final List<com.d.a.c.a> e = new ArrayList();
    private volatile boolean g = false;
    private final BroadcastReceiver i = new BroadcastReceiver() { // from class: com.d.a.c.2

        /* renamed from: b, reason: collision with root package name */
        private long f4436b;

        /* renamed from: c, reason: collision with root package name */
        private int f4437c;

        /* renamed from: d, reason: collision with root package name */
        private int f4438d;
        private long e;
        private long f;
        private int g;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            this.f4436b = intent.getLongExtra("com.tonyodev.fetch.extra_id", -1L);
            this.f4437c = intent.getIntExtra("com.tonyodev.fetch.extra_status", -1);
            this.f4438d = intent.getIntExtra("com.tonyodev.fetch.extra_progress", -1);
            this.e = intent.getLongExtra("com.tonyodev.fetch.extra_downloaded_bytes", -1L);
            this.f = intent.getLongExtra("com.tonyodev.fetch.extra_file_size", -1L);
            this.g = intent.getIntExtra("com.tonyodev.fetch.extra_error", -1);
            try {
                Iterator g = c.this.g();
                while (g.hasNext()) {
                    ((com.d.a.c.a) g.next()).onUpdate(this.f4436b, this.f4437c, this.f4438d, this.e, this.f, this.g);
                }
            } catch (Exception e) {
                if (c.this.f()) {
                    e.printStackTrace();
                }
            }
        }
    };
    private final BroadcastReceiver j = new BroadcastReceiver() { // from class: com.d.a.c.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            f.a(context);
        }
    };

    private c(Context context) {
        this.f4433c = context.getApplicationContext();
        this.f4434d = LocalBroadcastManager.getInstance(this.f4433c);
        this.f = com.d.a.a.a(this.f4433c);
        this.f.a(f());
        this.f4434d.registerReceiver(this.i, f.a());
        this.f4433c.registerReceiver(this.j, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        a(this.f4433c);
    }

    public static void a(Context context) {
        f.a(context);
    }

    public static c b(Context context) {
        return c(context);
    }

    public static c c(Context context) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        }
        return new c(context);
    }

    public void a() {
        if (d()) {
            return;
        }
        a(true);
        this.e.clear();
        this.f4434d.unregisterReceiver(this.i);
        this.f4433c.unregisterReceiver(this.j);
    }

    public void a(com.d.a.c.a aVar) {
        g.a(this);
        if (aVar == null) {
            throw new NullPointerException("fetchListener cannot be null");
        }
        if (this.e.contains(aVar)) {
            return;
        }
        this.e.add(aVar);
    }

    public long a(com.d.a.d.b bVar) {
        g.a(this);
        if (bVar == null) {
            throw new NullPointerException("Request cannot be null");
        }
        long a2 = g.a();
        try {
            String a3 = bVar.a();
            String b2 = bVar.b();
            int d2 = bVar.d();
            String a4 = g.a(bVar.c(), f());
            File f = g.f(b2);
            if (!this.f.a(a2, a3, b2, 900, a4, f.exists() ? f.length() : 0L, 0L, d2, -1)) {
                throw new com.d.a.b.b("could not insert request", -117);
            }
            a(this.f4433c);
            return a2;
        } catch (com.d.a.b.b e) {
            if (f()) {
                e.printStackTrace();
            }
            return -1L;
        }
    }

    public void b() {
        g.a(this);
        Bundle bundle = new Bundle();
        bundle.putInt("com.tonyodev.fetch.action_type", 319);
        f.a(this.f4433c, bundle);
    }

    public void a(long j) {
        g.a(this);
        Bundle bundle = new Bundle();
        bundle.putInt("com.tonyodev.fetch.action_type", 311);
        bundle.putLong("com.tonyodev.fetch.extra_id", j);
        f.a(this.f4433c, bundle);
    }

    public void b(long j) {
        g.a(this);
        Bundle bundle = new Bundle();
        bundle.putInt("com.tonyodev.fetch.action_type", 312);
        bundle.putLong("com.tonyodev.fetch.extra_id", j);
        f.a(this.f4433c, bundle);
    }

    public void c(long j) {
        g.a(this);
        Bundle bundle = new Bundle();
        bundle.putInt("com.tonyodev.fetch.action_type", 318);
        bundle.putLong("com.tonyodev.fetch.extra_id", j);
        f.a(this.f4433c, bundle);
    }

    public synchronized com.d.a.d.c d(long j) {
        g.a(this);
        return g.a(this.f.e(j), true, f());
    }

    public synchronized File e(long j) {
        g.a(this);
        com.d.a.d.c a2 = g.a(this.f.e(j), true, f());
        if (a2 != null && a2.b() == 903) {
            File f = g.f(a2.d());
            if (f.exists()) {
                return f;
            }
            return null;
        }
        return null;
    }

    public boolean c() {
        return !d();
    }

    boolean d() {
        return this.g;
    }

    private void a(boolean z) {
        this.g = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        return f.c(this.f4433c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Iterator<com.d.a.c.a> g() {
        return this.e.iterator();
    }

    /* compiled from: Fetch.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f4440a;

        /* renamed from: b, reason: collision with root package name */
        private final List<Bundle> f4441b = new ArrayList();

        public a(Context context) {
            if (context == null) {
                throw new NullPointerException("Context cannot be null");
            }
            this.f4440a = context;
        }

        public a a(boolean z) {
            Bundle bundle = new Bundle();
            bundle.putInt("com.tonyodev.fetch.action_type", DimenUtils.DENSITY_XHIGH);
            bundle.putBoolean("com.tonyodev.fetch.extra_logging_id", z);
            this.f4441b.add(bundle);
            return this;
        }

        public a a(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt("com.tonyodev.fetch.action_type", 321);
            bundle.putInt("com.tonyodev.fetch.extra_concurrent_download_limit", i);
            this.f4441b.add(bundle);
            return this;
        }

        public void a() {
            Iterator<Bundle> it = this.f4441b.iterator();
            while (it.hasNext()) {
                f.a(this.f4440a, it.next());
            }
        }
    }
}
