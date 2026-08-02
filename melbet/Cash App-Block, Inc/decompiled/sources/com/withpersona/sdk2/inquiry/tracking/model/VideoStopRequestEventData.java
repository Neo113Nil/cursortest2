package com.withpersona.sdk2.inquiry.tracking.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopRequestEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "stepName", "", "pageName", "captureMethod", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getStepName", "()Ljava/lang/String;", "getPageName", "getCaptureMethod", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class VideoStopRequestEventData implements TrackingEventData {
    private final String captureMethod;
    private final TrackingMetadata metadata;
    private final String pageName;
    private final String stepName;

    public /* synthetic */ VideoStopRequestEventData(String str, String str2, String str3, TrackingMetadata trackingMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : trackingMetadata);
    }

    public static /* synthetic */ VideoStopRequestEventData copy$default(VideoStopRequestEventData videoStopRequestEventData, String str, String str2, String str3, TrackingMetadata trackingMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoStopRequestEventData.stepName;
        }
        if ((i & 2) != 0) {
            str2 = videoStopRequestEventData.pageName;
        }
        if ((i & 4) != 0) {
            str3 = videoStopRequestEventData.captureMethod;
        }
        if ((i & 8) != 0) {
            trackingMetadata = videoStopRequestEventData.metadata;
        }
        return videoStopRequestEventData.copy(str, str2, str3, trackingMetadata);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStepName() {
        return this.stepName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPageName() {
        return this.pageName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCaptureMethod() {
        return this.captureMethod;
    }

    /* renamed from: component4, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    public final VideoStopRequestEventData copy(@Json(name = "step_name") String stepName, @Json(name = "page_name") String pageName, @Json(name = "capture_method") String captureMethod, TrackingMetadata metadata) {
        return new VideoStopRequestEventData(stepName, pageName, captureMethod, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoStopRequestEventData)) {
            return false;
        }
        VideoStopRequestEventData videoStopRequestEventData = (VideoStopRequestEventData) other;
        return Intrinsics.areEqual(this.stepName, videoStopRequestEventData.stepName) && Intrinsics.areEqual(this.pageName, videoStopRequestEventData.pageName) && Intrinsics.areEqual(this.captureMethod, videoStopRequestEventData.captureMethod) && Intrinsics.areEqual(this.metadata, videoStopRequestEventData.metadata);
    }

    public final String getCaptureMethod() {
        return this.captureMethod;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.model.TrackingEventData
    public TrackingMetadata getMetadata() {
        return this.metadata;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final String getStepName() {
        return this.stepName;
    }

    public int hashCode() {
        String str = this.stepName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pageName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.captureMethod;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return hashCode3 + (trackingMetadata != null ? trackingMetadata.hashCode() : 0);
    }

    public String toString() {
        String str = this.stepName;
        String str2 = this.pageName;
        String str3 = this.captureMethod;
        TrackingMetadata trackingMetadata = this.metadata;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("VideoStopRequestEventData(stepName=", str, ", pageName=", str2, ", captureMethod=");
        m.append(str3);
        m.append(", metadata=");
        m.append(trackingMetadata);
        m.append(")");
        return m.toString();
    }

    public VideoStopRequestEventData(@Json(name = "step_name") String str, @Json(name = "page_name") String str2, @Json(name = "capture_method") String str3, TrackingMetadata trackingMetadata) {
        this.stepName = str;
        this.pageName = str2;
        this.captureMethod = str3;
        this.metadata = trackingMetadata;
    }
}
