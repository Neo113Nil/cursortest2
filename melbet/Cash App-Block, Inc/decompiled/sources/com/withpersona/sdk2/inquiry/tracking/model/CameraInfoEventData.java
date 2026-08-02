package com.withpersona.sdk2.inquiry.tracking.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003Jb\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", AnnotatedPrivateKey.LABEL, "", "position", "size", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraSize;", "frameRate", "", "aspectRatio", "debugData", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugData;", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/CameraSize;Ljava/lang/Double;Ljava/lang/Double;Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugData;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getLabel", "()Ljava/lang/String;", "getPosition", "getSize", "()Lcom/withpersona/sdk2/inquiry/tracking/model/CameraSize;", "getFrameRate", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAspectRatio", "getDebugData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugData;", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/CameraSize;Ljava/lang/Double;Ljava/lang/Double;Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugData;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CameraInfoEventData implements TrackingEventData {
    private final Double aspectRatio;
    private final CameraDebugData debugData;
    private final Double frameRate;
    private final String label;
    private final TrackingMetadata metadata;
    private final String position;
    private final CameraSize size;

    public /* synthetic */ CameraInfoEventData(String str, String str2, CameraSize cameraSize, Double d, Double d2, CameraDebugData cameraDebugData, TrackingMetadata trackingMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : cameraSize, (i & 8) != 0 ? null : d, (i & 16) != 0 ? null : d2, (i & 32) != 0 ? null : cameraDebugData, (i & 64) != 0 ? null : trackingMetadata);
    }

    public static /* synthetic */ CameraInfoEventData copy$default(CameraInfoEventData cameraInfoEventData, String str, String str2, CameraSize cameraSize, Double d, Double d2, CameraDebugData cameraDebugData, TrackingMetadata trackingMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cameraInfoEventData.label;
        }
        if ((i & 2) != 0) {
            str2 = cameraInfoEventData.position;
        }
        if ((i & 4) != 0) {
            cameraSize = cameraInfoEventData.size;
        }
        if ((i & 8) != 0) {
            d = cameraInfoEventData.frameRate;
        }
        if ((i & 16) != 0) {
            d2 = cameraInfoEventData.aspectRatio;
        }
        if ((i & 32) != 0) {
            cameraDebugData = cameraInfoEventData.debugData;
        }
        if ((i & 64) != 0) {
            trackingMetadata = cameraInfoEventData.metadata;
        }
        CameraDebugData cameraDebugData2 = cameraDebugData;
        TrackingMetadata trackingMetadata2 = trackingMetadata;
        Double d3 = d2;
        CameraSize cameraSize2 = cameraSize;
        return cameraInfoEventData.copy(str, str2, cameraSize2, d, d3, cameraDebugData2, trackingMetadata2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPosition() {
        return this.position;
    }

    /* renamed from: component3, reason: from getter */
    public final CameraSize getSize() {
        return this.size;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getFrameRate() {
        return this.frameRate;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getAspectRatio() {
        return this.aspectRatio;
    }

    /* renamed from: component6, reason: from getter */
    public final CameraDebugData getDebugData() {
        return this.debugData;
    }

    /* renamed from: component7, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    public final CameraInfoEventData copy(String label, String position, CameraSize size, @Json(name = "frame_rate") Double frameRate, @Json(name = "aspect_ratio") Double aspectRatio, @Json(name = "debug_data") CameraDebugData debugData, TrackingMetadata metadata) {
        return new CameraInfoEventData(label, position, size, frameRate, aspectRatio, debugData, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraInfoEventData)) {
            return false;
        }
        CameraInfoEventData cameraInfoEventData = (CameraInfoEventData) other;
        return Intrinsics.areEqual(this.label, cameraInfoEventData.label) && Intrinsics.areEqual(this.position, cameraInfoEventData.position) && Intrinsics.areEqual(this.size, cameraInfoEventData.size) && Intrinsics.areEqual((Object) this.frameRate, (Object) cameraInfoEventData.frameRate) && Intrinsics.areEqual((Object) this.aspectRatio, (Object) cameraInfoEventData.aspectRatio) && Intrinsics.areEqual(this.debugData, cameraInfoEventData.debugData) && Intrinsics.areEqual(this.metadata, cameraInfoEventData.metadata);
    }

    public final Double getAspectRatio() {
        return this.aspectRatio;
    }

    public final CameraDebugData getDebugData() {
        return this.debugData;
    }

    public final Double getFrameRate() {
        return this.frameRate;
    }

    public final String getLabel() {
        return this.label;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.model.TrackingEventData
    public TrackingMetadata getMetadata() {
        return this.metadata;
    }

    public final String getPosition() {
        return this.position;
    }

    public final CameraSize getSize() {
        return this.size;
    }

    public int hashCode() {
        String str = this.label;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.position;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CameraSize cameraSize = this.size;
        int hashCode3 = (hashCode2 + (cameraSize == null ? 0 : cameraSize.hashCode())) * 31;
        Double d = this.frameRate;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.aspectRatio;
        int hashCode5 = (hashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        CameraDebugData cameraDebugData = this.debugData;
        int hashCode6 = (hashCode5 + (cameraDebugData == null ? 0 : cameraDebugData.hashCode())) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return hashCode6 + (trackingMetadata != null ? trackingMetadata.hashCode() : 0);
    }

    public String toString() {
        String str = this.label;
        String str2 = this.position;
        CameraSize cameraSize = this.size;
        Double d = this.frameRate;
        Double d2 = this.aspectRatio;
        CameraDebugData cameraDebugData = this.debugData;
        TrackingMetadata trackingMetadata = this.metadata;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CameraInfoEventData(label=", str, ", position=", str2, ", size=");
        m.append(cameraSize);
        m.append(", frameRate=");
        m.append(d);
        m.append(", aspectRatio=");
        m.append(d2);
        m.append(", debugData=");
        m.append(cameraDebugData);
        m.append(", metadata=");
        m.append(trackingMetadata);
        m.append(")");
        return m.toString();
    }

    public CameraInfoEventData(String str, String str2, CameraSize cameraSize, @Json(name = "frame_rate") Double d, @Json(name = "aspect_ratio") Double d2, @Json(name = "debug_data") CameraDebugData cameraDebugData, TrackingMetadata trackingMetadata) {
        this.label = str;
        this.position = str2;
        this.size = cameraSize;
        this.frameRate = d;
        this.aspectRatio = d2;
        this.debugData = cameraDebugData;
        this.metadata = trackingMetadata;
    }

    public CameraInfoEventData() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
