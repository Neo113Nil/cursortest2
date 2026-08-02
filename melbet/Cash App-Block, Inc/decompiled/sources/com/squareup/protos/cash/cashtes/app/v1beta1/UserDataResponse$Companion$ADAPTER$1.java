package com.squareup.protos.cash.cashtes.app.v1beta1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashtes.app.v1beta1.UserDataResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UserDataResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UserDataResponse((Boolean) obj, (UserDataResponse.InteractionEvents) obj2, (ReturnStatus) obj3, (String) obj4, (String) obj5, (Integer) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(UserDataResponse.InteractionEvents.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    try {
                        obj3 = ReturnStatus.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UserDataResponse userDataResponse = (UserDataResponse) obj;
        reverseProtoWriter.getClass();
        userDataResponse.getClass();
        reverseProtoWriter.writeBytes(userDataResponse.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 6, userDataResponse.progress_percent);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, userDataResponse.subheader);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, userDataResponse.header);
        ReturnStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 3, userDataResponse.progress);
        UserDataResponse.InteractionEvents.ADAPTER.encodeWithTag(reverseProtoWriter, 2, userDataResponse.event_status);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, userDataResponse.has_consented);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UserDataResponse userDataResponse = (UserDataResponse) obj;
        userDataResponse.getClass();
        int encodedSizeWithTag = ReturnStatus.ADAPTER.encodedSizeWithTag(3, userDataResponse.progress) + UserDataResponse.InteractionEvents.ADAPTER.encodedSizeWithTag(2, userDataResponse.event_status) + ProtoAdapter.BOOL.encodedSizeWithTag(1, userDataResponse.has_consented) + userDataResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT32.encodedSizeWithTag(6, userDataResponse.progress_percent) + protoAdapter.encodedSizeWithTag(5, userDataResponse.subheader) + protoAdapter.encodedSizeWithTag(4, userDataResponse.header) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UserDataResponse userDataResponse = (UserDataResponse) obj;
        userDataResponse.getClass();
        UserDataResponse.InteractionEvents interactionEvents = userDataResponse.event_status;
        UserDataResponse.InteractionEvents interactionEvents2 = interactionEvents != null ? (UserDataResponse.InteractionEvents) UserDataResponse.InteractionEvents.ADAPTER.redact(interactionEvents) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = userDataResponse.has_consented;
        byteString.getClass();
        return new UserDataResponse(bool, interactionEvents2, null, null, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UserDataResponse userDataResponse = (UserDataResponse) obj;
        userDataResponse.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, userDataResponse.has_consented);
        UserDataResponse.InteractionEvents.ADAPTER.encodeWithTag(protoWriter, 2, userDataResponse.event_status);
        ReturnStatus.ADAPTER.encodeWithTag(protoWriter, 3, userDataResponse.progress);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 4, userDataResponse.header);
        protoAdapter.encodeWithTag(protoWriter, 5, userDataResponse.subheader);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, userDataResponse.progress_percent);
        protoWriter.writeBytes(userDataResponse.unknownFields());
    }
}
