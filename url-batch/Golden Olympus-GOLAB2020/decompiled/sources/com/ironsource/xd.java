package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class xd implements be {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vd f20312a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final pd f20313b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final pd f20314c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private LevelPlayAdInfo f20315d;

    public xd(@NotNull vd strategy, @NotNull pd currentAdUnit, @NotNull pd progressiveAdUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(progressiveAdUnit, "progressiveAdUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f20312a = strategy;
        this.f20313b = currentAdUnit;
        this.f20314c = progressiveAdUnit;
        this.f20315d = adInfo;
    }

    @Override // com.ironsource.be
    public void a() {
        vd vdVar = this.f20312a;
        vdVar.a(new wd(vdVar, this.f20313b, true));
    }

    @Override // com.ironsource.be
    public void b() {
        this.f20312a.a("show success on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.be
    public void loadAd() {
        this.f20312a.f().a(this.f20315d);
        vd vdVar = this.f20312a;
        vdVar.a(new zd(vdVar, this.f20314c));
    }

    @Override // com.ironsource.be
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f20312a.f().b(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.be
    public void b(@Nullable IronSourceError ironSourceError) {
        this.f20312a.a("show failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.be
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f20312a.a("load failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.be
    public void b(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f20312a.a("load success on progressive ad unit is already loaded");
    }

    @Override // com.ironsource.be
    public void a(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f20315d = adInfo;
    }
}
