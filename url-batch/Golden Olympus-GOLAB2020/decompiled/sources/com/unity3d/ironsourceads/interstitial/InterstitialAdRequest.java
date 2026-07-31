package com.unity3d.ironsourceads.interstitial;

import android.os.Bundle;
import com.ironsource.dk;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.zn;
import com.ironsource.zp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class InterstitialAdRequest {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f21917a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f21918b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final Bundle f21919c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final zp f21920d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f21921e;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f21922a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f21923b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private Bundle f21924c;

        public Builder(@NotNull String instanceId, @NotNull String adm) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(adm, "adm");
            this.f21922a = instanceId;
            this.f21923b = adm;
        }

        @NotNull
        public final InterstitialAdRequest build() {
            IronLog.API.info("instanceId: " + this.f21922a);
            return new InterstitialAdRequest(this.f21922a, this.f21923b, this.f21924c, null);
        }

        @NotNull
        public final String getAdm() {
            return this.f21923b;
        }

        @NotNull
        public final String getInstanceId() {
            return this.f21922a;
        }

        @NotNull
        public final Builder withExtraParams(@NotNull Bundle extraParams) {
            Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            this.f21924c = extraParams;
            return this;
        }
    }

    private InterstitialAdRequest(String str, String str2, Bundle bundle) {
        this.f21917a = str;
        this.f21918b = str2;
        this.f21919c = bundle;
        this.f21920d = new zn(str);
        String b4 = dk.b();
        Intrinsics.checkNotNullExpressionValue(b4, "generateMultipleUniqueInstanceId()");
        this.f21921e = b4;
    }

    @NotNull
    public final String getAdId$mediationsdk_release() {
        return this.f21921e;
    }

    @NotNull
    public final String getAdm() {
        return this.f21918b;
    }

    @Nullable
    public final Bundle getExtraParams() {
        return this.f21919c;
    }

    @NotNull
    public final String getInstanceId() {
        return this.f21917a;
    }

    @NotNull
    public final zp getProviderName$mediationsdk_release() {
        return this.f21920d;
    }

    public /* synthetic */ InterstitialAdRequest(String str, String str2, Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bundle);
    }
}
