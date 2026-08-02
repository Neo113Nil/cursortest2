package com.squareup.protos.timecards;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TimecardBreak$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0026. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            Object obj17 = obj3;
            if (nextTag == -1) {
                return new TimecardBreak((String) obj2, (String) obj17, (String) obj4, (Long) obj5, (Long) obj6, (String) obj7, (Boolean) obj8, (String) obj9, (Integer) obj10, (Long) obj11, (Long) obj12, (Boolean) obj13, (Integer) obj14, (String) obj15, (String) obj16, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj17;
                    break;
                case 2:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    obj = obj2;
                    break;
                case 3:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj17;
                    obj = obj2;
                    break;
                case 4:
                    obj5 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj17;
                    obj = obj2;
                    break;
                case 5:
                    obj6 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj17;
                    obj = obj2;
                    break;
                case 6:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj17;
                    obj = obj2;
                    break;
                case 7:
                    obj8 = ProtoAdapter.BOOL.decode(protoReader);
                    obj3 = obj17;
                    obj = obj2;
                    break;
                case 8:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj17;
                    obj = obj2;
                    break;
                case 9:
                    obj10 = ProtoAdapter.UINT32.decode(protoReader);
                    obj3 = obj17;
                    obj = obj2;
                    break;
                case 10:
                    obj11 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj17;
                    obj = obj2;
                    break;
                case 11:
                    obj12 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj17;
                    obj = obj2;
                    break;
                case 12:
                    obj13 = ProtoAdapter.BOOL.decode(protoReader);
                    obj3 = obj17;
                    obj = obj2;
                    break;
                case 13:
                    obj14 = ProtoAdapter.UINT32.decode(protoReader);
                    obj3 = obj17;
                    obj = obj2;
                    break;
                case 14:
                    obj15 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj17;
                    obj = obj2;
                    break;
                case 15:
                    obj16 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj17;
                    obj = obj2;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj2;
                    obj3 = obj17;
                    break;
            }
            obj2 = obj;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TimecardBreak timecardBreak = (TimecardBreak) obj;
        reverseProtoWriter.getClass();
        timecardBreak.getClass();
        reverseProtoWriter.writeBytes(timecardBreak.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 15, timecardBreak.updated_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, timecardBreak.created_at);
        ProtoAdapter protoAdapter2 = ProtoAdapter.UINT32;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 13, timecardBreak.minimum_duration_seconds);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 12, timecardBreak.violates_expected_duration);
        ProtoAdapter protoAdapter4 = ProtoAdapter.INT64;
        protoAdapter4.encodeWithTag(reverseProtoWriter, 11, timecardBreak.stop_timestamp_seconds);
        protoAdapter4.encodeWithTag(reverseProtoWriter, 10, timecardBreak.start_timestamp_seconds);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, timecardBreak.expected_duration_seconds);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, timecardBreak.break_name);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 7, timecardBreak.is_paid);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, timecardBreak.timecard_break_definition_token);
        protoAdapter4.encodeWithTag(reverseProtoWriter, 5, timecardBreak.stop_timestamp_ms);
        protoAdapter4.encodeWithTag(reverseProtoWriter, 4, timecardBreak.start_timestamp_ms);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, timecardBreak.merchant_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, timecardBreak.timecard_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, timecardBreak.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TimecardBreak timecardBreak = (TimecardBreak) obj;
        timecardBreak.getClass();
        int size$okio = timecardBreak.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, timecardBreak.merchant_token) + protoAdapter.encodedSizeWithTag(2, timecardBreak.timecard_token) + protoAdapter.encodedSizeWithTag(1, timecardBreak.token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(6, timecardBreak.timecard_break_definition_token) + protoAdapter2.encodedSizeWithTag(5, timecardBreak.stop_timestamp_ms) + protoAdapter2.encodedSizeWithTag(4, timecardBreak.start_timestamp_ms) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(8, timecardBreak.break_name) + protoAdapter3.encodedSizeWithTag(7, timecardBreak.is_paid) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter4 = ProtoAdapter.UINT32;
        return protoAdapter.encodedSizeWithTag(15, timecardBreak.updated_at) + protoAdapter.encodedSizeWithTag(14, timecardBreak.created_at) + protoAdapter4.encodedSizeWithTag(13, timecardBreak.minimum_duration_seconds) + protoAdapter3.encodedSizeWithTag(12, timecardBreak.violates_expected_duration) + protoAdapter2.encodedSizeWithTag(11, timecardBreak.stop_timestamp_seconds) + protoAdapter2.encodedSizeWithTag(10, timecardBreak.start_timestamp_seconds) + protoAdapter4.encodedSizeWithTag(9, timecardBreak.expected_duration_seconds) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TimecardBreak timecardBreak = (TimecardBreak) obj;
        timecardBreak.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = timecardBreak.token;
        String str2 = timecardBreak.timecard_token;
        String str3 = timecardBreak.merchant_token;
        Long l = timecardBreak.start_timestamp_ms;
        Long l2 = timecardBreak.stop_timestamp_ms;
        String str4 = timecardBreak.timecard_break_definition_token;
        Boolean bool = timecardBreak.is_paid;
        String str5 = timecardBreak.break_name;
        Integer num = timecardBreak.expected_duration_seconds;
        Long l3 = timecardBreak.start_timestamp_seconds;
        Long l4 = timecardBreak.stop_timestamp_seconds;
        Boolean bool2 = timecardBreak.violates_expected_duration;
        Integer num2 = timecardBreak.minimum_duration_seconds;
        String str6 = timecardBreak.created_at;
        String str7 = timecardBreak.updated_at;
        byteString.getClass();
        return new TimecardBreak(str, str2, str3, l, l2, str4, bool, str5, num, l3, l4, bool2, num2, str6, str7, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TimecardBreak timecardBreak = (TimecardBreak) obj;
        timecardBreak.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, timecardBreak.token);
        protoAdapter.encodeWithTag(protoWriter, 2, timecardBreak.timecard_token);
        protoAdapter.encodeWithTag(protoWriter, 3, timecardBreak.merchant_token);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 4, timecardBreak.start_timestamp_ms);
        protoAdapter2.encodeWithTag(protoWriter, 5, timecardBreak.stop_timestamp_ms);
        protoAdapter.encodeWithTag(protoWriter, 6, timecardBreak.timecard_break_definition_token);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(protoWriter, 7, timecardBreak.is_paid);
        protoAdapter.encodeWithTag(protoWriter, 8, timecardBreak.break_name);
        ProtoAdapter protoAdapter4 = ProtoAdapter.UINT32;
        protoAdapter4.encodeWithTag(protoWriter, 9, timecardBreak.expected_duration_seconds);
        protoAdapter2.encodeWithTag(protoWriter, 10, timecardBreak.start_timestamp_seconds);
        protoAdapter2.encodeWithTag(protoWriter, 11, timecardBreak.stop_timestamp_seconds);
        protoAdapter3.encodeWithTag(protoWriter, 12, timecardBreak.violates_expected_duration);
        protoAdapter4.encodeWithTag(protoWriter, 13, timecardBreak.minimum_duration_seconds);
        protoAdapter.encodeWithTag(protoWriter, 14, timecardBreak.created_at);
        protoAdapter.encodeWithTag(protoWriter, 15, timecardBreak.updated_at);
        protoWriter.writeBytes(timecardBreak.unknownFields());
    }
}
