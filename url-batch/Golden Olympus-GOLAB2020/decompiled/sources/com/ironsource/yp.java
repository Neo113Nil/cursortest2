package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class yp {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1585w2 f20457a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<ao> f20458b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC1584w1 f20459c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final IronSource.AD_UNIT f20460d;

    @Metadata
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20461a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f20461a = iArr;
        }
    }

    @Metadata
    public static final class b extends ir {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ NetworkSettings f20463b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdapterBaseInterface f20464c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AdData f20465d;

        b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
            this.f20463b = networkSettings;
            this.f20464c = adapterBaseInterface;
            this.f20465d = adData;
        }

        @Override // com.ironsource.ir
        public void a() {
            yp ypVar = yp.this;
            NetworkSettings networkSettings = this.f20463b;
            AdapterBaseInterface networkAdapter = this.f20464c;
            Intrinsics.checkNotNullExpressionValue(networkAdapter, "networkAdapter");
            ypVar.a(networkSettings, networkAdapter, this.f20465d);
        }

        @Override // com.ironsource.ir
        public void a(@NotNull Throwable t4) {
            Intrinsics.checkNotNullParameter(t4, "t");
            yp.this.f20457a.e().h().g("initProvider - exception while calling networkAdapter.init with " + this.f20463b.getProviderName() + " - " + t4);
        }
    }

    public yp(@NotNull C1585w2 adUnitTools, @NotNull LevelPlay.AdFormat adFormat, @NotNull List<ao> providers, @NotNull AbstractC1584w1 adUnitData) {
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f20457a = adUnitTools;
        this.f20458b = providers;
        this.f20459c = adUnitData;
        this.f20460d = a(adFormat);
    }

    private final IronSource.AD_UNIT a(LevelPlay.AdFormat adFormat) {
        int i4 = a.f20461a[adFormat.ordinal()];
        if (i4 == 1) {
            return IronSource.AD_UNIT.REWARDED_VIDEO;
        }
        if (i4 == 2) {
            return IronSource.AD_UNIT.INTERSTITIAL;
        }
        if (i4 == 3) {
            return IronSource.AD_UNIT.BANNER;
        }
        if (i4 == 4) {
            return IronSource.AD_UNIT.NATIVE_AD;
        }
        throw new W1.m();
    }

    public final void a() {
        IronLog.INTERNAL.verbose(C1525o1.a(this.f20457a, (String) null, (String) null, 3, (Object) null));
        UUID randomUUID = UUID.randomUUID();
        Iterator<ao> it = this.f20458b.iterator();
        while (it.hasNext()) {
            NetworkSettings f4 = it.next().f();
            AdapterBaseInterface b4 = com.ironsource.mediationsdk.c.b().b(f4, this.f20460d, randomUUID);
            if (a(f4, b4)) {
                xt.a(xt.f20339a, new b(f4, b4, this.f20459c.a(f4)), 0L, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
        a("Start initializing provider %s on thread %s", networkSettings);
        adapterBaseInterface.init(adData, ContextProvider.getInstance().getApplicationContext(), null);
        a("Done initializing provider %s on thread %s", networkSettings);
    }

    private final void a(String str, NetworkSettings networkSettings) {
        IronLog ironLog = IronLog.INTERNAL;
        C1585w2 c1585w2 = this.f20457a;
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        String format = String.format(str, Arrays.copyOf(new Object[]{networkSettings.getProviderInstanceName(), Thread.currentThread().getName()}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        ironLog.verbose(C1525o1.a(c1585w2, format, (String) null, 2, (Object) null));
    }

    private final boolean a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (adapterBaseInterface == null) {
            return false;
        }
        C1585w2 c1585w2 = this.f20457a;
        IronSource.AD_UNIT ad_unit = this.f20460d;
        String providerInstanceName = networkSettings.getProviderInstanceName();
        Intrinsics.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        return !c1585w2.a(adapterBaseInterface, ad_unit, providerInstanceName) && (networkSettings.shouldEarlyInit() || networkSettings.isIronSource() || networkSettings.isBidder(this.f20460d));
    }
}
