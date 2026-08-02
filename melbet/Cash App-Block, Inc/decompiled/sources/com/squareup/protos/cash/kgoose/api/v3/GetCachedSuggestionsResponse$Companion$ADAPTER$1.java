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

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/GetCachedSuggestionsResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetCachedSuggestionsResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetCachedSuggestionsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetCachedSuggestionsResponse(m, (String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        GetCachedSuggestionsResponse getCachedSuggestionsResponse = (GetCachedSuggestionsResponse) obj;
        reverseProtoWriter.getClass();
        getCachedSuggestionsResponse.getClass();
        reverseProtoWriter.writeBytes(getCachedSuggestionsResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, getCachedSuggestionsResponse.suggestions_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, getCachedSuggestionsResponse.title);
        Suggestion.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getCachedSuggestionsResponse.suggestions);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCachedSuggestionsResponse getCachedSuggestionsResponse = (GetCachedSuggestionsResponse) obj;
        getCachedSuggestionsResponse.getClass();
        int encodedSizeWithTag = Suggestion.ADAPTER.asRepeated().encodedSizeWithTag(1, getCachedSuggestionsResponse.suggestions) + getCachedSuggestionsResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, getCachedSuggestionsResponse.suggestions_id) + protoAdapter.encodedSizeWithTag(2, getCachedSuggestionsResponse.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCachedSuggestionsResponse getCachedSuggestionsResponse = (GetCachedSuggestionsResponse) obj;
        getCachedSuggestionsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getCachedSuggestionsResponse.suggestions, Suggestion.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = getCachedSuggestionsResponse.title;
        String str2 = getCachedSuggestionsResponse.suggestions_id;
        byteString.getClass();
        return new GetCachedSuggestionsResponse(m1169redactElements, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCachedSuggestionsResponse getCachedSuggestionsResponse = (GetCachedSuggestionsResponse) obj;
        getCachedSuggestionsResponse.getClass();
        Suggestion.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getCachedSuggestionsResponse.suggestions);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, getCachedSuggestionsResponse.title);
        protoAdapter.encodeWithTag(protoWriter, 3, getCachedSuggestionsResponse.suggestions_id);
        protoWriter.writeBytes(getCachedSuggestionsResponse.unknownFields());
    }
}
