package com.squareup.protos.cash.moneymap.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.money.content.MoneyTab;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.SupportConfig;
import com.squareup.protos.franklin.investing.resources.CustomOrder;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/moneymap/app/GetRetailerLocationsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/money/content/MoneyTab$Builder;", "Builder", "Fee", "LocationDetail", "RetailerLocation", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetRetailerLocationsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetRetailerLocationsResponse> CREATOR;
    public final List retailer_locations;

    public final class Fee extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Fee> CREATOR;
        public final Money charge;
        public final String fee_type;
        public final Money waive;

        static {
            GetRetailerLocationsResponse$Fee$Companion$ADAPTER$1 getRetailerLocationsResponse$Fee$Companion$ADAPTER$1 = new GetRetailerLocationsResponse$Fee$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Fee.class), "type.googleapis.com/squareup.cash.moneymap.app.GetRetailerLocationsResponse.Fee", Syntax.PROTO_2, null, "squareup/cash/moneymap/app/get_retailer_locations.proto");
            ADAPTER = getRetailerLocationsResponse$Fee$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getRetailerLocationsResponse$Fee$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fee(Money money, Money money2, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.charge = money;
            this.fee_type = str;
            this.waive = money2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Fee)) {
                return false;
            }
            Fee fee = (Fee) obj;
            return Intrinsics.areEqual(unknownFields(), fee.unknownFields()) && Intrinsics.areEqual(this.charge, fee.charge) && Intrinsics.areEqual(this.fee_type, fee.fee_type) && Intrinsics.areEqual(this.waive, fee.waive);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Money money = this.charge;
            int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
            String str = this.fee_type;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            Money money2 = this.waive;
            int hashCode4 = hashCode3 + (money2 != null ? money2.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CustomOrder.Builder builder = new CustomOrder.Builder(2);
            builder.original_share_price = this.charge;
            builder.period_token = this.fee_type;
            builder.target_share_price = this.waive;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Money money = this.charge;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("charge=", money, arrayList);
            }
            String str = this.fee_type;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "fee_type=", arrayList);
            }
            Money money2 = this.waive;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("waive=", money2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Fee{", "}", 0, null, null, 56);
        }
    }

    public final class LocationDetail extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LocationDetail> CREATOR;
        public final String description;
        public final String highlighted_info_text;
        public final String title;

        static {
            GetRetailerLocationsResponse$LocationDetail$Companion$ADAPTER$1 getRetailerLocationsResponse$LocationDetail$Companion$ADAPTER$1 = new GetRetailerLocationsResponse$LocationDetail$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocationDetail.class), "type.googleapis.com/squareup.cash.moneymap.app.GetRetailerLocationsResponse.LocationDetail", Syntax.PROTO_2, null, "squareup/cash/moneymap/app/get_retailer_locations.proto");
            ADAPTER = getRetailerLocationsResponse$LocationDetail$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getRetailerLocationsResponse$LocationDetail$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocationDetail(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.description = str2;
            this.highlighted_info_text = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LocationDetail)) {
                return false;
            }
            LocationDetail locationDetail = (LocationDetail) obj;
            return Intrinsics.areEqual(unknownFields(), locationDetail.unknownFields()) && Intrinsics.areEqual(this.title, locationDetail.title) && Intrinsics.areEqual(this.description, locationDetail.description) && Intrinsics.areEqual(this.highlighted_info_text, locationDetail.highlighted_info_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.description;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.highlighted_info_text;
            int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SupportConfig.Builder builder = new SupportConfig.Builder(19);
            builder.contact_support_url = this.title;
            builder.privacy_policy_url = this.description;
            builder.terms_of_service_url = this.highlighted_info_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.description;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
            }
            String str3 = this.highlighted_info_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "highlighted_info_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LocationDetail{", "}", 0, null, null, 56);
        }
    }

    public final class RetailerLocation extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RetailerLocation> CREATOR;
        public final GlobalAddress address;
        public final String address_button_name;
        public final Button button;
        public final Money fee_amount;
        public final List fees;
        public final Double latitude;
        public final List location_details;
        public final Double longitude;
        public final Color retailer_accent_color;
        public final Image retailer_icon;
        public final String retailer_icon_url;
        public final String retailer_location_token;
        public final String retailer_name;
        public final List retailer_types;

        static {
            GetRetailerLocationsResponse$RetailerLocation$Companion$ADAPTER$1 getRetailerLocationsResponse$RetailerLocation$Companion$ADAPTER$1 = new GetRetailerLocationsResponse$RetailerLocation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RetailerLocation.class), "type.googleapis.com/squareup.cash.moneymap.app.GetRetailerLocationsResponse.RetailerLocation", Syntax.PROTO_2, null, "squareup/cash/moneymap/app/get_retailer_locations.proto");
            ADAPTER = getRetailerLocationsResponse$RetailerLocation$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getRetailerLocationsResponse$RetailerLocation$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetailerLocation(GlobalAddress globalAddress, List list, Double d, Double d2, Color color, String str, String str2, String str3, List list2, String str4, List list3, Button button, Image image, Money money, ByteString byteString) {
            super(ADAPTER, byteString);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
            this.address = globalAddress;
            this.latitude = d;
            this.longitude = d2;
            this.retailer_accent_color = color;
            this.retailer_icon_url = str;
            this.retailer_location_token = str2;
            this.retailer_name = str3;
            this.address_button_name = str4;
            this.button = button;
            this.retailer_icon = image;
            this.fee_amount = money;
            this.fees = TransactorKt.immutableCopyOf("fees", list);
            this.retailer_types = TransactorKt.immutableCopyOf("retailer_types", list2);
            this.location_details = TransactorKt.immutableCopyOf("location_details", list3);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RetailerLocation)) {
                return false;
            }
            RetailerLocation retailerLocation = (RetailerLocation) obj;
            return Intrinsics.areEqual(unknownFields(), retailerLocation.unknownFields()) && Intrinsics.areEqual(this.address, retailerLocation.address) && Intrinsics.areEqual(this.fees, retailerLocation.fees) && Intrinsics.areEqual(this.latitude, retailerLocation.latitude) && Intrinsics.areEqual(this.longitude, retailerLocation.longitude) && Intrinsics.areEqual(this.retailer_accent_color, retailerLocation.retailer_accent_color) && Intrinsics.areEqual(this.retailer_icon_url, retailerLocation.retailer_icon_url) && Intrinsics.areEqual(this.retailer_location_token, retailerLocation.retailer_location_token) && Intrinsics.areEqual(this.retailer_name, retailerLocation.retailer_name) && Intrinsics.areEqual(this.retailer_types, retailerLocation.retailer_types) && Intrinsics.areEqual(this.address_button_name, retailerLocation.address_button_name) && Intrinsics.areEqual(this.location_details, retailerLocation.location_details) && Intrinsics.areEqual(this.button, retailerLocation.button) && Intrinsics.areEqual(this.retailer_icon, retailerLocation.retailer_icon) && Intrinsics.areEqual(this.fee_amount, retailerLocation.fee_amount);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            GlobalAddress globalAddress = this.address;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (globalAddress != null ? globalAddress.hashCode() : 0)) * 37, 37, this.fees);
            Double d = this.latitude;
            int hashCode2 = (m + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
            Double d2 = this.longitude;
            int hashCode3 = (hashCode2 + (d2 != null ? Double.hashCode(d2.doubleValue()) : 0)) * 37;
            Color color = this.retailer_accent_color;
            int hashCode4 = (hashCode3 + (color != null ? color.hashCode() : 0)) * 37;
            String str = this.retailer_icon_url;
            int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.retailer_location_token;
            int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.retailer_name;
            int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.retailer_types);
            String str4 = this.address_button_name;
            int m3 = Recorder$$ExternalSyntheticOutline2.m((m2 + (str4 != null ? str4.hashCode() : 0)) * 37, 37, this.location_details);
            Button button = this.button;
            int hashCode7 = (m3 + (button != null ? button.hashCode() : 0)) * 37;
            Image image = this.retailer_icon;
            int hashCode8 = (hashCode7 + (image != null ? image.hashCode() : 0)) * 37;
            Money money = this.fee_amount;
            int hashCode9 = hashCode8 + (money != null ? money.hashCode() : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Loan.Builder builder = new Loan.Builder(7);
            builder.borrowed_at = this.address;
            builder.detail_rows = this.fees;
            builder.due_at = this.latitude;
            builder.setup_fee_amount = this.longitude;
            builder.outstanding_amount = this.retailer_accent_color;
            builder.token = this.retailer_icon_url;
            builder.credit_line_token = this.retailer_location_token;
            builder.late_fee_amount = this.retailer_name;
            builder.interest_amount = this.retailer_types;
            builder.setup_fee_bps = this.address_button_name;
            builder.state = this.location_details;
            builder.lending_product = this.button;
            builder.bnpl_data = this.retailer_icon;
            builder.principal_amount = this.fee_amount;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            GlobalAddress globalAddress = this.address;
            if (globalAddress != null) {
                arrayList.add("address=" + globalAddress);
            }
            List list = this.fees;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("fees=", arrayList, list);
            }
            Double d = this.latitude;
            if (d != null) {
                SizeMode$EnumUnboxingLocalUtility.m("latitude=", d, arrayList);
            }
            Double d2 = this.longitude;
            if (d2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("longitude=", d2, arrayList);
            }
            Color color = this.retailer_accent_color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("retailer_accent_color=", color, arrayList);
            }
            String str = this.retailer_icon_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "retailer_icon_url=", arrayList);
            }
            String str2 = this.retailer_location_token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "retailer_location_token=", arrayList);
            }
            String str3 = this.retailer_name;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "retailer_name=", arrayList);
            }
            List list2 = this.retailer_types;
            if (!list2.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("retailer_types=", arrayList, list2);
            }
            String str4 = this.address_button_name;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "address_button_name=", arrayList);
            }
            List list3 = this.location_details;
            if (!list3.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("location_details=", arrayList, list3);
            }
            Button button = this.button;
            if (button != null) {
                arrayList.add("button=" + button);
            }
            Image image = this.retailer_icon;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("retailer_icon=", image, arrayList);
            }
            Money money = this.fee_amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("fee_amount=", money, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RetailerLocation{", "}", 0, null, null, 56);
        }
    }

    static {
        GetRetailerLocationsResponse$Companion$ADAPTER$1 getRetailerLocationsResponse$Companion$ADAPTER$1 = new GetRetailerLocationsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetRetailerLocationsResponse.class), "type.googleapis.com/squareup.cash.moneymap.app.GetRetailerLocationsResponse", Syntax.PROTO_2, null, "squareup/cash/moneymap/app/get_retailer_locations.proto");
        ADAPTER = getRetailerLocationsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getRetailerLocationsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRetailerLocationsResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.retailer_locations = TransactorKt.immutableCopyOf("retailer_locations", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetRetailerLocationsResponse)) {
            return false;
        }
        GetRetailerLocationsResponse getRetailerLocationsResponse = (GetRetailerLocationsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getRetailerLocationsResponse.unknownFields()) && Intrinsics.areEqual(this.retailer_locations, getRetailerLocationsResponse.retailer_locations);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.retailer_locations.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        MoneyTab.Builder builder = new MoneyTab.Builder(22, false);
        builder.applets = this.retailer_locations;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.retailer_locations;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("retailer_locations=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetRetailerLocationsResponse{", "}", 0, null, null, 56);
    }
}
