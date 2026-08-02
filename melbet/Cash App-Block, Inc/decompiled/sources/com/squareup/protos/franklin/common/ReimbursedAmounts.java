package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.timecards.LaborCostTotal;
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

/* loaded from: classes8.dex */
public final class ReimbursedAmounts extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ReimbursedAmounts> CREATOR;
    public final Money atm_operator_fee_reimbursed_amount;
    public final Money cash_app_fee_reimbursed_amount;
    public final Money international_transaction_fee_reimbursed_amount;

    static {
        ReimbursedAmounts$Companion$ADAPTER$1 reimbursedAmounts$Companion$ADAPTER$1 = new ReimbursedAmounts$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ReimbursedAmounts.class), "type.googleapis.com/squareup.franklin.ReimbursedAmounts", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = reimbursedAmounts$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(reimbursedAmounts$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReimbursedAmounts(Money money, Money money2, Money money3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.cash_app_fee_reimbursed_amount = money;
        this.atm_operator_fee_reimbursed_amount = money2;
        this.international_transaction_fee_reimbursed_amount = money3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReimbursedAmounts)) {
            return false;
        }
        ReimbursedAmounts reimbursedAmounts = (ReimbursedAmounts) obj;
        return Intrinsics.areEqual(unknownFields(), reimbursedAmounts.unknownFields()) && Intrinsics.areEqual(this.cash_app_fee_reimbursed_amount, reimbursedAmounts.cash_app_fee_reimbursed_amount) && Intrinsics.areEqual(this.atm_operator_fee_reimbursed_amount, reimbursedAmounts.atm_operator_fee_reimbursed_amount) && Intrinsics.areEqual(this.international_transaction_fee_reimbursed_amount, reimbursedAmounts.international_transaction_fee_reimbursed_amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.cash_app_fee_reimbursed_amount;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.atm_operator_fee_reimbursed_amount;
        int hashCode3 = (hashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.international_transaction_fee_reimbursed_amount;
        int hashCode4 = hashCode3 + (money3 != null ? money3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LaborCostTotal.Builder builder = new LaborCostTotal.Builder(4);
        builder.regular_labor_money = this.cash_app_fee_reimbursed_amount;
        builder.overtime_labor_money = this.atm_operator_fee_reimbursed_amount;
        builder.doubletime_labor_money = this.international_transaction_fee_reimbursed_amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.cash_app_fee_reimbursed_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("cash_app_fee_reimbursed_amount=", money, arrayList);
        }
        Money money2 = this.atm_operator_fee_reimbursed_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("atm_operator_fee_reimbursed_amount=", money2, arrayList);
        }
        Money money3 = this.international_transaction_fee_reimbursed_amount;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("international_transaction_fee_reimbursed_amount=", money3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReimbursedAmounts{", "}", 0, null, null, 56);
    }
}
