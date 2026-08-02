package com.squareup.protos.cash.recipientsuggestion;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SuggestedRecipient$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SuggestedRecipient((String) obj, (Double) obj2, (SuggestionSource) obj3, (CustomerData) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.DOUBLE.decode(protoReader);
            } else if (nextTag == 3) {
                try {
                    obj3 = SuggestionSource.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(CustomerData.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SuggestedRecipient suggestedRecipient = (SuggestedRecipient) obj;
        reverseProtoWriter.getClass();
        suggestedRecipient.getClass();
        reverseProtoWriter.writeBytes(suggestedRecipient.unknownFields());
        CustomerData.ADAPTER.encodeWithTag(reverseProtoWriter, 4, suggestedRecipient.customer_data);
        SuggestionSource.ADAPTER.encodeWithTag(reverseProtoWriter, 3, suggestedRecipient.source);
        ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 2, suggestedRecipient.score);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, suggestedRecipient.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SuggestedRecipient suggestedRecipient = (SuggestedRecipient) obj;
        suggestedRecipient.getClass();
        return CustomerData.ADAPTER.encodedSizeWithTag(4, suggestedRecipient.customer_data) + SuggestionSource.ADAPTER.encodedSizeWithTag(3, suggestedRecipient.source) + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, suggestedRecipient.score) + ProtoAdapter.STRING.encodedSizeWithTag(1, suggestedRecipient.customer_token) + suggestedRecipient.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SuggestedRecipient suggestedRecipient = (SuggestedRecipient) obj;
        suggestedRecipient.getClass();
        CustomerData customerData = suggestedRecipient.customer_data;
        CustomerData customerData2 = customerData != null ? (CustomerData) CustomerData.ADAPTER.redact(customerData) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = suggestedRecipient.customer_token;
        Double d = suggestedRecipient.score;
        SuggestionSource suggestionSource = suggestedRecipient.source;
        byteString.getClass();
        return new SuggestedRecipient(str, d, suggestionSource, customerData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SuggestedRecipient suggestedRecipient = (SuggestedRecipient) obj;
        suggestedRecipient.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, suggestedRecipient.customer_token);
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, suggestedRecipient.score);
        SuggestionSource.ADAPTER.encodeWithTag(protoWriter, 3, suggestedRecipient.source);
        CustomerData.ADAPTER.encodeWithTag(protoWriter, 4, suggestedRecipient.customer_data);
        protoWriter.writeBytes(suggestedRecipient.unknownFields());
    }
}
