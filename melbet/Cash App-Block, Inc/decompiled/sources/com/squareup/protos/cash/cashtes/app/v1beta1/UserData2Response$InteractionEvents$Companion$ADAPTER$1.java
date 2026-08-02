package com.squareup.protos.cash.cashtes.app.v1beta1;

import com.squareup.protos.cash.cashtes.app.v1beta1.UserData2Response;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UserData2Response$InteractionEvents$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UserData2Response.InteractionEvents((String) obj2, (Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UserData2Response.InteractionEvents interactionEvents = (UserData2Response.InteractionEvents) obj;
        reverseProtoWriter.getClass();
        interactionEvents.getClass();
        reverseProtoWriter.writeBytes(interactionEvents.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, interactionEvents.badge_text);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, interactionEvents.show_badge);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UserData2Response.InteractionEvents interactionEvents = (UserData2Response.InteractionEvents) obj;
        interactionEvents.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, interactionEvents.badge_text) + ProtoAdapter.BOOL.encodedSizeWithTag(1, interactionEvents.show_badge) + interactionEvents.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UserData2Response.InteractionEvents interactionEvents = (UserData2Response.InteractionEvents) obj;
        interactionEvents.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = interactionEvents.show_badge;
        byteString.getClass();
        return new UserData2Response.InteractionEvents(null, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UserData2Response.InteractionEvents interactionEvents = (UserData2Response.InteractionEvents) obj;
        interactionEvents.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, interactionEvents.show_badge);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, interactionEvents.badge_text);
        protoWriter.writeBytes(interactionEvents.unknownFields());
    }
}
