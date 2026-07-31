package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class zd implements be {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vd f20532a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final pd f20533b;

    public zd(@NotNull vd strategy, @NotNull pd adUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f20532a = strategy;
        this.f20533b = adUnit;
    }

    @Override // com.ironsource.be
    public void a() {
        vd vdVar = this.f20532a;
        vdVar.a(new wd(vdVar, null, true));
        this.f20532a.f().a();
    }

    @Override // com.ironsource.be
    public void b() {
        this.f20532a.f().b();
        pd a4 = this.f20532a.d().a(false, this.f20532a.e());
        vd vdVar = this.f20532a;
        vdVar.a(new yd(vdVar, this.f20533b, a4));
        a4.a(this.f20532a);
    }

    @Override // com.ironsource.be
    public void loadAd() {
        vd vdVar = this.f20532a;
        vdVar.a(new wd(vdVar, null, false, 4, null));
        this.f20532a.loadAd();
    }

    @Override // com.ironsource.be
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f20533b.a(activity, this.f20532a);
    }

    @Override // com.ironsource.be
    public void b(@Nullable IronSourceError ironSourceError) {
        if (!cb.f15707a.a(ironSourceError)) {
            vd vdVar = this.f20532a;
            vdVar.a(new wd(vdVar, null, false, 4, null));
        }
        this.f20532a.f().b(ironSourceError);
    }

    @Override // com.ironsource.be
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f20532a.a("load failed after ad unit is already loaded");
    }

    @Override // com.ironsource.be
    public void b(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f20532a.a("Ad unit is already loaded");
    }

    @Override // com.ironsource.be
    public void a(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f20532a.f().onAdInfoChanged(adInfo);
    }
}
