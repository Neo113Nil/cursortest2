package com.withpersona.sdk2.inquiry.tracking.model;

import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/DebugLogEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "category", "", "message", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getCategory", "()Ljava/lang/String;", "getMessage", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DebugLogEventData implements TrackingEventData {
    private final String category;
    private final String message;
    private final TrackingMetadata metadata;

    public /* synthetic */ DebugLogEventData(String str, String str2, TrackingMetadata trackingMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : trackingMetadata);
    }

    public static /* synthetic */ DebugLogEventData copy$default(DebugLogEventData debugLogEventData, String str, String str2, TrackingMetadata trackingMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            str = debugLogEventData.category;
        }
        if ((i & 2) != 0) {
            str2 = debugLogEventData.message;
        }
        if ((i & 4) != 0) {
            trackingMetadata = debugLogEventData.metadata;
        }
        return debugLogEventData.copy(str, str2, trackingMetadata);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    public final DebugLogEventData copy(String category, String message, TrackingMetadata metadata) {
        return new DebugLogEventData(category, message, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DebugLogEventData)) {
            return false;
        }
        DebugLogEventData debugLogEventData = (DebugLogEventData) other;
        return Intrinsics.areEqual(this.category, debugLogEventData.category) && Intrinsics.areEqual(this.message, debugLogEventData.message) && Intrinsics.areEqual(this.metadata, debugLogEventData.metadata);
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.model.TrackingEventData
    public TrackingMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        String str = this.category;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return hashCode2 + (trackingMetadata != null ? trackingMetadata.hashCode() : 0);
    }

    public String toString() {
        String str = this.category;
        String str2 = this.message;
        TrackingMetadata trackingMetadata = this.metadata;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DebugLogEventData(category=", str, ", message=", str2, ", metadata=");
        m.append(trackingMetadata);
        m.append(")");
        return m.toString();
    }

    public DebugLogEventData(String str, String str2, TrackingMetadata trackingMetadata) {
        this.category = str;
        this.message = str2;
        this.metadata = trackingMetadata;
    }

    public DebugLogEventData() {
        this(null, null, null, 7, null);
    }
}
