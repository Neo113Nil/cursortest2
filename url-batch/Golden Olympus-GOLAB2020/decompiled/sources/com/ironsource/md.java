package com.ironsource;

import android.app.Activity;
import com.ironsource.InterfaceC1488j1;
import com.ironsource.gd;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class md implements od {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final hl f17229a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LevelPlayAdInfo f17230b;

    public md(@NotNull hl adInternal, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f17229a = adInternal;
        this.f17230b = adInfo;
    }

    private final od a(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        if (!cb.f15707a.a(ru.f18924a.a(levelPlayAdError))) {
            return new gd(this.f17229a, gd.a.ShowFailed);
        }
        hl hlVar = this.f17229a;
        return new kd(hlVar, levelPlayAdInfo, hlVar.j());
    }

    @Override // com.ironsource.od
    @NotNull
    public LevelPlayAdInfo c() {
        return this.f17230b;
    }

    @Override // com.ironsource.od
    @NotNull
    public InterfaceC1488j1 d() {
        return new InterfaceC1488j1.a("ad is showing");
    }

    @Override // com.ironsource.od
    public void loadAd() {
        String uuid = this.f17229a.f().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        hl.a(this.f17229a, new LevelPlayAdError(uuid, this.f17229a.i(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is showing"), 0L, 2, null);
    }

    @Override // com.ironsource.od
    public void onAdClicked() {
        this.f17229a.a("onAdClicked on showing state");
    }

    @Override // com.ironsource.od
    public void onAdClosed() {
        this.f17229a.a("onAdClosed on showing state");
    }

    @Override // com.ironsource.od
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f17229a.a("onAdInfoChanged on showing state");
    }

    @Override // com.ironsource.od
    public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f17229a.a("onAdLoadFailed on showing state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.od
    public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f17229a.a("onAdLoaded on showing state");
    }

    @Override // com.ironsource.od
    public void a() {
        this.f17229a.a("onAdExpired on showing state");
    }

    @Override // com.ironsource.od
    public void b() {
        C1525o1 g4 = this.f17229a.g();
        IronLog.INTERNAL.verbose(C1525o1.a(g4, "onAdDisplayed adInfo: " + this.f17230b, (String) null, 2, (Object) null));
        g4.e().h().e();
        hl hlVar = this.f17229a;
        hlVar.a(new nd(hlVar, this.f17230b));
        g4.e(new Runnable() { // from class: com.ironsource.Y1
            @Override // java.lang.Runnable
            public final void run() {
                md.a(md.this);
            }
        });
    }

    @Override // com.ironsource.od
    public void a(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String uuid = this.f17229a.f().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.f17229a.a(new LevelPlayAdError(uuid, this.f17229a.i(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already showing"), this.f17230b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(md this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        il l4 = this$0.f17229a.l();
        if (l4 != null) {
            l4.onAdDisplayed(this$0.f17230b);
        }
    }

    @Override // com.ironsource.od
    public void a(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f17229a.a(a(error, this.f17230b));
        this.f17229a.a(error, this.f17230b);
    }
}
