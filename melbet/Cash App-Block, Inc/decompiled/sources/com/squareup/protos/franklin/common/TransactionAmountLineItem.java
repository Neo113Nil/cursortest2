package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.PaymentDue;
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
public final class TransactionAmountLineItem extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TransactionAmountLineItem> CREATOR;
    public final Money amount;
    public final Long occurred_at;

    static {
        TransactionAmountLineItem$Companion$ADAPTER$1 transactionAmountLineItem$Companion$ADAPTER$1 = new TransactionAmountLineItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TransactionAmountLineItem.class), "type.googleapis.com/squareup.franklin.TransactionAmountLineItem", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = transactionAmountLineItem$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(transactionAmountLineItem$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionAmountLineItem(Long l, Money money, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.occurred_at = l;
        this.amount = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransactionAmountLineItem)) {
            return false;
        }
        TransactionAmountLineItem transactionAmountLineItem = (TransactionAmountLineItem) obj;
        return Intrinsics.areEqual(unknownFields(), transactionAmountLineItem.unknownFields()) && Intrinsics.areEqual(this.occurred_at, transactionAmountLineItem.occurred_at) && Intrinsics.areEqual(this.amount, transactionAmountLineItem.amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.occurred_at;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Money money = this.amount;
        int hashCode3 = hashCode2 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PaymentDue.Builder builder = new PaymentDue.Builder(1);
        builder.due_at_ms = this.occurred_at;
        builder.due_amount_in_cents = this.amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.occurred_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("occurred_at=", l, arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TransactionAmountLineItem{", "}", 0, null, null, 56);
    }
}
