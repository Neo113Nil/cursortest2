package com.ironsource;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C1526o2;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.n7;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class g6 extends n7<k6, AdapterAdViewListener> implements InterfaceC1552s1, f6 {

    /* renamed from: K, reason: collision with root package name */
    private a7 f16345K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f16346L;

    /* renamed from: M, reason: collision with root package name */
    private IronSourceBannerLayout f16347M;

    /* renamed from: N, reason: collision with root package name */
    private View f16348N;

    /* renamed from: O, reason: collision with root package name */
    private q7<?> f16349O;

    /* renamed from: P, reason: collision with root package name */
    private FrameLayout.LayoutParams f16350P;

    /* renamed from: Q, reason: collision with root package name */
    private final AtomicBoolean f16351Q;

    /* renamed from: R, reason: collision with root package name */
    private final AtomicBoolean f16352R;

    class a implements b8 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q7 f16353a;

        a(q7 q7Var) {
            this.f16353a = q7Var;
        }

        @Override // com.ironsource.b8
        public void a() {
            ((k6) this.f16353a).Q();
        }
    }

    class b implements b8 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q7 f16355a;

        b(q7 q7Var) {
            this.f16355a = q7Var;
        }

        @Override // com.ironsource.b8
        public void a() {
            ((k6) this.f16355a).Q();
            g6 g6Var = g6.this;
            g6Var.f18302s.f15955j.j(g6Var.n());
            g6.this.f16351Q.set(false);
            g6.this.W();
            IronLog.INTERNAL.verbose("start binding timer after impression, expected interval = " + g6.this.f18298o.h().b() + ", current timestamp = " + System.currentTimeMillis());
            g6.this.O().h();
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16357a;

        static {
            int[] iArr = new int[C1526o2.a.values().length];
            f16357a = iArr;
            try {
                iArr[C1526o2.a.MANUAL_WITH_AUTOMATIC_RELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16357a[C1526o2.a.MANUAL_WITH_LOAD_ON_SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public g6(List<NetworkSettings> list, u6 u6Var, String str, rk rkVar, IronSourceSegment ironSourceSegment) {
        super(new h6(str, list, u6Var), rkVar, ironSourceSegment);
        this.f16346L = false;
        this.f16351Q = new AtomicBoolean(true);
        this.f16352R = new AtomicBoolean(false);
        this.f16345K = N();
    }

    private void M() {
        int i4 = c.f16357a[this.f18300q.b().a().ordinal()];
        if (i4 == 1) {
            P().a();
        } else {
            if (i4 != 2) {
                return;
            }
            P().l();
            P().m();
            O().a();
            O().b();
        }
    }

    private a7 N() {
        return new a7(this.f18298o.h(), this.f18298o.g(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a7 O() {
        return this.f16345K;
    }

    private g7 P() {
        return (g7) this.f18300q;
    }

    private ISBannerSize Q() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f16347M;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.getSize() == null) {
            return null;
        }
        return this.f16347M.getSize().isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? com.ironsource.mediationsdk.l.a() : ISBannerSize.BANNER : this.f16347M.getSize();
    }

    private boolean S() {
        IronLog.INTERNAL.verbose(b(this.f16348N + ", " + this.f16350P + ", " + this.f16349O));
        return (this.f16348N == null || this.f16350P == null || this.f16349O == null) ? false : true;
    }

    private void U() {
        int i4 = c.f16357a[this.f18300q.b().a().ordinal()];
        if (i4 == 1) {
            P().k();
        } else {
            if (i4 != 2) {
                return;
            }
            P().r();
        }
    }

    private void V() {
        int i4 = c.f16357a[this.f18300q.b().a().ordinal()];
        if (i4 == 1) {
            P().k();
        } else {
            if (i4 != 2) {
                return;
            }
            P().q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        this.f16349O = null;
        this.f16348N = null;
        this.f16350P = null;
    }

    boolean R() {
        IronLog ironLog;
        String str;
        if (!this.f16347M.isShown()) {
            ironLog = IronLog.INTERNAL;
            str = "banner or one of its parents are INVISIBLE or GONE";
        } else {
            if (this.f16347M.hasWindowFocus()) {
                boolean globalVisibleRect = this.f16347M.getGlobalVisibleRect(new Rect());
                IronLog.INTERNAL.verbose("visible = " + globalVisibleRect);
                return globalVisibleRect;
            }
            ironLog = IronLog.INTERNAL;
            str = "banner has no window focus";
        }
        ironLog.verbose(str);
        return false;
    }

    public void T() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f16347M;
        if (ironSourceBannerLayout != null) {
            a(ironSourceBannerLayout);
        }
    }

    @Override // com.ironsource.n7
    protected LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return ((AdapterSettingsInterface) adapterBaseInterface).getBannerLoadWhileShowSupportedState(networkSettings);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.n7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k6 a(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdViewListener> baseAdAdapter, int i4, String str, C1513m5 c1513m5) {
        return new k6(this, new C1509m1(IronSource.AD_UNIT.BANNER, this.f18298o.o(), i4, this.f18290g, str, this.f18288e, this.f18289f, networkSettings, this.f18298o.n()), baseAdAdapter, this.f16347M, this.f18292i, v(), c1513m5, this);
    }

    @Override // com.ironsource.InterfaceC1573u2
    public void d(q7<?> q7Var) {
        IronLog.INTERNAL.verbose(b(q7Var.k()));
        this.f18303t.b(q7Var.f());
    }

    @Override // com.ironsource.f6
    public void e() {
        if (!R()) {
            IronLog.INTERNAL.verbose("banner is not visible, binding skipped");
            O().h();
            this.f18302s.f15952g.b(IronSourceError.ERROR_BN_BINDING_SKIP_INVISIBLE);
        } else {
            if (!S()) {
                IronLog.INTERNAL.verbose("Cannot bind banner view after interval, the next ad is not ready yet");
                this.f16351Q.set(true);
                return;
            }
            IronLog.INTERNAL.verbose("done binding timer, binding view now, current timestamp = " + System.currentTimeMillis());
            c(this.f16349O, this.f16348N, this.f16350P);
        }
    }

    @Override // com.ironsource.f6
    public void f() {
        if (!R()) {
            IronLog.INTERNAL.verbose("banner is not visible, starting the impression timeout timer again");
            O().e();
        } else if (this.f16352R.compareAndSet(false, true)) {
            IronLog.INTERNAL.verbose("banner impression timeout reached, reloading banner manually");
            U();
            this.f18302s.f15956k.b("banner impression timeout reached, reloading banner manually");
        }
    }

    @Override // com.ironsource.n7
    protected AbstractC1503l2 g() {
        return new b7();
    }

    @Override // com.ironsource.n7
    protected C1540q2 h() {
        return new g7(this.f18298o.h(), this);
    }

    @Override // com.ironsource.n7
    protected String l() {
        return "BN";
    }

    @Override // com.ironsource.n7
    protected String o() {
        return IronSourceConstants.OPW_BN_MANAGER_NAME;
    }

    @Override // com.ironsource.n7
    protected boolean v() {
        return this.f16346L;
    }

    @Override // com.ironsource.n7
    protected AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), this.f18298o.b(), str, this.f16347M);
    }

    @Override // com.ironsource.n7
    protected JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getBannerSettings();
    }

    @Override // com.ironsource.InterfaceC1573u2
    public void c(q7<?> q7Var) {
        IronLog.INTERNAL.verbose(b(q7Var.k()));
        this.f18303t.e(q7Var.f());
    }

    @Override // com.ironsource.n7
    protected void g(q7<?> q7Var) {
    }

    @Override // com.ironsource.n7
    protected void h(q7<?> q7Var) {
    }

    private void c(q7<?> q7Var, View view, FrameLayout.LayoutParams layoutParams) {
        if (a(n7.f.READY_TO_SHOW, n7.f.SHOWING)) {
            this.f16352R.set(false);
            O().e();
            ((k6) q7Var).R();
            com.ironsource.mediationsdk.l.a(this.f16347M, view, layoutParams, new b(q7Var));
            return;
        }
        IronLog.INTERNAL.verbose("wrong state = " + this.f18299p);
    }

    @Override // com.ironsource.n7, com.ironsource.gm
    public void b() {
        boolean z4;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        try {
            if (this.f16347M == null) {
                ironLog.error("mIronSourceBanner is null");
                this.f18302s.f15952g.b(IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL);
                return;
            }
            if (!R()) {
                if (this.f18298o.h().a() == C1526o2.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
                    ironLog.verbose("banner is not visible, reload skipped");
                    this.f18302s.f15952g.b(IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE);
                }
                U();
                return;
            }
            synchronized (this.f18307x) {
                try {
                    if (a(n7.f.SHOWING, n7.f.READY_TO_LOAD)) {
                        ironLog.verbose("start reload");
                        z4 = true;
                        this.f16346L = true;
                    } else {
                        ironLog.error("wrong state = " + this.f18299p);
                        z4 = false;
                    }
                } finally {
                }
            }
            if (z4) {
                a(this.f16347M, this.f18292i);
            }
        } catch (Throwable th) {
            o9.d().a(th);
            this.f18302s.f15956k.c(th.getMessage());
        }
    }

    @Override // com.ironsource.n7, com.ironsource.InterfaceC1447d2
    public Map<String, Object> a(EnumC1433b2 enumC1433b2) {
        Map<String, Object> a4 = super.a(enumC1433b2);
        if (b(this.f16347M)) {
            com.ironsource.mediationsdk.l.a(a4, this.f16347M.getSize());
        }
        if (this.f18292i != null) {
            a4.put("placement", n());
        }
        return a4;
    }

    @Override // com.ironsource.n7, com.ironsource.InterfaceC1546r2
    public void b(q7<?> q7Var) {
        super.b(q7Var);
        if (P().o()) {
            if (!this.f16352R.compareAndSet(false, true)) {
                IronLog.INTERNAL.verbose("Impression already recorded as receive, it can occur from network onAdOpened or from impression timeout timer - loading next ad already in progress");
            } else {
                O().b();
                U();
            }
        }
    }

    private void b(q7<?> q7Var, View view, FrameLayout.LayoutParams layoutParams) {
        ((k6) q7Var).R();
        com.ironsource.mediationsdk.l.a(this.f16347M, view, layoutParams, new a(q7Var));
    }

    @Override // com.ironsource.n7
    protected void a(int i4, String str, boolean z4) {
        if (!v()) {
            super.a(i4, str, z4);
            return;
        }
        if (!z4) {
            this.f18302s.f15952g.a(ib.a(this.f18297n), i4, str);
            com.ironsource.mediationsdk.n.a().b(this.f18298o.b(), new IronSourceError(i4, str));
        }
        if (v()) {
            a(n7.f.SHOWING);
            V();
        }
    }

    @Override // com.ironsource.n7
    protected void a(Context context, com.ironsource.mediationsdk.i iVar, InterfaceC1555s4 interfaceC1555s4) {
        if (this.f18286c == null) {
            IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        } else {
            iVar.a(Q());
            this.f18286c.a(context, iVar, interfaceC1555s4);
        }
    }

    boolean b(IronSourceBannerLayout ironSourceBannerLayout) {
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout) {
        try {
            if (!b(ironSourceBannerLayout)) {
                String format = String.format("can't destroy banner - %s", ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed");
                IronLog.API.error("destroy banner failed - errorMessage = " + format);
                return;
            }
            IronLog.INTERNAL.verbose("destroying banner");
            M();
            k6 k6Var = (k6) this.f18284a.d();
            if (k6Var != null) {
                this.f18302s.f15952g.a(k6Var.r() != null ? k6Var.r().intValue() : this.f18276C.a(this.f18298o.b()));
                k6Var.P();
                this.f18284a.a(null);
                this.f18284a.b(null);
            }
            com.ironsource.mediationsdk.l.a(ironSourceBannerLayout);
            this.f16347M = null;
            this.f18292i = null;
            this.f16346L = false;
            if (P().o()) {
                this.f16351Q.set(true);
                this.f16352R.set(false);
                W();
            }
            a(n7.f.READY_TO_LOAD);
        } catch (Throwable th) {
            o9.d().a(th);
            String str = "destroyBanner - exception = " + th.getLocalizedMessage() + " state = " + this.f18299p;
            IronLog.INTERNAL.error(b(str));
            C1454e2 c1454e2 = this.f18302s;
            if (c1454e2 != null) {
                c1454e2.f15956k.g(str);
            }
        }
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout, Placement placement) {
        String format;
        IronLog.INTERNAL.verbose("placement = " + placement);
        int i4 = 510;
        if (!b(ironSourceBannerLayout)) {
            format = String.format("can't load banner - %s", ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed");
        } else if (placement == null || TextUtils.isEmpty(placement.getPlacementName())) {
            format = String.format("can't load banner - %s", placement == null ? "placement is null" : "placement name is empty");
            i4 = C1426a2.b(this.f18298o.b());
        } else if (this.f18278E.b(ContextProvider.getInstance().getApplicationContext(), placement, this.f18298o.b())) {
            format = String.format("placement %s is capped", placement.getPlacementName());
            i4 = C1426a2.f(this.f18298o.b());
        } else {
            format = null;
        }
        if (!TextUtils.isEmpty(format)) {
            IronLog.API.error(b(format));
            a(i4, format, false);
        } else {
            com.ironsource.mediationsdk.l.b(ironSourceBannerLayout);
            this.f16347M = ironSourceBannerLayout;
            this.f18292i = placement;
            A();
        }
    }

    @Override // com.ironsource.InterfaceC1573u2
    public void a(q7<?> q7Var) {
        IronLog.INTERNAL.verbose(b(q7Var.k()));
        this.f18303t.f(q7Var.f());
    }

    @Override // com.ironsource.InterfaceC1552s1
    public void a(q7<?> q7Var, View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("mState = " + this.f18299p);
        super.e(q7Var);
        if (this.f18298o.h().a() == C1526o2.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            if (!a(n7.f.READY_TO_SHOW, n7.f.SHOWING)) {
                return;
            }
            this.f18284a.a(q7Var);
            this.f18284a.b(q7Var);
            b(q7Var, view, layoutParams);
            P().k();
        } else {
            if (!P().o()) {
                return;
            }
            this.f18284a.b(q7Var);
            if (this.f16351Q.get()) {
                c(q7Var, view, layoutParams);
            } else {
                this.f16349O = q7Var;
                this.f16348N = view;
                this.f16350P = layoutParams;
            }
        }
        this.f18303t.c(q7Var.f());
    }
}
