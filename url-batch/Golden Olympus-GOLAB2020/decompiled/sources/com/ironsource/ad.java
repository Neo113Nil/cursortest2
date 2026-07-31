package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class ad implements mo {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private bd f15070a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private WeakReference<cd> f15071b = new WeakReference<>(null);

    @Metadata
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f15072a = new a();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f15073b = "impressions";

        private a() {
        }
    }

    public final void a(@NotNull bd loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        this.f15070a = loadListener;
    }

    @Override // com.ironsource.mo
    public void onInterstitialAdRewarded(@Nullable String str, int i4) {
        cd cdVar = this.f15071b.get();
        if (cdVar != null) {
            cdVar.onAdInstanceDidReward(str, i4);
        }
    }

    @Override // com.ironsource.mo
    public void onInterstitialClick() {
        cd cdVar = this.f15071b.get();
        if (cdVar != null) {
            cdVar.onAdInstanceDidClick();
        }
    }

    @Override // com.ironsource.mo
    public void onInterstitialClose() {
        cd cdVar = this.f15071b.get();
        if (cdVar != null) {
            cdVar.onAdInstanceDidDismiss();
        }
    }

    @Override // com.ironsource.mo
    public void onInterstitialEventNotificationReceived(@Nullable String str, @Nullable JSONObject jSONObject) {
        cd cdVar;
        if (!Intrinsics.areEqual(str, "impressions") || (cdVar = this.f15071b.get()) == null) {
            return;
        }
        cdVar.onAdInstanceDidBecomeVisible();
    }

    @Override // com.ironsource.mo
    public void onInterstitialInitFailed(@Nullable String str) {
    }

    @Override // com.ironsource.mo
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.mo
    public void onInterstitialLoadFailed(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        bd bdVar = this.f15070a;
        if (bdVar != null) {
            bdVar.a(description);
        }
    }

    @Override // com.ironsource.mo
    public void onInterstitialLoadSuccess(@NotNull sj adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        bd bdVar = this.f15070a;
        if (bdVar != null) {
            bdVar.a(adInstance);
        }
    }

    @Override // com.ironsource.mo
    public void onInterstitialOpen() {
        cd cdVar = this.f15071b.get();
        if (cdVar != null) {
            cdVar.onAdInstanceDidShow();
        }
    }

    @Override // com.ironsource.mo
    public void onInterstitialShowFailed(@Nullable String str) {
        cd cdVar = this.f15071b.get();
        if (cdVar != null) {
            cdVar.a(str);
        }
    }

    @Override // com.ironsource.mo
    public void onInterstitialShowSuccess() {
    }

    public final void a(@NotNull cd showListener) {
        Intrinsics.checkNotNullParameter(showListener, "showListener");
        this.f15071b = new WeakReference<>(showListener);
    }
}
