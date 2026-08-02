package com.squareup.protos.cash.customersearch.api;

import com.squareup.protos.cash.customersearch.api.SearchCommonTextRowItem;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SearchCommonTextRowItem$Metadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SearchCommonTextRowItem.Metadata((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SearchCommonTextRowItem.Metadata metadata = (SearchCommonTextRowItem.Metadata) obj;
        reverseProtoWriter.getClass();
        metadata.getClass();
        reverseProtoWriter.writeBytes(metadata.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, metadata.search_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SearchCommonTextRowItem.Metadata metadata = (SearchCommonTextRowItem.Metadata) obj;
        metadata.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, metadata.search_text) + metadata.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((SearchCommonTextRowItem.Metadata) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SearchCommonTextRowItem.Metadata(null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SearchCommonTextRowItem.Metadata metadata = (SearchCommonTextRowItem.Metadata) obj;
        metadata.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, metadata.search_text);
        protoWriter.writeBytes(metadata.unknownFields());
    }
}
