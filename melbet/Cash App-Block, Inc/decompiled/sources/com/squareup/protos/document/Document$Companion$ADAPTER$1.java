package com.squareup.protos.document;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class Document$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Document((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (Long) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Document document = (Document) obj;
        reverseProtoWriter.getClass();
        document.getClass();
        reverseProtoWriter.writeBytes(document.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 6, document.document_date);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, document.owner_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, document.url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, document.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, document.token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, document.category);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Document document = (Document) obj;
        document.getClass();
        int size$okio = document.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT64.encodedSizeWithTag(6, document.document_date) + protoAdapter.encodedSizeWithTag(5, document.owner_token) + protoAdapter.encodedSizeWithTag(4, document.url) + protoAdapter.encodedSizeWithTag(3, document.title) + protoAdapter.encodedSizeWithTag(2, document.token) + protoAdapter.encodedSizeWithTag(1, document.category) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Document document = (Document) obj;
        document.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = document.category;
        String str2 = document.token;
        String str3 = document.title;
        String str4 = document.url;
        String str5 = document.owner_token;
        Long l = document.document_date;
        byteString.getClass();
        return new Document(str, str2, str3, str4, str5, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Document document = (Document) obj;
        document.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, document.category);
        protoAdapter.encodeWithTag(protoWriter, 2, document.token);
        protoAdapter.encodeWithTag(protoWriter, 3, document.title);
        protoAdapter.encodeWithTag(protoWriter, 4, document.url);
        protoAdapter.encodeWithTag(protoWriter, 5, document.owner_token);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, document.document_date);
        protoWriter.writeBytes(document.unknownFields());
    }
}
