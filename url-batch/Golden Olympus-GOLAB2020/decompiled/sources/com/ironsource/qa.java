package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface qa {

    @Metadata
    public interface a {
        @Nullable
        ISDemandOnlyBannerLayout a(@Nullable Activity activity, @Nullable ISBannerSize iSBannerSize);

        void a(@Nullable Activity activity, @Nullable ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, @Nullable String str);

        void a(@Nullable Activity activity, @Nullable ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, @Nullable String str, @Nullable String str2);

        void c(@Nullable String str);
    }

    @Metadata
    public interface b {
        void a(@Nullable Activity activity, @Nullable String str);

        void a(@Nullable ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener);

        void b(@Nullable Activity activity, @Nullable String str, @Nullable String str2);

        void b(@Nullable String str);

        boolean f(@Nullable String str);
    }

    @Metadata
    public interface c {
        void a(@Nullable Activity activity, @Nullable String str, @Nullable String str2);

        void a(@Nullable ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener);

        void a(@Nullable String str);

        void b(@Nullable Activity activity, @Nullable String str);

        boolean j(@Nullable String str);
    }

    @Nullable
    String a(@NotNull Context context);

    void a(@NotNull Context context, @NotNull String str, @NotNull IronSource.AD_UNIT... ad_unitArr);
}
