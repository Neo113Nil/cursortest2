package com.squareup.protos.cash.supportal.app;

import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzlo;
import com.squareup.protos.cash.supportal.app.SupportChatStatusResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SupportChatStatusResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        zzlo zzloVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SupportChatStatusResponse((Boolean) obj, (Long) obj2, (Long) obj3, (Long) obj4, (Long) obj5, m, (String) obj6, zzloVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 2:
                    obj = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 3:
                    obj4 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 4:
                    zzloVar = new SupportChatStatusResponse$Access$Granted((SupportChatStatusResponse.Granted) SupportChatStatusResponse.Granted.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    zzloVar = new SupportChatStatusResponse$Access$Denied((SupportChatStatusResponse.Denied) SupportChatStatusResponse.Denied.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    obj2 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 7:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 8:
                    obj5 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 9:
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 10:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SupportChatStatusResponse supportChatStatusResponse = (SupportChatStatusResponse) obj;
        reverseProtoWriter.getClass();
        supportChatStatusResponse.getClass();
        reverseProtoWriter.writeBytes(supportChatStatusResponse.unknownFields());
        zzlo zzloVar = supportChatStatusResponse.access;
        if (zzloVar instanceof SupportChatStatusResponse$Access$Granted) {
            SupportChatStatusResponse.Granted.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((SupportChatStatusResponse$Access$Granted) zzloVar).value);
        } else if (zzloVar instanceof SupportChatStatusResponse$Access$Denied) {
            SupportChatStatusResponse.Denied.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((SupportChatStatusResponse$Access$Denied) zzloVar).value);
        } else if (zzloVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, supportChatStatusResponse.availability_subtitle);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 9, supportChatStatusResponse.ignored_phrases);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, supportChatStatusResponse.next_customer_service_end_time);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, supportChatStatusResponse.next_customer_service_open_time);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, supportChatStatusResponse.current_customer_service_end_time);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, supportChatStatusResponse.current_customer_service_open_time);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, supportChatStatusResponse.customer_service_available);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        SupportChatStatusResponse supportChatStatusResponse = (SupportChatStatusResponse) obj;
        supportChatStatusResponse.getClass();
        int encodedSizeWithTag2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, supportChatStatusResponse.customer_service_available) + supportChatStatusResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(8, supportChatStatusResponse.next_customer_service_end_time) + protoAdapter.encodedSizeWithTag(3, supportChatStatusResponse.next_customer_service_open_time) + protoAdapter.encodedSizeWithTag(7, supportChatStatusResponse.current_customer_service_end_time) + protoAdapter.encodedSizeWithTag(6, supportChatStatusResponse.current_customer_service_open_time) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag4 = protoAdapter2.encodedSizeWithTag(10, supportChatStatusResponse.availability_subtitle) + protoAdapter2.asRepeated().encodedSizeWithTag(9, supportChatStatusResponse.ignored_phrases) + encodedSizeWithTag3;
        zzlo zzloVar = supportChatStatusResponse.access;
        if (zzloVar instanceof SupportChatStatusResponse$Access$Granted) {
            encodedSizeWithTag = SupportChatStatusResponse.Granted.ADAPTER.encodedSizeWithTag(4, ((SupportChatStatusResponse$Access$Granted) zzloVar).value);
        } else {
            if (!(zzloVar instanceof SupportChatStatusResponse$Access$Denied)) {
                if (zzloVar == null) {
                    return encodedSizeWithTag4;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = SupportChatStatusResponse.Denied.ADAPTER.encodedSizeWithTag(5, ((SupportChatStatusResponse$Access$Denied) zzloVar).value);
        }
        return encodedSizeWithTag + encodedSizeWithTag4;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SupportChatStatusResponse supportChatStatusResponse = (SupportChatStatusResponse) obj;
        supportChatStatusResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = supportChatStatusResponse.customer_service_available;
        Long l = supportChatStatusResponse.current_customer_service_open_time;
        Long l2 = supportChatStatusResponse.current_customer_service_end_time;
        Long l3 = supportChatStatusResponse.next_customer_service_open_time;
        Long l4 = supportChatStatusResponse.next_customer_service_end_time;
        List list = supportChatStatusResponse.ignored_phrases;
        String str = supportChatStatusResponse.availability_subtitle;
        zzlo zzloVar = supportChatStatusResponse.access;
        list.getClass();
        byteString.getClass();
        return new SupportChatStatusResponse(bool, l, l2, l3, l4, list, str, zzloVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SupportChatStatusResponse supportChatStatusResponse = (SupportChatStatusResponse) obj;
        supportChatStatusResponse.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, supportChatStatusResponse.customer_service_available);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 6, supportChatStatusResponse.current_customer_service_open_time);
        protoAdapter.encodeWithTag(protoWriter, 7, supportChatStatusResponse.current_customer_service_end_time);
        protoAdapter.encodeWithTag(protoWriter, 3, supportChatStatusResponse.next_customer_service_open_time);
        protoAdapter.encodeWithTag(protoWriter, 8, supportChatStatusResponse.next_customer_service_end_time);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 9, supportChatStatusResponse.ignored_phrases);
        protoAdapter2.encodeWithTag(protoWriter, 10, supportChatStatusResponse.availability_subtitle);
        zzlo zzloVar = supportChatStatusResponse.access;
        if (zzloVar instanceof SupportChatStatusResponse$Access$Granted) {
            SupportChatStatusResponse.Granted.ADAPTER.encodeWithTag(protoWriter, 4, ((SupportChatStatusResponse$Access$Granted) zzloVar).value);
        } else if (zzloVar instanceof SupportChatStatusResponse$Access$Denied) {
            SupportChatStatusResponse.Denied.ADAPTER.encodeWithTag(protoWriter, 5, ((SupportChatStatusResponse$Access$Denied) zzloVar).value);
        } else if (zzloVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(supportChatStatusResponse.unknownFields());
    }
}
