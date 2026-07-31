package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.C1428a4;
import com.ironsource.C1456e4;
import com.ironsource.C1498k4;
import com.ironsource.as;
import com.ironsource.bk;
import com.ironsource.br;
import com.ironsource.bs;
import com.ironsource.cf;
import com.ironsource.de;
import com.ironsource.dq;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.eo;
import com.ironsource.fq;
import com.ironsource.jp;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.integration.IntegrationHelper;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.p;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.ms;
import com.ironsource.nm;
import com.ironsource.no;
import com.ironsource.ns;
import com.ironsource.o9;
import com.ironsource.om;
import com.ironsource.ps;
import com.ironsource.xa;
import com.ironsource.zb;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
class s implements eo {

    /* renamed from: A, reason: collision with root package name */
    private static s f17873A;

    /* renamed from: a, reason: collision with root package name */
    private ps f17874a;

    /* renamed from: p, reason: collision with root package name */
    private NetworkStateReceiver f17889p;

    /* renamed from: q, reason: collision with root package name */
    private CountDownTimer f17890q;

    /* renamed from: t, reason: collision with root package name */
    private String f17893t;

    /* renamed from: u, reason: collision with root package name */
    private ms f17894u;

    /* renamed from: v, reason: collision with root package name */
    private SegmentListener f17895v;

    /* renamed from: x, reason: collision with root package name */
    private long f17897x;

    /* renamed from: b, reason: collision with root package name */
    private int f17875b = e.f17914f;

    /* renamed from: c, reason: collision with root package name */
    private cf f17876c = nm.S().v();

    /* renamed from: d, reason: collision with root package name */
    private final String f17877d = "appKey";

    /* renamed from: e, reason: collision with root package name */
    private final String f17878e = getClass().getSimpleName();

    /* renamed from: l, reason: collision with root package name */
    private boolean f17885l = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f17887n = false;

    /* renamed from: r, reason: collision with root package name */
    private List<no> f17891r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    private String f17892s = "";

    /* renamed from: z, reason: collision with root package name */
    private f f17899z = new a();

    /* renamed from: m, reason: collision with root package name */
    private Handler f17886m = IronSourceThreadManager.INSTANCE.getInitHandler();

    /* renamed from: f, reason: collision with root package name */
    private int f17879f = 1;

    /* renamed from: g, reason: collision with root package name */
    private int f17880g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f17881h = 62;

    /* renamed from: i, reason: collision with root package name */
    private int f17882i = 12;

    /* renamed from: j, reason: collision with root package name */
    private int f17883j = 5;

    /* renamed from: o, reason: collision with root package name */
    private AtomicBoolean f17888o = new AtomicBoolean(true);

    /* renamed from: k, reason: collision with root package name */
    private boolean f17884k = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f17896w = false;

    /* renamed from: y, reason: collision with root package name */
    private bk f17898y = new bk();

    class a extends f {
        a() {
            super();
        }

