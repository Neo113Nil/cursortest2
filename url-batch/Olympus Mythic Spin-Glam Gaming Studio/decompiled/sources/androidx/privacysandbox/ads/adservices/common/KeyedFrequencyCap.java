package androidx.privacysandbox.ads.adservices.common;

import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KeyedFrequencyCap.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/KeyedFrequencyCap;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/adservices/common/KeyedFrequencyCap;", "convertToAdServices$ads_adservices_release", "()Landroid/adservices/common/KeyedFrequencyCap;", "convertToAdServices", "adCounterKey", "I", "getAdCounterKey", "maxCount", "getMaxCount", "Ljava/time/Duration;", "interval", "Ljava/time/Duration;", "getInterval", "()Ljava/time/Duration;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalFeatures.Ext8OptIn
/* loaded from: classes4.dex */
public final class KeyedFrequencyCap {
    private final int adCounterKey;
    private final Duration interval;
    private final int maxCount;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyedFrequencyCap)) {
            return false;
        }
        KeyedFrequencyCap keyedFrequencyCap = (KeyedFrequencyCap) other;
        return this.adCounterKey == keyedFrequencyCap.adCounterKey && this.maxCount == keyedFrequencyCap.maxCount && Intrinsics.areEqual(this.interval, keyedFrequencyCap.interval);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((Integer.hashCode(this.adCounterKey) * 31) + Integer.hashCode(this.maxCount)) * 31;
        hashCode = this.interval.hashCode();
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "KeyedFrequencyCap: adCounterKey=" + this.adCounterKey + ", maxCount=" + this.maxCount + ", interval=" + this.interval;
    }

    public final android.adservices.common.KeyedFrequencyCap convertToAdServices$ads_adservices_release() {
        android.adservices.common.KeyedFrequencyCap build;
        KeyedFrequencyCap$$ExternalSyntheticApiModelOutline2.m();
        build = KeyedFrequencyCap$$ExternalSyntheticApiModelOutline1.m(this.adCounterKey, this.maxCount, this.interval).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder(adCounterKey, ma…val)\n            .build()");
        return build;
    }
}
