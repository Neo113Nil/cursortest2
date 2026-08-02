package com.squareup.protos.cash.recipientsuggestion;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RecipientSuggestions$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RecipientSuggestions(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(SuggestedRecipient.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RecipientSuggestions recipientSuggestions = (RecipientSuggestions) obj;
        reverseProtoWriter.getClass();
        recipientSuggestions.getClass();
        reverseProtoWriter.writeBytes(recipientSuggestions.unknownFields());
        SuggestedRecipient.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, recipientSuggestions.suggestions);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RecipientSuggestions recipientSuggestions = (RecipientSuggestions) obj;
        recipientSuggestions.getClass();
        return SuggestedRecipient.ADAPTER.asRepeated().encodedSizeWithTag(1, recipientSuggestions.suggestions) + recipientSuggestions.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RecipientSuggestions recipientSuggestions = (RecipientSuggestions) obj;
        recipientSuggestions.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(recipientSuggestions.suggestions, SuggestedRecipient.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RecipientSuggestions(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RecipientSuggestions recipientSuggestions = (RecipientSuggestions) obj;
        recipientSuggestions.getClass();
        SuggestedRecipient.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, recipientSuggestions.suggestions);
        protoWriter.writeBytes(recipientSuggestions.unknownFields());
    }
}
