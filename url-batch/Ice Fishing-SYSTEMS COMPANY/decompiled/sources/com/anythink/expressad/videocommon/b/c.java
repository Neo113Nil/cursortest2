package com.anythink.expressad.videocommon.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.anythink.core.common.res.b.a;
import com.anythink.expressad.foundation.g.f.d.b;
import java.io.File;
import java.io.Serializable;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22377a = "2000077";

    /* renamed from: b, reason: collision with root package name */
    protected static final String f22378b = "CampaignDownLoadTask";

    /* renamed from: d, reason: collision with root package name */
    private static final long f22379d = -510642107992871538L;

    /* renamed from: e, reason: collision with root package name */
    private static final int f22380e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f22381f = 2000;

    /* renamed from: h, reason: collision with root package name */
    private static final int f22382h = 1;
    private static final int i = 2;

    /* renamed from: j, reason: collision with root package name */
    private static final int f22383j = 3;

    /* renamed from: k, reason: collision with root package name */
    private static final int f22384k = 4;

    /* renamed from: l, reason: collision with root package name */
    private static final int f22385l = 5;

    /* renamed from: m, reason: collision with root package name */
    private static final String f22386m = "errorMsg";

    /* renamed from: p, reason: collision with root package name */
    private static final int f22387p = 10010;

    /* renamed from: A, reason: collision with root package name */
    private Object f22388A;

    /* renamed from: B, reason: collision with root package name */
    private Class f22389B;

    /* renamed from: C, reason: collision with root package name */
    private Object f22390C;

    /* renamed from: D, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f22391D;

    /* renamed from: E, reason: collision with root package name */
    private String f22392E;

    /* renamed from: G, reason: collision with root package name */
    private Context f22394G;

    /* renamed from: H, reason: collision with root package name */
    private long f22395H;

    /* renamed from: I, reason: collision with root package name */
    private String f22396I;

    /* renamed from: L, reason: collision with root package name */
    private String f22398L;

    /* renamed from: O, reason: collision with root package name */
    private long f22401O;

    /* renamed from: P, reason: collision with root package name */
    private com.anythink.expressad.videocommon.d.c f22402P;

    /* renamed from: Q, reason: collision with root package name */
    private com.anythink.expressad.videocommon.d.c f22403Q;

    /* renamed from: U, reason: collision with root package name */
    private String f22407U;

    /* renamed from: V, reason: collision with root package name */
    private b.a f22408V;

    /* renamed from: Z, reason: collision with root package name */
    private int f22411Z;

    /* renamed from: c, reason: collision with root package name */
    b f22412c;

    /* renamed from: o, reason: collision with root package name */
    private boolean f22415o;

    /* renamed from: q, reason: collision with root package name */
    private int f22416q;

    /* renamed from: r, reason: collision with root package name */
    private String f22417r;

    /* renamed from: s, reason: collision with root package name */
    private String f22418s;

    /* renamed from: t, reason: collision with root package name */
    private Runnable f22419t;

    /* renamed from: w, reason: collision with root package name */
    private f f22422w;

    /* renamed from: x, reason: collision with root package name */
    private ExecutorService f22423x;

    /* renamed from: y, reason: collision with root package name */
    private p f22424y;

    /* renamed from: z, reason: collision with root package name */
    private Class f22425z;

    /* renamed from: g, reason: collision with root package name */
    private boolean f22413g = false;

    /* renamed from: n, reason: collision with root package name */
    private int f22414n = 1;

    /* renamed from: u, reason: collision with root package name */
    private volatile int f22420u = 0;

    /* renamed from: v, reason: collision with root package name */
    private CopyOnWriteArrayList<f> f22421v = new CopyOnWriteArrayList<>();

    /* renamed from: F, reason: collision with root package name */
    private boolean f22393F = false;
    private long J = 0;

    /* renamed from: K, reason: collision with root package name */
    private int f22397K = 0;

    /* renamed from: M, reason: collision with root package name */
    private boolean f22399M = false;

    /* renamed from: N, reason: collision with root package name */
    private boolean f22400N = false;

    /* renamed from: R, reason: collision with root package name */
    private int f22404R = 100;

    /* renamed from: S, reason: collision with root package name */
    private boolean f22405S = false;

    /* renamed from: T, reason: collision with root package name */
    private boolean f22406T = false;

    /* renamed from: W, reason: collision with root package name */
    private int f22409W = 1;

    /* renamed from: X, reason: collision with root package name */
    private f f22410X = new f() { // from class: com.anythink.expressad.videocommon.b.c.1
        @Override // com.anythink.expressad.videocommon.b.f
        public final void a(long j9, int i4) {
            if (c.this.f22393F) {
                return;
            }
            c.a(c.this, j9, i4);
        }
    };
    private Handler Y = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.videocommon.b.c.2
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 1) {
                c cVar = c.this;
                c.a(cVar, cVar.J, c.this.f22420u);
                return;
            }
            if (i4 == 2) {
                if (c.this.f22420u != 2) {
                    c.this.f22420u = 2;
                    c cVar2 = c.this;
                    c.a(cVar2, cVar2.J, c.this.f22420u);
                    return;
                }
                return;
            }
            if (i4 == 3) {
                if (c.this.f22420u == 4 || c.this.f22420u == 2 || c.this.f22420u == 5) {
                    return;
                }
                c.this.f22420u = 4;
                c cVar3 = c.this;
                c.a(cVar3, cVar3.J, c.this.f22420u);
                return;
            }
            if (i4 == 4) {
                c.this.f22420u = 5;
                c.d(c.this);
                c cVar4 = c.this;
                c.a(cVar4, cVar4.J, c.this.f22420u);
                return;
            }
            if (i4 == 5) {
                c.this.h();
            } else if (i4 == c.f22387p && message.obj != null) {
                c.s();
            }
        }
    };

    public c(Context context, com.anythink.expressad.foundation.d.d dVar, ExecutorService executorService, String str) {
        this.f22415o = false;
        if (context == null && dVar == null) {
            return;
        }
        this.f22401O = System.currentTimeMillis();
        this.f22394G = com.anythink.expressad.foundation.b.a.c().e();
        this.f22391D = dVar;
        this.f22392E = str;
        this.f22423x = executorService;
        if (dVar != null) {
            this.f22396I = dVar.T();
        }
        this.f22407U = com.anythink.expressad.foundation.h.p.d(this.f22396I);
        a.a();
        this.f22398L = a.a(this.f22396I);
        this.f22415o = false;
        try {
            if (!TextUtils.isEmpty(this.f22396I) && this.f22414n != 3) {
                x();
            }
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    private void A() {
        try {
            if (this.f22425z != null) {
                if (this.f22388A == null) {
                }
                if (this.f22389B != null && this.f22390C != null) {
                    return;
                }
                Class<?> cls = Class.forName("com.anythink.expressad.atnative.controller.NativeController");
                this.f22389B = cls;
                this.f22390C = cls.newInstance();
                this.f22389B.getMethod("insertExcludeId", String.class, com.anythink.expressad.foundation.d.d.class).invoke(this.f22390C, this.f22392E, this.f22391D);
            }
            int i4 = com.anythink.expressad.reward.b.a.f20479a;
            this.f22425z = com.anythink.expressad.reward.b.a.class;
            this.f22388A = com.anythink.expressad.reward.b.a.class.newInstance();
            this.f22425z.getMethod("insertExcludeId", String.class, com.anythink.expressad.foundation.d.d.class).invoke(this.f22388A, this.f22392E, this.f22391D);
            if (this.f22389B != null) {
                return;
            }
            Class<?> cls2 = Class.forName("com.anythink.expressad.atnative.controller.NativeController");
            this.f22389B = cls2;
            this.f22390C = cls2.newInstance();
            this.f22389B.getMethod("insertExcludeId", String.class, com.anythink.expressad.foundation.d.d.class).invoke(this.f22390C, this.f22392E, this.f22391D);
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    private static void B() {
    }

    private void C() {
        String str;
        Message obtain = Message.obtain();
        obtain.what = f22387p;
        if (this.f22391D == null || TextUtils.isEmpty(this.f22392E) || TextUtils.isEmpty(this.f22391D.aa()) || TextUtils.isEmpty(this.f22391D.T())) {
            str = "";
        } else {
            str = "key=2000077&unit_id=" + this.f22392E + "&request_id=" + this.f22391D.aa() + "&request_id_notice=" + this.f22391D.ac() + "&package_name=" + com.anythink.expressad.foundation.b.a.c().b() + "&app_id=" + com.anythink.expressad.foundation.b.a.c().f() + "&video_url=" + URLEncoder.encode(this.f22391D.T()) + "&process_size=" + this.J + "&file_size=" + this.f22395H + "&ready_rate=" + this.f22404R + "&cd_rate=" + this.f22416q + "&cid=" + this.f22391D.bh() + "&type=" + this.f22420u;
        }
        obtain.obj = str;
        this.Y.sendMessage(obtain);
    }

    private static void D() {
        com.anythink.expressad.foundation.b.a.c().e();
    }

    private String E() {
        if (this.f22391D == null || TextUtils.isEmpty(this.f22392E) || TextUtils.isEmpty(this.f22391D.aa()) || TextUtils.isEmpty(this.f22391D.T())) {
            return "";
        }
        return "key=2000077&unit_id=" + this.f22392E + "&request_id=" + this.f22391D.aa() + "&request_id_notice=" + this.f22391D.ac() + "&package_name=" + com.anythink.expressad.foundation.b.a.c().b() + "&app_id=" + com.anythink.expressad.foundation.b.a.c().f() + "&video_url=" + URLEncoder.encode(this.f22391D.T()) + "&process_size=" + this.J + "&file_size=" + this.f22395H + "&ready_rate=" + this.f22404R + "&cd_rate=" + this.f22416q + "&cid=" + this.f22391D.bh() + "&type=" + this.f22420u;
    }

    public static /* synthetic */ boolean d(c cVar) {
        cVar.f22413g = false;
        return false;
    }

    public static /* synthetic */ void s() {
        com.anythink.expressad.foundation.b.a.c().e();
    }

    private void t() {
        try {
            if (!TextUtils.isEmpty(this.f22396I) && this.f22414n != 3) {
                x();
            }
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    private void u() {
        if (this.f22412c == null) {
            b bVar = new b(this.f22396I, this.f22404R, this.f22409W);
            this.f22412c = bVar;
            bVar.a(new a.b() { // from class: com.anythink.expressad.videocommon.b.c.3
                @Override // com.anythink.core.common.res.b.a.b
                public final void a(a.C0094a c0094a) {
                }

                @Override // com.anythink.core.common.res.b.a.b
                public final boolean a(int i4, long j9, long j10) {
                    if (c.this.f22395H != j10) {
                        c.this.f22395H = j10;
                    }
                    c cVar = c.this;
                    c.a(cVar, j9, cVar.f22420u);
                    if (i4 >= c.this.f22404R) {
                        c.this.g();
                        c.this.q();
                        return true;
                    }
                    if (c.this.f22420u != 2 && c.this.f22420u != 4) {
                        return false;
                    }
                    int i9 = c.this.f22420u == 4 ? 3 : 2;
                    Message obtain = Message.obtain();
                    obtain.what = i9;
                    c.this.Y.sendMessage(obtain);
                    return true;
                }

                @Override // com.anythink.core.common.res.b.a.b
                public final void a(String str, String str2) {
                    c.a(c.this, "errorCode:" + str + ",errorMsg:" + str2);
                }
            });
        }
    }

    private void v() {
        if (this.f22405S) {
            return;
        }
        this.f22405S = true;
        com.anythink.expressad.videocommon.d.c cVar = this.f22402P;
        if (cVar != null) {
            cVar.a(this.f22396I);
        }
        com.anythink.expressad.videocommon.d.c cVar2 = this.f22403Q;
        if (cVar2 != null) {
            cVar2.a(this.f22396I);
        }
    }

    private boolean w() {
        return this.f22393F;
    }

    private void x() {
        com.anythink.core.common.a.n a9;
        a.a();
        this.f22398L = a.a(this.f22396I);
        File file = new File(this.f22398L);
        if (file.length() > 0) {
            this.J = file.length();
        } else {
            this.J = 0L;
        }
        if (this.f22395H != 0 || (a9 = com.anythink.core.common.a.o.a().a(this.f22396I)) == null) {
            return;
        }
        this.f22395H = a9.d();
    }

    private f y() {
        return this.f22410X;
    }

    private static void z() {
    }

    public final void h() {
        if (TextUtils.isEmpty(this.f22396I)) {
            return;
        }
        if (this.f22420u == 5) {
            v();
            return;
        }
        if (this.f22414n == 3) {
            g();
            return;
        }
        if (this.f22404R == 0) {
            g();
            return;
        }
        x();
        u();
        if (this.f22412c != null) {
            this.f22420u = 1;
            this.f22393F = true;
            this.f22412c.a();
        }
    }

    public final void i() {
        x();
        u();
        if (this.f22412c != null) {
            this.f22420u = 1;
            this.f22393F = true;
            this.f22412c.b();
        }
    }

    public final void j() {
        A();
        this.f22420u = 4;
    }

    public final int k() {
        return this.f22420u;
    }

    public final void l() {
        this.f22420u = 0;
    }

    public final String m() {
        if (this.f22414n == 3) {
            return "";
        }
        File file = new File(this.f22398L);
        try {
            return file.length() > 0 ? file.canRead() ? file.length() > 0 ? "" : "file length is 0 " : "file can not read " : "file is not exist ";
        } catch (Throwable th) {
            String message = th.getMessage();
            if (com.anythink.expressad.a.f17776a) {
                th.printStackTrace();
            }
            return message;
        }
    }

    public final com.anythink.expressad.foundation.d.d n() {
        return this.f22391D;
    }

    public final void o() {
        if (this.f22421v != null) {
            this.f22421v = null;
        }
    }

    public final long p() {
        return this.J;
    }

    public final void q() {
        String str;
        Message obtain = Message.obtain();
        obtain.what = f22387p;
        if (this.f22391D == null || TextUtils.isEmpty(this.f22392E) || TextUtils.isEmpty(this.f22391D.aa()) || TextUtils.isEmpty(this.f22391D.T())) {
            str = "";
        } else {
            str = "key=2000077&unit_id=" + this.f22392E + "&request_id=" + this.f22391D.aa() + "&request_id_notice=" + this.f22391D.ac() + "&package_name=" + com.anythink.expressad.foundation.b.a.c().b() + "&app_id=" + com.anythink.expressad.foundation.b.a.c().f() + "&video_url=" + URLEncoder.encode(this.f22391D.T()) + "&process_size=" + this.J + "&file_size=" + this.f22395H + "&ready_rate=" + this.f22404R + "&cd_rate=" + this.f22416q + "&cid=" + this.f22391D.bh() + "&type=" + this.f22420u;
        }
        obtain.obj = str;
        this.Y.sendMessage(obtain);
    }

    public final String r() {
        return this.f22417r;
    }

    public final void b(int i4) {
        this.f22416q = i4;
    }

    public final void c(int i4) {
        this.f22409W = i4;
    }

    public final boolean d() {
        return this.f22400N;
    }

    public final String e() {
        return this.f22398L;
    }

    public final long f() {
        return this.f22395H;
    }

    public final void g() {
        Message obtain = Message.obtain();
        this.f22420u = 5;
        obtain.what = 4;
        this.Y.sendMessage(obtain);
    }

    public final boolean b() {
        return this.f22406T;
    }

    public final long c() {
        return this.f22401O;
    }

    public final void d(int i4) {
        this.f22404R = i4;
    }

    public final void e(int i4) {
        this.f22411Z = i4;
    }

    private void c(String str) {
        this.f22397K++;
        try {
            Context context = this.f22394G;
            if (context != null) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null && connectivityManager.getActiveNetworkInfo() != null) {
                    if (!connectivityManager.getActiveNetworkInfo().isAvailable()) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (this.f22397K <= 1) {
            this.Y.sendEmptyMessageDelayed(5, com.anythink.basead.exoplayer.i.a.f8040f);
            return;
        }
        A();
        com.anythink.expressad.videocommon.d.c cVar = this.f22402P;
        if (cVar != null) {
            cVar.a(str, this.f22396I);
        }
        com.anythink.expressad.videocommon.d.c cVar2 = this.f22403Q;
        if (cVar2 != null) {
            cVar2.a(str, this.f22396I);
        }
        this.f22420u = 4;
        Message obtain = Message.obtain();
        obtain.what = 3;
        this.Y.sendMessage(obtain);
    }

    public final void a(int i4) {
        this.f22414n = i4;
    }

    public final void b(boolean z8) {
        this.f22400N = z8;
    }

    private void b(String str) {
        com.anythink.expressad.videocommon.d.c cVar = this.f22402P;
        if (cVar != null) {
            cVar.a(str, this.f22396I);
        }
        com.anythink.expressad.videocommon.d.c cVar2 = this.f22403Q;
        if (cVar2 != null) {
            cVar2.a(str, this.f22396I);
        }
        this.f22420u = 4;
        Message obtain = Message.obtain();
        obtain.what = 3;
        this.Y.sendMessage(obtain);
    }

    public final String a() {
        return this.f22396I;
    }

    public final void a(boolean z8) {
        if (!z8) {
            this.f22415o = false;
        }
        this.f22406T = z8;
    }

    private static double a(double d2, double d3, int i4) {
        if (i4 >= 0) {
            return new BigDecimal(Double.toString(d2)).divide(new BigDecimal(Double.toString(d3)), i4, 4).doubleValue();
        }
        throw new IllegalAccessException("Accuracy cannot be less than 0");
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        this.f22391D = dVar;
    }

    private void b(com.anythink.expressad.videocommon.d.c cVar) {
        this.f22403Q = cVar;
    }

    public final void a(com.anythink.expressad.videocommon.d.c cVar) {
        this.f22402P = cVar;
    }

    private void b(f fVar) {
        CopyOnWriteArrayList<f> copyOnWriteArrayList = this.f22421v;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(fVar);
        }
    }

    public final void a(f fVar) {
        this.f22422w = fVar;
    }

    private void a(long j9, int i4) {
        this.J = j9;
        int i9 = this.f22404R;
        if (100 * j9 >= i9 * this.f22395H && !this.f22405S && i4 != 4) {
            if (i9 == 100 && i4 != 5) {
                this.f22420u = 5;
                return;
            }
            v();
        }
        if (this.f22393F) {
            CopyOnWriteArrayList<f> copyOnWriteArrayList = this.f22421v;
            if (copyOnWriteArrayList != null) {
                Iterator<f> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    f next = it.next();
                    if (next != null) {
                        next.a(j9, i4);
                    }
                }
            }
            if (this.f22422w != null) {
                if (this.f22420u == 5 || this.f22420u == 4 || this.f22420u == 2 || this.f22420u == 6) {
                    this.f22422w.a(j9, i4);
                    this.f22422w = null;
                }
            }
        }
    }

    public final void a(String str) {
        this.f22417r = str;
    }

    public static /* synthetic */ void a(c cVar, long j9, int i4) {
        cVar.J = j9;
        int i9 = cVar.f22404R;
        if (100 * j9 >= i9 * cVar.f22395H && !cVar.f22405S && i4 != 4) {
            if (i9 == 100 && i4 != 5) {
                cVar.f22420u = 5;
                return;
            }
            cVar.v();
        }
        if (cVar.f22393F) {
            CopyOnWriteArrayList<f> copyOnWriteArrayList = cVar.f22421v;
            if (copyOnWriteArrayList != null) {
                Iterator<f> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    f next = it.next();
                    if (next != null) {
                        next.a(j9, i4);
                    }
                }
            }
            if (cVar.f22422w != null) {
                if (cVar.f22420u == 5 || cVar.f22420u == 4 || cVar.f22420u == 2 || cVar.f22420u == 6) {
                    cVar.f22422w.a(j9, i4);
                    cVar.f22422w = null;
                }
            }
        }
    }

    public static /* synthetic */ void a(c cVar, String str) {
        cVar.f22397K++;
        try {
            Context context = cVar.f22394G;
            if (context != null) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null && connectivityManager.getActiveNetworkInfo() != null) {
                    if (!connectivityManager.getActiveNetworkInfo().isAvailable()) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (cVar.f22397K <= 1) {
            cVar.Y.sendEmptyMessageDelayed(5, com.anythink.basead.exoplayer.i.a.f8040f);
            return;
        }
        cVar.A();
        com.anythink.expressad.videocommon.d.c cVar2 = cVar.f22402P;
        if (cVar2 != null) {
            cVar2.a(str, cVar.f22396I);
        }
        com.anythink.expressad.videocommon.d.c cVar3 = cVar.f22403Q;
        if (cVar3 != null) {
            cVar3.a(str, cVar.f22396I);
        }
        cVar.f22420u = 4;
        Message obtain = Message.obtain();
        obtain.what = 3;
        cVar.Y.sendMessage(obtain);
    }
}
