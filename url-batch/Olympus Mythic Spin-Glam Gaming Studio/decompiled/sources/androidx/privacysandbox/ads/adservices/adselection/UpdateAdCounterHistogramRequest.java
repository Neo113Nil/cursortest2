package androidx.privacysandbox.ads.adservices.adselection;

import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateAdCounterHistogramRequest.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/adservices/adselection/UpdateAdCounterHistogramRequest;", "convertToAdServices$ads_adservices_release", "()Landroid/adservices/adselection/UpdateAdCounterHistogramRequest;", "convertToAdServices", "", "adSelectionId", "J", "getAdSelectionId", "()J", "adEventType", "I", "getAdEventType", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "callerAdTech", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "getCallerAdTech", "()Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalFeatures.Ext8OptIn
/* loaded from: classes14.dex */
public final class UpdateAdCounterHistogramRequest {
    private final int adEventType;
    private final long adSelectionId;
    private final AdTechIdentifier callerAdTech;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateAdCounterHistogramRequest)) {
            return false;
        }
        UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest = (UpdateAdCounterHistogramRequest) other;
        return this.adSelectionId == updateAdCounterHistogramRequest.adSelectionId && this.adEventType == updateAdCounterHistogramRequest.adEventType && Intrinsics.areEqual(this.callerAdTech, updateAdCounterHistogramRequest.callerAdTech);
    }

    public int hashCode() {
        return (((Long.hashCode(this.adSelectionId) * 31) + Integer.hashCode(this.adEventType)) * 31) + this.callerAdTech.hashCode();
    }

    public String toString() {
        String str;
        int i = this.adEventType;
        if (i == 0) {
            str = "AD_EVENT_TYPE_WIN";
        } else if (i == 1) {
            str = "AD_EVENT_TYPE_IMPRESSION";
        } else if (i == 2) {
            str = "AD_EVENT_TYPE_VIEW";
        } else if (i == 3) {
            str = "AD_EVENT_TYPE_CLICK";
        } else {
            str = "Invalid ad event type";
        }
        return "UpdateAdCounterHistogramRequest: adSelectionId=" + this.adSelectionId + ", adEventType=" + str + ", callerAdTech=" + this.callerAdTech;
    }

    public final android.adservices.adselection.UpdateAdCounterHistogramRequest convertToAdServices$ads_adservices_release() {
        android.adservices.adselection.UpdateAdCounterHistogramRequest build;
        UpdateAdCounterHistogramRequest$$ExternalSyntheticApiModelOutline1.m();
        build = UpdateAdCounterHistogramRequest$$ExternalSyntheticApiModelOutline0.m(this.adSelectionId, this.adEventType, this.callerAdTech.convertToAdServices$ads_adservices_release()).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder(\n               …   )\n            .build()");
        return build;
    }
}
