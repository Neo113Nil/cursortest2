package com.squareup.protos.cash.blockuserjourneys.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes.dex */
public final class RecordCompletedJourneyRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RecordCompletedJourneyRequest> CREATOR;
    public final String app_token;
    public final String application_name;
    public final String application_version;
    public final Long created_at;
    public final String device_model;
    public final Long duration_real_time_ms;
    public final Long ended_at;
    public final String entity_id;
    public final EntityType entity_type;
    public final List friction_signals;
    public final List frustration_signals;
    public final Boolean is_retry;
    public final String journey_id;
    public final String journey_name;
    public final String locale;
    public final JourneyOutcome outcome;
    public final String platform_name;
    public final String platform_version;
    public final String session_id;
    public final List tags;
    public final JourneyTerminationReason termination_reason;
    public final String variant;

    static {
        RecordCompletedJourneyRequest$Companion$ADAPTER$1 recordCompletedJourneyRequest$Companion$ADAPTER$1 = new RecordCompletedJourneyRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecordCompletedJourneyRequest.class), "type.googleapis.com/squareup.cash.blockuserjourneys.api.v1.RecordCompletedJourneyRequest", Syntax.PROTO_2, null, "squareup/cash/blockuserjourneys/api/v1/service.proto");
        ADAPTER = recordCompletedJourneyRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(recordCompletedJourneyRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordCompletedJourneyRequest(String str, String str2, EntityType entityType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l, Long l2, Long l3, JourneyOutcome journeyOutcome, JourneyTerminationReason journeyTerminationReason, String str11, List list, List list2, List list3, String str12, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.journey_name = str;
        this.journey_id = str2;
        this.entity_type = entityType;
        this.entity_id = str3;
        this.app_token = str4;
        this.platform_name = str5;
        this.platform_version = str6;
        this.device_model = str7;
        this.application_name = str8;
        this.application_version = str9;
        this.locale = str10;
        this.created_at = l;
        this.ended_at = l2;
        this.duration_real_time_ms = l3;
        this.outcome = journeyOutcome;
        this.termination_reason = journeyTerminationReason;
        this.variant = str11;
        this.session_id = str12;
        this.is_retry = bool;
        this.frustration_signals = TransactorKt.immutableCopyOf("frustration_signals", list);
        this.friction_signals = TransactorKt.immutableCopyOf("friction_signals", list2);
        this.tags = TransactorKt.immutableCopyOf("tags", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecordCompletedJourneyRequest)) {
            return false;
        }
        RecordCompletedJourneyRequest recordCompletedJourneyRequest = (RecordCompletedJourneyRequest) obj;
        return Intrinsics.areEqual(unknownFields(), recordCompletedJourneyRequest.unknownFields()) && Intrinsics.areEqual(this.journey_name, recordCompletedJourneyRequest.journey_name) && Intrinsics.areEqual(this.journey_id, recordCompletedJourneyRequest.journey_id) && this.entity_type == recordCompletedJourneyRequest.entity_type && Intrinsics.areEqual(this.entity_id, recordCompletedJourneyRequest.entity_id) && Intrinsics.areEqual(this.app_token, recordCompletedJourneyRequest.app_token) && Intrinsics.areEqual(this.platform_name, recordCompletedJourneyRequest.platform_name) && Intrinsics.areEqual(this.platform_version, recordCompletedJourneyRequest.platform_version) && Intrinsics.areEqual(this.device_model, recordCompletedJourneyRequest.device_model) && Intrinsics.areEqual(this.application_name, recordCompletedJourneyRequest.application_name) && Intrinsics.areEqual(this.application_version, recordCompletedJourneyRequest.application_version) && Intrinsics.areEqual(this.locale, recordCompletedJourneyRequest.locale) && Intrinsics.areEqual(this.created_at, recordCompletedJourneyRequest.created_at) && Intrinsics.areEqual(this.ended_at, recordCompletedJourneyRequest.ended_at) && Intrinsics.areEqual(this.duration_real_time_ms, recordCompletedJourneyRequest.duration_real_time_ms) && this.outcome == recordCompletedJourneyRequest.outcome && this.termination_reason == recordCompletedJourneyRequest.termination_reason && Intrinsics.areEqual(this.variant, recordCompletedJourneyRequest.variant) && Intrinsics.areEqual(this.frustration_signals, recordCompletedJourneyRequest.frustration_signals) && Intrinsics.areEqual(this.friction_signals, recordCompletedJourneyRequest.friction_signals) && Intrinsics.areEqual(this.tags, recordCompletedJourneyRequest.tags) && Intrinsics.areEqual(this.session_id, recordCompletedJourneyRequest.session_id) && Intrinsics.areEqual(this.is_retry, recordCompletedJourneyRequest.is_retry);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.journey_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.journey_id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        EntityType entityType = this.entity_type;
        int hashCode4 = (hashCode3 + (entityType != null ? entityType.hashCode() : 0)) * 37;
        String str3 = this.entity_id;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.app_token;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.platform_name;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.platform_version;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.device_model;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.application_name;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.application_version;
        int hashCode11 = (hashCode10 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.locale;
        int hashCode12 = (hashCode11 + (str10 != null ? str10.hashCode() : 0)) * 37;
        Long l = this.created_at;
        int hashCode13 = (hashCode12 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.ended_at;
        int hashCode14 = (hashCode13 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.duration_real_time_ms;
        int hashCode15 = (hashCode14 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        JourneyOutcome journeyOutcome = this.outcome;
        int hashCode16 = (hashCode15 + (journeyOutcome != null ? journeyOutcome.hashCode() : 0)) * 37;
        JourneyTerminationReason journeyTerminationReason = this.termination_reason;
        int hashCode17 = (hashCode16 + (journeyTerminationReason != null ? journeyTerminationReason.hashCode() : 0)) * 37;
        String str11 = this.variant;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode17 + (str11 != null ? str11.hashCode() : 0)) * 37, 37, this.frustration_signals), 37, this.friction_signals), 37, this.tags);
        String str12 = this.session_id;
        int hashCode18 = (m + (str12 != null ? str12.hashCode() : 0)) * 37;
        Boolean bool = this.is_retry;
        int hashCode19 = hashCode18 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode19;
        return hashCode19;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Metadata.Builder builder = new Metadata.Builder(1);
        builder.model_version = this.journey_name;
        builder.search_text = this.journey_id;
        builder.match_length = this.entity_type;
        builder.query_token = this.entity_id;
        builder.entity_token = this.app_token;
        builder.entity_attributes = this.platform_name;
        builder.entity_name = this.platform_version;
        builder.business_token = this.device_model;
        builder.business_name = this.application_name;
        builder.app_feature_name = this.application_version;
        builder.app_feature_client_route = this.locale;
        builder.is_linked_account = this.created_at;
        builder.is_c4b_account = this.ended_at;
        builder.is_multiple_account_holder = this.duration_real_time_ms;
        builder.is_first_linked_account = this.outcome;
        builder.entity_type = this.termination_reason;
        builder.offer_id = this.variant;
        builder.match_fields = this.frustration_signals;
        builder.merchant_tags = this.friction_signals;
        builder.offer_type = this.tags;
        builder.stock_ticker = this.session_id;
        builder.is_cash_customer = this.is_retry;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.journey_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "journey_name=", arrayList);
        }
        String str2 = this.journey_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "journey_id=", arrayList);
        }
        EntityType entityType = this.entity_type;
        if (entityType != null) {
            arrayList.add("entity_type=" + entityType);
        }
        String str3 = this.entity_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "entity_id=", arrayList);
        }
        String str4 = this.app_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "app_token=", arrayList);
        }
        String str5 = this.platform_name;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "platform_name=", arrayList);
        }
        String str6 = this.platform_version;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "platform_version=", arrayList);
        }
        String str7 = this.device_model;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "device_model=", arrayList);
        }
        String str8 = this.application_name;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "application_name=", arrayList);
        }
        String str9 = this.application_version;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "application_version=", arrayList);
        }
        String str10 = this.locale;
        if (str10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "locale=", arrayList);
        }
        Long l = this.created_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l, arrayList);
        }
        Long l2 = this.ended_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("ended_at=", l2, arrayList);
        }
        Long l3 = this.duration_real_time_ms;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("duration_real_time_ms=", l3, arrayList);
        }
        JourneyOutcome journeyOutcome = this.outcome;
        if (journeyOutcome != null) {
            arrayList.add("outcome=" + journeyOutcome);
        }
        JourneyTerminationReason journeyTerminationReason = this.termination_reason;
        if (journeyTerminationReason != null) {
            arrayList.add("termination_reason=" + journeyTerminationReason);
        }
        String str11 = this.variant;
        if (str11 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str11, "variant=", arrayList);
        }
        List list = this.frustration_signals;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("frustration_signals=", arrayList, list);
        }
        List list2 = this.friction_signals;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("friction_signals=", arrayList, list2);
        }
        List list3 = this.tags;
        if (!list3.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("tags=", arrayList, list3);
        }
        String str12 = this.session_id;
        if (str12 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str12, "session_id=", arrayList);
        }
        Boolean bool = this.is_retry;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_retry=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RecordCompletedJourneyRequest{", "}", 0, null, null, 56);
    }
}
