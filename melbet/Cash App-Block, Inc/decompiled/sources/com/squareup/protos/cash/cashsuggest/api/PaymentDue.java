package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.TransactionAmountLineItem;
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
public final class PaymentDue extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentDue> CREATOR;
    public final Money due_amount_in_cents;
    public final Long due_at_ms;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Money due_amount_in_cents;
        public Long due_at_ms;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new PaymentDue(this.due_at_ms, this.due_amount_in_cents, buildUnknownFields());
                default:
                    return new TransactionAmountLineItem(this.due_at_ms, this.due_amount_in_cents, buildUnknownFields());
            }
        }
    }

    static {
        PaymentDue$Companion$ADAPTER$1 paymentDue$Companion$ADAPTER$1 = new PaymentDue$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaymentDue.class), "type.googleapis.com/squareup.cash.cashsuggest.api.PaymentDue", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/CreditLineSnapshot.proto");
        ADAPTER = paymentDue$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paymentDue$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentDue(Long l, Money money, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.due_at_ms = l;
        this.due_amount_in_cents = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentDue)) {
            return false;
        }
        PaymentDue paymentDue = (PaymentDue) obj;
        return Intrinsics.areEqual(unknownFields(), paymentDue.unknownFields()) && Intrinsics.areEqual(this.due_at_ms, paymentDue.due_at_ms) && Intrinsics.areEqual(this.due_amount_in_cents, paymentDue.due_amount_in_cents);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.due_at_ms;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Money money = this.due_amount_in_cents;
        int hashCode3 = hashCode2 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.due_at_ms = this.due_at_ms;
        builder.due_amount_in_cents = this.due_amount_in_cents;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.due_at_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("due_at_ms=", l, arrayList);
        }
        Money money = this.due_amount_in_cents;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("due_amount_in_cents=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentDue{", "}", 0, null, null, 56);
    }
}
