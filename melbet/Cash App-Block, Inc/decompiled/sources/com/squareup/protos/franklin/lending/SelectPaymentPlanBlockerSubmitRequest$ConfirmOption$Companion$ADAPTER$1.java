package com.squareup.protos.franklin.lending;

import com.squareup.protos.franklin.lending.SelectPaymentPlanBlockerSubmitRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SelectPaymentPlanBlockerSubmitRequest$ConfirmOption$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SelectPaymentPlanBlockerSubmitRequest.ConfirmOption((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SelectPaymentPlanBlockerSubmitRequest.ConfirmOption confirmOption = (SelectPaymentPlanBlockerSubmitRequest.ConfirmOption) obj;
        reverseProtoWriter.getClass();
        confirmOption.getClass();
        reverseProtoWriter.writeBytes(confirmOption.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, confirmOption.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SelectPaymentPlanBlockerSubmitRequest.ConfirmOption confirmOption = (SelectPaymentPlanBlockerSubmitRequest.ConfirmOption) obj;
        confirmOption.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, confirmOption.token) + confirmOption.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SelectPaymentPlanBlockerSubmitRequest.ConfirmOption confirmOption = (SelectPaymentPlanBlockerSubmitRequest.ConfirmOption) obj;
        confirmOption.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = confirmOption.token;
        byteString.getClass();
        return new SelectPaymentPlanBlockerSubmitRequest.ConfirmOption(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SelectPaymentPlanBlockerSubmitRequest.ConfirmOption confirmOption = (SelectPaymentPlanBlockerSubmitRequest.ConfirmOption) obj;
        confirmOption.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, confirmOption.token);
        protoWriter.writeBytes(confirmOption.unknownFields());
    }
}
