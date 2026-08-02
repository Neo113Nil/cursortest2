package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.Transfer;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CardOrderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardOrderData> CREATOR;
    public final String card_theme_token;
    public final String flow_type;
    public final Long issued_at;
    public final Long last_card_ordered_at;
    public final String name_on_card;
    public final OrderScenarioType order_scenario_type;
    public final State state;
    public final StateReason state_reason;
    public final Long state_transitioned_at;

    public enum OrderScenarioType implements WireEnum {
        FIRST_TIME_ORDER(1),
        REPLACEMENT_ORDER(2),
        LOST_DEVICE_ORDER(3),
        EXPIRED_DEVICE_ORDER(4),
        DEBIT_FLEX_UPGRADE(5);

        public final int value;
        public static final ClientDriven.Companion Companion = new ClientDriven.Companion();
        public static final CardOrderData$OrderScenarioType$Companion$ADAPTER$1 ADAPTER = new CardOrderData$OrderScenarioType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OrderScenarioType.class), Syntax.PROTO_2, null);

        OrderScenarioType(int i) {
            this.value = i;
        }

        public static final OrderScenarioType fromValue(int i) {
            Companion.getClass();
            return ClientDriven.Companion.m3977fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum State implements WireEnum {
        DRAFT(1),
        PENDING_SUBMISSION(2),
        PENDING_REVIEW(3),
        PENDING_ISSUE(4),
        ISSUED(5),
        SUSPENDED(6),
        SHIPPED(7),
        COMPLETED(8),
        CANCELED(9),
        OUT_FOR_DELIVERY(10);

        public final int value;
        public static final UiControl.Type.Companion Companion = new UiControl.Type.Companion();
        public static final CardOrderData$State$Companion$ADAPTER$1 ADAPTER = new CardOrderData$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, null);

        State(int i) {
            this.value = i;
        }

        public static final State fromValue(int i) {
            Companion.getClass();
            return UiControl.Type.Companion.m3966fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum StateReason implements WireEnum {
        ORDER_INITIATED(1),
        SPONSORSHIP_REQUESTED(2),
        ORDER_SUBMITTED(3),
        REVIEW_DECLINED(4),
        REVIEW_APPROVED(5),
        SPONSORSHIP_CANCELED(6),
        ORDER_REJECTED(7),
        MANUAL_INTERVENTION_RESOLVED(8),
        MAILING_ADDRESS_AMENDED(9),
        CARD_UNDELIVERABLE(10),
        MANUAL_INTERVENTION(11),
        SUSPENDED_TOO_LONG_TIME(12),
        CARD_ISSUED(13),
        CARD_SHIPPED(14),
        CARD_DELIVERED(15),
        ORDER_UNLINKED(16),
        RISK_REVIEW_DECLINED(17),
        VIRTUAL_CARD_ACTIVATION_FAILED(18),
        OTHER_FAILURE(19),
        CARD_REISSUED(20),
        CARD_OUT_FOR_DELIVERY(21),
        IDV_REVIEW_PENDING(22),
        IDV_REVIEW_FAILED(23),
        OUT_OF_STOCK(24),
        PENDING_ORDER_SUBMISSION(25),
        INCONSISTENT_SPONSOR_CARD_PRODUCT(26),
        INCONSISTENT_CARD_PRODUCT(27);

        public final int value;
        public static final LinkResult.Companion Companion = new LinkResult.Companion();
        public static final CardOrderData$StateReason$Companion$ADAPTER$1 ADAPTER = new CardOrderData$StateReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(StateReason.class), Syntax.PROTO_2, null);

        StateReason(int i) {
            this.value = i;
        }

        public static final StateReason fromValue(int i) {
            Companion.getClass();
            return LinkResult.Companion.m3961fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CardOrderData$Companion$ADAPTER$1 cardOrderData$Companion$ADAPTER$1 = new CardOrderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardOrderData.class), "type.googleapis.com/squareup.franklin.ui.CardOrderData", Syntax.PROTO_2, null, "squareup/franklin/ui/issued_card.proto");
        ADAPTER = cardOrderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardOrderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardOrderData(State state, StateReason stateReason, Long l, Long l2, String str, Long l3, String str2, String str3, OrderScenarioType orderScenarioType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.state = state;
        this.state_reason = stateReason;
        this.state_transitioned_at = l;
        this.issued_at = l2;
        this.flow_type = str;
        this.last_card_ordered_at = l3;
        this.name_on_card = str2;
        this.card_theme_token = str3;
        this.order_scenario_type = orderScenarioType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardOrderData)) {
            return false;
        }
        CardOrderData cardOrderData = (CardOrderData) obj;
        return Intrinsics.areEqual(unknownFields(), cardOrderData.unknownFields()) && this.state == cardOrderData.state && this.state_reason == cardOrderData.state_reason && Intrinsics.areEqual(this.state_transitioned_at, cardOrderData.state_transitioned_at) && Intrinsics.areEqual(this.issued_at, cardOrderData.issued_at) && Intrinsics.areEqual(this.flow_type, cardOrderData.flow_type) && Intrinsics.areEqual(this.last_card_ordered_at, cardOrderData.last_card_ordered_at) && Intrinsics.areEqual(this.name_on_card, cardOrderData.name_on_card) && Intrinsics.areEqual(this.card_theme_token, cardOrderData.card_theme_token) && this.order_scenario_type == cardOrderData.order_scenario_type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        State state = this.state;
        int hashCode2 = (hashCode + (state != null ? state.hashCode() : 0)) * 37;
        StateReason stateReason = this.state_reason;
        int hashCode3 = (hashCode2 + (stateReason != null ? stateReason.hashCode() : 0)) * 37;
        Long l = this.state_transitioned_at;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.issued_at;
        int hashCode5 = (hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        String str = this.flow_type;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 37;
        Long l3 = this.last_card_ordered_at;
        int hashCode7 = (hashCode6 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        String str2 = this.name_on_card;
        int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.card_theme_token;
        int hashCode9 = (hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 37;
        OrderScenarioType orderScenarioType = this.order_scenario_type;
        int hashCode10 = hashCode9 + (orderScenarioType != null ? orderScenarioType.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Transfer.Builder builder = new Transfer.Builder(13, false);
        builder.source = this.state;
        builder.target = this.state_reason;
        builder.created_at = this.state_transitioned_at;
        builder.completed_at = this.issued_at;
        builder.token = this.flow_type;
        builder.failed_at = this.last_card_ordered_at;
        builder.state = this.name_on_card;
        builder.amount = this.card_theme_token;
        builder.push_amount = this.order_scenario_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        State state = this.state;
        if (state != null) {
            arrayList.add("state=" + state);
        }
        StateReason stateReason = this.state_reason;
        if (stateReason != null) {
            arrayList.add("state_reason=" + stateReason);
        }
        Long l = this.state_transitioned_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("state_transitioned_at=", l, arrayList);
        }
        Long l2 = this.issued_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("issued_at=", l2, arrayList);
        }
        String str = this.flow_type;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "flow_type=", arrayList);
        }
        Long l3 = this.last_card_ordered_at;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("last_card_ordered_at=", l3, arrayList);
        }
        if (this.name_on_card != null) {
            arrayList.add("name_on_card=██");
        }
        String str2 = this.card_theme_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "card_theme_token=", arrayList);
        }
        OrderScenarioType orderScenarioType = this.order_scenario_type;
        if (orderScenarioType != null) {
            arrayList.add("order_scenario_type=" + orderScenarioType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardOrderData{", "}", 0, null, null, 56);
    }
}
