package com.squareup.protos.cash.fiatly.api.v2;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.p2p.engine.api.v1.PaymentStateCode;
import com.squareup.protos.cash.janus.api.ContactAlias;
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
public final class PaymentUpdate extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentUpdate> CREATOR;
    public final Money amount;
    public final PaymentStateCategory payment_state_category;
    public final PaymentStateCode payment_state_code;
    public final String payment_token;
    public final String sender_customer_token;
    public final SenderProfileData sender_profile;
    public final Long sequence;

    static {
        PaymentUpdate$Companion$ADAPTER$1 paymentUpdate$Companion$ADAPTER$1 = new PaymentUpdate$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaymentUpdate.class), "type.googleapis.com/squareup.cash.fiatly.api.v2beta.PaymentUpdate", Syntax.PROTO_2, null, "squareup/cash/fiatly/api/v2beta/p2p_real_time_service.proto");
        ADAPTER = paymentUpdate$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paymentUpdate$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentUpdate(String str, String str2, Money money, PaymentStateCode paymentStateCode, SenderProfileData senderProfileData, PaymentStateCategory paymentStateCategory, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.payment_token = str;
        this.sender_customer_token = str2;
        this.amount = money;
        this.payment_state_code = paymentStateCode;
        this.sender_profile = senderProfileData;
        this.payment_state_category = paymentStateCategory;
        this.sequence = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentUpdate)) {
            return false;
        }
        PaymentUpdate paymentUpdate = (PaymentUpdate) obj;
        return Intrinsics.areEqual(unknownFields(), paymentUpdate.unknownFields()) && Intrinsics.areEqual(this.payment_token, paymentUpdate.payment_token) && Intrinsics.areEqual(this.sender_customer_token, paymentUpdate.sender_customer_token) && Intrinsics.areEqual(this.amount, paymentUpdate.amount) && this.payment_state_code == paymentUpdate.payment_state_code && Intrinsics.areEqual(this.sender_profile, paymentUpdate.sender_profile) && this.payment_state_category == paymentUpdate.payment_state_category && Intrinsics.areEqual(this.sequence, paymentUpdate.sequence);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.payment_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.sender_customer_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        PaymentStateCode paymentStateCode = this.payment_state_code;
        int hashCode5 = (hashCode4 + (paymentStateCode != null ? paymentStateCode.hashCode() : 0)) * 37;
        SenderProfileData senderProfileData = this.sender_profile;
        int hashCode6 = (hashCode5 + (senderProfileData != null ? senderProfileData.hashCode() : 0)) * 37;
        PaymentStateCategory paymentStateCategory = this.payment_state_category;
        int hashCode7 = (hashCode6 + (paymentStateCategory != null ? paymentStateCategory.hashCode() : 0)) * 37;
        Long l = this.sequence;
        int hashCode8 = hashCode7 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ContactAlias.Builder builder = new ContactAlias.Builder(24, false);
        builder.customer_token = this.payment_token;
        builder.alias_value = this.sender_customer_token;
        builder.hashed_alias_token = this.amount;
        builder.alias_type = this.payment_state_code;
        builder.linked_at = this.sender_profile;
        builder.version = this.payment_state_category;
        builder.updated_at = this.sequence;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.payment_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "payment_token=", arrayList);
        }
        String str2 = this.sender_customer_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "sender_customer_token=", arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        PaymentStateCode paymentStateCode = this.payment_state_code;
        if (paymentStateCode != null) {
            arrayList.add("payment_state_code=" + paymentStateCode);
        }
        SenderProfileData senderProfileData = this.sender_profile;
        if (senderProfileData != null) {
            arrayList.add("sender_profile=" + senderProfileData);
        }
        PaymentStateCategory paymentStateCategory = this.payment_state_category;
        if (paymentStateCategory != null) {
            arrayList.add("payment_state_category=" + paymentStateCategory);
        }
        Long l = this.sequence;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("sequence=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentUpdate{", "}", 0, null, null, 56);
    }
}
