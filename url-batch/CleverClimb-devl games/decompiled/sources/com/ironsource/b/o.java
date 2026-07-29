package com.ironsource.b;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.b.d.c;
import com.ironsource.b.f.v;
import com.ironsource.b.k;
import com.ironsource.b.m;
import com.ironsource.environment.NetworkStateReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MediationInitializer.java */
/* loaded from: classes2.dex */
class o implements NetworkStateReceiver.a {

    /* renamed from: a, reason: collision with root package name */
    private static o f6972a;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private HandlerThread l;
    private Handler m;
    private AtomicBoolean o;
    private NetworkStateReceiver p;
    private CountDownTimer q;
    private Activity s;
    private String t;
    private String u;
    private com.ironsource.b.h.h v;
    private String x;
    private v y;
    private boolean z;

    /* renamed from: b, reason: collision with root package name */
    private final String f6973b = "userId";

    /* renamed from: c, reason: collision with root package name */
    private final String f6974c = "appKey";

    /* renamed from: d, reason: collision with root package name */
    private final String f6975d = getClass().getSimpleName();
    private boolean k = false;
    private boolean n = false;
    private List<c> r = new ArrayList();
    private b A = new b() { // from class: com.ironsource.b.o.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                m a2 = m.a();
                if (o.this.a(o.this.t).a()) {
                    o.this.x = "userGenerated";
                } else {
                    o.this.t = a2.a((Context) o.this.s);
                    if (!TextUtils.isEmpty(o.this.t)) {
                        o.this.x = "GAID";
                    } else {
                        o.this.t = com.ironsource.environment.c.l(o.this.s);
                        if (!TextUtils.isEmpty(o.this.t)) {
                            o.this.x = "UUID";
                        } else {
                            o.this.t = "";
                        }
                    }
                    a2.j(o.this.t);
                }
                com.ironsource.b.f.e.a().a("userIdType", o.this.x);
                if (!TextUtils.isEmpty(o.this.t)) {
                    com.ironsource.b.f.e.a().a("userId", o.this.t);
                }
                if (!TextUtils.isEmpty(o.this.u)) {
                    com.ironsource.b.f.e.a().a("appKey", o.this.u);
                }
                o.this.v = a2.a(o.this.s, o.this.t, this.f6985d);
                if (o.this.v != null) {
                    o.this.m.removeCallbacks(this);
                    if (o.this.v.a()) {
                        o.this.a(a.INITIATED);
                        if (o.this.v.g().a().c()) {
                            com.ironsource.b.c.a.a(o.this.s);
                        }
                        List<k.a> b2 = o.this.v.b();
                        Iterator it = o.this.r.iterator();
                        while (it.hasNext()) {
                            ((c) it.next()).a(b2, o.this.d());
                        }
                        if (o.this.y != null) {
                            com.ironsource.b.e.r b3 = o.this.v.g().a().b();
                            if (b3 != null) {
                                o.this.y.a(b3.a());
                                return;
                            } else {
                                o.this.y.a("");
                                return;
                            }
                        }
                        return;
                    }
                    if (o.this.k) {
                        return;
                    }
                    o.this.a(a.INIT_FAILED);
                    o.this.k = true;
                    Iterator it2 = o.this.r.iterator();
                    while (it2.hasNext()) {
                        ((c) it2.next()).a("serverResponseIsNotValid");
                    }
                    return;
                }
                if (o.this.f == 3) {
                    o.this.z = true;
                    Iterator it3 = o.this.r.iterator();
                    while (it3.hasNext()) {
                        ((c) it3.next()).e();
                    }
                }
                if (this.f6983b && o.this.f < o.this.g) {
                    o.this.j = true;
                    o.this.m.postDelayed(this, o.this.e * 1000);
                    if (o.this.f < o.this.h) {
                        o.this.e *= 2;
                    }
                }
                if ((!this.f6983b || o.this.f == o.this.i) && !o.this.k) {
                    o.this.k = true;
                    if (TextUtils.isEmpty(this.f6984c)) {
                        this.f6984c = "noServerResponse";
                    }
                    Iterator it4 = o.this.r.iterator();
                    while (it4.hasNext()) {
                        ((c) it4.next()).a(this.f6984c);
                    }
                    o.this.a(a.INIT_FAILED);
                    com.ironsource.b.d.d.c().a(c.a.API, "Mediation availability false reason: No server response", 1);
                }
                o.p(o.this);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };
    private a w = a.NOT_INIT;

