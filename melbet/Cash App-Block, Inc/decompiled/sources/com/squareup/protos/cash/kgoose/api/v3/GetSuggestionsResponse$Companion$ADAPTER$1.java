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

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/GetSuggestionsResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetSuggestionsResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetSuggestionsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSuggestionsResponse(m, (String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Suggestion.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSuggestionsResponse getSuggestionsResponse = (GetSuggestionsResponse) obj;
        reverseProtoWriter.getClass();
        getSuggestionsResponse.getClass();
        reverseProtoWriter.writeBytes(getSuggestionsResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, getSuggestionsResponse.suggestions_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, getSuggestionsResponse.title);
        Suggestion.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getSuggestionsResponse.suggestions);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSuggestionsResponse getSuggestionsResponse = (GetSuggestionsResponse) obj;
        getSuggestionsResponse.getClass();
        int encodedSizeWithTag = Suggestion.ADAPTER.asRepeated().encodedSizeWithTag(1, getSuggestionsResponse.suggestions) + getSuggestionsResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, getSuggestionsResponse.suggestions_id) + protoAdapter.encodedSizeWithTag(2, getSuggestionsResponse.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSuggestionsResponse getSuggestionsResponse = (GetSuggestionsResponse) obj;
        getSuggestionsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getSuggestionsResponse.suggestions, Suggestion.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = getSuggestionsResponse.title;
        String str2 = getSuggestionsResponse.suggestions_id;
        byteString.getClass();
        return new GetSuggestionsResponse(m1169redactElements, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSuggestionsResponse getSuggestionsResponse = (GetSuggestionsResponse) obj;
        getSuggestionsResponse.getClass();
        Suggestion.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getSuggestionsResponse.suggestions);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, getSuggestionsResponse.title);
        protoAdapter.encodeWithTag(protoWriter, 3, getSuggestionsResponse.suggestions_id);
        protoWriter.writeBytes(getSuggestionsResponse.unknownFields());
    }
}
