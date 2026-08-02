package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TimecardBreakDefinition$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        String str;
        String str2;
        ?? decode;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        String str3 = null;
        Object obj2 = null;
        String str4 = null;
        String str5 = null;
        Integer num = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Long l = null;
        Long l2 = null;
        String str6 = null;
        String str7 = null;
        ConfigurationType configurationType = null;
        Boolean bool3 = null;
        String str8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TimecardBreakDefinition(str3, str8, str4, str5, num, bool, bool2, l, l2, str6, str7, configurationType, bool3, (BreakRule) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 3:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 4:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 5:
                    num = ProtoAdapter.UINT32.decode(protoReader);
                    decode = str3;
                    break;
                case 6:
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str3;
                    break;
                case 7:
                    bool2 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str3;
                    break;
                case 8:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    decode = str3;
                    break;
                case 9:
                    l2 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str3;
                    break;
                case 10:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 11:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 12:
                    try {
                        configurationType = ConfigurationType.ADAPTER.decode(protoReader);
                        decode = str3;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj2;
                        str = str4;
                        str2 = str5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 13:
                    bool3 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str3;
                    break;
                case 14:
                    obj2 = TransactorKt.decodeMessageOrMerge(BreakRule.ADAPTER, protoReader, obj2);
                    decode = str3;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj2;
                    str = str4;
                    str2 = str5;
                    decode = str3;
                    obj2 = obj;
                    str4 = str;
                    str5 = str2;
                    break;
            }
            str3 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TimecardBreakDefinition timecardBreakDefinition = (TimecardBreakDefinition) obj;
        reverseProtoWriter.getClass();
        timecardBreakDefinition.getClass();
        reverseProtoWriter.writeBytes(timecardBreakDefinition.unknownFields());
        BreakRule.ADAPTER.encodeWithTag(reverseProtoWriter, 14, timecardBreakDefinition.break_rule);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, timecardBreakDefinition.is_mandatory);
        ConfigurationType.ADAPTER.encodeWithTag(reverseProtoWriter, 12, timecardBreakDefinition.configuration_type);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, timecardBreakDefinition.updated_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, timecardBreakDefinition.created_at);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 9, timecardBreakDefinition.updated_at_timestamp_seconds);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 8, timecardBreakDefinition.updated_at_timestamp_ms);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, timecardBreakDefinition.enabled);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, timecardBreakDefinition.is_paid);
        ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 5, timecardBreakDefinition.expected_duration_seconds);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, timecardBreakDefinition.break_name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, timecardBreakDefinition.unit_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, timecardBreakDefinition.merchant_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, timecardBreakDefinition.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TimecardBreakDefinition timecardBreakDefinition = (TimecardBreakDefinition) obj;
        timecardBreakDefinition.getClass();
        int size$okio = timecardBreakDefinition.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = ProtoAdapter.UINT32.encodedSizeWithTag(5, timecardBreakDefinition.expected_duration_seconds) + protoAdapter.encodedSizeWithTag(4, timecardBreakDefinition.break_name) + protoAdapter.encodedSizeWithTag(3, timecardBreakDefinition.unit_token) + protoAdapter.encodedSizeWithTag(2, timecardBreakDefinition.merchant_token) + protoAdapter.encodedSizeWithTag(1, timecardBreakDefinition.token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(7, timecardBreakDefinition.enabled) + protoAdapter2.encodedSizeWithTag(6, timecardBreakDefinition.is_paid) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        return BreakRule.ADAPTER.encodedSizeWithTag(14, timecardBreakDefinition.break_rule) + protoAdapter2.encodedSizeWithTag(13, timecardBreakDefinition.is_mandatory) + ConfigurationType.ADAPTER.encodedSizeWithTag(12, timecardBreakDefinition.configuration_type) + protoAdapter.encodedSizeWithTag(11, timecardBreakDefinition.updated_at) + protoAdapter.encodedSizeWithTag(10, timecardBreakDefinition.created_at) + protoAdapter3.encodedSizeWithTag(9, timecardBreakDefinition.updated_at_timestamp_seconds) + protoAdapter3.encodedSizeWithTag(8, timecardBreakDefinition.updated_at_timestamp_ms) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TimecardBreakDefinition timecardBreakDefinition = (TimecardBreakDefinition) obj;
        timecardBreakDefinition.getClass();
        BreakRule breakRule = timecardBreakDefinition.break_rule;
        BreakRule breakRule2 = breakRule != null ? (BreakRule) BreakRule.ADAPTER.redact(breakRule) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = timecardBreakDefinition.token;
        String str2 = timecardBreakDefinition.merchant_token;
        String str3 = timecardBreakDefinition.unit_token;
        String str4 = timecardBreakDefinition.break_name;
        Integer num = timecardBreakDefinition.expected_duration_seconds;
        Boolean bool = timecardBreakDefinition.is_paid;
        Boolean bool2 = timecardBreakDefinition.enabled;
        Long l = timecardBreakDefinition.updated_at_timestamp_ms;
        Long l2 = timecardBreakDefinition.updated_at_timestamp_seconds;
        String str5 = timecardBreakDefinition.created_at;
        String str6 = timecardBreakDefinition.updated_at;
        ConfigurationType configurationType = timecardBreakDefinition.configuration_type;
        Boolean bool3 = timecardBreakDefinition.is_mandatory;
        byteString.getClass();
        return new TimecardBreakDefinition(str, str2, str3, str4, num, bool, bool2, l, l2, str5, str6, configurationType, bool3, breakRule2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TimecardBreakDefinition timecardBreakDefinition = (TimecardBreakDefinition) obj;
        timecardBreakDefinition.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, timecardBreakDefinition.token);
        protoAdapter.encodeWithTag(protoWriter, 2, timecardBreakDefinition.merchant_token);
        protoAdapter.encodeWithTag(protoWriter, 3, timecardBreakDefinition.unit_token);
        protoAdapter.encodeWithTag(protoWriter, 4, timecardBreakDefinition.break_name);
        ProtoAdapter.UINT32.encodeWithTag(protoWriter, 5, timecardBreakDefinition.expected_duration_seconds);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 6, timecardBreakDefinition.is_paid);
        protoAdapter2.encodeWithTag(protoWriter, 7, timecardBreakDefinition.enabled);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(protoWriter, 8, timecardBreakDefinition.updated_at_timestamp_ms);
        protoAdapter3.encodeWithTag(protoWriter, 9, timecardBreakDefinition.updated_at_timestamp_seconds);
        protoAdapter.encodeWithTag(protoWriter, 10, timecardBreakDefinition.created_at);
        protoAdapter.encodeWithTag(protoWriter, 11, timecardBreakDefinition.updated_at);
        ConfigurationType.ADAPTER.encodeWithTag(protoWriter, 12, timecardBreakDefinition.configuration_type);
        protoAdapter2.encodeWithTag(protoWriter, 13, timecardBreakDefinition.is_mandatory);
        BreakRule.ADAPTER.encodeWithTag(protoWriter, 14, timecardBreakDefinition.break_rule);
        protoWriter.writeBytes(timecardBreakDefinition.unknownFields());
    }
}
