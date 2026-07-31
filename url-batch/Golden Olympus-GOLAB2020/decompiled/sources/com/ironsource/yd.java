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
public final class yd implements be {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vd f20430a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final pd f20431b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final pd f20432c;

    public yd(@NotNull vd strategy, @NotNull pd currentAdUnit, @NotNull pd progressiveAdUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(progressiveAdUnit, "progressiveAdUnit");
        this.f20430a = strategy;
        this.f20431b = currentAdUnit;
        this.f20432c = progressiveAdUnit;
    }

    @Override // com.ironsource.be
    public void a() {
        this.f20430a.a("ad expired before progressive load success");
    }

    @Override // com.ironsource.be
    public void b() {
        this.f20430a.a("show success before progressive load success");
    }

    @Override // com.ironsource.be
    public void loadAd() {
        vd vdVar = this.f20430a;
        vdVar.a(new ae(vdVar, this.f20432c));
    }

    @Override // com.ironsource.be
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f20430a.f().b(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, "Show called while progressive loading another ad"));
    }

    @Override // com.ironsource.be
    public void b(@Nullable IronSourceError ironSourceError) {
        this.f20430a.a("show failed before progressive load success");
    }

    @Override // com.ironsource.be
    public void a(@Nullable IronSourceError ironSourceError) {
        vd vdVar = this.f20430a;
        vdVar.a(new wd(vdVar, this.f20431b, false, 4, null));
    }

    @Override // com.ironsource.be
    public void b(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        vd vdVar = this.f20430a;
        vdVar.a(new xd(vdVar, this.f20431b, this.f20432c, adInfo));
    }

    @Override // com.ironsource.be
    public void a(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f20430a.a("load success with better ad before progressive load success");
    }
}
