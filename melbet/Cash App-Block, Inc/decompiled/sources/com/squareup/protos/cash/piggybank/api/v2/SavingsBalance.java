package com.squareup.protos.cash.piggybank.api.v2;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.taply.app.v1.Allowed;
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
public final class SavingsBalance extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsBalance> CREATOR;
    public final Money amount;
    public final String customer_token;
    public final String stored_value_balance_token;
    public final String token;

    static {
        SavingsBalance$Companion$ADAPTER$1 savingsBalance$Companion$ADAPTER$1 = new SavingsBalance$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsBalance.class), "type.googleapis.com/squareup.cash.piggybank.api.v2.SavingsBalance", Syntax.PROTO_2, null, "squareup/cash/piggybank/api/v2/models.proto");
        ADAPTER = savingsBalance$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsBalance$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsBalance(String str, String str2, Money money, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.amount = money;
        this.stored_value_balance_token = str2;
        this.customer_token = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsBalance)) {
            return false;
        }
        SavingsBalance savingsBalance = (SavingsBalance) obj;
        return Intrinsics.areEqual(unknownFields(), savingsBalance.unknownFields()) && Intrinsics.areEqual(this.token, savingsBalance.token) && Intrinsics.areEqual(this.amount, savingsBalance.amount) && Intrinsics.areEqual(this.stored_value_balance_token, savingsBalance.stored_value_balance_token) && Intrinsics.areEqual(this.customer_token, savingsBalance.customer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        String str2 = this.stored_value_balance_token;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.customer_token;
        int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Allowed.Builder builder = new Allowed.Builder(4);
        builder.customer_token_hash_email = this.token;
        builder.card_encryption_data = this.amount;
        builder.device_metadata = this.stored_value_balance_token;
        builder.success_screen = this.customer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        String str2 = this.stored_value_balance_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "stored_value_balance_token=", arrayList);
        }
        String str3 = this.customer_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "customer_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsBalance{", "}", 0, null, null, 56);
    }
}
