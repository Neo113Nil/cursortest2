package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.ValidateTapToPayPolicyResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ValidateTapToPayPolicyResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ValidateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ValidateTapToPayPolicyResponse(validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult = new ValidateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult((ValidateTapToPayPolicyResponse.V1EvaluationResult) ValidateTapToPayPolicyResponse.V1EvaluationResult.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ValidateTapToPayPolicyResponse validateTapToPayPolicyResponse = (ValidateTapToPayPolicyResponse) obj;
        reverseProtoWriter.getClass();
        validateTapToPayPolicyResponse.getClass();
        reverseProtoWriter.writeBytes(validateTapToPayPolicyResponse.unknownFields());
        ValidateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult = validateTapToPayPolicyResponse.evaluation_result;
        if (validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult != null) {
            ValidateTapToPayPolicyResponse.V1EvaluationResult.ADAPTER.encodeWithTag(reverseProtoWriter, 1, validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult.value);
        } else {
            if (validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ValidateTapToPayPolicyResponse validateTapToPayPolicyResponse = (ValidateTapToPayPolicyResponse) obj;
        validateTapToPayPolicyResponse.getClass();
        int size$okio = validateTapToPayPolicyResponse.unknownFields().getSize$okio();
        ValidateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult = validateTapToPayPolicyResponse.evaluation_result;
        if (validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult != null) {
            return ValidateTapToPayPolicyResponse.V1EvaluationResult.ADAPTER.encodedSizeWithTag(1, validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult.value) + size$okio;
        }
        if (validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult == null) {
            return size$okio;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ValidateTapToPayPolicyResponse validateTapToPayPolicyResponse = (ValidateTapToPayPolicyResponse) obj;
        validateTapToPayPolicyResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        ValidateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult = validateTapToPayPolicyResponse.evaluation_result;
        byteString.getClass();
        return new ValidateTapToPayPolicyResponse(validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ValidateTapToPayPolicyResponse validateTapToPayPolicyResponse = (ValidateTapToPayPolicyResponse) obj;
        validateTapToPayPolicyResponse.getClass();
        ValidateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult = validateTapToPayPolicyResponse.evaluation_result;
        if (validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult != null) {
            ValidateTapToPayPolicyResponse.V1EvaluationResult.ADAPTER.encodeWithTag(protoWriter, 1, validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult.value);
        } else if (validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(validateTapToPayPolicyResponse.unknownFields());
    }
}
