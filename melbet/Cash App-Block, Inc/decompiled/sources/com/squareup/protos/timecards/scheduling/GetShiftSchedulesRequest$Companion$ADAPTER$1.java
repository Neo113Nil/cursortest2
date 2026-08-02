package com.squareup.protos.timecards.scheduling;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetShiftSchedulesRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetShiftSchedulesRequest((String) obj3, m, arrayList, arrayList2, (String) obj4, (String) obj5, (String) obj6, (OpenShiftsFilter) obj7, (String) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    obj = obj3;
                    obj2 = obj4;
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 3:
                    obj = obj3;
                    obj2 = obj4;
                    arrayList.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 4:
                case 6:
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj3;
                    obj2 = obj4;
                    break;
                case 5:
                    obj = obj3;
                    obj2 = obj4;
                    arrayList2.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 7:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 8:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 9:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 10:
                    try {
                        obj7 = OpenShiftsFilter.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj3;
                        obj2 = obj4;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 11:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
            }
            obj3 = obj;
            obj4 = obj2;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetShiftSchedulesRequest getShiftSchedulesRequest = (GetShiftSchedulesRequest) obj;
        reverseProtoWriter.getClass();
        getShiftSchedulesRequest.getClass();
        reverseProtoWriter.writeBytes(getShiftSchedulesRequest.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, getShiftSchedulesRequest.datetime_range_time_zone);
        OpenShiftsFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 10, getShiftSchedulesRequest.open_shifts_filter);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, getShiftSchedulesRequest.cursor);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, getShiftSchedulesRequest.stop_datetime);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, getShiftSchedulesRequest.start_datetime);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 5, getShiftSchedulesRequest.job_ids);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, getShiftSchedulesRequest.team_member_ids);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, getShiftSchedulesRequest.location_ids);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, getShiftSchedulesRequest._accept_language);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetShiftSchedulesRequest getShiftSchedulesRequest = (GetShiftSchedulesRequest) obj;
        getShiftSchedulesRequest.getClass();
        int size$okio = getShiftSchedulesRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(11, getShiftSchedulesRequest.datetime_range_time_zone) + OpenShiftsFilter.ADAPTER.encodedSizeWithTag(10, getShiftSchedulesRequest.open_shifts_filter) + protoAdapter.encodedSizeWithTag(9, getShiftSchedulesRequest.cursor) + protoAdapter.encodedSizeWithTag(8, getShiftSchedulesRequest.stop_datetime) + protoAdapter.encodedSizeWithTag(7, getShiftSchedulesRequest.start_datetime) + protoAdapter.asRepeated().encodedSizeWithTag(5, getShiftSchedulesRequest.job_ids) + protoAdapter.asRepeated().encodedSizeWithTag(3, getShiftSchedulesRequest.team_member_ids) + protoAdapter.asRepeated().encodedSizeWithTag(2, getShiftSchedulesRequest.location_ids) + protoAdapter.encodedSizeWithTag(1, getShiftSchedulesRequest._accept_language) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetShiftSchedulesRequest getShiftSchedulesRequest = (GetShiftSchedulesRequest) obj;
        getShiftSchedulesRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = getShiftSchedulesRequest._accept_language;
        List list = getShiftSchedulesRequest.location_ids;
        List list2 = getShiftSchedulesRequest.team_member_ids;
        List list3 = getShiftSchedulesRequest.job_ids;
        String str2 = getShiftSchedulesRequest.start_datetime;
        String str3 = getShiftSchedulesRequest.stop_datetime;
        String str4 = getShiftSchedulesRequest.cursor;
        OpenShiftsFilter openShiftsFilter = getShiftSchedulesRequest.open_shifts_filter;
        String str5 = getShiftSchedulesRequest.datetime_range_time_zone;
        list.getClass();
        list2.getClass();
        list3.getClass();
        byteString.getClass();
        return new GetShiftSchedulesRequest(str, list, list2, list3, str2, str3, str4, openShiftsFilter, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetShiftSchedulesRequest getShiftSchedulesRequest = (GetShiftSchedulesRequest) obj;
        getShiftSchedulesRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, getShiftSchedulesRequest._accept_language);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, getShiftSchedulesRequest.location_ids);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, getShiftSchedulesRequest.team_member_ids);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 5, getShiftSchedulesRequest.job_ids);
        protoAdapter.encodeWithTag(protoWriter, 7, getShiftSchedulesRequest.start_datetime);
        protoAdapter.encodeWithTag(protoWriter, 8, getShiftSchedulesRequest.stop_datetime);
        protoAdapter.encodeWithTag(protoWriter, 9, getShiftSchedulesRequest.cursor);
        OpenShiftsFilter.ADAPTER.encodeWithTag(protoWriter, 10, getShiftSchedulesRequest.open_shifts_filter);
        protoAdapter.encodeWithTag(protoWriter, 11, getShiftSchedulesRequest.datetime_range_time_zone);
        protoWriter.writeBytes(getShiftSchedulesRequest.unknownFields());
    }
}
