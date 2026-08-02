package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.protos.cash.kgoose.api.v3.ToolRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ToolRequest$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolRequest;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ToolRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ToolRequest.Result value;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        ToolRequest.Result result = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ToolRequest((String) obj, (String) obj2, result, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 3:
                    value = new ToolRequest.Result.Value((ToolCall) ToolCall.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    value = new ToolRequest.Result.Error((String) ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 5:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 6:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
            }
            result = value;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ToolRequest toolRequest = (ToolRequest) obj;
        reverseProtoWriter.getClass();
        toolRequest.getClass();
        reverseProtoWriter.writeBytes(toolRequest.unknownFields());
        ToolRequest.Result result = toolRequest.result;
        if (result instanceof ToolRequest.Result.Value) {
            ToolCall.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((ToolRequest.Result.Value) result).getValue());
        } else if (result instanceof ToolRequest.Result.Error) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, ((ToolRequest.Result.Error) result).getValue());
        } else if (result != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, toolRequest.tooltip_category);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, toolRequest.tooltip);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, toolRequest.status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, toolRequest.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ToolRequest toolRequest = (ToolRequest) obj;
        toolRequest.getClass();
        int size$okio = toolRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, toolRequest.status) + protoAdapter.encodedSizeWithTag(1, toolRequest.id) + size$okio;
        ToolRequest.Result result = toolRequest.result;
        if (result instanceof ToolRequest.Result.Value) {
            encodedSizeWithTag = ToolCall.ADAPTER.encodedSizeWithTag(3, ((ToolRequest.Result.Value) result).getValue());
        } else {
            if (!(result instanceof ToolRequest.Result.Error)) {
                if (result != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return protoAdapter.encodedSizeWithTag(6, toolRequest.tooltip_category) + protoAdapter.encodedSizeWithTag(5, toolRequest.tooltip) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = protoAdapter.encodedSizeWithTag(4, ((ToolRequest.Result.Error) result).getValue());
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return protoAdapter.encodedSizeWithTag(6, toolRequest.tooltip_category) + protoAdapter.encodedSizeWithTag(5, toolRequest.tooltip) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ToolRequest toolRequest = (ToolRequest) obj;
        toolRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = toolRequest.id;
        String str2 = toolRequest.status;
        ToolRequest.Result result = toolRequest.result;
        byteString.getClass();
        return new ToolRequest(str, str2, result, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ToolRequest toolRequest = (ToolRequest) obj;
        toolRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, toolRequest.id);
        protoAdapter.encodeWithTag(protoWriter, 2, toolRequest.status);
        protoAdapter.encodeWithTag(protoWriter, 5, toolRequest.tooltip);
        protoAdapter.encodeWithTag(protoWriter, 6, toolRequest.tooltip_category);
        ToolRequest.Result result = toolRequest.result;
        if (result instanceof ToolRequest.Result.Value) {
            ToolCall.ADAPTER.encodeWithTag(protoWriter, 3, ((ToolRequest.Result.Value) result).getValue());
        } else if (result instanceof ToolRequest.Result.Error) {
            protoAdapter.encodeWithTag(protoWriter, 4, ((ToolRequest.Result.Error) result).getValue());
        } else if (result != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(toolRequest.unknownFields());
    }
}
