package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Transfer;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes8.dex */
public final class LendingCardRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LendingCardRenderData> CREATOR;
    public final List loan_tokens;
    public final List loans;

    public final class Loan extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Loan> CREATOR;
        public final Money down_payment_amount;
        public final Money financed_principal_amount;
        public final String loan_token;
        public final Integer number_of_payments;
        public final String order_id;
        public final Money outstanding_loan_balance_amount;
        public final Money paid_so_far_amount;
        public final Money setup_fee_amount;
        public final String start_view_payment_plan_flow_url;

        static {
            LendingCardRenderData$Loan$Companion$ADAPTER$1 lendingCardRenderData$Loan$Companion$ADAPTER$1 = new LendingCardRenderData$Loan$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Loan.class), "type.googleapis.com/squareup.franklin.LendingCardRenderData.Loan", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = lendingCardRenderData$Loan$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingCardRenderData$Loan$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loan(String str, Integer num, Money money, Money money2, Money money3, Money money4, Money money5, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.loan_token = str;
            this.number_of_payments = num;
            this.down_payment_amount = money;
            this.financed_principal_amount = money2;
            this.setup_fee_amount = money3;
            this.paid_so_far_amount = money4;
            this.outstanding_loan_balance_amount = money5;
            this.start_view_payment_plan_flow_url = str2;
            this.order_id = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Loan)) {
                return false;
            }
            Loan loan = (Loan) obj;
            return Intrinsics.areEqual(unknownFields(), loan.unknownFields()) && Intrinsics.areEqual(this.loan_token, loan.loan_token) && Intrinsics.areEqual(this.number_of_payments, loan.number_of_payments) && Intrinsics.areEqual(this.down_payment_amount, loan.down_payment_amount) && Intrinsics.areEqual(this.financed_principal_amount, loan.financed_principal_amount) && Intrinsics.areEqual(this.setup_fee_amount, loan.setup_fee_amount) && Intrinsics.areEqual(this.paid_so_far_amount, loan.paid_so_far_amount) && Intrinsics.areEqual(this.outstanding_loan_balance_amount, loan.outstanding_loan_balance_amount) && Intrinsics.areEqual(this.start_view_payment_plan_flow_url, loan.start_view_payment_plan_flow_url) && Intrinsics.areEqual(this.order_id, loan.order_id);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.loan_token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Integer num = this.number_of_payments;
            int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Money money = this.down_payment_amount;
            int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
            Money money2 = this.financed_principal_amount;
            int hashCode5 = (hashCode4 + (money2 != null ? money2.hashCode() : 0)) * 37;
            Money money3 = this.setup_fee_amount;
            int hashCode6 = (hashCode5 + (money3 != null ? money3.hashCode() : 0)) * 37;
            Money money4 = this.paid_so_far_amount;
            int hashCode7 = (hashCode6 + (money4 != null ? money4.hashCode() : 0)) * 37;
            Money money5 = this.outstanding_loan_balance_amount;
            int hashCode8 = (hashCode7 + (money5 != null ? money5.hashCode() : 0)) * 37;
            String str2 = this.start_view_payment_plan_flow_url;
            int hashCode9 = (hashCode8 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.order_id;
            int hashCode10 = hashCode9 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode10;
            return hashCode10;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Transfer.Builder builder = new Transfer.Builder(10, false);
            builder.token = this.loan_token;
            builder.source = this.number_of_payments;
            builder.amount = this.down_payment_amount;
            builder.push_amount = this.financed_principal_amount;
            builder.target = this.setup_fee_amount;
            builder.state = this.paid_so_far_amount;
            builder.created_at = this.outstanding_loan_balance_amount;
            builder.completed_at = this.start_view_payment_plan_flow_url;
            builder.failed_at = this.order_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.loan_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "loan_token=", arrayList);
            }
            Integer num = this.number_of_payments;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("number_of_payments=", num, arrayList);
            }
            Money money = this.down_payment_amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("down_payment_amount=", money, arrayList);
            }
            Money money2 = this.financed_principal_amount;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("financed_principal_amount=", money2, arrayList);
            }
            Money money3 = this.setup_fee_amount;
            if (money3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("setup_fee_amount=", money3, arrayList);
            }
            Money money4 = this.paid_so_far_amount;
            if (money4 != null) {
                Matcher$$ExternalSyntheticOutline0.m("paid_so_far_amount=", money4, arrayList);
            }
            Money money5 = this.outstanding_loan_balance_amount;
            if (money5 != null) {
                Matcher$$ExternalSyntheticOutline0.m("outstanding_loan_balance_amount=", money5, arrayList);
            }
            String str2 = this.start_view_payment_plan_flow_url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "start_view_payment_plan_flow_url=", arrayList);
            }
            String str3 = this.order_id;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "order_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Loan{", "}", 0, null, null, 56);
        }
    }

    static {
        LendingCardRenderData$Companion$ADAPTER$1 lendingCardRenderData$Companion$ADAPTER$1 = new LendingCardRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LendingCardRenderData.class), "type.googleapis.com/squareup.franklin.LendingCardRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = lendingCardRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingCardRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LendingCardRenderData(List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.loan_tokens = TransactorKt.immutableCopyOf("loan_tokens", list);
        this.loans = TransactorKt.immutableCopyOf("loans", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LendingCardRenderData)) {
            return false;
        }
        LendingCardRenderData lendingCardRenderData = (LendingCardRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), lendingCardRenderData.unknownFields()) && Intrinsics.areEqual(this.loan_tokens, lendingCardRenderData.loan_tokens) && Intrinsics.areEqual(this.loans, lendingCardRenderData.loans);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.loans.hashCode() + Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.loan_tokens);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GreenBenefitsV1.Builder builder = new GreenBenefitsV1.Builder(17, false);
        builder.card_holder_benefits = this.loan_tokens;
        builder.green_status_benefits = this.loans;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.loan_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("loan_tokens=", arrayList, list);
        }
        List list2 = this.loans;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("loans=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LendingCardRenderData{", "}", 0, null, null, 56);
    }
}
