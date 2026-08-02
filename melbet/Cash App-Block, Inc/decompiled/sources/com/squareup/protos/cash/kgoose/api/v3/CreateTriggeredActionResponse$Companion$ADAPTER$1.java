package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/CreateTriggeredActionResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/CreateTriggeredActionResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreateTriggeredActionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateTriggeredActionResponse((String) obj, (Boolean) obj2, (String) obj3, (TriggeredAction) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(TriggeredAction.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateTriggeredActionResponse createTriggeredActionResponse = (CreateTriggeredActionResponse) obj;
        reverseProtoWriter.getClass();
        createTriggeredActionResponse.getClass();
        reverseProtoWriter.writeBytes(createTriggeredActionResponse.unknownFields());
        TriggeredAction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, createTriggeredActionResponse.triggered_action);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, createTriggeredActionResponse.error_msg);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, createTriggeredActionResponse.success);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, createTriggeredActionResponse.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateTriggeredActionResponse createTriggeredActionResponse = (CreateTriggeredActionResponse) obj;
        createTriggeredActionResponse.getClass();
        int size$okio = createTriggeredActionResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return TriggeredAction.ADAPTER.encodedSizeWithTag(4, createTriggeredActionResponse.triggered_action) + protoAdapter.encodedSizeWithTag(3, createTriggeredActionResponse.error_msg) + ProtoAdapter.BOOL.encodedSizeWithTag(2, createTriggeredActionResponse.success) + protoAdapter.encodedSizeWithTag(1, createTriggeredActionResponse.id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateTriggeredActionResponse createTriggeredActionResponse = (CreateTriggeredActionResponse) obj;
        createTriggeredActionResponse.getClass();
        TriggeredAction triggeredAction = createTriggeredActionResponse.triggered_action;
        TriggeredAction triggeredAction2 = triggeredAction != null ? (TriggeredAction) TriggeredAction.ADAPTER.redact(triggeredAction) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = createTriggeredActionResponse.id;
        Boolean bool = createTriggeredActionResponse.success;
        String str2 = createTriggeredActionResponse.error_msg;
        byteString.getClass();
        return new CreateTriggeredActionResponse(str, bool, str2, triggeredAction2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateTriggeredActionResponse createTriggeredActionResponse = (CreateTriggeredActionResponse) obj;
        createTriggeredActionResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, createTriggeredActionResponse.id);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, createTriggeredActionResponse.success);
        protoAdapter.encodeWithTag(protoWriter, 3, createTriggeredActionResponse.error_msg);
        TriggeredAction.ADAPTER.encodeWithTag(protoWriter, 4, createTriggeredActionResponse.triggered_action);
        protoWriter.writeBytes(createTriggeredActionResponse.unknownFields());
    }
}
