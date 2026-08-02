package com.squareup.protos.cash.customersearch.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.customersearch.api.SearchCommonCardSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SearchCommonCardSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SearchCommonCardSection(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(SearchCommonCardSection.SearchCommonCardItem.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SearchCommonCardSection searchCommonCardSection = (SearchCommonCardSection) obj;
        reverseProtoWriter.getClass();
        searchCommonCardSection.getClass();
        reverseProtoWriter.writeBytes(searchCommonCardSection.unknownFields());
        SearchCommonCardSection.SearchCommonCardItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, searchCommonCardSection.items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SearchCommonCardSection searchCommonCardSection = (SearchCommonCardSection) obj;
        searchCommonCardSection.getClass();
        return SearchCommonCardSection.SearchCommonCardItem.ADAPTER.asRepeated().encodedSizeWithTag(1, searchCommonCardSection.items) + searchCommonCardSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SearchCommonCardSection searchCommonCardSection = (SearchCommonCardSection) obj;
        searchCommonCardSection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(searchCommonCardSection.items, SearchCommonCardSection.SearchCommonCardItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SearchCommonCardSection(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SearchCommonCardSection searchCommonCardSection = (SearchCommonCardSection) obj;
        searchCommonCardSection.getClass();
        SearchCommonCardSection.SearchCommonCardItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, searchCommonCardSection.items);
        protoWriter.writeBytes(searchCommonCardSection.unknownFields());
    }
}
