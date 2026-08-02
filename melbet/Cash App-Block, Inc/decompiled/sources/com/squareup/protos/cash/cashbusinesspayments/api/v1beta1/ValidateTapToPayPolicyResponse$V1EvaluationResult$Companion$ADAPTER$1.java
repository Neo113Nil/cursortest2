package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.ValidateTapToPayPolicyResponse;
import com.squareup.protos.policychecker.v1.EvaluationVerdict;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ValidateTapToPayPolicyResponse$V1EvaluationResult$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ValidateTapToPayPolicyResponse.V1EvaluationResult((EvaluationVerdict) obj, (ValidateTapToPayPolicyResponse.V1EvaluationResult.V1EvaluationFailureReason) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = EvaluationVerdict.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = ValidateTapToPayPolicyResponse.V1EvaluationResult.V1EvaluationFailureReason.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ValidateTapToPayPolicyResponse.V1EvaluationResult v1EvaluationResult = (ValidateTapToPayPolicyResponse.V1EvaluationResult) obj;
        reverseProtoWriter.getClass();
        v1EvaluationResult.getClass();
        reverseProtoWriter.writeBytes(v1EvaluationResult.unknownFields());
        ValidateTapToPayPolicyResponse.V1EvaluationResult.V1EvaluationFailureReason.ADAPTER.encodeWithTag(reverseProtoWriter, 3, v1EvaluationResult.failure_reason);
        EvaluationVerdict.ADAPTER.encodeWithTag(reverseProtoWriter, 1, v1EvaluationResult.verdict);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ValidateTapToPayPolicyResponse.V1EvaluationResult v1EvaluationResult = (ValidateTapToPayPolicyResponse.V1EvaluationResult) obj;
        v1EvaluationResult.getClass();
        return ValidateTapToPayPolicyResponse.V1EvaluationResult.V1EvaluationFailureReason.ADAPTER.encodedSizeWithTag(3, v1EvaluationResult.failure_reason) + EvaluationVerdict.ADAPTER.encodedSizeWithTag(1, v1EvaluationResult.verdict) + v1EvaluationResult.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ValidateTapToPayPolicyResponse.V1EvaluationResult v1EvaluationResult = (ValidateTapToPayPolicyResponse.V1EvaluationResult) obj;
        v1EvaluationResult.getClass();
        ByteString byteString = ByteString.EMPTY;
        EvaluationVerdict evaluationVerdict = v1EvaluationResult.verdict;
        ValidateTapToPayPolicyResponse.V1EvaluationResult.V1EvaluationFailureReason v1EvaluationFailureReason = v1EvaluationResult.failure_reason;
        byteString.getClass();
        return new ValidateTapToPayPolicyResponse.V1EvaluationResult(evaluationVerdict, v1EvaluationFailureReason, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ValidateTapToPayPolicyResponse.V1EvaluationResult v1EvaluationResult = (ValidateTapToPayPolicyResponse.V1EvaluationResult) obj;
        v1EvaluationResult.getClass();
        EvaluationVerdict.ADAPTER.encodeWithTag(protoWriter, 1, v1EvaluationResult.verdict);
        ValidateTapToPayPolicyResponse.V1EvaluationResult.V1EvaluationFailureReason.ADAPTER.encodeWithTag(protoWriter, 3, v1EvaluationResult.failure_reason);
        protoWriter.writeBytes(v1EvaluationResult.unknownFields());
    }
}
