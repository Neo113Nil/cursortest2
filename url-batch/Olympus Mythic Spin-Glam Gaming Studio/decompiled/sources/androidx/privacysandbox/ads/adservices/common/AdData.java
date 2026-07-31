package androidx.privacysandbox.ads.adservices.common;

import android.adservices.common.AdData;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.RequiresExtension;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdData.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0003$%&J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\"\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u000b¨\u0006'"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/adservices/common/AdData;", "convertToAdServices$ads_adservices_release", "()Landroid/adservices/common/AdData;", "convertToAdServices", "Landroid/net/Uri;", "renderUri", "Landroid/net/Uri;", "getRenderUri", "()Landroid/net/Uri;", "metadata", "Ljava/lang/String;", "getMetadata", "", "adCounterKeys", "Ljava/util/Set;", "getAdCounterKeys", "()Ljava/util/Set;", "Landroidx/privacysandbox/ads/adservices/common/AdFilters;", "adFilters", "Landroidx/privacysandbox/ads/adservices/common/AdFilters;", "getAdFilters", "()Landroidx/privacysandbox/ads/adservices/common/AdFilters;", "adRenderId", "getAdRenderId", "Ext10Impl", "Ext4Impl", "Ext8Impl", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes10.dex */
public final class AdData {
    private final Set adCounterKeys;
    private final AdFilters adFilters;
    private final String adRenderId;
    private final String metadata;
    private final Uri renderUri;

    public final Uri getRenderUri() {
        return this.renderUri;
    }

    public final String getMetadata() {
        return this.metadata;
    }

    public final Set getAdCounterKeys() {
        return this.adCounterKeys;
    }

    public final AdFilters getAdFilters() {
        return this.adFilters;
    }

    public final String getAdRenderId() {
        return this.adRenderId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdData)) {
            return false;
        }
        AdData adData = (AdData) other;
        return Intrinsics.areEqual(this.renderUri, adData.renderUri) && Intrinsics.areEqual(this.metadata, adData.metadata) && Intrinsics.areEqual(this.adCounterKeys, adData.adCounterKeys) && Intrinsics.areEqual(this.adFilters, adData.adFilters) && Intrinsics.areEqual(this.adRenderId, adData.adRenderId);
    }

    public int hashCode() {
        int hashCode = ((((this.renderUri.hashCode() * 31) + this.metadata.hashCode()) * 31) + this.adCounterKeys.hashCode()) * 31;
        AdFilters adFilters = this.adFilters;
        int hashCode2 = (hashCode + (adFilters != null ? adFilters.hashCode() : 0)) * 31;
        String str = this.adRenderId;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "AdData: renderUri=" + this.renderUri + ", metadata='" + this.metadata + "', adCounterKeys=" + this.adCounterKeys + ", adFilters=" + this.adFilters + ", adRenderId=" + this.adRenderId;
    }

    public final android.adservices.common.AdData convertToAdServices$ads_adservices_release() {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() >= 10 || adServicesInfo.extServicesVersionS() >= 10) {
            return Ext10Impl.INSTANCE.convertAdData(this);
        }
        if (adServicesInfo.adServicesVersion() >= 8 || adServicesInfo.extServicesVersionS() >= 9) {
            return Ext8Impl.INSTANCE.convertAdData(this);
        }
        return Ext4Impl.INSTANCE.convertAdData(this);
    }

    /* compiled from: AdData.kt */
    @RequiresExtension.Container
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdData$Ext10Impl;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Ext10Impl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: AdData.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdData$Ext10Impl$Companion;", "", "()V", "convertAdData", "Landroid/adservices/common/AdData;", "adData", "Landroidx/privacysandbox/ads/adservices/common/AdData;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final android.adservices.common.AdData convertAdData(AdData adData) {
                AdData.Builder metadata;
                AdData.Builder renderUri;
                AdData.Builder adCounterKeys;
                AdData.Builder adFilters;
                AdData.Builder adRenderId;
                android.adservices.common.AdData build;
                Intrinsics.checkNotNullParameter(adData, "adData");
                metadata = AdData$Ext10Impl$Companion$$ExternalSyntheticApiModelOutline0.m().setMetadata(adData.getMetadata());
                renderUri = metadata.setRenderUri(adData.getRenderUri());
                adCounterKeys = renderUri.setAdCounterKeys(adData.getAdCounterKeys());
                AdFilters adFilters2 = adData.getAdFilters();
                adFilters = adCounterKeys.setAdFilters(adFilters2 != null ? adFilters2.convertToAdServices$ads_adservices_release() : null);
                adRenderId = adFilters.setAdRenderId(adData.getAdRenderId());
                build = adRenderId.build();
                Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …                 .build()");
                return build;
            }
        }
    }

    /* compiled from: AdData.kt */
    @RequiresExtension.Container
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdData$Ext8Impl;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Ext8Impl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: AdData.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdData$Ext8Impl$Companion;", "", "()V", "convertAdData", "Landroid/adservices/common/AdData;", "adData", "Landroidx/privacysandbox/ads/adservices/common/AdData;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final android.adservices.common.AdData convertAdData(AdData adData) {
                AdData.Builder metadata;
                AdData.Builder renderUri;
                AdData.Builder adCounterKeys;
                AdData.Builder adFilters;
                android.adservices.common.AdData build;
                Intrinsics.checkNotNullParameter(adData, "adData");
                if (adData.getAdRenderId() != null) {
                    Log.w("AdData", "adRenderId is ignored. Min version to use adRenderId is API 31 ext 10");
                }
                metadata = AdData$Ext10Impl$Companion$$ExternalSyntheticApiModelOutline0.m().setMetadata(adData.getMetadata());
                renderUri = metadata.setRenderUri(adData.getRenderUri());
                adCounterKeys = renderUri.setAdCounterKeys(adData.getAdCounterKeys());
                AdFilters adFilters2 = adData.getAdFilters();
                adFilters = adCounterKeys.setAdFilters(adFilters2 != null ? adFilters2.convertToAdServices$ads_adservices_release() : null);
                build = adFilters.build();
                Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …                 .build()");
                return build;
            }
        }
    }

    /* compiled from: AdData.kt */
    @RequiresExtension.Container
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdData$Ext4Impl;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Ext4Impl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: AdData.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdData$Ext4Impl$Companion;", "", "()V", "convertAdData", "Landroid/adservices/common/AdData;", "adData", "Landroidx/privacysandbox/ads/adservices/common/AdData;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final android.adservices.common.AdData convertAdData(AdData adData) {
                AdData.Builder metadata;
                AdData.Builder renderUri;
                android.adservices.common.AdData build;
                Intrinsics.checkNotNullParameter(adData, "adData");
                if (!adData.getAdCounterKeys().isEmpty()) {
                    Log.w("AdData", "adCounterKeys is ignored. Min version to use adCounterKeys is API 33 ext 8 or API 31/32 ext 9");
                }
                if (adData.getAdFilters() != null) {
                    Log.w("AdData", "adFilters is ignored. Min version to use adFilters is API 33 ext 8 or API 31/32 ext 9");
                }
                if (adData.getAdRenderId() != null) {
                    Log.w("AdData", "adRenderId is ignored. Min version to use adRenderId is API 31 ext 10");
                }
                metadata = AdData$Ext10Impl$Companion$$ExternalSyntheticApiModelOutline0.m().setMetadata(adData.getMetadata());
                renderUri = metadata.setRenderUri(adData.getRenderUri());
                build = renderUri.build();
                Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …                 .build()");
                return build;
            }
        }
    }
}
