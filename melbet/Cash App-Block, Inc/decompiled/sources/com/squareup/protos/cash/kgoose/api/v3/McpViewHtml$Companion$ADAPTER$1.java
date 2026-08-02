package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/McpViewHtml$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/McpViewHtml;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class McpViewHtml$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new McpViewHtml((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        McpViewHtml mcpViewHtml = (McpViewHtml) obj;
        reverseProtoWriter.getClass();
        mcpViewHtml.getClass();
        reverseProtoWriter.writeBytes(mcpViewHtml.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, mcpViewHtml.html);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, mcpViewHtml.mime_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, mcpViewHtml.uri);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        McpViewHtml mcpViewHtml = (McpViewHtml) obj;
        mcpViewHtml.getClass();
        int size$okio = mcpViewHtml.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, mcpViewHtml.html) + protoAdapter.encodedSizeWithTag(2, mcpViewHtml.mime_type) + protoAdapter.encodedSizeWithTag(1, mcpViewHtml.uri) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        McpViewHtml mcpViewHtml = (McpViewHtml) obj;
        mcpViewHtml.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = mcpViewHtml.uri;
        String str2 = mcpViewHtml.mime_type;
        String str3 = mcpViewHtml.html;
        byteString.getClass();
        return new McpViewHtml(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        McpViewHtml mcpViewHtml = (McpViewHtml) obj;
        mcpViewHtml.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, mcpViewHtml.uri);
        protoAdapter.encodeWithTag(protoWriter, 2, mcpViewHtml.mime_type);
        protoAdapter.encodeWithTag(protoWriter, 3, mcpViewHtml.html);
        protoWriter.writeBytes(mcpViewHtml.unknownFields());
    }
}
