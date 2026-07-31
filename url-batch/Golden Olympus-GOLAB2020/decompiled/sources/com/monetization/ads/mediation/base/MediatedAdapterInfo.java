package com.monetization.ads.mediation.base;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class MediatedAdapterInfo {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f20737a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f20738b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f20739c;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private String f20740a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private String f20741b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private String f20742c;

        @NotNull
        public final MediatedAdapterInfo build() {
            return new MediatedAdapterInfo(this.f20740a, this.f20741b, this.f20742c, null);
        }

        @NotNull
        public final Builder setAdapterVersion(@NotNull String adapterVersion) {
            Intrinsics.checkNotNullParameter(adapterVersion, "adapterVersion");
            this.f20740a = adapterVersion;
            return this;
        }

        @NotNull
        public final Builder setNetworkName(@NotNull String networkName) {
            Intrinsics.checkNotNullParameter(networkName, "networkName");
            this.f20741b = networkName;
            return this;
        }

        @NotNull
        public final Builder setNetworkSdkVersion(@NotNull String networkSdkVersion) {
            Intrinsics.checkNotNullParameter(networkSdkVersion, "networkSdkVersion");
            this.f20742c = networkSdkVersion;
            return this;
        }
    }

    public /* synthetic */ MediatedAdapterInfo(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3);
    }

    @Nullable
    public final String getAdapterVersion() {
        return this.f20737a;
    }

    @Nullable
    public final String getNetworkName() {
        return this.f20738b;
    }

    @Nullable
    public final String getNetworkSdkVersion() {
        return this.f20739c;
    }

    private MediatedAdapterInfo(String str, String str2, String str3) {
        this.f20737a = str;
        this.f20738b = str2;
        this.f20739c = str3;
    }
}
