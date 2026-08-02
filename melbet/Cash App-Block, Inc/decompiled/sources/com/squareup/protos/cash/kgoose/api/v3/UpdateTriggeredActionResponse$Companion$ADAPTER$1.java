package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/UpdateTriggeredActionResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/UpdateTriggeredActionResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateTriggeredActionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new UpdateTriggeredActionResponse((TriggeredAction) obj2, (Boolean) obj, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(TriggeredAction.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UpdateTriggeredActionResponse updateTriggeredActionResponse = (UpdateTriggeredActionResponse) obj;
        reverseProtoWriter.getClass();
        updateTriggeredActionResponse.getClass();
        reverseProtoWriter.writeBytes(updateTriggeredActionResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, updateTriggeredActionResponse.error_msg);
        TriggeredAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, updateTriggeredActionResponse.triggered_action);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, updateTriggeredActionResponse.success);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpdateTriggeredActionResponse updateTriggeredActionResponse = (UpdateTriggeredActionResponse) obj;
        updateTriggeredActionResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, updateTriggeredActionResponse.error_msg) + TriggeredAction.ADAPTER.encodedSizeWithTag(2, updateTriggeredActionResponse.triggered_action) + ProtoAdapter.BOOL.encodedSizeWithTag(1, updateTriggeredActionResponse.success) + updateTriggeredActionResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UpdateTriggeredActionResponse updateTriggeredActionResponse = (UpdateTriggeredActionResponse) obj;
        updateTriggeredActionResponse.getClass();
        TriggeredAction triggeredAction = updateTriggeredActionResponse.triggered_action;
        TriggeredAction triggeredAction2 = triggeredAction != null ? (TriggeredAction) TriggeredAction.ADAPTER.redact(triggeredAction) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = updateTriggeredActionResponse.success;
        String str = updateTriggeredActionResponse.error_msg;
        byteString.getClass();
        return new UpdateTriggeredActionResponse(triggeredAction2, bool, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpdateTriggeredActionResponse updateTriggeredActionResponse = (UpdateTriggeredActionResponse) obj;
        updateTriggeredActionResponse.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, updateTriggeredActionResponse.success);
        TriggeredAction.ADAPTER.encodeWithTag(protoWriter, 2, updateTriggeredActionResponse.triggered_action);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, updateTriggeredActionResponse.error_msg);
        protoWriter.writeBytes(updateTriggeredActionResponse.unknownFields());
    }
}
