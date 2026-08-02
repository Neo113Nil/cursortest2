package com.squareup.protos.cash.pay;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.protos.common.Money;
import com.squareup.protos.employeejobs.Job;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayDisputeRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashAppPayDisputeRenderData> CREATOR;
    public final Money clawback_money;
    public final Money credit_money;
    public final Money customer_disputed_money;
    public final String dispute_id;
    public final Money final_money;
    public final Long initiated_at;
    public final List linked_payment_ids;
    public final DisputeReason reason;
    public final Long resolution_required_by;
    public final Long resolved_at;
    public final DisputeState state;

    public enum DisputeReason implements WireEnum {
        UNKNOWN_DISPUTE_REASON(0),
        NO_KNOWLEDGE_DISPUTE_REASON(1),
        NO_KNOWLEDGE_MERCHANT_LIABLE_DISPUTE_REASON(2),
        DUPLICATE_DISPUTE_REASON(3),
        AMOUNT_DIFFERS_DISPUTE_REASON(4),
        PAID_BY_OTHER_MEANS_DISPUTE_REASON(5),
        CANCELLED_DISPUTE_REASON(6),
        NOT_AS_DESCRIBED_DISPUTE_REASON(7),
        NOT_RECEIVED_DISPUTE_REASON(8),
        CUSTOMER_REQUESTS_CREDIT_DISPUTE_REASON(9);

        public static final CashAppPayDisputeRenderData$DisputeReason$Companion$ADAPTER$1 ADAPTER;
        public static final RetailerType.Companion Companion;
        public final int value;

        static {
            DisputeReason disputeReason = UNKNOWN_DISPUTE_REASON;
            Companion = new RetailerType.Companion();
            ADAPTER = new CashAppPayDisputeRenderData$DisputeReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DisputeReason.class), Syntax.PROTO_2, disputeReason);
        }

        DisputeReason(int i) {
            this.value = i;
        }

        public static final DisputeReason fromValue(int i) {
            Companion.getClass();
            return RetailerType.Companion.m3907fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum DisputeState implements WireEnum {
        UNKNOWN_DISPUTE_STATE(0),
        PENDING_RESPONDENT_ACTION_DISPUTE_STATE(1),
        PENDING_DECISION_DISPUTE_STATE(2),
        RATIFIED_DISPUTE_STATE(3),
        REJECTED_DISPUTE_STATE(4),
        WRITE_OFF_DISPUTE_STATE(5);

        public static final CashAppPayDisputeRenderData$DisputeState$Companion$ADAPTER$1 ADAPTER;
        public static final Origin.Companion Companion;
        public final int value;

        static {
            DisputeState disputeState = UNKNOWN_DISPUTE_STATE;
            Companion = new Origin.Companion();
            ADAPTER = new CashAppPayDisputeRenderData$DisputeState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DisputeState.class), Syntax.PROTO_2, disputeState);
        }

        DisputeState(int i) {
            this.value = i;
        }

        public static final DisputeState fromValue(int i) {
            Companion.getClass();
            return Origin.Companion.m3887fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CashAppPayDisputeRenderData$Companion$ADAPTER$1 cashAppPayDisputeRenderData$Companion$ADAPTER$1 = new CashAppPayDisputeRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashAppPayDisputeRenderData.class), "type.googleapis.com/squareup.cash.pay.CashAppPayDisputeRenderData", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_dispute.proto");
        ADAPTER = cashAppPayDisputeRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayDisputeRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppPayDisputeRenderData(String str, DisputeState disputeState, Money money, Money money2, Money money3, Money money4, List list, Long l, Long l2, Long l3, DisputeReason disputeReason, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.dispute_id = str;
        this.state = disputeState;
        this.customer_disputed_money = money;
        this.credit_money = money2;
        this.final_money = money3;
        this.clawback_money = money4;
        this.initiated_at = l;
        this.resolved_at = l2;
        this.resolution_required_by = l3;
        this.reason = disputeReason;
        this.linked_payment_ids = TransactorKt.immutableCopyOf("linked_payment_ids", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashAppPayDisputeRenderData)) {
            return false;
        }
        CashAppPayDisputeRenderData cashAppPayDisputeRenderData = (CashAppPayDisputeRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), cashAppPayDisputeRenderData.unknownFields()) && Intrinsics.areEqual(this.dispute_id, cashAppPayDisputeRenderData.dispute_id) && this.state == cashAppPayDisputeRenderData.state && Intrinsics.areEqual(this.customer_disputed_money, cashAppPayDisputeRenderData.customer_disputed_money) && Intrinsics.areEqual(this.credit_money, cashAppPayDisputeRenderData.credit_money) && Intrinsics.areEqual(this.final_money, cashAppPayDisputeRenderData.final_money) && Intrinsics.areEqual(this.clawback_money, cashAppPayDisputeRenderData.clawback_money) && Intrinsics.areEqual(this.linked_payment_ids, cashAppPayDisputeRenderData.linked_payment_ids) && Intrinsics.areEqual(this.initiated_at, cashAppPayDisputeRenderData.initiated_at) && Intrinsics.areEqual(this.resolved_at, cashAppPayDisputeRenderData.resolved_at) && Intrinsics.areEqual(this.resolution_required_by, cashAppPayDisputeRenderData.resolution_required_by) && this.reason == cashAppPayDisputeRenderData.reason;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.dispute_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        DisputeState disputeState = this.state;
        int hashCode3 = (hashCode2 + (disputeState != null ? disputeState.hashCode() : 0)) * 37;
        Money money = this.customer_disputed_money;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.credit_money;
        int hashCode5 = (hashCode4 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.final_money;
        int hashCode6 = (hashCode5 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.clawback_money;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (money4 != null ? money4.hashCode() : 0)) * 37, 37, this.linked_payment_ids);
        Long l = this.initiated_at;
        int hashCode7 = (m + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.resolved_at;
        int hashCode8 = (hashCode7 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.resolution_required_by;
        int hashCode9 = (hashCode8 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        DisputeReason disputeReason = this.reason;
        int hashCode10 = hashCode9 + (disputeReason != null ? disputeReason.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Job.Builder builder = new Job.Builder(11);
        builder.token = this.dispute_id;
        builder.merchant_token = this.state;
        builder.title = this.customer_disputed_money;
        builder.default_wage = this.credit_money;
        builder.team_member_count = this.final_money;
        builder.version = this.clawback_money;
        builder.tip_eligible = this.linked_payment_ids;
        builder.created_at_timestamp_ms = this.initiated_at;
        builder.updated_at_timestamp_ms = this.resolved_at;
        builder.deleted_at_timestamp_ms = this.resolution_required_by;
        builder.default_color_scheme = this.reason;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.dispute_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "dispute_id=", arrayList);
        }
        DisputeState disputeState = this.state;
        if (disputeState != null) {
            arrayList.add("state=" + disputeState);
        }
        Money money = this.customer_disputed_money;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("customer_disputed_money=", money, arrayList);
        }
        Money money2 = this.credit_money;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("credit_money=", money2, arrayList);
        }
        Money money3 = this.final_money;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("final_money=", money3, arrayList);
        }
        Money money4 = this.clawback_money;
        if (money4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("clawback_money=", money4, arrayList);
        }
        List list = this.linked_payment_ids;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("linked_payment_ids=", arrayList, list);
        }
        Long l = this.initiated_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("initiated_at=", l, arrayList);
        }
        Long l2 = this.resolved_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("resolved_at=", l2, arrayList);
        }
        Long l3 = this.resolution_required_by;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("resolution_required_by=", l3, arrayList);
        }
        DisputeReason disputeReason = this.reason;
        if (disputeReason != null) {
            arrayList.add("reason=" + disputeReason);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashAppPayDisputeRenderData{", "}", 0, null, null, 56);
    }
}
