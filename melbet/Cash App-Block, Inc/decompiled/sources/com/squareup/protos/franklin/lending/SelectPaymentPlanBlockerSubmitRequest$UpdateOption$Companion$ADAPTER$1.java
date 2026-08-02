package com.squareup.protos.franklin.lending;

import com.squareup.protos.franklin.lending.SelectPaymentPlanBlockerSubmitRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SelectPaymentPlanBlockerSubmitRequest$UpdateOption$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SelectPaymentPlanBlockerSubmitRequest.UpdateOption((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        SelectPaymentPlanBlockerSubmitRequest.UpdateOption updateOption = (SelectPaymentPlanBlockerSubmitRequest.UpdateOption) obj;
        reverseProtoWriter.getClass();
        updateOption.getClass();
        reverseProtoWriter.writeBytes(updateOption.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, updateOption.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SelectPaymentPlanBlockerSubmitRequest.UpdateOption updateOption = (SelectPaymentPlanBlockerSubmitRequest.UpdateOption) obj;
        updateOption.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, updateOption.token) + updateOption.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SelectPaymentPlanBlockerSubmitRequest.UpdateOption updateOption = (SelectPaymentPlanBlockerSubmitRequest.UpdateOption) obj;
        updateOption.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = updateOption.token;
        byteString.getClass();
        return new SelectPaymentPlanBlockerSubmitRequest.UpdateOption(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SelectPaymentPlanBlockerSubmitRequest.UpdateOption updateOption = (SelectPaymentPlanBlockerSubmitRequest.UpdateOption) obj;
        updateOption.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateOption.token);
        protoWriter.writeBytes(updateOption.unknownFields());
    }
}
