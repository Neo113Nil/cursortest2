package com.ironsource;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.q7;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public class k6 extends q7<InterfaceC1552s1> implements BannerAdListener, InterfaceC1447d2 {

    /* renamed from: t, reason: collision with root package name */
    public static final String f16910t = "bannerLayout";

    /* renamed from: u, reason: collision with root package name */
    public static final String f16911u = "bannerSize";

    /* renamed from: r, reason: collision with root package name */
    private final IronSourceBannerLayout f16912r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f16913s;

    class a extends ir {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f16914a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout.LayoutParams f16915b;

        a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f16914a = view;
            this.f16915b = layoutParams;
        }

        @Override // com.ironsource.ir
        public void a() {
            k6.this.a(this.f16914a, this.f16915b);
        }
    }

    class b extends ir {
        b() {
        }

        @Override // com.ironsource.ir
        public void a() {
            k6.this.J();
        }
    }

    public k6(up upVar, C1509m1 c1509m1, BaseAdAdapter<?, AdapterAdViewListener> baseAdAdapter, IronSourceBannerLayout ironSourceBannerLayout, Placement placement, boolean z4, C1513m5 c1513m5, InterfaceC1552s1 interfaceC1552s1) {
        super(upVar, c1509m1, baseAdAdapter, new C1441c3(c1509m1.g(), c1509m1.g().getBannerSettings(), IronSource.AD_UNIT.BANNER), c1513m5, interfaceC1552s1);
        this.f16912r = ironSourceBannerLayout;
        this.f18780g = placement;
        this.f16913s = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (y()) {
            super.onAdOpened();
            return;
        }
        if (this.f18778e == q7.h.FAILED) {
            return;
        }
        ironLog.error(String.format("unexpected onAdOpened for %s, state - %s", k(), this.f18778e));
        if (this.f18777d != null) {
            this.f18777d.f15956k.p(String.format("unexpected onAdOpened, state - %s", this.f18778e));
        }
    }

    @Override // com.ironsource.q7
    protected void G() {
        Object obj = this.f18776c;
        if (obj instanceof AdapterBannerInterface) {
            ((AdapterBannerInterface) obj).loadAd(this.f18784k, ContextProvider.getInstance().getCurrentActiveActivity(), this.f16912r.getSize(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
        }
    }

    @Override // com.ironsource.q7
    protected boolean O() {
        return false;
    }

    public void P() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(q7.h.NONE);
        Object obj = this.f18776c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterBannerInterface) {
                ((AdapterBannerInterface) obj).destroyAd(this.f18784k);
            } else {
                ironLog.error(a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th) {
            o9.d().a(th);
            String str = "destroyBanner - exception = " + th.getLocalizedMessage() + " state = " + this.f18778e;
            IronLog.INTERNAL.error(a(str));
            C1454e2 c1454e2 = this.f18777d;
            if (c1454e2 != null) {
                c1454e2.f15956k.g(str);
            }
        }
        C1454e2 c1454e22 = this.f18777d;
        if (c1454e22 != null) {
            c1454e22.f15952g.a(r().intValue());
        }
    }

    public void Q() {
        Object obj = this.f18776c;
        if (obj instanceof AdapterBindAdViewInterface) {
            ((AdapterBindAdViewInterface) obj).onAdViewBound(this.f18784k);
        }
    }

    public void R() {
        Object obj = this.f18776c;
        if (obj instanceof AdapterBindAdViewInterface) {
            ((AdapterBindAdViewInterface) obj).onAdViewWillBind(this.f18784k);
        }
    }

    @Override // com.ironsource.q7
    protected AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        C1454e2 c1454e2;
        Placement placement = this.f18780g;
        if (placement != null && (c1454e2 = this.f18777d) != null) {
            c1454e2.f15955j.f(placement.getPlacementName());
        }
        Listener listener = this.f18775b;
        if (listener != 0) {
            ((InterfaceC1552s1) listener).d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams) {
        if (u().c()) {
            u().a(new a(view, layoutParams));
        } else {
            a(view, layoutParams);
        }
    }

    @Override // com.ironsource.q7, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (u().c()) {
            u().a(new b());
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        C1454e2 c1454e2;
        Placement placement = this.f18780g;
        if (placement != null && (c1454e2 = this.f18777d) != null) {
            c1454e2.f15955j.c(placement.getPlacementName());
        }
        Listener listener = this.f18775b;
        if (listener != 0) {
            ((InterfaceC1552s1) listener).c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        C1454e2 c1454e2;
        Placement placement = this.f18780g;
        if (placement != null && (c1454e2 = this.f18777d) != null) {
            c1454e2.f15955j.h(placement.getPlacementName());
        }
        Listener listener = this.f18775b;
        if (listener != 0) {
            ((InterfaceC1552s1) listener).a(this);
        }
    }

    @Override // com.ironsource.q7
    protected boolean v() {
        return this.f16913s;
    }

    @Override // com.ironsource.q7, com.ironsource.InterfaceC1447d2
    public Map<String, Object> a(EnumC1433b2 enumC1433b2) {
        Map<String, Object> a4 = super.a(enumC1433b2);
        IronSourceBannerLayout ironSourceBannerLayout = this.f16912r;
        if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
            com.ironsource.mediationsdk.l.a(a4, this.f16912r.getSize());
        }
        if (this.f18780g != null) {
            a4.put("placement", j());
        }
        return a4;
    }

    @Override // com.ironsource.q7
    protected Map<String, Object> a(Map<String, Object> map) {
        Map<String, Object> a4 = super.a(map);
        C1509m1 c1509m1 = this.f18774a;
        if (c1509m1 != null && this.f16912r != null && TextUtils.isEmpty(c1509m1.g().getCustomNetwork())) {
            a4.put("bannerLayout", this.f16912r);
        }
        return a4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams) {
        Listener listener;
        super.onAdLoadSuccess();
        if (!y() || (listener = this.f18775b) == 0) {
            return;
        }
        ((InterfaceC1552s1) listener).a(this, view, layoutParams);
    }
}
