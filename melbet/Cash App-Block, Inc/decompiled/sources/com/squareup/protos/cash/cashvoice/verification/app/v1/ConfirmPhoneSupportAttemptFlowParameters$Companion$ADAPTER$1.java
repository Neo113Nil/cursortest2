package com.squareup.protos.cash.cashvoice.verification.app.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ConfirmPhoneSupportAttemptFlowParameters$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ConfirmPhoneSupportAttemptFlowParameters((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        ConfirmPhoneSupportAttemptFlowParameters confirmPhoneSupportAttemptFlowParameters = (ConfirmPhoneSupportAttemptFlowParameters) obj;
        reverseProtoWriter.getClass();
        confirmPhoneSupportAttemptFlowParameters.getClass();
        reverseProtoWriter.writeBytes(confirmPhoneSupportAttemptFlowParameters.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, confirmPhoneSupportAttemptFlowParameters.verification_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ConfirmPhoneSupportAttemptFlowParameters confirmPhoneSupportAttemptFlowParameters = (ConfirmPhoneSupportAttemptFlowParameters) obj;
        confirmPhoneSupportAttemptFlowParameters.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, confirmPhoneSupportAttemptFlowParameters.verification_id) + confirmPhoneSupportAttemptFlowParameters.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ConfirmPhoneSupportAttemptFlowParameters confirmPhoneSupportAttemptFlowParameters = (ConfirmPhoneSupportAttemptFlowParameters) obj;
        confirmPhoneSupportAttemptFlowParameters.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = confirmPhoneSupportAttemptFlowParameters.verification_id;
        byteString.getClass();
        return new ConfirmPhoneSupportAttemptFlowParameters(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ConfirmPhoneSupportAttemptFlowParameters confirmPhoneSupportAttemptFlowParameters = (ConfirmPhoneSupportAttemptFlowParameters) obj;
        confirmPhoneSupportAttemptFlowParameters.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, confirmPhoneSupportAttemptFlowParameters.verification_id);
        protoWriter.writeBytes(confirmPhoneSupportAttemptFlowParameters.unknownFields());
    }
}
