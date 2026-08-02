package com.squareup.protos.teamapp.ui;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Link$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Link((Boolean) obj2, (String) obj, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Link link = (Link) obj;
        reverseProtoWriter.getClass();
        link.getClass();
        reverseProtoWriter.writeBytes(link.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, link.deep_link);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, link.web_url_hides_navigation);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, link.web_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Link link = (Link) obj;
        link.getClass();
        int size$okio = link.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, link.deep_link) + ProtoAdapter.BOOL.encodedSizeWithTag(2, link.web_url_hides_navigation) + protoAdapter.encodedSizeWithTag(1, link.web_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Link link = (Link) obj;
        link.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = link.web_url;
        Boolean bool = link.web_url_hides_navigation;
        String str2 = link.deep_link;
        byteString.getClass();
        return new Link(bool, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Link link = (Link) obj;
        link.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, link.web_url);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, link.web_url_hides_navigation);
        protoAdapter.encodeWithTag(protoWriter, 3, link.deep_link);
        protoWriter.writeBytes(link.unknownFields());
    }
}
