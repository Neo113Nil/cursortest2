package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.Map;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/StructuredContent$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/StructuredContent;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StructuredContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StructuredContent((Map) obj, (ClientRenderable) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ProtoAdapter.STRUCT_MAP, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ClientRenderable.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StructuredContent structuredContent = (StructuredContent) obj;
        reverseProtoWriter.getClass();
        structuredContent.getClass();
        reverseProtoWriter.writeBytes(structuredContent.unknownFields());
        ClientRenderable.ADAPTER.encodeWithTag(reverseProtoWriter, 2, structuredContent.client_renderable);
        ProtoAdapter.STRUCT_MAP.encodeWithTag(reverseProtoWriter, 1, structuredContent.data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StructuredContent structuredContent = (StructuredContent) obj;
        structuredContent.getClass();
        return ClientRenderable.ADAPTER.encodedSizeWithTag(2, structuredContent.client_renderable) + ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(1, structuredContent.data) + structuredContent.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StructuredContent structuredContent = (StructuredContent) obj;
        structuredContent.getClass();
        Map<String, ?> map = structuredContent.data;
        Map map2 = map != null ? (Map) ProtoAdapter.STRUCT_MAP.redact(map) : null;
        ClientRenderable clientRenderable = structuredContent.client_renderable;
        ClientRenderable clientRenderable2 = clientRenderable != null ? (ClientRenderable) ClientRenderable.ADAPTER.redact(clientRenderable) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new StructuredContent(map2, clientRenderable2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StructuredContent structuredContent = (StructuredContent) obj;
        structuredContent.getClass();
        ProtoAdapter.STRUCT_MAP.encodeWithTag(protoWriter, 1, structuredContent.data);
        ClientRenderable.ADAPTER.encodeWithTag(protoWriter, 2, structuredContent.client_renderable);
        protoWriter.writeBytes(structuredContent.unknownFields());
    }
}
