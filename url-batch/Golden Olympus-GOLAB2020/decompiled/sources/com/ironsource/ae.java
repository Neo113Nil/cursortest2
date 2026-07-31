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
public final class ae implements be {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vd f15074a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final pd f15075b;

    public ae(@NotNull vd strategy, @NotNull pd adUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f15074a = strategy;
        this.f15075b = adUnit;
    }

    @Override // com.ironsource.be
    public void a() {
        this.f15074a.a("ad expired while loading");
    }

    @Override // com.ironsource.be
    public void b() {
        this.f15074a.a("show success while loading");
    }

    @Override // com.ironsource.be
    public void loadAd() {
        this.f15074a.f().a(new IronSourceError(LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load called before load success"));
    }

    @Override // com.ironsource.be
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f15074a.f().b(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.be
    public void b(@Nullable IronSourceError ironSourceError) {
        this.f15074a.a("show failed while loading");
    }

    @Override // com.ironsource.be
    public void a(@Nullable IronSourceError ironSourceError) {
        vd vdVar = this.f15074a;
        vdVar.a(new wd(vdVar, this.f15075b, false, 4, null));
        this.f15074a.f().a(ironSourceError);
    }

    @Override // com.ironsource.be
    public void b(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        vd vdVar = this.f15074a;
        vdVar.a(new zd(vdVar, this.f15075b));
        this.f15074a.f().a(adInfo);
    }

    @Override // com.ironsource.be
    public void a(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f15074a.a("load success with better ad while loading");
    }
}
