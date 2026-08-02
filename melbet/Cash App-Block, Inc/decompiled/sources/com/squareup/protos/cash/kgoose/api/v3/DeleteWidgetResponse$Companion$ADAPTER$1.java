package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/DeleteWidgetResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/DeleteWidgetResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeleteWidgetResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DeleteWidgetResponse((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DeleteWidgetResponse deleteWidgetResponse = (DeleteWidgetResponse) obj;
        reverseProtoWriter.getClass();
        deleteWidgetResponse.getClass();
        reverseProtoWriter.writeBytes(deleteWidgetResponse.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, deleteWidgetResponse.success);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DeleteWidgetResponse deleteWidgetResponse = (DeleteWidgetResponse) obj;
        deleteWidgetResponse.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, deleteWidgetResponse.success) + deleteWidgetResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DeleteWidgetResponse deleteWidgetResponse = (DeleteWidgetResponse) obj;
        deleteWidgetResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = deleteWidgetResponse.success;
        byteString.getClass();
        return new DeleteWidgetResponse(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DeleteWidgetResponse deleteWidgetResponse = (DeleteWidgetResponse) obj;
        deleteWidgetResponse.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, deleteWidgetResponse.success);
        protoWriter.writeBytes(deleteWidgetResponse.unknownFields());
    }
}
