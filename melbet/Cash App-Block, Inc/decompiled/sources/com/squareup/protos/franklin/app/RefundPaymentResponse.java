package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.ui.UiPayment;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/app/RefundPaymentResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/app/BankingConfig$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RefundPaymentResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RefundPaymentResponse> CREATOR;
    public final UiPayment payment;
    public final ResponseContext response_context;

    static {
        RefundPaymentResponse$Companion$ADAPTER$1 refundPaymentResponse$Companion$ADAPTER$1 = new RefundPaymentResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RefundPaymentResponse.class), "type.googleapis.com/squareup.franklin.app.RefundPaymentResponse", Syntax.PROTO_2, null, "squareup/franklin/app/payment.proto");
        ADAPTER = refundPaymentResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(refundPaymentResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefundPaymentResponse(ResponseContext responseContext, UiPayment uiPayment, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.payment = uiPayment;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RefundPaymentResponse)) {
            return false;
        }
        RefundPaymentResponse refundPaymentResponse = (RefundPaymentResponse) obj;
        return Intrinsics.areEqual(unknownFields(), refundPaymentResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, refundPaymentResponse.response_context) && Intrinsics.areEqual(this.payment, refundPaymentResponse.payment);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        UiPayment uiPayment = this.payment;
        int hashCode3 = hashCode2 + (uiPayment != null ? uiPayment.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BankingConfig.Builder builder = new BankingConfig.Builder(25);
        builder.strings = this.response_context;
        builder.recurring_deposits_dda_upsell = this.payment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        UiPayment uiPayment = this.payment;
        if (uiPayment != null) {
            arrayList.add("payment=" + uiPayment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RefundPaymentResponse{", "}", 0, null, null, 56);
    }
}
