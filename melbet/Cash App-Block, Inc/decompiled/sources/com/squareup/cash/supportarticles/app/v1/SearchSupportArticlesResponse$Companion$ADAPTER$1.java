package com.squareup.cash.supportarticles.app.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SearchSupportArticlesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SearchSupportArticlesResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(SupportLink.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SearchSupportArticlesResponse searchSupportArticlesResponse = (SearchSupportArticlesResponse) obj;
        reverseProtoWriter.getClass();
        searchSupportArticlesResponse.getClass();
        reverseProtoWriter.writeBytes(searchSupportArticlesResponse.unknownFields());
        SupportLink.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, searchSupportArticlesResponse.links);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SearchSupportArticlesResponse searchSupportArticlesResponse = (SearchSupportArticlesResponse) obj;
        searchSupportArticlesResponse.getClass();
        return SupportLink.ADAPTER.asRepeated().encodedSizeWithTag(1, searchSupportArticlesResponse.links) + searchSupportArticlesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SearchSupportArticlesResponse searchSupportArticlesResponse = (SearchSupportArticlesResponse) obj;
        searchSupportArticlesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(searchSupportArticlesResponse.links, SupportLink.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SearchSupportArticlesResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SearchSupportArticlesResponse searchSupportArticlesResponse = (SearchSupportArticlesResponse) obj;
        searchSupportArticlesResponse.getClass();
        SupportLink.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, searchSupportArticlesResponse.links);
        protoWriter.writeBytes(searchSupportArticlesResponse.unknownFields());
    }
}
