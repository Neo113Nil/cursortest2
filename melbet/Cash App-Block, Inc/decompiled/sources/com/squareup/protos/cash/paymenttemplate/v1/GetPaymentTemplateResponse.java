package com.squareup.protos.cash.paymenttemplate.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
import com.squareup.protos.cash.papermate.enums.FeeType;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/paymenttemplate/v1/GetPaymentTemplateResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/nearby/api/v1/BLEPayload$Builder;", "Builder", "ErrorCode", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetPaymentTemplateResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPaymentTemplateResponse> CREATOR;
    public final ErrorCode error_code;
    public final PaymentOptions payment_options;
    public final PaymentTemplate payment_template;

    public enum ErrorCode implements WireEnum {
        ERROR_CODE_UNSPECIFIED(0),
        ERROR_CODE_PAYMENT_TEMPLATE_NOT_FOUND(1),
        ERROR_CODE_PAYMENT_TEMPLATE_EXPIRED(2);

        public static final GetPaymentTemplateResponse$ErrorCode$Companion$ADAPTER$1 ADAPTER;
        public static final FeeType.Companion Companion;
        public final int value;

        static {
            ErrorCode errorCode = ERROR_CODE_UNSPECIFIED;
            Companion = new FeeType.Companion();
            ADAPTER = new GetPaymentTemplateResponse$ErrorCode$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ErrorCode.class), Syntax.PROTO_2, errorCode);
        }

        ErrorCode(int i) {
            this.value = i;
        }

        public static final ErrorCode fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return ERROR_CODE_UNSPECIFIED;
            }
            if (i == 1) {
                return ERROR_CODE_PAYMENT_TEMPLATE_NOT_FOUND;
            }
            if (i != 2) {
                return null;
            }
            return ERROR_CODE_PAYMENT_TEMPLATE_EXPIRED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        GetPaymentTemplateResponse$Companion$ADAPTER$1 getPaymentTemplateResponse$Companion$ADAPTER$1 = new GetPaymentTemplateResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetPaymentTemplateResponse.class), "type.googleapis.com/squareup.cash.paymenttemplate.v1.GetPaymentTemplateResponse", Syntax.PROTO_2, null, "squareup/cash/paymenttemplate/v1/payment_template.proto");
        ADAPTER = getPaymentTemplateResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getPaymentTemplateResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPaymentTemplateResponse(PaymentTemplate paymentTemplate, ErrorCode errorCode, PaymentOptions paymentOptions, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.payment_template = paymentTemplate;
        this.error_code = errorCode;
        this.payment_options = paymentOptions;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPaymentTemplateResponse)) {
            return false;
        }
        GetPaymentTemplateResponse getPaymentTemplateResponse = (GetPaymentTemplateResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getPaymentTemplateResponse.unknownFields()) && Intrinsics.areEqual(this.payment_template, getPaymentTemplateResponse.payment_template) && this.error_code == getPaymentTemplateResponse.error_code && Intrinsics.areEqual(this.payment_options, getPaymentTemplateResponse.payment_options);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PaymentTemplate paymentTemplate = this.payment_template;
        int hashCode2 = (hashCode + (paymentTemplate != null ? paymentTemplate.hashCode() : 0)) * 37;
        ErrorCode errorCode = this.error_code;
        int hashCode3 = (hashCode2 + (errorCode != null ? errorCode.hashCode() : 0)) * 37;
        PaymentOptions paymentOptions = this.payment_options;
        int hashCode4 = hashCode3 + (paymentOptions != null ? paymentOptions.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BLEPayload.Builder builder = new BLEPayload.Builder(24, false);
        builder.advertisement_data = this.payment_template;
        builder.transmission_level = this.error_code;
        builder.frequency = this.payment_options;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PaymentTemplate paymentTemplate = this.payment_template;
        if (paymentTemplate != null) {
            arrayList.add("payment_template=" + paymentTemplate);
        }
        ErrorCode errorCode = this.error_code;
        if (errorCode != null) {
            arrayList.add("error_code=" + errorCode);
        }
        PaymentOptions paymentOptions = this.payment_options;
        if (paymentOptions != null) {
            arrayList.add("payment_options=" + paymentOptions);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPaymentTemplateResponse{", "}", 0, null, null, 56);
    }
}
