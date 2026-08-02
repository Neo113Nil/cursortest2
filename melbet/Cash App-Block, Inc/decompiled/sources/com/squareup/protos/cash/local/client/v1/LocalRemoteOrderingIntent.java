package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
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
public final class LocalRemoteOrderingIntent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalRemoteOrderingIntent> CREATOR;
    public final LocalShoppingCart cart;
    public final LocalFulfillment fulfillment;
    public final String location_token;

    static {
        LocalRemoteOrderingIntent$Companion$ADAPTER$1 localRemoteOrderingIntent$Companion$ADAPTER$1 = new LocalRemoteOrderingIntent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalRemoteOrderingIntent.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalRemoteOrderingIntent", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_user_intent.proto");
        ADAPTER = localRemoteOrderingIntent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localRemoteOrderingIntent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalRemoteOrderingIntent(String str, LocalFulfillment localFulfillment, LocalShoppingCart localShoppingCart, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.location_token = str;
        this.fulfillment = localFulfillment;
        this.cart = localShoppingCart;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalRemoteOrderingIntent)) {
            return false;
        }
        LocalRemoteOrderingIntent localRemoteOrderingIntent = (LocalRemoteOrderingIntent) obj;
        return Intrinsics.areEqual(unknownFields(), localRemoteOrderingIntent.unknownFields()) && Intrinsics.areEqual(this.location_token, localRemoteOrderingIntent.location_token) && Intrinsics.areEqual(this.fulfillment, localRemoteOrderingIntent.fulfillment) && Intrinsics.areEqual(this.cart, localRemoteOrderingIntent.cart);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.location_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalFulfillment localFulfillment = this.fulfillment;
        int hashCode3 = (hashCode2 + (localFulfillment != null ? localFulfillment.hashCode() : 0)) * 37;
        LocalShoppingCart localShoppingCart = this.cart;
        int hashCode4 = hashCode3 + (localShoppingCart != null ? localShoppingCart.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BLEPayload.Builder builder = new BLEPayload.Builder(2, false);
        builder.advertisement_data = this.location_token;
        builder.transmission_level = this.fulfillment;
        builder.frequency = this.cart;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.location_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "location_token=", arrayList);
        }
        LocalFulfillment localFulfillment = this.fulfillment;
        if (localFulfillment != null) {
            arrayList.add("fulfillment=" + localFulfillment);
        }
        LocalShoppingCart localShoppingCart = this.cart;
        if (localShoppingCart != null) {
            arrayList.add("cart=" + localShoppingCart);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalRemoteOrderingIntent{", "}", 0, null, null, 56);
    }
}
