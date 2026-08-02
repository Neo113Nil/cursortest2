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
public final class GetAppMessagesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAppMessagesResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        GetAppMessagesResponse getAppMessagesResponse = (GetAppMessagesResponse) obj;
        reverseProtoWriter.getClass();
        getAppMessagesResponse.getClass();
        reverseProtoWriter.writeBytes(getAppMessagesResponse.unknownFields());
        AppMessage.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getAppMessagesResponse.messages);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAppMessagesResponse getAppMessagesResponse = (GetAppMessagesResponse) obj;
        getAppMessagesResponse.getClass();
        return AppMessage.ADAPTER.asRepeated().encodedSizeWithTag(1, getAppMessagesResponse.messages) + getAppMessagesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAppMessagesResponse getAppMessagesResponse = (GetAppMessagesResponse) obj;
        getAppMessagesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getAppMessagesResponse.messages, AppMessage.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetAppMessagesResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAppMessagesResponse getAppMessagesResponse = (GetAppMessagesResponse) obj;
        getAppMessagesResponse.getClass();
        AppMessage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getAppMessagesResponse.messages);
        protoWriter.writeBytes(getAppMessagesResponse.unknownFields());
    }
}
