package com.ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class x5 extends AbstractC1424a0 implements BannerAdListener {

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private WeakReference<z5> f20271w;

    /* renamed from: x, reason: collision with root package name */
    @Nullable
    private View f20272x;

    /* renamed from: y, reason: collision with root package name */
    @Nullable
    private FrameLayout.LayoutParams f20273y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(@NotNull C1585w2 adTools, @NotNull C1431b0 instanceData, @NotNull C1473h0 adInstancePayload, @NotNull z5 listener) {
        super(adTools, instanceData, adInstancePayload, listener);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f20271w = new WeakReference<>(listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(x5 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(x5 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.K();
    }

    @Override // com.ironsource.AbstractC1424a0
    public void a(@NotNull InterfaceC1487j0 adInstancePresenter) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    @Override // com.ironsource.AbstractC1424a0
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(p());
        wl.a(f(), new Runnable() { // from class: com.ironsource.R4
            @Override // java.lang.Runnable
            public final void run() {
                x5.a(x5.this);
            }
        }, 0L, 2, (Object) null);
        if (g() == null) {
            ironLog.warning("adapter == null");
            return;
        }
        try {
            if (g() instanceof AdapterBannerInterface) {
                Object g4 = g();
                Intrinsics.checkNotNull(g4, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<*>");
                ((AdapterBannerInterface) g4).destroyAd(i());
            } else {
                ironLog.error(a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th) {
            o9.d().a(th);
            String str = "destroyBanner - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            f().e().h().g(str);
        }
        super.b();
    }

    @Override // com.ironsource.AbstractC1424a0
    @NotNull
    public LevelPlayAdInfo e() {
        String uuid = m().i().b().b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "instanceData.adUnitData.…roperties.adId.toString()");
        String c4 = m().i().b().c();
        String ad_unit = m().h().toString();
        Intrinsics.checkNotNullExpressionValue(ad_unit, "instanceData.adFormat.toString()");
        ImpressionData a4 = m().n().a(k());
        bm d4 = m().n().d();
        AbstractC1584w1 i4 = m().i();
        Intrinsics.checkNotNull(i4, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return new LevelPlayAdInfo(uuid, c4, ad_unit, a4, d4, ((m6) i4).b().g(), null, 64, null);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        a(new Runnable() { // from class: com.ironsource.V4
            @Override // java.lang.Runnable
            public final void run() {
                x5.b(x5.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(@NotNull final View adView, @NotNull final FrameLayout.LayoutParams frameLayoutParams) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(frameLayoutParams, "frameLayoutParams");
        wl.a(f(), new Runnable() { // from class: com.ironsource.Q4
            @Override // java.lang.Runnable
            public final void run() {
                x5.a(x5.this, adView, frameLayoutParams);
            }
        }, 0L, 2, (Object) null);
        super.onAdLoadSuccess();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        a(new Runnable() { // from class: com.ironsource.U4
            @Override // java.lang.Runnable
            public final void run() {
                x5.c(x5.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        a(new Runnable() { // from class: com.ironsource.W4
            @Override // java.lang.Runnable
            public final void run() {
                x5.d(x5.this);
            }
        });
    }

    @Override // com.ironsource.AbstractC1424a0
    protected void z() {
        if (!(g() instanceof AdapterBannerInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
            return;
        }
        AdData i4 = i();
        ISBannerSize H3 = H();
        Map<String, Object> adUnitData = i4.getAdUnitData();
        Intrinsics.checkNotNullExpressionValue(adUnitData, "adData.adUnitData");
        adUnitData.put("bannerLayout", new IronSourceBannerLayout(ContextProvider.getInstance().getApplicationContext(), H3));
        Object g4 = g();
        Intrinsics.checkNotNull(g4, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((AdapterBannerInterface) g4).loadAd(i4, ContextProvider.getInstance().getCurrentActiveActivity(), H3, this);
    }

    private final ISBannerSize H() {
        C1585w2 f4 = f();
        AbstractC1584w1 i4 = m().i();
        Intrinsics.checkNotNull(i4, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return f4.a(((m6) i4).b().g());
    }

    private final void I() {
        Placement j4 = j();
        if (j4 != null) {
            f().e().a().f(j4.getPlacementName());
        }
        z5 z5Var = this.f20271w.get();
        if (z5Var != null) {
            z5Var.a(this);
        }
    }

    private final void J() {
        Placement j4 = j();
        if (j4 != null) {
            f().e().a().c(j4.getPlacementName());
        }
        z5 z5Var = this.f20271w.get();
        if (z5Var != null) {
            z5Var.b(this);
        }
    }

    private final void K() {
        Placement j4 = j();
        if (j4 != null) {
            f().e().a().h(j4.getPlacementName());
        }
        z5 z5Var = this.f20271w.get();
        if (z5Var != null) {
            z5Var.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(x5 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(x5 this$0) {
        String str;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C1517n0 a4 = this$0.f().e().a();
        Placement j4 = this$0.j();
        if (j4 == null || (str = j4.getPlacementName()) == null) {
            str = "";
        }
        a4.j(str);
    }

    public final void a(@NotNull final sv viewBinder) {
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        wl.a(f(), new Runnable() { // from class: com.ironsource.T4
            @Override // java.lang.Runnable
            public final void run() {
                x5.a(x5.this, viewBinder);
            }
        }, 0L, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(x5 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f20272x = null;
        this$0.f20273y = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(x5 this$0, View adView, FrameLayout.LayoutParams frameLayoutParams) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adView, "$adView");
        Intrinsics.checkNotNullParameter(frameLayoutParams, "$frameLayoutParams");
        this$0.f20272x = adView;
        this$0.f20273y = frameLayoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final x5 this$0, sv viewBinder) {
        FrameLayout.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewBinder, "$viewBinder");
        View view = this$0.f20272x;
        if (view == null || (layoutParams = this$0.f20273y) == null) {
            return;
        }
        viewBinder.a(view, layoutParams, this$0.f());
        IronLog.INTERNAL.verbose(C1525o1.a(this$0.f(), "Bind banner view", (String) null, 2, (Object) null));
        this$0.f().d(new Runnable() { // from class: com.ironsource.S4
            @Override // java.lang.Runnable
            public final void run() {
                x5.e(x5.this);
            }
        });
    }
}
