package com.squareup.protos.cash.cashtes.app.v1beta1;

import com.squareup.protos.cash.cashtes.app.v1beta1.UserDataResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UserDataResponse$InteractionEvents$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UserDataResponse.InteractionEvents((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UserDataResponse.InteractionEvents interactionEvents = (UserDataResponse.InteractionEvents) obj;
        reverseProtoWriter.getClass();
        interactionEvents.getClass();
        reverseProtoWriter.writeBytes(interactionEvents.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, interactionEvents.show_badge);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UserDataResponse.InteractionEvents interactionEvents = (UserDataResponse.InteractionEvents) obj;
        interactionEvents.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, interactionEvents.show_badge) + interactionEvents.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UserDataResponse.InteractionEvents interactionEvents = (UserDataResponse.InteractionEvents) obj;
        interactionEvents.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = interactionEvents.show_badge;
        byteString.getClass();
        return new UserDataResponse.InteractionEvents(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UserDataResponse.InteractionEvents interactionEvents = (UserDataResponse.InteractionEvents) obj;
        interactionEvents.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, interactionEvents.show_badge);
        protoWriter.writeBytes(interactionEvents.unknownFields());
    }
}
