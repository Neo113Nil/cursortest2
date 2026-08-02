package com.squareup.protos.cash.cashbusinesspayments.plasma.v1beta1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class EligibilityCheckFlowParameters$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EligibilityCheckFlowParameters((String) obj, (Money) obj2, (SignedSerializedMRIContext) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(SignedSerializedMRIContext.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EligibilityCheckFlowParameters eligibilityCheckFlowParameters = (EligibilityCheckFlowParameters) obj;
        reverseProtoWriter.getClass();
        eligibilityCheckFlowParameters.getClass();
        reverseProtoWriter.writeBytes(eligibilityCheckFlowParameters.unknownFields());
        SignedSerializedMRIContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, eligibilityCheckFlowParameters.signed_mri_context);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, eligibilityCheckFlowParameters.payment_amount);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, eligibilityCheckFlowParameters.idempotency_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EligibilityCheckFlowParameters eligibilityCheckFlowParameters = (EligibilityCheckFlowParameters) obj;
        eligibilityCheckFlowParameters.getClass();
        return SignedSerializedMRIContext.ADAPTER.encodedSizeWithTag(3, eligibilityCheckFlowParameters.signed_mri_context) + Money.ADAPTER.encodedSizeWithTag(2, eligibilityCheckFlowParameters.payment_amount) + ProtoAdapter.STRING.encodedSizeWithTag(1, eligibilityCheckFlowParameters.idempotency_token) + eligibilityCheckFlowParameters.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EligibilityCheckFlowParameters eligibilityCheckFlowParameters = (EligibilityCheckFlowParameters) obj;
        eligibilityCheckFlowParameters.getClass();
        Money money = eligibilityCheckFlowParameters.payment_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        SignedSerializedMRIContext signedSerializedMRIContext = eligibilityCheckFlowParameters.signed_mri_context;
        SignedSerializedMRIContext signedSerializedMRIContext2 = signedSerializedMRIContext != null ? (SignedSerializedMRIContext) SignedSerializedMRIContext.ADAPTER.redact(signedSerializedMRIContext) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = eligibilityCheckFlowParameters.idempotency_token;
        byteString.getClass();
        return new EligibilityCheckFlowParameters(str, money2, signedSerializedMRIContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EligibilityCheckFlowParameters eligibilityCheckFlowParameters = (EligibilityCheckFlowParameters) obj;
        eligibilityCheckFlowParameters.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, eligibilityCheckFlowParameters.idempotency_token);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, eligibilityCheckFlowParameters.payment_amount);
        SignedSerializedMRIContext.ADAPTER.encodeWithTag(protoWriter, 3, eligibilityCheckFlowParameters.signed_mri_context);
        protoWriter.writeBytes(eligibilityCheckFlowParameters.unknownFields());
    }
}
