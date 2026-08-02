package com.squareup.protos.cash.cashtes.app.v1beta1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashtes.app.v1beta1.UserData2Response;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UserData2Response$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UserData2Response((Boolean) obj3, (UserData2Response.InteractionEvents) obj4, (ReturnStatus) obj5, (String) obj6, (String) obj7, (Integer) obj8, (String) obj9, (String) obj10, (Boolean) obj11, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    continue;
                case 2:
                    obj4 = TransactorKt.decodeMessageOrMerge(UserData2Response.InteractionEvents.ADAPTER, protoReader, obj4);
                    continue;
                case 3:
                    try {
                        obj5 = ReturnStatus.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj5;
                        obj2 = obj6;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 5:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 6:
                    obj8 = ProtoAdapter.INT32.decode(protoReader);
                    continue;
                case 7:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 8:
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 9:
                    obj11 = ProtoAdapter.BOOL.decode(protoReader);
                    continue;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj5;
                    obj2 = obj6;
                    break;
            }
            obj6 = obj2;
            obj5 = obj;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UserData2Response userData2Response = (UserData2Response) obj;
        reverseProtoWriter.getClass();
        userData2Response.getClass();
        reverseProtoWriter.writeBytes(userData2Response.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, userData2Response.has_bitcoin_availability);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, userData2Response.header_regular);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, userData2Response.header_emphasized);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 6, userData2Response.progress_percent);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, userData2Response.subheader);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, userData2Response.header);
        ReturnStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 3, userData2Response.progress);
        UserData2Response.InteractionEvents.ADAPTER.encodeWithTag(reverseProtoWriter, 2, userData2Response.event_status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, userData2Response.has_consented);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UserData2Response userData2Response = (UserData2Response) obj;
        userData2Response.getClass();
        int size$okio = userData2Response.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        int encodedSizeWithTag = ReturnStatus.ADAPTER.encodedSizeWithTag(3, userData2Response.progress) + UserData2Response.InteractionEvents.ADAPTER.encodedSizeWithTag(2, userData2Response.event_status) + protoAdapter.encodedSizeWithTag(1, userData2Response.has_consented) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(9, userData2Response.has_bitcoin_availability) + protoAdapter2.encodedSizeWithTag(8, userData2Response.header_regular) + protoAdapter2.encodedSizeWithTag(7, userData2Response.header_emphasized) + ProtoAdapter.INT32.encodedSizeWithTag(6, userData2Response.progress_percent) + protoAdapter2.encodedSizeWithTag(5, userData2Response.subheader) + protoAdapter2.encodedSizeWithTag(4, userData2Response.header) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UserData2Response userData2Response = (UserData2Response) obj;
        userData2Response.getClass();
        UserData2Response.InteractionEvents interactionEvents = userData2Response.event_status;
        UserData2Response.InteractionEvents interactionEvents2 = interactionEvents != null ? (UserData2Response.InteractionEvents) UserData2Response.InteractionEvents.ADAPTER.redact(interactionEvents) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = userData2Response.has_consented;
        byteString.getClass();
        return new UserData2Response(bool, interactionEvents2, null, null, null, null, null, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UserData2Response userData2Response = (UserData2Response) obj;
        userData2Response.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, userData2Response.has_consented);
        UserData2Response.InteractionEvents.ADAPTER.encodeWithTag(protoWriter, 2, userData2Response.event_status);
        ReturnStatus.ADAPTER.encodeWithTag(protoWriter, 3, userData2Response.progress);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 4, userData2Response.header);
        protoAdapter2.encodeWithTag(protoWriter, 5, userData2Response.subheader);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, userData2Response.progress_percent);
        protoAdapter2.encodeWithTag(protoWriter, 7, userData2Response.header_emphasized);
        protoAdapter2.encodeWithTag(protoWriter, 8, userData2Response.header_regular);
        protoAdapter.encodeWithTag(protoWriter, 9, userData2Response.has_bitcoin_availability);
        protoWriter.writeBytes(userData2Response.unknownFields());
    }
}