    /* compiled from: MediationInitializer.java */
    enum a {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    /* compiled from: MediationInitializer.java */
    interface c {
        void a(String str);

        void a(List<k.a> list, boolean z);

        void e();
    }

    static /* synthetic */ int p(o oVar) {
        int i = oVar.f;
        oVar.f = i + 1;
        return i;
    }

    /* compiled from: MediationInitializer.java */
    abstract class b implements Runnable {

        /* renamed from: c, reason: collision with root package name */
        String f6984c;

        /* renamed from: b, reason: collision with root package name */
        boolean f6983b = true;

        /* renamed from: d, reason: collision with root package name */
        protected m.a f6985d = new m.a() { // from class: com.ironsource.b.o.b.1
            @Override // com.ironsource.b.m.a
            public void a(String str) {
                b.this.f6983b = false;
                b.this.f6984c = str;
            }
        };

        b() {
        }
    }

    public static synchronized o a() {
        o oVar;
        synchronized (o.class) {
            if (f6972a == null) {
                f6972a = new o();
            }
            oVar = f6972a;
        }
        return oVar;
    }

    private o() {
        this.l = null;
        this.l = new HandlerThread("IronSourceInitiatorHandler");
        this.l.start();
        this.m = new Handler(this.l.getLooper());
        this.e = 1;
        this.f = 0;
        this.g = 62;
        this.h = 12;
        this.i = 5;
        this.o = new AtomicBoolean(true);
        this.j = false;
        this.z = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(a aVar) {
        com.ironsource.b.d.d.c().a(c.a.INTERNAL, "setInitStatus(old status: " + this.w + ", new status: " + aVar + ")", 0);
        this.w = aVar;
    }

    public synchronized void a(Activity activity, String str, String str2, k.a... aVarArr) {
        try {
            if (this.o != null && this.o.compareAndSet(true, false)) {
                a(a.INIT_IN_PROGRESS);
                this.s = activity;
                this.t = str2;
                this.u = str;
                if (com.ironsource.b.h.g.c(activity)) {
                    this.m.post(this.A);
                } else {
                    this.n = true;
                    if (this.p == null) {
                        this.p = new NetworkStateReceiver(activity, this);
                    }
                    activity.getApplicationContext().registerReceiver(this.p, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.b.o.2
                        /* JADX WARN: Type inference failed for: r7v0, types: [com.ironsource.b.o$2$1] */
                        @Override // java.lang.Runnable
                        public void run() {
                            o.this.q = new CountDownTimer(60000L, 15000L) { // from class: com.ironsource.b.o.2.1
                                @Override // android.os.CountDownTimer
                                public void onTick(long j) {
                                    if (j <= 45000) {
                                        o.this.z = true;
                                        Iterator it = o.this.r.iterator();
                                        while (it.hasNext()) {
                                            ((c) it.next()).e();
                                        }
                                    }
                                }

                                @Override // android.os.CountDownTimer
                                public void onFinish() {
                                    if (o.this.k) {
                                        return;
                                    }
                                    o.this.k = true;
                                    Iterator it = o.this.r.iterator();
                                    while (it.hasNext()) {
                                        ((c) it.next()).a("noInternetConnection");
                                    }
                                    com.ironsource.b.d.d.c().a(c.a.API, "Mediation availability false reason: No internet connection", 1);
                                }
                            }.start();
                        }
                    });
                }
            } else {
                com.ironsource.b.d.d.c().a(c.a.API, this.f6975d + ": Multiple calls to init are not allowed", 2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ironsource.environment.NetworkStateReceiver.a
    public void a(boolean z) {
        if (this.n && z) {
            if (this.q != null) {
                this.q.cancel();
            }
            this.n = false;
            this.j = true;
            this.m.post(this.A);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        return this.j;
    }

    public synchronized a b() {
        return this.w;
    }

    public synchronized boolean c() {
        return this.z;
    }

    public void a(c cVar) {
        if (cVar == null) {
            return;
        }
        this.r.add(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.ironsource.b.a.b a(String str) {
        com.ironsource.b.a.b bVar = new com.ironsource.b.a.b();
        if (str != null) {
            if (!a(str, 1, 64)) {
                bVar.a(com.ironsource.b.h.d.a("userId", str, null));
            }
        } else {
            bVar.a(com.ironsource.b.h.d.a("userId", str, "it's missing"));
        }
        return bVar;
    }

    private boolean a(String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }
}
