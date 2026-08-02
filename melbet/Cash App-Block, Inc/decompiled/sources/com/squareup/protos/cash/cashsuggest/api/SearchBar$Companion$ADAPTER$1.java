package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SearchBar$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SearchBar((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SearchBar searchBar = (SearchBar) obj;
        reverseProtoWriter.getClass();
        searchBar.getClass();
        reverseProtoWriter.writeBytes(searchBar.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, searchBar.action_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, searchBar.prompt_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SearchBar searchBar = (SearchBar) obj;
        searchBar.getClass();
        int size$okio = searchBar.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, searchBar.action_url) + protoAdapter.encodedSizeWithTag(1, searchBar.prompt_text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SearchBar searchBar = (SearchBar) obj;
        searchBar.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = searchBar.prompt_text;
        String str2 = searchBar.action_url;
        byteString.getClass();
        return new SearchBar(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SearchBar searchBar = (SearchBar) obj;
        searchBar.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, searchBar.prompt_text);
        protoAdapter.encodeWithTag(protoWriter, 2, searchBar.action_url);
        protoWriter.writeBytes(searchBar.unknownFields());
    }
}
