package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.adselection.GetAdSelectionDataRequest;
import android.net.Uri;
import androidx.annotation.RequiresExtension;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetAdSelectionDataRequest.kt */
@ExperimentalFeatures.Ext10OptIn
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001c\u001dJ\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/adservices/adselection/GetAdSelectionDataRequest;", "convertToAdServices$ads_adservices_release", "()Landroid/adservices/adselection/GetAdSelectionDataRequest;", "convertToAdServices", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "seller", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "getSeller", "()Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "Landroid/net/Uri;", "coordinatorOriginUri", "Landroid/net/Uri;", "getCoordinatorOriginUri", "()Landroid/net/Uri;", "getCoordinatorOriginUri$annotations", "()V", "Ext10Impl", "Ext12Impl", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetAdSelectionDataRequest {
    private final Uri coordinatorOriginUri;
    private final AdTechIdentifier seller;

    public final AdTechIdentifier getSeller() {
        return this.seller;
    }

    public final Uri getCoordinatorOriginUri() {
        return this.coordinatorOriginUri;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetAdSelectionDataRequest)) {
            return false;
        }
        GetAdSelectionDataRequest getAdSelectionDataRequest = (GetAdSelectionDataRequest) other;
        return Intrinsics.areEqual(this.seller, getAdSelectionDataRequest.seller) && Intrinsics.areEqual(this.coordinatorOriginUri, getAdSelectionDataRequest.coordinatorOriginUri);
    }

    public int hashCode() {
        int hashCode = this.seller.hashCode() * 31;
        Uri uri = this.coordinatorOriginUri;
        return hashCode + (uri != null ? uri.hashCode() : 0);
    }

    public String toString() {
        return "GetAdSelectionDataRequest: seller=" + this.seller + ", coordinatorOriginUri=" + this.coordinatorOriginUri;
    }

    public final android.adservices.adselection.GetAdSelectionDataRequest convertToAdServices$ads_adservices_release() {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() >= 12 || adServicesInfo.extServicesVersionS() >= 12) {
            return Ext12Impl.INSTANCE.convertGetAdSelectionDataRequest(this);
        }
        return Ext10Impl.INSTANCE.convertGetAdSelectionDataRequest(this);
    }

    /* compiled from: GetAdSelectionDataRequest.kt */
    @RequiresExtension.Container
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest$Ext12Impl;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Ext12Impl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: GetAdSelectionDataRequest.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest$Ext12Impl$Companion;", "", "()V", "convertGetAdSelectionDataRequest", "Landroid/adservices/adselection/GetAdSelectionDataRequest;", "request", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final android.adservices.adselection.GetAdSelectionDataRequest convertGetAdSelectionDataRequest(GetAdSelectionDataRequest request) {
                GetAdSelectionDataRequest.Builder seller;
                GetAdSelectionDataRequest.Builder coordinatorOriginUri;
                android.adservices.adselection.GetAdSelectionDataRequest build;
                Intrinsics.checkNotNullParameter(request, "request");
                seller = GetAdSelectionDataRequest$Ext10Impl$Companion$$ExternalSyntheticApiModelOutline0.m().setSeller(request.getSeller().convertToAdServices$ads_adservices_release());
                coordinatorOriginUri = seller.setCoordinatorOriginUri(request.getCoordinatorOriginUri());
                build = coordinatorOriginUri.build();
                Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …                 .build()");
                return build;
            }
        }
    }

    /* compiled from: GetAdSelectionDataRequest.kt */
    @RequiresExtension.Container
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest$Ext10Impl;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Ext10Impl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: GetAdSelectionDataRequest.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest$Ext10Impl$Companion;", "", "()V", "convertGetAdSelectionDataRequest", "Landroid/adservices/adselection/GetAdSelectionDataRequest;", "request", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final android.adservices.adselection.GetAdSelectionDataRequest convertGetAdSelectionDataRequest(GetAdSelectionDataRequest request) {
                GetAdSelectionDataRequest.Builder seller;
                android.adservices.adselection.GetAdSelectionDataRequest build;
                Intrinsics.checkNotNullParameter(request, "request");
                seller = GetAdSelectionDataRequest$Ext10Impl$Companion$$ExternalSyntheticApiModelOutline0.m().setSeller(request.getSeller().convertToAdServices$ads_adservices_release());
                build = seller.build();
                Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …                 .build()");
                return build;
            }
        }
    }
}
