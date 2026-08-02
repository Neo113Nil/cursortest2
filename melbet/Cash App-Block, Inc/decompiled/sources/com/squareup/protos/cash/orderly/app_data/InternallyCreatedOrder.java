package com.squareup.protos.cash.orderly.app_data;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.Instrument;
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
public final class InternallyCreatedOrder extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InternallyCreatedOrder> CREATOR;
    public final String order_id;

    static {
        InternallyCreatedOrder$Companion$ADAPTER$1 internallyCreatedOrder$Companion$ADAPTER$1 = new InternallyCreatedOrder$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InternallyCreatedOrder.class), "type.googleapis.com/squareup.cash.orderly.app_data.InternallyCreatedOrder", Syntax.PROTO_2, null, "squareup/cash/orderly/app_data/internally_created_order.proto");
        ADAPTER = internallyCreatedOrder$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(internallyCreatedOrder$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternallyCreatedOrder(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        byteString.getClass();
        this.order_id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InternallyCreatedOrder)) {
            return false;
        }
        InternallyCreatedOrder internallyCreatedOrder = (InternallyCreatedOrder) obj;
        return Intrinsics.areEqual(unknownFields(), internallyCreatedOrder.unknownFields()) && Intrinsics.areEqual(this.order_id, internallyCreatedOrder.order_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.order_id.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Instrument.Builder builder = new Instrument.Builder(22);
        builder.token = this.order_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.order_id, "order_id=", arrayList);
        return CollectionsKt.joinToString$default(arrayList, ", ", "InternallyCreatedOrder{", "}", 0, null, null, 56);
    }
}
