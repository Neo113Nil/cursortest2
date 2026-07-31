package com.monetization.ads.quality.base.model.configuration;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AdQualityVerifierAdapterConfiguration {

    @NotNull
    private final String apiKey;
    private final boolean debug;
    private final long verificationTimeoutInSec;

    public AdQualityVerifierAdapterConfiguration(@NotNull String apiKey, long j4, boolean z4) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.apiKey = apiKey;
        this.verificationTimeoutInSec = j4;
        this.debug = z4;
    }

    public static /* synthetic */ AdQualityVerifierAdapterConfiguration copy$default(AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration, String str, long j4, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = adQualityVerifierAdapterConfiguration.apiKey;
        }
        if ((i4 & 2) != 0) {
            j4 = adQualityVerifierAdapterConfiguration.verificationTimeoutInSec;
        }
        if ((i4 & 4) != 0) {
            z4 = adQualityVerifierAdapterConfiguration.debug;
        }
        return adQualityVerifierAdapterConfiguration.copy(str, j4, z4);
    }

    @NotNull
    public final String component1() {
        return this.apiKey;
    }

    public final long component2() {
        return this.verificationTimeoutInSec;
    }

    public final boolean component3() {
        return this.debug;
    }

    @NotNull
    public final AdQualityVerifierAdapterConfiguration copy(@NotNull String apiKey, long j4, boolean z4) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        return new AdQualityVerifierAdapterConfiguration(apiKey, j4, z4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdQualityVerifierAdapterConfiguration)) {
            return false;
        }
        AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration = (AdQualityVerifierAdapterConfiguration) obj;
        return Intrinsics.areEqual(this.apiKey, adQualityVerifierAdapterConfiguration.apiKey) && this.verificationTimeoutInSec == adQualityVerifierAdapterConfiguration.verificationTimeoutInSec && this.debug == adQualityVerifierAdapterConfiguration.debug;
    }

    @NotNull
    public final String getApiKey() {
        return this.apiKey;
    }

    public final boolean getDebug() {
        return this.debug;
    }

    public final long getVerificationTimeoutInSec() {
        return this.verificationTimeoutInSec;
    }

    public int hashCode() {
        return Boolean.hashCode(this.debug) + ((Long.hashCode(this.verificationTimeoutInSec) + (this.apiKey.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "AdQualityVerifierAdapterConfiguration(apiKey=" + this.apiKey + ", verificationTimeoutInSec=" + this.verificationTimeoutInSec + ", debug=" + this.debug + ")";
    }

    public /* synthetic */ AdQualityVerifierAdapterConfiguration(String str, long j4, boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j4, (i4 & 4) != 0 ? false : z4);
    }
}
