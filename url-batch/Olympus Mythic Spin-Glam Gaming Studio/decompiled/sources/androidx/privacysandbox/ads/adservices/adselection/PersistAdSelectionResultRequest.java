package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.adselection.PersistAdSelectionResultRequest;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersistAdSelectionResultRequest.kt */
@ExperimentalFeatures.Ext10OptIn
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/adservices/adselection/PersistAdSelectionResultRequest;", "convertToAdServices$ads_adservices_release", "()Landroid/adservices/adselection/PersistAdSelectionResultRequest;", "convertToAdServices", "", "adSelectionId", "J", "getAdSelectionId", "()J", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "seller", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "getSeller", "()Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "", "adSelectionResult", "[B", "getAdSelectionResult", "()[B", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PersistAdSelectionResultRequest {
    private final long adSelectionId;
    private final byte[] adSelectionResult;
    private final AdTechIdentifier seller;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersistAdSelectionResultRequest)) {
            return false;
        }
        PersistAdSelectionResultRequest persistAdSelectionResultRequest = (PersistAdSelectionResultRequest) other;
        return this.adSelectionId == persistAdSelectionResultRequest.adSelectionId && Intrinsics.areEqual(this.seller, persistAdSelectionResultRequest.seller) && Arrays.equals(this.adSelectionResult, persistAdSelectionResultRequest.adSelectionResult);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.adSelectionId) * 31;
        AdTechIdentifier adTechIdentifier = this.seller;
        int hashCode2 = (hashCode + (adTechIdentifier != null ? adTechIdentifier.hashCode() : 0)) * 31;
        byte[] bArr = this.adSelectionResult;
        return hashCode2 + (bArr != null ? bArr.hashCode() : 0);
    }

    public String toString() {
        return "PersistAdSelectionResultRequest: adSelectionId=" + this.adSelectionId + ", seller=" + this.seller + ", adSelectionResult=" + this.adSelectionResult;
    }

    public final android.adservices.adselection.PersistAdSelectionResultRequest convertToAdServices$ads_adservices_release() {
        PersistAdSelectionResultRequest.Builder adSelectionId;
        PersistAdSelectionResultRequest.Builder seller;
        PersistAdSelectionResultRequest.Builder adSelectionResult;
        android.adservices.adselection.PersistAdSelectionResultRequest build;
        adSelectionId = PersistAdSelectionResultRequest$$ExternalSyntheticApiModelOutline0.m().setAdSelectionId(this.adSelectionId);
        AdTechIdentifier adTechIdentifier = this.seller;
        seller = adSelectionId.setSeller(adTechIdentifier != null ? adTechIdentifier.convertToAdServices$ads_adservices_release() : null);
        adSelectionResult = seller.setAdSelectionResult(this.adSelectionResult);
        build = adSelectionResult.build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…ult)\n            .build()");
        return build;
    }
}
