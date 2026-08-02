package com.withpersona.sdk2.inquiry.tracking.model;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003JQ\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "stepName", "", "pageName", "captureMethod", "errorName", "errorReason", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getStepName", "()Ljava/lang/String;", "getPageName", "getCaptureMethod", "getErrorName", "getErrorReason", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class VideoErrorEventData implements TrackingEventData {
    private final String captureMethod;
    private final String errorName;
    private final String errorReason;
    private final TrackingMetadata metadata;
    private final String pageName;
    private final String stepName;

    public /* synthetic */ VideoErrorEventData(String str, String str2, String str3, String str4, String str5, TrackingMetadata trackingMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : trackingMetadata);
    }

    public static /* synthetic */ VideoErrorEventData copy$default(VideoErrorEventData videoErrorEventData, String str, String str2, String str3, String str4, String str5, TrackingMetadata trackingMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoErrorEventData.stepName;
        }
        if ((i & 2) != 0) {
            str2 = videoErrorEventData.pageName;
        }
        if ((i & 4) != 0) {
            str3 = videoErrorEventData.captureMethod;
        }
        if ((i & 8) != 0) {
            str4 = videoErrorEventData.errorName;
        }
        if ((i & 16) != 0) {
            str5 = videoErrorEventData.errorReason;
        }
        if ((i & 32) != 0) {
            trackingMetadata = videoErrorEventData.metadata;
        }
        String str6 = str5;
        TrackingMetadata trackingMetadata2 = trackingMetadata;
        return videoErrorEventData.copy(str, str2, str3, str4, str6, trackingMetadata2);
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
    public final String getErrorName() {
        return this.errorName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getErrorReason() {
        return this.errorReason;
    }

    /* renamed from: component6, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    public final VideoErrorEventData copy(@Json(name = "step_name") String stepName, @Json(name = "page_name") String pageName, @Json(name = "capture_method") String captureMethod, @Json(name = "error_name") String errorName, @Json(name = "error_reason") String errorReason, TrackingMetadata metadata) {
        return new VideoErrorEventData(stepName, pageName, captureMethod, errorName, errorReason, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoErrorEventData)) {
            return false;
        }
        VideoErrorEventData videoErrorEventData = (VideoErrorEventData) other;
        return Intrinsics.areEqual(this.stepName, videoErrorEventData.stepName) && Intrinsics.areEqual(this.pageName, videoErrorEventData.pageName) && Intrinsics.areEqual(this.captureMethod, videoErrorEventData.captureMethod) && Intrinsics.areEqual(this.errorName, videoErrorEventData.errorName) && Intrinsics.areEqual(this.errorReason, videoErrorEventData.errorReason) && Intrinsics.areEqual(this.metadata, videoErrorEventData.metadata);
    }

    public final String getCaptureMethod() {
        return this.captureMethod;
    }

    public final String getErrorName() {
        return this.errorName;
    }

    public final String getErrorReason() {
        return this.errorReason;
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
        String str4 = this.errorName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.errorReason;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return hashCode5 + (trackingMetadata != null ? trackingMetadata.hashCode() : 0);
    }

    public String toString() {
        String str = this.stepName;
        String str2 = this.pageName;
        String str3 = this.captureMethod;
        String str4 = this.errorName;
        String str5 = this.errorReason;
        TrackingMetadata trackingMetadata = this.metadata;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("VideoErrorEventData(stepName=", str, ", pageName=", str2, ", captureMethod=");
        Boxes$$ExternalSyntheticOutline1.m(m, str3, ", errorName=", str4, ", errorReason=");
        m.append(str5);
        m.append(", metadata=");
        m.append(trackingMetadata);
        m.append(")");
        return m.toString();
    }

    public VideoErrorEventData(@Json(name = "step_name") String str, @Json(name = "page_name") String str2, @Json(name = "capture_method") String str3, @Json(name = "error_name") String str4, @Json(name = "error_reason") String str5, TrackingMetadata trackingMetadata) {
        this.stepName = str;
        this.pageName = str2;
        this.captureMethod = str3;
        this.errorName = str4;
        this.errorReason = str5;
        this.metadata = trackingMetadata;
    }
}
