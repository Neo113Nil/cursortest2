package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class wb {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final wb f20181a = new wb();

    private wb() {
    }

    @NotNull
    public final IronSourceError a() {
        return a(this, qg.ISErrorInitDecryptionFailure, null, 2, null);
    }

    @NotNull
    public final IronSourceError b() {
        return a(this, qg.ISErrorInitHttpRequestFailed, null, 2, null);
    }

    @NotNull
    public final IronSourceError c() {
        return a(this, qg.ISErrorInitInvalidResponse, null, 2, null);
    }

    @NotNull
    public final IronSourceError d() {
        return a(this, qg.ISErrorLoadADMDecryptionFailure, null, 2, null);
    }

    @NotNull
    public final IronSourceError e() {
        return a(this, qg.ISErrorLoadADMEmptyServerData, null, 2, null);
    }

    @NotNull
    public final IronSourceError f() {
        return a(this, qg.ISErrorLoadADMEmptyWaterfall, null, 2, null);
    }

    @NotNull
    public final IronSourceError g() {
        return a(this, qg.ISErrorLoadADMInvalidConfigurationForRequestedNetwork, null, 2, null);
    }

    @NotNull
    public final IronSourceError h() {
        return a(this, qg.ISErrorLoadADMInvalidJSON, null, 2, null);
    }

    @NotNull
    public final IronSourceError i() {
        return a(this, qg.ISErrorLoadADMNoAuctionID, null, 2, null);
    }

    @NotNull
    public final IronSourceError j() {
        return a(this, qg.ISErrorLoadADMNoConfigurationForRequestedNetwork, null, 2, null);
    }

    @NotNull
    public final IronSourceError k() {
        return a(this, qg.ISErrorLoadBannerNetworkViewIsNull, null, 2, null);
    }

    @NotNull
    public final IronSourceError l() {
        return a(this, qg.ISErrorLoadBannerNotSupportedSize, null, 2, null);
    }

    @NotNull
    public final IronSourceError m() {
        return a(this, qg.ISErrorLoadBannerSizeIsNull, null, 2, null);
    }

    @NotNull
    public final IronSourceError n() {
        return a(this, qg.ISErrorLoadBiddingInNonBidding, null, 2, null);
    }

    @NotNull
    public final IronSourceError o() {
        return a(this, qg.ISErrorLoadInstanceNotInInitResponse, null, 2, null);
    }

    @NotNull
    public final IronSourceError p() {
        return a(this, qg.ISErrorLoadNoAdFormatConfigurations, null, 2, null);
    }

    @NotNull
    public final IronSourceError q() {
        return a(this, qg.ISErrorLoadNullADM, null, 2, null);
    }

    @NotNull
    public final IronSourceError r() {
        return a(this, qg.ISErrorLoadSDKNotInitialized, null, 2, null);
    }

    @NotNull
    public final IronSourceError s() {
        return a(this, qg.ISErrorLoadTimedOut, null, 2, null);
    }

    @NotNull
    public final IronSourceError t() {
        return a(this, qg.ISErrorShowNotReadyToShowAd, null, 2, null);
    }

    @NotNull
    public final IronSourceError a(@NotNull IronSourceError networkError) {
        Intrinsics.checkNotNullParameter(networkError, "networkError");
        return a(qg.ISErrorInitNetworkFailed, networkError);
    }

    @NotNull
    public final IronSourceError b(@NotNull IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return a(qg.ISErrorLoadNetworkFailed, error);
    }

    @NotNull
    public final IronSourceError c(@NotNull IronSourceError networkError) {
        Intrinsics.checkNotNullParameter(networkError, "networkError");
        return a(qg.ISErrorShowNetworkFailed, networkError);
    }

    @NotNull
    public final IronSourceError d(@Nullable String str) {
        return a(qg.ISErrorRewardedLoadNoConfig, str);
    }

    private final IronSourceError a(qg qgVar, IronSourceError ironSourceError) {
        String c4;
        if (ironSourceError != null) {
            c4 = qgVar.c() + " Underlying network error: '" + ironSourceError.getErrorCode() + ':' + ironSourceError.getErrorMessage() + '\'';
        } else {
            c4 = qgVar.c();
        }
        return new IronSourceError(qgVar.b(), c4);
    }

    public static /* synthetic */ IronSourceError b(wb wbVar, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = "";
        }
        return wbVar.b(str);
    }

    public static /* synthetic */ IronSourceError c(wb wbVar, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = "";
        }
        return wbVar.d(str);
    }

    private final IronSourceError a(qg qgVar, String str) {
        if (str == null || str.length() == 0) {
            str = qgVar.c();
        }
        return new IronSourceError(qgVar.b(), str);
    }

    @NotNull
    public final IronSourceError b(@Nullable String str) {
        return a(qg.ISErrorInterstitialLoadNoConfig, str);
    }

    @NotNull
    public final IronSourceError c(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return a(qg.ISErrorLoadNetworkFailed, description);
    }

    static /* synthetic */ IronSourceError a(wb wbVar, qg qgVar, IronSourceError ironSourceError, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            ironSourceError = null;
        }
        return wbVar.a(qgVar, ironSourceError);
    }

    public static /* synthetic */ IronSourceError a(wb wbVar, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = "";
        }
        return wbVar.a(str);
    }

    @NotNull
    public final IronSourceError a(@Nullable String str) {
        return a(qg.ISErrorBannerLoadNoConfig, str);
    }
}
