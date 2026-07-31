package androidx.privacysandbox.ads.adservices.adselection;

import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetAdSelectionDataOutcome.kt */
@ExperimentalFeatures.Ext10OptIn
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataOutcome;", "", "", "adSelectionId", "", "adSelectionData", "<init>", "(J[B)V", "Landroid/adservices/adselection/GetAdSelectionDataOutcome;", "response", "(Landroid/adservices/adselection/GetAdSelectionDataOutcome;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getAdSelectionId", "()J", "[B", "getAdSelectionData", "()[B", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetAdSelectionDataOutcome {
    private final byte[] adSelectionData;
    private final long adSelectionId;

    public GetAdSelectionDataOutcome(long j, byte[] bArr) {
        this.adSelectionId = j;
        this.adSelectionData = bArr;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetAdSelectionDataOutcome)) {
            return false;
        }
        GetAdSelectionDataOutcome getAdSelectionDataOutcome = (GetAdSelectionDataOutcome) other;
        return this.adSelectionId == getAdSelectionDataOutcome.adSelectionId && Arrays.equals(this.adSelectionData, getAdSelectionDataOutcome.adSelectionData);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.adSelectionId) * 31;
        byte[] bArr = this.adSelectionData;
        return hashCode + (bArr != null ? bArr.hashCode() : 0);
    }

    public String toString() {
        return "GetAdSelectionDataOutcome: adSelectionId=" + this.adSelectionId + ", adSelectionData=" + this.adSelectionData;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GetAdSelectionDataOutcome(android.adservices.adselection.GetAdSelectionDataOutcome response) {
        this(r0, r3);
        long adSelectionId;
        byte[] adSelectionData;
        Intrinsics.checkNotNullParameter(response, "response");
        adSelectionId = response.getAdSelectionId();
        adSelectionData = response.getAdSelectionData();
    }
}
