package com.ironsource.mediationsdk;

import android.content.Context;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C1513m5;
import com.ironsource.C1569t5;
import com.ironsource.InterfaceC1555s4;
import com.ironsource.a8;
import com.ironsource.b8;
import com.ironsource.bi;
import com.ironsource.cg;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.h7;
import com.ironsource.ib;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.l;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.nm;
import com.ironsource.o9;
import com.ironsource.pj;
import com.ironsource.w7;
import com.ironsource.wp;
import com.ironsource.xf;
import com.ironsource.xl;
import com.ironsource.yf;
import com.ironsource.z7;
import com.ironsource.zb;
import com.ironsource.zu;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class w extends m implements wp, InterfaceC1555s4 {

    /* renamed from: A, reason: collision with root package name */
    private ConcurrentHashMap<String, h.a> f17942A;

    /* renamed from: B, reason: collision with root package name */
    private long f17943B;

    /* renamed from: C, reason: collision with root package name */
    private final Object f17944C;

    /* renamed from: D, reason: collision with root package name */
    private ib f17945D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f17946E;

    /* renamed from: F, reason: collision with root package name */
    private final long f17947F;

    /* renamed from: G, reason: collision with root package name */
    private final Runnable f17948G;

    /* renamed from: e, reason: collision with root package name */
    private final bi f17949e;

    /* renamed from: f, reason: collision with root package name */
    private final bi.a f17950f;

    /* renamed from: g, reason: collision with root package name */
    private final cg f17951g;

    /* renamed from: h, reason: collision with root package name */
    private final cg.a f17952h;

    /* renamed from: i, reason: collision with root package name */
    private k f17953i;

    /* renamed from: j, reason: collision with root package name */
    private i f17954j;

    /* renamed from: k, reason: collision with root package name */
    private xl f17955k;

    /* renamed from: l, reason: collision with root package name */
    private IronSourceBannerLayout f17956l;

    /* renamed from: m, reason: collision with root package name */
    private h7 f17957m;

    /* renamed from: n, reason: collision with root package name */
    private int f17958n;

    /* renamed from: o, reason: collision with root package name */
    private x f17959o;

    /* renamed from: p, reason: collision with root package name */
    private int f17960p;

    /* renamed from: q, reason: collision with root package name */
    private final ConcurrentHashMap<String, x> f17961q;

    /* renamed from: r, reason: collision with root package name */
    private CopyOnWriteArrayList<x> f17962r;

    /* renamed from: s, reason: collision with root package name */
    private String f17963s;

    /* renamed from: t, reason: collision with root package name */
    private JSONObject f17964t;

    /* renamed from: u, reason: collision with root package name */
    private String f17965u;

    /* renamed from: v, reason: collision with root package name */
    private int f17966v;

    /* renamed from: w, reason: collision with root package name */
    private com.ironsource.mediationsdk.e f17967w;

    /* renamed from: x, reason: collision with root package name */
    private C1513m5 f17968x;

    /* renamed from: y, reason: collision with root package name */
    private com.ironsource.mediationsdk.h f17969y;

    /* renamed from: z, reason: collision with root package name */
    private ConcurrentHashMap<String, C1513m5> f17970z;

    class a implements l.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h7 f17971a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceBannerLayout f17972b;

        a(h7 h7Var, IronSourceBannerLayout ironSourceBannerLayout) {
            this.f17971a = h7Var;
            this.f17972b = ironSourceBannerLayout;
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a() {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("placement = " + this.f17971a.getPlacementName());
            l.b(this.f17972b);
            w.this.f17956l = this.f17972b;
            w.this.f17957m = this.f17971a;
            cg cgVar = w.this.f17951g;
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            h7 h7Var = this.f17971a;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
            if (!cgVar.b(applicationContext, h7Var, ad_unit)) {
                w.this.b(false);
                return;
            }
            ironLog.verbose("placement is capped");
            n.a().b(ad_unit, new IronSourceError(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED, "placement " + this.f17971a.getPlacementName() + " is capped"));
            w.this.a(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED)}});
            w.this.a(i.READY_TO_LOAD);
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a(String str) {
            IronLog.API.error("can't load banner - errorMessage = " + str);
        }
    }

    class b implements l.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceBannerLayout f17974a;

        b(IronSourceBannerLayout ironSourceBannerLayout) {
            this.f17974a = ironSourceBannerLayout;
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a() {
            IronLog.INTERNAL.verbose("destroying banner");
            w.this.f17955k.b();
            w.this.a(IronSourceConstants.BN_DESTROY, (Object[][]) null, w.this.f17959o != null ? w.this.f17959o.n() : w.this.f17960p);
            w.this.h();
            this.f17974a.a();
            w.this.f17956l = null;
            w.this.f17957m = null;
            w.this.a(i.READY_TO_LOAD);
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a(String str) {
            IronLog.API.error("destroy banner failed - errorMessage = " + str);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (w.this.f17956l == null) {
                    IronLog.INTERNAL.verbose("mIronSourceBanner is null");
                    w.this.a(IronSourceConstants.BN_SKIP_RELOAD, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL)}});
                } else {
                    if (w.this.o()) {
                        w.this.v();
                        return;
                    }
                    IronLog.INTERNAL.verbose("banner is not visible, reload skipped");
                    w.this.a(IronSourceConstants.BN_SKIP_RELOAD, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE)}});
                    w.this.f17955k.a(TimeUnit.SECONDS.toMillis(w.this.f17953i.f()));
                }
            } catch (Throwable th) {
                o9.d().a(th);
                w.this.a(IronSourceConstants.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, new Object[][]{new Object[]{"reason", th.getMessage()}});
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.w();
            if (w.this.y()) {
                return;
            }
            w.this.a(IronSourceConstants.BN_AUCTION_REQUEST);
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            w.this.b(hashMap, arrayList, sb, arrayList2);
            w.this.a(hashMap, arrayList, sb, arrayList2);
        }
    }

    class e implements z7.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f17978a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f17979b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f17980c;

        e(Map map, StringBuilder sb, List list) {
            this.f17978a = map;
            this.f17979b = sb;
            this.f17980c = list;
        }

        @Override // com.ironsource.z7.b
        public void a(@NotNull List<a8> list, long j4, @NotNull List<String> list2) {
            w.this.a(IronSourceConstants.BN_COLLECT_TOKENS_COMPLETED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4)}});
            for (a8 a8Var : list) {
                if (a8Var.a() != null) {
                    this.f17978a.put(a8Var.c(), a8Var.a());
                    StringBuilder sb = this.f17979b;
                    sb.append(a8Var.d());
                    sb.append(a8Var.c());
                    sb.append(StringUtils.COMMA);
                    ((x) w.this.f17961q.get(a8Var.c())).a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(a8Var.e())}});
                } else {
                    ((x) w.this.f17961q.get(a8Var.c())).a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(a8Var.e())}, new Object[]{"reason", a8Var.b()}});
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                ((x) w.this.f17961q.get(it.next())).a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4)}});
            }
            w.this.a((Map<String, Object>) this.f17978a, (List<String>) this.f17980c, this.f17979b);
        }

        @Override // com.ironsource.z7.b
        public void onFailure(String str) {
            w.this.a(IronSourceConstants.BN_COLLECT_TOKENS_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, str}});
            w.this.a((Map<String, Object>) this.f17978a, (List<String>) this.f17980c, this.f17979b);
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ NetworkSettings f17982a;

        f(NetworkSettings networkSettings) {
            this.f17982a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.a(this.f17982a);
        }
    }

    class g implements b8 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f17984a;

        g(x xVar) {
            this.f17984a = xVar;
        }

        @Override // com.ironsource.b8
        public void a() {
            this.f17984a.D();
        }
    }

    class h extends TimerTask {
        h() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            w.this.u();
        }
    }

    enum i {
        NONE,
        READY_TO_LOAD,
        STARTED_LOADING,
        FIRST_AUCTION,
        AUCTION,
        LOADING,
        RELOADING,
        LOADED
    }

    w(yf yfVar, xf xfVar, List<NetworkSettings> list, k kVar, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        this.f17954j = i.NONE;
        this.f17965u = "";
        this.f17944C = new Object();
        this.f17946E = false;
        c cVar = new c();
        this.f17948G = cVar;
        bi k4 = yfVar.k();
        this.f17949e = k4;
        this.f17950f = xfVar.e();
        this.f17951g = yfVar.B();
        this.f17952h = xfVar.m();
        long time = new Date().getTime();
        a(IronSourceConstants.BN_MANAGER_INIT_STARTED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.PROG_BN_MANAGER_NAME}});
        IronLog.INTERNAL.verbose("isAuctionEnabled = " + kVar.j());
        this.f17953i = kVar;
        this.f17961q = new ConcurrentHashMap<>();
        this.f17962r = new CopyOnWriteArrayList<>();
        this.f17970z = new ConcurrentHashMap<>();
        this.f17942A = new ConcurrentHashMap<>();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        this.f17960p = k4.a(ad_unit);
        n.a().a(ad_unit, this.f17953i.d());
        if (this.f17953i.j()) {
            this.f17967w = new com.ironsource.mediationsdk.e(ad_unit, this.f17953i.b(), this);
        }
        this.f17969y = new com.ironsource.mediationsdk.h(list, this.f17953i.b().c());
        a(list, kVar);
        this.f17943B = new Date().getTime();
        a(i.READY_TO_LOAD);
        this.f17947F = kVar.g();
        this.f17955k = new xl(cVar, com.ironsource.lifecycle.b.d(), new zu());
        a(IronSourceConstants.BN_MANAGER_INIT_ENDED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - time)}});
    }

    private String b(C1513m5 c1513m5) {
        x xVar = this.f17961q.get(c1513m5.c());
        return ((xVar == null ? !TextUtils.isEmpty(c1513m5.k()) : xVar.p()) ? "2" : "1") + c1513m5.c();
    }

    private void f(x xVar) {
        String str;
        IronSourceBannerLayout ironSourceBannerLayout = this.f17956l;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            return;
        }
        IronSourceBannerLayout ironSourceBannerLayout2 = null;
        if (xVar.p()) {
            str = this.f17970z.get(xVar.c()).k();
            xVar.c(str);
        } else {
            str = null;
        }
        JSONObject a4 = this.f17970z.get(xVar.c()).a();
        try {
            ironSourceBannerLayout2 = this.f17956l.b();
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.verbose("Failed to make copy of banner layout: " + e4.getMessage());
        }
        xVar.a(ironSourceBannerLayout2, this.f17957m, str, a4);
    }

    private List<C1513m5> i() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (x xVar : this.f17961q.values()) {
            if (!xVar.p() && !this.f17951g.b(ContextProvider.getInstance().getApplicationContext(), this.f17957m, IronSource.AD_UNIT.BANNER)) {
                copyOnWriteArrayList.add(new C1513m5(xVar.c()));
            }
        }
        return copyOnWriteArrayList;
    }

    private ISBannerSize j() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f17956l;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.getSize() == null) {
            return null;
        }
        return this.f17956l.getSize().isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? ISBannerSize.f17240e : ISBannerSize.BANNER : this.f17956l.getSize();
    }

    private ISBannerSize k() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f17956l;
        if (ironSourceBannerLayout != null) {
            return ironSourceBannerLayout.getSize();
        }
        return null;
    }

    private void m() {
        String str = this.f17962r.isEmpty() ? "Empty waterfall" : "Mediation No fill";
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("errorReason = " + str);
        g((x) null);
        i iVar = i.LOADING;
        i iVar2 = i.READY_TO_LOAD;
        if (a(iVar, iVar2)) {
            a(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{"errorCode", 606}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f17945D))}});
            n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(606, str));
        } else if (a(i.RELOADING, i.LOADED)) {
            a(IronSourceConstants.BN_CALLBACK_RELOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f17945D))}});
            n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(606, str));
            this.f17955k.a(TimeUnit.SECONDS.toMillis(this.f17953i.f()));
        } else {
            a(iVar2);
            ironLog.error("wrong state = " + this.f17954j);
        }
    }

    private void n() {
        String l4 = l();
        cg.a aVar = this.f17952h;
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        aVar.a(applicationContext, l4, ad_unit);
        if (this.f17951g.b(ContextProvider.getInstance().getApplicationContext(), this.f17957m, ad_unit)) {
            a(IronSourceConstants.BN_PLACEMENT_CAPPED);
        }
    }

    private boolean p() {
        i iVar = this.f17954j;
        return iVar == i.RELOADING || iVar == i.AUCTION;
    }

    private boolean q() {
        boolean z4;
        synchronized (this.f17944C) {
            z4 = this.f17954j == i.LOADED;
        }
        return z4;
    }

    private boolean r() {
        boolean z4;
        synchronized (this.f17944C) {
            try {
                i iVar = this.f17954j;
                z4 = iVar == i.FIRST_AUCTION || iVar == i.AUCTION;
            } finally {
            }
        }
        return z4;
    }

    private boolean s() {
        boolean z4;
        synchronized (this.f17944C) {
            try {
                i iVar = this.f17954j;
                z4 = iVar == i.LOADING || iVar == i.RELOADING;
            } finally {
            }
        }
        return z4;
    }

    private void t() {
        try {
            for (int i4 = this.f17958n; i4 < this.f17962r.size(); i4++) {
                x xVar = this.f17962r.get(i4);
                if (xVar.h()) {
                    IronLog.INTERNAL.verbose("loading smash - " + xVar.f());
                    this.f17958n = i4 + 1;
                    f(xVar);
                    return;
                }
            }
            m();
        } catch (Exception e4) {
            o9.d().a(e4);
            a(IronSourceConstants.TROUBLESHOOTING_BN_INTERNAL_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, "loadNextSmash"}, new Object[]{"reason", Log.getStackTraceString(e4)}});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        IronLog.INTERNAL.verbose();
        AsyncTask.execute(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("");
        if (a(i.LOADED, i.STARTED_LOADING)) {
            b(true);
            return;
        }
        ironLog.error("wrong state = " + this.f17954j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (this.f17942A.isEmpty()) {
            return;
        }
        this.f17969y.a(this.f17942A);
        this.f17942A.clear();
    }

    private void x() {
        List<C1513m5> i4 = i();
        this.f17963s = e();
        a(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y() {
        long a4 = l.a(this.f17943B, this.f17953i.h());
        if (a4 <= 0) {
            return false;
        }
        IronLog.INTERNAL.verbose("waiting before auction - timeToWaitBeforeAuction = " + a4);
        new Timer().schedule(new h(), a4);
        return true;
    }

    public boolean o() {
        IronLog ironLog;
        String str;
        if (!this.f17956l.isShown()) {
            ironLog = IronLog.INTERNAL;
            str = "banner or one of its parents are INVISIBLE or GONE";
        } else {
            if (this.f17956l.hasWindowFocus()) {
                boolean globalVisibleRect = this.f17956l.getGlobalVisibleRect(new Rect());
                IronLog.INTERNAL.verbose("visible = " + globalVisibleRect);
                return globalVisibleRect;
            }
            ironLog = IronLog.INTERNAL;
            str = "banner has no window focus";
        }
        ironLog.verbose(str);
        return false;
    }

    public w(List<NetworkSettings> list, k kVar, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        this(nm.S(), nm.M(), list, kVar, hashSet, ironSourceSegment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f17959o != null) {
            IronLog.INTERNAL.verbose("mActiveSmash = " + this.f17959o.f());
            this.f17959o.t();
            this.f17959o = null;
        }
    }

    private String l() {
        h7 h7Var = this.f17957m;
        return h7Var != null ? h7Var.getPlacementName() : "";
    }

    @Override // com.ironsource.wp
    public void c(x xVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(xVar.f());
        if (g()) {
            C1569t5.a().c(this.f17670d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(IronSourceConstants.BN_CALLBACK_LEAVE_APP, objArr, xVar.n());
    }

    @Override // com.ironsource.wp
    public void d(x xVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(xVar.f());
        if (g()) {
            C1569t5.a().f(this.f17670d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, objArr, xVar.n());
    }

    @Override // com.ironsource.wp
    public void e(x xVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(xVar.f());
        if (g()) {
            C1569t5.a().e(this.f17670d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, objArr, xVar.n());
    }

    public void g(x xVar) {
        Iterator<x> it = this.f17962r.iterator();
        while (it.hasNext()) {
            x next = it.next();
            if (!next.equals(xVar)) {
                next.q();
            }
        }
    }

    private boolean g() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f17956l;
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }

    private String a(List<C1513m5> list) {
        IronLog.INTERNAL.verbose("waterfall.size() = " + list.size());
        this.f17962r.clear();
        this.f17970z.clear();
        this.f17942A.clear();
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < list.size(); i4++) {
            C1513m5 c1513m5 = list.get(i4);
            a(c1513m5);
            sb.append(b(c1513m5));
            if (i4 != list.size() - 1) {
                sb.append(StringUtils.COMMA);
            }
        }
        IronLog.INTERNAL.verbose("updateWaterfall() - next waterfall is " + sb.toString());
        return sb.toString();
    }

    @Override // com.ironsource.wp
    public void b(x xVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(xVar.f());
        if (g()) {
            C1569t5.a().b(this.f17670d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(IronSourceConstants.BN_CALLBACK_CLICK, objArr, xVar.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i4) {
        a(i4, (Object[][]) null);
    }

    private void b(x xVar, View view, FrameLayout.LayoutParams layoutParams) {
        if (this.f17956l != null) {
            xVar.E();
            l.a(this.f17956l, view, layoutParams, new g(xVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb, List<w7> list2) {
        if (this.f17951g.b(ContextProvider.getInstance().getApplicationContext(), this.f17957m, IronSource.AD_UNIT.BANNER)) {
            return;
        }
        for (x xVar : this.f17961q.values()) {
            AdData createAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(xVar.f18022d, IronSource.AD_UNIT.BANNER, null, this.f17956l);
            if (xVar.p()) {
                list2.add(new w7(xVar.g(), xVar.c(), createAdDataForNetworkAdapter, xVar, null, null));
            } else if (!xVar.p()) {
                list.add(xVar.c());
                sb.append(xVar.g() + xVar.c() + StringUtils.COMMA);
            }
        }
    }

    @Override // com.ironsource.InterfaceC1555s4
    public void a(int i4, String str, int i5, String str2, long j4) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i4 + " - " + str + ")";
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(str3);
        IronSourceUtils.sendAutomationLog("BN: " + str3);
        if (!r()) {
            ironLog.warning("wrong state - mCurrentState = " + this.f17954j);
            return;
        }
        this.f17965u = str2;
        this.f17966v = i5;
        this.f17964t = null;
        x();
        a(IronSourceConstants.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4)}, new Object[]{"errorCode", Integer.valueOf(i4)}, new Object[]{"reason", str}});
        a(this.f17954j == i.FIRST_AUCTION ? i.LOADING : i.RELOADING);
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i4, Object[][] objArr) {
        a(i4, objArr, this.f17960p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z4) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("current state = " + this.f17954j);
        if (!a(i.STARTED_LOADING, this.f17953i.j() ? z4 ? i.AUCTION : i.FIRST_AUCTION : z4 ? i.RELOADING : i.LOADING)) {
            ironLog.error("wrong state - " + this.f17954j);
            return;
        }
        this.f17945D = new ib();
        this.f17963s = "";
        this.f17964t = null;
        this.f17958n = 0;
        this.f17960p = this.f17949e.a(IronSource.AD_UNIT.BANNER);
        a(z4 ? IronSourceConstants.BN_RELOAD : 3001);
        if (this.f17953i.j()) {
            u();
        } else {
            x();
            t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i4, Object[][] objArr, int i5) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        try {
            ISBannerSize k4 = k();
            if (k4 != null) {
                a(mediationAdditionalData, k4);
            }
            if (this.f17957m != null) {
                mediationAdditionalData.put("placement", l());
            }
            mediationAdditionalData.put("sessionDepth", i5);
            if (!TextUtils.isEmpty(this.f17963s)) {
                mediationAdditionalData.put("auctionId", this.f17963s);
            }
            JSONObject jSONObject = this.f17964t;
            if (jSONObject != null && jSONObject.length() > 0) {
                mediationAdditionalData.put("genericParams", this.f17964t);
            }
            if (b(i4)) {
                mediationAdditionalData.put(IronSourceConstants.AUCTION_TRIALS, this.f17966v);
                if (!TextUtils.isEmpty(this.f17965u)) {
                    mediationAdditionalData.put(IronSourceConstants.AUCTION_FALLBACK, this.f17965u);
                }
            }
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(Log.getStackTraceString(e4));
        }
        pj.i().a(new zb(i4, mediationAdditionalData));
    }

    private boolean b(int i4) {
        return i4 == 3201 || i4 == 3110 || i4 == 3111 || i4 == 3116 || i4 == 3119 || i4 == 3112 || i4 == 3115 || i4 == 3501 || i4 == 3502 || i4 == 3506;
    }

    private void a(C1513m5 c1513m5) {
        x xVar = this.f17961q.get(c1513m5.c());
        if (xVar == null) {
            IronLog.INTERNAL.error("could not find matching smash for auction response item - item = " + c1513m5.c());
            return;
        }
        AbstractAdapter a4 = com.ironsource.mediationsdk.c.b().a(xVar.f18020b.h());
        if (a4 != null) {
            x xVar2 = new x(this.f17953i, this, xVar.f18020b.h(), a4, this.f17960p, this.f17963s, this.f17964t, this.f17966v, this.f17965u, p());
            xVar2.a(true);
            this.f17962r.add(xVar2);
            this.f17970z.put(xVar2.c(), c1513m5);
            this.f17942A.put(c1513m5.c(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
        }
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout) {
        IronLog.INTERNAL.verbose();
        l.a(ironSourceBannerLayout, new b(ironSourceBannerLayout));
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout, h7 h7Var) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        a(ad_unit);
        f();
        if (!a(i.READY_TO_LOAD, i.STARTED_LOADING)) {
            IronLog.API.error("can't load banner - loadBanner already called and still in progress");
        } else if (n.a().b(ad_unit)) {
            ironLog.verbose("can't load banner - already has pending invocation");
        } else {
            l.a(ironSourceBannerLayout, h7Var, new a(h7Var, ironSourceBannerLayout));
        }
    }

    @Override // com.ironsource.wp
    public void a(IronSourceError ironSourceError, x xVar, boolean z4) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError);
        if (xVar.x() == this.f17963s) {
            if (s()) {
                this.f17942A.put(xVar.c(), h.a.ISAuctionPerformanceFailedToLoad);
                t();
                return;
            } else {
                ironLog.warning("wrong state - mCurrentState = " + this.f17954j);
                return;
            }
        }
        ironLog.error("invoked with auctionId: " + xVar.x() + " and the current id is " + this.f17963s);
        xVar.a(IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", 3}, new Object[]{"reason", "Wrong auction " + xVar.x() + " State - " + this.f17954j}, new Object[]{IronSourceConstants.EVENTS_EXT1, xVar.c()}});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetworkSettings networkSettings) {
        NetworkSettings networkSettings2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
        AbstractAdapter a4 = com.ironsource.mediationsdk.c.b().a(networkSettings, networkSettings.getBannerSettings(), false);
        if (a4 != null) {
            networkSettings2 = networkSettings;
            x xVar = new x(this.f17953i, this, networkSettings2, a4, this.f17960p, p());
            this.f17961q.put(xVar.c(), xVar);
        } else {
            networkSettings2 = networkSettings;
            ironLog.verbose(networkSettings2.getProviderInstanceName() + " can't load adapter");
        }
        ironLog.verbose(String.format("Done initializing provider %s on thread %s", networkSettings2.getProviderInstanceName(), Thread.currentThread().getName()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(i iVar) {
        IronLog.INTERNAL.verbose("from '" + this.f17954j + "' to '" + iVar + "'");
        synchronized (this.f17944C) {
            this.f17954j = iVar;
        }
    }

    @Override // com.ironsource.wp
    public void a(x xVar) {
        C1513m5 c1513m5;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(xVar.f());
        if (q()) {
            if (this.f17953i.j() && this.f17953i.b().q() && (c1513m5 = this.f17970z.get(xVar.c())) != null) {
                a(xVar, c1513m5);
            }
            a(IronSourceConstants.BN_CALLBACK_SHOW);
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.f17954j);
        a(IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", 1}, new Object[]{"reason", "Wrong State - " + this.f17954j}, new Object[]{IronSourceConstants.EVENTS_EXT1, xVar.c()}});
    }

    @Override // com.ironsource.wp
    public void a(x xVar, View view, FrameLayout.LayoutParams layoutParams) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + xVar.f());
        if (xVar.x() != this.f17963s) {
            ironLog.error("invoked with auctionId: " + xVar.x() + " and the current id is " + this.f17963s);
            xVar.a(IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", 2}, new Object[]{"reason", "Wrong auction id " + xVar.x() + " State - " + this.f17954j}, new Object[]{IronSourceConstants.EVENTS_EXT1, xVar.c()}});
            return;
        }
        if (!s()) {
            ironLog.warning("wrong state - mCurrentState = " + this.f17954j);
            return;
        }
        x xVar2 = this.f17959o;
        if (xVar2 != null) {
            xVar2.q();
        }
        g(xVar);
        this.f17959o = xVar;
        b(xVar, view, layoutParams);
        this.f17942A.put(xVar.c(), h.a.ISAuctionPerformanceShowedSuccessfully);
        if (this.f17953i.j()) {
            C1513m5 c1513m5 = this.f17970z.get(xVar.c());
            if (c1513m5 != null) {
                a(c1513m5.a(l()), c1513m5.d());
                this.f17967w.a(c1513m5, xVar.g(), this.f17968x);
                this.f17967w.a(this.f17962r, this.f17970z, xVar.g(), this.f17968x, c1513m5);
                if (!this.f17953i.b().q()) {
                    a(xVar, c1513m5);
                }
            } else {
                String c4 = xVar.c();
                ironLog.error("onLoadSuccess winner instance " + c4 + " missing from waterfall. auctionId = " + this.f17963s);
                a(IronSourceConstants.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{"errorCode", 1010}, new Object[]{"reason", "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, c4}});
            }
        }
        if (this.f17954j == i.LOADING) {
            if (g()) {
                C1569t5.a().d(this.f17670d);
                objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f17945D))}};
            } else {
                objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f17945D))}};
            }
            a(IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, objArr);
        } else {
            if (g()) {
                C1569t5.a().d(this.f17670d);
            }
            IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
            a(IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f17945D))}});
        }
        n();
        this.f17950f.b(IronSource.AD_UNIT.BANNER);
        a(i.LOADED);
        this.f17955k.a(TimeUnit.SECONDS.toMillis(this.f17953i.f()));
    }

    private void a(x xVar, C1513m5 c1513m5) {
        this.f17967w.a(c1513m5, xVar.g(), this.f17968x, l());
        a(this.f17970z.get(xVar.c()), l());
    }

    private void a(List<NetworkSettings> list, k kVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<NetworkSettings> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new f(it.next()));
        }
        IronSourceThreadManager.INSTANCE.executeTasks(kVar.c().l(), kVar.c().n(), arrayList);
    }

    @Override // com.ironsource.InterfaceC1555s4
    public void a(List<C1513m5> list, String str, C1513m5 c1513m5, JSONObject jSONObject, JSONObject jSONObject2, int i4, long j4, int i5, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auctionId = " + str);
        if (!r()) {
            ironLog.warning("wrong state - mCurrentState = " + this.f17954j);
            return;
        }
        this.f17965u = "";
        this.f17963s = str;
        this.f17966v = i4;
        this.f17968x = c1513m5;
        this.f17964t = jSONObject;
        if (!TextUtils.isEmpty(str2)) {
            a(88002, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i5)}, new Object[]{"reason", str2}});
        }
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        a(jSONObject2, ad_unit);
        if (!this.f17668b.a(ad_unit)) {
            a(IronSourceConstants.BN_AUCTION_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4)}});
            a(this.f17954j == i.FIRST_AUCTION ? i.LOADING : i.RELOADING);
            a(IronSourceConstants.BN_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, a(list)}});
            t();
            return;
        }
        a(IronSourceConstants.BN_AD_UNIT_CAPPED, new Object[][]{new Object[]{"auctionId", str}});
        i iVar = this.f17954j;
        a(i.READY_TO_LOAD);
        if (iVar == i.FIRST_AUCTION) {
            n.a().b(ad_unit, new IronSourceError(IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auction waterfallString = " + ((Object) sb));
        if (map.size() != 0 || list.size() != 0) {
            a(IronSourceConstants.BN_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}});
            com.ironsource.mediationsdk.e eVar = this.f17967w;
            if (eVar != null) {
                eVar.a(ContextProvider.getInstance().getApplicationContext(), map, list, this.f17969y, this.f17960p, this.f17669c, j());
                return;
            } else {
                ironLog.error("mAuctionHandler is null");
                return;
            }
        }
        a(IronSourceConstants.BN_AUCTION_FAILED, new Object[][]{new Object[]{"errorCode", 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}});
        if (a(i.AUCTION, i.LOADED)) {
            this.f17955k.a(TimeUnit.SECONDS.toMillis(this.f17953i.f()));
            return;
        }
        n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(1005, "No candidates available for auctioning"));
        a(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{"errorCode", 1005}});
        a(i.READY_TO_LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb, List<w7> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb);
            return;
        }
        z7 z7Var = new z7();
        e eVar = new e(map, sb, list);
        a(IronSourceConstants.BN_COLLECT_TOKENS);
        z7Var.a(list2, eVar, this.f17947F, TimeUnit.MILLISECONDS);
    }

    private static void a(JSONObject jSONObject, ISBannerSize iSBannerSize) {
        char c4;
        try {
            String description = iSBannerSize.getDescription();
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals(l.f17629c)) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 72205083:
                    if (description.equals(l.f17628b)) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 79011241:
                    if (description.equals(l.f17631e)) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1951953708:
                    if (description.equals(l.f17627a)) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1999208305:
                    if (description.equals(l.f17632f)) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            if (c4 == 0) {
                jSONObject.put(l.f17634h, 1);
            } else if (c4 == 1) {
                jSONObject.put(l.f17634h, 2);
            } else if (c4 == 2) {
                jSONObject.put(l.f17634h, 3);
            } else if (c4 == 3) {
                jSONObject.put(l.f17634h, 5);
            } else if (c4 == 4) {
                jSONObject.put(l.f17634h, 6);
                jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
            }
            if (iSBannerSize.isAdaptive()) {
                boolean has = jSONObject.has(IronSourceConstants.EVENTS_EXT1);
                String str = l.f17643q;
                if (has) {
                    str = jSONObject.optString(IronSourceConstants.EVENTS_EXT1) + " , " + l.f17643q;
                }
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, str);
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(Log.getStackTraceString(e4));
        }
    }

    private boolean a(i iVar, i iVar2) {
        boolean z4;
        synchronized (this.f17944C) {
            try {
                if (this.f17954j == iVar) {
                    IronLog.INTERNAL.verbose("set state from '" + this.f17954j + "' to '" + iVar2 + "'");
                    this.f17954j = iVar2;
                    z4 = true;
                } else {
                    z4 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }
}
