package com.withpersona.sdk2.inquiry.tracking.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "type", "Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;", "buttonName", "", "stepName", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getType", "()Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;", "getButtonName", "()Ljava/lang/String;", "getStepName", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class UiStepButtonEventData implements TrackingEventData {
    private final String buttonName;
    private final TrackingMetadata metadata;
    private final String stepName;
    private final UiStepButtonType type;

    public /* synthetic */ UiStepButtonEventData(UiStepButtonType uiStepButtonType, String str, String str2, TrackingMetadata trackingMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiStepButtonType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : trackingMetadata);
    }

    public static /* synthetic */ UiStepButtonEventData copy$default(UiStepButtonEventData uiStepButtonEventData, UiStepButtonType uiStepButtonType, String str, String str2, TrackingMetadata trackingMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            uiStepButtonType = uiStepButtonEventData.type;
        }
        if ((i & 2) != 0) {
            str = uiStepButtonEventData.buttonName;
        }
        if ((i & 4) != 0) {
            str2 = uiStepButtonEventData.stepName;
        }
        if ((i & 8) != 0) {
            trackingMetadata = uiStepButtonEventData.metadata;
        }
        return uiStepButtonEventData.copy(uiStepButtonType, str, str2, trackingMetadata);
    }

    /* renamed from: component1, reason: from getter */
    public final UiStepButtonType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getButtonName() {
        return this.buttonName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStepName() {
        return this.stepName;
    }

    /* renamed from: component4, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    public final UiStepButtonEventData copy(UiStepButtonType type2, @Json(name = "button_name") String buttonName, @Json(name = "step_name") String stepName, TrackingMetadata metadata) {
        return new UiStepButtonEventData(type2, buttonName, stepName, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiStepButtonEventData)) {
            return false;
        }
        UiStepButtonEventData uiStepButtonEventData = (UiStepButtonEventData) other;
        return this.type == uiStepButtonEventData.type && Intrinsics.areEqual(this.buttonName, uiStepButtonEventData.buttonName) && Intrinsics.areEqual(this.stepName, uiStepButtonEventData.stepName) && Intrinsics.areEqual(this.metadata, uiStepButtonEventData.metadata);
    }

    public final String getButtonName() {
        return this.buttonName;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.model.TrackingEventData
    public TrackingMetadata getMetadata() {
        return this.metadata;
    }

    public final String getStepName() {
        return this.stepName;
    }

    public final UiStepButtonType getType() {
        return this.type;
    }

    public int hashCode() {
        UiStepButtonType uiStepButtonType = this.type;
        int hashCode = (uiStepButtonType == null ? 0 : uiStepButtonType.hashCode()) * 31;
        String str = this.buttonName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.stepName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return hashCode3 + (trackingMetadata != null ? trackingMetadata.hashCode() : 0);
    }

    public String toString() {
        return "UiStepButtonEventData(type=" + this.type + ", buttonName=" + this.buttonName + ", stepName=" + this.stepName + ", metadata=" + this.metadata + ")";
    }

    public UiStepButtonEventData(UiStepButtonType uiStepButtonType, @Json(name = "button_name") String str, @Json(name = "step_name") String str2, TrackingMetadata trackingMetadata) {
        this.type = uiStepButtonType;
        this.buttonName = str;
        this.stepName = str2;
        this.metadata = trackingMetadata;
    }

    public UiStepButtonEventData() {
        this(null, null, null, null, 15, null);
    }
}
