package com.squareup.protos.cash.pay;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.ExpenseSlice;
import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.common.Money;
import com.squareup.protos.document.DocumentEntity;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.investing.GetCustomerInvestmentSettingsResponse;
import com.squareup.protos.franklin.investing.resources.CustomOrderConfiguration;
import com.squareup.protos.franklin.investing.resources.LearnMoreConfiguration;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashAppPayRenderData> CREATOR;
    public final String authorization_channel;
    public final Money customer_auth_money;
    public final Money customer_capture_money;
    public final Money customer_deposit_money;
    public final Money customer_discount_money;
    public final Money customer_discount_reclaimed_money;
    public final Money customer_dispute_clawback_money;
    public final Money customer_dispute_credit_money;
    public final Money customer_dispute_final_money;
    public final Money customer_fixed_discount_money;
    public final Money customer_total_refund_money;
    public final Long customer_variable_discount_bps;
    public final Money customer_variable_discount_money;
    public final Money customer_void_money;
    public final List dispute_tokens;
    public final List disputes;
    public final EntityType entity_type;
    public final List failure_reasons;
    public final Boolean has_pending_refund_capture;
    public final List linked_refund_tokens;
    public final List linked_refunds;
    public final Money loan_borrowed_money;
    public final Money loan_down_payment_money;
    public final Money loan_fee_money;
    public final Money loan_remaining_money;
    public final String loan_token;
    public final Integer loan_total_payment_count;
    public final String order_id;
    public final String payment_plan_flow_url;
    public final List recurring_series_ids;
    public final String state;
    public final String tila_document_token;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String authorization_channel;
        public Money customer_auth_money;
        public Money customer_capture_money;
        public Serializable customer_deposit_money;
        public Money customer_discount_money;
        public AndroidMessage customer_discount_reclaimed_money;
        public Serializable customer_dispute_clawback_money;
        public AndroidMessage customer_dispute_credit_money;
        public Serializable customer_dispute_final_money;
        public Money customer_fixed_discount_money;
        public Serializable customer_total_refund_money;
        public Long customer_variable_discount_bps;
        public Serializable customer_variable_discount_money;
        public Serializable customer_void_money;
        public Object dispute_tokens;
        public Object disputes;
        public Object entity_type;
        public List failure_reasons;
        public Boolean has_pending_refund_capture;
        public Object linked_refund_tokens;
        public Object linked_refunds;
        public Serializable loan_borrowed_money;
        public Serializable loan_down_payment_money;
        public Serializable loan_fee_money;
        public Serializable loan_remaining_money;
        public String loan_token;
        public Object loan_total_payment_count;
        public String order_id;
        public String payment_plan_flow_url;
        public Object recurring_series_ids;
        public String state;
        public String tila_document_token;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new CashAppPayRenderData(this.authorization_channel, this.state, this.failure_reasons, this.customer_auth_money, this.customer_capture_money, this.customer_discount_money, this.customer_fixed_discount_money, (Money) this.customer_variable_discount_money, this.customer_variable_discount_bps, (Money) this.customer_discount_reclaimed_money, (Money) this.customer_void_money, (List) this.recurring_series_ids, (Money) this.customer_total_refund_money, (List) this.linked_refund_tokens, (List) this.linked_refunds, this.has_pending_refund_capture, this.order_id, (List) this.dispute_tokens, (Money) this.customer_dispute_credit_money, (Money) this.customer_dispute_final_money, (Money) this.customer_dispute_clawback_money, (List) this.disputes, this.loan_token, (Money) this.loan_fee_money, (Money) this.loan_borrowed_money, (Money) this.loan_down_payment_money, (Money) this.loan_remaining_money, (Integer) this.loan_total_payment_count, this.tila_document_token, this.payment_plan_flow_url, (Money) this.customer_deposit_money, (EntityType) this.entity_type, buildUnknownFields());
                default:
                    return new GetCustomerInvestmentSettingsResponse(this.customer_auth_money, this.customer_capture_money, this.authorization_channel, this.state, this.order_id, this.loan_token, this.tila_document_token, (ResponseContext) this.recurring_series_ids, this.payment_plan_flow_url, (LearnMoreConfiguration) this.linked_refund_tokens, (String) this.linked_refunds, (String) this.dispute_tokens, this.failure_reasons, this.customer_variable_discount_bps, (Long) this.disputes, (Long) this.customer_variable_discount_money, (LearnMoreConfiguration) this.customer_discount_reclaimed_money, this.has_pending_refund_capture, (Boolean) this.customer_void_money, this.customer_discount_money, this.customer_fixed_discount_money, (String) this.customer_total_refund_money, (CustomOrderConfiguration) this.customer_dispute_credit_money, (String) this.customer_dispute_final_money, (String) this.customer_dispute_clawback_money, (String) this.loan_fee_money, (String) this.loan_borrowed_money, (Boolean) this.loan_down_payment_money, (String) this.loan_remaining_money, (String) this.customer_deposit_money, (String) this.loan_total_payment_count, (String) this.entity_type, buildUnknownFields());
            }
        }
    }

    public final class Dispute extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Dispute> CREATOR;
        public final Money customer_dispute_clawback_money;
        public final Money customer_dispute_credit_money;
        public final Money customer_dispute_final_money;
        public final Money customer_disputed_money;
        public final State state;
        public final String token;

        public enum State implements WireEnum {
            UNKNOWN_STATE(0),
            PENDING_RESPONDENT_ACTION(1),
            PENDING_DECISION(2),
            RATIFIED(3),
            REJECTED(4),
            WRITE_OFF(5);

            public static final CashAppPayRenderData$Dispute$State$Companion$ADAPTER$1 ADAPTER;
            public static final Origin.Companion Companion;
            public final int value;

            static {
                State state = UNKNOWN_STATE;
                Companion = new Origin.Companion();
                ADAPTER = new CashAppPayRenderData$Dispute$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, state);
            }

            State(int i) {
                this.value = i;
            }

            public static final State fromValue(int i) {
                Companion.getClass();
                return Origin.Companion.m3888fromValue(i);
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            CashAppPayRenderData$Dispute$Companion$ADAPTER$1 cashAppPayRenderData$Dispute$Companion$ADAPTER$1 = new CashAppPayRenderData$Dispute$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Dispute.class), "type.googleapis.com/squareup.cash.pay.CashAppPayRenderData.Dispute", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay.proto");
            ADAPTER = cashAppPayRenderData$Dispute$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayRenderData$Dispute$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dispute(String str, State state, Money money, Money money2, Money money3, Money money4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.token = str;
            this.state = state;
            this.customer_disputed_money = money;
            this.customer_dispute_credit_money = money2;
            this.customer_dispute_final_money = money3;
            this.customer_dispute_clawback_money = money4;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Dispute)) {
                return false;
            }
            Dispute dispute = (Dispute) obj;
            return Intrinsics.areEqual(unknownFields(), dispute.unknownFields()) && Intrinsics.areEqual(this.token, dispute.token) && this.state == dispute.state && Intrinsics.areEqual(this.customer_disputed_money, dispute.customer_disputed_money) && Intrinsics.areEqual(this.customer_dispute_credit_money, dispute.customer_dispute_credit_money) && Intrinsics.areEqual(this.customer_dispute_final_money, dispute.customer_dispute_final_money) && Intrinsics.areEqual(this.customer_dispute_clawback_money, dispute.customer_dispute_clawback_money);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            State state = this.state;
            int hashCode3 = (hashCode2 + (state != null ? state.hashCode() : 0)) * 37;
            Money money = this.customer_disputed_money;
            int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
            Money money2 = this.customer_dispute_credit_money;
            int hashCode5 = (hashCode4 + (money2 != null ? money2.hashCode() : 0)) * 37;
            Money money3 = this.customer_dispute_final_money;
            int hashCode6 = (hashCode5 + (money3 != null ? money3.hashCode() : 0)) * 37;
            Money money4 = this.customer_dispute_clawback_money;
            int hashCode7 = hashCode6 + (money4 != null ? money4.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ExpenseSlice.Builder builder = new ExpenseSlice.Builder(23);
            builder.slice_token = this.token;
            builder.requester = this.state;
            builder.amount = this.customer_disputed_money;
            builder.responder = this.customer_dispute_credit_money;
            builder.status = this.customer_dispute_final_money;
            builder.action = this.customer_dispute_clawback_money;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
            }
            State state = this.state;
            if (state != null) {
                arrayList.add("state=" + state);
            }
            Money money = this.customer_disputed_money;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("customer_disputed_money=", money, arrayList);
            }
            Money money2 = this.customer_dispute_credit_money;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("customer_dispute_credit_money=", money2, arrayList);
            }
            Money money3 = this.customer_dispute_final_money;
            if (money3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("customer_dispute_final_money=", money3, arrayList);
            }
            Money money4 = this.customer_dispute_clawback_money;
            if (money4 != null) {
                Matcher$$ExternalSyntheticOutline0.m("customer_dispute_clawback_money=", money4, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Dispute{", "}", 0, null, null, 56);
        }
    }

    public enum EntityType implements WireEnum {
        UNKNOWN(0),
        PAYMENT(1),
        DEPOSIT(2);

        public static final CashAppPayRenderData$EntityType$Companion$ADAPTER$1 ADAPTER;
        public static final SliceStatus.Companion Companion;
        public final int value;

        static {
            EntityType entityType = UNKNOWN;
            Companion = new SliceStatus.Companion();
            ADAPTER = new CashAppPayRenderData$EntityType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(EntityType.class), Syntax.PROTO_2, entityType);
        }

        EntityType(int i) {
            this.value = i;
        }

        public static final EntityType fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return PAYMENT;
            }
            if (i != 2) {
                return null;
            }
            return DEPOSIT;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class Refund extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Refund> CREATOR;
        public final Long authorized_at;
        public final Long captured_at;
        public final Money customer_auth_money;
        public final Money customer_capture_money;
        public final String display_instrument;
        public final String state;
        public final String token;
        public final Long voided_at;

        static {
            CashAppPayRenderData$Refund$Companion$ADAPTER$1 cashAppPayRenderData$Refund$Companion$ADAPTER$1 = new CashAppPayRenderData$Refund$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Refund.class), "type.googleapis.com/squareup.cash.pay.CashAppPayRenderData.Refund", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay.proto");
            ADAPTER = cashAppPayRenderData$Refund$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayRenderData$Refund$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Refund(String str, String str2, Money money, Money money2, Long l, Long l2, Long l3, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.token = str;
            this.state = str2;
            this.customer_auth_money = money;
            this.customer_capture_money = money2;
            this.authorized_at = l;
            this.voided_at = l2;
            this.captured_at = l3;
            this.display_instrument = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Refund)) {
                return false;
            }
            Refund refund = (Refund) obj;
            return Intrinsics.areEqual(unknownFields(), refund.unknownFields()) && Intrinsics.areEqual(this.token, refund.token) && Intrinsics.areEqual(this.state, refund.state) && Intrinsics.areEqual(this.customer_auth_money, refund.customer_auth_money) && Intrinsics.areEqual(this.customer_capture_money, refund.customer_capture_money) && Intrinsics.areEqual(this.authorized_at, refund.authorized_at) && Intrinsics.areEqual(this.voided_at, refund.voided_at) && Intrinsics.areEqual(this.captured_at, refund.captured_at) && Intrinsics.areEqual(this.display_instrument, refund.display_instrument);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.state;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Money money = this.customer_auth_money;
            int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
            Money money2 = this.customer_capture_money;
            int hashCode5 = (hashCode4 + (money2 != null ? money2.hashCode() : 0)) * 37;
            Long l = this.authorized_at;
            int hashCode6 = (hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            Long l2 = this.voided_at;
            int hashCode7 = (hashCode6 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
            Long l3 = this.captured_at;
            int hashCode8 = (hashCode7 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
            String str3 = this.display_instrument;
            int hashCode9 = hashCode8 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            DocumentEntity.Builder builder = new DocumentEntity.Builder(10, false);
            builder.category = this.token;
            builder.token = this.state;
            builder.client_route = this.customer_auth_money;
            builder.url = this.customer_capture_money;
            builder.owner_token = this.authorized_at;
            builder.version_data = this.voided_at;
            builder.localizable_title = this.captured_at;
            builder.title = this.display_instrument;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
            }
            String str2 = this.state;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "state=", arrayList);
            }
            Money money = this.customer_auth_money;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("customer_auth_money=", money, arrayList);
            }
            Money money2 = this.customer_capture_money;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("customer_capture_money=", money2, arrayList);
            }
            Long l = this.authorized_at;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("authorized_at=", l, arrayList);
            }
            Long l2 = this.voided_at;
            if (l2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("voided_at=", l2, arrayList);
            }
            Long l3 = this.captured_at;
            if (l3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("captured_at=", l3, arrayList);
            }
            String str3 = this.display_instrument;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "display_instrument=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Refund{", "}", 0, null, null, 56);
        }
    }

    static {
        CashAppPayRenderData$Companion$ADAPTER$1 cashAppPayRenderData$Companion$ADAPTER$1 = new CashAppPayRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashAppPayRenderData.class), "type.googleapis.com/squareup.cash.pay.CashAppPayRenderData", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay.proto");
        ADAPTER = cashAppPayRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppPayRenderData(String str, String str2, List list, Money money, Money money2, Money money3, Money money4, Money money5, Long l, Money money6, Money money7, List list2, Money money8, List list3, List list4, Boolean bool, String str3, List list5, Money money9, Money money10, Money money11, List list6, String str4, Money money12, Money money13, Money money14, Money money15, Integer num, String str5, String str6, Money money16, EntityType entityType, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        byteString.getClass();
        this.authorization_channel = str;
        this.state = str2;
        this.customer_auth_money = money;
        this.customer_capture_money = money2;
        this.customer_discount_money = money3;
        this.customer_fixed_discount_money = money4;
        this.customer_variable_discount_money = money5;
        this.customer_variable_discount_bps = l;
        this.customer_discount_reclaimed_money = money6;
        this.customer_void_money = money7;
        this.customer_total_refund_money = money8;
        this.has_pending_refund_capture = bool;
        this.order_id = str3;
        this.customer_dispute_credit_money = money9;
        this.customer_dispute_final_money = money10;
        this.customer_dispute_clawback_money = money11;
        this.loan_token = str4;
        this.loan_fee_money = money12;
        this.loan_borrowed_money = money13;
        this.loan_down_payment_money = money14;
        this.loan_remaining_money = money15;
        this.loan_total_payment_count = num;
        this.tila_document_token = str5;
        this.payment_plan_flow_url = str6;
        this.customer_deposit_money = money16;
        this.entity_type = entityType;
        this.failure_reasons = TransactorKt.immutableCopyOf("failure_reasons", list);
        this.recurring_series_ids = TransactorKt.immutableCopyOf("recurring_series_ids", list2);
        this.linked_refund_tokens = TransactorKt.immutableCopyOf("linked_refund_tokens", list3);
        this.linked_refunds = TransactorKt.immutableCopyOf("linked_refunds", list4);
        this.dispute_tokens = TransactorKt.immutableCopyOf("dispute_tokens", list5);
        this.disputes = TransactorKt.immutableCopyOf("disputes", list6);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashAppPayRenderData)) {
            return false;
        }
        CashAppPayRenderData cashAppPayRenderData = (CashAppPayRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), cashAppPayRenderData.unknownFields()) && Intrinsics.areEqual(this.authorization_channel, cashAppPayRenderData.authorization_channel) && Intrinsics.areEqual(this.state, cashAppPayRenderData.state) && Intrinsics.areEqual(this.failure_reasons, cashAppPayRenderData.failure_reasons) && Intrinsics.areEqual(this.customer_auth_money, cashAppPayRenderData.customer_auth_money) && Intrinsics.areEqual(this.customer_capture_money, cashAppPayRenderData.customer_capture_money) && Intrinsics.areEqual(this.customer_discount_money, cashAppPayRenderData.customer_discount_money) && Intrinsics.areEqual(this.customer_fixed_discount_money, cashAppPayRenderData.customer_fixed_discount_money) && Intrinsics.areEqual(this.customer_variable_discount_money, cashAppPayRenderData.customer_variable_discount_money) && Intrinsics.areEqual(this.customer_variable_discount_bps, cashAppPayRenderData.customer_variable_discount_bps) && Intrinsics.areEqual(this.customer_discount_reclaimed_money, cashAppPayRenderData.customer_discount_reclaimed_money) && Intrinsics.areEqual(this.customer_void_money, cashAppPayRenderData.customer_void_money) && Intrinsics.areEqual(this.recurring_series_ids, cashAppPayRenderData.recurring_series_ids) && Intrinsics.areEqual(this.customer_total_refund_money, cashAppPayRenderData.customer_total_refund_money) && Intrinsics.areEqual(this.linked_refund_tokens, cashAppPayRenderData.linked_refund_tokens) && Intrinsics.areEqual(this.linked_refunds, cashAppPayRenderData.linked_refunds) && Intrinsics.areEqual(this.has_pending_refund_capture, cashAppPayRenderData.has_pending_refund_capture) && Intrinsics.areEqual(this.order_id, cashAppPayRenderData.order_id) && Intrinsics.areEqual(this.dispute_tokens, cashAppPayRenderData.dispute_tokens) && Intrinsics.areEqual(this.customer_dispute_credit_money, cashAppPayRenderData.customer_dispute_credit_money) && Intrinsics.areEqual(this.customer_dispute_final_money, cashAppPayRenderData.customer_dispute_final_money) && Intrinsics.areEqual(this.customer_dispute_clawback_money, cashAppPayRenderData.customer_dispute_clawback_money) && Intrinsics.areEqual(this.disputes, cashAppPayRenderData.disputes) && Intrinsics.areEqual(this.loan_token, cashAppPayRenderData.loan_token) && Intrinsics.areEqual(this.loan_fee_money, cashAppPayRenderData.loan_fee_money) && Intrinsics.areEqual(this.loan_borrowed_money, cashAppPayRenderData.loan_borrowed_money) && Intrinsics.areEqual(this.loan_down_payment_money, cashAppPayRenderData.loan_down_payment_money) && Intrinsics.areEqual(this.loan_remaining_money, cashAppPayRenderData.loan_remaining_money) && Intrinsics.areEqual(this.loan_total_payment_count, cashAppPayRenderData.loan_total_payment_count) && Intrinsics.areEqual(this.tila_document_token, cashAppPayRenderData.tila_document_token) && Intrinsics.areEqual(this.payment_plan_flow_url, cashAppPayRenderData.payment_plan_flow_url) && Intrinsics.areEqual(this.customer_deposit_money, cashAppPayRenderData.customer_deposit_money) && this.entity_type == cashAppPayRenderData.entity_type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.authorization_channel;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.state;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.failure_reasons);
        Money money = this.customer_auth_money;
        int hashCode3 = (m + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.customer_capture_money;
        int hashCode4 = (hashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.customer_discount_money;
        int hashCode5 = (hashCode4 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.customer_fixed_discount_money;
        int hashCode6 = (hashCode5 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Money money5 = this.customer_variable_discount_money;
        int hashCode7 = (hashCode6 + (money5 != null ? money5.hashCode() : 0)) * 37;
        Long l = this.customer_variable_discount_bps;
        int hashCode8 = (hashCode7 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Money money6 = this.customer_discount_reclaimed_money;
        int hashCode9 = (hashCode8 + (money6 != null ? money6.hashCode() : 0)) * 37;
        Money money7 = this.customer_void_money;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode9 + (money7 != null ? money7.hashCode() : 0)) * 37, 37, this.recurring_series_ids);
        Money money8 = this.customer_total_refund_money;
        int m3 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((m2 + (money8 != null ? money8.hashCode() : 0)) * 37, 37, this.linked_refund_tokens), 37, this.linked_refunds);
        Boolean bool = this.has_pending_refund_capture;
        int hashCode10 = (m3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str3 = this.order_id;
        int m4 = Recorder$$ExternalSyntheticOutline2.m((hashCode10 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.dispute_tokens);
        Money money9 = this.customer_dispute_credit_money;
        int hashCode11 = (m4 + (money9 != null ? money9.hashCode() : 0)) * 37;
        Money money10 = this.customer_dispute_final_money;
        int hashCode12 = (hashCode11 + (money10 != null ? money10.hashCode() : 0)) * 37;
        Money money11 = this.customer_dispute_clawback_money;
        int m5 = Recorder$$ExternalSyntheticOutline2.m((hashCode12 + (money11 != null ? money11.hashCode() : 0)) * 37, 37, this.disputes);
        String str4 = this.loan_token;
        int hashCode13 = (m5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Money money12 = this.loan_fee_money;
        int hashCode14 = (hashCode13 + (money12 != null ? money12.hashCode() : 0)) * 37;
        Money money13 = this.loan_borrowed_money;
        int hashCode15 = (hashCode14 + (money13 != null ? money13.hashCode() : 0)) * 37;
        Money money14 = this.loan_down_payment_money;
        int hashCode16 = (hashCode15 + (money14 != null ? money14.hashCode() : 0)) * 37;
        Money money15 = this.loan_remaining_money;
        int hashCode17 = (hashCode16 + (money15 != null ? money15.hashCode() : 0)) * 37;
        Integer num = this.loan_total_payment_count;
        int hashCode18 = (hashCode17 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        String str5 = this.tila_document_token;
        int hashCode19 = (hashCode18 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.payment_plan_flow_url;
        int hashCode20 = (hashCode19 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Money money16 = this.customer_deposit_money;
        int hashCode21 = (hashCode20 + (money16 != null ? money16.hashCode() : 0)) * 37;
        EntityType entityType = this.entity_type;
        int hashCode22 = hashCode21 + (entityType != null ? entityType.hashCode() : 0);
        this.hashCode = hashCode22;
        return hashCode22;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.authorization_channel = this.authorization_channel;
        builder.state = this.state;
        builder.failure_reasons = this.failure_reasons;
        builder.customer_auth_money = this.customer_auth_money;
        builder.customer_capture_money = this.customer_capture_money;
        builder.customer_discount_money = this.customer_discount_money;
        builder.customer_fixed_discount_money = this.customer_fixed_discount_money;
        builder.customer_variable_discount_money = this.customer_variable_discount_money;
        builder.customer_variable_discount_bps = this.customer_variable_discount_bps;
        builder.customer_discount_reclaimed_money = this.customer_discount_reclaimed_money;
        builder.customer_void_money = this.customer_void_money;
        builder.recurring_series_ids = this.recurring_series_ids;
        builder.customer_total_refund_money = this.customer_total_refund_money;
        builder.linked_refund_tokens = this.linked_refund_tokens;
        builder.linked_refunds = this.linked_refunds;
        builder.has_pending_refund_capture = this.has_pending_refund_capture;
        builder.order_id = this.order_id;
        builder.dispute_tokens = this.dispute_tokens;
        builder.customer_dispute_credit_money = this.customer_dispute_credit_money;
        builder.customer_dispute_final_money = this.customer_dispute_final_money;
        builder.customer_dispute_clawback_money = this.customer_dispute_clawback_money;
        builder.disputes = this.disputes;
        builder.loan_token = this.loan_token;
        builder.loan_fee_money = this.loan_fee_money;
        builder.loan_borrowed_money = this.loan_borrowed_money;
        builder.loan_down_payment_money = this.loan_down_payment_money;
        builder.loan_remaining_money = this.loan_remaining_money;
        builder.loan_total_payment_count = this.loan_total_payment_count;
        builder.tila_document_token = this.tila_document_token;
        builder.payment_plan_flow_url = this.payment_plan_flow_url;
        builder.customer_deposit_money = this.customer_deposit_money;
        builder.entity_type = this.entity_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.authorization_channel;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "authorization_channel=", arrayList);
        }
        String str2 = this.state;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "state=", arrayList);
        }
        List list = this.failure_reasons;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("failure_reasons=", arrayList, list);
        }
        Money money = this.customer_auth_money;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("customer_auth_money=", money, arrayList);
        }
        Money money2 = this.customer_capture_money;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("customer_capture_money=", money2, arrayList);
        }
        Money money3 = this.customer_discount_money;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("customer_discount_money=", money3, arrayList);
        }
        Money money4 = this.customer_fixed_discount_money;
        if (money4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("customer_fixed_discount_money=", money4, arrayList);
        }
        Money money5 = this.customer_variable_discount_money;
        if (money5 != null) {
            Matcher$$ExternalSyntheticOutline0.m("customer_variable_discount_money=", money5, arrayList);
        }
        Long l = this.customer_variable_discount_bps;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("customer_variable_discount_bps=", l, arrayList);
        }
        Money money6 = this.customer_discount_reclaimed_money;
        if (money6 != null) {
            Matcher$$ExternalSyntheticOutline0.m("customer_discount_reclaimed_money=", money6, arrayList);
        }
        Money money7 = this.customer_void_money;
        if (money7 != null) {
            Matcher$$ExternalSyntheticOutline0.m("customer_void_money=", money7, arrayList);
        }
        List list2 = this.recurring_series_ids;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("recurring_series_ids=", arrayList, list2);
        }
        Money money8 = this.customer_total_refund_money;
        if (money8 != null) {
            Matcher$$ExternalSyntheticOutline0.m("customer_total_refund_money=", money8, arrayList);
        }
        List list3 = this.linked_refund_tokens;
        if (!list3.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("linked_refund_tokens=", arrayList, list3);
        }
        List list4 = this.linked_refunds;
        if (!list4.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("linked_refunds=", arrayList, list4);
        }
        Boolean bool = this.has_pending_refund_capture;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_pending_refund_capture=", bool, arrayList);
        }
        String str3 = this.order_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "order_id=", arrayList);
        }
        List list5 = this.dispute_tokens;
        if (!list5.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("dispute_tokens=", arrayList, list5);
        }
        Money money9 = this.customer_dispute_credit_money;
        if (money9 != null) {
            Matcher$$ExternalSyntheticOutline0.m("customer_dispute_credit_money=", money9, arrayList);
        }
        Money money10 = this.customer_dispute_final_money;
        if (money10 != null) {
            Matcher$$ExternalSyntheticOutline0.m("customer_dispute_final_money=", money10, arrayList);
        }
        Money money11 = this.customer_dispute_clawback_money;
        if (money11 != null) {
            Matcher$$ExternalSyntheticOutline0.m("customer_dispute_clawback_money=", money11, arrayList);
        }
        List list6 = this.disputes;
        if (!list6.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("disputes=", arrayList, list6);
        }
        String str4 = this.loan_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "loan_token=", arrayList);
        }
        Money money12 = this.loan_fee_money;
        if (money12 != null) {
            Matcher$$ExternalSyntheticOutline0.m("loan_fee_money=", money12, arrayList);
        }
        Money money13 = this.loan_borrowed_money;
        if (money13 != null) {
            Matcher$$ExternalSyntheticOutline0.m("loan_borrowed_money=", money13, arrayList);
        }
        Money money14 = this.loan_down_payment_money;
        if (money14 != null) {
            Matcher$$ExternalSyntheticOutline0.m("loan_down_payment_money=", money14, arrayList);
        }
        Money money15 = this.loan_remaining_money;
        if (money15 != null) {
            Matcher$$ExternalSyntheticOutline0.m("loan_remaining_money=", money15, arrayList);
        }
        Integer num = this.loan_total_payment_count;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("loan_total_payment_count=", num, arrayList);
        }
        String str5 = this.tila_document_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "tila_document_token=", arrayList);
        }
        String str6 = this.payment_plan_flow_url;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "payment_plan_flow_url=", arrayList);
        }
        Money money16 = this.customer_deposit_money;
        if (money16 != null) {
            Matcher$$ExternalSyntheticOutline0.m("customer_deposit_money=", money16, arrayList);
        }
        EntityType entityType = this.entity_type;
        if (entityType != null) {
            arrayList.add("entity_type=" + entityType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashAppPayRenderData{", "}", 0, null, null, 56);
    }
}
