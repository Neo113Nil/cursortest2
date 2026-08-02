package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0013\u0012\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/OrderRow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/OrderRow$Builder;", "Lcom/squareup/protos/cash/pay/CashAppPayOrderRenderData;", "order", "Lcom/squareup/protos/cash/pay/CashAppPayOrderRenderData;", "", "render_data", "Ljava/lang/String;", "Lcom/squareup/protos/cash/activity/api/v1/OrderRow$OrderRowLoanUiState;", "loan_ui_state", "Lcom/squareup/protos/cash/activity/api/v1/OrderRow$OrderRowLoanUiState;", "sender_id", "recipient_id", "Lcom/squareup/protos/franklin/ui/UiCustomer;", "sender", "Lcom/squareup/protos/franklin/ui/UiCustomer;", "recipient", "Companion", "Builder", "OrderRowLoanUiState", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OrderRow extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OrderRow> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.OrderRow$OrderRowLoanUiState#ADAPTER", schemaIndex = 2, tag = 2)
    public final OrderRowLoanUiState loan_ui_state;

    @WireField(adapter = "com.squareup.protos.cash.pay.CashAppPayOrderRenderData#ADAPTER", schemaIndex = 0, tag = 1)
    public final CashAppPayOrderRenderData order;

    @WireField(adapter = "com.squareup.protos.franklin.ui.UiCustomer#ADAPTER", schemaIndex = 6, tag = 7)
    public final UiCustomer recipient;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String recipient_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 3)
    public final String render_data;

    @WireField(adapter = "com.squareup.protos.franklin.ui.UiCustomer#ADAPTER", schemaIndex = 5, tag = 6)
    public final UiCustomer sender;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String sender_id;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\bJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/OrderRow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/OrderRow;", "<init>", "()V", "order", "Lcom/squareup/protos/cash/pay/CashAppPayOrderRenderData;", "render_data", "", "loan_ui_state", "Lcom/squareup/protos/cash/activity/api/v1/OrderRow$OrderRowLoanUiState;", "sender_id", "recipient_id", "sender", "Lcom/squareup/protos/franklin/ui/UiCustomer;", "recipient", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public OrderRowLoanUiState loan_ui_state;
        public CashAppPayOrderRenderData order;
        public UiCustomer recipient;
        public String recipient_id;
        public String render_data;
        public UiCustomer sender;
        public String sender_id;

        @Override // com.squareup.wire.Message.Builder
        public OrderRow build() {
            return new OrderRow(this.order, this.render_data, this.loan_ui_state, this.sender_id, this.recipient_id, this.sender, this.recipient, buildUnknownFields());
        }

        public final Builder loan_ui_state(OrderRowLoanUiState loan_ui_state) {
            this.loan_ui_state = loan_ui_state;
            return this;
        }

        public final Builder order(CashAppPayOrderRenderData order) {
            this.order = order;
            return this;
        }

        public final Builder recipient(UiCustomer recipient) {
            this.recipient = recipient;
            return this;
        }

        public final Builder recipient_id(String recipient_id) {
            this.recipient_id = recipient_id;
            return this;
        }

        public final Builder render_data(String render_data) {
            this.render_data = render_data;
            return this;
        }

        public final Builder sender(UiCustomer sender) {
            this.sender = sender;
            return this;
        }

        public final Builder sender_id(String sender_id) {
            this.sender_id = sender_id;
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/OrderRow$OrderRowLoanUiState;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "UNKNOWN", "DUE", "COMPLETED", "OVERDUE", "REFUNDED", "CANCELLED", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OrderRowLoanUiState implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderRowLoanUiState[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final OrderRowLoanUiState CANCELLED;
        public static final OrderRowLoanUiState COMPLETED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OrderRowLoanUiState DUE;
        public static final OrderRowLoanUiState OVERDUE;
        public static final OrderRowLoanUiState REFUNDED;
        public static final OrderRowLoanUiState UNKNOWN;
        private final int value;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/OrderRow$OrderRowLoanUiState$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/OrderRow$OrderRowLoanUiState;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public static OrderRowLoanUiState fromValue(int i) {
                if (i == 0) {
                    return OrderRowLoanUiState.UNKNOWN;
                }
                if (i == 1) {
                    return OrderRowLoanUiState.DUE;
                }
                if (i == 2) {
                    return OrderRowLoanUiState.COMPLETED;
                }
                if (i == 3) {
                    return OrderRowLoanUiState.OVERDUE;
                }
                if (i == 4) {
                    return OrderRowLoanUiState.REFUNDED;
                }
                if (i != 5) {
                    return null;
                }
                return OrderRowLoanUiState.CANCELLED;
            }
        }

        static {
            OrderRowLoanUiState orderRowLoanUiState = new OrderRowLoanUiState("UNKNOWN", 0, 0);
            UNKNOWN = orderRowLoanUiState;
            OrderRowLoanUiState orderRowLoanUiState2 = new OrderRowLoanUiState("DUE", 1, 1);
            DUE = orderRowLoanUiState2;
            OrderRowLoanUiState orderRowLoanUiState3 = new OrderRowLoanUiState("COMPLETED", 2, 2);
            COMPLETED = orderRowLoanUiState3;
            OrderRowLoanUiState orderRowLoanUiState4 = new OrderRowLoanUiState("OVERDUE", 3, 3);
            OVERDUE = orderRowLoanUiState4;
            OrderRowLoanUiState orderRowLoanUiState5 = new OrderRowLoanUiState("REFUNDED", 4, 4);
            REFUNDED = orderRowLoanUiState5;
            OrderRowLoanUiState orderRowLoanUiState6 = new OrderRowLoanUiState("CANCELLED", 5, 5);
            CANCELLED = orderRowLoanUiState6;
            OrderRowLoanUiState[] orderRowLoanUiStateArr = {orderRowLoanUiState, orderRowLoanUiState2, orderRowLoanUiState3, orderRowLoanUiState4, orderRowLoanUiState5, orderRowLoanUiState6};
            $VALUES = orderRowLoanUiStateArr;
            $ENTRIES = new EnumEntriesList(orderRowLoanUiStateArr);
            INSTANCE = new Companion();
            ADAPTER = new OrderRow$OrderRowLoanUiState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OrderRowLoanUiState.class), Syntax.PROTO_2, orderRowLoanUiState);
        }

        public OrderRowLoanUiState(String str, int i, int i2) {
            this.value = i2;
        }

        public static final OrderRowLoanUiState fromValue(int i) {
            INSTANCE.getClass();
            return Companion.fromValue(i);
        }

        public static OrderRowLoanUiState valueOf(String str) {
            return (OrderRowLoanUiState) Enum.valueOf(OrderRowLoanUiState.class, str);
        }

        public static OrderRowLoanUiState[] values() {
            return (OrderRowLoanUiState[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        OrderRow$Companion$ADAPTER$1 orderRow$Companion$ADAPTER$1 = new OrderRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OrderRow.class), "type.googleapis.com/squareup.cash.activity.api.v1.OrderRow", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/models.proto");
        ADAPTER = orderRow$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(orderRow$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderRow(CashAppPayOrderRenderData cashAppPayOrderRenderData, String str, OrderRowLoanUiState orderRowLoanUiState, String str2, String str3, UiCustomer uiCustomer, UiCustomer uiCustomer2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.order = cashAppPayOrderRenderData;
        this.render_data = str;
        this.loan_ui_state = orderRowLoanUiState;
        this.sender_id = str2;
        this.recipient_id = str3;
        this.sender = uiCustomer;
        this.recipient = uiCustomer2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OrderRow)) {
            return false;
        }
        OrderRow orderRow = (OrderRow) obj;
        return Intrinsics.areEqual(unknownFields(), orderRow.unknownFields()) && Intrinsics.areEqual(this.order, orderRow.order) && Intrinsics.areEqual(this.render_data, orderRow.render_data) && this.loan_ui_state == orderRow.loan_ui_state && Intrinsics.areEqual(this.sender_id, orderRow.sender_id) && Intrinsics.areEqual(this.recipient_id, orderRow.recipient_id) && Intrinsics.areEqual(this.sender, orderRow.sender) && Intrinsics.areEqual(this.recipient, orderRow.recipient);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CashAppPayOrderRenderData cashAppPayOrderRenderData = this.order;
        int hashCode2 = (hashCode + (cashAppPayOrderRenderData != null ? cashAppPayOrderRenderData.hashCode() : 0)) * 37;
        String str = this.render_data;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        OrderRowLoanUiState orderRowLoanUiState = this.loan_ui_state;
        int hashCode4 = (hashCode3 + (orderRowLoanUiState != null ? orderRowLoanUiState.hashCode() : 0)) * 37;
        String str2 = this.sender_id;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.recipient_id;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        UiCustomer uiCustomer = this.sender;
        int hashCode7 = (hashCode6 + (uiCustomer != null ? uiCustomer.hashCode() : 0)) * 37;
        UiCustomer uiCustomer2 = this.recipient;
        int hashCode8 = hashCode7 + (uiCustomer2 != null ? uiCustomer2.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.order = this.order;
        builder.render_data = this.render_data;
        builder.loan_ui_state = this.loan_ui_state;
        builder.sender_id = this.sender_id;
        builder.recipient_id = this.recipient_id;
        builder.sender = this.sender;
        builder.recipient = this.recipient;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CashAppPayOrderRenderData cashAppPayOrderRenderData = this.order;
        if (cashAppPayOrderRenderData != null) {
            arrayList.add("order=" + cashAppPayOrderRenderData);
        }
        String str = this.render_data;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "render_data=", arrayList);
        }
        OrderRowLoanUiState orderRowLoanUiState = this.loan_ui_state;
        if (orderRowLoanUiState != null) {
            arrayList.add("loan_ui_state=" + orderRowLoanUiState);
        }
        String str2 = this.sender_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "sender_id=", arrayList);
        }
        String str3 = this.recipient_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "recipient_id=", arrayList);
        }
        UiCustomer uiCustomer = this.sender;
        if (uiCustomer != null) {
            arrayList.add("sender=" + uiCustomer);
        }
        UiCustomer uiCustomer2 = this.recipient;
        if (uiCustomer2 != null) {
            arrayList.add("recipient=" + uiCustomer2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderRow{", "}", 0, null, null, 56);
    }
}
