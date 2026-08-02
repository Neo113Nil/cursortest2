package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.LocalActionOrdering;
import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalActionOrdering extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalActionOrdering> CREATOR;
    public final String discount_code_label;
    public final DiscountCodeMode discount_code_mode;
    public final Boolean enabled;
    public final OrderingMode ordering_mode;
    public final List past_orders;
    public final List popular_orders;
    public final List reorderable_past_selections;

    public final class Builder extends Message.Builder {
        public String discount_code_label;
        public DiscountCodeMode discount_code_mode;
        public Boolean enabled;
        public OrderingMode ordering_mode;
        public List past_orders;
        public List popular_orders;
        public List reorderable_past_selections;

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new LocalActionOrdering(this.enabled, this.popular_orders, this.past_orders, this.reorderable_past_selections, this.discount_code_mode, this.discount_code_label, this.ordering_mode, buildUnknownFields());
        }
    }

    public enum DiscountCodeMode implements WireEnum {
        DISCOUNT_CODE_MODE_UNSPECIFIED(0),
        DISCOUNT_CODE_MODE_DISABLED(1),
        DISCOUNT_CODE_MODE_ENABLED_SINGLE_CODE(2),
        DISCOUNT_CODE_MODE_ENABLED_MULTIPLE_CODES(3);

        public static final LocalActionOrdering$DiscountCodeMode$Companion$ADAPTER$1 ADAPTER;
        public static final FeeType.Companion Companion;
        public final int value;

        static {
            DiscountCodeMode discountCodeMode = DISCOUNT_CODE_MODE_UNSPECIFIED;
            Companion = new FeeType.Companion();
            ADAPTER = new LocalActionOrdering$DiscountCodeMode$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DiscountCodeMode.class), Syntax.PROTO_2, discountCodeMode);
        }

        DiscountCodeMode(int i) {
            this.value = i;
        }

        public static final DiscountCodeMode fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return DISCOUNT_CODE_MODE_UNSPECIFIED;
            }
            if (i == 1) {
                return DISCOUNT_CODE_MODE_DISABLED;
            }
            if (i == 2) {
                return DISCOUNT_CODE_MODE_ENABLED_SINGLE_CODE;
            }
            if (i != 3) {
                return null;
            }
            return DISCOUNT_CODE_MODE_ENABLED_MULTIPLE_CODES;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class PastOrder extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PastOrder> CREATOR;
        public final List cart_line_selections;
        public final Long last_ordered_at;
        public final String order_token;
        public final String receipt_url;
        public final LocalMoney total_amount;

        public final class Builder extends Message.Builder {
            public List cart_line_selections;
            public Long last_ordered_at;
            public String order_token;
            public String receipt_url;
            public LocalMoney total_amount;

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                return new PastOrder(this.last_ordered_at, this.cart_line_selections, this.receipt_url, this.total_amount, this.order_token, buildUnknownFields());
            }
        }

        static {
            LocalActionOrdering$PastOrder$Companion$ADAPTER$1 localActionOrdering$PastOrder$Companion$ADAPTER$1 = new LocalActionOrdering$PastOrder$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PastOrder.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalActionOrdering.PastOrder", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_actions.proto");
            ADAPTER = localActionOrdering$PastOrder$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localActionOrdering$PastOrder$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PastOrder(Long l, List list, String str, LocalMoney localMoney, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.last_ordered_at = l;
            this.receipt_url = str;
            this.total_amount = localMoney;
            this.order_token = str2;
            this.cart_line_selections = TransactorKt.immutableCopyOf("cart_line_selections", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PastOrder)) {
                return false;
            }
            PastOrder pastOrder = (PastOrder) obj;
            return Intrinsics.areEqual(unknownFields(), pastOrder.unknownFields()) && Intrinsics.areEqual(this.last_ordered_at, pastOrder.last_ordered_at) && Intrinsics.areEqual(this.cart_line_selections, pastOrder.cart_line_selections) && Intrinsics.areEqual(this.receipt_url, pastOrder.receipt_url) && Intrinsics.areEqual(this.total_amount, pastOrder.total_amount) && Intrinsics.areEqual(this.order_token, pastOrder.order_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.last_ordered_at;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37, 37, this.cart_line_selections);
            String str = this.receipt_url;
            int hashCode2 = (m + (str != null ? str.hashCode() : 0)) * 37;
            LocalMoney localMoney = this.total_amount;
            int hashCode3 = (hashCode2 + (localMoney != null ? localMoney.hashCode() : 0)) * 37;
            String str2 = this.order_token;
            int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.last_ordered_at = this.last_ordered_at;
            builder.cart_line_selections = this.cart_line_selections;
            builder.receipt_url = this.receipt_url;
            builder.total_amount = this.total_amount;
            builder.order_token = this.order_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Long l = this.last_ordered_at;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("last_ordered_at=", l, arrayList);
            }
            List list = this.cart_line_selections;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("cart_line_selections=", arrayList, list);
            }
            String str = this.receipt_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "receipt_url=", arrayList);
            }
            LocalMoney localMoney = this.total_amount;
            if (localMoney != null) {
                SizeMode$EnumUnboxingLocalUtility.m("total_amount=", localMoney, arrayList);
            }
            String str2 = this.order_token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "order_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PastOrder{", "}", 0, null, null, 56);
        }
    }

    public final class PopularOrder extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PopularOrder> CREATOR;
        public final List cart_line_selections;
        public final String name;

        public final class Builder extends Message.Builder {
            public List cart_line_selections;
            public String name;

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                return new PopularOrder(this.name, this.cart_line_selections, buildUnknownFields());
            }
        }

        static {
            LocalActionOrdering$PopularOrder$Companion$ADAPTER$1 localActionOrdering$PopularOrder$Companion$ADAPTER$1 = new LocalActionOrdering$PopularOrder$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PopularOrder.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalActionOrdering.PopularOrder", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_actions.proto");
            ADAPTER = localActionOrdering$PopularOrder$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localActionOrdering$PopularOrder$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PopularOrder(String str, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.name = str;
            this.cart_line_selections = TransactorKt.immutableCopyOf("cart_line_selections", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PopularOrder)) {
                return false;
            }
            PopularOrder popularOrder = (PopularOrder) obj;
            return Intrinsics.areEqual(unknownFields(), popularOrder.unknownFields()) && Intrinsics.areEqual(this.name, popularOrder.name) && Intrinsics.areEqual(this.cart_line_selections, popularOrder.cart_line_selections);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.name;
            int hashCode2 = this.cart_line_selections.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.name = this.name;
            builder.cart_line_selections = this.cart_line_selections;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
            }
            List list = this.cart_line_selections;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("cart_line_selections=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PopularOrder{", "}", 0, null, null, 56);
        }
    }

    static {
        LocalActionOrdering$Companion$ADAPTER$1 localActionOrdering$Companion$ADAPTER$1 = new LocalActionOrdering$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalActionOrdering.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalActionOrdering", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_actions.proto");
        ADAPTER = localActionOrdering$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localActionOrdering$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalActionOrdering(Boolean bool, List list, List list2, List list3, DiscountCodeMode discountCodeMode, String str, OrderingMode orderingMode, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.enabled = bool;
        this.discount_code_mode = discountCodeMode;
        this.discount_code_label = str;
        this.ordering_mode = orderingMode;
        this.popular_orders = TransactorKt.immutableCopyOf("popular_orders", list);
        this.past_orders = TransactorKt.immutableCopyOf("past_orders", list2);
        this.reorderable_past_selections = TransactorKt.immutableCopyOf("reorderable_past_selections", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalActionOrdering)) {
            return false;
        }
        LocalActionOrdering localActionOrdering = (LocalActionOrdering) obj;
        return Intrinsics.areEqual(unknownFields(), localActionOrdering.unknownFields()) && Intrinsics.areEqual(this.enabled, localActionOrdering.enabled) && Intrinsics.areEqual(this.popular_orders, localActionOrdering.popular_orders) && Intrinsics.areEqual(this.past_orders, localActionOrdering.past_orders) && Intrinsics.areEqual(this.reorderable_past_selections, localActionOrdering.reorderable_past_selections) && this.discount_code_mode == localActionOrdering.discount_code_mode && Intrinsics.areEqual(this.discount_code_label, localActionOrdering.discount_code_label) && this.ordering_mode == localActionOrdering.ordering_mode;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.enabled;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37, 37, this.popular_orders), 37, this.past_orders), 37, this.reorderable_past_selections);
        DiscountCodeMode discountCodeMode = this.discount_code_mode;
        int hashCode2 = (m + (discountCodeMode != null ? discountCodeMode.hashCode() : 0)) * 37;
        String str = this.discount_code_label;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        OrderingMode orderingMode = this.ordering_mode;
        int hashCode4 = hashCode3 + (orderingMode != null ? orderingMode.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.enabled = this.enabled;
        builder.popular_orders = this.popular_orders;
        builder.past_orders = this.past_orders;
        builder.reorderable_past_selections = this.reorderable_past_selections;
        builder.discount_code_mode = this.discount_code_mode;
        builder.discount_code_label = this.discount_code_label;
        builder.ordering_mode = this.ordering_mode;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        List list = this.popular_orders;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("popular_orders=", arrayList, list);
        }
        List list2 = this.past_orders;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("past_orders=", arrayList, list2);
        }
        List list3 = this.reorderable_past_selections;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("reorderable_past_selections=", arrayList, list3);
        }
        DiscountCodeMode discountCodeMode = this.discount_code_mode;
        if (discountCodeMode != null) {
            arrayList.add("discount_code_mode=" + discountCodeMode);
        }
        String str = this.discount_code_label;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "discount_code_label=", arrayList);
        }
        OrderingMode orderingMode = this.ordering_mode;
        if (orderingMode != null) {
            arrayList.add("ordering_mode=" + orderingMode);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalActionOrdering{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/squareup/protos/cash/local/client/v1/LocalActionOrdering$OrderingMode", "Lcom/squareup/wire/WireEnum;", "", "Lcom/squareup/protos/cash/local/client/v1/LocalActionOrdering$OrderingMode;", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "ORDERING_MODE_UNSPECIFIED", "ORDERING_MODE_AVAILABLE", "ORDERING_MODE_TEMPORARILY_UNAVAILABLE", "ORDERING_MODE_PERMANENTLY_UNAVAILABLE", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class OrderingMode implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderingMode[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OrderingMode ORDERING_MODE_AVAILABLE;
        public static final OrderingMode ORDERING_MODE_PERMANENTLY_UNAVAILABLE;
        public static final OrderingMode ORDERING_MODE_TEMPORARILY_UNAVAILABLE;
        public static final OrderingMode ORDERING_MODE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ OrderingMode[] $values() {
            return new OrderingMode[]{ORDERING_MODE_UNSPECIFIED, ORDERING_MODE_AVAILABLE, ORDERING_MODE_TEMPORARILY_UNAVAILABLE, ORDERING_MODE_PERMANENTLY_UNAVAILABLE};
        }

        static {
            final OrderingMode orderingMode = new OrderingMode("ORDERING_MODE_UNSPECIFIED", 0, 0);
            ORDERING_MODE_UNSPECIFIED = orderingMode;
            ORDERING_MODE_AVAILABLE = new OrderingMode("ORDERING_MODE_AVAILABLE", 1, 1);
            ORDERING_MODE_TEMPORARILY_UNAVAILABLE = new OrderingMode("ORDERING_MODE_TEMPORARILY_UNAVAILABLE", 2, 2);
            ORDERING_MODE_PERMANENTLY_UNAVAILABLE = new OrderingMode("ORDERING_MODE_PERMANENTLY_UNAVAILABLE", 3, 3);
            OrderingMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OrderingMode.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, orderingMode) { // from class: com.squareup.protos.cash.local.client.v1.LocalActionOrdering$OrderingMode$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public LocalActionOrdering.OrderingMode fromValue(int value) {
                    return LocalActionOrdering.OrderingMode.INSTANCE.fromValue(value);
                }
            };
        }

        private OrderingMode(String str, int i, int i2) {
            this.value = i2;
        }

        public static final OrderingMode fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static OrderingMode valueOf(String str) {
            return (OrderingMode) Enum.valueOf(OrderingMode.class, str);
        }

        public static OrderingMode[] values() {
            return (OrderingMode[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalActionOrdering$OrderingMode$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/local/client/v1/LocalActionOrdering$OrderingMode;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final OrderingMode fromValue(int value) {
                if (value == 0) {
                    return OrderingMode.ORDERING_MODE_UNSPECIFIED;
                }
                if (value == 1) {
                    return OrderingMode.ORDERING_MODE_AVAILABLE;
                }
                if (value == 2) {
                    return OrderingMode.ORDERING_MODE_TEMPORARILY_UNAVAILABLE;
                }
                if (value != 3) {
                    return null;
                }
                return OrderingMode.ORDERING_MODE_PERMANENTLY_UNAVAILABLE;
            }

            private Companion() {
            }
        }
    }
}
