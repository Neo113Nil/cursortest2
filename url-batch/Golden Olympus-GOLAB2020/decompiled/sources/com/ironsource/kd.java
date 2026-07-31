package com.ironsource;

import android.app.Activity;
import com.ironsource.InterfaceC1488j1;
import com.ironsource.gd;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class kd implements od {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final hl f16930a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private LevelPlayAdInfo f16931b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final q9 f16932c;

    /* renamed from: d, reason: collision with root package name */
    private final long f16933d;

    public kd(@NotNull hl adInternal, @NotNull LevelPlayAdInfo adInfo, @NotNull q9 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f16930a = adInternal;
        this.f16931b = adInfo;
        this.f16932c = currentTimeProvider;
        this.f16933d = currentTimeProvider.a();
    }

    private final long e() {
        return this.f16932c.a() - this.f16933d;
    }

    @Override // com.ironsource.od
    public void a() {
        IronLog.INTERNAL.verbose(C1525o1.a(this.f16930a.g(), "onAdExpired", (String) null, 2, (Object) null));
        this.f16930a.a(gd.a.Expired);
    }

    @Override // com.ironsource.od
    @NotNull
    public LevelPlayAdInfo c() {
        return this.f16931b;
    }

    @Override // com.ironsource.od
    @NotNull
    public InterfaceC1488j1 d() {
        l8 a4 = this.f16930a.m().u().a(this.f16930a.i());
        return a4.d() ? InterfaceC1488j1.a.f16780c.a(a4.e()) : InterfaceC1488j1.b.f16783a;
    }

    @Override // com.ironsource.od
    public void loadAd() {
        this.f16930a.g().e().h().a(Long.valueOf(e()));
        this.f16930a.a(this.f16931b);
    }

    @Override // com.ironsource.od
    public void onAdClicked() {
        this.f16930a.a("onAdClicked on loaded state");
    }

    @Override // com.ironsource.od
    public void onAdClosed() {
        this.f16930a.a("onAdClosed on loaded state");
    }

    @Override // com.ironsource.od
    public void onAdInfoChanged(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C1525o1 g4 = this.f16930a.g();
        IronLog.INTERNAL.verbose(C1525o1.a(g4, "onAdInfoChanged adInfo: " + adInfo, (String) null, 2, (Object) null));
        g4.e().h().a(this.f16931b, adInfo);
        this.f16931b = adInfo;
        g4.e(new Runnable() { // from class: com.ironsource.V1
            @Override // java.lang.Runnable
            public final void run() {
                kd.a(kd.this, adInfo);
            }
        });
    }

    @Override // com.ironsource.od
    public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f16930a.a("onAdLoadFailed on loaded state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.od
    public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f16930a.a("onAdLoaded on loaded state");
    }

    @Override // com.ironsource.od
    public void a(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Placement a4 = this.f16930a.g().a(this.f16930a.e(), str);
        LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(this.f16931b, str);
        this.f16931b = levelPlayAdInfo;
        hl hlVar = this.f16930a;
        hlVar.a(new md(hlVar, levelPlayAdInfo));
        this.f16930a.d().a(activity, a4);
    }

    @Override // com.ironsource.od
    public void b() {
        this.f16930a.a("onAdDisplayed on loaded state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(kd this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        il l4 = this$0.f16930a.l();
        if (l4 != null) {
            l4.onAdInfoChanged(adInfo);
        }
    }

    @Override // com.ironsource.od
    public void a(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f16930a.a("onAdDisplayFailed on loaded state with error: " + error.getErrorMessage());
    }
}
