package com.squareup.protos.franklin.lending;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TogglePrepurchaseAfterpayResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TogglePrepurchaseAfterpayResponse((ResponseContext) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TogglePrepurchaseAfterpayResponse togglePrepurchaseAfterpayResponse = (TogglePrepurchaseAfterpayResponse) obj;
        reverseProtoWriter.getClass();
        togglePrepurchaseAfterpayResponse.getClass();
        reverseProtoWriter.writeBytes(togglePrepurchaseAfterpayResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, togglePrepurchaseAfterpayResponse.on_complete_client_route);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, togglePrepurchaseAfterpayResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TogglePrepurchaseAfterpayResponse togglePrepurchaseAfterpayResponse = (TogglePrepurchaseAfterpayResponse) obj;
        togglePrepurchaseAfterpayResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, togglePrepurchaseAfterpayResponse.on_complete_client_route) + ResponseContext.ADAPTER.encodedSizeWithTag(1, togglePrepurchaseAfterpayResponse.response_context) + togglePrepurchaseAfterpayResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TogglePrepurchaseAfterpayResponse togglePrepurchaseAfterpayResponse = (TogglePrepurchaseAfterpayResponse) obj;
        togglePrepurchaseAfterpayResponse.getClass();
        ResponseContext responseContext = togglePrepurchaseAfterpayResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = togglePrepurchaseAfterpayResponse.on_complete_client_route;
        byteString.getClass();
        return new TogglePrepurchaseAfterpayResponse(responseContext2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TogglePrepurchaseAfterpayResponse togglePrepurchaseAfterpayResponse = (TogglePrepurchaseAfterpayResponse) obj;
        togglePrepurchaseAfterpayResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, togglePrepurchaseAfterpayResponse.response_context);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, togglePrepurchaseAfterpayResponse.on_complete_client_route);
        protoWriter.writeBytes(togglePrepurchaseAfterpayResponse.unknownFields());
    }
}
