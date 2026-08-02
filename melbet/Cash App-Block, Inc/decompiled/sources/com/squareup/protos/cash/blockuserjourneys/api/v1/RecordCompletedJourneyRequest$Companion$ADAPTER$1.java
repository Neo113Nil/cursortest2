package com.squareup.protos.cash.blockuserjourneys.api.v1;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes.dex */
public final class RecordCompletedJourneyRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        String str = null;
        String str2 = null;
        EntityType entityType = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        JourneyOutcome journeyOutcome = null;
        JourneyTerminationReason journeyTerminationReason = null;
        String str11 = null;
        String str12 = null;
        Boolean bool = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RecordCompletedJourneyRequest(str, str2, entityType, str3, str4, str5, str6, str7, str8, str9, str10, l, l2, l3, journeyOutcome, journeyTerminationReason, str11, m, arrayList4, arrayList5, str12, bool, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    arrayList = m;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    arrayList = m;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 3:
                    arrayList = m;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    try {
                        entityType = EntityType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                    decode = str;
                    break;
                case 4:
                    arrayList = m;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 5:
                    arrayList = m;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 6:
                    arrayList = m;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 7:
                    arrayList = m;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 8:
                    arrayList = m;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 9:
                    arrayList = m;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 10:
                    arrayList = m;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 11:
                    arrayList = m;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    str10 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 12:
                    arrayList = m;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    l = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 13:
                    arrayList = m;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    l2 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 14:
                    arrayList = m;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    l3 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 15:
                    arrayList = m;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    try {
                        journeyOutcome = JourneyOutcome.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                    }
                    decode = str;
                    break;
                case 16:
                    try {
                        journeyTerminationReason = JourneyTerminationReason.ADAPTER.decode(protoReader);
                        arrayList = m;
                        arrayList2 = arrayList4;
                        arrayList3 = arrayList5;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        arrayList = m;
                        arrayList2 = arrayList4;
                        arrayList3 = arrayList5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                    }
                    decode = str;
                    break;
                case 17:
                    str11 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    decode = str;
                    break;
                case 18:
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    arrayList = m;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    decode = str;
                    break;
                case 19:
                    arrayList4.add(ProtoAdapter.STRING.decode(protoReader));
                    arrayList = m;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    decode = str;
                    break;
                case 20:
                    arrayList5.add(ProtoAdapter.STRING.decode(protoReader));
                    arrayList = m;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    decode = str;
                    break;
                case 21:
                    str12 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    decode = str;
                    break;
                case 22:
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    arrayList = m;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    decode = str;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    arrayList = m;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    decode = str;
                    break;
            }
            str = decode;
            m = arrayList;
            arrayList4 = arrayList2;
            arrayList5 = arrayList3;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RecordCompletedJourneyRequest recordCompletedJourneyRequest = (RecordCompletedJourneyRequest) obj;
        reverseProtoWriter.getClass();
        recordCompletedJourneyRequest.getClass();
        reverseProtoWriter.writeBytes(recordCompletedJourneyRequest.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 22, recordCompletedJourneyRequest.is_retry);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 21, recordCompletedJourneyRequest.session_id);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 20, recordCompletedJourneyRequest.tags);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 19, recordCompletedJourneyRequest.friction_signals);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 18, recordCompletedJourneyRequest.frustration_signals);
        protoAdapter.encodeWithTag(reverseProtoWriter, 17, recordCompletedJourneyRequest.variant);
        JourneyTerminationReason.ADAPTER.encodeWithTag(reverseProtoWriter, 16, recordCompletedJourneyRequest.termination_reason);
        JourneyOutcome.ADAPTER.encodeWithTag(reverseProtoWriter, 15, recordCompletedJourneyRequest.outcome);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 14, recordCompletedJourneyRequest.duration_real_time_ms);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 13, recordCompletedJourneyRequest.ended_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 12, recordCompletedJourneyRequest.created_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, recordCompletedJourneyRequest.locale);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, recordCompletedJourneyRequest.application_version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, recordCompletedJourneyRequest.application_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, recordCompletedJourneyRequest.device_model);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, recordCompletedJourneyRequest.platform_version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, recordCompletedJourneyRequest.platform_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, recordCompletedJourneyRequest.app_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, recordCompletedJourneyRequest.entity_id);
        EntityType.ADAPTER.encodeWithTag(reverseProtoWriter, 3, recordCompletedJourneyRequest.entity_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, recordCompletedJourneyRequest.journey_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, recordCompletedJourneyRequest.journey_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RecordCompletedJourneyRequest recordCompletedJourneyRequest = (RecordCompletedJourneyRequest) obj;
        recordCompletedJourneyRequest.getClass();
        int size$okio = recordCompletedJourneyRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(11, recordCompletedJourneyRequest.locale) + protoAdapter.encodedSizeWithTag(10, recordCompletedJourneyRequest.application_version) + protoAdapter.encodedSizeWithTag(9, recordCompletedJourneyRequest.application_name) + protoAdapter.encodedSizeWithTag(8, recordCompletedJourneyRequest.device_model) + protoAdapter.encodedSizeWithTag(7, recordCompletedJourneyRequest.platform_version) + protoAdapter.encodedSizeWithTag(6, recordCompletedJourneyRequest.platform_name) + protoAdapter.encodedSizeWithTag(5, recordCompletedJourneyRequest.app_token) + protoAdapter.encodedSizeWithTag(4, recordCompletedJourneyRequest.entity_id) + EntityType.ADAPTER.encodedSizeWithTag(3, recordCompletedJourneyRequest.entity_type) + protoAdapter.encodedSizeWithTag(2, recordCompletedJourneyRequest.journey_id) + protoAdapter.encodedSizeWithTag(1, recordCompletedJourneyRequest.journey_name) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return ProtoAdapter.BOOL.encodedSizeWithTag(22, recordCompletedJourneyRequest.is_retry) + protoAdapter.encodedSizeWithTag(21, recordCompletedJourneyRequest.session_id) + protoAdapter.asRepeated().encodedSizeWithTag(20, recordCompletedJourneyRequest.tags) + protoAdapter.asRepeated().encodedSizeWithTag(19, recordCompletedJourneyRequest.friction_signals) + protoAdapter.asRepeated().encodedSizeWithTag(18, recordCompletedJourneyRequest.frustration_signals) + protoAdapter.encodedSizeWithTag(17, recordCompletedJourneyRequest.variant) + JourneyTerminationReason.ADAPTER.encodedSizeWithTag(16, recordCompletedJourneyRequest.termination_reason) + JourneyOutcome.ADAPTER.encodedSizeWithTag(15, recordCompletedJourneyRequest.outcome) + protoAdapter2.encodedSizeWithTag(14, recordCompletedJourneyRequest.duration_real_time_ms) + protoAdapter2.encodedSizeWithTag(13, recordCompletedJourneyRequest.ended_at) + protoAdapter2.encodedSizeWithTag(12, recordCompletedJourneyRequest.created_at) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RecordCompletedJourneyRequest recordCompletedJourneyRequest = (RecordCompletedJourneyRequest) obj;
        recordCompletedJourneyRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = recordCompletedJourneyRequest.journey_name;
        String str2 = recordCompletedJourneyRequest.journey_id;
        EntityType entityType = recordCompletedJourneyRequest.entity_type;
        String str3 = recordCompletedJourneyRequest.entity_id;
        String str4 = recordCompletedJourneyRequest.app_token;
        String str5 = recordCompletedJourneyRequest.platform_name;
        String str6 = recordCompletedJourneyRequest.platform_version;
        String str7 = recordCompletedJourneyRequest.device_model;
        String str8 = recordCompletedJourneyRequest.application_name;
        String str9 = recordCompletedJourneyRequest.application_version;
        String str10 = recordCompletedJourneyRequest.locale;
        Long l = recordCompletedJourneyRequest.created_at;
        Long l2 = recordCompletedJourneyRequest.ended_at;
        Long l3 = recordCompletedJourneyRequest.duration_real_time_ms;
        JourneyOutcome journeyOutcome = recordCompletedJourneyRequest.outcome;
        JourneyTerminationReason journeyTerminationReason = recordCompletedJourneyRequest.termination_reason;
        String str11 = recordCompletedJourneyRequest.variant;
        List list = recordCompletedJourneyRequest.frustration_signals;
        List list2 = recordCompletedJourneyRequest.friction_signals;
        List list3 = recordCompletedJourneyRequest.tags;
        String str12 = recordCompletedJourneyRequest.session_id;
        Boolean bool = recordCompletedJourneyRequest.is_retry;
        list.getClass();
        list2.getClass();
        list3.getClass();
        byteString.getClass();
        return new RecordCompletedJourneyRequest(str, str2, entityType, str3, str4, str5, str6, str7, str8, str9, str10, l, l2, l3, journeyOutcome, journeyTerminationReason, str11, list, list2, list3, str12, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RecordCompletedJourneyRequest recordCompletedJourneyRequest = (RecordCompletedJourneyRequest) obj;
        recordCompletedJourneyRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, recordCompletedJourneyRequest.journey_name);
        protoAdapter.encodeWithTag(protoWriter, 2, recordCompletedJourneyRequest.journey_id);
        EntityType.ADAPTER.encodeWithTag(protoWriter, 3, recordCompletedJourneyRequest.entity_type);
        protoAdapter.encodeWithTag(protoWriter, 4, recordCompletedJourneyRequest.entity_id);
        protoAdapter.encodeWithTag(protoWriter, 5, recordCompletedJourneyRequest.app_token);
        protoAdapter.encodeWithTag(protoWriter, 6, recordCompletedJourneyRequest.platform_name);
        protoAdapter.encodeWithTag(protoWriter, 7, recordCompletedJourneyRequest.platform_version);
        protoAdapter.encodeWithTag(protoWriter, 8, recordCompletedJourneyRequest.device_model);
        protoAdapter.encodeWithTag(protoWriter, 9, recordCompletedJourneyRequest.application_name);
        protoAdapter.encodeWithTag(protoWriter, 10, recordCompletedJourneyRequest.application_version);
        protoAdapter.encodeWithTag(protoWriter, 11, recordCompletedJourneyRequest.locale);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 12, recordCompletedJourneyRequest.created_at);
        protoAdapter2.encodeWithTag(protoWriter, 13, recordCompletedJourneyRequest.ended_at);
        protoAdapter2.encodeWithTag(protoWriter, 14, recordCompletedJourneyRequest.duration_real_time_ms);
        JourneyOutcome.ADAPTER.encodeWithTag(protoWriter, 15, recordCompletedJourneyRequest.outcome);
        JourneyTerminationReason.ADAPTER.encodeWithTag(protoWriter, 16, recordCompletedJourneyRequest.termination_reason);
        protoAdapter.encodeWithTag(protoWriter, 17, recordCompletedJourneyRequest.variant);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 18, recordCompletedJourneyRequest.frustration_signals);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 19, recordCompletedJourneyRequest.friction_signals);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 20, recordCompletedJourneyRequest.tags);
        protoAdapter.encodeWithTag(protoWriter, 21, recordCompletedJourneyRequest.session_id);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 22, recordCompletedJourneyRequest.is_retry);
        protoWriter.writeBytes(recordCompletedJourneyRequest.unknownFields());
    }
}
