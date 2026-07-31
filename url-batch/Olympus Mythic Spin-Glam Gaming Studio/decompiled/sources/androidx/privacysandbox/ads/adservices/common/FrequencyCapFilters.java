package androidx.privacysandbox.ads.adservices.common;

import android.adservices.common.FrequencyCapFilters;
import androidx.annotation.RestrictTo;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FrequencyCapFilters.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fJ\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0006\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018¨\u0006!"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/FrequencyCapFilters;", "", "", "Landroidx/privacysandbox/ads/adservices/common/KeyedFrequencyCap;", "", "Landroid/adservices/common/KeyedFrequencyCap;", "convertToAdServices", "(Ljava/util/List;)Ljava/util/List;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/adservices/common/FrequencyCapFilters;", "convertToAdServices$ads_adservices_release", "()Landroid/adservices/common/FrequencyCapFilters;", "keyedFrequencyCapsForWinEvents", "Ljava/util/List;", "getKeyedFrequencyCapsForWinEvents", "()Ljava/util/List;", "keyedFrequencyCapsForImpressionEvents", "getKeyedFrequencyCapsForImpressionEvents", "keyedFrequencyCapsForViewEvents", "getKeyedFrequencyCapsForViewEvents", "keyedFrequencyCapsForClickEvents", "getKeyedFrequencyCapsForClickEvents", "Companion", "AdEventType", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalFeatures.Ext8OptIn
/* loaded from: classes3.dex */
public final class FrequencyCapFilters {
    private final List keyedFrequencyCapsForClickEvents;
    private final List keyedFrequencyCapsForImpressionEvents;
    private final List keyedFrequencyCapsForViewEvents;
    private final List keyedFrequencyCapsForWinEvents;

    /* compiled from: FrequencyCapFilters.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/FrequencyCapFilters$AdEventType;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface AdEventType {
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrequencyCapFilters)) {
            return false;
        }
        FrequencyCapFilters frequencyCapFilters = (FrequencyCapFilters) other;
        return Intrinsics.areEqual(this.keyedFrequencyCapsForWinEvents, frequencyCapFilters.keyedFrequencyCapsForWinEvents) && Intrinsics.areEqual(this.keyedFrequencyCapsForImpressionEvents, frequencyCapFilters.keyedFrequencyCapsForImpressionEvents) && Intrinsics.areEqual(this.keyedFrequencyCapsForViewEvents, frequencyCapFilters.keyedFrequencyCapsForViewEvents) && Intrinsics.areEqual(this.keyedFrequencyCapsForClickEvents, frequencyCapFilters.keyedFrequencyCapsForClickEvents);
    }

    public int hashCode() {
        return (((((this.keyedFrequencyCapsForWinEvents.hashCode() * 31) + this.keyedFrequencyCapsForImpressionEvents.hashCode()) * 31) + this.keyedFrequencyCapsForViewEvents.hashCode()) * 31) + this.keyedFrequencyCapsForClickEvents.hashCode();
    }

    public String toString() {
        return "FrequencyCapFilters: keyedFrequencyCapsForWinEvents=" + this.keyedFrequencyCapsForWinEvents + ", keyedFrequencyCapsForImpressionEvents=" + this.keyedFrequencyCapsForImpressionEvents + ", keyedFrequencyCapsForViewEvents=" + this.keyedFrequencyCapsForViewEvents + ", keyedFrequencyCapsForClickEvents=" + this.keyedFrequencyCapsForClickEvents;
    }

    public final android.adservices.common.FrequencyCapFilters convertToAdServices$ads_adservices_release() {
        FrequencyCapFilters.Builder keyedFrequencyCapsForWinEvents;
        FrequencyCapFilters.Builder keyedFrequencyCapsForImpressionEvents;
        FrequencyCapFilters.Builder keyedFrequencyCapsForViewEvents;
        FrequencyCapFilters.Builder keyedFrequencyCapsForClickEvents;
        android.adservices.common.FrequencyCapFilters build;
        keyedFrequencyCapsForWinEvents = FrequencyCapFilters$$ExternalSyntheticApiModelOutline0.m().setKeyedFrequencyCapsForWinEvents(convertToAdServices(this.keyedFrequencyCapsForWinEvents));
        keyedFrequencyCapsForImpressionEvents = keyedFrequencyCapsForWinEvents.setKeyedFrequencyCapsForImpressionEvents(convertToAdServices(this.keyedFrequencyCapsForImpressionEvents));
        keyedFrequencyCapsForViewEvents = keyedFrequencyCapsForImpressionEvents.setKeyedFrequencyCapsForViewEvents(convertToAdServices(this.keyedFrequencyCapsForViewEvents));
        keyedFrequencyCapsForClickEvents = keyedFrequencyCapsForViewEvents.setKeyedFrequencyCapsForClickEvents(convertToAdServices(this.keyedFrequencyCapsForClickEvents));
        build = keyedFrequencyCapsForClickEvents.build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…   )\n            .build()");
        return build;
    }

    private final List convertToAdServices(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((KeyedFrequencyCap) it.next()).convertToAdServices$ads_adservices_release());
        }
        return arrayList;
    }
}
