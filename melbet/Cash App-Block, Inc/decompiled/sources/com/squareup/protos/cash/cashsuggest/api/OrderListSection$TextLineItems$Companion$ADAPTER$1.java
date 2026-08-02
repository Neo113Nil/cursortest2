package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.OrderListSection;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class OrderListSection$TextLineItems$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OrderListSection.TextLineItems(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(LocalizedString.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OrderListSection.TextLineItems textLineItems = (OrderListSection.TextLineItems) obj;
        reverseProtoWriter.getClass();
        textLineItems.getClass();
        reverseProtoWriter.writeBytes(textLineItems.unknownFields());
        LocalizedString.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, textLineItems.line_items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OrderListSection.TextLineItems textLineItems = (OrderListSection.TextLineItems) obj;
        textLineItems.getClass();
        return LocalizedString.ADAPTER.asRepeated().encodedSizeWithTag(1, textLineItems.line_items) + textLineItems.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OrderListSection.TextLineItems textLineItems = (OrderListSection.TextLineItems) obj;
        textLineItems.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(textLineItems.line_items, LocalizedString.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new OrderListSection.TextLineItems(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OrderListSection.TextLineItems textLineItems = (OrderListSection.TextLineItems) obj;
        textLineItems.getClass();
        LocalizedString.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, textLineItems.line_items);
        protoWriter.writeBytes(textLineItems.unknownFields());
    }
}
