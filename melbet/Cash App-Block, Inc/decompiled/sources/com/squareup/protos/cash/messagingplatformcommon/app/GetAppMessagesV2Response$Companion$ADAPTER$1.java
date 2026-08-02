package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetAppMessagesV2Response$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAppMessagesV2Response(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(AppMessage.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAppMessagesV2Response getAppMessagesV2Response = (GetAppMessagesV2Response) obj;
        reverseProtoWriter.getClass();
        getAppMessagesV2Response.getClass();
        reverseProtoWriter.writeBytes(getAppMessagesV2Response.unknownFields());
        AppMessage.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getAppMessagesV2Response.messages);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAppMessagesV2Response getAppMessagesV2Response = (GetAppMessagesV2Response) obj;
        getAppMessagesV2Response.getClass();
        return AppMessage.ADAPTER.asRepeated().encodedSizeWithTag(1, getAppMessagesV2Response.messages) + getAppMessagesV2Response.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAppMessagesV2Response getAppMessagesV2Response = (GetAppMessagesV2Response) obj;
        getAppMessagesV2Response.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getAppMessagesV2Response.messages, AppMessage.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetAppMessagesV2Response(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAppMessagesV2Response getAppMessagesV2Response = (GetAppMessagesV2Response) obj;
        getAppMessagesV2Response.getClass();
        AppMessage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getAppMessagesV2Response.messages);
        protoWriter.writeBytes(getAppMessagesV2Response.unknownFields());
    }
}
