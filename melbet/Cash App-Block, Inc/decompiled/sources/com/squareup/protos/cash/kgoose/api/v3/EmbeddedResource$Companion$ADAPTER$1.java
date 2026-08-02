package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.Map;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/EmbeddedResource$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/EmbeddedResource;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EmbeddedResource$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new EmbeddedResource((Map) obj, (ResourceContents) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ProtoAdapter.STRUCT_MAP, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(ResourceContents.ADAPTER, protoReader, obj2);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EmbeddedResource embeddedResource = (EmbeddedResource) obj;
        reverseProtoWriter.getClass();
        embeddedResource.getClass();
        reverseProtoWriter.writeBytes(embeddedResource.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, embeddedResource.type);
        ResourceContents.ADAPTER.encodeWithTag(reverseProtoWriter, 3, embeddedResource.resource);
        ProtoAdapter.STRUCT_MAP.encodeWithTag(reverseProtoWriter, 1, embeddedResource.meta);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EmbeddedResource embeddedResource = (EmbeddedResource) obj;
        embeddedResource.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(5, embeddedResource.type) + ResourceContents.ADAPTER.encodedSizeWithTag(3, embeddedResource.resource) + ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(1, embeddedResource.meta) + embeddedResource.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EmbeddedResource embeddedResource = (EmbeddedResource) obj;
        embeddedResource.getClass();
        Map<String, ?> map = embeddedResource.meta;
        Map map2 = map != null ? (Map) ProtoAdapter.STRUCT_MAP.redact(map) : null;
        ResourceContents resourceContents = embeddedResource.resource;
        ResourceContents resourceContents2 = resourceContents != null ? (ResourceContents) ResourceContents.ADAPTER.redact(resourceContents) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = embeddedResource.type;
        byteString.getClass();
        return new EmbeddedResource(map2, resourceContents2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EmbeddedResource embeddedResource = (EmbeddedResource) obj;
        embeddedResource.getClass();
        ProtoAdapter.STRUCT_MAP.encodeWithTag(protoWriter, 1, embeddedResource.meta);
        ResourceContents.ADAPTER.encodeWithTag(protoWriter, 3, embeddedResource.resource);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, embeddedResource.type);
        protoWriter.writeBytes(embeddedResource.unknownFields());
    }
}
