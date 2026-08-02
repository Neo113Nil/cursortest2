package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LoanAmountPickerRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LoanAmountPickerRequest((RequestContext) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LoanAmountPickerRequest loanAmountPickerRequest = (LoanAmountPickerRequest) obj;
        reverseProtoWriter.getClass();
        loanAmountPickerRequest.getClass();
        reverseProtoWriter.writeBytes(loanAmountPickerRequest.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, loanAmountPickerRequest.selected_amount_cents);
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, loanAmountPickerRequest.request_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LoanAmountPickerRequest loanAmountPickerRequest = (LoanAmountPickerRequest) obj;
        loanAmountPickerRequest.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(2, loanAmountPickerRequest.selected_amount_cents) + RequestContext.ADAPTER.encodedSizeWithTag(1, loanAmountPickerRequest.request_context) + loanAmountPickerRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LoanAmountPickerRequest loanAmountPickerRequest = (LoanAmountPickerRequest) obj;
        loanAmountPickerRequest.getClass();
        RequestContext requestContext = loanAmountPickerRequest.request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = loanAmountPickerRequest.selected_amount_cents;
        byteString.getClass();
        return new LoanAmountPickerRequest(requestContext2, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LoanAmountPickerRequest loanAmountPickerRequest = (LoanAmountPickerRequest) obj;
        loanAmountPickerRequest.getClass();
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, loanAmountPickerRequest.request_context);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, loanAmountPickerRequest.selected_amount_cents);
        protoWriter.writeBytes(loanAmountPickerRequest.unknownFields());
    }
}
