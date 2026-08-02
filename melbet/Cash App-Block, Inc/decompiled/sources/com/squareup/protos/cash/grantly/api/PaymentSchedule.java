package com.squareup.protos.cash.grantly.api;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.common.Money;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PaymentSchedule extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentSchedule> CREATOR;
    public final Money amount;
    public final Boolean is_optional;
    public final Long payment_date;
    public final Integer payment_number;

    static {
        PaymentSchedule$Companion$ADAPTER$1 paymentSchedule$Companion$ADAPTER$1 = new PaymentSchedule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaymentSchedule.class), "type.googleapis.com/squareup.cash.grantly.api.PaymentSchedule", Syntax.PROTO_2, null, "squareup/cash/grantly/api/preauthorize_payment_response.proto");
        ADAPTER = paymentSchedule$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paymentSchedule$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSchedule(Integer num, Boolean bool, Long l, Money money, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.payment_number = num;
        this.is_optional = bool;
        this.payment_date = l;
        this.amount = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentSchedule)) {
            return false;
        }
        PaymentSchedule paymentSchedule = (PaymentSchedule) obj;
        return Intrinsics.areEqual(unknownFields(), paymentSchedule.unknownFields()) && Intrinsics.areEqual(this.payment_number, paymentSchedule.payment_number) && Intrinsics.areEqual(this.is_optional, paymentSchedule.is_optional) && Intrinsics.areEqual(this.payment_date, paymentSchedule.payment_date) && Intrinsics.areEqual(this.amount, paymentSchedule.amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.payment_number;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Boolean bool = this.is_optional;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Long l = this.payment_date;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Money money = this.amount;
        int hashCode5 = hashCode4 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.CardPii.Builder builder = new Card.CardPii.Builder(19, false);
        builder.postal_code = this.payment_number;
        builder.last_four_digits = this.is_optional;
        builder.expiration = this.payment_date;
        builder.ciphertext_ = this.amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.payment_number;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("payment_number=", num, arrayList);
        }
        Boolean bool = this.is_optional;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_optional=", bool, arrayList);
        }
        Long l = this.payment_date;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("payment_date=", l, arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentSchedule{", "}", 0, null, null, 56);
    }
}
