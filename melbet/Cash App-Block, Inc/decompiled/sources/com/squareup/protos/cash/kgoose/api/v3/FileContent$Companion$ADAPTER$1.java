package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/FileContent$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/FileContent;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FileContent$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new FileContent((String) obj, (String) obj2, (Boolean) obj3, (String) obj4, (String) obj5, (Long) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.UINT64.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FileContent fileContent = (FileContent) obj;
        reverseProtoWriter.getClass();
        fileContent.getClass();
        reverseProtoWriter.writeBytes(fileContent.unknownFields());
        ProtoAdapter.UINT64.encodeWithTag(reverseProtoWriter, 6, fileContent.size_bytes);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, fileContent.filename);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, fileContent.s3_uri);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, fileContent.requires_presigned_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, fileContent.mime_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, fileContent.data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FileContent fileContent = (FileContent) obj;
        fileContent.getClass();
        int size$okio = fileContent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.UINT64.encodedSizeWithTag(6, fileContent.size_bytes) + protoAdapter.encodedSizeWithTag(5, fileContent.filename) + protoAdapter.encodedSizeWithTag(4, fileContent.s3_uri) + ProtoAdapter.BOOL.encodedSizeWithTag(3, fileContent.requires_presigned_url) + protoAdapter.encodedSizeWithTag(2, fileContent.mime_type) + protoAdapter.encodedSizeWithTag(1, fileContent.data) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FileContent fileContent = (FileContent) obj;
        fileContent.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = fileContent.mime_type;
        Boolean bool = fileContent.requires_presigned_url;
        String str2 = fileContent.s3_uri;
        String str3 = fileContent.filename;
        Long l = fileContent.size_bytes;
        byteString.getClass();
        return new FileContent(null, str, bool, str2, str3, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FileContent fileContent = (FileContent) obj;
        fileContent.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, fileContent.data);
        protoAdapter.encodeWithTag(protoWriter, 2, fileContent.mime_type);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, fileContent.requires_presigned_url);
        protoAdapter.encodeWithTag(protoWriter, 4, fileContent.s3_uri);
        protoAdapter.encodeWithTag(protoWriter, 5, fileContent.filename);
        ProtoAdapter.UINT64.encodeWithTag(protoWriter, 6, fileContent.size_bytes);
        protoWriter.writeBytes(fileContent.unknownFields());
    }
}
