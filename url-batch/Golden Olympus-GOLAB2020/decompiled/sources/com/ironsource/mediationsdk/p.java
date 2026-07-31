package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.C1477h4;
import com.ironsource.C1481i1;
import com.ironsource.C1486j;
import com.ironsource.C1495k1;
import com.ironsource.C1498k4;
import com.ironsource.ak;
import com.ironsource.as;
import com.ironsource.au;
import com.ironsource.bk;
import com.ironsource.bn;
import com.ironsource.br;
import com.ironsource.bs;
import com.ironsource.bu;
import com.ironsource.cf;
import com.ironsource.cg;
import com.ironsource.d8;
import com.ironsource.dn;
import com.ironsource.dv;
import com.ironsource.ee;
import com.ironsource.eg;
import com.ironsource.environment.ContextProvider;
import com.ironsource.eq;
import com.ironsource.ev;
import com.ironsource.fo;
import com.ironsource.fu;
import com.ironsource.g6;
import com.ironsource.gg;
import com.ironsource.gk;
import com.ironsource.h7;
import com.ironsource.ij;
import com.ironsource.jp;
import com.ironsource.kp;
import com.ironsource.lb;
import com.ironsource.le;
import com.ironsource.mb;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.events.ISErrorListener;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.s;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.server.ServerURL;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.ms;
import com.ironsource.ng;
import com.ironsource.nj;
import com.ironsource.nm;
import com.ironsource.no;
import com.ironsource.o9;
import com.ironsource.oc;
import com.ironsource.of;
import com.ironsource.om;
import com.ironsource.pj;
import com.ironsource.pp;
import com.ironsource.qa;
import com.ironsource.r8;
import com.ironsource.ra;
import com.ironsource.ri;
import com.ironsource.rk;
import com.ironsource.s8;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sm;
import com.ironsource.tg;
import com.ironsource.ti;
import com.ironsource.tt;
import com.ironsource.u6;
import com.ironsource.wq;
import com.ironsource.xa;
import com.ironsource.yh;
import com.ironsource.z8;
import com.ironsource.zb;
import com.ironsource.zl;
import com.ironsource.zq;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class p implements ak, no, qa, qa.b, qa.c, qa.a {

    /* renamed from: t0, reason: collision with root package name */
    private static boolean f17725t0 = false;

    /* renamed from: A, reason: collision with root package name */
    private Set<IronSource.AD_UNIT> f17726A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f17727B;

    /* renamed from: C, reason: collision with root package name */
    private IronSourceSegment f17728C;

    /* renamed from: D, reason: collision with root package name */
    private final String f17729D;

    /* renamed from: E, reason: collision with root package name */
    private int f17730E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f17731F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f17732G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f17733H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f17734I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f17735J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f17736K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f17737L;

    /* renamed from: M, reason: collision with root package name */
    private Boolean f17738M;

    /* renamed from: N, reason: collision with root package name */
    private IronSourceBannerLayout f17739N;

    /* renamed from: O, reason: collision with root package name */
    private String f17740O;

    /* renamed from: P, reason: collision with root package name */
    private Boolean f17741P;

    /* renamed from: Q, reason: collision with root package name */
    private eg f17742Q;

    /* renamed from: R, reason: collision with root package name */
    private w f17743R;

    /* renamed from: S, reason: collision with root package name */
    private ij f17744S;

    /* renamed from: T, reason: collision with root package name */
    private wq f17745T;

    /* renamed from: U, reason: collision with root package name */
    private g6 f17746U;

    /* renamed from: V, reason: collision with root package name */
    private InitializationListener f17747V;

    /* renamed from: W, reason: collision with root package name */
    private fo f17748W;

    /* renamed from: X, reason: collision with root package name */
    private AtomicBoolean f17749X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f17750Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f17751Z;

    /* renamed from: a, reason: collision with root package name */
    private final String f17752a;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f17753a0;

    /* renamed from: b, reason: collision with root package name */
    private final String f17754b;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f17755b0;

    /* renamed from: c, reason: collision with root package name */
    private final of f17756c;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f17757c0;

    /* renamed from: d, reason: collision with root package name */
    private final of.a f17758d;

    /* renamed from: d0, reason: collision with root package name */
    private int f17759d0;

    /* renamed from: e, reason: collision with root package name */
    private final cg f17760e;

    /* renamed from: e0, reason: collision with root package name */
    private final ConcurrentHashMap<String, h.d> f17761e0;

    /* renamed from: f, reason: collision with root package name */
    private final cf f17762f;

    /* renamed from: f0, reason: collision with root package name */
    private final ConcurrentHashMap<String, h.b> f17763f0;

    /* renamed from: g, reason: collision with root package name */
    private final yh.a f17764g;

    /* renamed from: g0, reason: collision with root package name */
    private final ConcurrentHashMap<String, h.d> f17765g0;

    /* renamed from: h, reason: collision with root package name */
    private IronSourceLoggerManager f17766h;

    /* renamed from: h0, reason: collision with root package name */
    private com.ironsource.mediationsdk.demandOnly.f f17767h0;

    /* renamed from: i, reason: collision with root package name */
    private zl f17768i;

    /* renamed from: i0, reason: collision with root package name */
    private com.ironsource.mediationsdk.demandOnly.k f17769i0;

    /* renamed from: j, reason: collision with root package name */
    private com.ironsource.mediationsdk.logger.b f17770j;

    /* renamed from: j0, reason: collision with root package name */
    private com.ironsource.mediationsdk.demandOnly.c f17771j0;

    /* renamed from: k, reason: collision with root package name */
    private AtomicBoolean f17772k;

    /* renamed from: k0, reason: collision with root package name */
    private oc f17773k0;

    /* renamed from: l, reason: collision with root package name */
    private final Object f17774l;

    /* renamed from: l0, reason: collision with root package name */
    private bk f17775l0;

    /* renamed from: m, reason: collision with root package name */
    private ms f17776m;

    /* renamed from: m0, reason: collision with root package name */
    private le f17777m0;

    /* renamed from: n, reason: collision with root package name */
    private String f17778n;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f17779n0;

    /* renamed from: o, reason: collision with root package name */
    private String f17780o;

    /* renamed from: o0, reason: collision with root package name */
    private AdQualityBridge f17781o0;

    /* renamed from: p, reason: collision with root package name */
    private String f17782p;

    /* renamed from: p0, reason: collision with root package name */
    private final AtomicBoolean f17783p0;

    /* renamed from: q, reason: collision with root package name */
    private String f17784q;

    /* renamed from: q0, reason: collision with root package name */
    ISErrorListener f17785q0;

    /* renamed from: r, reason: collision with root package name */
    private Map<String, String> f17786r;

    /* renamed from: r0, reason: collision with root package name */
    ng<ISDemandOnlyInterstitialListener> f17787r0;

    /* renamed from: s, reason: collision with root package name */
    private String f17788s;

    /* renamed from: s0, reason: collision with root package name */
    ng<ISDemandOnlyRewardedVideoListener> f17789s0;

    /* renamed from: t, reason: collision with root package name */
    private AtomicBoolean f17790t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f17791u;

    /* renamed from: v, reason: collision with root package name */
    private List<IronSource.AD_UNIT> f17792v;

    /* renamed from: w, reason: collision with root package name */
    private String f17793w;

    /* renamed from: x, reason: collision with root package name */
    private Context f17794x;

    /* renamed from: y, reason: collision with root package name */
    private Boolean f17795y;

    /* renamed from: z, reason: collision with root package name */
    private Set<IronSource.AD_UNIT> f17796z;

    class a implements ISErrorListener {
        a() {
        }

        @Override // com.ironsource.mediationsdk.events.ISErrorListener
        public void onError(Throwable th) {
            IronLog.INTERNAL.error(th.getMessage());
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17798a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f17799b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f17800c;

        static {
            int[] iArr = new int[pp.b.values().length];
            f17800c = iArr;
            try {
                iArr[pp.b.CAPPED_PER_DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17800c[pp.b.CAPPED_PER_COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17800c[pp.b.CAPPED_PER_PACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17800c[pp.b.NOT_CAPPED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[s.d.values().length];
            f17799b = iArr2;
            try {
                iArr2[s.d.INIT_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17799b[s.d.INIT_IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[IronSource.AD_UNIT.values().length];
            f17798a = iArr3;
            try {
                iArr3[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17798a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17798a[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f17798a[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public interface c {
        void a(String str);
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        static volatile p f17801a = new p(null);

        private d() {
        }
    }

    private p() {
        this(nm.S().f(), nm.M().b(), nm.S().B(), nm.S().v(), nm.M().q());
    }

    private boolean A() {
        ms msVar = this.f17776m;
        return (msVar == null || msVar.j() == null || this.f17776m.j().a() == null || this.f17776m.j().a().size() <= 0) ? false : true;
    }

    private synchronized boolean C() {
        return this.f17791u;
    }

    private boolean D() {
        ms msVar = this.f17776m;
        return (msVar == null || msVar.c() == null || this.f17776m.c().d() == null) ? false : true;
    }

    private boolean E() {
        return D() && G();
    }

    private boolean G() {
        ms msVar = this.f17776m;
        return (msVar == null || msVar.j() == null || this.f17776m.j().b() == null || this.f17776m.j().b().size() <= 0) ? false : true;
    }

    private boolean H() {
        ms msVar = this.f17776m;
        return (msVar == null || msVar.c() == null || this.f17776m.c().e() == null) ? false : true;
    }

    private boolean I() {
        return H() && J();
    }

    private boolean J() {
        ms msVar = this.f17776m;
        return (msVar == null || msVar.j() == null || this.f17776m.j().c() == null || this.f17776m.j().c().isEmpty()) ? false : true;
    }

    private boolean L() {
        ms msVar = this.f17776m;
        return (msVar == null || msVar.c() == null || this.f17776m.c().f() == null) ? false : true;
    }

    private boolean M() {
        return L() && N();
    }

    private boolean N() {
        ms msVar = this.f17776m;
        return (msVar == null || msVar.j() == null || this.f17776m.j().d() == null || this.f17776m.j().d().size() <= 0) ? false : true;
    }

    private void T() {
        if (this.f17747V == null || !this.f17749X.compareAndSet(false, true)) {
            return;
        }
        IronLog.CALLBACK.verbose("onInitializationCompleted()");
        br.i().a(new zb(IronSourceConstants.TROUBLESHOOTING_INIT_COMPLETED, IronSourceUtils.getMediationAdditionalData(false)));
        this.f17747V.onInitializationComplete();
    }

    private void V() {
        ConcurrentHashMap<String, List<String>> c4 = rk.b().c();
        if (c4.containsKey(com.ironsource.mediationsdk.metadata.a.f17677c)) {
            if (TextUtils.isEmpty(c4.get(com.ironsource.mediationsdk.metadata.a.f17677c).get(0))) {
                return;
            }
            xa.f20303a.b(!MetaDataUtils.getMetaDataBooleanValue(r0));
        }
    }

    private boolean W() {
        return this.f17781o0 == null && this.f17783p0.get() && this.f17776m.c().a().a() && AdQualityBridge.adQualityAvailable();
    }

    private void X() {
        if (this.f17733H) {
            Z();
            return;
        }
        boolean h4 = this.f17776m.c().c().d().h();
        this.f17757c0 = h4;
        if (h4) {
            Y();
        } else {
            f0();
        }
    }

    private void Y() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> a4 = a(this.f17776m.j().a());
        if (a4.size() > 0) {
            this.f17746U = new g6(a4, this.f17776m.c().c(), IronSourceUtils.getUserIdForNetworks(), rk.b(), this.f17728C);
            v();
        } else {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{"errorCode", 1010}});
            a(IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.BANNER, false);
        }
    }

    private void Z() {
        this.f17766h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < this.f17776m.j().a().size(); i4++) {
            String str = this.f17776m.j().a().get(i4);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f17776m.k().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{"errorCode", 1010}});
            a(IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.BANNER, false);
            return;
        }
        synchronized (this.f17763f0) {
            try {
                u6 c4 = this.f17776m.c().c();
                ra.a aVar = new ra.a("Mediation");
                if (c4.k()) {
                    aVar.a("isOneFlow", 1);
                }
                this.f17771j0 = new com.ironsource.mediationsdk.demandOnly.c(arrayList, c4, n(), o(), new ra.b(pj.i(), aVar));
            } catch (Throwable th) {
                throw th;
            }
        }
        for (h.b bVar : this.f17763f0.values()) {
            this.f17771j0.a(bVar.g(), bVar.c());
        }
        this.f17763f0.clear();
    }

    private int a(zq zqVar) {
        return (this.f17753a0 || this.f17750Y || !zqVar.k().e()) ? 1 : 2;
    }

    private void a0() {
        this.f17766h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < this.f17776m.j().b().size(); i4++) {
            String str = this.f17776m.j().b().get(i4);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f17776m.k().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{"errorCode", 1010}});
            a(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        synchronized (this.f17761e0) {
            this.f17767h0 = a((List<NetworkSettings>) arrayList);
        }
        Iterator<h.d> it = this.f17761e0.values().iterator();
        while (it.hasNext()) {
            this.f17767h0.a(it.next());
        }
        this.f17761e0.clear();
    }

    private void b0() {
        this.f17766h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < this.f17776m.j().d().size(); i4++) {
            String str = this.f17776m.j().d().get(i4);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f17776m.k().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        synchronized (this.f17765g0) {
            this.f17769i0 = b(arrayList);
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        Iterator<h.d> it = this.f17765g0.values().iterator();
        while (it.hasNext()) {
            this.f17769i0.a(it.next());
        }
        this.f17765g0.clear();
    }

    private void c0() {
        if (this.f17732G) {
            a0();
        } else {
            d0();
        }
    }

    private void d0() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> a4 = a(this.f17776m.j().b());
        if (a4.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{"errorCode", 1010}});
            a(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        ij ijVar = new ij(a4, this.f17776m.c().d(), IronSourceUtils.getUserIdForNetworks(), rk.b(), this.f17728C);
        this.f17744S = ijVar;
        Boolean bool = this.f17795y;
        if (bool != null) {
            ijVar.a(this.f17794x, bool.booleanValue());
        }
        if (this.f17755b0) {
            this.f17755b0 = false;
            this.f17744S.A();
        }
    }

    private void e0() {
        this.f17766h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in programmatic mode", 0);
        List<NetworkSettings> a4 = a(this.f17776m.j().d());
        if (a4.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, this.f17759d0);
            a(mediationAdditionalData, new Object[][]{new Object[]{"errorCode", 1010}});
            b(IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        q qVar = new q(a4, this.f17776m.c().f(), n(), IronSourceUtils.getUserIdForNetworks(), rk.b().a(), this.f17728C);
        this.f17742Q = qVar;
        Boolean bool = this.f17795y;
        if (bool != null) {
            qVar.a(this.f17794x, bool.booleanValue());
        }
    }

    private void f0() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> a4 = a(this.f17776m.j().a());
        if (a4.size() > 0) {
            this.f17766h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in programmatic mode", 0);
            this.f17743R = new w(a4, new k(n(), IronSourceUtils.getUserIdForNetworks(), this.f17776m.c().c()), rk.b().a(), this.f17728C);
            v();
        } else {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{"errorCode", 1010}});
            a(IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.BANNER, false);
        }
    }

    private void g0() {
        if (this.f17731F) {
            b0();
            return;
        }
        zq f4 = this.f17776m.c().f();
        this.f17753a0 = f4.k().h();
        this.f17759d0 = a(f4);
        if (this.f17750Y || this.f17753a0) {
            h0();
        } else {
            e0();
        }
    }

    private void h0() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> a4 = a(this.f17776m.j().d());
        if (a4.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, this.f17759d0);
            a(mediationAdditionalData, new Object[][]{new Object[]{"errorCode", 1010}});
            b(IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        wq wqVar = new wq(a4, this.f17776m.c().f(), IronSourceUtils.getUserIdForNetworks(), this.f17750Y, rk.b(), this.f17728C);
        this.f17745T = wqVar;
        Boolean bool = this.f17795y;
        if (bool != null) {
            wqVar.a(this.f17794x, bool.booleanValue());
        }
        if (this.f17751Z && this.f17750Y) {
            this.f17751Z = false;
            this.f17745T.A();
        }
    }

    private InterstitialPlacement i() {
        nj d4 = this.f17776m.c().d();
        if (d4 != null) {
            return d4.a();
        }
        return null;
    }

    private Placement j() {
        zq f4 = this.f17776m.c().f();
        if (f4 != null) {
            return f4.a();
        }
        return null;
    }

    private h7 k(String str) {
        h7 a4;
        u6 c4 = this.f17776m.c().c();
        return c4 == null ? new lb() : (TextUtils.isEmpty(str) || (a4 = c4.a(str)) == null) ? c4.i() : a4;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private pp.b l(String str) {
        InterstitialPlacement interstitialPlacement;
        ms msVar = this.f17776m;
        if (msVar == null || msVar.c() == null || this.f17776m.c().d() == null) {
            return pp.b.NOT_CAPPED;
        }
        try {
            interstitialPlacement = m(str);
            if (interstitialPlacement == null) {
                try {
                    interstitialPlacement = i();
                    if (interstitialPlacement == null) {
                        this.f17766h.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
                    }
                } catch (Exception e4) {
                    e = e4;
                    o9.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                    if (interstitialPlacement != null) {
                    }
                }
            }
        } catch (Exception e5) {
            e = e5;
            interstitialPlacement = null;
        }
        return interstitialPlacement != null ? pp.b.NOT_CAPPED : a(interstitialPlacement);
    }

    private InterstitialPlacement m(String str) {
        nj d4 = this.f17776m.c().d();
        if (d4 != null) {
            return d4.a(str);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private pp.b o(String str) {
        Placement placement;
        ms msVar = this.f17776m;
        if (msVar == null || msVar.c() == null || this.f17776m.c().f() == null) {
            return pp.b.NOT_CAPPED;
        }
        try {
            placement = p(str);
            if (placement == null) {
                try {
                    placement = j();
                    if (placement == null) {
                        this.f17766h.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
                    }
                } catch (Exception e4) {
                    e = e4;
                    o9.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                    if (placement != null) {
                    }
                }
            }
        } catch (Exception e5) {
            e = e5;
            placement = null;
        }
        return placement != null ? pp.b.NOT_CAPPED : a(placement);
    }

    private Placement p(String str) {
        zq f4 = this.f17776m.c().f();
        if (f4 != null) {
            return f4.a(str);
        }
        return null;
    }

    private synchronized fo r() {
        return this.f17748W;
    }

    private r8 v(String str) {
        IronSourceError ironSourceError;
        String str2;
        r8 r8Var = new r8();
        if (str != null) {
            if (a(str, 5, 10)) {
                str2 = u(str) ? "length should be between 5-10 characters" : "should contain only english characters and numbers";
                return r8Var;
            }
            ironSourceError = ErrorBuilder.buildInvalidCredentialsError("appKey", str, str2);
        } else {
            ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, "Init Fail - appKey is missing");
        }
        r8Var.a(ironSourceError);
        return r8Var;
    }

    private void w() {
        this.f17766h = IronSourceLoggerManager.getLogger(0);
        com.ironsource.mediationsdk.logger.b bVar = new com.ironsource.mediationsdk.logger.b(null, 1);
        this.f17770j = bVar;
        this.f17766h.addLogger(bVar);
        this.f17768i = new zl();
    }

    private boolean x() {
        try {
            Class<?> cls = Class.forName("com.ironsource.adqualitysdk.sdk.IronSourceAdQuality");
            IronLog.INTERNAL.verbose("AdQuality SDK exist: " + cls.getName());
            return true;
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog.INTERNAL.verbose("No AdQuality SDK found");
            return false;
        }
    }

    private boolean y() {
        ms msVar = this.f17776m;
        return (msVar == null || msVar.c() == null || this.f17776m.c().c() == null) ? false : true;
    }

    private boolean z() {
        return y() && A();
    }

    boolean B() {
        return this.f17731F || this.f17732G || this.f17733H;
    }

    public boolean F() {
        boolean z4;
        try {
            if (this.f17732G) {
                this.f17766h.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use isISDemandOnlyInterstitialReady instead", 3);
                return false;
            }
            ij ijVar = this.f17744S;
            boolean z5 = ijVar != null && ijVar.u();
            try {
                pj.i().a(new zb(z5 ? IronSourceConstants.IS_CHECK_READY_TRUE : IronSourceConstants.IS_CHECK_READY_FALSE, IronSourceUtils.getMediationAdditionalData(false, true, 1)));
                this.f17766h.log(IronSourceLogger.IronSourceTag.API, "isInterstitialReady():" + z5, 1);
                return z5;
            } catch (Throwable th) {
                z4 = z5;
                th = th;
                o9.d().a(th);
                IronSourceLoggerManager ironSourceLoggerManager = this.f17766h;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.log(ironSourceTag, "isInterstitialReady():" + z4, 1);
                this.f17766h.logException(ironSourceTag, "isInterstitialReady()", th);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            z4 = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0033, code lost:
    
        if (r3.u() != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean K() {
        boolean z4;
        boolean z5;
        try {
            if (this.f17731F) {
                this.f17766h.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video was initialized in demand only mode. Use isISDemandOnlyRewardedVideoAvailable instead", 3);
                return false;
            }
            try {
                if (!this.f17750Y && !this.f17753a0) {
                    eg egVar = this.f17742Q;
                    if (egVar != null && egVar.d()) {
                        z5 = true;
                        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                        a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.f17759d0)}});
                        br.i().a(new zb(z5 ? IronSourceConstants.RV_API_HAS_AVAILABILITY_TRUE : IronSourceConstants.RV_API_HAS_AVAILABILITY_FALSE, mediationAdditionalData));
                        this.f17766h.log(IronSourceLogger.IronSourceTag.API, "isRewardedVideoAvailable():" + z5, 1);
                        return z5;
                    }
                    z5 = false;
                    JSONObject mediationAdditionalData2 = IronSourceUtils.getMediationAdditionalData(false);
                    a(mediationAdditionalData2, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.f17759d0)}});
                    br.i().a(new zb(z5 ? IronSourceConstants.RV_API_HAS_AVAILABILITY_TRUE : IronSourceConstants.RV_API_HAS_AVAILABILITY_FALSE, mediationAdditionalData2));
                    this.f17766h.log(IronSourceLogger.IronSourceTag.API, "isRewardedVideoAvailable():" + z5, 1);
                    return z5;
                }
                JSONObject mediationAdditionalData22 = IronSourceUtils.getMediationAdditionalData(false);
                a(mediationAdditionalData22, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.f17759d0)}});
                br.i().a(new zb(z5 ? IronSourceConstants.RV_API_HAS_AVAILABILITY_TRUE : IronSourceConstants.RV_API_HAS_AVAILABILITY_FALSE, mediationAdditionalData22));
                this.f17766h.log(IronSourceLogger.IronSourceTag.API, "isRewardedVideoAvailable():" + z5, 1);
                return z5;
            } catch (Throwable th) {
                z4 = z5;
                th = th;
                o9.d().a(th);
                IronSourceLoggerManager ironSourceLoggerManager = this.f17766h;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.log(ironSourceTag, "isRewardedVideoAvailable():" + z4, 1);
                this.f17766h.logException(ironSourceTag, "isRewardedVideoAvailable()", th);
                return false;
            }
            wq wqVar = this.f17745T;
            if (wqVar != null) {
            }
            z5 = false;
        } catch (Throwable th2) {
            th = th2;
            z4 = false;
        }
    }

    public boolean O() {
        return C();
    }

    public void P() {
        n a4;
        IronSource.AD_UNIT ad_unit;
        IronSourceError buildInitFailedError;
        n a5;
        IronSource.AD_UNIT ad_unit2;
        IronSourceError buildInitFailedError2;
        IronSourceLoggerManager ironSourceLoggerManager = this.f17766h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadInterstitial()", 1);
        try {
            if (this.f17732G) {
                this.f17766h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", 3);
                a5 = n.a();
                ad_unit2 = IronSource.AD_UNIT.INTERSTITIAL;
                buildInitFailedError2 = ErrorBuilder.buildInitFailedError("Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", "Interstitial");
            } else {
                if (this.f17735J) {
                    s.d a6 = s.c().a();
                    if (a6 == s.d.INIT_FAILED) {
                        this.f17766h.log(ironSourceTag, "init() had failed", 3);
                        a4 = n.a();
                        ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
                        buildInitFailedError = ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial");
                    } else {
                        if (a6 == s.d.INIT_IN_PROGRESS) {
                            if (s.c().d()) {
                                this.f17766h.log(ironSourceTag, "init() had failed", 3);
                                a4 = n.a();
                                ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
                                buildInitFailedError = ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial");
                            }
                            this.f17755b0 = true;
                            return;
                        }
                        if (E()) {
                            ij ijVar = this.f17744S;
                            if (ijVar == null) {
                                this.f17755b0 = true;
                                return;
                            } else {
                                ijVar.A();
                                return;
                            }
                        }
                        this.f17766h.log(ironSourceTag, "No interstitial configurations found", 3);
                        a4 = n.a();
                        ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
                        buildInitFailedError = ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial");
                    }
                    a4.b(ad_unit, buildInitFailedError);
                    return;
                }
                this.f17766h.log(ironSourceTag, "init() must be called before loadInterstitial()", 3);
                a5 = n.a();
                ad_unit2 = IronSource.AD_UNIT.INTERSTITIAL;
                buildInitFailedError2 = ErrorBuilder.buildInitFailedError("init() must be called before loadInterstitial()", "Interstitial");
            }
            a5.b(ad_unit2, buildInitFailedError2);
        } catch (Throwable th) {
            o9.d().a(th);
            this.f17766h.logException(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", th);
            n.a().b(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(510, th.getMessage()));
        }
    }

    public void Q() {
        n a4;
        IronSource.AD_UNIT ad_unit;
        IronSourceError buildInitFailedError;
        n a5;
        IronSource.AD_UNIT ad_unit2;
        IronSourceError buildInitFailedError2;
        IronSourceLoggerManager ironSourceLoggerManager = this.f17766h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadRewardedVideo()", 1);
        try {
            if (this.f17731F) {
                this.f17766h.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", 3);
                a5 = n.a();
                ad_unit2 = IronSource.AD_UNIT.REWARDED_VIDEO;
                buildInitFailedError2 = ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
            } else {
                if (!this.f17750Y && !this.f17779n0) {
                    this.f17766h.log(ironSourceTag, "Rewarded Video is not initiated with manual load", 3);
                    return;
                }
                if (this.f17734I) {
                    s.d a6 = s.c().a();
                    if (a6 == s.d.INIT_FAILED) {
                        this.f17766h.log(ironSourceTag, "init() had failed", 3);
                        a4 = n.a();
                        ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
                        buildInitFailedError = ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                    } else {
                        if (a6 == s.d.INIT_IN_PROGRESS) {
                            if (s.c().d()) {
                                this.f17766h.log(ironSourceTag, "init() had failed", 3);
                                a4 = n.a();
                                ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
                                buildInitFailedError = ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                            }
                            this.f17751Z = true;
                            return;
                        }
                        if (M()) {
                            wq wqVar = this.f17745T;
                            if (wqVar == null) {
                                this.f17751Z = true;
                                return;
                            } else {
                                wqVar.A();
                                return;
                            }
                        }
                        this.f17766h.log(ironSourceTag, "No rewarded video configurations found", 3);
                        a4 = n.a();
                        ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
                        buildInitFailedError = ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                    }
                    a4.b(ad_unit, buildInitFailedError);
                    return;
                }
                this.f17766h.log(ironSourceTag, "init() must be called before loadRewardedVideo()", 3);
                a5 = n.a();
                ad_unit2 = IronSource.AD_UNIT.REWARDED_VIDEO;
                buildInitFailedError2 = ErrorBuilder.buildInitFailedError("init() must be called before loadRewardedVideo()", IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
            }
            a5.b(ad_unit2, buildInitFailedError2);
        } catch (Throwable th) {
            o9.d().a(th);
            this.f17766h.logException(IronSourceLogger.IronSourceTag.API, "loadRewardedVideo()", th);
            n.a().b(IronSource.AD_UNIT.REWARDED_VIDEO, new IronSourceError(510, th.getMessage()));
        }
    }

    public void R() {
        ij ijVar = this.f17744S;
        if (ijVar != null) {
            ijVar.a((fu) null);
        }
        wq wqVar = this.f17745T;
        if (wqVar != null) {
            wqVar.a((fu) null);
        }
        g6 g6Var = this.f17746U;
        if (g6Var != null) {
            g6Var.a((fu) null);
        }
        this.f17779n0 = false;
    }

    public void S() {
        IronLog.API.info("removing all impression data listeners");
        rk.b().d();
        eg egVar = this.f17742Q;
        if (egVar != null) {
            egVar.c();
        }
        w wVar = this.f17743R;
        if (wVar != null) {
            wVar.c();
        }
    }

    public void U() {
        if (f17725t0) {
            return;
        }
        f17725t0 = true;
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put("status", "false");
            mediationAdditionalData.put("errorCode", 1);
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
        br.i().a(new zb(IronSourceConstants.FIRST_INSTANCE_RESULT, mediationAdditionalData));
    }

    public IronSourceBannerLayout b(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f17766h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBanner()", 1);
        if (activity == null) {
            this.f17766h.log(ironSourceTag, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new IronSourceBannerLayout(activity, iSBannerSize);
    }

    @Override // com.ironsource.ak
    public void c() {
        this.f17766h.log(IronSourceLogger.IronSourceTag.API, "removeRewardedVideoListener()", 1);
        eq.a().a((LevelPlayRewardedVideoBaseListener) null);
    }

    @Override // com.ironsource.ak
    public void d() {
        this.f17766h.log(IronSourceLogger.IronSourceTag.API, "removeInterstitialListener()", 1);
        tg.a().a((LevelPlayInterstitialListener) null);
    }

    public String e() {
        String str;
        if (this.f17737L) {
            s c4 = s.c();
            int i4 = b.f17799b[c4.a().ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    str = "";
                } else if (!c4.d()) {
                    str = "init() not finished yet";
                }
            }
            str = "init() had failed";
        } else {
            str = "init() must be called first";
        }
        return (I() || !str.isEmpty()) ? str : "No Native Ad configurations found";
    }

    public bn f() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> a4 = a(this.f17776m.j().c());
        if (a4.size() > 0) {
            return new bn(a4, this.f17776m.c().e(), IronSourceUtils.getUserIdForNetworks(), rk.b(), this.f17728C);
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        a(mediationAdditionalData, new Object[][]{new Object[]{"errorCode", 1010}});
        a(IronSourceConstants.TROUBLESHOOTING_NT_INIT_FAILED, mediationAdditionalData);
        return null;
    }

    @Override // com.ironsource.ak
    public InterstitialPlacement g(String str) {
        InterstitialPlacement interstitialPlacement;
        try {
            interstitialPlacement = m(str);
            if (interstitialPlacement == null) {
                try {
                    this.f17766h.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    interstitialPlacement = i();
                } catch (Exception e4) {
                    e = e4;
                    o9.d().a(e);
                    return interstitialPlacement;
                }
            }
            this.f17766h.log(IronSourceLogger.IronSourceTag.API, "getPlacementInfo(placement: " + str + "):" + interstitialPlacement, 1);
            return interstitialPlacement;
        } catch (Exception e5) {
            e = e5;
            interstitialPlacement = null;
        }
    }

    public ms h() {
        return this.f17776m;
    }

    public dn n(String str) {
        dn a4;
        sm e4 = this.f17776m.c().e();
        if (e4 == null) {
            return null;
        }
        return (TextUtils.isEmpty(str) || (a4 = e4.a(str)) == null) ? e4.e() : a4;
    }

    public String q() {
        return this.f17788s;
    }

    public Map<String, String> s() {
        return this.f17786r;
    }

    public IronSourceSegment t() {
        return this.f17728C;
    }

    public String u() {
        return this.f17793w;
    }

    /* synthetic */ p(a aVar) {
        this();
    }

    private com.ironsource.mediationsdk.demandOnly.k b(List<NetworkSettings> list) {
        zq f4 = this.f17776m.c().f();
        ra.a aVar = new ra.a("Mediation");
        if (f4.d()) {
            aVar.a("isOneFlow", 1);
        }
        return new com.ironsource.mediationsdk.demandOnly.k(list, f4, com.ironsource.mediationsdk.c.b(), this.f17789s0, n(), o(), new ra.b(br.i(), aVar));
    }

    private void e(Activity activity) {
        ContextProvider.getInstance().updateActivity(activity);
        IronLog.INTERNAL.verbose("activity is updated to: " + activity.hashCode());
    }

    private ra k() {
        return new ra.b(br.i(), new ra.a("IronSource"));
    }

    public static p m() {
        return d.f17801a;
    }

    private boolean u(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    private void v() {
        if (this.f17738M.booleanValue()) {
            IronLog.INTERNAL.verbose("load banner after init");
            this.f17738M = Boolean.FALSE;
            a(this.f17739N, this.f17740O);
            this.f17739N = null;
            this.f17740O = null;
        }
    }

    @Override // com.ironsource.qa.a
    public ISDemandOnlyBannerLayout a(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f17766h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBannerForDemandOnly()", 1);
        if (activity == null) {
            this.f17766h.log(ironSourceTag, "createBannerForDemandOnly() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new ISDemandOnlyBannerLayout(activity, iSBannerSize);
    }

    public void c(Activity activity) {
        tg a4;
        IronSourceError ironSourceError;
        IronSourceLoggerManager ironSourceLoggerManager = this.f17766h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showInterstitial()", 1);
        try {
            if (this.f17732G) {
                this.f17766h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                tg.a().a(new IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (AdInfo) null);
                return;
            }
            if (D()) {
                InterstitialPlacement i4 = i();
                if (i4 != null) {
                    c(activity, i4.getPlacementName());
                    return;
                } else {
                    a4 = tg.a();
                    ironSourceError = new IronSourceError(1020, "showInterstitial error: empty default placement in response");
                }
            } else {
                a4 = tg.a();
                ironSourceError = ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial");
            }
            a4.a(ironSourceError, (AdInfo) null);
        } catch (Exception e4) {
            o9.d().a(e4);
            this.f17766h.logException(IronSourceLogger.IronSourceTag.API, "showInterstitial()", e4);
            tg.a().a(new IronSourceError(510, e4.getMessage()), (AdInfo) null);
        }
    }

    public void d(Activity activity) {
        if (!L()) {
            eq.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            this.f17766h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", 3);
            return;
        }
        Placement j4 = j();
        if (j4 != null) {
            f(activity, j4.getPlacementName());
            return;
        }
        this.f17766h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo error: empty default placement in response", 3);
        eq.a().a(new IronSourceError(1021, "showRewardedVideo error: empty default placement in response"), (AdInfo) null);
    }

    public void f(Activity activity, String str) {
        String str2 = "showRewardedVideo(" + str + ")";
        IronSourceLoggerManager ironSourceLoggerManager = this.f17766h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (this.f17731F) {
                this.f17766h.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", 3);
                eq.a().a(ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            } else if (L()) {
                e(activity, str);
            } else {
                eq.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            this.f17766h.logException(IronSourceLogger.IronSourceTag.API, str2, e4);
            eq.a().a(new IronSourceError(510, e4.getMessage()), (AdInfo) null);
        }
    }

    Boolean g() {
        return this.f17741P;
    }

    @Override // com.ironsource.ak
    public void h(String str) {
        try {
            String str2 = this.f17752a + ":setMediationType(mediationType:" + str + ")";
            IronSourceLoggerManager ironSourceLoggerManager = this.f17766h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, str2, 1);
            if (!a(str, 1, 64) || !u(str)) {
                this.f17766h.log(ironSourceTag, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            } else {
                this.f17788s = str;
                this.f17775l0.e(str);
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            this.f17766h.logException(IronSourceLogger.IronSourceTag.API, this.f17752a + ":setMediationType(mediationType:" + str + ")", e4);
        }
    }

    @Override // com.ironsource.ak
    public Placement i(String str) {
        Placement placement;
        try {
            placement = p(str);
            if (placement == null) {
                try {
                    this.f17766h.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    placement = j();
                } catch (Exception e4) {
                    e = e4;
                    o9.d().a(e);
                    return placement;
                }
            }
            this.f17766h.log(IronSourceLogger.IronSourceTag.API, "getPlacementInfo(placement: " + str + "):" + placement, 1);
            return placement;
        } catch (Exception e5) {
            e = e5;
            placement = null;
        }
    }

    @Override // com.ironsource.qa.c
    public synchronized boolean j(String str) {
        boolean z4;
        com.ironsource.mediationsdk.demandOnly.k kVar = this.f17769i0;
        if (kVar != null) {
            z4 = kVar.a(str);
        }
        return z4;
    }

    public String l() {
        return this.f17784q;
    }

    public String n() {
        return this.f17778n;
    }

    public String o() {
        return this.f17780o;
    }

    public List<IronSource.AD_UNIT> p() {
        ArrayList arrayList = new ArrayList();
        Set<IronSource.AD_UNIT> set = this.f17796z;
        if (set != null) {
            arrayList.addAll(set);
        }
        return arrayList;
    }

    boolean q(String str) {
        if (!y()) {
            return false;
        }
        h7 h7Var = null;
        try {
            h7Var = this.f17776m.c().c().a(str);
            if (h7Var == null && (h7Var = this.f17776m.c().c().i()) == null) {
                this.f17766h.log(IronSourceLogger.IronSourceTag.API, "Banner default placement was not found", 3);
                return false;
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
        if (h7Var == null) {
            return false;
        }
        return a(h7Var);
    }

    boolean r(String str) {
        if (this.f17732G) {
            return false;
        }
        boolean z4 = l(str) != pp.b.NOT_CAPPED;
        if (z4) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(this.f17732G, true, 1);
            try {
                mediationAdditionalData.put("placement", str);
                mediationAdditionalData.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            } catch (Exception e4) {
                o9.d().a(e4);
            }
            pj.i().a(new zb(IronSourceConstants.IS_CHECK_CAPPED_TRUE, mediationAdditionalData));
        }
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r0 != 3) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean s(String str) {
        boolean z4;
        pp.b o4 = o(str);
        if (o4 != null) {
            int i4 = b.f17800c[o4.ordinal()];
            z4 = true;
            if (i4 != 1) {
                if (i4 != 2) {
                }
            }
            a(z4, str);
            return z4;
        }
        z4 = false;
        a(z4, str);
        return z4;
    }

    public void t(String str) {
        IronLog.API.verbose("userId = " + str);
        this.f17780o = str;
        br.i().a(new zb(52, IronSourceUtils.getJsonForUserId(false)));
        AdQualityBridge adQualityBridge = this.f17781o0;
        if (adQualityBridge != null) {
            adQualityBridge.changeUserId(str);
        }
    }

    p(of ofVar, of.a aVar, cg cgVar, cf cfVar, yh.a aVar2) {
        this.f17752a = getClass().getName();
        this.f17754b = "!SDK-VERSION-STRING!:com.ironsource:mediationsdk:\u200b8.8.0";
        this.f17774l = new Object();
        this.f17776m = null;
        this.f17778n = null;
        this.f17780o = "";
        this.f17782p = null;
        this.f17784q = null;
        this.f17786r = null;
        this.f17788s = null;
        this.f17791u = false;
        this.f17795y = null;
        this.f17727B = true;
        this.f17729D = "sessionDepth";
        this.f17741P = null;
        this.f17779n0 = false;
        this.f17756c = ofVar;
        this.f17758d = aVar;
        this.f17760e = cgVar;
        this.f17762f = cfVar;
        this.f17764g = aVar2;
        w();
        this.f17772k = new AtomicBoolean();
        this.f17796z = new HashSet();
        this.f17726A = new HashSet();
        this.f17732G = false;
        this.f17731F = false;
        this.f17733H = false;
        this.f17790t = new AtomicBoolean(true);
        this.f17749X = new AtomicBoolean(false);
        this.f17783p0 = new AtomicBoolean(false);
        this.f17730E = 0;
        this.f17734I = false;
        this.f17735J = false;
        this.f17736K = false;
        this.f17737L = false;
        this.f17793w = IronSourceUtils.getSessionId();
        this.f17738M = Boolean.FALSE;
        this.f17755b0 = false;
        this.f17740O = null;
        this.f17742Q = null;
        this.f17747V = null;
        this.f17748W = null;
        this.f17743R = null;
        this.f17750Y = false;
        this.f17761e0 = new ConcurrentHashMap<>();
        this.f17765g0 = new ConcurrentHashMap<>();
        this.f17763f0 = new ConcurrentHashMap<>();
        this.f17767h0 = null;
        this.f17769i0 = null;
        this.f17771j0 = null;
        this.f17759d0 = 1;
        this.f17773k0 = new oc();
        bk bkVar = new bk();
        this.f17775l0 = bkVar;
        this.f17777m0 = new le(bkVar);
        this.f17785q0 = new a();
        this.f17781o0 = null;
        this.f17787r0 = new ng.a();
        this.f17789s0 = new ng.b();
    }

    private com.ironsource.mediationsdk.demandOnly.f a(List<NetworkSettings> list) {
        nj d4 = this.f17776m.c().d();
        ra.a aVar = new ra.a("Mediation");
        if (d4.j()) {
            aVar.a("isOneFlow", 1);
        }
        return new com.ironsource.mediationsdk.demandOnly.f(list, d4, com.ironsource.mediationsdk.c.b(), this.f17787r0, n(), o(), new ra.b(pj.i(), aVar));
    }

    private void d(Activity activity, String str) {
        try {
            InterstitialPlacement m4 = m(str);
            if (m4 == null) {
                m4 = i();
            }
            if (m4 == null) {
                this.f17766h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showProgrammaticInterstitial error: empty default placement in response", 3);
                tg.a().a(new IronSourceError(1020, "showProgrammaticInterstitial error: empty default placement in response"), (AdInfo) null);
                return;
            }
            if (activity != null) {
                e(activity);
            } else if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                this.f17766h.log(IronSourceLogger.IronSourceTag.API, "Activity must be provided in showInterstitial when initializing SDK with context", 3);
                tg.a().a(new IronSourceError(510, "Activity must be provided in showInterstitial when initializing SDK with context"), (AdInfo) null);
                return;
            }
            this.f17744S.a(activity, new Placement(m4));
        } catch (Exception e4) {
            o9.d().a(e4);
            this.f17766h.logException(IronSourceLogger.IronSourceTag.API, "showProgrammaticInterstitial()", e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void e(Activity activity, String str) {
        Placement placement;
        wq wqVar;
        eg egVar;
        try {
            placement = p(str);
            if (placement == null) {
                try {
                    placement = j();
                } catch (Exception e4) {
                    e = e4;
                    o9.d().a(e);
                    this.f17766h.logException(IronSourceLogger.IronSourceTag.API, "showProgrammaticRewardedVideo()", e);
                    if (activity == null) {
                    }
                    wqVar = this.f17745T;
                    if (wqVar == null) {
                    }
                    egVar = this.f17742Q;
                    if (egVar == null) {
                    }
                }
            }
            if (placement == null) {
                this.f17766h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showProgrammaticRewardedVideo error: empty default placement in response", 3);
                eq.a().a(new IronSourceError(1021, "showProgrammaticRewardedVideo error: empty default placement in response"), (AdInfo) null);
                return;
            }
        } catch (Exception e5) {
            e = e5;
            placement = null;
        }
        if (activity == null) {
            e(activity);
        } else if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            this.f17766h.log(IronSourceLogger.IronSourceTag.API, "Activity must be provided in showRewardedVideo when initializing SDK with context", 3);
            eq.a().a(ErrorBuilder.buildInitFailedError("Activity must be provided in showRewardedVideo when initializing SDK with context", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            return;
        }
        wqVar = this.f17745T;
        if (wqVar == null && (this.f17750Y || this.f17753a0)) {
            wqVar.a(activity, placement);
            return;
        }
        egVar = this.f17742Q;
        if (egVar == null) {
            egVar.a(activity, placement);
            return;
        }
        this.f17766h.log(IronSourceLogger.IronSourceTag.API, "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet", 3);
        eq.a().a(new IronSourceError(1023, "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet"), (AdInfo) null);
    }

    ms b(Context context, String str, c cVar) {
        synchronized (this.f17774l) {
            try {
                ms msVar = this.f17776m;
                if (msVar != null) {
                    return new ms(msVar);
                }
                ms a4 = a(context, str, cVar);
                if (a4 == null || !a4.p()) {
                    IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                    IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                    logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
                    a4 = a(context, n());
                    if (a4 != null) {
                        IronSourceError buildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(n(), str);
                        this.f17766h.log(ironSourceTag, buildUsingCachedConfigurationError.toString() + ": " + a4.toString(), 1);
                        br.i().a(new zb(IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.getMediationAdditionalData(false)));
                    }
                }
                if (a4 != null) {
                    this.f17776m = a4;
                    IronSourceUtils.saveLastResponse(context, a4.toString());
                    b(this.f17776m, context);
                    pj.i().c(true);
                    br.i().c(true);
                    jp.f16866P.c(true);
                }
                return a4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(Activity activity, String str) {
        String str2 = "showInterstitial(" + str + ")";
        IronSourceLoggerManager ironSourceLoggerManager = this.f17766h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (this.f17732G) {
                this.f17766h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                tg.a().a(new IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (AdInfo) null);
            } else if (D()) {
                d(activity, str);
            } else {
                tg.a().a(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"), (AdInfo) null);
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            this.f17766h.logException(IronSourceLogger.IronSourceTag.API, str2, e4);
            tg.a().a(new IronSourceError(510, e4.getMessage()), (AdInfo) null);
        }
    }

    @Override // com.ironsource.qa.b
    public synchronized boolean f(String str) {
        boolean z4;
        com.ironsource.mediationsdk.demandOnly.f fVar = this.f17767h0;
        if (fVar != null) {
            z4 = fVar.b(str);
        }
        return z4;
    }

    private void d(Context context) {
        AtomicBoolean atomicBoolean = this.f17772k;
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        tt.a().a(new ee(context));
        pj.i().a(context, this.f17728C);
        br.i().a(context, this.f17728C);
        jp.f16866P.a(context, this.f17728C);
    }

    public synchronized IronSourceError a(Context context, String str, boolean z4, InitializationListener initializationListener, fo foVar, IronSource.AD_UNIT... ad_unitArr) {
        Throwable th;
        int i4;
        boolean z5;
        try {
            try {
                IronLog.INTERNAL.verbose("GitHash: 16fd30e");
                C1486j.f16777a.a(context);
                try {
                    if (!gk.a((Object) context, "Init Failed - provided context is null")) {
                        d("Provided context is null");
                        return new IronSourceError(2000, "Provided context is null");
                    }
                    this.f17764g.a(context);
                    boolean z6 = context instanceof Activity;
                    if (z6) {
                        e((Activity) context);
                    }
                    if (initializationListener != null) {
                        this.f17747V = initializationListener;
                    }
                    if (!z4) {
                        this.f17783p0.set(true);
                    }
                    AtomicBoolean atomicBoolean = this.f17790t;
                    if (atomicBoolean == null || !atomicBoolean.compareAndSet(true, false)) {
                        if (ad_unitArr != null) {
                            a(z6, z4, foVar != null, ad_unitArr);
                            if (C() && !z4) {
                                T();
                            }
                        } else {
                            this.f17766h.log(IronSourceLogger.IronSourceTag.API, "Multiple calls to init without ad units are not allowed", 3);
                        }
                        as b4 = bs.f15648a.b();
                        if (C()) {
                            return new IronSourceError(IronSourceError.ERROR_INIT_ALREADY_FINISHED, "Already finished init");
                        }
                        if (b4 == as.INIT_FAILED) {
                            return new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed");
                        }
                        if (b4 == as.NOT_INIT) {
                            return new IronSourceError(2020, "Already called new init");
                        }
                        if (foVar != null) {
                            a(foVar);
                        }
                        return new IronSourceError(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, "Old Api init in progress");
                    }
                    bs.f15648a.a(foVar == null);
                    if ((ad_unitArr == null || ad_unitArr.length == 0) && foVar == null) {
                        for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
                            this.f17796z.add(ad_unit);
                        }
                        this.f17734I = true;
                        this.f17735J = true;
                        this.f17736K = true;
                        this.f17737L = true;
                    } else {
                        for (IronSource.AD_UNIT ad_unit2 : ad_unitArr) {
                            this.f17796z.add(ad_unit2);
                            this.f17726A.add(ad_unit2);
                            if (ad_unit2.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                                this.f17735J = true;
                            }
                            if (ad_unit2.equals(IronSource.AD_UNIT.BANNER)) {
                                this.f17736K = true;
                            }
                            if (ad_unit2.equals(IronSource.AD_UNIT.NATIVE_AD)) {
                                this.f17737L = true;
                            }
                            if (ad_unit2.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                                this.f17734I = true;
                            }
                        }
                    }
                    IronLog.API.info("init(appKey:" + str + ")");
                    r8 v4 = v(str);
                    if (v4.b()) {
                        this.f17778n = str;
                    }
                    ms a4 = a(context, this.f17778n);
                    if (a4 != null) {
                        IronLog.INTERNAL.verbose("init cache exists");
                        a(a4.c().b().e());
                    } else {
                        IronLog.INTERNAL.verbose("init cache does not exist");
                    }
                    ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
                    this.f17758d.a(context.getApplicationContext(), TimeUnit.HOURS.toMillis(xa.f20303a.d()));
                    this.f17775l0.f(IronSourceUtils.getSDKVersion());
                    this.f17775l0.a(gg.a());
                    this.f17775l0.b(IronSourceUtils.isGooglePlayInstalled(context));
                    this.f17775l0.a(C1495k1.a());
                    V();
                    d(context);
                    if (this.f17778n == null) {
                        s.c().f();
                        if (this.f17796z.contains(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                            eq.a().a(false, (AdInfo) null);
                        }
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, v4.a().toString(), 1);
                        return new IronSourceError(IronSourceError.ERROR_OLD_INIT_API_APP_KEY_IS_NULL, "App key is null");
                    }
                    this.f17775l0.a(context);
                    this.f17775l0.b(this.f17778n);
                    this.f17775l0.g(this.f17793w);
                    if (this.f17727B) {
                        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z4);
                        if (ad_unitArr != null) {
                            for (IronSource.AD_UNIT ad_unit3 : ad_unitArr) {
                                try {
                                    mediationAdditionalData.put(ad_unit3.toString(), true);
                                } catch (Exception e4) {
                                    o9.d().a(e4);
                                }
                            }
                        }
                        int i5 = this.f17730E + 1;
                        this.f17730E = i5;
                        if (foVar != null) {
                            z5 = true;
                            i4 = i5;
                        } else {
                            i4 = i5;
                            z5 = false;
                        }
                        try {
                            a(z6, z4, i4, mediationAdditionalData, z5);
                            this.f17727B = false;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            throw th;
                        }
                    }
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // com.ironsource.ak
    public String b(Context context) {
        String p4 = this.f17756c.p(context);
        return !TextUtils.isEmpty(p4) ? p4 : "";
    }

    public void c(@NotNull Context context) {
        au auVar = au.f15135a;
        auVar.b();
        if (!C()) {
            auVar.a(IronSourceConstants.errorCode_TEST_SUITE_SDK_NOT_INITIALIZED);
            IronLog.API.error("TestSuite cannot be launched, SDK not initialized");
            return;
        }
        if (!b(this.f17776m)) {
            auVar.a(IronSourceConstants.errorCode_TEST_SUITE_DISABLED);
            IronLog.API.error("TestSuite cannot be launched, Please contact your account manager to enable it");
            return;
        }
        if (!IronSourceUtils.isNetworkConnected(context)) {
            auVar.a(IronSourceConstants.errorCode_TEST_SUITE_NO_NETWORK_CONNECTIVITY);
            IronLog.API.error("TestSuite cannot be launched, No network connectivity");
            return;
        }
        ij ijVar = this.f17744S;
        if (ijVar != null) {
            ijVar.J();
        }
        wq wqVar = this.f17745T;
        if (wqVar != null) {
            wqVar.J();
        }
        g6 g6Var = this.f17746U;
        if (g6Var != null) {
            g6Var.J();
            this.f17746U.T();
        }
        new bu().a(context, n(), this.f17776m.i(), IronSourceUtils.getSDKVersion(), this.f17776m.c().g().b(), g(), this.f17750Y);
        this.f17779n0 = true;
        auVar.c();
    }

    @Override // com.ironsource.ak
    public boolean e(String str) {
        try {
            String str2 = this.f17752a + ":setDynamicUserId(dynamicUserId:" + str + ")";
            IronSourceLoggerManager ironSourceLoggerManager = this.f17766h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, str2, 1);
            r8 r8Var = new r8();
            a(str, r8Var);
            if (!r8Var.b()) {
                IronSourceLoggerManager.getLogger().log(ironSourceTag, r8Var.a().toString(), 2);
                return false;
            }
            this.f17784q = str;
            br.i().a(new zb(52, IronSourceUtils.getJsonForUserId(true)));
            return true;
        } catch (Exception e4) {
            o9.d().a(e4);
            this.f17766h.logException(IronSourceLogger.IronSourceTag.API, this.f17752a + ":setDynamicUserId(dynamicUserId:" + str + ")", e4);
            return false;
        }
    }

    @Nullable
    private IronSourceError a(s.d dVar) {
        if (!this.f17736K) {
            return new IronSourceError(510, "ironSource SDK was not initialized");
        }
        if (!this.f17733H) {
            return new IronSourceError(510, "ironSource SDK was not initialized using Demand Only mode");
        }
        if (dVar == s.d.INIT_FAILED) {
            return new IronSourceError(510, "ironSource initialization failed");
        }
        if (dVar == s.d.INIT_IN_PROGRESS && s.c().d()) {
            return new IronSourceError(510, "ironSource initialization in progress");
        }
        return null;
    }

    @Override // com.ironsource.ak
    public void b() {
        this.f17786r = null;
    }

    @Override // com.ironsource.qa.a
    public void c(String str) {
        this.f17766h.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            com.ironsource.mediationsdk.demandOnly.c cVar = this.f17771j0;
            if (cVar != null) {
                cVar.a(str);
            }
        } catch (Throwable th) {
            o9.d().a(th);
            this.f17766h.logException(IronSourceLogger.IronSourceTag.API, "destroyISDemandOnlyBanner()", th);
        }
    }

    @Override // com.ironsource.no
    public void d(String str) {
        try {
            this.f17766h.log(IronSourceLogger.IronSourceTag.API, "onInitFailed(reason:" + str + ")", 1);
            IronSourceUtils.sendAutomationLog("Mediation init failed");
            if (this.f17768i != null) {
                Iterator<IronSource.AD_UNIT> it = this.f17796z.iterator();
                while (it.hasNext()) {
                    a(it.next(), true);
                }
            }
            fo r4 = r();
            if (r4 != null) {
                r4.onInitFailed(new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed"));
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    private void b(int i4, JSONObject jSONObject) {
        br.i().a(new zb(i4, jSONObject));
    }

    private synchronized void c(boolean z4) {
        this.f17791u = z4;
    }

    public ms a(Context context, String str) {
        if (!ti.a(context)) {
            return null;
        }
        d8 c4 = ti.c(context);
        String d4 = c4.d();
        String f4 = c4.f();
        String e4 = c4.e();
        if (!d4.equals(str)) {
            return null;
        }
        ms msVar = new ms(context, d4, f4, e4);
        msVar.a(ms.a.CACHE);
        return msVar;
    }

    private ms a(Context context, String str, c cVar) {
        Exception exc;
        ms msVar = null;
        if (!IronSourceUtils.isNetworkConnected(context)) {
            return null;
        }
        try {
            String b4 = b(context);
            if (TextUtils.isEmpty(b4)) {
                b4 = this.f17756c.M(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str2 = b4;
            IronSourceSegment ironSourceSegment = this.f17728C;
            String sendPostRequest = HttpFunctions.sendPostRequest(ServerURL.buildInitURL(context, n(), str, str2, q(), this.f17750Y, ironSourceSegment != null ? ironSourceSegment.getSegmentData() : null, B()), ri.a().toString(), cVar);
            if (sendPostRequest == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (IronSourceUtils.isEncryptedResponse()) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                JSONObject jSONObject = new JSONObject(sendPostRequest);
                String optString = jSONObject.optString(ms.f18193n, null);
                if (TextUtils.isEmpty(optString)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return null;
                }
                sendPostRequest = a(optString, Boolean.valueOf(jSONObject.optBoolean("compression", false)));
                if (TextUtils.isEmpty(sendPostRequest)) {
                    ironLog.warning("encoded response invalid - return null");
                    U();
                    return null;
                }
            }
            ms msVar2 = new ms(context, n(), str, sendPostRequest);
            try {
                msVar2.a(ms.a.SERVER);
                if (msVar2.p()) {
                    return msVar2;
                }
                IronLog.INTERNAL.warning("response invalid - return null");
                return null;
            } catch (Exception e4) {
                exc = e4;
                msVar = msVar2;
                o9.d().a(exc);
                IronLog.INTERNAL.warning("exception = " + exc);
                return msVar;
            }
        } catch (Exception e5) {
            exc = e5;
        }
    }

    public void b(Activity activity) {
        IronLog ironLog = IronLog.API;
        ironLog.info("onResume()");
        try {
            if (!FeaturesManager.getInstance().getStopUseOnResumeAndPause()) {
                ContextProvider.getInstance().onResume(activity);
                return;
            }
            ironLog.info("onResume() is disabled");
        } catch (Throwable th) {
            this.f17766h.logException(IronSourceLogger.IronSourceTag.API, "onResume()", th);
            o9.d().a(th);
        }
    }

    pp.b a(InterstitialPlacement interstitialPlacement) {
        return this.f17760e.a(ContextProvider.getInstance().getApplicationContext(), interstitialPlacement, IronSource.AD_UNIT.INTERSTITIAL);
    }

    @Override // com.ironsource.qa.c
    public synchronized void b(Activity activity, String str) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.AD_UNIT.REWARDED_VIDEO).b(), this.f17789s0.a(str));
    }

    pp.b a(Placement placement) {
        return this.f17760e.a(ContextProvider.getInstance().getApplicationContext(), placement, IronSource.AD_UNIT.REWARDED_VIDEO);
    }

    @Override // com.ironsource.qa.b
    public synchronized void b(Activity activity, String str, String str2) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.AD_UNIT.INTERSTITIAL).a(true).a(str2).b(), this.f17787r0.a(str));
    }

    private void b(C1477h4 c1477h4, Context context, ms msVar) {
        br.i().a(c1477h4.c(), context);
        br.i().b(c1477h4.d(), context);
        br.i().b(c1477h4.f());
        br.i().a(c1477h4.e());
        br.i().c(c1477h4.a());
        br.i().c(c1477h4.i(), context);
        br.i().a(c1477h4.h(), context);
        br.i().b(c1477h4.j(), context);
        br.i().d(c1477h4.g(), context);
        br.i().a(msVar.c().b().i());
        br.i().a(c1477h4.k());
        br.i().d(c1477h4.b());
    }

    @Override // com.ironsource.qa
    @Nullable
    public String a(@NotNull Context context) {
        String str;
        as asVar;
        String str2;
        ev j4;
        ra k4 = k();
        as asVar2 = null;
        try {
            asVar = bs.f15648a.a();
        } catch (Exception unused) {
            str = null;
        }
        try {
            k4.a(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_IN_INIT_STATUS, asVar);
        } catch (Exception unused2) {
            str = null;
            asVar2 = asVar;
            k4.a(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_ENRICH_TOKEN_ERROR, asVar2);
            asVar = asVar2;
            str2 = str;
            k4.a(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_TOKEN_RETURNED, asVar);
            return str2;
        }
        if (context == null) {
            IronLog.API.error("bidding data cannot be retrieved, context required");
            k4.a(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_WITHOUT_CONTEXT, (as) null);
            return null;
        }
        if (asVar == as.NOT_INIT) {
            IronLog.API.error("bidding data cannot be retrieved, SDK not initialized");
            k4.a(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_NO_INIT_RETURNED_NULL, (as) null);
            return null;
        }
        s.c().g();
        ms msVar = this.f17776m;
        boolean e4 = (msVar == null || (j4 = msVar.c().b().j()) == null) ? true : j4.e();
        this.f17775l0.b(context);
        JSONObject a4 = new dv().a(context);
        com.ironsource.mediationsdk.d.b().a(a4, true);
        str2 = e4 ? IronSourceAES.compressAndEncrypt(a4.toString()) : IronSourceAES.encrypt(a4.toString());
        if (TextUtils.isEmpty(str2)) {
            k4.a(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, asVar);
        }
        k4.a(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_TOKEN_RETURNED, asVar);
        return str2;
    }

    private void b(IronSource.AD_UNIT ad_unit) {
        int i4 = b.f17798a[ad_unit.ordinal()];
        if (i4 == 1) {
            g0();
        } else if (i4 == 2) {
            c0();
        } else {
            if (i4 != 3) {
                return;
            }
            X();
        }
    }

    String a(String str, pp.b bVar) {
        if (bVar == null) {
            return null;
        }
        int i4 = b.f17800c[bVar.ordinal()];
        if (i4 != 1 && i4 != 2 && i4 != 3) {
            return null;
        }
        return "placement " + str + " is capped";
    }

    private String a(String str, Boolean bool) {
        return bool.booleanValue() ? IronSourceAES.decryptAndDecompress(mb.b().c(), str) : IronSourceAES.decode(mb.b().c(), str);
    }

    public void b(IronSourceBannerLayout ironSourceBannerLayout) {
        a(ironSourceBannerLayout, "");
    }

    HashSet<String> a(String str, String str2) {
        ms msVar = this.f17776m;
        return msVar == null ? new HashSet<>() : msVar.k().a(str, str2);
    }

    @Override // com.ironsource.ki
    public void b(@NotNull ImpressionDataListener impressionDataListener) {
        if (gk.a((Object) impressionDataListener, "addImpressionDataListener - listener is null")) {
            rk.b().a(impressionDataListener);
            eg egVar = this.f17742Q;
            if (egVar != null) {
                egVar.b(impressionDataListener);
            }
            w wVar = this.f17743R;
            if (wVar != null) {
                wVar.b(impressionDataListener);
            }
            IronLog.API.info("add impression data listener to " + impressionDataListener.getClass().getSimpleName());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0046, B:10:0x004a, B:12:0x0054, B:14:0x0058, B:15:0x005c, B:17:0x0064, B:18:0x0067, B:20:0x006f, B:22:0x0073, B:23:0x0077, B:25:0x007f, B:26:0x0082, B:28:0x008a, B:30:0x008e, B:33:0x0092, B:35:0x009a, B:32:0x009d, B:41:0x00a2, B:43:0x00a6, B:44:0x00ac, B:50:0x0012, B:52:0x0016, B:53:0x0023, B:55:0x0027, B:56:0x0034, B:58:0x0038, B:59:0x003e, B:60:0x002d, B:61:0x001c), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0046, B:10:0x004a, B:12:0x0054, B:14:0x0058, B:15:0x005c, B:17:0x0064, B:18:0x0067, B:20:0x006f, B:22:0x0073, B:23:0x0077, B:25:0x007f, B:26:0x0082, B:28:0x008a, B:30:0x008e, B:33:0x0092, B:35:0x009a, B:32:0x009d, B:41:0x00a2, B:43:0x00a6, B:44:0x00ac, B:50:0x0012, B:52:0x0016, B:53:0x0023, B:55:0x0027, B:56:0x0034, B:58:0x0038, B:59:0x003e, B:60:0x002d, B:61:0x001c), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized List<IronSource.AD_UNIT> a(Context context, String str, boolean z4, IronSource.AD_UNIT... ad_unitArr) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (ad_unitArr != null) {
                if (ad_unitArr.length == 0) {
                }
                for (IronSource.AD_UNIT ad_unit : ad_unitArr) {
                    if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                        if (this.f17735J) {
                            a(ad_unit);
                        } else {
                            this.f17732G = true;
                            if (!arrayList.contains(ad_unit)) {
                                arrayList.add(ad_unit);
                            }
                        }
                    }
                    if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                        if (this.f17734I) {
                            a(ad_unit);
                        } else {
                            this.f17731F = true;
                            if (!arrayList.contains(ad_unit)) {
                                arrayList.add(ad_unit);
                            }
                        }
                    }
                    if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
                        if (this.f17736K) {
                            a(ad_unit);
                        } else {
                            this.f17733H = true;
                            if (!arrayList.contains(ad_unit)) {
                                arrayList.add(ad_unit);
                            }
                        }
                    }
                }
                if (context != null) {
                    if (context instanceof Activity) {
                        e((Activity) context);
                    }
                    ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
                }
            }
            if (z4) {
                if (this.f17734I) {
                    a(IronSource.AD_UNIT.REWARDED_VIDEO);
                } else {
                    this.f17731F = true;
                    arrayList.add(IronSource.AD_UNIT.REWARDED_VIDEO);
                }
                if (this.f17735J) {
                    a(IronSource.AD_UNIT.INTERSTITIAL);
                } else {
                    this.f17732G = true;
                    arrayList.add(IronSource.AD_UNIT.INTERSTITIAL);
                }
                if (this.f17736K) {
                    a(IronSource.AD_UNIT.BANNER);
                } else {
                    this.f17733H = true;
                    arrayList.add(IronSource.AD_UNIT.BANNER);
                }
                if (context != null) {
                }
            }
            while (r1 < r7) {
            }
            if (context != null) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public void b(ms msVar, Context context) {
        a(msVar);
        a(msVar, context);
    }

    private List<NetworkSettings> a(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            String str = arrayList.get(i4);
            if (!TextUtils.isEmpty(str)) {
                arrayList2.add(this.f17776m.k().b(str));
            }
        }
        return arrayList2;
    }

    @Override // com.ironsource.qa.b
    public void b(String str) {
        IronSourceError ironSourceError;
        this.f17766h.log(IronSourceLogger.IronSourceTag.API, "showDemandOnlyInterstitial() instanceId=" + str, 1);
        ISDemandOnlyInterstitialListener a4 = this.f17787r0.a(str);
        try {
            if (this.f17732G) {
                com.ironsource.mediationsdk.demandOnly.f fVar = this.f17767h0;
                if (fVar != null) {
                    fVar.a(str);
                    return;
                } else {
                    IronLog.API.error("Interstitial was not initiated");
                    ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Interstitial was not initiated");
                }
            } else {
                IronLog.API.error("Interstitial was initialized in mediation mode. Use showInterstitial instead");
                ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Interstitial was initialized in mediation mode. Use showInterstitial instead");
            }
            a4.onInterstitialAdShowFailed(str, ironSourceError);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.API.error(e4.getMessage());
            if (a4 != null) {
                a4.onInterstitialAdShowFailed(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"));
            }
        }
    }

    @Override // com.ironsource.no
    public void a() {
        if (this.f17738M.booleanValue()) {
            this.f17738M = Boolean.FALSE;
            n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION, "init() had failed"));
            this.f17739N = null;
            this.f17740O = null;
        }
        if (this.f17755b0) {
            this.f17755b0 = false;
            n.a().b(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
        }
        if (this.f17751Z) {
            this.f17751Z = false;
            n.a().b(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        synchronized (this.f17761e0) {
            try {
                Iterator<h.d> it = this.f17761e0.values().iterator();
                while (it.hasNext()) {
                    String c4 = it.next().c();
                    this.f17787r0.a(c4).onInterstitialAdLoadFailed(c4, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                }
                this.f17761e0.clear();
            } finally {
            }
        }
        synchronized (this.f17765g0) {
            try {
                Iterator<h.d> it2 = this.f17765g0.values().iterator();
                while (it2.hasNext()) {
                    String c5 = it2.next().c();
                    this.f17789s0.a(c5).onRewardedVideoAdLoadFailed(c5, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
                this.f17765g0.clear();
            } finally {
            }
        }
        synchronized (this.f17763f0) {
            try {
                for (h.b bVar : this.f17763f0.values()) {
                    ISDemandOnlyBannerLayout g4 = bVar.g();
                    if (g4 != null) {
                        g4.getListener().a(bVar.c(), ErrorBuilder.buildInitFailedError("init() had failed", "Banner"));
                    }
                }
                this.f17763f0.clear();
            } finally {
            }
        }
    }

    public void b(@NotNull String str, @NotNull JSONObject jSONObject) {
        v vVar = new v(str, jSONObject);
        IronLog.API.verbose(vVar.toString());
        com.ironsource.mediationsdk.c.b().a(vVar);
    }

    private void a(int i4, JSONObject jSONObject) {
        pj.i().a(new zb(i4, jSONObject));
    }

    public void b(boolean z4) {
        this.f17741P = Boolean.valueOf(z4);
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "setConsent : " + z4, 1);
        com.ironsource.mediationsdk.c.b().b(z4);
        this.f17775l0.a(z4);
        br.i().a(new zb(z4 ? 40 : 41, IronSourceUtils.getMediationAdditionalData(false)));
    }

    private boolean b(h.b bVar) {
        synchronized (this.f17763f0) {
            try {
                if (this.f17771j0 != null) {
                    return false;
                }
                this.f17763f0.put(bVar.c(), bVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(long j4, ms.a aVar) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(B());
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_DURATION, j4);
            mediationAdditionalData.put("sessionDepth", this.f17730E);
            mediationAdditionalData.put(IronSourceConstants.EVENTS_EXT1, aVar.a());
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
        br.i().a(new zb(IronSourceConstants.INIT_COMPLETE, mediationAdditionalData));
    }

    private boolean b(ms msVar) {
        return msVar != null && msVar.o();
    }

    public void a(Activity activity) {
        try {
            if (FeaturesManager.getInstance().getStopUseOnResumeAndPause()) {
                return;
            }
            this.f17766h.log(IronSourceLogger.IronSourceTag.API, "onPause()", 1);
            ContextProvider.getInstance().onPause(activity);
        } catch (Throwable th) {
            o9.d().a(th);
            this.f17766h.logException(IronSourceLogger.IronSourceTag.API, "onPause()", th);
        }
    }

    private boolean b(List<IronSource.AD_UNIT> list, boolean z4, s8 s8Var) {
        IronLog.INTERNAL.verbose();
        try {
            this.f17770j.a(s8Var.b().g().d());
            this.f17792v = list;
            c(true);
            this.f17766h.log(IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            IronSourceUtils.sendAutomationLog("init success");
            if (z4) {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                try {
                    mediationAdditionalData.put("revived", true);
                } catch (JSONException e4) {
                    o9.d().a(e4);
                    IronLog.INTERNAL.error(e4.toString());
                }
                br.i().a(new zb(IronSourceConstants.FIRST_INSTANCE_RESULT, mediationAdditionalData));
            }
            int b4 = s8Var.b().e().b();
            if (b4 >= 0) {
                z8 z8Var = new z8();
                z8Var.a(b4);
                z8Var.a(b4, this.f17776m.k().d());
            }
            pj.i().h();
            br.i().h();
            com.ironsource.mediationsdk.c.b().b(n(), o());
            for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
                if (this.f17796z.contains(ad_unit)) {
                    if (list.contains(ad_unit)) {
                        b(ad_unit);
                    } else {
                        a(ad_unit, false);
                    }
                }
            }
            if (x() && W()) {
                AdQualityBridge adQualityBridge = new AdQualityBridge(ContextProvider.getInstance().getApplicationContext(), n(), o(), new C1481i1(), this.f17776m.c().b().g().a());
                this.f17781o0 = adQualityBridge;
                IronSourceSegment ironSourceSegment = this.f17728C;
                if (ironSourceSegment != null) {
                    adQualityBridge.setSegment(ironSourceSegment);
                }
            }
            T();
            fo r4 = r();
            if (r4 != null) {
                r4.a(this.f17776m);
            }
            return true;
        } catch (Exception e5) {
            o9.d().a(e5);
            IronLog.INTERNAL.error(e5.toString());
            fo r5 = r();
            if (r5 != null) {
                r5.onInitFailed(new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "onInitSuccess() had failed"));
            }
            return false;
        }
    }

    @Override // com.ironsource.qa.a
    public synchronized void a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        h.b a4 = new h.c().b(str).a(activity).a(iSDemandOnlyBannerLayout).a(IronSource.AD_UNIT.BANNER).a();
        IronSourceError a5 = a4.a();
        if (a5 != null) {
            this.f17766h.log(IronSourceLogger.IronSourceTag.API, a5.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.getListener().a(str, a5);
            }
            return;
        }
        IronSourceError a6 = a(s.c().a());
        if (a6 != null) {
            this.f17766h.log(IronSourceLogger.IronSourceTag.API, a6.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.getListener().a(str, a6);
            return;
        }
        ContextProvider.getInstance().updateActivity(activity);
        if (a(a4)) {
            return;
        }
        if (!z()) {
            this.f17766h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
        } else {
            if (b(a4)) {
                return;
            }
            this.f17771j0.a(iSDemandOnlyBannerLayout, str);
        }
    }

    @Override // com.ironsource.qa.a
    public synchronized void a(@NotNull Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        h.b a4 = new h.c().b(str).a(activity).a(true).a(str2).a(iSDemandOnlyBannerLayout).a(IronSource.AD_UNIT.BANNER).a();
        IronSourceError a5 = a4.a();
        if (a5 != null) {
            this.f17766h.log(IronSourceLogger.IronSourceTag.API, a5.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.getListener().a(str, a5);
            }
            return;
        }
        IronSourceError a6 = a(s.c().a());
        if (a6 != null) {
            this.f17766h.log(IronSourceLogger.IronSourceTag.API, a6.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.getListener().a(str, a6);
            return;
        }
        ContextProvider.getInstance().updateActivity(activity);
        if (a(a4)) {
            return;
        }
        if (!z()) {
            this.f17766h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
        } else {
            if (b(a4)) {
                return;
            }
            this.f17771j0.a(iSDemandOnlyBannerLayout, str, str2);
        }
    }

    @Override // com.ironsource.qa.b
    public synchronized void a(Activity activity, String str) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.AD_UNIT.INTERSTITIAL).b(), this.f17787r0.a(str));
    }

    @Override // com.ironsource.qa.c
    public synchronized void a(Activity activity, String str, String str2) {
        a(new h.c().b(str).a(str2).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(true).a(IronSource.AD_UNIT.REWARDED_VIDEO).b(), this.f17789s0.a(str));
    }

    public synchronized void a(Context context, String str, boolean z4, InitializationListener initializationListener, IronSource.AD_UNIT... ad_unitArr) {
        if (a(context, str, z4, initializationListener, null, ad_unitArr) == null) {
            s.c().a(this);
            s.c().a(this.f17773k0);
            s.c().a(context, str, this.f17780o, ad_unitArr);
        }
    }

    @Override // com.ironsource.qa
    public synchronized void a(Context context, String str, IronSource.AD_UNIT... ad_unitArr) {
        try {
            try {
                List<IronSource.AD_UNIT> a4 = a(context, str, true, ad_unitArr);
                if (!a4.isEmpty()) {
                    a(context, str, true, (InitializationListener) null, (IronSource.AD_UNIT[]) a4.toArray(new IronSource.AD_UNIT[a4.size()]));
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // com.ironsource.ak
    public void a(Context context, boolean z4) {
        this.f17794x = context;
        this.f17795y = Boolean.valueOf(z4);
        ij ijVar = this.f17744S;
        if (ijVar != null) {
            ijVar.a(context, z4);
        }
        if (this.f17753a0) {
            wq wqVar = this.f17745T;
            if (wqVar != null) {
                wqVar.a(context, z4);
                return;
            }
            return;
        }
        eg egVar = this.f17742Q;
        if (egVar != null) {
            egVar.a(context, z4);
        }
    }

    private synchronized void a(fo foVar) {
        this.f17748W = foVar;
    }

    private void a(C1477h4 c1477h4, Context context, ms msVar) {
        pj.i().a(c1477h4.c(), context);
        pj.i().b(c1477h4.d(), context);
        pj.i().b(c1477h4.f());
        pj.i().a(c1477h4.e());
        pj.i().c(c1477h4.a());
        pj.i().c(c1477h4.i(), context);
        pj.i().a(c1477h4.h(), context);
        pj.i().b(c1477h4.j(), context);
        pj.i().d(c1477h4.g(), context);
        pj.i().a(msVar.c().b().i());
        pj.i().a(c1477h4.k());
        pj.i().d(c1477h4.b());
    }

    private void a(C1498k4 c1498k4) {
        xa xaVar = xa.f20303a;
        xaVar.c(c1498k4.g());
        xaVar.a(c1498k4.f());
        xaVar.a(c1498k4.j());
        this.f17762f.a(c1498k4);
    }

    private void a(IronSource.AD_UNIT ad_unit) {
        String str = ad_unit + " ad unit has already been initialized";
        this.f17766h.log(IronSourceLogger.IronSourceTag.API, str, 3);
        IronSourceUtils.sendAutomationLog(str);
    }

    public void a(IronSource.AD_UNIT ad_unit, @Nullable fu fuVar) {
        g6 g6Var;
        wq wqVar;
        ij ijVar;
        if (this.f17779n0) {
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL && (ijVar = this.f17744S) != null) {
                ijVar.a(fuVar);
            }
            if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO && (wqVar = this.f17745T) != null) {
                wqVar.a(fuVar);
            }
            if (ad_unit != IronSource.AD_UNIT.BANNER || (g6Var = this.f17746U) == null) {
                return;
            }
            g6Var.a(fuVar);
        }
    }

    public void a(IronSource.AD_UNIT ad_unit, WaterfallConfiguration waterfallConfiguration) {
        if (ad_unit == null) {
            IronLog.API.error("AdUnit should not be null.");
            return;
        }
        IronLog.API.info(String.format("(%s, %s)", ad_unit.name(), waterfallConfiguration == null ? "NULL" : waterfallConfiguration.toString()));
        zb zbVar = new zb(53, IronSourceUtils.getMediationAdditionalData(false));
        zbVar.a(IronSourceConstants.EVENTS_EXT1, waterfallConfiguration == null ? "" : waterfallConfiguration.toJsonString());
        br.i().a(zbVar, ad_unit);
        this.f17775l0.a(ad_unit, waterfallConfiguration);
    }

    private void a(IronSource.AD_UNIT ad_unit, boolean z4) {
        int i4 = b.f17798a[ad_unit.ordinal()];
        if (i4 == 1) {
            if (this.f17731F) {
                Iterator<h.d> it = this.f17765g0.values().iterator();
                while (it.hasNext()) {
                    String c4 = it.next().c();
                    this.f17789s0.a(c4).onRewardedVideoAdLoadFailed(c4, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
                this.f17765g0.clear();
                return;
            }
            if (this.f17750Y) {
                if (this.f17751Z) {
                    this.f17751Z = false;
                    n.a().b(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
                return;
            }
            if (z4 || L() || this.f17726A.contains(ad_unit)) {
                eq.a().a(false, (AdInfo) null);
                return;
            }
            return;
        }
        if (i4 == 2) {
            if (!this.f17732G) {
                if (this.f17755b0) {
                    this.f17755b0 = false;
                    n.a().b(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                    return;
                }
                return;
            }
            Iterator<h.d> it2 = this.f17761e0.values().iterator();
            while (it2.hasNext()) {
                String c5 = it2.next().c();
                this.f17787r0.a(c5).onInterstitialAdLoadFailed(c5, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Interstitial"));
            }
            this.f17761e0.clear();
            return;
        }
        if (i4 != 3) {
            return;
        }
        if (!this.f17733H) {
            if (this.f17738M.booleanValue()) {
                this.f17738M = Boolean.FALSE;
                n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_INIT_FAILED_AFTER_LOAD, "init() had failed"));
                this.f17739N = null;
                this.f17740O = null;
                return;
            }
            return;
        }
        for (h.b bVar : this.f17763f0.values()) {
            ISDemandOnlyBannerLayout g4 = bVar.g();
            if (g4 != null) {
                g4.getListener().a(bVar.c(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Banner"));
            }
        }
        this.f17763f0.clear();
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout) {
        g6 g6Var;
        this.f17766h.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (this.f17757c0 && (g6Var = this.f17746U) != null) {
                g6Var.a(ironSourceBannerLayout);
                return;
            }
            w wVar = this.f17743R;
            if (wVar != null) {
                wVar.a(ironSourceBannerLayout);
            }
        } catch (Throwable th) {
            o9.d().a(th);
            this.f17766h.logException(IronSourceLogger.IronSourceTag.API, "destroyBanner()", th);
        }
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        IronLog.INTERNAL.verbose("placementName = " + str);
        if (this.f17733H) {
            this.f17766h.log(IronSourceLogger.IronSourceTag.API, "Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", 3);
            n.a().b(IronSource.AD_UNIT.BANNER, ErrorBuilder.buildInitFailedError("Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", "Banner"));
            return;
        }
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            StringBuilder sb = new StringBuilder();
            sb.append("loadBanner can't be called - ");
            sb.append(ironSourceBannerLayout == null ? "banner layout is null " : "banner layout is destroyed");
            String sb2 = sb.toString();
            this.f17766h.log(IronSourceLogger.IronSourceTag.API, sb2, 3);
            n.a().b(IronSource.AD_UNIT.BANNER, ErrorBuilder.buildLoadFailedError(sb2));
            return;
        }
        if (!this.f17736K) {
            this.f17766h.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadBanner()", 3);
            n.a().b(IronSource.AD_UNIT.BANNER, ErrorBuilder.buildLoadFailedError("init() must be called before loadBanner()"));
            return;
        }
        if (ironSourceBannerLayout.getSize().getDescription().equals(l.f17632f) && (ironSourceBannerLayout.getSize().getWidth() <= 0 || ironSourceBannerLayout.getSize().getHeight() <= 0)) {
            this.f17766h.log(IronSourceLogger.IronSourceTag.API, "loadBanner: Unsupported banner size. Height and width must be bigger than 0", 3);
            n.a().b(IronSource.AD_UNIT.BANNER, ErrorBuilder.unsupportedBannerSize(""));
            return;
        }
        s.d a4 = s.c().a();
        if (a4 == s.d.INIT_FAILED) {
            this.f17766h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
            n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(600, "Init() had failed"));
            return;
        }
        if (a4 == s.d.INIT_IN_PROGRESS) {
            if (s.c().d()) {
                this.f17766h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_LOAD_AFTER_LONG_INITIATION, "Init() had failed"));
                return;
            } else {
                this.f17739N = ironSourceBannerLayout;
                this.f17738M = Boolean.TRUE;
                this.f17740O = str;
                return;
            }
        }
        if (!z()) {
            this.f17766h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, "the server response does not contain banner data"));
            return;
        }
        w wVar = this.f17743R;
        if (wVar == null && this.f17746U == null) {
            this.f17739N = ironSourceBannerLayout;
            this.f17738M = Boolean.TRUE;
            this.f17740O = str;
        } else if (this.f17757c0) {
            this.f17746U.a(ironSourceBannerLayout, new Placement(k(str)));
        } else {
            wVar.a(ironSourceBannerLayout, k(str));
        }
    }

    public void a(IronSourceSegment ironSourceSegment) {
        this.f17728C = ironSourceSegment;
        wq wqVar = this.f17745T;
        if (wqVar != null) {
            wqVar.a(ironSourceSegment);
        }
        eg egVar = this.f17742Q;
        if (egVar != null) {
            egVar.a(ironSourceSegment);
        }
        ij ijVar = this.f17744S;
        if (ijVar != null) {
            ijVar.a(ironSourceSegment);
        }
        w wVar = this.f17743R;
        if (wVar != null) {
            wVar.a(ironSourceSegment);
        }
        g6 g6Var = this.f17746U;
        if (g6Var != null) {
            g6Var.a(ironSourceSegment);
        }
        AdQualityBridge adQualityBridge = this.f17781o0;
        if (adQualityBridge != null) {
            adQualityBridge.setSegment(ironSourceSegment);
        }
        pj.i().a(this.f17728C);
        br.i().a(this.f17728C);
        jp.f16866P.a(this.f17728C);
    }

    @Override // com.ironsource.qa.b
    public void a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        this.f17787r0.a((ng<ISDemandOnlyInterstitialListener>) iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.qa.c
    public void a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        this.f17789s0.a((ng<ISDemandOnlyRewardedVideoListener>) iSDemandOnlyRewardedVideoListener);
    }

    private synchronized void a(h.d dVar, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        String c4 = dVar.c();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + c4);
        try {
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog.API.error(th.getMessage());
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(c4, new IronSourceError(510, th.getMessage()));
        }
        if (!this.f17735J) {
            ironLog.error("initISDemandOnly() must be called before loadISDemandOnlyInterstitial()");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(c4, new IronSourceError(510, "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"));
            return;
        }
        if (!this.f17732G) {
            ironLog.error("Interstitial was initialized in mediation mode. Use loadInterstitial instead");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(c4, new IronSourceError(510, "Interstitial was initialized in mediation mode. Use loadInterstitial instead"));
            return;
        }
        s.d a4 = s.c().a();
        if (a4 == s.d.INIT_FAILED) {
            ironLog.error("init() had failed");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(c4, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            return;
        }
        IronSourceError a5 = dVar.a();
        if (a5 != null) {
            if (a5.getErrorCode() == 1060) {
                b(IronSourceConstants.TROUBLESHOOTING_DO_CALLED_IS_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.b()), 1));
            }
            ironLog.error(a5.toString());
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(c4, a5);
            return;
        }
        e(dVar.e());
        if (a4 == s.d.INIT_IN_PROGRESS) {
            if (s.c().d()) {
                ironLog.error("init() had failed");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(c4, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            } else {
                synchronized (this.f17761e0) {
                    this.f17761e0.put(dVar.c(), dVar);
                }
                if (!TextUtils.isEmpty(dVar.c())) {
                    a(83003, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.b()), 1));
                }
            }
            return;
        }
        if (!E()) {
            ironLog.error("No interstitial configurations found");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(c4, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
            return;
        }
        synchronized (this.f17761e0) {
            try {
                com.ironsource.mediationsdk.demandOnly.f fVar = this.f17767h0;
                if (fVar != null) {
                    fVar.a(dVar);
                    return;
                }
                this.f17761e0.put(dVar.c(), dVar);
                if (!TextUtils.isEmpty(dVar.b())) {
                    a(83003, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.b()), 1));
                }
            } finally {
            }
        }
    }

    void a(h.d dVar, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        String c4 = dVar.c();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + c4);
        try {
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog.API.error(th.getMessage());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(c4, new IronSourceError(510, th.getMessage()));
        }
        if (!this.f17734I) {
            ironLog.error("initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(c4, new IronSourceError(510, "initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()"));
            return;
        }
        if (!this.f17731F) {
            ironLog.error("Rewarded video was initialized in mediation mode");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(c4, new IronSourceError(510, "Rewarded video was initialized in mediation mode"));
            return;
        }
        s.d a4 = s.c().a();
        if (a4 == s.d.INIT_FAILED) {
            ironLog.error("init() had failed");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(c4, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        IronSourceError a5 = dVar.a();
        if (a5 != null) {
            if (a5.getErrorCode() == 1060) {
                b(81321, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.b()), 1));
            }
            ironLog.error(a5.toString());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(c4, a5);
            return;
        }
        e(dVar.e());
        if (a4 == s.d.INIT_IN_PROGRESS) {
            if (s.c().d()) {
                ironLog.error("init() had failed");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(c4, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            synchronized (this.f17765g0) {
                this.f17765g0.put(c4, dVar);
            }
            if (TextUtils.isEmpty(dVar.b())) {
                return;
            }
            b(IronSourceConstants.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.b()), 1));
            return;
        }
        if (!M()) {
            ironLog.error("No rewarded video configurations found");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(c4, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        synchronized (this.f17765g0) {
            try {
                com.ironsource.mediationsdk.demandOnly.k kVar = this.f17769i0;
                if (kVar != null) {
                    kVar.a(dVar);
                    return;
                }
                this.f17765g0.put(c4, dVar);
                if (!TextUtils.isEmpty(dVar.b())) {
                    b(IronSourceConstants.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.b()), 1));
                }
                return;
            } finally {
            }
        }
        o9.d().a(th);
        IronLog.API.error(th.getMessage());
        iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(c4, new IronSourceError(510, th.getMessage()));
    }

    @Override // com.ironsource.ki
    public void a(@NotNull ImpressionDataListener impressionDataListener) {
        if (gk.a((Object) impressionDataListener, "removeImpressionDataListener - listener is null")) {
            rk.b().b(impressionDataListener);
            eg egVar = this.f17742Q;
            if (egVar != null) {
                egVar.a(impressionDataListener);
            }
            w wVar = this.f17743R;
            if (wVar != null) {
                wVar.a(impressionDataListener);
            }
            IronLog.API.info("remove impression data listener from " + impressionDataListener.getClass().getSimpleName());
        }
    }

    @Override // com.ironsource.jm
    public void a(LogListener logListener) {
        if (logListener == null) {
            this.f17766h.log(IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:null)", 1);
            return;
        }
        this.f17770j.a(logListener);
        this.f17766h.log(IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:" + logListener.getClass().getSimpleName() + ")", 1);
    }

    public void a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        IronLog.API.info();
        tg.a().a(levelPlayInterstitialListener);
    }

    public void a(LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        IronLog.API.info();
        eq.a().a(levelPlayRewardedVideoListener);
    }

    public synchronized void a(LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        String str;
        try {
            IronLog ironLog = IronLog.API;
            ironLog.info();
            if (!this.f17734I) {
                if (levelPlayRewardedVideoManualListener == null) {
                    this.f17750Y = false;
                    str = "Disabling rewarded video manual mode";
                } else {
                    this.f17750Y = true;
                    str = "Enabling rewarded video manual mode";
                }
                ironLog.info(str);
            }
            eq.a().a(levelPlayRewardedVideoManualListener);
        } catch (Throwable th) {
            throw th;
        }
    }

    void a(SegmentListener segmentListener) {
        zl zlVar = this.f17768i;
        if (zlVar != null) {
            zlVar.a(segmentListener);
            s.c().a(this.f17768i);
        }
    }

    private void a(ms msVar) {
        this.f17770j.setDebugLevel(msVar.c().b().g().b());
        this.f17766h.setLoggerDebugLevel("console", msVar.c().b().g().a());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(ms msVar, Context context) {
        C1477h4 g4;
        boolean l4 = L() ? msVar.c().f().m().l() : false;
        boolean l5 = D() ? msVar.c().d().i().l() : false;
        boolean l6 = y() ? msVar.c().c().g().l() : false;
        boolean l7 = H() ? msVar.c().e().g().l() : false;
        kp h4 = msVar.c().b().h();
        boolean i4 = h4.i();
        if (l4) {
            b(msVar.c().f().m(), context, msVar);
        } else {
            br.i().b(false);
        }
        if (l5) {
            g4 = msVar.c().d().i();
        } else if (l6) {
            g4 = msVar.c().c().g();
        } else {
            if (!l7) {
                pj.i().b(false);
                jp jpVar = jp.f16866P;
                jpVar.b(i4);
                if (i4) {
                    return;
                }
                jpVar.b(h4.j(), context);
                jpVar.c(h4.l(), context);
                jpVar.a(h4.k(), context);
                jpVar.a(h4.g());
                jpVar.d(h4.h());
                return;
            }
            g4 = msVar.c().e().g();
        }
        a(g4, context, msVar);
        jp jpVar2 = jp.f16866P;
        jpVar2.b(i4);
        if (i4) {
        }
    }

    @Override // com.ironsource.qa.c
    public synchronized void a(String str) {
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + str);
        ISDemandOnlyRewardedVideoListener a4 = this.f17789s0.a(str);
        try {
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.API.error(e4.getMessage());
            if (a4 != null) {
                a4.onRewardedVideoAdShowFailed(str, new IronSourceError(510, e4.getMessage()));
            }
        }
        if (!this.f17731F) {
            ironLog.error("Rewarded video was initialized in mediation mode. Use showRewardedVideo instead");
            a4.onRewardedVideoAdShowFailed(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
            return;
        }
        com.ironsource.mediationsdk.demandOnly.k kVar = this.f17769i0;
        if (kVar != null) {
            kVar.b(str);
        } else {
            ironLog.error("Rewarded video was not initiated");
            a4.onRewardedVideoAdShowFailed(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was not initiated"));
        }
    }

    private void a(String str, r8 r8Var) {
        if (a(str, 1, UserVerificationMethods.USER_VERIFY_PATTERN)) {
            return;
        }
        r8Var.a(ErrorBuilder.buildInvalidKeyValueError(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, "dynamicUserId is invalid, should be between 1-128 chars in length."));
    }

    public void a(String str, List<String> list) {
        IronLog ironLog = IronLog.API;
        ironLog.verbose("key = " + str + ", values = " + list.toString());
        String checkMetaDataKeyValidity = MetaDataUtils.checkMetaDataKeyValidity(str);
        String checkMetaDataValueValidity = MetaDataUtils.checkMetaDataValueValidity(list);
        if (checkMetaDataKeyValidity.length() > 0) {
            ironLog.verbose(checkMetaDataKeyValidity);
            return;
        }
        if (checkMetaDataValueValidity.length() > 0) {
            ironLog.verbose(checkMetaDataValueValidity);
            return;
        }
        MetaData formatMetaData = MetaDataUtils.formatMetaData(str, list);
        String metaDataKey = formatMetaData.getMetaDataKey();
        List<String> metaDataValue = formatMetaData.getMetaDataValue();
        if (!MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
            com.ironsource.mediationsdk.c.b().a(metaDataKey, metaDataValue);
        } else if (C() && MetaDataUtils.isMediationKeysBeforeInit(metaDataKey)) {
            ironLog.error("setMetaData with key = " + metaDataKey + " must to be called before init");
        } else {
            rk.b().a(metaDataKey, metaDataValue);
        }
        try {
            ConcurrentHashMap<String, List<String>> c4 = com.ironsource.mediationsdk.c.b().c();
            c4.putAll(rk.b().c());
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, List<String>> entry : c4.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            this.f17777m0.a(jSONObject);
            this.f17775l0.a(jSONObject);
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error("got the following error " + e4.getMessage());
        }
        br.i().a(new zb(C() ? 51 : 50, IronSourceUtils.getJsonForMetaData(str, list, metaDataValue)));
    }

    public void a(String str, JSONObject jSONObject) {
        if (gk.a((Object) jSONObject, "setAdRevenueData - impressionData is null") && gk.a((Object) str, "setAdRevenueData - dataSource is null")) {
            this.f17773k0.a(str, jSONObject);
        }
    }

    @Override // com.ironsource.no
    public void a(List<IronSource.AD_UNIT> list, boolean z4, s8 s8Var) {
        b(list, z4, s8Var);
    }

    @Override // com.ironsource.ak
    public void a(Map<String, String> map) {
        if (map != null) {
            try {
                if (map.size() == 0) {
                    return;
                }
                this.f17766h.log(IronSourceLogger.IronSourceTag.API, this.f17752a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", 1);
                this.f17786r = new HashMap(map);
            } catch (Exception e4) {
                o9.d().a(e4);
                this.f17766h.logException(IronSourceLogger.IronSourceTag.API, this.f17752a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", e4);
            }
        }
    }

    private void a(JSONObject jSONObject, Object[][] objArr) {
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    jSONObject.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e4) {
                o9.d().a(e4);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IronSourceObject addToDictionary: " + Log.getStackTraceString(e4), 3);
            }
        }
    }

    @Override // com.ironsource.ak
    public void a(boolean z4) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "setAdaptersDebug : " + z4, 1);
        com.ironsource.mediationsdk.c.b().a(z4);
    }

    private void a(boolean z4, String str) {
        if (z4) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(this.f17731F, true, this.f17759d0);
            if (str != null) {
                a(mediationAdditionalData, new Object[][]{new Object[]{"placement", str}});
            }
            b(IronSourceConstants.RV_API_IS_CAPPED_TRUE, mediationAdditionalData);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(boolean z4, boolean z5, int i4, JSONObject jSONObject, boolean z6) {
        StringBuilder sb;
        String str;
        try {
            sb = new StringBuilder();
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
        if (!z5) {
            if (!z4) {
                sb.append(StringUtils.COMMA);
                str = IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW;
            }
            sb.append(String.format(",cachedUserAgent=%s", Boolean.valueOf(this.f17756c.r())));
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, sb.toString());
            jSONObject.put("sessionDepth", i4);
            if (z6) {
                jSONObject.put(z5 ? "isMultipleAdObjects" : "isMultipleAdUnits", 1);
            }
            br.i().a(new zb(14, jSONObject));
        }
        str = String.format(",Activity=%s", Boolean.valueOf(ContextProvider.getInstance().getCurrentActiveActivity() != null));
        sb.append(str);
        sb.append(String.format(",cachedUserAgent=%s", Boolean.valueOf(this.f17756c.r())));
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, sb.toString());
        jSONObject.put("sessionDepth", i4);
        if (z6) {
        }
        br.i().a(new zb(14, jSONObject));
    }

    private synchronized void a(boolean z4, boolean z5, boolean z6, IronSource.AD_UNIT... ad_unitArr) {
        Throwable th;
        JSONObject mediationAdditionalData;
        try {
            try {
                int i4 = 0;
                for (IronSource.AD_UNIT ad_unit : ad_unitArr) {
                    try {
                        if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                            this.f17735J = true;
                        } else if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
                            this.f17736K = true;
                        } else if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                            this.f17734I = true;
                        } else if (ad_unit.equals(IronSource.AD_UNIT.NATIVE_AD)) {
                            this.f17737L = true;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (s.c().a() == s.d.INIT_FAILED) {
                    try {
                        if (this.f17768i != null) {
                            int length = ad_unitArr.length;
                            while (i4 < length) {
                                IronSource.AD_UNIT ad_unit2 = ad_unitArr[i4];
                                if (!this.f17796z.contains(ad_unit2)) {
                                    a(ad_unit2, true);
                                }
                                i4++;
                            }
                        }
                    } catch (Exception e4) {
                        o9.d().a(e4);
                        IronLog.INTERNAL.error(e4.toString());
                    }
                }
                if (!C()) {
                    mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z5);
                    int length2 = ad_unitArr.length;
                    while (i4 < length2) {
                        IronSource.AD_UNIT ad_unit3 = ad_unitArr[i4];
                        if (this.f17796z.contains(ad_unit3)) {
                            this.f17766h.log(IronSourceLogger.IronSourceTag.API, ad_unit3 + " ad unit has started initializing.", 3);
                        } else {
                            this.f17796z.add(ad_unit3);
                            this.f17726A.add(ad_unit3);
                            try {
                                mediationAdditionalData.put(ad_unit3.toString(), true);
                            } catch (Exception e5) {
                                o9.d().a(e5);
                                IronLog.INTERNAL.error(e5.toString());
                            }
                        }
                        i4++;
                    }
                    JSONObject jSONObject = mediationAdditionalData;
                    int i5 = this.f17730E + 1;
                    this.f17730E = i5;
                    a(z4, z5, i5, jSONObject, z6);
                }
                if (this.f17792v == null) {
                    return;
                }
                try {
                    new om().a(this.f17776m.c().b().d().b(), B());
                } catch (Exception e6) {
                    o9.d().a(e6);
                    IronLog.INTERNAL.error(e6.toString());
                }
                mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z5);
                for (IronSource.AD_UNIT ad_unit4 : ad_unitArr) {
                    if (this.f17796z.contains(ad_unit4)) {
                        a(ad_unit4);
                    } else {
                        this.f17796z.add(ad_unit4);
                        this.f17726A.add(ad_unit4);
                        try {
                            mediationAdditionalData.put(ad_unit4.toString(), true);
                        } catch (Exception e7) {
                            o9.d().a(e7);
                            IronLog.INTERNAL.error(e7.toString());
                        }
                        List<IronSource.AD_UNIT> list = this.f17792v;
                        if (list == null || !list.contains(ad_unit4)) {
                            a(ad_unit4, false);
                        } else {
                            b(ad_unit4);
                        }
                    }
                }
                JSONObject jSONObject2 = mediationAdditionalData;
                int i52 = this.f17730E + 1;
                this.f17730E = i52;
                a(z4, z5, i52, jSONObject2, z6);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    boolean a(h7 h7Var) {
        return this.f17760e.b(ContextProvider.getInstance().getApplicationContext(), h7Var, IronSource.AD_UNIT.BANNER);
    }

    private boolean a(h.b bVar) {
        if (s.c().a() != s.d.INIT_IN_PROGRESS) {
            return false;
        }
        synchronized (this.f17763f0) {
            this.f17763f0.put(bVar.c(), bVar);
        }
        return true;
    }

    private boolean a(String str, int i4, int i5) {
        return str != null && str.length() >= i4 && str.length() <= i5;
    }

    public boolean a(boolean z4, ms msVar) {
        if (C()) {
            return true;
        }
        synchronized (this.f17774l) {
            this.f17776m = msVar;
        }
        return b(msVar.g(), z4, msVar.c());
    }
}
