package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import android.os.Parcelable;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.cashface.api.Activity;
import com.squareup.protos.policychecker.v1.EvaluationVerdict;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/cashbusinesspayments/api/v1beta1/ValidateTapToPayPolicyResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashface/api/Activity$Builder;", "Builder", "V1EvaluationResult", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ValidateTapToPayPolicyResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ValidateTapToPayPolicyResponse> CREATOR;
    public final ValidateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult evaluation_result;

    public final class V1EvaluationResult extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<V1EvaluationResult> CREATOR;
        public final V1EvaluationFailureReason failure_reason;
        public final EvaluationVerdict verdict;

        public enum V1EvaluationFailureReason implements WireEnum {
            V1_EVALUATION_FAILURE_REASON_UNSPECIFIED(0),
            V1_EVALUATION_FAILURE_REASON_PLAY_PROTECT_TURNED_OFF(1),
            V1_EVALUATION_FAILURE_REASON_OS_PLATFORM_LEVEL_OUTDATED(2),
            V1_EVALUATION_FAILURE_REASON_SCREEN_RECORDING_ON(3);

            public static final ValidateTapToPayPolicyResponse$V1EvaluationResult$V1EvaluationFailureReason$Companion$ADAPTER$1 ADAPTER;
            public static final Error.Code.Companion Companion;
            public final int value;

            static {
                V1EvaluationFailureReason v1EvaluationFailureReason = V1_EVALUATION_FAILURE_REASON_UNSPECIFIED;
                Companion = new Error.Code.Companion(24);
                ADAPTER = new ValidateTapToPayPolicyResponse$V1EvaluationResult$V1EvaluationFailureReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(V1EvaluationFailureReason.class), Syntax.PROTO_2, v1EvaluationFailureReason);
            }

            V1EvaluationFailureReason(int i) {
                this.value = i;
            }

            public static final V1EvaluationFailureReason fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return V1_EVALUATION_FAILURE_REASON_UNSPECIFIED;
                }
                if (i == 1) {
                    return V1_EVALUATION_FAILURE_REASON_PLAY_PROTECT_TURNED_OFF;
                }
                if (i == 2) {
                    return V1_EVALUATION_FAILURE_REASON_OS_PLATFORM_LEVEL_OUTDATED;
                }
                if (i != 3) {
                    return null;
                }
                return V1_EVALUATION_FAILURE_REASON_SCREEN_RECORDING_ON;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            ValidateTapToPayPolicyResponse$V1EvaluationResult$Companion$ADAPTER$1 validateTapToPayPolicyResponse$V1EvaluationResult$Companion$ADAPTER$1 = new ValidateTapToPayPolicyResponse$V1EvaluationResult$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(V1EvaluationResult.class), "type.googleapis.com/squareup.cash.cashbusinesspayments.api.v1beta1.ValidateTapToPayPolicyResponse.V1EvaluationResult", Syntax.PROTO_2, null, "squareup/cash/cashbusinesspayments/api/v1beta1/client_service.proto");
            ADAPTER = validateTapToPayPolicyResponse$V1EvaluationResult$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(validateTapToPayPolicyResponse$V1EvaluationResult$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public V1EvaluationResult(EvaluationVerdict evaluationVerdict, V1EvaluationFailureReason v1EvaluationFailureReason, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.verdict = evaluationVerdict;
            this.failure_reason = v1EvaluationFailureReason;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof V1EvaluationResult)) {
                return false;
            }
            V1EvaluationResult v1EvaluationResult = (V1EvaluationResult) obj;
            return Intrinsics.areEqual(unknownFields(), v1EvaluationResult.unknownFields()) && this.verdict == v1EvaluationResult.verdict && this.failure_reason == v1EvaluationResult.failure_reason;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            EvaluationVerdict evaluationVerdict = this.verdict;
            int hashCode2 = (hashCode + (evaluationVerdict != null ? evaluationVerdict.hashCode() : 0)) * 37;
            V1EvaluationFailureReason v1EvaluationFailureReason = this.failure_reason;
            int hashCode3 = hashCode2 + (v1EvaluationFailureReason != null ? v1EvaluationFailureReason.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ResponseMetadata.Builder builder = new ResponseMetadata.Builder(16);
            builder.errors = this.verdict;
            builder.result = this.failure_reason;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            EvaluationVerdict evaluationVerdict = this.verdict;
            if (evaluationVerdict != null) {
                arrayList.add("verdict=" + evaluationVerdict);
            }
            V1EvaluationFailureReason v1EvaluationFailureReason = this.failure_reason;
            if (v1EvaluationFailureReason != null) {
                arrayList.add("failure_reason=" + v1EvaluationFailureReason);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "V1EvaluationResult{", "}", 0, null, null, 56);
        }
    }

    static {
        ValidateTapToPayPolicyResponse$Companion$ADAPTER$1 validateTapToPayPolicyResponse$Companion$ADAPTER$1 = new ValidateTapToPayPolicyResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ValidateTapToPayPolicyResponse.class), "type.googleapis.com/squareup.cash.cashbusinesspayments.api.v1beta1.ValidateTapToPayPolicyResponse", Syntax.PROTO_2, null, "squareup/cash/cashbusinesspayments/api/v1beta1/client_service.proto");
        ADAPTER = validateTapToPayPolicyResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(validateTapToPayPolicyResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateTapToPayPolicyResponse(ValidateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.evaluation_result = validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ValidateTapToPayPolicyResponse)) {
            return false;
        }
        ValidateTapToPayPolicyResponse validateTapToPayPolicyResponse = (ValidateTapToPayPolicyResponse) obj;
        return Intrinsics.areEqual(unknownFields(), validateTapToPayPolicyResponse.unknownFields()) && Intrinsics.areEqual(this.evaluation_result, validateTapToPayPolicyResponse.evaluation_result);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ValidateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult = this.evaluation_result;
        int hashCode2 = hashCode + (validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult != null ? validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Activity.Builder builder = new Activity.Builder(7);
        builder.activity = this.evaluation_result;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ValidateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult = this.evaluation_result;
        if (validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult != null) {
            arrayList.add("evaluation_result=" + validateTapToPayPolicyResponse$EvaluationResult$V1EvaluationResult);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ValidateTapToPayPolicyResponse{", "}", 0, null, null, 56);
    }
}
