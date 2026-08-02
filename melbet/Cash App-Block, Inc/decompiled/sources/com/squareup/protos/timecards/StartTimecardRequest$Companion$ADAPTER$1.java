package com.squareup.protos.timecards;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class StartTimecardRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StartTimecardRequest((String) obj, (String) obj2, (String) obj3, (Boolean) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 6:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 7:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StartTimecardRequest startTimecardRequest = (StartTimecardRequest) obj;
        reverseProtoWriter.getClass();
        startTimecardRequest.getClass();
        reverseProtoWriter.writeBytes(startTimecardRequest.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, startTimecardRequest.shift_schedule_published_version_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, startTimecardRequest.shift_schedule_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, startTimecardRequest.local_time_zone_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, startTimecardRequest.job_token);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 6, startTimecardRequest.use_job_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, startTimecardRequest.clockin_unit_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, startTimecardRequest.employee_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, startTimecardRequest.merchant_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StartTimecardRequest startTimecardRequest = (StartTimecardRequest) obj;
        startTimecardRequest.getClass();
        int size$okio = startTimecardRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(9, startTimecardRequest.shift_schedule_published_version_token) + protoAdapter.encodedSizeWithTag(8, startTimecardRequest.shift_schedule_token) + protoAdapter.encodedSizeWithTag(4, startTimecardRequest.local_time_zone_id) + protoAdapter.encodedSizeWithTag(7, startTimecardRequest.job_token) + ProtoAdapter.BOOL.encodedSizeWithTag(6, startTimecardRequest.use_job_token) + protoAdapter.encodedSizeWithTag(3, startTimecardRequest.clockin_unit_token) + protoAdapter.encodedSizeWithTag(2, startTimecardRequest.employee_token) + protoAdapter.encodedSizeWithTag(1, startTimecardRequest.merchant_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StartTimecardRequest startTimecardRequest = (StartTimecardRequest) obj;
        startTimecardRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = startTimecardRequest.merchant_token;
        String str2 = startTimecardRequest.employee_token;
        String str3 = startTimecardRequest.clockin_unit_token;
        Boolean bool = startTimecardRequest.use_job_token;
        String str4 = startTimecardRequest.job_token;
        String str5 = startTimecardRequest.local_time_zone_id;
        String str6 = startTimecardRequest.shift_schedule_token;
        String str7 = startTimecardRequest.shift_schedule_published_version_token;
        byteString.getClass();
        return new StartTimecardRequest(str, str2, str3, bool, str4, str5, str6, str7, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StartTimecardRequest startTimecardRequest = (StartTimecardRequest) obj;
        startTimecardRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, startTimecardRequest.merchant_token);
        protoAdapter.encodeWithTag(protoWriter, 2, startTimecardRequest.employee_token);
        protoAdapter.encodeWithTag(protoWriter, 3, startTimecardRequest.clockin_unit_token);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, startTimecardRequest.use_job_token);
        protoAdapter.encodeWithTag(protoWriter, 7, startTimecardRequest.job_token);
        protoAdapter.encodeWithTag(protoWriter, 4, startTimecardRequest.local_time_zone_id);
        protoAdapter.encodeWithTag(protoWriter, 8, startTimecardRequest.shift_schedule_token);
        protoAdapter.encodeWithTag(protoWriter, 9, startTimecardRequest.shift_schedule_published_version_token);
        protoWriter.writeBytes(startTimecardRequest.unknownFields());
    }
}
