package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.dk;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.zn;
import com.ironsource.zp;
import com.unity3d.ironsourceads.AdSize;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class BannerAdRequest {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f21898a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f21899b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f21900c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AdSize f21901d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final Bundle f21902e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final zp f21903f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f21904g;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Context f21905a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f21906b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f21907c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final AdSize f21908d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        private Bundle f21909e;

        public Builder(@NotNull Context context, @NotNull String instanceId, @NotNull String adm, @NotNull AdSize size) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(adm, "adm");
            Intrinsics.checkNotNullParameter(size, "size");
            this.f21905a = context;
            this.f21906b = instanceId;
            this.f21907c = adm;
            this.f21908d = size;
        }

        @NotNull
        public final BannerAdRequest build() {
            IronLog.API.info("instanceId: " + this.f21906b + ", size: " + this.f21908d.getSizeDescription());
            return new BannerAdRequest(this.f21905a, this.f21906b, this.f21907c, this.f21908d, this.f21909e, null);
        }

        @NotNull
        public final String getAdm() {
            return this.f21907c;
        }

        @NotNull
        public final Context getContext() {
            return this.f21905a;
        }

        @NotNull
        public final String getInstanceId() {
            return this.f21906b;
        }

        @NotNull
        public final AdSize getSize() {
            return this.f21908d;
        }

        @NotNull
        public final Builder withExtraParams(@NotNull Bundle extraParams) {
            Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            this.f21909e = extraParams;
            return this;
        }
    }

    private BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle) {
        this.f21898a = context;
        this.f21899b = str;
        this.f21900c = str2;
        this.f21901d = adSize;
        this.f21902e = bundle;
        this.f21903f = new zn(str);
        String b4 = dk.b();
        Intrinsics.checkNotNullExpressionValue(b4, "generateMultipleUniqueInstanceId()");
        this.f21904g = b4;
    }

    @NotNull
    public final String getAdId$mediationsdk_release() {
        return this.f21904g;
    }

    @NotNull
    public final String getAdm() {
        return this.f21900c;
    }

    @NotNull
    public final Context getContext() {
        return this.f21898a;
    }

    @Nullable
    public final Bundle getExtraParams() {
        return this.f21902e;
    }

    @NotNull
    public final String getInstanceId() {
        return this.f21899b;
    }

    @NotNull
    public final zp getProviderName$mediationsdk_release() {
        return this.f21903f;
    }

    @NotNull
    public final AdSize getSize() {
        return this.f21901d;
    }

    public /* synthetic */ BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, adSize, bundle);
    }
}
