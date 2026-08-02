package com.withpersona.sdk2.inquiry.tracking.model;

import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingUiEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "pageName", "", "stepName", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getPageName", "()Ljava/lang/String;", "getStepName", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TrackingUiEvent implements TrackingEventData {
    private final TrackingMetadata metadata;
    private final String pageName;
    private final String stepName;

    public TrackingUiEvent(String str, String str2, TrackingMetadata trackingMetadata) {
        this.pageName = str;
        this.stepName = str2;
        this.metadata = trackingMetadata;
    }

    public static /* synthetic */ TrackingUiEvent copy$default(TrackingUiEvent trackingUiEvent, String str, String str2, TrackingMetadata trackingMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trackingUiEvent.pageName;
        }
        if ((i & 2) != 0) {
            str2 = trackingUiEvent.stepName;
        }
        if ((i & 4) != 0) {
            trackingMetadata = trackingUiEvent.metadata;
        }
        return trackingUiEvent.copy(str, str2, trackingMetadata);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPageName() {
        return this.pageName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStepName() {
        return this.stepName;
    }

    /* renamed from: component3, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    public final TrackingUiEvent copy(String pageName, String stepName, TrackingMetadata metadata) {
        return new TrackingUiEvent(pageName, stepName, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackingUiEvent)) {
            return false;
        }
        TrackingUiEvent trackingUiEvent = (TrackingUiEvent) other;
        return Intrinsics.areEqual(this.pageName, trackingUiEvent.pageName) && Intrinsics.areEqual(this.stepName, trackingUiEvent.stepName) && Intrinsics.areEqual(this.metadata, trackingUiEvent.metadata);
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
        String str = this.pageName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stepName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return hashCode2 + (trackingMetadata != null ? trackingMetadata.hashCode() : 0);
    }

    public String toString() {
        String str = this.pageName;
        String str2 = this.stepName;
        TrackingMetadata trackingMetadata = this.metadata;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TrackingUiEvent(pageName=", str, ", stepName=", str2, ", metadata=");
        m.append(trackingMetadata);
        m.append(")");
        return m.toString();
    }

    public /* synthetic */ TrackingUiEvent(String str, String str2, TrackingMetadata trackingMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : trackingMetadata);
    }
}
