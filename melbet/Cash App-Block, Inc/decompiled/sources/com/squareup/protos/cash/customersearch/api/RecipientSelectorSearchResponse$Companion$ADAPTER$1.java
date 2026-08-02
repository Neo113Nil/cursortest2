package com.squareup.protos.cash.customersearch.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorSearchResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RecipientSelectorSearchResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RecipientSelectorSearchResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(RecipientSelectorSearchResponse.Section.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RecipientSelectorSearchResponse recipientSelectorSearchResponse = (RecipientSelectorSearchResponse) obj;
        reverseProtoWriter.getClass();
        recipientSelectorSearchResponse.getClass();
        reverseProtoWriter.writeBytes(recipientSelectorSearchResponse.unknownFields());
        RecipientSelectorSearchResponse.Section.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, recipientSelectorSearchResponse.sections);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RecipientSelectorSearchResponse recipientSelectorSearchResponse = (RecipientSelectorSearchResponse) obj;
        recipientSelectorSearchResponse.getClass();
        return RecipientSelectorSearchResponse.Section.ADAPTER.asRepeated().encodedSizeWithTag(1, recipientSelectorSearchResponse.sections) + recipientSelectorSearchResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RecipientSelectorSearchResponse recipientSelectorSearchResponse = (RecipientSelectorSearchResponse) obj;
        recipientSelectorSearchResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(recipientSelectorSearchResponse.sections, RecipientSelectorSearchResponse.Section.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RecipientSelectorSearchResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RecipientSelectorSearchResponse recipientSelectorSearchResponse = (RecipientSelectorSearchResponse) obj;
        recipientSelectorSearchResponse.getClass();
        RecipientSelectorSearchResponse.Section.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, recipientSelectorSearchResponse.sections);
        protoWriter.writeBytes(recipientSelectorSearchResponse.unknownFields());
    }
}
