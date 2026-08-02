package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import app.cash.local.primitives.LocalMoneyKt;
import com.squareup.protos.cash.cashface.api.Activity;
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
public final class OrderDetailRow extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OrderDetailRow> CREATOR;
    public final LocalMoneyKt row;

    static {
        OrderDetailRow$Companion$ADAPTER$1 orderDetailRow$Companion$ADAPTER$1 = new OrderDetailRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OrderDetailRow.class), "type.googleapis.com/squareup.cash.cashapproxy.api.v1.OrderDetailRow", Syntax.PROTO_2, null, "squareup/cash/cashapproxy/api/v1/order_details.proto");
        ADAPTER = orderDetailRow$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(orderDetailRow$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailRow(LocalMoneyKt localMoneyKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.row = localMoneyKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OrderDetailRow)) {
            return false;
        }
        OrderDetailRow orderDetailRow = (OrderDetailRow) obj;
        return Intrinsics.areEqual(unknownFields(), orderDetailRow.unknownFields()) && Intrinsics.areEqual(this.row, orderDetailRow.row);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalMoneyKt localMoneyKt = this.row;
        int hashCode2 = hashCode + (localMoneyKt != null ? localMoneyKt.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Activity.Builder builder = new Activity.Builder(2);
        builder.activity = this.row;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalMoneyKt localMoneyKt = this.row;
        if (localMoneyKt != null) {
            arrayList.add("row=" + localMoneyKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderDetailRow{", "}", 0, null, null, 56);
    }
}
