package com.unity3d.ironsourceads;

import android.content.Context;
import com.ironsource.vj;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class IronSourceAds {

    @NotNull
    public static final IronSourceAds INSTANCE = new IronSourceAds();

    @Metadata
    public enum AdFormat {
        BANNER("Banner"),
        INTERSTITIAL("Interstitial"),
        REWARDED("RewardedVideo");


        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f21893a;

        AdFormat(String str) {
            this.f21893a = str;
        }

        @NotNull
        public final String getValue() {
            return this.f21893a;
        }
    }

    private IronSourceAds() {
    }

    public static final void init(@NotNull Context context, @NotNull InitRequest initRequest, @NotNull InitListener initializationListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        vj.f20077a.a(context, initRequest, initializationListener);
    }
}
