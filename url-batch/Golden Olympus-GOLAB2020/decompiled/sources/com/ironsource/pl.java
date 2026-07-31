package com.ironsource;

import com.ironsource.C1454e2;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.ol;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class pl extends cl implements xm {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final UUID f18682d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final nl f18683e;

    /* renamed from: f, reason: collision with root package name */
    private um f18684f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private String f18685g;

    /* renamed from: h, reason: collision with root package name */
    private Placement f18686h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private rl f18687i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdData f18688j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdViewBinder f18689k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pl(@NotNull UUID adId, @NotNull nl nativeAd) {
        super(new C1525o1(r1, C1454e2.b.MEDIATION));
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.NATIVE_AD;
        this.f18682d = adId;
        this.f18683e = nativeAd;
        this.f18685g = "";
        a().e().a(new C1523o(ad_unit, adId, b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(pl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.API.info(String.valueOf(this$0));
        try {
            um umVar = this$0.f18684f;
            if (umVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nativeAdController");
                umVar = null;
            }
            umVar.j();
            this$0.f18687i = null;
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(pl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        um umVar = null;
        if (this$0.c()) {
            IronLog.INTERNAL.warning(C1525o1.a(this$0.a(), "Native ad load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.a(true);
        if (this$0.d()) {
            um umVar2 = this$0.f18684f;
            if (umVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nativeAdController");
            } else {
                umVar = umVar2;
            }
            umVar.k();
        }
    }

    @Override // com.ironsource.cl
    public boolean d() {
        this.f18684f = e();
        return true;
    }

    @Nullable
    public final AdapterNativeAdViewBinder l() {
        return this.f18689k;
    }

    @Nullable
    public final String m() {
        AdapterNativeAdData adapterNativeAdData = this.f18688j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    public final void n() {
        a(new Runnable() { // from class: com.ironsource.V2
            @Override // java.lang.Runnable
            public final void run() {
                pl.b(pl.this);
            }
        });
    }

    @Override // com.ironsource.xm
    public void onNativeAdLoadFailed(@Nullable IronSourceError ironSourceError) {
        String uuid = this.f18682d.toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adId.toString()");
        final LevelPlayAdError levelPlayAdError = new LevelPlayAdError(ironSourceError, uuid, b());
        b(new Runnable() { // from class: com.ironsource.W2
            @Override // java.lang.Runnable
            public final void run() {
                pl.a(pl.this, levelPlayAdError);
            }
        });
    }

    public /* synthetic */ pl(UUID uuid, nl nlVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? mf.f18026a.a() : uuid, nlVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(pl this$0, rl rlVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f18687i = rlVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(pl this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        rl rlVar = this$0.f18687i;
        if (rlVar != null) {
            rlVar.c(this$0.f18683e, adInfo);
        }
    }

    private final um e() {
        this.f18686h = a().d(this.f18685g);
        UUID uuid = this.f18682d;
        String b4 = b();
        Placement placement = this.f18686h;
        if (placement == null) {
            Intrinsics.throwUninitializedPropertyAccessException("placement");
            placement = null;
        }
        en enVar = new en(uuid, b4, placement);
        a(enVar);
        return new um(this, a(), enVar);
    }

    public final void f() {
        a(new Runnable() { // from class: com.ironsource.Q2
            @Override // java.lang.Runnable
            public final void run() {
                pl.a(pl.this);
            }
        });
    }

    @NotNull
    public final UUID g() {
        return this.f18682d;
    }

    @Nullable
    public final String h() {
        AdapterNativeAdData adapterNativeAdData = this.f18688j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    @Nullable
    public final String i() {
        AdapterNativeAdData adapterNativeAdData = this.f18688j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    @Nullable
    public final String j() {
        AdapterNativeAdData adapterNativeAdData = this.f18688j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    @Nullable
    public final ol.a k() {
        NativeAdDataInterface.Image icon;
        AdapterNativeAdData adapterNativeAdData = this.f18688j;
        if (adapterNativeAdData == null || (icon = adapterNativeAdData.getIcon()) == null) {
            return null;
        }
        return new ol.a(icon.getDrawable(), icon.getUri());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(pl this$0, LevelPlayAdError levelPlayError) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(levelPlayError, "$levelPlayError");
        rl rlVar = this$0.f18687i;
        if (rlVar != null) {
            rlVar.a(this$0.f18683e, levelPlayError);
        }
    }

    @Override // com.ironsource.xm
    public void b(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        IronLog.CALLBACK.info(String.valueOf(this));
        rm rmVar = new rm();
        um umVar = this.f18684f;
        if (umVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdController");
            umVar = null;
        }
        umVar.a(rmVar);
        this.f18688j = rmVar.a();
        this.f18689k = rmVar.b();
        b(new Runnable() { // from class: com.ironsource.R2
            @Override // java.lang.Runnable
            public final void run() {
                pl.b(pl.this, adInfo);
            }
        });
    }

    @Override // com.ironsource.xm
    public void f(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        b(new Runnable() { // from class: com.ironsource.S2
            @Override // java.lang.Runnable
            public final void run() {
                pl.a(pl.this, adInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(pl this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        rl rlVar = this$0.f18687i;
        if (rlVar != null) {
            rlVar.b(this$0.f18683e, adInfo);
        }
    }

    public final void b(@NotNull final String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        a(new Runnable() { // from class: com.ironsource.T2
            @Override // java.lang.Runnable
            public final void run() {
                pl.a(pl.this, placementName);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(pl this$0, String placementName) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(placementName, "$placementName");
        this$0.f18685g = placementName;
    }

    public final void a(@Nullable final rl rlVar) {
        a(new Runnable() { // from class: com.ironsource.U2
            @Override // java.lang.Runnable
            public final void run() {
                pl.a(pl.this, rlVar);
            }
        });
    }
}
