package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.money.content.MoneyTab;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ShippingRateConfiguration extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ShippingRateConfiguration> CREATOR;
    public final List shipping_rates;

    static {
        ShippingRateConfiguration$Companion$ADAPTER$1 shippingRateConfiguration$Companion$ADAPTER$1 = new ShippingRateConfiguration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ShippingRateConfiguration.class), "type.googleapis.com/squareup.cash.local.client.v1.ShippingRateConfiguration", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = shippingRateConfiguration$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(shippingRateConfiguration$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShippingRateConfiguration(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.shipping_rates = TransactorKt.immutableCopyOf("shipping_rates", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShippingRateConfiguration)) {
            return false;
        }
        ShippingRateConfiguration shippingRateConfiguration = (ShippingRateConfiguration) obj;
        return Intrinsics.areEqual(unknownFields(), shippingRateConfiguration.unknownFields()) && Intrinsics.areEqual(this.shipping_rates, shippingRateConfiguration.shipping_rates);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.shipping_rates.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        MoneyTab.Builder builder = new MoneyTab.Builder(13, false);
        builder.applets = this.shipping_rates;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.shipping_rates;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("shipping_rates=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ShippingRateConfiguration{", "}", 0, null, null, 56);
    }
}
