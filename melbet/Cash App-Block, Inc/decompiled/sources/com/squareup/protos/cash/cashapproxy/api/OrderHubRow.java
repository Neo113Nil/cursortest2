package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import app.cash.local.primitives.LocationMenuKt;
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
public final class OrderHubRow extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OrderHubRow> CREATOR;
    public final LocationMenuKt content;

    static {
        OrderHubRow$Companion$ADAPTER$1 orderHubRow$Companion$ADAPTER$1 = new OrderHubRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OrderHubRow.class), "type.googleapis.com/squareup.cash.cashapproxy.api.v1.OrderHubRow", Syntax.PROTO_2, null, "squareup/cash/cashapproxy/api/v1/afterpay_hub.proto");
        ADAPTER = orderHubRow$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(orderHubRow$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderHubRow(LocationMenuKt locationMenuKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.content = locationMenuKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OrderHubRow)) {
            return false;
        }
        OrderHubRow orderHubRow = (OrderHubRow) obj;
        return Intrinsics.areEqual(unknownFields(), orderHubRow.unknownFields()) && Intrinsics.areEqual(this.content, orderHubRow.content);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocationMenuKt locationMenuKt = this.content;
        int hashCode2 = hashCode + (locationMenuKt != null ? locationMenuKt.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Activity.Builder builder = new Activity.Builder(3);
        builder.activity = this.content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.content != null) {
            arrayList.add("content=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderHubRow{", "}", 0, null, null, 56);
    }
}
