package com.squareup.protos.cash.messagingplatformcommon.ondemand;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.messagingplatformcommon.ondemand.GetInAppMessagesResponse;
import com.squareup.protos.cash.messagingplatformcommon.placements.Placement;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetInAppMessagesResponse$PlacementToMessages$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetInAppMessagesResponse.PlacementToMessages((Placement) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Placement.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(InAppMessage.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetInAppMessagesResponse.PlacementToMessages placementToMessages = (GetInAppMessagesResponse.PlacementToMessages) obj;
        reverseProtoWriter.getClass();
        placementToMessages.getClass();
        reverseProtoWriter.writeBytes(placementToMessages.unknownFields());
        InAppMessage.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, placementToMessages.messages);
        Placement.ADAPTER.encodeWithTag(reverseProtoWriter, 1, placementToMessages.placement);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetInAppMessagesResponse.PlacementToMessages placementToMessages = (GetInAppMessagesResponse.PlacementToMessages) obj;
        placementToMessages.getClass();
        return InAppMessage.ADAPTER.asRepeated().encodedSizeWithTag(2, placementToMessages.messages) + Placement.ADAPTER.encodedSizeWithTag(1, placementToMessages.placement) + placementToMessages.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetInAppMessagesResponse.PlacementToMessages placementToMessages = (GetInAppMessagesResponse.PlacementToMessages) obj;
        placementToMessages.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(placementToMessages.messages, InAppMessage.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Placement placement = placementToMessages.placement;
        byteString.getClass();
        return new GetInAppMessagesResponse.PlacementToMessages(placement, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetInAppMessagesResponse.PlacementToMessages placementToMessages = (GetInAppMessagesResponse.PlacementToMessages) obj;
        placementToMessages.getClass();
        Placement.ADAPTER.encodeWithTag(protoWriter, 1, placementToMessages.placement);
        InAppMessage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, placementToMessages.messages);
        protoWriter.writeBytes(placementToMessages.unknownFields());
    }
}
