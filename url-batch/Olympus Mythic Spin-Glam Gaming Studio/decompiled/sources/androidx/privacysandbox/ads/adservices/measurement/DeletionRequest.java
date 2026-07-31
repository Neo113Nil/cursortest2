package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.DeletionRequest;
import androidx.annotation.RequiresApi;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeletionRequest.kt */
@RequiresApi
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002%$J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\u0004R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!¨\u0006&"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;", "", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Landroid/adservices/measurement/DeletionRequest;", "convertToAdServices$ads_adservices_release", "()Landroid/adservices/measurement/DeletionRequest;", "convertToAdServices", "deletionMode", "I", "getDeletionMode", "matchBehavior", "getMatchBehavior", "Ljava/time/Instant;", "start", "Ljava/time/Instant;", "getStart", "()Ljava/time/Instant;", "end", "getEnd", "", "Landroid/net/Uri;", "domainUris", "Ljava/util/List;", "getDomainUris", "()Ljava/util/List;", "originUris", "getOriginUris", "Companion", "Builder", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DeletionRequest {
    private final int deletionMode;
    private final List domainUris;
    private final Instant end;
    private final int matchBehavior;
    private final List originUris;
    private final Instant start;

    /* compiled from: DeletionRequest.kt */
    @RequiresApi
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest$Builder;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((Integer.hashCode(this.deletionMode) * 31) + this.domainUris.hashCode()) * 31) + this.originUris.hashCode()) * 31;
        hashCode = this.start.hashCode();
        int i = (hashCode3 + hashCode) * 31;
        hashCode2 = this.end.hashCode();
        return ((i + hashCode2) * 31) + Integer.hashCode(this.matchBehavior);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeletionRequest)) {
            return false;
        }
        DeletionRequest deletionRequest = (DeletionRequest) other;
        return this.deletionMode == deletionRequest.deletionMode && Intrinsics.areEqual(new HashSet(this.domainUris), new HashSet(deletionRequest.domainUris)) && Intrinsics.areEqual(new HashSet(this.originUris), new HashSet(deletionRequest.originUris)) && Intrinsics.areEqual(this.start, deletionRequest.start) && Intrinsics.areEqual(this.end, deletionRequest.end) && this.matchBehavior == deletionRequest.matchBehavior;
    }

    public String toString() {
        return "DeletionRequest { DeletionMode=" + (this.deletionMode == 0 ? "DELETION_MODE_ALL" : "DELETION_MODE_EXCLUDE_INTERNAL_DATA") + ", MatchBehavior=" + (this.matchBehavior == 0 ? "MATCH_BEHAVIOR_DELETE" : "MATCH_BEHAVIOR_PRESERVE") + ", Start=" + this.start + ", End=" + this.end + ", DomainUris=" + this.domainUris + ", OriginUris=" + this.originUris + " }";
    }

    public final android.adservices.measurement.DeletionRequest convertToAdServices$ads_adservices_release() {
        DeletionRequest.Builder deletionMode;
        DeletionRequest.Builder matchBehavior;
        DeletionRequest.Builder start;
        DeletionRequest.Builder end;
        DeletionRequest.Builder domainUris;
        DeletionRequest.Builder originUris;
        android.adservices.measurement.DeletionRequest build;
        deletionMode = DeletionRequest$$ExternalSyntheticApiModelOutline1.m().setDeletionMode(this.deletionMode);
        matchBehavior = deletionMode.setMatchBehavior(this.matchBehavior);
        start = matchBehavior.setStart(this.start);
        end = start.setEnd(this.end);
        domainUris = end.setDomainUris(this.domainUris);
        originUris = domainUris.setOriginUris(this.originUris);
        build = originUris.build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…ris)\n            .build()");
        return build;
    }
}
