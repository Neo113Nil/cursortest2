package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/DeleteTriggeredActionResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/DeleteTriggeredActionResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeleteTriggeredActionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DeleteTriggeredActionResponse((String) obj2, (Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DeleteTriggeredActionResponse deleteTriggeredActionResponse = (DeleteTriggeredActionResponse) obj;
        reverseProtoWriter.getClass();
        deleteTriggeredActionResponse.getClass();
        reverseProtoWriter.writeBytes(deleteTriggeredActionResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, deleteTriggeredActionResponse.error_msg);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, deleteTriggeredActionResponse.success);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DeleteTriggeredActionResponse deleteTriggeredActionResponse = (DeleteTriggeredActionResponse) obj;
        deleteTriggeredActionResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, deleteTriggeredActionResponse.error_msg) + ProtoAdapter.BOOL.encodedSizeWithTag(1, deleteTriggeredActionResponse.success) + deleteTriggeredActionResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DeleteTriggeredActionResponse deleteTriggeredActionResponse = (DeleteTriggeredActionResponse) obj;
        deleteTriggeredActionResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = deleteTriggeredActionResponse.success;
        String str = deleteTriggeredActionResponse.error_msg;
        byteString.getClass();
        return new DeleteTriggeredActionResponse(str, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DeleteTriggeredActionResponse deleteTriggeredActionResponse = (DeleteTriggeredActionResponse) obj;
        deleteTriggeredActionResponse.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, deleteTriggeredActionResponse.success);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, deleteTriggeredActionResponse.error_msg);
        protoWriter.writeBytes(deleteTriggeredActionResponse.unknownFields());
    }
}
