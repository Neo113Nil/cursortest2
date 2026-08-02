package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/SuggestionList$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/SuggestionList;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SuggestionList$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SuggestionList(m, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Suggestion.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SuggestionList suggestionList = (SuggestionList) obj;
        reverseProtoWriter.getClass();
        suggestionList.getClass();
        reverseProtoWriter.writeBytes(suggestionList.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, suggestionList.suggestions_id);
        Suggestion.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, suggestionList.suggestions);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SuggestionList suggestionList = (SuggestionList) obj;
        suggestionList.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, suggestionList.suggestions_id) + Suggestion.ADAPTER.asRepeated().encodedSizeWithTag(1, suggestionList.suggestions) + suggestionList.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SuggestionList suggestionList = (SuggestionList) obj;
        suggestionList.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(suggestionList.suggestions, Suggestion.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = suggestionList.suggestions_id;
        byteString.getClass();
        return new SuggestionList(m1169redactElements, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SuggestionList suggestionList = (SuggestionList) obj;
        suggestionList.getClass();
        Suggestion.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, suggestionList.suggestions);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, suggestionList.suggestions_id);
        protoWriter.writeBytes(suggestionList.unknownFields());
    }
}
