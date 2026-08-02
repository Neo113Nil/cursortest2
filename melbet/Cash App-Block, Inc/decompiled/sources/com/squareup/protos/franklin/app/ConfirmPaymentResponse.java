package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.ui.UiPayment;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/franklin/app/ConfirmPaymentResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/UiAlias$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ConfirmPaymentResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ConfirmPaymentResponse> CREATOR;
    public final UiPayment payment;
    public final ResponseContext response_context;
    public final Status status;

    /* loaded from: classes.dex */
    public enum Status implements WireEnum {
        INVALID(0),
        SUCCESS(1),
        CONCURRENT_MODIFICATION(3),
        FAILED(4);

        public static final ConfirmPaymentResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final UiAlias.Type.Companion Companion;
        public final int value;

        static {
            Status status = INVALID;
            Companion = new UiAlias.Type.Companion();
            ADAPTER = new ConfirmPaymentResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return INVALID;
            }
            if (i == 1) {
                return SUCCESS;
            }
            if (i == 3) {
                return CONCURRENT_MODIFICATION;
            }
            if (i != 4) {
                return null;
            }
            return FAILED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ConfirmPaymentResponse$Companion$ADAPTER$1 confirmPaymentResponse$Companion$ADAPTER$1 = new ConfirmPaymentResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ConfirmPaymentResponse.class), "type.googleapis.com/squareup.franklin.app.ConfirmPaymentResponse", Syntax.PROTO_2, null, "squareup/franklin/app/payment.proto");
        ADAPTER = confirmPaymentResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(confirmPaymentResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmPaymentResponse(ResponseContext responseContext, Status status, UiPayment uiPayment, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.status = status;
        this.payment = uiPayment;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConfirmPaymentResponse)) {
            return false;
        }
        ConfirmPaymentResponse confirmPaymentResponse = (ConfirmPaymentResponse) obj;
        return Intrinsics.areEqual(unknownFields(), confirmPaymentResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, confirmPaymentResponse.response_context) && this.status == confirmPaymentResponse.status && Intrinsics.areEqual(this.payment, confirmPaymentResponse.payment);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        Status status = this.status;
        int hashCode3 = (hashCode2 + (status != null ? status.hashCode() : 0)) * 37;
        UiPayment uiPayment = this.payment;
        int hashCode4 = hashCode3 + (uiPayment != null ? uiPayment.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAlias.Builder builder = new UiAlias.Builder(19);
        builder.f1364type = this.response_context;
        builder.canonical_text = this.status;
        builder.formatted = this.payment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        UiPayment uiPayment = this.payment;
        if (uiPayment != null) {
            arrayList.add("payment=" + uiPayment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ConfirmPaymentResponse{", "}", 0, null, null, 56);
    }
}
