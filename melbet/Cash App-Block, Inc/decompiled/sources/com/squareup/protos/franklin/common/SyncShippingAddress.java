package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.protos.franklin.ui.UiCashLimits;
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

/* loaded from: classes8.dex */
public final class SyncShippingAddress extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncShippingAddress> CREATOR;
    public final ShippingAddress shipping_address;

    static {
        SyncShippingAddress$Companion$ADAPTER$1 syncShippingAddress$Companion$ADAPTER$1 = new SyncShippingAddress$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncShippingAddress.class), "type.googleapis.com/squareup.franklin.SyncShippingAddress", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncShippingAddress$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncShippingAddress$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncShippingAddress(ShippingAddress shippingAddress, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.shipping_address = shippingAddress;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncShippingAddress)) {
            return false;
        }
        SyncShippingAddress syncShippingAddress = (SyncShippingAddress) obj;
        return Intrinsics.areEqual(unknownFields(), syncShippingAddress.unknownFields()) && Intrinsics.areEqual(this.shipping_address, syncShippingAddress.shipping_address);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ShippingAddress shippingAddress = this.shipping_address;
        int hashCode2 = hashCode + (shippingAddress != null ? shippingAddress.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiCashLimits.Builder builder = new UiCashLimits.Builder(16);
        builder.cash_limit_group = this.shipping_address;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ShippingAddress shippingAddress = this.shipping_address;
        if (shippingAddress != null) {
            arrayList.add("shipping_address=" + shippingAddress);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncShippingAddress{", "}", 0, null, null, 56);
    }
}
