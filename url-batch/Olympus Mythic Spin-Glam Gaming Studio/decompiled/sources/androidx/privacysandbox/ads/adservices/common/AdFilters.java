package androidx.privacysandbox.ads.adservices.common;

import android.adservices.common.AdFilters;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdFilters.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdFilters;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/adservices/common/AdFilters;", "convertToAdServices$ads_adservices_release", "()Landroid/adservices/common/AdFilters;", "convertToAdServices", "Landroidx/privacysandbox/ads/adservices/common/FrequencyCapFilters;", "frequencyCapFilters", "Landroidx/privacysandbox/ads/adservices/common/FrequencyCapFilters;", "getFrequencyCapFilters", "()Landroidx/privacysandbox/ads/adservices/common/FrequencyCapFilters;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalFeatures.Ext8OptIn
/* loaded from: classes12.dex */
public final class AdFilters {
    private final FrequencyCapFilters frequencyCapFilters;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof AdFilters) {
            return Intrinsics.areEqual(this.frequencyCapFilters, ((AdFilters) other).frequencyCapFilters);
        }
        return false;
    }

    public int hashCode() {
        FrequencyCapFilters frequencyCapFilters = this.frequencyCapFilters;
        if (frequencyCapFilters != null) {
            return frequencyCapFilters.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "AdFilters: frequencyCapFilters=" + this.frequencyCapFilters;
    }

    public final android.adservices.common.AdFilters convertToAdServices$ads_adservices_release() {
        AdFilters.Builder frequencyCapFilters;
        android.adservices.common.AdFilters build;
        AdFilters.Builder m = AdFilters$$ExternalSyntheticApiModelOutline0.m();
        FrequencyCapFilters frequencyCapFilters2 = this.frequencyCapFilters;
        frequencyCapFilters = m.setFrequencyCapFilters(frequencyCapFilters2 != null ? frequencyCapFilters2.convertToAdServices$ads_adservices_release() : null);
        build = frequencyCapFilters.build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…s())\n            .build()");
        return build;
    }
}
