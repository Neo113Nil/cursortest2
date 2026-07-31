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
public final class nd implements od {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final hl f18340a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LevelPlayAdInfo f18341b;

    public nd(@NotNull hl adInternal, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f18340a = adInternal;
        this.f18341b = adInfo;
    }

    @Override // com.ironsource.od
    public void a() {
        this.f18340a.a("onAdExpired on shown state");
    }

    @Override // com.ironsource.od
    public void b() {
        this.f18340a.a("onAdDisplayed on shown state");
    }

    @Override // com.ironsource.od
    @NotNull
    public LevelPlayAdInfo c() {
        return this.f18341b;
    }

    @Override // com.ironsource.od
    public void loadAd() {
        String uuid = this.f18340a.f().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        hl.a(this.f18340a, new LevelPlayAdError(uuid, this.f18340a.i(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is shown"), 0L, 2, null);
    }

    @Override // com.ironsource.od
    public void onAdClicked() {
        IronLog.INTERNAL.verbose(C1525o1.a(this.f18340a.g(), "onAdClicked adInfo: " + this.f18341b, (String) null, 2, (Object) null));
        this.f18340a.g().e(new Runnable() { // from class: com.ironsource.B2
            @Override // java.lang.Runnable
            public final void run() {
                nd.a(nd.this);
            }
        });
    }

    @Override // com.ironsource.od
    public void onAdClosed() {
        IronLog.INTERNAL.verbose(C1525o1.a(this.f18340a.g(), "onAdClosed adInfo: " + this.f18341b, (String) null, 2, (Object) null));
        this.f18340a.g().d(new Runnable() { // from class: com.ironsource.Z1
            @Override // java.lang.Runnable
            public final void run() {
                nd.b(nd.this);
            }
        });
        this.f18340a.g().e(new Runnable() { // from class: com.ironsource.A2
            @Override // java.lang.Runnable
            public final void run() {
                nd.c(nd.this);
            }
        });
    }

    @Override // com.ironsource.od
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f18340a.a("onAdInfoChanged on shown state");
    }

    @Override // com.ironsource.od
    public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f18340a.a("onAdLoadFailed on shown state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.od
    public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f18340a.a("onAdLoaded on shown state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(nd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f18340a.a(gd.a.Closed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(nd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        il l4 = this$0.f18340a.l();
        if (l4 != null) {
            l4.onAdClosed(this$0.f18341b);
        }
    }

    @Override // com.ironsource.od
    public void a(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String uuid = this.f18340a.f().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.f18340a.a(new LevelPlayAdError(uuid, this.f18340a.i(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already shown"), this.f18341b);
    }

    @Override // com.ironsource.od
    @NotNull
    public InterfaceC1488j1 d() {
        return new InterfaceC1488j1.a("ad is shown");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(nd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        il l4 = this$0.f18340a.l();
        if (l4 != null) {
            l4.onAdClicked(this$0.f18341b);
        }
    }

    @Override // com.ironsource.od
    public void a(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f18340a.a("onAdDisplayFailed on shown state with error: " + error.getErrorMessage());
    }
}
