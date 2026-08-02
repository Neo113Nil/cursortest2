package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/GetTriggeredActionsRequest$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetTriggeredActionsRequest;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetTriggeredActionsRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetTriggeredActionsRequest((String) obj, (Integer) obj2, (TriggeredActionStatusFilter) obj3, (OnBehalfOf) obj4, (Boolean) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 3) {
                try {
                    obj3 = TriggeredActionStatusFilter.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(OnBehalfOf.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetTriggeredActionsRequest getTriggeredActionsRequest = (GetTriggeredActionsRequest) obj;
        reverseProtoWriter.getClass();
        getTriggeredActionsRequest.getClass();
        reverseProtoWriter.writeBytes(getTriggeredActionsRequest.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, getTriggeredActionsRequest.include_instructions);
        OnBehalfOf.ADAPTER.encodeWithTag(reverseProtoWriter, 4, getTriggeredActionsRequest.on_behalf_of);
        TriggeredActionStatusFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getTriggeredActionsRequest.status_filter);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, getTriggeredActionsRequest.limit);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getTriggeredActionsRequest.cursor);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetTriggeredActionsRequest getTriggeredActionsRequest = (GetTriggeredActionsRequest) obj;
        getTriggeredActionsRequest.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(5, getTriggeredActionsRequest.include_instructions) + OnBehalfOf.ADAPTER.encodedSizeWithTag(4, getTriggeredActionsRequest.on_behalf_of) + TriggeredActionStatusFilter.ADAPTER.encodedSizeWithTag(3, getTriggeredActionsRequest.status_filter) + ProtoAdapter.INT32.encodedSizeWithTag(2, getTriggeredActionsRequest.limit) + ProtoAdapter.STRING.encodedSizeWithTag(1, getTriggeredActionsRequest.cursor) + getTriggeredActionsRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetTriggeredActionsRequest getTriggeredActionsRequest = (GetTriggeredActionsRequest) obj;
        getTriggeredActionsRequest.getClass();
        OnBehalfOf onBehalfOf = getTriggeredActionsRequest.on_behalf_of;
        OnBehalfOf onBehalfOf2 = onBehalfOf != null ? (OnBehalfOf) OnBehalfOf.ADAPTER.redact(onBehalfOf) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = getTriggeredActionsRequest.cursor;
        Integer num = getTriggeredActionsRequest.limit;
        TriggeredActionStatusFilter triggeredActionStatusFilter = getTriggeredActionsRequest.status_filter;
        Boolean bool = getTriggeredActionsRequest.include_instructions;
        byteString.getClass();
        return new GetTriggeredActionsRequest(str, num, triggeredActionStatusFilter, onBehalfOf2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetTriggeredActionsRequest getTriggeredActionsRequest = (GetTriggeredActionsRequest) obj;
        getTriggeredActionsRequest.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getTriggeredActionsRequest.cursor);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getTriggeredActionsRequest.limit);
        TriggeredActionStatusFilter.ADAPTER.encodeWithTag(protoWriter, 3, getTriggeredActionsRequest.status_filter);
        OnBehalfOf.ADAPTER.encodeWithTag(protoWriter, 4, getTriggeredActionsRequest.on_behalf_of);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, getTriggeredActionsRequest.include_instructions);
        protoWriter.writeBytes(getTriggeredActionsRequest.unknownFields());
    }
}
