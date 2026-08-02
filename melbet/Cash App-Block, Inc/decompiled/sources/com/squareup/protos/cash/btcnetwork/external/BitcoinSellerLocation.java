package com.squareup.protos.cash.btcnetwork.external;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.common.location.GlobalAddress;
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
public final class BitcoinSellerLocation extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BitcoinSellerLocation> CREATOR;
    public final GlobalAddress address;
    public final String description;
    public final String icon_url;
    public final String id;
    public final Boolean is_square_seller;
    public final Double latitude;
    public final Double longitude;
    public final String name;
    public final PaymentMethods payment_methods;

    static {
        BitcoinSellerLocation$Companion$ADAPTER$1 bitcoinSellerLocation$Companion$ADAPTER$1 = new BitcoinSellerLocation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BitcoinSellerLocation.class), "type.googleapis.com/squareup.cash.btcnetwork.external.BitcoinSellerLocation", Syntax.PROTO_2, null, "squareup/cash/btcnetwork/external/public.proto");
        ADAPTER = bitcoinSellerLocation$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(bitcoinSellerLocation$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinSellerLocation(Double d, Double d2, GlobalAddress globalAddress, String str, PaymentMethods paymentMethods, Boolean bool, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.latitude = d;
        this.longitude = d2;
        this.address = globalAddress;
        this.name = str;
        this.payment_methods = paymentMethods;
        this.is_square_seller = bool;
        this.icon_url = str2;
        this.description = str3;
        this.id = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitcoinSellerLocation)) {
            return false;
        }
        BitcoinSellerLocation bitcoinSellerLocation = (BitcoinSellerLocation) obj;
        return Intrinsics.areEqual(unknownFields(), bitcoinSellerLocation.unknownFields()) && Intrinsics.areEqual(this.latitude, bitcoinSellerLocation.latitude) && Intrinsics.areEqual(this.longitude, bitcoinSellerLocation.longitude) && Intrinsics.areEqual(this.address, bitcoinSellerLocation.address) && Intrinsics.areEqual(this.name, bitcoinSellerLocation.name) && Intrinsics.areEqual(this.payment_methods, bitcoinSellerLocation.payment_methods) && Intrinsics.areEqual(this.is_square_seller, bitcoinSellerLocation.is_square_seller) && Intrinsics.areEqual(this.icon_url, bitcoinSellerLocation.icon_url) && Intrinsics.areEqual(this.description, bitcoinSellerLocation.description) && Intrinsics.areEqual(this.id, bitcoinSellerLocation.id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Double d = this.latitude;
        int hashCode2 = (hashCode + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
        Double d2 = this.longitude;
        int hashCode3 = (hashCode2 + (d2 != null ? Double.hashCode(d2.doubleValue()) : 0)) * 37;
        GlobalAddress globalAddress = this.address;
        int hashCode4 = (hashCode3 + (globalAddress != null ? globalAddress.hashCode() : 0)) * 37;
        String str = this.name;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        PaymentMethods paymentMethods = this.payment_methods;
        int hashCode6 = (hashCode5 + (paymentMethods != null ? paymentMethods.hashCode() : 0)) * 37;
        Boolean bool = this.is_square_seller;
        int hashCode7 = (hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str2 = this.icon_url;
        int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.description;
        int hashCode9 = (hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.id;
        int hashCode10 = hashCode9 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(6, false);
        builder.locale = this.latitude;
        builder.title = this.longitude;
        builder.info_rows_header = this.address;
        builder.footer_text = this.name;
        builder.loadable_subtitle = this.payment_methods;
        builder.info_rows = this.is_square_seller;
        builder.primary_footer_button_state = this.icon_url;
        builder.secondary_footer_button_state = this.description;
        builder.payment_plans_data = this.id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Double d = this.latitude;
        if (d != null) {
            SizeMode$EnumUnboxingLocalUtility.m("latitude=", d, arrayList);
        }
        Double d2 = this.longitude;
        if (d2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("longitude=", d2, arrayList);
        }
        GlobalAddress globalAddress = this.address;
        if (globalAddress != null) {
            arrayList.add("address=" + globalAddress);
        }
        if (this.name != null) {
            arrayList.add("name=██");
        }
        PaymentMethods paymentMethods = this.payment_methods;
        if (paymentMethods != null) {
            arrayList.add("payment_methods=" + paymentMethods);
        }
        Boolean bool = this.is_square_seller;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_square_seller=", bool, arrayList);
        }
        String str = this.icon_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "icon_url=", arrayList);
        }
        String str2 = this.description;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
        }
        String str3 = this.id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BitcoinSellerLocation{", "}", 0, null, null, 56);
    }
}
