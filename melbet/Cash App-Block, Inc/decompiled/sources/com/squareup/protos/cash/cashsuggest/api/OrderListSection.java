package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import app.cash.redwood.yoga.internal.YGFloatOptional;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.TrustsData;
import com.squareup.protos.cash.composer.app.Card;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes7.dex */
public final class OrderListSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OrderListSection> CREATOR;
    public final List activity_rows;
    public final YGFloatOptional screen_content;

    public final class TextLineItems extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TextLineItems> CREATOR;
        public final List line_items;

        static {
            OrderListSection$TextLineItems$Companion$ADAPTER$1 orderListSection$TextLineItems$Companion$ADAPTER$1 = new OrderListSection$TextLineItems$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TextLineItems.class), "type.googleapis.com/squareup.cash.cashsuggest.api.OrderListSection.TextLineItems", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletHome.proto");
            ADAPTER = orderListSection$TextLineItems$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(orderListSection$TextLineItems$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextLineItems(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.line_items = TransactorKt.immutableCopyOf("line_items", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TextLineItems)) {
                return false;
            }
            TextLineItems textLineItems = (TextLineItems) obj;
            return Intrinsics.areEqual(unknownFields(), textLineItems.unknownFields()) && Intrinsics.areEqual(this.line_items, textLineItems.line_items);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.line_items.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            TrustsData.Builder builder = new TrustsData.Builder(17);
            builder.trust = this.line_items;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.line_items;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("line_items=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TextLineItems{", "}", 0, null, null, 56);
        }
    }

    static {
        OrderListSection$Companion$ADAPTER$1 orderListSection$Companion$ADAPTER$1 = new OrderListSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OrderListSection.class), "type.googleapis.com/squareup.cash.cashsuggest.api.OrderListSection", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletHome.proto");
        ADAPTER = orderListSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(orderListSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderListSection(List list, YGFloatOptional yGFloatOptional, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.screen_content = yGFloatOptional;
        this.activity_rows = TransactorKt.immutableCopyOf("activity_rows", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OrderListSection)) {
            return false;
        }
        OrderListSection orderListSection = (OrderListSection) obj;
        return Intrinsics.areEqual(unknownFields(), orderListSection.unknownFields()) && Intrinsics.areEqual(this.activity_rows, orderListSection.activity_rows) && Intrinsics.areEqual(this.screen_content, orderListSection.screen_content);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.activity_rows);
        YGFloatOptional yGFloatOptional = this.screen_content;
        int hashCode = m + (yGFloatOptional != null ? yGFloatOptional.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(20);
        builder.image_url = this.activity_rows;
        builder.asset = this.screen_content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.activity_rows;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("activity_rows=", arrayList, list);
        }
        YGFloatOptional yGFloatOptional = this.screen_content;
        if (yGFloatOptional != null) {
            arrayList.add("screen_content=" + yGFloatOptional);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderListSection{", "}", 0, null, null, 56);
    }

    public final class EligibleRetroOrders extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EligibleRetroOrders> CREATOR;
        public final List activity_rows;
        public final List order_rows;

        static {
            OrderListSection$EligibleRetroOrders$Companion$ADAPTER$1 orderListSection$EligibleRetroOrders$Companion$ADAPTER$1 = new OrderListSection$EligibleRetroOrders$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EligibleRetroOrders.class), "type.googleapis.com/squareup.cash.cashsuggest.api.OrderListSection.EligibleRetroOrders", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletHome.proto");
            ADAPTER = orderListSection$EligibleRetroOrders$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(orderListSection$EligibleRetroOrders$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EligibleRetroOrders(List list, List list2, ByteString byteString) {
            super(ADAPTER, byteString);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
            this.activity_rows = TransactorKt.immutableCopyOf("activity_rows", list);
            this.order_rows = TransactorKt.immutableCopyOf("order_rows", list2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EligibleRetroOrders)) {
                return false;
            }
            EligibleRetroOrders eligibleRetroOrders = (EligibleRetroOrders) obj;
            return Intrinsics.areEqual(unknownFields(), eligibleRetroOrders.unknownFields()) && Intrinsics.areEqual(this.activity_rows, eligibleRetroOrders.activity_rows) && Intrinsics.areEqual(this.order_rows, eligibleRetroOrders.order_rows);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.order_rows.hashCode() + Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.activity_rows);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GreenBenefitsV1.Builder builder = new GreenBenefitsV1.Builder(7, false);
            builder.card_holder_benefits = this.activity_rows;
            builder.green_status_benefits = this.order_rows;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.activity_rows;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("activity_rows=", arrayList, list);
            }
            List list2 = this.order_rows;
            if (!list2.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("order_rows=", arrayList, list2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EligibleRetroOrders{", "}", 0, null, null, 56);
        }

        public EligibleRetroOrders(List list) {
            this(EmptyList.INSTANCE, list, ByteString.EMPTY);
        }
    }
}
