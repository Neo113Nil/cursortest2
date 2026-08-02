package com.squareup.protos.cash.customersearch.api;

import com.squareup.protos.cash.customersearch.api.SearchCommonPlaceholderSection;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SearchCommonPlaceholderSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SearchCommonPlaceholderSection((SearchCommonPlaceholderSection.Identifier) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = SearchCommonPlaceholderSection.Identifier.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SearchCommonPlaceholderSection searchCommonPlaceholderSection = (SearchCommonPlaceholderSection) obj;
        reverseProtoWriter.getClass();
        searchCommonPlaceholderSection.getClass();
        reverseProtoWriter.writeBytes(searchCommonPlaceholderSection.unknownFields());
        SearchCommonPlaceholderSection.Identifier.ADAPTER.encodeWithTag(reverseProtoWriter, 1, searchCommonPlaceholderSection.identifier);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SearchCommonPlaceholderSection searchCommonPlaceholderSection = (SearchCommonPlaceholderSection) obj;
        searchCommonPlaceholderSection.getClass();
        return SearchCommonPlaceholderSection.Identifier.ADAPTER.encodedSizeWithTag(1, searchCommonPlaceholderSection.identifier) + searchCommonPlaceholderSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SearchCommonPlaceholderSection searchCommonPlaceholderSection = (SearchCommonPlaceholderSection) obj;
        searchCommonPlaceholderSection.getClass();
        ByteString byteString = ByteString.EMPTY;
        SearchCommonPlaceholderSection.Identifier identifier = searchCommonPlaceholderSection.identifier;
        byteString.getClass();
        return new SearchCommonPlaceholderSection(identifier, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SearchCommonPlaceholderSection searchCommonPlaceholderSection = (SearchCommonPlaceholderSection) obj;
        searchCommonPlaceholderSection.getClass();
        SearchCommonPlaceholderSection.Identifier.ADAPTER.encodeWithTag(protoWriter, 1, searchCommonPlaceholderSection.identifier);
        protoWriter.writeBytes(searchCommonPlaceholderSection.unknownFields());
    }
}
