package com.squareup.protos.timecards.scheduling;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.timecards.scheduling.ShiftCover;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ShiftCover$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList3 = new ArrayList();
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ShiftCover((String) obj2, (String) obj3, (String) obj4, (ShiftCover.Status) obj5, m, arrayList3, (String) obj6, (String) obj7, (String) obj8, (String) obj9, (String) obj10, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    arrayList = m;
                    arrayList2 = arrayList3;
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    arrayList = m;
                    arrayList2 = arrayList3;
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    arrayList = m;
                    arrayList2 = arrayList3;
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    try {
                        obj5 = ShiftCover.Status.ADAPTER.decode(protoReader);
                        arrayList = m;
                        arrayList2 = arrayList3;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj2;
                        arrayList = m;
                        arrayList2 = arrayList3;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 5:
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    obj = obj2;
                    arrayList = m;
                    arrayList2 = arrayList3;
                    obj2 = obj;
                    break;
                case 6:
                    arrayList3.add(ProtoAdapter.STRING.decode(protoReader));
                    obj = obj2;
                    arrayList = m;
                    arrayList2 = arrayList3;
                    obj2 = obj;
                    break;
                case 7:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    arrayList2 = arrayList3;
                    break;
                case 8:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    arrayList2 = arrayList3;
                    break;
                case 9:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    arrayList2 = arrayList3;
                    break;
                case 10:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    arrayList2 = arrayList3;
                    break;
                case 11:
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    arrayList2 = arrayList3;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj2;
                    arrayList = m;
                    arrayList2 = arrayList3;
                    obj2 = obj;
                    break;
            }
            m = arrayList;
            arrayList3 = arrayList2;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ShiftCover shiftCover = (ShiftCover) obj;
        reverseProtoWriter.getClass();
        shiftCover.getClass();
        reverseProtoWriter.writeBytes(shiftCover.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, shiftCover.successor_shift_schedule_version_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, shiftCover.updated_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, shiftCover.successor_employee_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, shiftCover.shift_schedule_version_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, shiftCover.original_employee_token);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 6, shiftCover.declined_employee_tokens);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 5, shiftCover.accepted_employee_tokens);
        ShiftCover.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 4, shiftCover.status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, shiftCover.shift_schedule_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, shiftCover.shift_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, shiftCover.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ShiftCover shiftCover = (ShiftCover) obj;
        shiftCover.getClass();
        int size$okio = shiftCover.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(11, shiftCover.successor_shift_schedule_version_token) + protoAdapter.encodedSizeWithTag(10, shiftCover.updated_at) + protoAdapter.encodedSizeWithTag(9, shiftCover.successor_employee_token) + protoAdapter.encodedSizeWithTag(8, shiftCover.shift_schedule_version_token) + protoAdapter.encodedSizeWithTag(7, shiftCover.original_employee_token) + protoAdapter.asRepeated().encodedSizeWithTag(6, shiftCover.declined_employee_tokens) + protoAdapter.asRepeated().encodedSizeWithTag(5, shiftCover.accepted_employee_tokens) + ShiftCover.Status.ADAPTER.encodedSizeWithTag(4, shiftCover.status) + protoAdapter.encodedSizeWithTag(3, shiftCover.shift_schedule_token) + protoAdapter.encodedSizeWithTag(2, shiftCover.shift_token) + protoAdapter.encodedSizeWithTag(1, shiftCover.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ShiftCover shiftCover = (ShiftCover) obj;
        shiftCover.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = shiftCover.token;
        String str2 = shiftCover.shift_token;
        String str3 = shiftCover.shift_schedule_token;
        ShiftCover.Status status = shiftCover.status;
        List list = shiftCover.accepted_employee_tokens;
        List list2 = shiftCover.declined_employee_tokens;
        String str4 = shiftCover.original_employee_token;
        String str5 = shiftCover.shift_schedule_version_token;
        String str6 = shiftCover.successor_employee_token;
        String str7 = shiftCover.updated_at;
        String str8 = shiftCover.successor_shift_schedule_version_token;
        list.getClass();
        list2.getClass();
        byteString.getClass();
        return new ShiftCover(str, str2, str3, status, list, list2, str4, str5, str6, str7, str8, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ShiftCover shiftCover = (ShiftCover) obj;
        shiftCover.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, shiftCover.token);
        protoAdapter.encodeWithTag(protoWriter, 2, shiftCover.shift_token);
        protoAdapter.encodeWithTag(protoWriter, 3, shiftCover.shift_schedule_token);
        ShiftCover.Status.ADAPTER.encodeWithTag(protoWriter, 4, shiftCover.status);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 5, shiftCover.accepted_employee_tokens);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 6, shiftCover.declined_employee_tokens);
        protoAdapter.encodeWithTag(protoWriter, 7, shiftCover.original_employee_token);
        protoAdapter.encodeWithTag(protoWriter, 8, shiftCover.shift_schedule_version_token);
        protoAdapter.encodeWithTag(protoWriter, 9, shiftCover.successor_employee_token);
        protoAdapter.encodeWithTag(protoWriter, 10, shiftCover.updated_at);
        protoAdapter.encodeWithTag(protoWriter, 11, shiftCover.successor_shift_schedule_version_token);
        protoWriter.writeBytes(shiftCover.unknownFields());
    }
}
