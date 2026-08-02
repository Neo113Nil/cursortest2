package com.withpersona.sdk2.inquiry.tracking.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "selfieCaptureState", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureState;", "captureMethod", "", "pose", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureState;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getSelfieCaptureState", "()Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureState;", "getCaptureMethod", "()Ljava/lang/String;", "getPose", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SelfieCaptureStateEventData implements TrackingEventData {
    private final String captureMethod;
    private final TrackingMetadata metadata;
    private final String pose;
    private final SelfieCaptureState selfieCaptureState;

    public SelfieCaptureStateEventData(@Json(name = "state") SelfieCaptureState selfieCaptureState, @Json(name = "capture_method") String str, @Json(name = "pose") String str2, TrackingMetadata trackingMetadata) {
        selfieCaptureState.getClass();
        this.selfieCaptureState = selfieCaptureState;
        this.captureMethod = str;
        this.pose = str2;
        this.metadata = trackingMetadata;
    }

    public static /* synthetic */ SelfieCaptureStateEventData copy$default(SelfieCaptureStateEventData selfieCaptureStateEventData, SelfieCaptureState selfieCaptureState, String str, String str2, TrackingMetadata trackingMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            selfieCaptureState = selfieCaptureStateEventData.selfieCaptureState;
        }
        if ((i & 2) != 0) {
            str = selfieCaptureStateEventData.captureMethod;
        }
        if ((i & 4) != 0) {
            str2 = selfieCaptureStateEventData.pose;
        }
        if ((i & 8) != 0) {
            trackingMetadata = selfieCaptureStateEventData.metadata;
        }
        return selfieCaptureStateEventData.copy(selfieCaptureState, str, str2, trackingMetadata);
    }

    /* renamed from: component1, reason: from getter */
    public final SelfieCaptureState getSelfieCaptureState() {
        return this.selfieCaptureState;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCaptureMethod() {
        return this.captureMethod;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPose() {
        return this.pose;
    }

    /* renamed from: component4, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    public final SelfieCaptureStateEventData copy(@Json(name = "state") SelfieCaptureState selfieCaptureState, @Json(name = "capture_method") String captureMethod, @Json(name = "pose") String pose, TrackingMetadata metadata) {
        selfieCaptureState.getClass();
        return new SelfieCaptureStateEventData(selfieCaptureState, captureMethod, pose, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfieCaptureStateEventData)) {
            return false;
        }
        SelfieCaptureStateEventData selfieCaptureStateEventData = (SelfieCaptureStateEventData) other;
        return this.selfieCaptureState == selfieCaptureStateEventData.selfieCaptureState && Intrinsics.areEqual(this.captureMethod, selfieCaptureStateEventData.captureMethod) && Intrinsics.areEqual(this.pose, selfieCaptureStateEventData.pose) && Intrinsics.areEqual(this.metadata, selfieCaptureStateEventData.metadata);
    }

    public final String getCaptureMethod() {
        return this.captureMethod;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.model.TrackingEventData
    public TrackingMetadata getMetadata() {
        return this.metadata;
    }

    public final String getPose() {
        return this.pose;
    }

    public final SelfieCaptureState getSelfieCaptureState() {
        return this.selfieCaptureState;
    }

    public int hashCode() {
        int hashCode = this.selfieCaptureState.hashCode() * 31;
        String str = this.captureMethod;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pose;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return hashCode3 + (trackingMetadata != null ? trackingMetadata.hashCode() : 0);
    }

    public String toString() {
        return "SelfieCaptureStateEventData(selfieCaptureState=" + this.selfieCaptureState + ", captureMethod=" + this.captureMethod + ", pose=" + this.pose + ", metadata=" + this.metadata + ")";
    }

    public /* synthetic */ SelfieCaptureStateEventData(SelfieCaptureState selfieCaptureState, String str, String str2, TrackingMetadata trackingMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(selfieCaptureState, str, str2, (i & 8) != 0 ? null : trackingMetadata);
    }
}
