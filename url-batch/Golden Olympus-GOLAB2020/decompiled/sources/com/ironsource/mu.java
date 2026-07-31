package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class mu {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final mu f18248a = new mu();

    private mu() {
    }

    public final int a() {
        return nm.f18364r.d().f().k();
    }

    @NotNull
    public final LevelPlayAdSize b(@Nullable String str, int i4, int i5) {
        return (str == null || str.length() == 0 || Intrinsics.areEqual(str, com.ironsource.mediationsdk.l.f17632f)) ? LevelPlayAdSize.Companion.createCustomSize(i4, i5) : Intrinsics.areEqual(str, com.ironsource.mediationsdk.l.f17629c) ? LevelPlayAdSize.MEDIUM_RECTANGLE : LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(str);
    }

    @Nullable
    public final String c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C1442c4.g(context);
    }

    @NotNull
    public final ConcurrentHashMap<String, List<String>> d() {
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.putAll(com.ironsource.mediationsdk.c.b().c());
        concurrentHashMap.putAll(rk.b().c());
        return concurrentHashMap;
    }

    public final boolean e() {
        return IronSource.isInterstitialReady();
    }

    public final boolean f() {
        return IronSource.isRewardedVideoAvailable();
    }

    public final void g() {
        IronSource.loadInterstitial();
    }

    public final void h() {
        IronSource.loadRewardedVideo();
    }

    public final void i() {
        com.ironsource.mediationsdk.p.m().R();
    }

    @NotNull
    public final ISBannerSize a(@Nullable String str, int i4, int i5) {
        return new ISBannerSize(str, i4, i5);
    }

    @Nullable
    public final String b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C1442c4.b(context, c(context));
    }

    @NotNull
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            ConcurrentHashMap<String, AdapterBaseWrapper> networkAdaptersMap = com.ironsource.mediationsdk.c.b().d();
            Intrinsics.checkNotNullExpressionValue(networkAdaptersMap, "networkAdaptersMap");
            for (Map.Entry<String, AdapterBaseWrapper> entry : networkAdaptersMap.entrySet()) {
                if (entry.getValue().getAdapterBaseInterface() != null) {
                    mu muVar = f18248a;
                    String key = entry.getKey();
                    Intrinsics.checkNotNullExpressionValue(key, "entry.key");
                    String a4 = muVar.a(key);
                    AdapterBaseInterface adapterBaseInterface = entry.getValue().getAdapterBaseInterface();
                    Intrinsics.checkNotNullExpressionValue(adapterBaseInterface, "entry.value.adapterBaseInterface");
                    String adapterVersion = adapterBaseInterface.getAdapterVersion();
                    Intrinsics.checkNotNullExpressionValue(adapterVersion, "adapterBaseInterface.adapterVersion");
                    jSONObject.putOpt(a4, muVar.a(adapterVersion, adapterBaseInterface.getNetworkSDKVersion()));
                }
            }
        } catch (Exception e4) {
            o9.d().a(e4);
        }
        return jSONObject;
    }

    @NotNull
    public final IronSourceBannerLayout a(@NotNull Activity activity, @NotNull ISBannerSize size) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(size, "size");
        IronSourceBannerLayout b4 = com.ironsource.mediationsdk.p.m().b(activity, size);
        Intrinsics.checkNotNullExpressionValue(b4, "getInstance().createBanner(activity, size)");
        return b4;
    }

    @NotNull
    public final JSONObject b() {
        JSONObject b4 = de.a().b();
        Intrinsics.checkNotNullExpressionValue(b4, "getProperties().toJSON()");
        return b4;
    }

    @Nullable
    public final String a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C1442c4.a(context, c(context));
    }

    public final void b(@Nullable Activity activity) {
        if (activity != null) {
            IronSource.showRewardedVideo(activity);
        } else {
            IronSource.showRewardedVideo();
        }
    }

    @NotNull
    public final String a(@NotNull NetworkSettings networkSettings) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        String providerDefaultInstance = networkSettings.getProviderDefaultInstance();
        return providerDefaultInstance == null ? new String() : providerDefaultInstance;
    }

    public final void b(@Nullable IronSourceBannerLayout ironSourceBannerLayout) {
        IronSource.loadBanner(ironSourceBannerLayout);
    }

    @NotNull
    public final String a(@Nullable Placement placement) {
        String placementName;
        return (placement == null || (placementName = placement.getPlacementName()) == null) ? new String() : placementName;
    }

    public final void b(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        IronLog.INTERNAL.error(message);
    }

    @NotNull
    public final String a(@NotNull String key) {
        String str;
        List split$default;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
        } catch (Exception e4) {
            e = e4;
            str = key;
        }
        try {
            if (StringsKt.P(key, "-", false, 2, null)) {
                str = key;
                String str2 = (String) CollectionsKt.last(StringsKt.split$default(str, new String[]{"-"}, false, 0, 6, null));
                if (!StringsKt.P(str2, BundleUtil.UNDERLINE_TAG, false, 2, null)) {
                    return str2;
                }
                split$default = StringsKt.split$default(str2, new String[]{BundleUtil.UNDERLINE_TAG}, false, 0, 6, null);
            } else {
                if (!StringsKt.P(key, BundleUtil.UNDERLINE_TAG, false, 2, null)) {
                    return key;
                }
                str = key;
                split$default = StringsKt.split$default(str, new String[]{BundleUtil.UNDERLINE_TAG}, false, 0, 6, null);
            }
            return (String) CollectionsKt.first(split$default);
        } catch (Exception e5) {
            e = e5;
            Exception exc = e;
            o9.d().a(exc);
            IronLog.INTERNAL.error(exc.getMessage());
            return str;
        }
    }

    private final JSONObject a(String str, String str2) {
        return new JSONObject(MapsKt.mapOf(TuplesKt.to(cu.f15792b, str), TuplesKt.to("sdkVersion", str2)));
    }

    @NotNull
    public final JSONObject a(boolean z4) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z4);
        Intrinsics.checkNotNullExpressionValue(mediationAdditionalData, "getMediationAdditionalData(isDemandOnlyMode)");
        return mediationAdditionalData;
    }

    public final void a(int i4, @NotNull JSONObject data) {
        Intrinsics.checkNotNullParameter(data, "data");
        br.i().a(new zb(i4, data));
    }

    public final void a(@Nullable Activity activity) {
        if (activity != null) {
            IronSource.showInterstitial(activity);
        } else {
            IronSource.showInterstitial();
        }
    }

    public final void a(@NotNull IronSource.AD_UNIT adUnit, @NotNull fu loadAdConfig) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        com.ironsource.mediationsdk.p.m().a(adUnit, loadAdConfig);
    }

    public final void a(@Nullable IronSourceBannerLayout ironSourceBannerLayout) {
        IronSource.destroyBanner(ironSourceBannerLayout);
    }

    public final void a(@Nullable LevelPlayBannerListener levelPlayBannerListener) {
        C1569t5.a().b(levelPlayBannerListener);
    }

    public final void a(@Nullable LevelPlayInterstitialListener levelPlayInterstitialListener) {
        tg.a().b(levelPlayInterstitialListener);
    }

    public final void a(@Nullable LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener) {
        eq.a().b(levelPlayRewardedVideoBaseListener);
    }

    public final boolean a(@NotNull NetworkSettings networkSettings, @NotNull IronSource.AD_UNIT adUnit) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return networkSettings.isBidder(adUnit);
    }
}
