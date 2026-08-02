package com.squareup.protos.cash.messagingplatformcommon.ondemand;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.messagingplatformcommon.ondemand.GetInAppMessagesResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetInAppMessagesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetInAppMessagesResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(GetInAppMessagesResponse.PlacementToMessages.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetInAppMessagesResponse getInAppMessagesResponse = (GetInAppMessagesResponse) obj;
        reverseProtoWriter.getClass();
        getInAppMessagesResponse.getClass();
        reverseProtoWriter.writeBytes(getInAppMessagesResponse.unknownFields());
        GetInAppMessagesResponse.PlacementToMessages.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getInAppMessagesResponse.placements_to_messages);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetInAppMessagesResponse getInAppMessagesResponse = (GetInAppMessagesResponse) obj;
        getInAppMessagesResponse.getClass();
        return GetInAppMessagesResponse.PlacementToMessages.ADAPTER.asRepeated().encodedSizeWithTag(1, getInAppMessagesResponse.placements_to_messages) + getInAppMessagesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetInAppMessagesResponse getInAppMessagesResponse = (GetInAppMessagesResponse) obj;
        getInAppMessagesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getInAppMessagesResponse.placements_to_messages, GetInAppMessagesResponse.PlacementToMessages.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetInAppMessagesResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetInAppMessagesResponse getInAppMessagesResponse = (GetInAppMessagesResponse) obj;
        getInAppMessagesResponse.getClass();
        GetInAppMessagesResponse.PlacementToMessages.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getInAppMessagesResponse.placements_to_messages);
        protoWriter.writeBytes(getInAppMessagesResponse.unknownFields());
    }
}
