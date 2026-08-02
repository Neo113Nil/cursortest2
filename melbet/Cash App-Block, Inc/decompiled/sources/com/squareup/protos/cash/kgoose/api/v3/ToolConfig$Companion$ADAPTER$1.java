package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ToolConfig$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ToolConfig$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ToolConfig((String) obj, (String) obj2, (String) obj3, (String) obj4, (Boolean) obj5, (Boolean) obj6, (String) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
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
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ToolConfig toolConfig = (ToolConfig) obj;
        reverseProtoWriter.getClass();
        toolConfig.getClass();
        reverseProtoWriter.writeBytes(toolConfig.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, toolConfig.workflow_steps_json);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, toolConfig.direct_execution_only);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, toolConfig.mutates_state);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, toolConfig.meta_json);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, toolConfig.config_json);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, toolConfig.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, toolConfig.tool);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ToolConfig toolConfig = (ToolConfig) obj;
        toolConfig.getClass();
        int size$okio = toolConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(4, toolConfig.meta_json) + protoAdapter.encodedSizeWithTag(3, toolConfig.config_json) + protoAdapter.encodedSizeWithTag(2, toolConfig.description) + protoAdapter.encodedSizeWithTag(1, toolConfig.tool) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(7, toolConfig.workflow_steps_json) + protoAdapter2.encodedSizeWithTag(6, toolConfig.direct_execution_only) + protoAdapter2.encodedSizeWithTag(5, toolConfig.mutates_state) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ToolConfig toolConfig = (ToolConfig) obj;
        toolConfig.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = toolConfig.tool;
        String str2 = toolConfig.description;
        String str3 = toolConfig.config_json;
        String str4 = toolConfig.meta_json;
        Boolean bool = toolConfig.mutates_state;
        Boolean bool2 = toolConfig.direct_execution_only;
        String str5 = toolConfig.workflow_steps_json;
        byteString.getClass();
        return new ToolConfig(str, str2, str3, str4, bool, bool2, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ToolConfig toolConfig = (ToolConfig) obj;
        toolConfig.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, toolConfig.tool);
        protoAdapter.encodeWithTag(protoWriter, 2, toolConfig.description);
        protoAdapter.encodeWithTag(protoWriter, 3, toolConfig.config_json);
        protoAdapter.encodeWithTag(protoWriter, 4, toolConfig.meta_json);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 5, toolConfig.mutates_state);
        protoAdapter2.encodeWithTag(protoWriter, 6, toolConfig.direct_execution_only);
        protoAdapter.encodeWithTag(protoWriter, 7, toolConfig.workflow_steps_json);
        protoWriter.writeBytes(toolConfig.unknownFields());
    }
}
