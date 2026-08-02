package com.squareup.protos.cash.paymenttemplate.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
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
public final class PaymentTemplate extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentTemplate> CREATOR;
    public final Money amount;
    public final CreationChannel creation_channel;
    public final Long expires_at_millis;
    public final String note;
    public final String recipient_cashtag;
    public final String recipient_customer_token;
    public final String sender_cashtag;
    public final String sender_customer_token;
    public final String token;
    public final TransactionCategory transaction_category;

    static {
        PaymentTemplate$Companion$ADAPTER$1 paymentTemplate$Companion$ADAPTER$1 = new PaymentTemplate$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaymentTemplate.class), "type.googleapis.com/squareup.cash.paymenttemplate.v1.PaymentTemplate", Syntax.PROTO_2, null, "squareup/cash/paymenttemplate/v1/payment_template.proto");
        ADAPTER = paymentTemplate$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paymentTemplate$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentTemplate(String str, String str2, String str3, String str4, String str5, Money money, String str6, TransactionCategory transactionCategory, CreationChannel creationChannel, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.sender_customer_token = str2;
        this.sender_cashtag = str3;
        this.recipient_customer_token = str4;
        this.recipient_cashtag = str5;
        this.amount = money;
        this.note = str6;
        this.transaction_category = transactionCategory;
        this.creation_channel = creationChannel;
        this.expires_at_millis = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentTemplate)) {
            return false;
        }
        PaymentTemplate paymentTemplate = (PaymentTemplate) obj;
        return Intrinsics.areEqual(unknownFields(), paymentTemplate.unknownFields()) && Intrinsics.areEqual(this.token, paymentTemplate.token) && Intrinsics.areEqual(this.sender_customer_token, paymentTemplate.sender_customer_token) && Intrinsics.areEqual(this.sender_cashtag, paymentTemplate.sender_cashtag) && Intrinsics.areEqual(this.recipient_customer_token, paymentTemplate.recipient_customer_token) && Intrinsics.areEqual(this.recipient_cashtag, paymentTemplate.recipient_cashtag) && Intrinsics.areEqual(this.amount, paymentTemplate.amount) && Intrinsics.areEqual(this.note, paymentTemplate.note) && this.transaction_category == paymentTemplate.transaction_category && this.creation_channel == paymentTemplate.creation_channel && Intrinsics.areEqual(this.expires_at_millis, paymentTemplate.expires_at_millis);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.sender_customer_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.sender_cashtag;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.recipient_customer_token;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.recipient_cashtag;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode7 = (hashCode6 + (money != null ? money.hashCode() : 0)) * 37;
        String str6 = this.note;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        TransactionCategory transactionCategory = this.transaction_category;
        int hashCode9 = (hashCode8 + (transactionCategory != null ? transactionCategory.hashCode() : 0)) * 37;
        CreationChannel creationChannel = this.creation_channel;
        int hashCode10 = (hashCode9 + (creationChannel != null ? creationChannel.hashCode() : 0)) * 37;
        Long l = this.expires_at_millis;
        int hashCode11 = hashCode10 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CashInRequest.Builder builder = new CashInRequest.Builder(13);
        builder.external_id = this.token;
        builder.passcode_token = this.sender_customer_token;
        builder.external_client_transfer_token = this.sender_cashtag;
        builder.request_context = this.recipient_customer_token;
        builder.source = this.recipient_cashtag;
        builder.amount = this.amount;
        builder.target = this.note;
        builder.call_context = this.transaction_category;
        builder.forwarded_call_context = this.creation_channel;
        builder.client_verified_digital_wallet = this.expires_at_millis;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.sender_customer_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "sender_customer_token=", arrayList);
        }
        if (this.sender_cashtag != null) {
            arrayList.add("sender_cashtag=██");
        }
        String str3 = this.recipient_customer_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "recipient_customer_token=", arrayList);
        }
        if (this.recipient_cashtag != null) {
            arrayList.add("recipient_cashtag=██");
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        if (this.note != null) {
            arrayList.add("note=██");
        }
        TransactionCategory transactionCategory = this.transaction_category;
        if (transactionCategory != null) {
            arrayList.add("transaction_category=" + transactionCategory);
        }
        CreationChannel creationChannel = this.creation_channel;
        if (creationChannel != null) {
            arrayList.add("creation_channel=" + creationChannel);
        }
        Long l = this.expires_at_millis;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expires_at_millis=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentTemplate{", "}", 0, null, null, 56);
    }
}
