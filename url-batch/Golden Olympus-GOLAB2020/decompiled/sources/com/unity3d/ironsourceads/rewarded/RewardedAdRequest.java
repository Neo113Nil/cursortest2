package com.unity3d.ironsourceads.rewarded;

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
public final class RewardedAdRequest {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f21930a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f21931b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final Bundle f21932c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final zp f21933d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f21934e;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f21935a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f21936b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private Bundle f21937c;

        public Builder(@NotNull String instanceId, @NotNull String adm) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(adm, "adm");
            this.f21935a = instanceId;
            this.f21936b = adm;
        }

        @NotNull
        public final RewardedAdRequest build() {
            IronLog.API.info("instanceId: " + this.f21935a);
            return new RewardedAdRequest(this.f21935a, this.f21936b, this.f21937c, null);
        }

        @NotNull
        public final String getAdm() {
            return this.f21936b;
        }

        @NotNull
        public final String getInstanceId() {
            return this.f21935a;
        }

        @NotNull
        public final Builder withExtraParams(@NotNull Bundle extraParams) {
            Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            this.f21937c = extraParams;
            return this;
        }
    }

    private RewardedAdRequest(String str, String str2, Bundle bundle) {
        this.f21930a = str;
        this.f21931b = str2;
        this.f21932c = bundle;
        this.f21933d = new zn(str);
        String b4 = dk.b();
        Intrinsics.checkNotNullExpressionValue(b4, "generateMultipleUniqueInstanceId()");
        this.f21934e = b4;
    }

    @NotNull
    public final String getAdId$mediationsdk_release() {
        return this.f21934e;
    }

    @NotNull
    public final String getAdm() {
        return this.f21931b;
    }

    @Nullable
    public final Bundle getExtraParams() {
        return this.f21932c;
    }

    @NotNull
    public final String getInstanceId() {
        return this.f21930a;
    }

    @NotNull
    public final zp getProviderName$mediationsdk_release() {
        return this.f21933d;
    }

    public /* synthetic */ RewardedAdRequest(String str, String str2, Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bundle);
    }
}
