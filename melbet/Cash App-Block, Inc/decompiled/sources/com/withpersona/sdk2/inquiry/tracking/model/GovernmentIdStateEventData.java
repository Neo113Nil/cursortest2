package com.withpersona.sdk2.inquiry.tracking.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "govIdCaptureState", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;", "captureMethod", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getGovIdCaptureState", "()Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;", "getCaptureMethod", "()Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class GovernmentIdStateEventData implements TrackingEventData {
    private final GovIdCaptureMethod captureMethod;
    private final GovIdCaptureState govIdCaptureState;
    private final TrackingMetadata metadata;

    public GovernmentIdStateEventData(@Json(name = "state") GovIdCaptureState govIdCaptureState, @Json(name = "capture_method") GovIdCaptureMethod govIdCaptureMethod, TrackingMetadata trackingMetadata) {
        govIdCaptureState.getClass();
        this.govIdCaptureState = govIdCaptureState;
        this.captureMethod = govIdCaptureMethod;
        this.metadata = trackingMetadata;
    }

    public static /* synthetic */ GovernmentIdStateEventData copy$default(GovernmentIdStateEventData governmentIdStateEventData, GovIdCaptureState govIdCaptureState, GovIdCaptureMethod govIdCaptureMethod, TrackingMetadata trackingMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            govIdCaptureState = governmentIdStateEventData.govIdCaptureState;
        }
        if ((i & 2) != 0) {
            govIdCaptureMethod = governmentIdStateEventData.captureMethod;
        }
        if ((i & 4) != 0) {
            trackingMetadata = governmentIdStateEventData.metadata;
        }
        return governmentIdStateEventData.copy(govIdCaptureState, govIdCaptureMethod, trackingMetadata);
    }

    /* renamed from: component1, reason: from getter */
    public final GovIdCaptureState getGovIdCaptureState() {
        return this.govIdCaptureState;
    }

    /* renamed from: component2, reason: from getter */
    public final GovIdCaptureMethod getCaptureMethod() {
        return this.captureMethod;
    }

    /* renamed from: component3, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    public final GovernmentIdStateEventData copy(@Json(name = "state") GovIdCaptureState govIdCaptureState, @Json(name = "capture_method") GovIdCaptureMethod captureMethod, TrackingMetadata metadata) {
        govIdCaptureState.getClass();
        return new GovernmentIdStateEventData(govIdCaptureState, captureMethod, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdStateEventData)) {
            return false;
        }
        GovernmentIdStateEventData governmentIdStateEventData = (GovernmentIdStateEventData) other;
        return this.govIdCaptureState == governmentIdStateEventData.govIdCaptureState && this.captureMethod == governmentIdStateEventData.captureMethod && Intrinsics.areEqual(this.metadata, governmentIdStateEventData.metadata);
    }

    public final GovIdCaptureMethod getCaptureMethod() {
        return this.captureMethod;
    }

    public final GovIdCaptureState getGovIdCaptureState() {
        return this.govIdCaptureState;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.model.TrackingEventData
    public TrackingMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        int hashCode = this.govIdCaptureState.hashCode() * 31;
        GovIdCaptureMethod govIdCaptureMethod = this.captureMethod;
        int hashCode2 = (hashCode + (govIdCaptureMethod == null ? 0 : govIdCaptureMethod.hashCode())) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return hashCode2 + (trackingMetadata != null ? trackingMetadata.hashCode() : 0);
    }

    public String toString() {
        return "GovernmentIdStateEventData(govIdCaptureState=" + this.govIdCaptureState + ", captureMethod=" + this.captureMethod + ", metadata=" + this.metadata + ")";
    }

    public /* synthetic */ GovernmentIdStateEventData(GovIdCaptureState govIdCaptureState, GovIdCaptureMethod govIdCaptureMethod, TrackingMetadata trackingMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(govIdCaptureState, govIdCaptureMethod, (i & 4) != 0 ? null : trackingMetadata);
    }
}
