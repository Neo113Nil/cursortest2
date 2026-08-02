package com.squareup.protos.cash.paychecks.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.earnings.EarnerModeStatus;

/* loaded from: classes7.dex */
public final class UpdateEarnerModeResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpdateEarnerModeResponse((EarnerModeStatus) obj, (ResponseContext) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(EarnerModeStatus.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UpdateEarnerModeResponse updateEarnerModeResponse = (UpdateEarnerModeResponse) obj;
        reverseProtoWriter.getClass();
        updateEarnerModeResponse.getClass();
        reverseProtoWriter.writeBytes(updateEarnerModeResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, updateEarnerModeResponse.response_context);
        EarnerModeStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 1, updateEarnerModeResponse.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpdateEarnerModeResponse updateEarnerModeResponse = (UpdateEarnerModeResponse) obj;
        updateEarnerModeResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(2, updateEarnerModeResponse.response_context) + EarnerModeStatus.ADAPTER.encodedSizeWithTag(1, updateEarnerModeResponse.status) + updateEarnerModeResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UpdateEarnerModeResponse updateEarnerModeResponse = (UpdateEarnerModeResponse) obj;
        updateEarnerModeResponse.getClass();
        EarnerModeStatus earnerModeStatus = updateEarnerModeResponse.status;
        EarnerModeStatus earnerModeStatus2 = earnerModeStatus != null ? (EarnerModeStatus) EarnerModeStatus.ADAPTER.redact(earnerModeStatus) : null;
        ResponseContext responseContext = updateEarnerModeResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UpdateEarnerModeResponse(earnerModeStatus2, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpdateEarnerModeResponse updateEarnerModeResponse = (UpdateEarnerModeResponse) obj;
        updateEarnerModeResponse.getClass();
        EarnerModeStatus.ADAPTER.encodeWithTag(protoWriter, 1, updateEarnerModeResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, updateEarnerModeResponse.response_context);
        protoWriter.writeBytes(updateEarnerModeResponse.unknownFields());
    }
}
