package com.squareup.protos.cash.discover.api.app.v2.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.discover.api.app.v2.model.Section;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SearchResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SearchResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Section.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SearchResponse searchResponse = (SearchResponse) obj;
        reverseProtoWriter.getClass();
        searchResponse.getClass();
        reverseProtoWriter.writeBytes(searchResponse.unknownFields());
        Section.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, searchResponse.sections);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SearchResponse searchResponse = (SearchResponse) obj;
        searchResponse.getClass();
        return Section.ADAPTER.asRepeated().encodedSizeWithTag(1, searchResponse.sections) + searchResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SearchResponse searchResponse = (SearchResponse) obj;
        searchResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(searchResponse.sections, Section.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SearchResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SearchResponse searchResponse = (SearchResponse) obj;
        searchResponse.getClass();
        Section.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, searchResponse.sections);
        protoWriter.writeBytes(searchResponse.unknownFields());
    }
}
