package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class tl {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final hl f19803a;

    @Metadata
    public static final class a implements InterfaceC1590x1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ yf f19804a;

        a(yf yfVar) {
            this.f19804a = yfVar;
        }

        @Override // com.ironsource.InterfaceC1590x1
        @NotNull
        public AbstractC1584w1 a(boolean z4, @NotNull C1460f1 adProperties) {
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            return tq.f19813z.a(adProperties, this.f19804a.t().a(), z4);
        }
    }

    public tl(@NotNull String adUnitId, @NotNull C1525o1 adTools, @NotNull ed adControllerFactory, @NotNull yf provider, @NotNull q9 currentTimeProvider, @NotNull mf idFactory) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        this.f19803a = new hl(LevelPlay.AdFormat.REWARDED, adUnitId, adTools, adControllerFactory, new a(provider), provider, currentTimeProvider, idFactory);
    }

    @NotNull
    public final String a() {
        String uuid = this.f19803a.f().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "fullScreenAdInternal.adId.toString()");
        return uuid;
    }

    public final boolean b() {
        IronLog.API.info("LevelPlayRewardedAd.isAdReady()");
        return this.f19803a.n();
    }

    public final void c() {
        IronLog.API.info("LevelPlayRewardedAd.loadAd()");
        this.f19803a.o();
    }

    public final void a(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog.API.info("LevelPlayRewardedAd.showAd() placementName: " + str);
        this.f19803a.a(activity, str);
    }

    public final void a(@Nullable LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        IronLog.API.info("LevelPlayRewardedAd.setListener()");
        this.f19803a.a(levelPlayRewardedAdListener != null ? ul.b(levelPlayRewardedAdListener) : null);
    }
}
