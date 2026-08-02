package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.protos.cash.kgoose.api.v3.ExecuteToolResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ExecuteToolResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExecuteToolResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ExecuteToolResponse.Result result = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ExecuteToolResponse(result, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                result = new ExecuteToolResponse.Result.Success((ExecuteToolSuccess) ExecuteToolSuccess.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                result = new ExecuteToolResponse.Result.Error((ExecuteToolError) ExecuteToolError.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ExecuteToolResponse executeToolResponse = (ExecuteToolResponse) obj;
        reverseProtoWriter.getClass();
        executeToolResponse.getClass();
        reverseProtoWriter.writeBytes(executeToolResponse.unknownFields());
        ExecuteToolResponse.Result result = executeToolResponse.result;
        if (result instanceof ExecuteToolResponse.Result.Success) {
            ExecuteToolSuccess.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ExecuteToolResponse.Result.Success) result).getValue());
        } else if (result instanceof ExecuteToolResponse.Result.Error) {
            ExecuteToolError.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((ExecuteToolResponse.Result.Error) result).getValue());
        } else {
            if (result == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ExecuteToolResponse executeToolResponse = (ExecuteToolResponse) obj;
        executeToolResponse.getClass();
        int size$okio = executeToolResponse.unknownFields().getSize$okio();
        ExecuteToolResponse.Result result = executeToolResponse.result;
        if (result instanceof ExecuteToolResponse.Result.Success) {
            encodedSizeWithTag = ExecuteToolSuccess.ADAPTER.encodedSizeWithTag(1, ((ExecuteToolResponse.Result.Success) result).getValue());
        } else {
            if (!(result instanceof ExecuteToolResponse.Result.Error)) {
                if (result == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = ExecuteToolError.ADAPTER.encodedSizeWithTag(2, ((ExecuteToolResponse.Result.Error) result).getValue());
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ExecuteToolResponse executeToolResponse = (ExecuteToolResponse) obj;
        executeToolResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        ExecuteToolResponse.Result result = executeToolResponse.result;
        byteString.getClass();
        return new ExecuteToolResponse(result, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ExecuteToolResponse executeToolResponse = (ExecuteToolResponse) obj;
        executeToolResponse.getClass();
        ExecuteToolResponse.Result result = executeToolResponse.result;
        if (result instanceof ExecuteToolResponse.Result.Success) {
            ExecuteToolSuccess.ADAPTER.encodeWithTag(protoWriter, 1, ((ExecuteToolResponse.Result.Success) result).getValue());
        } else if (result instanceof ExecuteToolResponse.Result.Error) {
            ExecuteToolError.ADAPTER.encodeWithTag(protoWriter, 2, ((ExecuteToolResponse.Result.Error) result).getValue());
        } else if (result != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(executeToolResponse.unknownFields());
    }
}
