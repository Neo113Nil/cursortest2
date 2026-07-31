package com.ironsource;

import android.app.Activity;
import com.ironsource.C1539q1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class hd extends AbstractC1424a0 implements InterstitialAdListener, RewardedVideoAdListener, AdapterAdRewardListener {

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private WeakReference<id> f16584w;

    /* renamed from: x, reason: collision with root package name */
    @Nullable
    private ib f16585x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd(@NotNull C1585w2 adTools, @NotNull C1431b0 instanceData, @NotNull C1473h0 adInstancePayload, @NotNull id listener) {
        super(adTools, instanceData, adInstancePayload, listener);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f16584w = new WeakReference<>(listener);
    }

    private final void b(int i4, String str) {
        IronLog.INTERNAL.verbose(a("error = " + i4 + ", " + str));
        f().e().a().a(k(), i4, str, "");
        a(C1539q1.a.FailedToShow);
        IronSourceError ironSourceError = new IronSourceError(i4, str);
        id idVar = this.f16584w.get();
        if (idVar != null) {
            idVar.a(this, ironSourceError);
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(hd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(hd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(hd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M();
    }

    public final void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("placementName = " + k()));
        try {
            f().e().a().a(activity, k());
            if (!(g() instanceof AdapterAdFullScreenInterface)) {
                ironLog.error(a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                f().e().h().g("showAd - adapter not instance of AdapterAdFullScreenInterface");
            } else {
                Object g4 = g();
                Intrinsics.checkNotNull(g4, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
                ((AdapterAdFullScreenInterface) g4).showAd(i(), this);
            }
        } catch (Throwable th) {
            o9.d().a(th);
            String str = "showAd - exception = " + th.getMessage();
            IronLog.INTERNAL.error(a(str));
            f().e().h().g(str);
            b(C1426a2.h(m().h()), str);
        }
    }

    @Override // com.ironsource.AbstractC1424a0
    public void c() {
        if (nm.f18364r.d().d().d()) {
            if (!(g() instanceof AdapterAdFullScreenInterface)) {
                IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
                return;
            }
            Object g4 = g();
            Intrinsics.checkNotNull(g4, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<*>");
            ((AdapterAdFullScreenInterface) g4).disposeAd(m().g());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        a(new Runnable() { // from class: com.ironsource.X0
            @Override // java.lang.Runnable
            public final void run() {
                hd.a(hd.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        a(new Runnable() { // from class: com.ironsource.Y0
            @Override // java.lang.Runnable
            public final void run() {
                hd.b(hd.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        a(new Runnable() { // from class: com.ironsource.V0
            @Override // java.lang.Runnable
            public final void run() {
                hd.c(hd.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowFailed(final int i4, @Nullable final String str) {
        a(new Runnable() { // from class: com.ironsource.W0
            @Override // java.lang.Runnable
            public final void run() {
                hd.a(hd.this, i4, str);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowSuccess() {
        a(new Runnable() { // from class: com.ironsource.Z0
            @Override // java.lang.Runnable
            public final void run() {
                hd.d(hd.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        a(new Runnable() { // from class: com.ironsource.B1
            @Override // java.lang.Runnable
            public final void run() {
                hd.e(hd.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        a(new Runnable() { // from class: com.ironsource.A1
            @Override // java.lang.Runnable
            public final void run() {
                hd.f(hd.this);
            }
        });
    }

    @Override // com.ironsource.AbstractC1424a0
    protected void z() {
        if (!(g() instanceof AdapterAdFullScreenInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
            return;
        }
        Object g4 = g();
        Intrinsics.checkNotNull(g4, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((AdapterAdFullScreenInterface) g4).loadAd(m().g(), ContextProvider.getInstance().getCurrentActiveActivity(), this);
    }

    private final void H() {
        this.f16585x = new ib();
        IronLog.INTERNAL.verbose(AbstractC1424a0.a(this, (String) null, 1, (Object) null));
        f().e().a().a(k(), "");
        id idVar = this.f16584w.get();
        if (idVar != null) {
            idVar.b(this);
        }
        c();
    }

    private final void I() {
        IronLog.INTERNAL.verbose(AbstractC1424a0.a(this, (String) null, 1, (Object) null));
        f().e().a().d(k());
    }

    private final void J() {
        HashMap hashMap = new HashMap();
        Map<String, String> k4 = f().k();
        if (k4 != null) {
            for (String str : k4.keySet()) {
                hashMap.put("custom_" + str, k4.get(str));
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a4 = f().a(currentTimeMillis, o());
        long a5 = ib.a(this.f16585x);
        LevelPlayReward a6 = nm.f18364r.d().p().a(k(), m().i().b().c());
        if (a6 == null) {
            a6 = ja.f16835a.a();
        }
        LevelPlayReward levelPlayReward = a6;
        f().e().a().a(k(), levelPlayReward.getName(), levelPlayReward.getAmount(), currentTimeMillis, a4, a5, hashMap, f().j());
        id idVar = this.f16584w.get();
        if (idVar != null) {
            idVar.a(this, levelPlayReward);
        }
    }

    private final void K() {
        IronLog.INTERNAL.verbose(AbstractC1424a0.a(this, (String) null, 1, (Object) null));
        f().e().a().l(k());
        id idVar = this.f16584w.get();
        if (idVar != null) {
            idVar.a(this);
        }
    }

    private final void L() {
        IronLog.INTERNAL.verbose(AbstractC1424a0.a(this, (String) null, 1, (Object) null));
        f().e().a().i(k());
    }

    private final void M() {
        IronLog.INTERNAL.verbose(AbstractC1424a0.a(this, (String) null, 1, (Object) null));
        f().e().a().k(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(hd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(hd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(hd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(hd this$0, int i4, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b(i4, str);
    }

    @Override // com.ironsource.AbstractC1424a0
    public void a(@NotNull InterfaceC1487j0 adInstancePresenter) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }
}
