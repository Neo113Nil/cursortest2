package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.Map;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ResourceContents$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ResourceContents;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ResourceContents$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ResourceContents((Map) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (ResourceAnnotations) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(ProtoAdapter.STRUCT_MAP, protoReader, obj);
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
                    obj6 = TransactorKt.decodeMessageOrMerge(ResourceAnnotations.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ResourceContents resourceContents = (ResourceContents) obj;
        reverseProtoWriter.getClass();
        resourceContents.getClass();
        reverseProtoWriter.writeBytes(resourceContents.unknownFields());
        ResourceAnnotations.ADAPTER.encodeWithTag(reverseProtoWriter, 6, resourceContents.annotations);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, resourceContents.blob);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, resourceContents.text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, resourceContents.mime_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, resourceContents.uri);
        ProtoAdapter.STRUCT_MAP.encodeWithTag(reverseProtoWriter, 1, resourceContents.meta);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ResourceContents resourceContents = (ResourceContents) obj;
        resourceContents.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(1, resourceContents.meta) + resourceContents.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ResourceAnnotations.ADAPTER.encodedSizeWithTag(6, resourceContents.annotations) + protoAdapter.encodedSizeWithTag(5, resourceContents.blob) + protoAdapter.encodedSizeWithTag(4, resourceContents.text) + protoAdapter.encodedSizeWithTag(3, resourceContents.mime_type) + protoAdapter.encodedSizeWithTag(2, resourceContents.uri) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ResourceContents resourceContents = (ResourceContents) obj;
        resourceContents.getClass();
        Map<String, ?> map = resourceContents.meta;
        Map map2 = map != null ? (Map) ProtoAdapter.STRUCT_MAP.redact(map) : null;
        ResourceAnnotations resourceAnnotations = resourceContents.annotations;
        ResourceAnnotations resourceAnnotations2 = resourceAnnotations != null ? (ResourceAnnotations) ResourceAnnotations.ADAPTER.redact(resourceAnnotations) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = resourceContents.uri;
        String str2 = resourceContents.mime_type;
        byteString.getClass();
        return new ResourceContents(map2, str, str2, null, null, resourceAnnotations2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ResourceContents resourceContents = (ResourceContents) obj;
        resourceContents.getClass();
        ProtoAdapter.STRUCT_MAP.encodeWithTag(protoWriter, 1, resourceContents.meta);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, resourceContents.uri);
        protoAdapter.encodeWithTag(protoWriter, 3, resourceContents.mime_type);
        protoAdapter.encodeWithTag(protoWriter, 4, resourceContents.text);
        protoAdapter.encodeWithTag(protoWriter, 5, resourceContents.blob);
        ResourceAnnotations.ADAPTER.encodeWithTag(protoWriter, 6, resourceContents.annotations);
        protoWriter.writeBytes(resourceContents.unknownFields());
    }
}
