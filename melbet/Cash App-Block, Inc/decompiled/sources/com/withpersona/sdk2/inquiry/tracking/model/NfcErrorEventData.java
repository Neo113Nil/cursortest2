package com.withpersona.sdk2.inquiry.tracking.model;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010,\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jx\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\u000eHÖ\u0001J\t\u00104\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00065"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "phase", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;", "category", "", "errorMessage", "errorType", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorType;", "durationMs", "", "authMethod", "dataGroupType", "cardStatusWord", "", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorType;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getPhase", "()Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;", "getCategory", "()Ljava/lang/String;", "getErrorMessage", "getErrorType", "()Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorType;", "getDurationMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAuthMethod", "getDataGroupType", "getCardStatusWord", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorType;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;", "equals", "", "other", "", "hashCode", "toString", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NfcErrorEventData implements TrackingEventData {
    private final String authMethod;
    private final Integer cardStatusWord;
    private final String category;
    private final String dataGroupType;
    private final Long durationMs;
    private final String errorMessage;
    private final NfcErrorType errorType;
    private final TrackingMetadata metadata;
    private final NfcScanPhase phase;

    public /* synthetic */ NfcErrorEventData(NfcScanPhase nfcScanPhase, String str, String str2, NfcErrorType nfcErrorType, Long l, String str3, String str4, Integer num, TrackingMetadata trackingMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nfcScanPhase, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : nfcErrorType, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : trackingMetadata);
    }

    public static /* synthetic */ NfcErrorEventData copy$default(NfcErrorEventData nfcErrorEventData, NfcScanPhase nfcScanPhase, String str, String str2, NfcErrorType nfcErrorType, Long l, String str3, String str4, Integer num, TrackingMetadata trackingMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            nfcScanPhase = nfcErrorEventData.phase;
        }
        if ((i & 2) != 0) {
            str = nfcErrorEventData.category;
        }
        if ((i & 4) != 0) {
            str2 = nfcErrorEventData.errorMessage;
        }
        if ((i & 8) != 0) {
            nfcErrorType = nfcErrorEventData.errorType;
        }
        if ((i & 16) != 0) {
            l = nfcErrorEventData.durationMs;
        }
        if ((i & 32) != 0) {
            str3 = nfcErrorEventData.authMethod;
        }
        if ((i & 64) != 0) {
            str4 = nfcErrorEventData.dataGroupType;
        }
        if ((i & 128) != 0) {
            num = nfcErrorEventData.cardStatusWord;
        }
        if ((i & 256) != 0) {
            trackingMetadata = nfcErrorEventData.metadata;
        }
        Integer num2 = num;
        TrackingMetadata trackingMetadata2 = trackingMetadata;
        String str5 = str3;
        String str6 = str4;
        Long l2 = l;
        String str7 = str2;
        return nfcErrorEventData.copy(nfcScanPhase, str, str7, nfcErrorType, l2, str5, str6, num2, trackingMetadata2);
    }

    /* renamed from: component1, reason: from getter */
    public final NfcScanPhase getPhase() {
        return this.phase;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: component3, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component4, reason: from getter */
    public final NfcErrorType getErrorType() {
        return this.errorType;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getDurationMs() {
        return this.durationMs;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAuthMethod() {
        return this.authMethod;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDataGroupType() {
        return this.dataGroupType;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getCardStatusWord() {
        return this.cardStatusWord;
    }

    /* renamed from: component9, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    public final NfcErrorEventData copy(NfcScanPhase phase, String category, @Json(name = "error_message") String errorMessage, @Json(name = "error_type") NfcErrorType errorType, @Json(name = "duration_ms") Long durationMs, @Json(name = "auth_method") String authMethod, @Json(name = "data_group_type") String dataGroupType, @Json(name = "card_status_word") Integer cardStatusWord, TrackingMetadata metadata) {
        phase.getClass();
        return new NfcErrorEventData(phase, category, errorMessage, errorType, durationMs, authMethod, dataGroupType, cardStatusWord, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcErrorEventData)) {
            return false;
        }
        NfcErrorEventData nfcErrorEventData = (NfcErrorEventData) other;
        return this.phase == nfcErrorEventData.phase && Intrinsics.areEqual(this.category, nfcErrorEventData.category) && Intrinsics.areEqual(this.errorMessage, nfcErrorEventData.errorMessage) && this.errorType == nfcErrorEventData.errorType && Intrinsics.areEqual(this.durationMs, nfcErrorEventData.durationMs) && Intrinsics.areEqual(this.authMethod, nfcErrorEventData.authMethod) && Intrinsics.areEqual(this.dataGroupType, nfcErrorEventData.dataGroupType) && Intrinsics.areEqual(this.cardStatusWord, nfcErrorEventData.cardStatusWord) && Intrinsics.areEqual(this.metadata, nfcErrorEventData.metadata);
    }

    public final String getAuthMethod() {
        return this.authMethod;
    }

    public final Integer getCardStatusWord() {
        return this.cardStatusWord;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getDataGroupType() {
        return this.dataGroupType;
    }

    public final Long getDurationMs() {
        return this.durationMs;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final NfcErrorType getErrorType() {
        return this.errorType;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.model.TrackingEventData
    public TrackingMetadata getMetadata() {
        return this.metadata;
    }

    public final NfcScanPhase getPhase() {
        return this.phase;
    }

    public int hashCode() {
        int hashCode = this.phase.hashCode() * 31;
        String str = this.category;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorMessage;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        NfcErrorType nfcErrorType = this.errorType;
        int hashCode4 = (hashCode3 + (nfcErrorType == null ? 0 : nfcErrorType.hashCode())) * 31;
        Long l = this.durationMs;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.authMethod;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dataGroupType;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.cardStatusWord;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return hashCode8 + (trackingMetadata != null ? trackingMetadata.hashCode() : 0);
    }

    public String toString() {
        NfcScanPhase nfcScanPhase = this.phase;
        String str = this.category;
        String str2 = this.errorMessage;
        NfcErrorType nfcErrorType = this.errorType;
        Long l = this.durationMs;
        String str3 = this.authMethod;
        String str4 = this.dataGroupType;
        Integer num = this.cardStatusWord;
        TrackingMetadata trackingMetadata = this.metadata;
        StringBuilder sb = new StringBuilder("NfcErrorEventData(phase=");
        sb.append(nfcScanPhase);
        sb.append(", category=");
        sb.append(str);
        sb.append(", errorMessage=");
        sb.append(str2);
        sb.append(", errorType=");
        sb.append(nfcErrorType);
        sb.append(", durationMs=");
        ViewEvent$State$EnumUnboxingLocalUtility.m(l, ", authMethod=", str3, ", dataGroupType=", sb);
        NavAction$$ExternalSyntheticOutline0.m(sb, str4, ", cardStatusWord=", num, ", metadata=");
        sb.append(trackingMetadata);
        sb.append(")");
        return sb.toString();
    }

    public NfcErrorEventData(NfcScanPhase nfcScanPhase, String str, @Json(name = "error_message") String str2, @Json(name = "error_type") NfcErrorType nfcErrorType, @Json(name = "duration_ms") Long l, @Json(name = "auth_method") String str3, @Json(name = "data_group_type") String str4, @Json(name = "card_status_word") Integer num, TrackingMetadata trackingMetadata) {
        nfcScanPhase.getClass();
        this.phase = nfcScanPhase;
        this.category = str;
        this.errorMessage = str2;
        this.errorType = nfcErrorType;
        this.durationMs = l;
        this.authMethod = str3;
        this.dataGroupType = str4;
        this.cardStatusWord = num;
        this.metadata = trackingMetadata;
    }
}
