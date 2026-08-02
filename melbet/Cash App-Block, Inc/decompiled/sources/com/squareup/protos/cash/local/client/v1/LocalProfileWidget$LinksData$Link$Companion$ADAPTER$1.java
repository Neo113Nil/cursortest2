package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalProfileWidget;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalProfileWidget$LinksData$Link$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalProfileWidget.LinksData.Link((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        LocalProfileWidget.LinksData.Link link = (LocalProfileWidget.LinksData.Link) obj;
        reverseProtoWriter.getClass();
        link.getClass();
        reverseProtoWriter.writeBytes(link.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, link.url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, link.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalProfileWidget.LinksData.Link link = (LocalProfileWidget.LinksData.Link) obj;
        link.getClass();
        int size$okio = link.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, link.url) + protoAdapter.encodedSizeWithTag(1, link.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalProfileWidget.LinksData.Link link = (LocalProfileWidget.LinksData.Link) obj;
        link.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = link.title;
        String str2 = link.url;
        byteString.getClass();
        return new LocalProfileWidget.LinksData.Link(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalProfileWidget.LinksData.Link link = (LocalProfileWidget.LinksData.Link) obj;
        link.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, link.title);
        protoAdapter.encodeWithTag(protoWriter, 2, link.url);
        protoWriter.writeBytes(link.unknownFields());
    }
}
