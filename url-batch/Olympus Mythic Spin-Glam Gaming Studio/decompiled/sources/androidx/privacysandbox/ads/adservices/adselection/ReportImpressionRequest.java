package androidx.privacysandbox.ads.adservices.adselection;

import android.annotation.SuppressLint;
import androidx.annotation.RequiresExtension;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReportImpressionRequest.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001a\u001bJ\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/adservices/adselection/ReportImpressionRequest;", "convertToAdServices$ads_adservices_release", "()Landroid/adservices/adselection/ReportImpressionRequest;", "convertToAdServices", "", "adSelectionId", "J", "getAdSelectionId", "()J", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "adSelectionConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "getAdSelectionConfig", "()Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "Ext10Impl", "Ext4Impl", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes12.dex */
public final class ReportImpressionRequest {
    private final AdSelectionConfig adSelectionConfig;
    private final long adSelectionId;

    public final AdSelectionConfig getAdSelectionConfig() {
        return this.adSelectionConfig;
    }

    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportImpressionRequest)) {
            return false;
        }
        ReportImpressionRequest reportImpressionRequest = (ReportImpressionRequest) other;
        return this.adSelectionId == reportImpressionRequest.adSelectionId && Intrinsics.areEqual(this.adSelectionConfig, reportImpressionRequest.adSelectionConfig);
    }

    public int hashCode() {
        return (Long.hashCode(this.adSelectionId) * 31) + this.adSelectionConfig.hashCode();
    }

    public String toString() {
        return "ReportImpressionRequest: adSelectionId=" + this.adSelectionId + ", adSelectionConfig=" + this.adSelectionConfig;
    }

    public final android.adservices.adselection.ReportImpressionRequest convertToAdServices$ads_adservices_release() {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() >= 10 || adServicesInfo.extServicesVersionS() >= 10) {
            return Ext10Impl.INSTANCE.convertReportImpressionRequest(this);
        }
        return Ext4Impl.INSTANCE.convertReportImpressionRequest(this);
    }

    /* compiled from: ReportImpressionRequest.kt */
    @RequiresExtension.Container
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest$Ext10Impl;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Ext10Impl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: ReportImpressionRequest.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest$Ext10Impl$Companion;", "", "()V", "convertReportImpressionRequest", "Landroid/adservices/adselection/ReportImpressionRequest;", "request", "Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final android.adservices.adselection.ReportImpressionRequest convertReportImpressionRequest(ReportImpressionRequest request) {
                Intrinsics.checkNotNullParameter(request, "request");
                if (Intrinsics.areEqual(request.getAdSelectionConfig(), AdSelectionConfig.INSTANCE.getEMPTY())) {
                    ReportImpressionRequest$Ext10Impl$Companion$$ExternalSyntheticApiModelOutline2.m();
                    return ReportImpressionRequest$Ext10Impl$Companion$$ExternalSyntheticApiModelOutline0.m(request.getAdSelectionId());
                }
                ReportImpressionRequest$Ext10Impl$Companion$$ExternalSyntheticApiModelOutline2.m();
                return ReportImpressionRequest$Ext10Impl$Companion$$ExternalSyntheticApiModelOutline1.m(request.getAdSelectionId(), request.getAdSelectionConfig().convertToAdServices$ads_adservices_release());
            }
        }
    }

    /* compiled from: ReportImpressionRequest.kt */
    @RequiresExtension.Container
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest$Ext4Impl;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Ext4Impl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: ReportImpressionRequest.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest$Ext4Impl$Companion;", "", "()V", "convertReportImpressionRequest", "Landroid/adservices/adselection/ReportImpressionRequest;", "request", "Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final android.adservices.adselection.ReportImpressionRequest convertReportImpressionRequest(ReportImpressionRequest request) {
                Intrinsics.checkNotNullParameter(request, "request");
                if (Intrinsics.areEqual(request.getAdSelectionConfig(), AdSelectionConfig.INSTANCE.getEMPTY())) {
                    throw new UnsupportedOperationException("adSelectionConfig is mandatory forAPI versions lower than ext 10");
                }
                ReportImpressionRequest$Ext10Impl$Companion$$ExternalSyntheticApiModelOutline2.m();
                return ReportImpressionRequest$Ext10Impl$Companion$$ExternalSyntheticApiModelOutline1.m(request.getAdSelectionId(), request.getAdSelectionConfig().convertToAdServices$ads_adservices_release());
            }
        }
    }
}
