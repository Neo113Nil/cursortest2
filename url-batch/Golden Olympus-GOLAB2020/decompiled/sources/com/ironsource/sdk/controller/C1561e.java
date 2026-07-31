package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.ironsource.C1508m0;
import com.ironsource.C1554s3;
import com.ironsource.b9;
import com.ironsource.cc;
import com.ironsource.e9;
import com.ironsource.fh;
import com.ironsource.fr;
import com.ironsource.gb;
import com.ironsource.gh;
import com.ironsource.hh;
import com.ironsource.ig;
import com.ironsource.mh;
import com.ironsource.mw;
import com.ironsource.nh;
import com.ironsource.nm;
import com.ironsource.o9;
import com.ironsource.pm;
import com.ironsource.q8;
import com.ironsource.qm;
import com.ironsource.qn;
import com.ironsource.re;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.controller.InterfaceC1562f;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.t9;
import com.ironsource.te;
import com.ironsource.u9;
import com.ironsource.v9;
import com.ironsource.va;
import com.ironsource.vc;
import com.ironsource.wa;
import com.ironsource.wc;
import com.ironsource.x9;
import com.ironsource.y9;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1561e implements InterfaceC1559c, com.ironsource.sdk.controller.l {

    /* renamed from: b, reason: collision with root package name */
    private com.ironsource.sdk.controller.l f19168b;

    /* renamed from: d, reason: collision with root package name */
    private CountDownTimer f19170d;

    /* renamed from: g, reason: collision with root package name */
    private final ig f19173g;

    /* renamed from: h, reason: collision with root package name */
    private final mw f19174h;

    /* renamed from: k, reason: collision with root package name */
    private final qn f19177k;

    /* renamed from: a, reason: collision with root package name */
    private final String f19167a = C1561e.class.getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    private fh.b f19169c = fh.b.None;

    /* renamed from: e, reason: collision with root package name */
    private final q8 f19171e = new q8("NativeCommandExecutor");

    /* renamed from: f, reason: collision with root package name */
    private final q8 f19172f = new q8("ControllerCommandsExecutor");

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, l.a> f19175i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private final Map<String, l.b> f19176j = new HashMap();

    /* renamed from: com.ironsource.sdk.controller.e$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f19178a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u9 f19179b;

        a(JSONObject jSONObject, u9 u9Var) {
            this.f19178a = jSONObject;
            this.f19179b = u9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1561e.this.f19168b != null) {
                C1561e.this.f19168b.a(this.f19178a, this.f19179b);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ va f19181a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f19182b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ u9 f19183c;

        b(va vaVar, Map map, u9 u9Var) {
            this.f19181a = vaVar;
            this.f19182b = map;
            this.f19183c = u9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1561e.this.f19168b != null) {
                C1561e.this.f19168b.a(this.f19181a, this.f19182b, this.f19183c);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$c */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19185a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19186b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ va f19187c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ t9 f19188d;

        c(String str, String str2, va vaVar, t9 t9Var) {
            this.f19185a = str;
            this.f19186b = str2;
            this.f19187c = vaVar;
            this.f19188d = t9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1561e.this.f19168b != null) {
                C1561e.this.f19168b.a(this.f19185a, this.f19186b, this.f19187c, this.f19188d);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$d */
    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f19190a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t9 f19191b;

        d(JSONObject jSONObject, t9 t9Var) {
            this.f19190a = jSONObject;
            this.f19191b = t9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1561e.this.f19168b != null) {
                C1561e.this.f19168b.a(this.f19190a, this.f19191b);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$e, reason: collision with other inner class name */
    class RunnableC0158e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ va f19193a;

        RunnableC0158e(va vaVar) {
            this.f19193a = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1561e.this.f19168b != null) {
                C1561e.this.f19168b.a(this.f19193a);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$f */
    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ va f19195a;

        f(va vaVar) {
            this.f19195a = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1561e.this.f19168b != null) {
                C1561e.this.f19168b.b(this.f19195a);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$g */
    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ va f19197a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f19198b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ t9 f19199c;

        g(va vaVar, Map map, t9 t9Var) {
            this.f19197a = vaVar;
            this.f19198b = map;
            this.f19199c = t9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1561e.this.f19168b != null) {
                C1561e.this.f19168b.a(this.f19197a, this.f19198b, this.f19199c);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$h */
    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l.a f19201a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1562f.c f19202b;

        h(l.a aVar, InterfaceC1562f.c cVar) {
            this.f19201a = aVar;
            this.f19202b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1561e.this.f19168b != null) {
                if (this.f19201a != null) {
                    C1561e.this.f19175i.put(this.f19202b.f(), this.f19201a);
                }
                C1561e.this.f19168b.a(this.f19202b, this.f19201a);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$i */
    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f19204a;

        i(JSONObject jSONObject) {
            this.f19204a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1561e.this.f19168b != null) {
                C1561e.this.f19168b.b(this.f19204a);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$j */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1561e.this.f19168b != null) {
                C1561e.this.f19168b.destroy();
                C1561e.this.f19168b = null;
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$k */
    class k extends CountDownTimer {
        k(long j4, long j5) {
            super(j4, j5);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(C1561e.this.f19167a, "Global Controller Timer Finish");
            C1561e.this.d(b9.c.f15330k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
            Logger.i(C1561e.this.f19167a, "Global Controller Timer Tick " + j4);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$l */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1561e.this.c();
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$m */
    class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19209a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19210b;

        m(String str, String str2) {
            this.f19209a = str;
            this.f19210b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C1561e c1561e = C1561e.this;
                c1561e.f19168b = c1561e.b(c1561e.f19174h.b(), C1561e.this.f19174h.d(), C1561e.this.f19174h.f(), C1561e.this.f19174h.e(), C1561e.this.f19174h.g(), C1561e.this.f19174h.c(), this.f19209a, this.f19210b);
                C1561e.this.f19168b.a();
            } catch (Throwable th) {
                o9.d().a(th);
                C1561e.this.d(Log.getStackTraceString(th));
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$n */
    class n extends CountDownTimer {
        n(long j4, long j5) {
            super(j4, j5);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(C1561e.this.f19167a, "Recovered Controller | Global Controller Timer Finish");
            C1561e.this.d(b9.c.f15330k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
            Logger.i(C1561e.this.f19167a, "Recovered Controller | Global Controller Timer Tick " + j4);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$o */
    class o implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19213a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19214b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ va f19215c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ v9 f19216d;

        o(String str, String str2, va vaVar, v9 v9Var) {
            this.f19213a = str;
            this.f19214b = str2;
            this.f19215c = vaVar;
            this.f19216d = v9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1561e.this.f19168b != null) {
                C1561e.this.f19168b.a(this.f19213a, this.f19214b, this.f19215c, this.f19216d);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$p */
    class p implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f19218a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v9 f19219b;

        p(JSONObject jSONObject, v9 v9Var) {
            this.f19218a = jSONObject;
            this.f19219b = v9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1561e.this.f19168b != null) {
                C1561e.this.f19168b.a(this.f19218a, this.f19219b);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$q */
    class q implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19221a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19222b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ va f19223c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ u9 f19224d;

        q(String str, String str2, va vaVar, u9 u9Var) {
            this.f19221a = str;
            this.f19222b = str2;
            this.f19223c = vaVar;
            this.f19224d = u9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1561e.this.f19168b != null) {
                C1561e.this.f19168b.a(this.f19221a, this.f19222b, this.f19223c, this.f19224d);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$r */
    class r implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19226a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u9 f19227b;

        r(String str, u9 u9Var) {
            this.f19226a = str;
            this.f19227b = u9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1561e.this.f19168b != null) {
                C1561e.this.f19168b.a(this.f19226a, this.f19227b);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$s */
    class s implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ va f19229a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f19230b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ u9 f19231c;

        s(va vaVar, Map map, u9 u9Var) {
            this.f19229a = vaVar;
            this.f19230b = map;
            this.f19231c = u9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            mh.a(fr.f16282j, new hh().a(cc.f15750v, this.f19229a.f()).a(cc.f15751w, nh.a(this.f19229a, fh.e.Interstitial)).a(cc.f15752x, Boolean.valueOf(nh.a(this.f19229a))).a(cc.f15716I, Long.valueOf(C1508m0.f17128a.b(this.f19229a.h()))).a());
            if (C1561e.this.f19168b != null) {
                C1561e.this.f19168b.b(this.f19229a, this.f19230b, this.f19231c);
            }
        }
    }

    public C1561e(Context context, e9 e9Var, wa waVar, ig igVar, int i4, JSONObject jSONObject, String str, String str2, qn qnVar) {
        this.f19177k = qnVar;
        this.f19173g = igVar;
        String networkStorageDir = IronSourceStorageUtils.getNetworkStorageDir(context);
        gb a4 = gb.a(networkStorageDir, igVar, jSONObject);
        this.f19174h = new mw(context, e9Var, waVar, i4, a4, networkStorageDir);
        a(context, e9Var, waVar, i4, a4, networkStorageDir, str, str2);
    }

    private l.a h() {
        return new l.a() { // from class: com.ironsource.sdk.controller.y
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(InterfaceC1562f.a aVar) {
                C1561e.this.a(aVar);
            }
        };
    }

    private l.b i() {
        return new l.b() { // from class: com.ironsource.sdk.controller.x
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(pm pmVar) {
                C1561e.this.a(pmVar);
            }
        };
    }

    private void k() {
        Logger.i(this.f19167a, "handleReadyState");
        this.f19169c = fh.b.Ready;
        CountDownTimer countDownTimer = this.f19170d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        m();
        this.f19172f.c();
        this.f19172f.a();
        com.ironsource.sdk.controller.l lVar = this.f19168b;
        if (lVar != null) {
            lVar.e();
        }
    }

    private boolean l() {
        return fh.b.Ready.equals(this.f19169c);
    }

    private void m() {
        this.f19174h.a(true);
        com.ironsource.sdk.controller.l lVar = this.f19168b;
        if (lVar != null) {
            lVar.a(this.f19174h.i());
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void destroy() {
        Logger.i(this.f19167a, "destroy controller");
        CountDownTimer countDownTimer = this.f19170d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        q8 q8Var = this.f19172f;
        if (q8Var != null) {
            q8Var.b();
        }
        this.f19170d = null;
        b(new j());
    }

    @Override // com.ironsource.sdk.controller.l
    @Deprecated
    public void e() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
        com.ironsource.sdk.controller.l lVar;
        if (!l() || (lVar = this.f19168b) == null) {
            return;
        }
        lVar.f();
    }

    @Override // com.ironsource.sdk.controller.l
    public fh.c g() {
        com.ironsource.sdk.controller.l lVar = this.f19168b;
        return lVar != null ? lVar.g() : fh.c.None;
    }

    public com.ironsource.sdk.controller.l j() {
        return this.f19168b;
    }

    private void e(String str) {
        IronSourceNetwork.updateInitFailed(new gh(1001, str));
    }

    @Override // com.ironsource.sdk.controller.l
    public void d() {
        com.ironsource.sdk.controller.l lVar;
        if (!l() || (lVar = this.f19168b) == null) {
            return;
        }
        lVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v b(Context context, e9 e9Var, wa waVar, int i4, gb gbVar, String str, String str2, String str3) {
        mh.a(fr.f16275c);
        v vVar = new v(context, waVar, e9Var, this, this.f19173g, i4, gbVar, str, h(), i(), str2, str3);
        wc wcVar = new wc(context, gbVar, new vc(this.f19173g.a()), new qm(gbVar.a()));
        vVar.a(new u(context));
        vVar.a(new com.ironsource.sdk.controller.o(context));
        vVar.a(new com.ironsource.sdk.controller.q(context));
        vVar.a(new com.ironsource.sdk.controller.i(context));
        vVar.a(new C1557a(context));
        vVar.a(new com.ironsource.sdk.controller.j(gbVar.a(), wcVar));
        vVar.a(new C1554s3());
        vVar.a(new y9(context, new x9()));
        return vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        mh.a(fr.f16276d, new hh().a(cc.f15708A, str).a());
        this.f19169c = fh.b.Loading;
        this.f19168b = new com.ironsource.sdk.controller.n(str, this.f19173g);
        this.f19171e.c();
        this.f19171e.a();
        ig igVar = this.f19173g;
        if (igVar != null) {
            igVar.c(new l());
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC1559c
    public void c() {
        Logger.i(this.f19167a, "handleControllerReady ");
        this.f19177k.a(g());
        if (fh.c.Web.equals(g())) {
            mh.a(fr.f16277e, new hh().a(cc.f15753y, String.valueOf(this.f19174h.l())).a());
            IronSourceNetwork.updateInitSucceeded();
        }
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Context context, e9 e9Var, wa waVar, int i4, gb gbVar, String str, String str2, String str3) {
        try {
            v b4 = b(context, e9Var, waVar, i4, gbVar, str, str2, str3);
            try {
                this.f19168b = b4;
                b4.a();
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                o9.d().a(th2);
                d(Log.getStackTraceString(th2));
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC1559c
    public void b() {
        Logger.i(this.f19167a, "handleControllerLoaded");
        this.f19169c = fh.b.Loaded;
        this.f19171e.c();
        this.f19171e.a();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!l() || (lVar = this.f19168b) == null) {
            return;
        }
        lVar.b(context);
    }

    @Override // com.ironsource.sdk.controller.InterfaceC1559c
    public void c(String str) {
        mh.a(fr.f16297y, new hh().a(cc.f15753y, str).a());
        CountDownTimer countDownTimer = this.f19170d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.f19168b.a(activity);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(va vaVar) {
        this.f19172f.a(new f(vaVar));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!l() || (lVar = this.f19168b) == null) {
            return;
        }
        lVar.a(context);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(va vaVar, Map<String, String> map, u9 u9Var) {
        this.f19172f.a(new s(vaVar, map, u9Var));
    }

    private void a(final Context context, final e9 e9Var, final wa waVar, final int i4, final gb gbVar, final String str, final String str2, final String str3) {
        int c4 = nm.S().d().c();
        if (c4 > 0) {
            mh.a(fr.f16272B, new hh().a(cc.f15753y, String.valueOf(c4)).a());
        }
        a(new Runnable() { // from class: com.ironsource.sdk.controller.w
            @Override // java.lang.Runnable
            public final void run() {
                C1561e.this.c(context, e9Var, waVar, i4, gbVar, str, str2, str3);
            }
        }, c4);
        this.f19170d = new k(200000L, 1000L).start();
    }

    private void b(Runnable runnable) {
        a(runnable, 0L);
    }

    private void a(fh.e eVar, va vaVar, String str, String str2) {
        Logger.i(this.f19167a, "recoverWebController for product: " + eVar.toString());
        hh hhVar = new hh();
        hhVar.a(cc.f15751w, eVar.toString());
        hhVar.a(cc.f15750v, vaVar.f());
        mh.a(fr.f16274b, hhVar.a());
        this.f19174h.n();
        destroy();
        b(new m(str, str2));
        this.f19170d = new n(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.InterfaceC1559c
    public void b(String str) {
        Logger.i(this.f19167a, "handleControllerFailed ");
        hh hhVar = new hh();
        hhVar.a(cc.f15708A, str);
        hhVar.a(cc.f15753y, String.valueOf(this.f19174h.l()));
        mh.a(fr.f16287o, hhVar.a());
        this.f19174h.a(false);
        e(str);
        if (this.f19170d != null) {
            Logger.i(this.f19167a, "cancel timer mControllerReadyTimer");
            this.f19170d.cancel();
        }
        d(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(pm pmVar) {
        l.b bVar = this.f19176j.get(pmVar.d());
        if (bVar != null) {
            bVar.a(pmVar);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        this.f19172f.a(new i(jSONObject));
    }

    @Override // com.ironsource.ve
    public void a(@NotNull re reVar) {
        fr.a aVar;
        hh hhVar;
        StringBuilder sb;
        te b4 = reVar.b();
        if (b4 == te.SendEvent) {
            aVar = fr.f16271A;
            hhVar = new hh();
            sb = new StringBuilder();
        } else {
            if (b4 != te.NativeController) {
                return;
            }
            com.ironsource.sdk.controller.n nVar = new com.ironsource.sdk.controller.n(reVar.a(), this.f19173g);
            this.f19168b = nVar;
            this.f19177k.a(nVar.g());
            mh.a(fr.f16276d, new hh().a(cc.f15708A, reVar.a() + " : strategy: " + b4).a());
            aVar = fr.f16271A;
            hhVar = new hh();
            sb = new StringBuilder();
        }
        sb.append(reVar.a());
        sb.append(" : strategy: ");
        sb.append(b4);
        mh.a(aVar, hhVar.a(cc.f15753y, sb.toString()).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC1562f.a aVar) {
        l.a remove = this.f19175i.remove(aVar.c());
        if (remove != null) {
            remove.a(aVar);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(InterfaceC1562f.c cVar, @Nullable l.a aVar) {
        this.f19172f.a(new h(aVar, cVar));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(va vaVar) {
        this.f19172f.a(new RunnableC0158e(vaVar));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(va vaVar, Map<String, String> map, t9 t9Var) {
        this.f19172f.a(new g(vaVar, map, t9Var));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(va vaVar, Map<String, String> map, u9 u9Var) {
        this.f19172f.a(new b(vaVar, map, u9Var));
    }

    public void a(Runnable runnable) {
        this.f19171e.a(runnable);
    }

    private void a(Runnable runnable, long j4) {
        ig igVar = this.f19173g;
        if (igVar != null) {
            igVar.d(runnable, j4);
        } else {
            Logger.e(this.f19167a, "mThreadManager = null");
        }
    }

    public void a(String str, l.b bVar) {
        this.f19176j.put(str, bVar);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, u9 u9Var) {
        Logger.i(this.f19167a, "load interstitial");
        this.f19172f.a(new r(str, u9Var));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, t9 t9Var) {
        if (this.f19174h.a(g(), this.f19169c)) {
            a(fh.e.Banner, vaVar, str, str2);
        }
        this.f19172f.a(new c(str, str2, vaVar, t9Var));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, u9 u9Var) {
        if (this.f19174h.a(g(), this.f19169c)) {
            a(fh.e.Interstitial, vaVar, str, str2);
        }
        this.f19172f.a(new q(str, str2, vaVar, u9Var));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, v9 v9Var) {
        if (this.f19174h.a(g(), this.f19169c)) {
            a(fh.e.RewardedVideo, vaVar, str, str2);
        }
        this.f19172f.a(new o(str, str2, vaVar, v9Var));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, t9 t9Var) {
        this.f19172f.a(new d(jSONObject, t9Var));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, u9 u9Var) {
        this.f19172f.a(new a(jSONObject, u9Var));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, v9 v9Var) {
        this.f19172f.a(new p(jSONObject, v9Var));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        if (this.f19168b == null || !l()) {
            return false;
        }
        return this.f19168b.a(str);
    }
}
