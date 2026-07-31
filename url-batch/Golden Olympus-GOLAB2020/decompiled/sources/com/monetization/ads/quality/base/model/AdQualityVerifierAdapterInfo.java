package com.monetization.ads.quality.base.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AdQualityVerifierAdapterInfo {

    @Nullable
    private final String adapterVersion;

    @Nullable
    private final String verifierName;

    @Nullable
    private final String verifierSdkVersion;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private String f20841a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private String f20842b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private String f20843c;

        @NotNull
        public final AdQualityVerifierAdapterInfo build() {
            return new AdQualityVerifierAdapterInfo(this.f20841a, this.f20842b, this.f20843c, null);
        }

        @NotNull
        public final Builder setAdapterVersion(@Nullable String str) {
            this.f20841a = str;
            return this;
        }

        @NotNull
        public final Builder setVerifierName(@Nullable String str) {
            this.f20842b = str;
            return this;
        }

        @NotNull
        public final Builder setVerifierSdkVersion(@Nullable String str) {
            this.f20843c = str;
            return this;
        }
    }

    public /* synthetic */ AdQualityVerifierAdapterInfo(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3);
    }

    @Nullable
    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    @Nullable
    public final String getVerifierName() {
        return this.verifierName;
    }

    @Nullable
    public final String getVerifierSdkVersion() {
        return this.verifierSdkVersion;
    }

    private AdQualityVerifierAdapterInfo(String str, String str2, String str3) {
        this.adapterVersion = str;
        this.verifierName = str2;
        this.verifierSdkVersion = str3;
    }
}
