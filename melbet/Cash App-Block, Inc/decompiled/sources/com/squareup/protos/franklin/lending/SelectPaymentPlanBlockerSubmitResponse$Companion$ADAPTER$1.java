package com.squareup.protos.franklin.lending;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.api.SelectPaymentPlanBlocker;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SelectPaymentPlanBlockerSubmitResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SelectPaymentPlanBlockerSubmitResponse((SelectPaymentPlanBlocker) obj, (ResponseContext) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(SelectPaymentPlanBlocker.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SelectPaymentPlanBlockerSubmitResponse selectPaymentPlanBlockerSubmitResponse = (SelectPaymentPlanBlockerSubmitResponse) obj;
        reverseProtoWriter.getClass();
        selectPaymentPlanBlockerSubmitResponse.getClass();
        reverseProtoWriter.writeBytes(selectPaymentPlanBlockerSubmitResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, selectPaymentPlanBlockerSubmitResponse.response_context);
        SelectPaymentPlanBlocker.ADAPTER.encodeWithTag(reverseProtoWriter, 1, selectPaymentPlanBlockerSubmitResponse.updated_blocker);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SelectPaymentPlanBlockerSubmitResponse selectPaymentPlanBlockerSubmitResponse = (SelectPaymentPlanBlockerSubmitResponse) obj;
        selectPaymentPlanBlockerSubmitResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(2, selectPaymentPlanBlockerSubmitResponse.response_context) + SelectPaymentPlanBlocker.ADAPTER.encodedSizeWithTag(1, selectPaymentPlanBlockerSubmitResponse.updated_blocker) + selectPaymentPlanBlockerSubmitResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SelectPaymentPlanBlockerSubmitResponse selectPaymentPlanBlockerSubmitResponse = (SelectPaymentPlanBlockerSubmitResponse) obj;
        selectPaymentPlanBlockerSubmitResponse.getClass();
        SelectPaymentPlanBlocker selectPaymentPlanBlocker = selectPaymentPlanBlockerSubmitResponse.updated_blocker;
        SelectPaymentPlanBlocker selectPaymentPlanBlocker2 = selectPaymentPlanBlocker != null ? (SelectPaymentPlanBlocker) SelectPaymentPlanBlocker.ADAPTER.redact(selectPaymentPlanBlocker) : null;
        ResponseContext responseContext = selectPaymentPlanBlockerSubmitResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SelectPaymentPlanBlockerSubmitResponse(selectPaymentPlanBlocker2, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SelectPaymentPlanBlockerSubmitResponse selectPaymentPlanBlockerSubmitResponse = (SelectPaymentPlanBlockerSubmitResponse) obj;
        selectPaymentPlanBlockerSubmitResponse.getClass();
        SelectPaymentPlanBlocker.ADAPTER.encodeWithTag(protoWriter, 1, selectPaymentPlanBlockerSubmitResponse.updated_blocker);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, selectPaymentPlanBlockerSubmitResponse.response_context);
        protoWriter.writeBytes(selectPaymentPlanBlockerSubmitResponse.unknownFields());
    }
}
