package com.squareup.protos.cash.grantly.api;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.lending.Loan;
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
public final class TilaData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TilaData> CREATOR;
    public final Money amount_due_on_due_date;
    public final Money amount_financed;
    public final Long apr_bps;
    public final LoanParty borrower;
    public final Long date_borrowed;
    public final Long final_due_date;
    public final Money finance_charge;
    public final Long flat_fee_as_daily_fee_bps;
    public final Money late_fee_amount;
    public final Integer late_fee_grace_period_days;
    public final LoanParty lender;
    public final Integer loan_duration_days;
    public final Long setup_fee_BPS;
    public final Money total_of_payments;

    static {
        TilaData$Companion$ADAPTER$1 tilaData$Companion$ADAPTER$1 = new TilaData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TilaData.class), "type.googleapis.com/squareup.cash.grantly.api.TilaData", Syntax.PROTO_2, null, "squareup/cash/grantly/api/preauthorize_payment_response.proto");
        ADAPTER = tilaData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(tilaData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TilaData(Long l, Money money, Money money2, Money money3, Long l2, Integer num, Long l3, Long l4, Money money4, Integer num2, Money money5, Long l5, LoanParty loanParty, LoanParty loanParty2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.date_borrowed = l;
        this.amount_financed = money;
        this.finance_charge = money2;
        this.total_of_payments = money3;
        this.apr_bps = l2;
        this.loan_duration_days = num;
        this.flat_fee_as_daily_fee_bps = l3;
        this.final_due_date = l4;
        this.amount_due_on_due_date = money4;
        this.late_fee_grace_period_days = num2;
        this.late_fee_amount = money5;
        this.setup_fee_BPS = l5;
        this.lender = loanParty;
        this.borrower = loanParty2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TilaData)) {
            return false;
        }
        TilaData tilaData = (TilaData) obj;
        return Intrinsics.areEqual(unknownFields(), tilaData.unknownFields()) && Intrinsics.areEqual(this.date_borrowed, tilaData.date_borrowed) && Intrinsics.areEqual(this.amount_financed, tilaData.amount_financed) && Intrinsics.areEqual(this.finance_charge, tilaData.finance_charge) && Intrinsics.areEqual(this.total_of_payments, tilaData.total_of_payments) && Intrinsics.areEqual(this.apr_bps, tilaData.apr_bps) && Intrinsics.areEqual(this.loan_duration_days, tilaData.loan_duration_days) && Intrinsics.areEqual(this.flat_fee_as_daily_fee_bps, tilaData.flat_fee_as_daily_fee_bps) && Intrinsics.areEqual(this.final_due_date, tilaData.final_due_date) && Intrinsics.areEqual(this.amount_due_on_due_date, tilaData.amount_due_on_due_date) && Intrinsics.areEqual(this.late_fee_grace_period_days, tilaData.late_fee_grace_period_days) && Intrinsics.areEqual(this.late_fee_amount, tilaData.late_fee_amount) && Intrinsics.areEqual(this.setup_fee_BPS, tilaData.setup_fee_BPS) && Intrinsics.areEqual(this.lender, tilaData.lender) && Intrinsics.areEqual(this.borrower, tilaData.borrower);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.date_borrowed;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Money money = this.amount_financed;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.finance_charge;
        int hashCode4 = (hashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.total_of_payments;
        int hashCode5 = (hashCode4 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Long l2 = this.apr_bps;
        int hashCode6 = (hashCode5 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Integer num = this.loan_duration_days;
        int hashCode7 = (hashCode6 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Long l3 = this.flat_fee_as_daily_fee_bps;
        int hashCode8 = (hashCode7 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Long l4 = this.final_due_date;
        int hashCode9 = (hashCode8 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
        Money money4 = this.amount_due_on_due_date;
        int hashCode10 = (hashCode9 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Integer num2 = this.late_fee_grace_period_days;
        int hashCode11 = (hashCode10 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Money money5 = this.late_fee_amount;
        int hashCode12 = (hashCode11 + (money5 != null ? money5.hashCode() : 0)) * 37;
        Long l5 = this.setup_fee_BPS;
        int hashCode13 = (hashCode12 + (l5 != null ? Long.hashCode(l5.longValue()) : 0)) * 37;
        LoanParty loanParty = this.lender;
        int hashCode14 = (hashCode13 + (loanParty != null ? loanParty.hashCode() : 0)) * 37;
        LoanParty loanParty2 = this.borrower;
        int hashCode15 = hashCode14 + (loanParty2 != null ? loanParty2.hashCode() : 0);
        this.hashCode = hashCode15;
        return hashCode15;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Loan.Builder builder = new Loan.Builder(6);
        builder.borrowed_at = this.date_borrowed;
        builder.principal_amount = this.amount_financed;
        builder.setup_fee_amount = this.finance_charge;
        builder.outstanding_amount = this.total_of_payments;
        builder.due_at = this.apr_bps;
        builder.setup_fee_bps = this.loan_duration_days;
        builder.token = this.flat_fee_as_daily_fee_bps;
        builder.credit_line_token = this.final_due_date;
        builder.late_fee_amount = this.amount_due_on_due_date;
        builder.detail_rows = this.late_fee_grace_period_days;
        builder.interest_amount = this.late_fee_amount;
        builder.state = this.setup_fee_BPS;
        builder.lending_product = this.lender;
        builder.bnpl_data = this.borrower;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.date_borrowed;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("date_borrowed=", l, arrayList);
        }
        Money money = this.amount_financed;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount_financed=", money, arrayList);
        }
        Money money2 = this.finance_charge;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("finance_charge=", money2, arrayList);
        }
        Money money3 = this.total_of_payments;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("total_of_payments=", money3, arrayList);
        }
        Long l2 = this.apr_bps;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("apr_bps=", l2, arrayList);
        }
        Integer num = this.loan_duration_days;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("loan_duration_days=", num, arrayList);
        }
        Long l3 = this.flat_fee_as_daily_fee_bps;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("flat_fee_as_daily_fee_bps=", l3, arrayList);
        }
        Long l4 = this.final_due_date;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("final_due_date=", l4, arrayList);
        }
        Money money4 = this.amount_due_on_due_date;
        if (money4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount_due_on_due_date=", money4, arrayList);
        }
        Integer num2 = this.late_fee_grace_period_days;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("late_fee_grace_period_days=", num2, arrayList);
        }
        Money money5 = this.late_fee_amount;
        if (money5 != null) {
            Matcher$$ExternalSyntheticOutline0.m("late_fee_amount=", money5, arrayList);
        }
        Long l5 = this.setup_fee_BPS;
        if (l5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("setup_fee_BPS=", l5, arrayList);
        }
        LoanParty loanParty = this.lender;
        if (loanParty != null) {
            arrayList.add("lender=" + loanParty);
        }
        LoanParty loanParty2 = this.borrower;
        if (loanParty2 != null) {
            arrayList.add("borrower=" + loanParty2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TilaData{", "}", 0, null, null, 56);
    }
}
