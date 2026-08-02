package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ListMarketingMessagesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ListMarketingMessagesResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(MarketingMessage.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ListMarketingMessagesResponse listMarketingMessagesResponse = (ListMarketingMessagesResponse) obj;
        reverseProtoWriter.getClass();
        listMarketingMessagesResponse.getClass();
        reverseProtoWriter.writeBytes(listMarketingMessagesResponse.unknownFields());
        MarketingMessage.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, listMarketingMessagesResponse.marketing_messages);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ListMarketingMessagesResponse listMarketingMessagesResponse = (ListMarketingMessagesResponse) obj;
        listMarketingMessagesResponse.getClass();
        return MarketingMessage.ADAPTER.asRepeated().encodedSizeWithTag(1, listMarketingMessagesResponse.marketing_messages) + listMarketingMessagesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ListMarketingMessagesResponse listMarketingMessagesResponse = (ListMarketingMessagesResponse) obj;
        listMarketingMessagesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(listMarketingMessagesResponse.marketing_messages, MarketingMessage.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ListMarketingMessagesResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ListMarketingMessagesResponse listMarketingMessagesResponse = (ListMarketingMessagesResponse) obj;
        listMarketingMessagesResponse.getClass();
        MarketingMessage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, listMarketingMessagesResponse.marketing_messages);
        protoWriter.writeBytes(listMarketingMessagesResponse.unknownFields());
    }
}
