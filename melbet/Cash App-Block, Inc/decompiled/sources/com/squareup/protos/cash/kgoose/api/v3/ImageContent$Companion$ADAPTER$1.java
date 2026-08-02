package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ImageContent$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ImageContent;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImageContent$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ImageContent((Boolean) obj3, (String) obj, (String) obj2, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ImageContent imageContent = (ImageContent) obj;
        reverseProtoWriter.getClass();
        imageContent.getClass();
        reverseProtoWriter.writeBytes(imageContent.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, imageContent.s3_uri);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, imageContent.requires_presigned_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, imageContent.mime_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, imageContent.data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ImageContent imageContent = (ImageContent) obj;
        imageContent.getClass();
        int size$okio = imageContent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, imageContent.s3_uri) + ProtoAdapter.BOOL.encodedSizeWithTag(3, imageContent.requires_presigned_url) + protoAdapter.encodedSizeWithTag(2, imageContent.mime_type) + protoAdapter.encodedSizeWithTag(1, imageContent.data) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ImageContent imageContent = (ImageContent) obj;
        imageContent.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = imageContent.mime_type;
        Boolean bool = imageContent.requires_presigned_url;
        String str2 = imageContent.s3_uri;
        byteString.getClass();
        return new ImageContent(bool, null, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ImageContent imageContent = (ImageContent) obj;
        imageContent.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, imageContent.data);
        protoAdapter.encodeWithTag(protoWriter, 2, imageContent.mime_type);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, imageContent.requires_presigned_url);
        protoAdapter.encodeWithTag(protoWriter, 4, imageContent.s3_uri);
        protoWriter.writeBytes(imageContent.unknownFields());
    }
}
