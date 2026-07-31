package com.monetization.ads.quality.base.model.configuration;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mobile.ads.impl.C1842c3;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AdQualityVerificationAdConfiguration {

    @Nullable
    private final String adContent;

    @Nullable
    private final String adNetworkCreativeId;

    @Nullable
    private final String adNetworkUnitId;

    @NotNull
    private final Object adObject;

    @NotNull
    private final AdQualityVerifierAdType adType;

    @NotNull
    private final String adUnitId;

    @Nullable
    private final Map<String, Object> extraData;

    @Nullable
    private final String mediationId;

    @NotNull
    private final AdQualityVerifiableNetwork verifiableAdNetwork;

    public AdQualityVerificationAdConfiguration(@NotNull AdQualityVerifiableNetwork verifiableAdNetwork, @NotNull String adUnitId, @NotNull Object adObject, @NotNull AdQualityVerifierAdType adType, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(verifiableAdNetwork, "verifiableAdNetwork");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.verifiableAdNetwork = verifiableAdNetwork;
        this.adUnitId = adUnitId;
        this.adObject = adObject;
        this.adType = adType;
        this.adContent = str;
        this.adNetworkUnitId = str2;
        this.mediationId = str3;
        this.adNetworkCreativeId = str4;
        this.extraData = map;
    }

    public static /* synthetic */ AdQualityVerificationAdConfiguration copy$default(AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration, AdQualityVerifiableNetwork adQualityVerifiableNetwork, String str, Object obj, AdQualityVerifierAdType adQualityVerifierAdType, String str2, String str3, String str4, String str5, Map map, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            adQualityVerifiableNetwork = adQualityVerificationAdConfiguration.verifiableAdNetwork;
        }
        if ((i4 & 2) != 0) {
            str = adQualityVerificationAdConfiguration.adUnitId;
        }
        if ((i4 & 4) != 0) {
            obj = adQualityVerificationAdConfiguration.adObject;
        }
        if ((i4 & 8) != 0) {
            adQualityVerifierAdType = adQualityVerificationAdConfiguration.adType;
        }
        if ((i4 & 16) != 0) {
            str2 = adQualityVerificationAdConfiguration.adContent;
        }
        if ((i4 & 32) != 0) {
            str3 = adQualityVerificationAdConfiguration.adNetworkUnitId;
        }
        if ((i4 & 64) != 0) {
            str4 = adQualityVerificationAdConfiguration.mediationId;
        }
        if ((i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str5 = adQualityVerificationAdConfiguration.adNetworkCreativeId;
        }
        if ((i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
            map = adQualityVerificationAdConfiguration.extraData;
        }
        String str6 = str5;
        Map map2 = map;
        String str7 = str3;
        String str8 = str4;
        String str9 = str2;
        Object obj3 = obj;
        return adQualityVerificationAdConfiguration.copy(adQualityVerifiableNetwork, str, obj3, adQualityVerifierAdType, str9, str7, str8, str6, map2);
    }

    @NotNull
    public final AdQualityVerifiableNetwork component1() {
        return this.verifiableAdNetwork;
    }

    @NotNull
    public final String component2() {
        return this.adUnitId;
    }

    @NotNull
    public final Object component3() {
        return this.adObject;
    }

    @NotNull
    public final AdQualityVerifierAdType component4() {
        return this.adType;
    }

    @Nullable
    public final String component5() {
        return this.adContent;
    }

    @Nullable
    public final String component6() {
        return this.adNetworkUnitId;
    }

    @Nullable
    public final String component7() {
        return this.mediationId;
    }

    @Nullable
    public final String component8() {
        return this.adNetworkCreativeId;
    }

    @Nullable
    public final Map<String, Object> component9() {
        return this.extraData;
    }

    @NotNull
    public final AdQualityVerificationAdConfiguration copy(@NotNull AdQualityVerifiableNetwork verifiableAdNetwork, @NotNull String adUnitId, @NotNull Object adObject, @NotNull AdQualityVerifierAdType adType, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(verifiableAdNetwork, "verifiableAdNetwork");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(adType, "adType");
        return new AdQualityVerificationAdConfiguration(verifiableAdNetwork, adUnitId, adObject, adType, str, str2, str3, str4, map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdQualityVerificationAdConfiguration)) {
            return false;
        }
        AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration = (AdQualityVerificationAdConfiguration) obj;
        return this.verifiableAdNetwork == adQualityVerificationAdConfiguration.verifiableAdNetwork && Intrinsics.areEqual(this.adUnitId, adQualityVerificationAdConfiguration.adUnitId) && Intrinsics.areEqual(this.adObject, adQualityVerificationAdConfiguration.adObject) && this.adType == adQualityVerificationAdConfiguration.adType && Intrinsics.areEqual(this.adContent, adQualityVerificationAdConfiguration.adContent) && Intrinsics.areEqual(this.adNetworkUnitId, adQualityVerificationAdConfiguration.adNetworkUnitId) && Intrinsics.areEqual(this.mediationId, adQualityVerificationAdConfiguration.mediationId) && Intrinsics.areEqual(this.adNetworkCreativeId, adQualityVerificationAdConfiguration.adNetworkCreativeId) && Intrinsics.areEqual(this.extraData, adQualityVerificationAdConfiguration.extraData);
    }

    @Nullable
    public final String getAdContent() {
        return this.adContent;
    }

    @Nullable
    public final String getAdNetworkCreativeId() {
        return this.adNetworkCreativeId;
    }

    @Nullable
    public final String getAdNetworkUnitId() {
        return this.adNetworkUnitId;
    }

    @NotNull
    public final Object getAdObject() {
        return this.adObject;
    }

    @NotNull
    public final AdQualityVerifierAdType getAdType() {
        return this.adType;
    }

    @NotNull
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @Nullable
    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    @Nullable
    public final String getMediationId() {
        return this.mediationId;
    }

    @NotNull
    public final AdQualityVerifiableNetwork getVerifiableAdNetwork() {
        return this.verifiableAdNetwork;
    }

    public int hashCode() {
        int hashCode = (this.adType.hashCode() + ((this.adObject.hashCode() + C1842c3.a(this.adUnitId, this.verifiableAdNetwork.hashCode() * 31, 31)) * 31)) * 31;
        String str = this.adContent;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.adNetworkUnitId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mediationId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.adNetworkCreativeId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, Object> map = this.extraData;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdQualityVerificationAdConfiguration(verifiableAdNetwork=" + this.verifiableAdNetwork + ", adUnitId=" + this.adUnitId + ", adObject=" + this.adObject + ", adType=" + this.adType + ", adContent=" + this.adContent + ", adNetworkUnitId=" + this.adNetworkUnitId + ", mediationId=" + this.mediationId + ", adNetworkCreativeId=" + this.adNetworkCreativeId + ", extraData=" + this.extraData + ")";
    }

    public /* synthetic */ AdQualityVerificationAdConfiguration(AdQualityVerifiableNetwork adQualityVerifiableNetwork, String str, Object obj, AdQualityVerifierAdType adQualityVerifierAdType, String str2, String str3, String str4, String str5, Map map, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(adQualityVerifiableNetwork, str, obj, adQualityVerifierAdType, (i4 & 16) != 0 ? null : str2, (i4 & 32) != 0 ? null : str3, (i4 & 64) != 0 ? null : str4, (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str5, (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : map);
    }
}
