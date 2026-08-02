package com.squareup.protos.cash.customersearch.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SearchCommonRowSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SearchCommonRowSection(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProfileDirectoryRow.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SearchCommonRowSection searchCommonRowSection = (SearchCommonRowSection) obj;
        reverseProtoWriter.getClass();
        searchCommonRowSection.getClass();
        reverseProtoWriter.writeBytes(searchCommonRowSection.unknownFields());
        ProfileDirectoryRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, searchCommonRowSection.results);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SearchCommonRowSection searchCommonRowSection = (SearchCommonRowSection) obj;
        searchCommonRowSection.getClass();
        return ProfileDirectoryRow.ADAPTER.asRepeated().encodedSizeWithTag(1, searchCommonRowSection.results) + searchCommonRowSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SearchCommonRowSection searchCommonRowSection = (SearchCommonRowSection) obj;
        searchCommonRowSection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(searchCommonRowSection.results, ProfileDirectoryRow.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SearchCommonRowSection(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SearchCommonRowSection searchCommonRowSection = (SearchCommonRowSection) obj;
        searchCommonRowSection.getClass();
        ProfileDirectoryRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, searchCommonRowSection.results);
        protoWriter.writeBytes(searchCommonRowSection.unknownFields());
    }
}
