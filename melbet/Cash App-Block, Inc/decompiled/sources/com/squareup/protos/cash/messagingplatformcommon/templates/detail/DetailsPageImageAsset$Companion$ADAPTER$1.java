package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DetailsPageImageAsset$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DetailsPageImageAsset((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        DetailsPageImageAsset detailsPageImageAsset = (DetailsPageImageAsset) obj;
        reverseProtoWriter.getClass();
        detailsPageImageAsset.getClass();
        reverseProtoWriter.writeBytes(detailsPageImageAsset.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, detailsPageImageAsset.dark_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, detailsPageImageAsset.light_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DetailsPageImageAsset detailsPageImageAsset = (DetailsPageImageAsset) obj;
        detailsPageImageAsset.getClass();
        int size$okio = detailsPageImageAsset.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, detailsPageImageAsset.dark_url) + protoAdapter.encodedSizeWithTag(1, detailsPageImageAsset.light_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DetailsPageImageAsset detailsPageImageAsset = (DetailsPageImageAsset) obj;
        detailsPageImageAsset.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = detailsPageImageAsset.light_url;
        String str2 = detailsPageImageAsset.dark_url;
        byteString.getClass();
        return new DetailsPageImageAsset(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DetailsPageImageAsset detailsPageImageAsset = (DetailsPageImageAsset) obj;
        detailsPageImageAsset.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, detailsPageImageAsset.light_url);
        protoAdapter.encodeWithTag(protoWriter, 2, detailsPageImageAsset.dark_url);
        protoWriter.writeBytes(detailsPageImageAsset.unknownFields());
    }
}
