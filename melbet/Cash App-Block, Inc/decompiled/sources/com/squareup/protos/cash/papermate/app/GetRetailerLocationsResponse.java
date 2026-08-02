package com.squareup.protos.cash.papermate.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.GiftCard;
import com.squareup.protos.cash.money.content.MoneyTab;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.lending.Loan;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/papermate/app/GetRetailerLocationsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/money/content/MoneyTab$Builder;", "Builder", "RetailerLocation", "DepositMethods", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetRetailerLocationsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetRetailerLocationsResponse> CREATOR;
    public final List locations;

    public final class DepositMethods extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DepositMethods> CREATOR;
        public final Money min_scan_amount;
        public final Money min_swipe_amount;
        public final Boolean scan;
        public final Boolean swipe;

        static {
            GetRetailerLocationsResponse$DepositMethods$Companion$ADAPTER$1 getRetailerLocationsResponse$DepositMethods$Companion$ADAPTER$1 = new GetRetailerLocationsResponse$DepositMethods$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DepositMethods.class), "type.googleapis.com/squareup.cash.papermate.app.GetRetailerLocationsResponse.DepositMethods", Syntax.PROTO_2, null, "squareup/cash/papermate/app/GetRetailerLocations.proto");
            ADAPTER = getRetailerLocationsResponse$DepositMethods$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getRetailerLocationsResponse$DepositMethods$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DepositMethods(Boolean bool, Boolean bool2, Money money, Money money2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.scan = bool;
            this.swipe = bool2;
            this.min_scan_amount = money;
            this.min_swipe_amount = money2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DepositMethods)) {
                return false;
            }
            DepositMethods depositMethods = (DepositMethods) obj;
            return Intrinsics.areEqual(unknownFields(), depositMethods.unknownFields()) && Intrinsics.areEqual(this.scan, depositMethods.scan) && Intrinsics.areEqual(this.swipe, depositMethods.swipe) && Intrinsics.areEqual(this.min_scan_amount, depositMethods.min_scan_amount) && Intrinsics.areEqual(this.min_swipe_amount, depositMethods.min_swipe_amount);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Boolean bool = this.scan;
            int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Boolean bool2 = this.swipe;
            int hashCode3 = (hashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
            Money money = this.min_scan_amount;
            int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
            Money money2 = this.min_swipe_amount;
            int hashCode5 = hashCode4 + (money2 != null ? money2.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GiftCard.Builder builder = new GiftCard.Builder(29, false);
            builder.id = this.scan;
            builder.last_4 = this.swipe;
            builder.gift_card_id = this.min_scan_amount;
            builder.gift_card_amount = this.min_swipe_amount;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Boolean bool = this.scan;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("scan=", bool, arrayList);
            }
            Boolean bool2 = this.swipe;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("swipe=", bool2, arrayList);
            }
            Money money = this.min_scan_amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("min_scan_amount=", money, arrayList);
            }
            Money money2 = this.min_swipe_amount;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("min_swipe_amount=", money2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DepositMethods{", "}", 0, null, null, 56);
        }
    }

    public final class RetailerLocation extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RetailerLocation> CREATOR;
        public final GlobalAddress address;
        public final String deposit_location;
        public final DepositMethods deposit_methods;
        public final Money fee_amount;
        public final Double latitude;
        public final Double longitude;
        public final Color retailer_accent_color;
        public final String retailer_icon_url;
        public final String retailer_location_token;
        public final String retailer_name;
        public final Color retailer_title_color;
        public final String retailer_token;
        public final String support_button_text;
        public final String support_url;

        static {
            GetRetailerLocationsResponse$RetailerLocation$Companion$ADAPTER$1 getRetailerLocationsResponse$RetailerLocation$Companion$ADAPTER$1 = new GetRetailerLocationsResponse$RetailerLocation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RetailerLocation.class), "type.googleapis.com/squareup.cash.papermate.app.GetRetailerLocationsResponse.RetailerLocation", Syntax.PROTO_2, null, "squareup/cash/papermate/app/GetRetailerLocations.proto");
            ADAPTER = getRetailerLocationsResponse$RetailerLocation$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getRetailerLocationsResponse$RetailerLocation$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetailerLocation(Double d, Double d2, GlobalAddress globalAddress, String str, String str2, Color color, String str3, String str4, String str5, String str6, Color color2, DepositMethods depositMethods, String str7, Money money, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.latitude = d;
            this.longitude = d2;
            this.address = globalAddress;
            this.retailer_name = str;
            this.retailer_icon_url = str2;
            this.retailer_accent_color = color;
            this.retailer_token = str3;
            this.retailer_location_token = str4;
            this.support_button_text = str5;
            this.support_url = str6;
            this.retailer_title_color = color2;
            this.deposit_methods = depositMethods;
            this.deposit_location = str7;
            this.fee_amount = money;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RetailerLocation)) {
                return false;
            }
            RetailerLocation retailerLocation = (RetailerLocation) obj;
            return Intrinsics.areEqual(unknownFields(), retailerLocation.unknownFields()) && Intrinsics.areEqual(this.latitude, retailerLocation.latitude) && Intrinsics.areEqual(this.longitude, retailerLocation.longitude) && Intrinsics.areEqual(this.address, retailerLocation.address) && Intrinsics.areEqual(this.retailer_name, retailerLocation.retailer_name) && Intrinsics.areEqual(this.retailer_icon_url, retailerLocation.retailer_icon_url) && Intrinsics.areEqual(this.retailer_accent_color, retailerLocation.retailer_accent_color) && Intrinsics.areEqual(this.retailer_token, retailerLocation.retailer_token) && Intrinsics.areEqual(this.retailer_location_token, retailerLocation.retailer_location_token) && Intrinsics.areEqual(this.support_button_text, retailerLocation.support_button_text) && Intrinsics.areEqual(this.support_url, retailerLocation.support_url) && Intrinsics.areEqual(this.retailer_title_color, retailerLocation.retailer_title_color) && Intrinsics.areEqual(this.deposit_methods, retailerLocation.deposit_methods) && Intrinsics.areEqual(this.deposit_location, retailerLocation.deposit_location) && Intrinsics.areEqual(this.fee_amount, retailerLocation.fee_amount);
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
            String str = this.retailer_name;
            int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.retailer_icon_url;
            int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Color color = this.retailer_accent_color;
            int hashCode7 = (hashCode6 + (color != null ? color.hashCode() : 0)) * 37;
            String str3 = this.retailer_token;
            int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.retailer_location_token;
            int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.support_button_text;
            int hashCode10 = (hashCode9 + (str5 != null ? str5.hashCode() : 0)) * 37;
            String str6 = this.support_url;
            int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 37;
            Color color2 = this.retailer_title_color;
            int hashCode12 = (hashCode11 + (color2 != null ? color2.hashCode() : 0)) * 37;
            DepositMethods depositMethods = this.deposit_methods;
            int hashCode13 = (hashCode12 + (depositMethods != null ? depositMethods.hashCode() : 0)) * 37;
            String str7 = this.deposit_location;
            int hashCode14 = (hashCode13 + (str7 != null ? str7.hashCode() : 0)) * 37;
            Money money = this.fee_amount;
            int hashCode15 = hashCode14 + (money != null ? money.hashCode() : 0);
            this.hashCode = hashCode15;
            return hashCode15;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Loan.Builder builder = new Loan.Builder(8);
            builder.borrowed_at = this.latitude;
            builder.due_at = this.longitude;
            builder.setup_fee_amount = this.address;
            builder.token = this.retailer_name;
            builder.credit_line_token = this.retailer_icon_url;
            builder.outstanding_amount = this.retailer_accent_color;
            builder.late_fee_amount = this.retailer_token;
            builder.interest_amount = this.retailer_location_token;
            builder.setup_fee_bps = this.support_button_text;
            builder.detail_rows = this.support_url;
            builder.state = this.retailer_title_color;
            builder.lending_product = this.deposit_methods;
            builder.bnpl_data = this.deposit_location;
            builder.principal_amount = this.fee_amount;
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
            String str = this.retailer_name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "retailer_name=", arrayList);
            }
            String str2 = this.retailer_icon_url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "retailer_icon_url=", arrayList);
            }
            Color color = this.retailer_accent_color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("retailer_accent_color=", color, arrayList);
            }
            String str3 = this.retailer_token;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "retailer_token=", arrayList);
            }
            String str4 = this.retailer_location_token;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "retailer_location_token=", arrayList);
            }
            String str5 = this.support_button_text;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "support_button_text=", arrayList);
            }
            String str6 = this.support_url;
            if (str6 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "support_url=", arrayList);
            }
            Color color2 = this.retailer_title_color;
            if (color2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("retailer_title_color=", color2, arrayList);
            }
            DepositMethods depositMethods = this.deposit_methods;
            if (depositMethods != null) {
                arrayList.add("deposit_methods=" + depositMethods);
            }
            String str7 = this.deposit_location;
            if (str7 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "deposit_location=", arrayList);
            }
            Money money = this.fee_amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("fee_amount=", money, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RetailerLocation{", "}", 0, null, null, 56);
        }
    }

    static {
        GetRetailerLocationsResponse$Companion$ADAPTER$1 getRetailerLocationsResponse$Companion$ADAPTER$1 = new GetRetailerLocationsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetRetailerLocationsResponse.class), "type.googleapis.com/squareup.cash.papermate.app.GetRetailerLocationsResponse", Syntax.PROTO_2, null, "squareup/cash/papermate/app/GetRetailerLocations.proto");
        ADAPTER = getRetailerLocationsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getRetailerLocationsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRetailerLocationsResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.locations = TransactorKt.immutableCopyOf("locations", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetRetailerLocationsResponse)) {
            return false;
        }
        GetRetailerLocationsResponse getRetailerLocationsResponse = (GetRetailerLocationsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getRetailerLocationsResponse.unknownFields()) && Intrinsics.areEqual(this.locations, getRetailerLocationsResponse.locations);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.locations.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        MoneyTab.Builder builder = new MoneyTab.Builder(26, false);
        builder.applets = this.locations;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.locations;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("locations=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetRetailerLocationsResponse{", "}", 0, null, null, 56);
    }
}
