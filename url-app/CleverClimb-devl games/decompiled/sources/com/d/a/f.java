package com.d.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.helper.ItemTouchHelper;
import com.applovin.sdk.AppLovinErrorCodes;
import com.cmplay.base.util.webview.util.NetworkUtil;
import com.cmplay.policy.gdpr.DimenUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: FetchService.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static f f4463a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4464b;

    /* renamed from: c, reason: collision with root package name */
    private final a f4465c;

    /* renamed from: d, reason: collision with root package name */
    private final LocalBroadcastManager f4466d;
    private final SharedPreferences e;
    private int k;
    private boolean l;
    private long m;
    private int n;
    private final ExecutorService f = Executors.newSingleThreadExecutor();
    private final List<BroadcastReceiver> g = new ArrayList();
    private final ConcurrentHashMap<Long, e> h = new ConcurrentHashMap<>();
    private volatile boolean i = false;
    private volatile boolean j = false;
    private final BroadcastReceiver o = new BroadcastReceiver() { // from class: com.d.a.f.9
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                long a2 = e.a(intent);
                if (f.this.h.containsKey(Long.valueOf(a2))) {
                    f.this.h.remove(Long.valueOf(a2));
                }
                f.this.c();
            }
        }
    };

    public static void a(Context context, Bundle bundle) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        b(context).a(bundle);
    }

    public static void a(Context context) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        }
        Bundle bundle = new Bundle();
        bundle.putInt("com.tonyodev.fetch.action_type", 315);
        b(context).a(bundle);
    }

    public static f b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null");
        }
        if (f4463a == null || f4463a.j) {
            f4463a = new f(context);
        }
        return f4463a;
    }

    public static IntentFilter a() {
        return new IntentFilter("com.tonyodev.fetch.event_action_update");
    }

    private f(Context context) {
        this.k = 1;
        this.l = true;
        this.m = 2000L;
        this.n = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;
        this.f4464b = context.getApplicationContext();
        this.f4466d = LocalBroadcastManager.getInstance(context);
        this.e = this.f4464b.getSharedPreferences("com.tonyodev.fetch.shared_preferences", 0);
        this.f4465c = a.a(context);
        this.f4466d.registerReceiver(this.o, e.a());
        this.g.add(this.o);
        this.k = j();
        this.n = i();
        this.l = k();
        this.m = l();
        this.f4465c.a(this.l);
        if (this.f.isShutdown()) {
            return;
        }
        this.f.execute(new Runnable() { // from class: com.d.a.f.1
            @Override // java.lang.Runnable
            public void run() {
                f.this.f4465c.h();
                f.this.f4465c.g();
            }
        });
    }

    public void a(Bundle bundle) {
        if (bundle == null) {
            throw new IllegalArgumentException("Bundle cannot be null");
        }
        b(bundle);
    }

    public void b() {
        this.j = true;
        if (!this.f.isShutdown()) {
            this.f.shutdown();
        }
        d();
        Iterator<BroadcastReceiver> it = this.g.iterator();
        while (it.hasNext()) {
            this.f4466d.unregisterReceiver(it.next());
        }
        this.g.clear();
    }

    private void b(final Bundle bundle) {
        try {
            if (this.f.isShutdown()) {
                return;
            }
            this.f.execute(new Runnable() { // from class: com.d.a.f.2
                @Override // java.lang.Runnable
                public void run() {
                    f.this.f4465c.h();
                    long j = bundle.getLong("com.tonyodev.fetch.extra_id", -1L);
                    switch (bundle.getInt("com.tonyodev.fetch.action_type", -1)) {
                        case 310:
                            f.this.a(bundle.getString("com.tonyodev.fetch.extra_url"), bundle.getString("com.tonyodev.fetch.extra_file_path"), (ArrayList<Bundle>) bundle.getParcelableArrayList("com.tonyodev.fetch.extra_headers"), bundle.getInt("com.tonyodev.fetch.extra_priority", NetworkUtil.NATIVE_ERROR));
                            break;
                        case 311:
                            f.this.c(j);
                            break;
                        case 312:
                            f.this.b(j);
                            break;
                        case 313:
                            f.this.e(j);
                            break;
                        case 314:
                            f.this.a(bundle.getInt("com.tonyodev.fetch.extra_network_id", ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION));
                            break;
                        case 315:
                            f.this.c();
                            break;
                        case 316:
                            long j2 = bundle.getLong("com.tonyodev.fetch.extra_query_id", -1L);
                            f.this.a(bundle.getInt("com.tonyodev.fetch.extra_query_type", 481), j2, j, bundle.getInt("com.tonyodev.fetch.extra_status", -1));
                            break;
                        case 317:
                            f.this.a(j, bundle.getInt("com.tonyodev.fetch.extra_priority", NetworkUtil.NATIVE_ERROR));
                            break;
                        case 318:
                            f.this.i(j);
                            break;
                        case 319:
                            f.this.e();
                            break;
                        case DimenUtils.DENSITY_XHIGH /* 320 */:
                            f.this.a(bundle.getBoolean("com.tonyodev.fetch.extra_logging_id", true));
                            break;
                        case 321:
                            f.this.b(bundle.getInt("com.tonyodev.fetch.extra_concurrent_download_limit", 1));
                            break;
                        case 322:
                            f.this.a(j, bundle.getString("com.tonyodev.fetch.extra_url"));
                            break;
                        case 323:
                            f.this.j(bundle.getLong("com.tonyodev.fetch.extra_on_update_interval", 2000L));
                            break;
                        case 324:
                            f.this.g(j);
                            break;
                        case 325:
                            f.this.g();
                            break;
                        default:
                            f.this.c();
                            break;
                    }
                }
            });
        } catch (Exception e) {
            if (this.l) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c() {
        if (!this.j && !this.i) {
            boolean b2 = g.b(this.f4464b);
            boolean a2 = g.a(this.f4464b);
            if ((!b2 || (this.n == 201 && !a2)) && this.h.size() > 0) {
                this.i = true;
                d();
                this.i = false;
            } else if (b2 && !this.i && this.h.size() < this.k && this.f4465c.f()) {
                this.i = true;
                try {
                    Cursor e = this.f4465c.e();
                    if (e != null && !e.isClosed() && e.getCount() > 0) {
                        com.d.a.d.c a3 = g.a(e, true, this.l);
                        e eVar = new e(this.f4464b, a3.a(), a3.c(), a3.d(), a3.i(), a3.g(), this.l, this.m);
                        this.f4465c.a(a3.a(), 901, -1);
                        this.h.put(Long.valueOf(eVar.c()), eVar);
                        new Thread(eVar).start();
                    }
                } catch (Exception e2) {
                    if (this.l) {
                        e2.printStackTrace();
                    }
                }
                this.i = false;
                if (this.h.size() < this.k && this.f4465c.f()) {
                    c();
                }
            } else if (!this.i && this.h.size() == 0 && !this.f4465c.f()) {
                this.j = true;
                b();
            }
        }
    }

    private void d() {
        Iterator<Long> it = this.h.keySet().iterator();
        while (it.hasNext()) {
            e eVar = this.h.get(it.next());
            if (eVar != null) {
                eVar.b();
            }
        }
    }

    private void a(long j) {
        e eVar;
        if (!this.h.containsKey(Long.valueOf(j)) || (eVar = this.h.get(Long.valueOf(j))) == null) {
            return;
        }
        eVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4 A[Catch: all -> 0x009b, TryCatch #3 {all -> 0x009b, blocks: (B:37:0x000c, B:8:0x001c, B:30:0x0034, B:11:0x003d, B:17:0x0061, B:25:0x00a0, B:27:0x00a4, B:28:0x00a7, B:21:0x0065, B:22:0x0071, B:44:0x007a, B:45:0x009a), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(String str, String str2, ArrayList<Bundle> arrayList, int i) {
        ArrayList<Bundle> arrayList2;
        long a2;
        String b2;
        long j;
        a aVar;
        try {
            if (str == null || str2 == null) {
                try {
                    throw new com.d.a.b.b("Request was not properly formatted. url:" + str + ", filePath:" + str2, -116);
                } catch (com.d.a.b.b e) {
                    e = e;
                    arrayList2 = arrayList;
                }
            } else {
                if (arrayList == null) {
                    try {
                        arrayList2 = new ArrayList<>();
                    } catch (com.d.a.b.b e2) {
                        e = e2;
                        arrayList2 = arrayList;
                        if (this.l) {
                        }
                        a("com.tonyodev.fetch.event_action_enqueue_failed", -1L, str, str2, AppLovinErrorCodes.INVALID_URL, arrayList2, i, e.a());
                    }
                } else {
                    arrayList2 = arrayList;
                }
                try {
                    a2 = g.a();
                    b2 = g.b(arrayList2, this.l);
                    long j2 = 0;
                    File f = g.f(str2);
                    if (f.exists()) {
                        try {
                            j2 = f.length();
                        } catch (com.d.a.b.b e3) {
                            e = e3;
                            if (this.l) {
                            }
                            a("com.tonyodev.fetch.event_action_enqueue_failed", -1L, str, str2, AppLovinErrorCodes.INVALID_URL, arrayList2, i, e.a());
                        }
                    }
                    j = j2;
                    aVar = this.f4465c;
                    try {
                    } catch (com.d.a.b.b e4) {
                        e = e4;
                        arrayList2 = aVar;
                    }
                } catch (com.d.a.b.b e5) {
                    e = e5;
                }
                if (!aVar.a(a2, str, str2, 900, b2, j, 0L, i, -1)) {
                    throw new com.d.a.b.b("could not enqueue request", -117);
                }
                a("com.tonyodev.fetch.event_action_enqueued", a2, str, str2, 900, arrayList2, i, -1);
            }
            if (this.l) {
                e.printStackTrace();
            }
            a("com.tonyodev.fetch.event_action_enqueue_failed", -1L, str, str2, AppLovinErrorCodes.INVALID_URL, arrayList2, i, e.a());
        } finally {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        com.d.a.d.c a2;
        if (this.h.containsKey(Long.valueOf(j))) {
            return;
        }
        if (this.f4465c.b(j) && (a2 = g.a(this.f4465c.e(j), true, this.l)) != null) {
            g.a(this.f4466d, a2.a(), a2.b(), a2.e(), a2.f(), a2.g(), a2.h());
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final long j) {
        if (this.h.containsKey(Long.valueOf(j))) {
            this.i = true;
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.d.a.f.3
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    if (e.a(intent) == j) {
                        f.this.d(j);
                        f.this.f4466d.unregisterReceiver(this);
                        f.this.g.remove(this);
                        f.this.i = false;
                        f.this.c();
                    }
                }
            };
            this.g.add(broadcastReceiver);
            this.f4466d.registerReceiver(broadcastReceiver, e.a());
            a(j);
            return;
        }
        d(j);
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(long j) {
        com.d.a.d.c a2;
        if (!this.f4465c.a(j) || (a2 = g.a(this.f4465c.e(j), true, this.l)) == null) {
            return;
        }
        g.a(this.f4466d, a2.a(), a2.b(), a2.e(), a2.f(), a2.g(), a2.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final long j) {
        if (this.h.containsKey(Long.valueOf(j))) {
            this.i = true;
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.d.a.f.4
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    if (e.a(intent) == j) {
                        f.this.f(j);
                        f.this.f4466d.unregisterReceiver(this);
                        f.this.g.remove(this);
                        f.this.i = false;
                        f.this.c();
                    }
                }
            };
            this.g.add(broadcastReceiver);
            this.f4466d.registerReceiver(broadcastReceiver, e.a());
            a(j);
            return;
        }
        f(j);
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(long j) {
        com.d.a.d.c a2 = g.a(this.f4465c.e(j), true, this.l);
        if (a2 == null || !this.f4465c.c(j)) {
            return;
        }
        g.c(a2.d());
        g.a(this.f4466d, j, 905, 0, 0L, 0L, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.h.size() > 0) {
            this.i = true;
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.d.a.f.5
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    if (intent != null) {
                        f.this.f(e.a(intent));
                    }
                    if (f.this.h.size() == 0) {
                        f.this.f();
                        f.this.f4466d.unregisterReceiver(this);
                        f.this.g.remove(this);
                        f.this.i = false;
                        f.this.c();
                    }
                }
            };
            this.g.add(broadcastReceiver);
            this.f4466d.registerReceiver(broadcastReceiver, e.a());
            d();
            return;
        }
        f();
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        List<com.d.a.d.c> b2 = g.b(this.f4465c.d(), true, this.l);
        if (b2 == null || !this.f4465c.c()) {
            return;
        }
        for (com.d.a.d.c cVar : b2) {
            g.c(cVar.d());
            g.a(this.f4466d, cVar.a(), 905, 0, 0L, 0L, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.h.size() > 0) {
            this.i = true;
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.d.a.f.6
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    if (intent != null) {
                        f.this.h(e.a(intent));
                    }
                    if (f.this.h.size() == 0) {
                        f.this.h();
                        f.this.f4466d.unregisterReceiver(this);
                        f.this.g.remove(this);
                        f.this.i = false;
                        f.this.c();
                    }
                }
            };
            this.g.add(broadcastReceiver);
            this.f4466d.registerReceiver(broadcastReceiver, e.a());
            d();
            return;
        }
        h();
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        List<com.d.a.d.c> b2 = g.b(this.f4465c.d(), true, this.l);
        if (b2 == null || !this.f4465c.c()) {
            return;
        }
        for (com.d.a.d.c cVar : b2) {
            g.a(this.f4466d, cVar.a(), 905, cVar.e(), cVar.f(), cVar.g(), -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(final long j) {
        if (this.h.containsKey(Long.valueOf(j))) {
            this.i = true;
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.d.a.f.7
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    if (e.a(intent) == j) {
                        f.this.h(j);
                        f.this.f4466d.unregisterReceiver(this);
                        f.this.g.remove(this);
                        f.this.i = false;
                        f.this.c();
                    }
                }
            };
            this.g.add(broadcastReceiver);
            this.f4466d.registerReceiver(broadcastReceiver, e.a());
            a(j);
            return;
        }
        h(j);
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(long j) {
        com.d.a.d.c a2 = g.a(this.f4465c.e(j), true, this.l);
        if (a2 == null || !this.f4465c.c(j)) {
            return;
        }
        g.a(this.f4466d, j, 905, a2.e(), a2.f(), a2.g(), -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, long j, long j2, int i2) {
        Cursor e;
        if (i == 480) {
            e = this.f4465c.e(j2);
        } else if (i == 482) {
            e = this.f4465c.a(i2);
        } else {
            e = this.f4465c.d();
        }
        a(j, g.c(e, true, this.l));
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j, int i) {
        if (this.f4465c.a(j, i) && this.h.size() > 0) {
            d();
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.n = i;
        this.e.edit().putInt("com.tonyodev.fetch.extra_network_id", i).apply();
        if (this.h.size() > 0) {
            d();
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(long j) {
        com.d.a.d.c a2;
        if (this.h.containsKey(Long.valueOf(j))) {
            return;
        }
        if (this.f4465c.d(j) && (a2 = g.a(this.f4465c.e(j), true, this.l)) != null) {
            g.a(this.f4466d, a2.a(), a2.b(), a2.e(), a2.f(), a2.g(), a2.h());
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final long j, final String str) {
        if (this.h.containsKey(Long.valueOf(j))) {
            this.i = true;
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.d.a.f.8
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    if (e.a(intent) == j) {
                        f.this.b(j, str);
                        f.this.f4466d.unregisterReceiver(this);
                        f.this.g.remove(this);
                        f.this.i = false;
                        f.this.c();
                    }
                }
            };
            this.g.add(broadcastReceiver);
            this.f4466d.registerReceiver(broadcastReceiver, e.a());
            a(j);
            return;
        }
        b(j, str);
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j, String str) {
        this.f4465c.a(j, str);
        this.f4465c.d(j);
    }

    private int i() {
        return this.e.getInt("com.tonyodev.fetch.extra_network_id", ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION);
    }

    private void a(String str, long j, String str2, String str3, int i, ArrayList<Bundle> arrayList, int i2, int i3) {
        Intent intent = new Intent(str);
        intent.putExtra("com.tonyodev.fetch.extra_id", j);
        intent.putExtra("com.tonyodev.fetch.extra_status", i);
        intent.putExtra("com.tonyodev.fetch.extra_url", str2);
        intent.putExtra("com.tonyodev.fetch.extra_file_path", str3);
        intent.putExtra("com.tonyodev.fetch.extra_headers", arrayList);
        intent.putExtra("com.tonyodev.fetch.extra_progress", 0);
        intent.putExtra("com.tonyodev.fetch.extra_file_size", 0L);
        intent.putExtra("com.tonyodev.fetch.extra_error", i3);
        intent.putExtra("com.tonyodev.fetch.extra_priority", i2);
        this.f4466d.sendBroadcast(intent);
    }

    private void a(long j, ArrayList<Bundle> arrayList) {
        Intent intent = new Intent("com.tonyodev.fetch.event_action_query");
        intent.putExtra("com.tonyodev.fetch.extra_query_id", j);
        intent.putExtra("com.tonyodev.fetch.extra_query_result", arrayList);
        this.f4466d.sendBroadcast(intent);
    }

    private int j() {
        return this.e.getInt("com.tonyodev.fetch.extra_concurrent_download_limit", 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (i < 1) {
            i = 1;
        }
        this.k = i;
        this.e.edit().putInt("com.tonyodev.fetch.extra_concurrent_download_limit", i).apply();
        if (this.h.size() > 0) {
            d();
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        this.l = z;
        this.e.edit().putBoolean("com.tonyodev.fetch.extra_logging_id", z).apply();
        this.f4465c.a(this.l);
        c();
    }

    private boolean k() {
        return this.e.getBoolean("com.tonyodev.fetch.extra_logging_id", true);
    }

    static boolean c(Context context) {
        return context.getSharedPreferences("com.tonyodev.fetch.shared_preferences", 0).getBoolean("com.tonyodev.fetch.extra_logging_id", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(long j) {
        this.m = j;
        this.e.edit().putLong("com.tonyodev.fetch.extra_on_update_interval", j).apply();
        if (this.h.size() > 0) {
            d();
        }
        c();
    }

    private long l() {
        this.m = this.e.getLong("com.tonyodev.fetch.extra_on_update_interval", 2000L);
        return this.m;
    }
}
