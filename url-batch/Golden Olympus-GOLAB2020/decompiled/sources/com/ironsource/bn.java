package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.n7;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class bn extends n7<fn, AdapterAdListener> implements InterfaceC1546r2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(@Nullable List<? extends NetworkSettings> list, @NotNull sm configs, @Nullable String str, @NotNull rk publisherDataHolder, @Nullable IronSourceSegment ironSourceSegment) {
        super(new cn(str, list, configs), publisherDataHolder, ironSourceSegment);
        Intrinsics.checkNotNullParameter(configs, "configs");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
    }

    @Override // com.ironsource.n7
    protected void G() {
    }

    @Override // com.ironsource.n7
    protected boolean H() {
        return false;
    }

    public final void M() {
        gv gvVar;
        int intValue;
        am amVar;
        IronLog.INTERNAL.verbose();
        try {
            fn fnVar = (fn) this.f18284a.d();
            if (fnVar != null) {
                Integer r4 = fnVar.r();
                if (r4 == null) {
                    intValue = this.f18276C.a(this.f18298o.b());
                } else {
                    Intrinsics.checkNotNullExpressionValue(r4, "it.sessionDepth ?: sessi…epth(mManagerData.adUnit)");
                    intValue = r4.intValue();
                }
                C1454e2 c1454e2 = this.f18302s;
                if (c1454e2 != null && (amVar = c1454e2.f15952g) != null) {
                    amVar.a(intValue);
                }
                fnVar.P();
                this.f18284a.a(null);
                this.f18284a.b(null);
            }
            this.f18292i = null;
            a(n7.f.NONE);
        } catch (Throwable th) {
            o9.d().a(th);
            String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(b(str));
            C1454e2 c1454e22 = this.f18302s;
            if (c1454e22 == null || (gvVar = c1454e22.f15956k) == null) {
                return;
            }
            gvVar.g(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.n7
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public fn a(@NotNull NetworkSettings providerSettings, @NotNull BaseAdAdapter<?, AdapterAdListener> adapter, int i4, @NotNull String currentAuctionId, @NotNull C1513m5 item) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(currentAuctionId, "currentAuctionId");
        Intrinsics.checkNotNullParameter(item, "item");
        return new fn(this, new C1509m1(IronSource.AD_UNIT.NATIVE_AD, this.f18298o.o(), i4, this.f18290g, currentAuctionId, this.f18288e, this.f18289f, providerSettings, this.f18298o.n()), adapter, this.f18292i, item, this);
    }

    @Override // com.ironsource.n7
    @NotNull
    protected AbstractC1503l2 g() {
        return new jb();
    }

    @Override // com.ironsource.n7
    @NotNull
    protected String l() {
        return "NA";
    }

    @Override // com.ironsource.n7
    @NotNull
    protected String o() {
        return IronSourceConstants.OPW_NT_MANAGER_NAME;
    }

    @Override // com.ironsource.n7
    protected boolean v() {
        return false;
    }

    @Override // com.ironsource.n7, com.ironsource.InterfaceC1447d2
    @NotNull
    public Map<String, Object> a(@NotNull EnumC1433b2 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Map<String, Object> data = super.a(event);
        Placement placement = this.f18292i;
        if (placement != null) {
            Intrinsics.checkNotNullExpressionValue(data, "data");
            data.put("placement", placement.getPlacementName());
        }
        UUID uuid = this.f18306w;
        if (uuid != null) {
            Intrinsics.checkNotNullExpressionValue(data, "data");
            data.put(IronSourceConstants.EVENTS_OBJECT_ID, uuid);
        }
        Intrinsics.checkNotNullExpressionValue(data, "data");
        return data;
    }

    @Override // com.ironsource.n7
    @NotNull
    protected JSONObject b(@NotNull NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        Intrinsics.checkNotNullExpressionValue(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }

    public final void a(@NotNull InternalNativeAdListener nativeAdListener) {
        Intrinsics.checkNotNullParameter(nativeAdListener, "nativeAdListener");
        a(new an(nativeAdListener));
    }

    @Override // com.ironsource.n7
    protected void a(@Nullable IronSourceError ironSourceError) {
        this.f18303t.a(ironSourceError);
    }

    public final void a(@Nullable Placement placement) {
        String format;
        int b4;
        IronLog.INTERNAL.verbose("placement = " + placement);
        if (placement == null || TextUtils.isEmpty(placement.getPlacementName())) {
            kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
            format = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{placement == null ? "placement is null" : "placement name is empty"}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            b4 = C1426a2.b(this.f18298o.b());
        } else if (this.f18278E.b(ContextProvider.getInstance().getApplicationContext(), placement, this.f18298o.b())) {
            kotlin.jvm.internal.L l5 = kotlin.jvm.internal.L.f41137a;
            format = String.format("placement %s is capped", Arrays.copyOf(new Object[]{placement.getPlacementName()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            b4 = C1426a2.f(this.f18298o.b());
        } else {
            format = null;
            b4 = 510;
        }
        if (TextUtils.isEmpty(format)) {
            this.f18292i = placement;
            A();
        } else {
            IronLog.API.error(b(format));
            a(b4, format, false);
        }
    }

    @Override // com.ironsource.n7
    protected void a(@Nullable q7<?> q7Var, @Nullable AdInfo adInfo) {
        if (q7Var instanceof fn) {
            fn fnVar = (fn) q7Var;
            this.f18303t.a(fnVar.Q(), fnVar.R(), adInfo);
        }
    }
}
