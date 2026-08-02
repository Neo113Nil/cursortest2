package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/McpDecryptionConfig$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/McpDecryptionConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class McpDecryptionConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new McpDecryptionConfig(m, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(McpKeyDescriptor.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        McpDecryptionConfig mcpDecryptionConfig = (McpDecryptionConfig) obj;
        reverseProtoWriter.getClass();
        mcpDecryptionConfig.getClass();
        reverseProtoWriter.writeBytes(mcpDecryptionConfig.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, mcpDecryptionConfig.client_key);
        McpKeyDescriptor.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, mcpDecryptionConfig.mcp_key_descriptor);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        McpDecryptionConfig mcpDecryptionConfig = (McpDecryptionConfig) obj;
        mcpDecryptionConfig.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, mcpDecryptionConfig.client_key) + McpKeyDescriptor.ADAPTER.asRepeated().encodedSizeWithTag(1, mcpDecryptionConfig.mcp_key_descriptor) + mcpDecryptionConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        McpDecryptionConfig mcpDecryptionConfig = (McpDecryptionConfig) obj;
        mcpDecryptionConfig.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(mcpDecryptionConfig.mcp_key_descriptor, McpKeyDescriptor.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new McpDecryptionConfig(m1169redactElements, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        McpDecryptionConfig mcpDecryptionConfig = (McpDecryptionConfig) obj;
        mcpDecryptionConfig.getClass();
        McpKeyDescriptor.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mcpDecryptionConfig.mcp_key_descriptor);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, mcpDecryptionConfig.client_key);
        protoWriter.writeBytes(mcpDecryptionConfig.unknownFields());
    }
}
