package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
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
public final class ShippingRate extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ShippingRate> CREATOR;
    public final ShippingCarrier carrier;
    public final String label;
    public final String sub_label;
    public final String token;
    public final LocalMoney total_amount;

    static {
        ShippingRate$Companion$ADAPTER$1 shippingRate$Companion$ADAPTER$1 = new ShippingRate$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ShippingRate.class), "type.googleapis.com/squareup.cash.local.client.v1.ShippingRate", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = shippingRate$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(shippingRate$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShippingRate(String str, String str2, LocalMoney localMoney, String str3, ShippingCarrier shippingCarrier, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.label = str2;
        this.total_amount = localMoney;
        this.sub_label = str3;
        this.carrier = shippingCarrier;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShippingRate)) {
            return false;
        }
        ShippingRate shippingRate = (ShippingRate) obj;
        return Intrinsics.areEqual(unknownFields(), shippingRate.unknownFields()) && Intrinsics.areEqual(this.token, shippingRate.token) && Intrinsics.areEqual(this.label, shippingRate.label) && Intrinsics.areEqual(this.total_amount, shippingRate.total_amount) && Intrinsics.areEqual(this.sub_label, shippingRate.sub_label) && this.carrier == shippingRate.carrier;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.label;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalMoney localMoney = this.total_amount;
        int hashCode4 = (hashCode3 + (localMoney != null ? localMoney.hashCode() : 0)) * 37;
        String str3 = this.sub_label;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        ShippingCarrier shippingCarrier = this.carrier;
        int hashCode6 = hashCode5 + (shippingCarrier != null ? shippingCarrier.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BrandBanner.Builder builder = new BrandBanner.Builder(14);
        builder.icon = this.token;
        builder.title = this.label;
        builder.subtitle = this.total_amount;
        builder.action = this.sub_label;
        builder.icon_background_color = this.carrier;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.label;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "label=", arrayList);
        }
        LocalMoney localMoney = this.total_amount;
        if (localMoney != null) {
            SizeMode$EnumUnboxingLocalUtility.m("total_amount=", localMoney, arrayList);
        }
        String str3 = this.sub_label;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "sub_label=", arrayList);
        }
        ShippingCarrier shippingCarrier = this.carrier;
        if (shippingCarrier != null) {
            arrayList.add("carrier=" + shippingCarrier);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ShippingRate{", "}", 0, null, null, 56);
    }
}
