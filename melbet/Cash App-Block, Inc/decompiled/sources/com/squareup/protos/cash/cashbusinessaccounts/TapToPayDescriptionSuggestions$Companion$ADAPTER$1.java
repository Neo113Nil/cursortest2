package com.squareup.protos.cash.cashbusinessaccounts;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TapToPayDescriptionSuggestions$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TapToPayDescriptionSuggestions(m, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TapToPayDescriptionSuggestions tapToPayDescriptionSuggestions = (TapToPayDescriptionSuggestions) obj;
        reverseProtoWriter.getClass();
        tapToPayDescriptionSuggestions.getClass();
        reverseProtoWriter.writeBytes(tapToPayDescriptionSuggestions.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, tapToPayDescriptionSuggestions.payment_description_suggestion_algorithm);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 1, tapToPayDescriptionSuggestions.payment_description_suggestions);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TapToPayDescriptionSuggestions tapToPayDescriptionSuggestions = (TapToPayDescriptionSuggestions) obj;
        tapToPayDescriptionSuggestions.getClass();
        int size$okio = tapToPayDescriptionSuggestions.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, tapToPayDescriptionSuggestions.payment_description_suggestion_algorithm) + protoAdapter.asRepeated().encodedSizeWithTag(1, tapToPayDescriptionSuggestions.payment_description_suggestions) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TapToPayDescriptionSuggestions tapToPayDescriptionSuggestions = (TapToPayDescriptionSuggestions) obj;
        tapToPayDescriptionSuggestions.getClass();
        EmptyList emptyList = EmptyList.INSTANCE;
        ByteString byteString = ByteString.EMPTY;
        String str = tapToPayDescriptionSuggestions.payment_description_suggestion_algorithm;
        emptyList.getClass();
        byteString.getClass();
        return new TapToPayDescriptionSuggestions(emptyList, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TapToPayDescriptionSuggestions tapToPayDescriptionSuggestions = (TapToPayDescriptionSuggestions) obj;
        tapToPayDescriptionSuggestions.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, tapToPayDescriptionSuggestions.payment_description_suggestions);
        protoAdapter.encodeWithTag(protoWriter, 2, tapToPayDescriptionSuggestions.payment_description_suggestion_algorithm);
        protoWriter.writeBytes(tapToPayDescriptionSuggestions.unknownFields());
    }
}
