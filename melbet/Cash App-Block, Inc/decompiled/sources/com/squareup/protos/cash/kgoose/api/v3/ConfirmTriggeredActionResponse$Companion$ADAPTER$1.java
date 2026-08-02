package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ConfirmTriggeredActionResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ConfirmTriggeredActionResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ConfirmTriggeredActionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ConfirmTriggeredActionResponse((TriggeredAction) obj3, (Boolean) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(TriggeredAction.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ConfirmTriggeredActionResponse confirmTriggeredActionResponse = (ConfirmTriggeredActionResponse) obj;
        reverseProtoWriter.getClass();
        confirmTriggeredActionResponse.getClass();
        reverseProtoWriter.writeBytes(confirmTriggeredActionResponse.unknownFields());
        TriggeredAction.ADAPTER.encodeWithTag(reverseProtoWriter, 3, confirmTriggeredActionResponse.triggered_action);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, confirmTriggeredActionResponse.error_msg);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, confirmTriggeredActionResponse.success);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ConfirmTriggeredActionResponse confirmTriggeredActionResponse = (ConfirmTriggeredActionResponse) obj;
        confirmTriggeredActionResponse.getClass();
        return TriggeredAction.ADAPTER.encodedSizeWithTag(3, confirmTriggeredActionResponse.triggered_action) + ProtoAdapter.STRING.encodedSizeWithTag(2, confirmTriggeredActionResponse.error_msg) + ProtoAdapter.BOOL.encodedSizeWithTag(1, confirmTriggeredActionResponse.success) + confirmTriggeredActionResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ConfirmTriggeredActionResponse confirmTriggeredActionResponse = (ConfirmTriggeredActionResponse) obj;
        confirmTriggeredActionResponse.getClass();
        TriggeredAction triggeredAction = confirmTriggeredActionResponse.triggered_action;
        TriggeredAction triggeredAction2 = triggeredAction != null ? (TriggeredAction) TriggeredAction.ADAPTER.redact(triggeredAction) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = confirmTriggeredActionResponse.success;
        String str = confirmTriggeredActionResponse.error_msg;
        byteString.getClass();
        return new ConfirmTriggeredActionResponse(triggeredAction2, bool, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ConfirmTriggeredActionResponse confirmTriggeredActionResponse = (ConfirmTriggeredActionResponse) obj;
        confirmTriggeredActionResponse.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, confirmTriggeredActionResponse.success);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, confirmTriggeredActionResponse.error_msg);
        TriggeredAction.ADAPTER.encodeWithTag(protoWriter, 3, confirmTriggeredActionResponse.triggered_action);
        protoWriter.writeBytes(confirmTriggeredActionResponse.unknownFields());
    }
}