        @Override // java.lang.Runnable
        public void run() {
            ns i4;
            try {
                p m4 = p.m();
                if (!TextUtils.isEmpty(s.this.f17892s)) {
                    de.a().a("userId", s.this.f17892s);
                }
                if (!TextUtils.isEmpty(s.this.f17893t)) {
                    de.a().a("appKey", s.this.f17893t);
                }
                s.this.f17898y.h(s.this.f17892s);
                s.this.f17897x = new Date().getTime();
                dq.c().a();
                s.this.f17894u = m4.b(ContextProvider.getInstance().getApplicationContext(), s.this.f17892s, this.f17917c);
                if (s.this.f17894u != null) {
                    s.this.f17886m.removeCallbacks(this);
                    if (s.this.f17894u.p()) {
                        s.this.b(d.INITIATED);
                        new om().a(s.this.f17894u.c().b().d().b(), m4.B());
                        C1498k4 e4 = s.this.f17894u.c().b().e();
                        if (e4 != null) {
                            xa xaVar = xa.f20303a;
                            xaVar.c(e4.g());
                            xaVar.a(e4.f());
                            xaVar.a(e4.j());
                            IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(e4.h());
                            s.this.f17876c.a(e4);
                        }
                        s.this.a(ContextProvider.getInstance().getApplicationContext(), s.this.f17894u);
                        m4.a(new Date().getTime() - s.this.f17897x, s.this.f17894u.h());
                        if (e4 != null && e4.e()) {
                            new fq(br.i(), new Function0() { // from class: com.ironsource.mediationsdk.B
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Long.valueOf(System.currentTimeMillis());
                                }
                            }, nm.S(), IronSourceThreadManager.INSTANCE.getThreadPoolExecutor()).c(ContextProvider.getInstance().getApplicationContext());
                        }
                        s.this.f17874a = new ps();
                        s.this.f17874a.a(s.this.f17876c);
                        if (s.this.f17894u.c().b().f() && ContextProvider.getInstance().getApplicationContext() != null) {
                            IntegrationHelper.validateIntegration(ContextProvider.getInstance().getApplicationContext());
                        }
                        List<IronSource.AD_UNIT> g4 = s.this.f17894u.g();
                        Iterator it = s.this.f17891r.iterator();
                        while (it.hasNext()) {
                            ((no) it.next()).a(g4, s.this.h(), s.this.f17894u.c());
                        }
                        new jp.a().a();
                        if (s.this.f17895v != null && (i4 = s.this.f17894u.c().b().i()) != null && !TextUtils.isEmpty(i4.c())) {
                            s.this.f17895v.onSegmentReceived(i4.c());
                        }
                        C1456e4 c4 = s.this.f17894u.c().b().c();
                        if (c4.f()) {
                            o9.d().a(c4.b(), c4.d(), c4.c(), c4.e(), IronSourceUtils.getSessionId(), c4.a(), c4.g());
                        }
                    } else if (!s.this.f17885l) {
                        s.this.b(d.INIT_FAILED);
                        s.this.f17885l = true;
                        Iterator it2 = s.this.f17891r.iterator();
                        while (it2.hasNext()) {
                            ((no) it2.next()).d("serverResponseIsNotValid");
                        }
                    }
                } else {
                    if (s.this.f17880g == 3) {
                        s.this.f17896w = true;
                        Iterator it3 = s.this.f17891r.iterator();
                        while (it3.hasNext()) {
                            ((no) it3.next()).a();
                        }
                    }
                    if (this.f17915a && s.this.f17880g < s.this.f17881h) {
                        s.this.f17884k = true;
                        s.this.f17886m.postDelayed(this, s.this.f17879f * 1000);
                        if (s.this.f17880g < s.this.f17882i) {
                            s.a(s.this, 2);
                        }
                    }
                    if ((!this.f17915a || s.this.f17880g == s.this.f17883j) && !s.this.f17885l) {
                        s.this.f17885l = true;
                        if (TextUtils.isEmpty(this.f17916b)) {
                            this.f17916b = "noServerResponse";
                        }
                        Iterator it4 = s.this.f17891r.iterator();
                        while (it4.hasNext()) {
                            ((no) it4.next()).d(this.f17916b);
                        }
                        s.this.b(d.INIT_FAILED);
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No server response", 1);
                    }
                    s.f(s.this);
                }
                s.this.e();
            } catch (Exception e5) {
                o9.d().a(e5);
                IronLog.INTERNAL.error(e5.toString());
            }
        }
    }

    class b implements Runnable {

        class a extends CountDownTimer {
            a(long j4, long j5) {
                super(j4, j5);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                if (s.this.f17885l) {
                    return;
                }
                s.this.f17885l = true;
                Iterator it = s.this.f17891r.iterator();
                while (it.hasNext()) {
                    ((no) it.next()).d("noInternetConnection");
                }
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j4) {
                if (j4 <= 45000) {
                    s.this.f17896w = true;
                    Iterator it = s.this.f17891r.iterator();
                    while (it.hasNext()) {
                        ((no) it.next()).a();
                    }
                }
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.f17890q = new a(60000L, 15000L).start();
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17903a;

        static {
            int[] iArr = new int[d.values().length];
            f17903a = iArr;
            try {
                iArr[d.INIT_IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17903a[d.INIT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17903a[d.INITIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    enum d {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static int f17909a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static int f17910b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static int f17911c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static int f17912d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static int f17913e = 4;

        /* renamed from: f, reason: collision with root package name */
        public static int f17914f = 5;
    }

    abstract class f implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        String f17916b;

        /* renamed from: a, reason: collision with root package name */
        boolean f17915a = true;

        /* renamed from: c, reason: collision with root package name */
        protected p.c f17917c = new a();

        class a implements p.c {
            a() {
            }

            @Override // com.ironsource.mediationsdk.p.c
            public void a(String str) {
                f fVar = f.this;
                fVar.f17915a = false;
                fVar.f17916b = str;
            }
        }

        f() {
        }
    }

    private s() {
    }

    private static int a(d dVar) {
        int i4 = c.f17903a[dVar.ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? e.f17909a : e.f17910b : e.f17913e : e.f17912d;
    }

    public static synchronized s c() {
        s sVar;
        synchronized (s.class) {
            try {
                if (f17873A == null) {
                    f17873A = new s();
                }
                sVar = f17873A;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }

    static /* synthetic */ int f(s sVar) {
        int i4 = sVar.f17880g;
        sVar.f17880g = i4 + 1;
        return i4;
    }

    public int b() {
        return this.f17875b;
    }

    public synchronized boolean d() {
        return this.f17896w;
    }

    static /* synthetic */ int a(s sVar, int i4) {
        int i5 = sVar.f17879f * i4;
        sVar.f17879f = i5;
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (nm.S().d().g()) {
            br.i().a(new zb(IronSourceConstants.EP_CONFIG_RECEIVED, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        return this.f17884k;
    }

    void f() {
        b(d.INIT_FAILED);
    }

    public synchronized void g() {
        int a4 = a(a());
        this.f17875b = a4;
        this.f17898y.c(a4);
    }

    public synchronized void b(d dVar) {
        IronLog.INTERNAL.verbose("old status: " + a() + ", new status: " + dVar + ")");
        bs.f15648a.a(as.values()[dVar.ordinal()]);
    }

    public void b(no noVar) {
        if (noVar == null || this.f17891r.size() == 0) {
            return;
        }
        this.f17891r.remove(noVar);
    }

    public synchronized d a() {
        return d.values()[bs.f15648a.a().ordinal()];
    }

    public void a(Context context, ms msVar) {
        this.f17898y.h(msVar.f().h());
        this.f17898y.b(msVar.f().d());
        C1428a4 b4 = msVar.c().b();
        this.f17898y.a(b4.a());
        this.f17898y.c(b4.b().b());
        this.f17898y.b(b4.j().b());
        this.f17898y.a(Boolean.valueOf(IronSourceUtils.getFirstSession(context)));
        C1498k4 e4 = msVar.c().b().e();
        this.f17898y.b(e4.b());
        nm.M().x().a(e4.c());
    }

    public synchronized void a(Context context, String str, String str2, IronSource.AD_UNIT... ad_unitArr) {
        try {
            try {
                AtomicBoolean atomicBoolean = this.f17888o;
                if (atomicBoolean == null || !atomicBoolean.compareAndSet(true, false)) {
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, this.f17878e + ": Multiple calls to init are not allowed", 2);
                } else {
                    b(d.INIT_IN_PROGRESS);
                    this.f17892s = str2;
                    this.f17893t = str;
                    if (IronSourceUtils.isNetworkConnected(context)) {
                        this.f17886m.post(this.f17899z);
                    } else {
                        this.f17887n = true;
                        if (this.f17889p == null) {
                            this.f17889p = new NetworkStateReceiver(context, this);
                        }
                        context.registerReceiver(this.f17889p, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b());
                    }
                }
            } catch (Exception e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void a(SegmentListener segmentListener) {
        this.f17895v = segmentListener;
    }

    public void a(no noVar) {
        if (noVar == null) {
            return;
        }
        this.f17891r.add(noVar);
    }

    @Override // com.ironsource.eo
    public void a(boolean z4) {
        if (this.f17887n && z4) {
            CountDownTimer countDownTimer = this.f17890q;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f17887n = false;
            this.f17884k = true;
            br.i().a(new zb(IronSourceConstants.INIT_AFTER_REACHABILITY_CHANGE, IronSourceUtils.getMediationAdditionalData(false)));
            this.f17886m.post(this.f17899z);
        }
    }
}
