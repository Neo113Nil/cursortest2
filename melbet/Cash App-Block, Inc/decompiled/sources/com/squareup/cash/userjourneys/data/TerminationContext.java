package com.squareup.cash.userjourneys.data;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonClass;
import com.squareup.protos.cash.blockuserjourneys.api.v1.JourneyOutcome;
import com.squareup.protos.cash.blockuserjourneys.api.v1.JourneyTerminationReason;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\r\u0010\u0013\u001a\u00060\u0007j\u0002`\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\b\u0002\u0010\u0006\u001a\u00060\u0007j\u0002`\bHÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/squareup/cash/userjourneys/data/TerminationContext;", "", "outcome", "Lcom/squareup/protos/cash/blockuserjourneys/api/v1/JourneyOutcome;", "terminationReason", "Lcom/squareup/protos/cash/blockuserjourneys/api/v1/JourneyTerminationReason;", "durationRealtime", "", "Lcom/squareup/cash/userjourneys/data/Milliseconds;", "<init>", "(Lcom/squareup/protos/cash/blockuserjourneys/api/v1/JourneyOutcome;Lcom/squareup/protos/cash/blockuserjourneys/api/v1/JourneyTerminationReason;J)V", "getOutcome", "()Lcom/squareup/protos/cash/blockuserjourneys/api/v1/JourneyOutcome;", "getTerminationReason", "()Lcom/squareup/protos/cash/blockuserjourneys/api/v1/JourneyTerminationReason;", "getDurationRealtime", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TerminationContext {
    private final long durationRealtime;
    private final JourneyOutcome outcome;
    private final JourneyTerminationReason terminationReason;

    public TerminationContext(JourneyOutcome journeyOutcome, JourneyTerminationReason journeyTerminationReason, long j) {
        journeyOutcome.getClass();
        this.outcome = journeyOutcome;
        this.terminationReason = journeyTerminationReason;
        this.durationRealtime = j;
    }

    public static /* synthetic */ TerminationContext copy$default(TerminationContext terminationContext, JourneyOutcome journeyOutcome, JourneyTerminationReason journeyTerminationReason, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            journeyOutcome = terminationContext.outcome;
        }
        if ((i & 2) != 0) {
            journeyTerminationReason = terminationContext.terminationReason;
        }
        if ((i & 4) != 0) {
            j = terminationContext.durationRealtime;
        }
        return terminationContext.copy(journeyOutcome, journeyTerminationReason, j);
    }

    /* renamed from: component1, reason: from getter */
    public final JourneyOutcome getOutcome() {
        return this.outcome;
    }

    /* renamed from: component2, reason: from getter */
    public final JourneyTerminationReason getTerminationReason() {
        return this.terminationReason;
    }

    /* renamed from: component3, reason: from getter */
    public final long getDurationRealtime() {
        return this.durationRealtime;
    }

    public final TerminationContext copy(JourneyOutcome outcome, JourneyTerminationReason terminationReason, long durationRealtime) {
        outcome.getClass();
        return new TerminationContext(outcome, terminationReason, durationRealtime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TerminationContext)) {
            return false;
        }
        TerminationContext terminationContext = (TerminationContext) other;
        return this.outcome == terminationContext.outcome && this.terminationReason == terminationContext.terminationReason && this.durationRealtime == terminationContext.durationRealtime;
    }

    public final long getDurationRealtime() {
        return this.durationRealtime;
    }

    public final JourneyOutcome getOutcome() {
        return this.outcome;
    }

    public final JourneyTerminationReason getTerminationReason() {
        return this.terminationReason;
    }

    public int hashCode() {
        int hashCode = this.outcome.hashCode() * 31;
        JourneyTerminationReason journeyTerminationReason = this.terminationReason;
        return Long.hashCode(this.durationRealtime) + ((hashCode + (journeyTerminationReason == null ? 0 : journeyTerminationReason.hashCode())) * 31);
    }

    public String toString() {
        JourneyOutcome journeyOutcome = this.outcome;
        JourneyTerminationReason journeyTerminationReason = this.terminationReason;
        long j = this.durationRealtime;
        StringBuilder sb = new StringBuilder("TerminationContext(outcome=");
        sb.append(journeyOutcome);
        sb.append(", terminationReason=");
        sb.append(journeyTerminationReason);
        sb.append(", durationRealtime=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(j, ")", sb);
    }

    public /* synthetic */ TerminationContext(JourneyOutcome journeyOutcome, JourneyTerminationReason journeyTerminationReason, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(journeyOutcome, (i & 2) != 0 ? null : journeyTerminationReason, j);
    }
}
