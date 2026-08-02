package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
import com.squareup.protos.common.Money;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.time.Instant;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TransactionEvent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TransactionEvent> CREATOR;
    public final Money amount;
    public final Instant date;
    public final Boolean is_refunded;

    static {
        TransactionEvent$Companion$ADAPTER$1 transactionEvent$Companion$ADAPTER$1 = new TransactionEvent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TransactionEvent.class), "type.googleapis.com/squareup.cash.cashbusinesspayments.api.v1beta1.TransactionEvent", Syntax.PROTO_2, null, "squareup/cash/cashbusinesspayments/api/v1beta1/receipt_data.proto");
        ADAPTER = transactionEvent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(transactionEvent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionEvent(Instant instant, Money money, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.date = instant;
        this.amount = money;
        this.is_refunded = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransactionEvent)) {
            return false;
        }
        TransactionEvent transactionEvent = (TransactionEvent) obj;
        return Intrinsics.areEqual(unknownFields(), transactionEvent.unknownFields()) && Intrinsics.areEqual(this.date, transactionEvent.date) && Intrinsics.areEqual(this.amount, transactionEvent.amount) && Intrinsics.areEqual(this.is_refunded, transactionEvent.is_refunded);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Instant instant = this.date;
        int hashCode2 = (hashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Boolean bool = this.is_refunded;
        int hashCode4 = hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Row.Builder builder = new Row.Builder(1);
        builder.title = this.date;
        builder.subtitle = this.amount;
        builder.action = this.is_refunded;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Instant instant = this.date;
        if (instant != null) {
            Matcher$$ExternalSyntheticOutline0.m("date=", instant, arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        Boolean bool = this.is_refunded;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_refunded=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TransactionEvent{", "}", 0, null, null, 56);
    }
}
