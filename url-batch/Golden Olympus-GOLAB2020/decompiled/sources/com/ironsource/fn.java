package com.ironsource;

import android.app.Activity;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.q7;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class fn extends q7<InterfaceC1546r2> implements NativeAdListener, InterfaceC1447d2 {

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdData f16262r;

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdViewBinder f16263s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(@NotNull up threadInterface, @NotNull C1509m1 adSmashData, @Nullable BaseAdAdapter<?, AdapterAdListener> baseAdAdapter, @Nullable Placement placement, @NotNull C1513m5 item, @Nullable InterfaceC1546r2 interfaceC1546r2) {
        super(threadInterface, adSmashData, baseAdAdapter, new C1441c3(adSmashData.g(), adSmashData.g().getNativeAdSettings(), IronSource.AD_UNIT.NATIVE_AD), item, interfaceC1546r2);
        Intrinsics.checkNotNullParameter(threadInterface, "threadInterface");
        Intrinsics.checkNotNullParameter(adSmashData, "adSmashData");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f18780g = placement;
    }

    private final void J() {
        gv gvVar;
        IronLog.INTERNAL.verbose(d());
        if (y()) {
            super.onAdOpened();
            return;
        }
        if (this.f18778e != q7.h.FAILED) {
            kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
            String format = String.format("unexpected onAdOpened for %s, state - %s", Arrays.copyOf(new Object[]{k(), this.f18778e}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            C1454e2 c1454e2 = this.f18777d;
            if (c1454e2 == null || (gvVar = c1454e2.f15956k) == null) {
                return;
            }
            gvVar.p(format);
        }
    }

    @Override // com.ironsource.q7
    protected void G() {
        gv gvVar;
        if (!(this.f18776c instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(a("activity must not be null"));
            C1454e2 c1454e2 = this.f18777d;
            if (c1454e2 == null || (gvVar = c1454e2.f15956k) == null) {
                return;
            }
            gvVar.g("activity must not be null");
            return;
        }
        Object obj = this.f18776c;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        AdData mCurrentAdData = this.f18784k;
        Intrinsics.checkNotNullExpressionValue(mCurrentAdData, "mCurrentAdData");
        Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
        Intrinsics.checkNotNullExpressionValue(currentActiveActivity, "getInstance().currentActiveActivity");
        ((AdapterNativeAdInterface) obj).loadAd(mCurrentAdData, currentActiveActivity, this);
    }

    @Nullable
    public final AdapterNativeAdViewBinder R() {
        return this.f16263s;
    }

    @Override // com.ironsource.q7, com.ironsource.InterfaceC1447d2
    @NotNull
    public Map<String, Object> a(@NotNull EnumC1433b2 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Map<String, Object> data = super.a(event);
        if (this.f18780g != null) {
            Intrinsics.checkNotNullExpressionValue(data, "data");
            data.put("placement", j());
        }
        Intrinsics.checkNotNullExpressionValue(data, "data");
        return data;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(@NotNull final AdapterNativeAdData adapterNativeAdData, @NotNull final AdapterNativeAdViewBinder nativeAdViewBinder) {
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        if (u().c()) {
            u().a(new Runnable() { // from class: com.ironsource.M0
                @Override // java.lang.Runnable
                public final void run() {
                    fn.a(fn.this, adapterNativeAdData, nativeAdViewBinder);
                }
            });
        } else {
            a(adapterNativeAdData, nativeAdViewBinder);
        }
    }

    @Override // com.ironsource.q7, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (u().c()) {
            u().a(new Runnable() { // from class: com.ironsource.N0
                @Override // java.lang.Runnable
                public final void run() {
                    fn.a(fn.this);
                }
            });
        } else {
            J();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(fn this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J();
    }

    public final void P() {
        gv gvVar;
        am amVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(q7.h.NONE);
        Object obj = this.f18776c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterNativeAdInterface) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                AdData mCurrentAdData = this.f18784k;
                Intrinsics.checkNotNullExpressionValue(mCurrentAdData, "mCurrentAdData");
                ((AdapterNativeAdInterface) obj).destroyAd(mCurrentAdData);
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th) {
            o9.d().a(th);
            String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            C1454e2 c1454e2 = this.f18777d;
            if (c1454e2 != null && (gvVar = c1454e2.f15956k) != null) {
                gvVar.g(str);
            }
        }
        C1454e2 c1454e22 = this.f18777d;
        if (c1454e22 == null || (amVar = c1454e22.f15952g) == null) {
            return;
        }
        Integer sessionDepth = r();
        Intrinsics.checkNotNullExpressionValue(sessionDepth, "sessionDepth");
        amVar.a(sessionDepth.intValue());
    }

    @Nullable
    public final AdapterNativeAdData Q() {
        return this.f16262r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(fn this$0, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "$adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "$nativeAdViewBinder");
        this$0.a(adapterNativeAdData, nativeAdViewBinder);
    }

    private final void a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.f16262r = adapterNativeAdData;
        this.f16263s = adapterNativeAdViewBinder;
        super.onAdLoadSuccess();
    }
}
