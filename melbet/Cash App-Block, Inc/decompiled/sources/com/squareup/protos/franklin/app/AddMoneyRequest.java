package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AddMoneyRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AddMoneyRequest> CREATOR;
    public final Money amount;
    public final PaymentMethod payment_method;
    public final RequestContext request_context;

    public enum PaymentMethod implements WireEnum {
        PAYMENT_METHOD_DO_NOT_USE(0),
        DEBIT_CARD(1),
        GOOGLE_PAY(2);

        public static final AddMoneyRequest$PaymentMethod$Companion$ADAPTER$1 ADAPTER;
        public static final TextSize.Companion Companion;
        public final int value;

        static {
            PaymentMethod paymentMethod = PAYMENT_METHOD_DO_NOT_USE;
            Companion = new TextSize.Companion();
            ADAPTER = new AddMoneyRequest$PaymentMethod$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PaymentMethod.class), Syntax.PROTO_2, paymentMethod);
        }

        PaymentMethod(int i) {
            this.value = i;
        }

        public static final PaymentMethod fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return PAYMENT_METHOD_DO_NOT_USE;
            }
            if (i == 1) {
                return DEBIT_CARD;
            }
            if (i != 2) {
                return null;
            }
            return GOOGLE_PAY;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        AddMoneyRequest$Companion$ADAPTER$1 addMoneyRequest$Companion$ADAPTER$1 = new AddMoneyRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AddMoneyRequest.class), "type.googleapis.com/squareup.franklin.app.AddMoneyRequest", Syntax.PROTO_2, null, "squareup/franklin/app/add_money.proto");
        ADAPTER = addMoneyRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(addMoneyRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMoneyRequest(RequestContext requestContext, Money money, PaymentMethod paymentMethod, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.amount = money;
        this.payment_method = paymentMethod;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddMoneyRequest)) {
            return false;
        }
        AddMoneyRequest addMoneyRequest = (AddMoneyRequest) obj;
        return Intrinsics.areEqual(unknownFields(), addMoneyRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, addMoneyRequest.request_context) && Intrinsics.areEqual(this.amount, addMoneyRequest.amount) && this.payment_method == addMoneyRequest.payment_method;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        PaymentMethod paymentMethod = this.payment_method;
        int hashCode4 = hashCode3 + (paymentMethod != null ? paymentMethod.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAlias.Builder builder = new UiAlias.Builder(12);
        builder.f1364type = this.request_context;
        builder.canonical_text = this.amount;
        builder.formatted = this.payment_method;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        PaymentMethod paymentMethod = this.payment_method;
        if (paymentMethod != null) {
            arrayList.add("payment_method=" + paymentMethod);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AddMoneyRequest{", "}", 0, null, null, 56);
    }
}
