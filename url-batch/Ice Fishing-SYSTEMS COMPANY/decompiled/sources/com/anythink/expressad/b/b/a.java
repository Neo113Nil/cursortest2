package com.anythink.expressad.b.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.z;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static String f18307a = "mtg_retry_report=1";

    /* renamed from: b, reason: collision with root package name */
    public static int f18308b = 10000;

    /* renamed from: c, reason: collision with root package name */
    public static final int f18309c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f18310d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static int f18311e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static int f18312f = 50;

    /* renamed from: g, reason: collision with root package name */
    public static int f18313g = 600000;

    /* renamed from: h, reason: collision with root package name */
    public static int f18314h = 0;
    public static int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static int f18315j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static int f18316k = 3;

    /* renamed from: l, reason: collision with root package name */
    public static int f18317l = 4;

    /* renamed from: m, reason: collision with root package name */
    public static int f18318m = 5;

    /* renamed from: n, reason: collision with root package name */
    private static String f18319n = "RetryReportControl";

    /* renamed from: q, reason: collision with root package name */
    private static int f18320q;

    /* renamed from: r, reason: collision with root package name */
    private static int f18321r;

    /* renamed from: o, reason: collision with root package name */
    private ConcurrentHashMap<String, com.anythink.expressad.b.b.b> f18322o;

    /* renamed from: p, reason: collision with root package name */
    private c f18323p;

    /* renamed from: s, reason: collision with root package name */
    private BroadcastReceiver f18324s;

    /* renamed from: t, reason: collision with root package name */
    private final Handler f18325t;

    /* renamed from: com.anythink.expressad.b.b.a$1, reason: invalid class name */
    public class AnonymousClass1 extends BroadcastReceiver {
        public AnonymousClass1() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                a.this.f18325t.sendEmptyMessage(2);
            }
        }
    }

    /* renamed from: com.anythink.expressad.b.b.a$a, reason: collision with other inner class name */
    public static class C0114a {

        /* renamed from: a, reason: collision with root package name */
        private static a f18327a = new a(0);

        private C0114a() {
        }
    }

    public static class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                a.a(a.a());
            } else {
                Object obj = message.obj;
                if (obj instanceof String) {
                    a.a().a((String) obj, com.anythink.expressad.b.b.b.f18328a);
                }
            }
        }
    }

    public /* synthetic */ a(byte b9) {
        this();
    }

    private void c() {
        try {
            if (this.f18324s == null) {
                this.f18324s = new AnonymousClass1();
                Context g9 = t.b().g();
                if (g9 != null) {
                    g9.registerReceiver(this.f18324s, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    private void d() {
        Context g9;
        if (this.f18324s == null || (g9 = t.b().g()) == null) {
            return;
        }
        g9.unregisterReceiver(this.f18324s);
    }

    private a() {
        this.f18322o = new ConcurrentHashMap<>();
        this.f18323p = new c(f18312f);
        this.f18325t = new b(Looper.getMainLooper());
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.foundation.b.a.c().f();
        com.anythink.expressad.f.a b9 = com.anythink.expressad.f.b.b();
        f18311e = b9.T();
        f18308b = b9.V() * 1000;
        f18313g = b9.U() * 1000;
        f18320q = b9.S();
        f18321r = b9.R();
        try {
            if (this.f18324s == null) {
                this.f18324s = new AnonymousClass1();
                Context g9 = t.b().g();
                if (g9 != null) {
                    g9.registerReceiver(this.f18324s, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public static a a() {
        return C0114a.f18327a;
    }

    private void b() {
        c cVar = this.f18323p;
        if (cVar != null) {
            Iterator<String> it = cVar.a().iterator();
            while (it.hasNext()) {
                a(it.next(), com.anythink.expressad.b.b.b.f18329b);
            }
        }
    }

    private void a(String str, com.anythink.expressad.b.b.b bVar) {
        if (this.f18323p == null) {
            this.f18323p = new c(f18312f);
        }
        this.f18323p.a(str, bVar);
    }

    private static boolean b(int i4) {
        return i4 == i || i4 == f18315j;
    }

    private void a(String str) {
        Message obtainMessage = this.f18325t.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = str;
        this.f18325t.sendMessageDelayed(obtainMessage, f18308b);
    }

    private static boolean c(int i4) {
        return a(i4) || b(i4) || i4 == f18318m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i4) {
        String sb;
        c cVar = this.f18323p;
        if (cVar != null) {
            com.anythink.expressad.b.b.b b9 = cVar.b(str);
            this.f18323p.a(str);
            if (b9 == null) {
                com.anythink.expressad.b.b.b bVar = this.f18322o.get(str);
                if (bVar == null || System.currentTimeMillis() > bVar.h() + f18313g || bVar.g() >= f18311e || i4 == com.anythink.expressad.b.b.b.f18329b) {
                    return;
                }
                a(str);
                return;
            }
            if (System.currentTimeMillis() <= b9.h() + f18313g) {
                b9.a(i4);
                this.f18322o.put(str, b9);
                if (z.c(str) == 0) {
                    StringBuilder c4 = AbstractC5088e.c(str, "?");
                    c4.append(f18307a);
                    sb = c4.toString();
                } else {
                    StringBuilder c9 = AbstractC5088e.c(str, "&");
                    c9.append(f18307a);
                    sb = c9.toString();
                }
                com.anythink.expressad.b.a.a(t.b().g(), b9.f(), b9.e(), sb, b9.a(), b9.b(), b9.d());
            }
        }
    }

    private static boolean a(int i4) {
        return i4 == f18317l || i4 == f18316k;
    }

    public final void a(String str, String str2, d dVar, String str3, boolean z8, boolean z9, int i4) {
        if ((a(i4) || b(i4) || i4 == f18318m) && !TextUtils.isEmpty(str)) {
            String replace = str.replace("?" + f18307a, "").replace("&" + f18307a, "");
            if (this.f18322o == null) {
                this.f18322o = new ConcurrentHashMap<>();
            }
            com.anythink.expressad.b.b.b remove = this.f18322o.remove(replace);
            if (remove == null) {
                remove = new com.anythink.expressad.b.b.b(str, str2);
                remove.b(i4);
                remove.a(z8);
                remove.b(z9);
                remove.a(dVar);
                remove.a(str3);
            } else if (remove.c() != com.anythink.expressad.b.b.b.f18329b) {
                remove.b(str2);
            }
            if ((!a(i4) || f18320q == 0) && ((!b(i4) || f18321r == 0) && i4 != f18318m)) {
                return;
            }
            if (System.currentTimeMillis() < remove.h() + f18313g) {
                if (this.f18323p == null) {
                    this.f18323p = new c(f18312f);
                }
                this.f18323p.a(replace, remove);
                if (remove.c() != com.anythink.expressad.b.b.b.f18328a || remove.g() > f18311e) {
                    return;
                }
                a(replace);
                return;
            }
            remove.c();
        }
    }

    public static /* synthetic */ void a(a aVar) {
        c cVar = aVar.f18323p;
        if (cVar != null) {
            Iterator<String> it = cVar.a().iterator();
            while (it.hasNext()) {
                aVar.a(it.next(), com.anythink.expressad.b.b.b.f18329b);
            }
        }
    }
}
