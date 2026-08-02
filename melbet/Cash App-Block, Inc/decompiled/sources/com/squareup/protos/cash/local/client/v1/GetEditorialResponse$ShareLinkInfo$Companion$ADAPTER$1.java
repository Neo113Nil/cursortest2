package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetEditorialResponse$ShareLinkInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetEditorialResponse.ShareLinkInfo((String) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetEditorialResponse.ShareLinkInfo shareLinkInfo = (GetEditorialResponse.ShareLinkInfo) obj;
        reverseProtoWriter.getClass();
        shareLinkInfo.getClass();
        reverseProtoWriter.writeBytes(shareLinkInfo.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, shareLinkInfo.thumbnail_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, shareLinkInfo.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, shareLinkInfo.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, shareLinkInfo.url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetEditorialResponse.ShareLinkInfo shareLinkInfo = (GetEditorialResponse.ShareLinkInfo) obj;
        shareLinkInfo.getClass();
        int size$okio = shareLinkInfo.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, shareLinkInfo.thumbnail_url) + protoAdapter.encodedSizeWithTag(3, shareLinkInfo.subtitle) + protoAdapter.encodedSizeWithTag(2, shareLinkInfo.title) + protoAdapter.encodedSizeWithTag(1, shareLinkInfo.url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetEditorialResponse.ShareLinkInfo shareLinkInfo = (GetEditorialResponse.ShareLinkInfo) obj;
        shareLinkInfo.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = shareLinkInfo.url;
        String str2 = shareLinkInfo.title;
        String str3 = shareLinkInfo.subtitle;
        String str4 = shareLinkInfo.thumbnail_url;
        byteString.getClass();
        return new GetEditorialResponse.ShareLinkInfo(str, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetEditorialResponse.ShareLinkInfo shareLinkInfo = (GetEditorialResponse.ShareLinkInfo) obj;
        shareLinkInfo.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, shareLinkInfo.url);
        protoAdapter.encodeWithTag(protoWriter, 2, shareLinkInfo.title);
        protoAdapter.encodeWithTag(protoWriter, 3, shareLinkInfo.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 4, shareLinkInfo.thumbnail_url);
        protoWriter.writeBytes(shareLinkInfo.unknownFields());
    }
}
