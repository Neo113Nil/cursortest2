package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.aegis.core.Section;
import com.squareup.protos.cash.badging.api.Badge;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.protos.payrollconnector.common.PayrollProviderUiAvatar;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/cashbusinesspayments/api/v1beta1/GetListingDetailsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/badging/api/Badge$Builder;", "Builder", "Customer", "CoverImage", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetListingDetailsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetListingDetailsResponse> CREATOR;
    public final Money amount;
    public final Customer customer;
    public final String description;
    public final CoverImage image;
    public final Boolean is_paid;
    public final String listing_token;
    public final String location_id;
    public final String title;

    public final class CoverImage extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CoverImage> CREATOR;
        public final Color color;
        public final Image image;

        static {
            GetListingDetailsResponse$CoverImage$Companion$ADAPTER$1 getListingDetailsResponse$CoverImage$Companion$ADAPTER$1 = new GetListingDetailsResponse$CoverImage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CoverImage.class), "type.googleapis.com/squareup.cash.cashbusinesspayments.api.v1beta1.GetListingDetailsResponse.CoverImage", Syntax.PROTO_2, null, "squareup/cash/cashbusinesspayments/api/v1beta1/listing.proto");
            ADAPTER = getListingDetailsResponse$CoverImage$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getListingDetailsResponse$CoverImage$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CoverImage(Image image, Color color, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image = image;
            this.color = color;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CoverImage)) {
                return false;
            }
            CoverImage coverImage = (CoverImage) obj;
            return Intrinsics.areEqual(unknownFields(), coverImage.unknownFields()) && Intrinsics.areEqual(this.image, coverImage.image) && Intrinsics.areEqual(this.color, coverImage.color);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Image image = this.image;
            int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
            Color color = this.color;
            int hashCode3 = hashCode2 + (color != null ? color.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PayrollProviderUiAvatar.Builder builder = new PayrollProviderUiAvatar.Builder(1);
            builder.avatar_url = this.image;
            builder.avatar_accent_color = this.color;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Image image = this.image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
            }
            Color color = this.color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("color=", color, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CoverImage{", "}", 0, null, null, 56);
        }
    }

    public final class Customer extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Customer> CREATOR;
        public final UiAvatar avatar;
        public final String cashtag;
        public final String display_name;

        static {
            GetListingDetailsResponse$Customer$Companion$ADAPTER$1 getListingDetailsResponse$Customer$Companion$ADAPTER$1 = new GetListingDetailsResponse$Customer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Customer.class), "type.googleapis.com/squareup.cash.cashbusinesspayments.api.v1beta1.GetListingDetailsResponse.Customer", Syntax.PROTO_2, null, "squareup/cash/cashbusinesspayments/api/v1beta1/listing.proto");
            ADAPTER = getListingDetailsResponse$Customer$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getListingDetailsResponse$Customer$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Customer(UiAvatar uiAvatar, String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.avatar = uiAvatar;
            this.display_name = str;
            this.cashtag = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Customer)) {
                return false;
            }
            Customer customer = (Customer) obj;
            return Intrinsics.areEqual(unknownFields(), customer.unknownFields()) && Intrinsics.areEqual(this.avatar, customer.avatar) && Intrinsics.areEqual(this.display_name, customer.display_name) && Intrinsics.areEqual(this.cashtag, customer.cashtag);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            UiAvatar uiAvatar = this.avatar;
            int hashCode2 = (hashCode + (uiAvatar != null ? uiAvatar.hashCode() : 0)) * 37;
            String str = this.display_name;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.cashtag;
            int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Section.Builder builder = new Section.Builder(29);
            builder.header_button = this.avatar;
            builder.header_text = this.display_name;
            builder.groups = this.cashtag;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            UiAvatar uiAvatar = this.avatar;
            if (uiAvatar != null) {
                Matcher$$ExternalSyntheticOutline0.m("avatar=", uiAvatar, arrayList);
            }
            if (this.display_name != null) {
                arrayList.add("display_name=██");
            }
            if (this.cashtag != null) {
                arrayList.add("cashtag=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Customer{", "}", 0, null, null, 56);
        }
    }

    static {
        GetListingDetailsResponse$Companion$ADAPTER$1 getListingDetailsResponse$Companion$ADAPTER$1 = new GetListingDetailsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetListingDetailsResponse.class), "type.googleapis.com/squareup.cash.cashbusinesspayments.api.v1beta1.GetListingDetailsResponse", Syntax.PROTO_2, null, "squareup/cash/cashbusinesspayments/api/v1beta1/listing.proto");
        ADAPTER = getListingDetailsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getListingDetailsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetListingDetailsResponse(String str, Customer customer, Money money, String str2, String str3, String str4, CoverImage coverImage, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.listing_token = str;
        this.customer = customer;
        this.amount = money;
        this.title = str2;
        this.location_id = str3;
        this.description = str4;
        this.image = coverImage;
        this.is_paid = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetListingDetailsResponse)) {
            return false;
        }
        GetListingDetailsResponse getListingDetailsResponse = (GetListingDetailsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getListingDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.listing_token, getListingDetailsResponse.listing_token) && Intrinsics.areEqual(this.customer, getListingDetailsResponse.customer) && Intrinsics.areEqual(this.amount, getListingDetailsResponse.amount) && Intrinsics.areEqual(this.title, getListingDetailsResponse.title) && Intrinsics.areEqual(this.location_id, getListingDetailsResponse.location_id) && Intrinsics.areEqual(this.description, getListingDetailsResponse.description) && Intrinsics.areEqual(this.image, getListingDetailsResponse.image) && Intrinsics.areEqual(this.is_paid, getListingDetailsResponse.is_paid);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.listing_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Customer customer = this.customer;
        int hashCode3 = (hashCode2 + (customer != null ? customer.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        String str2 = this.title;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.location_id;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.description;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        CoverImage coverImage = this.image;
        int hashCode8 = (hashCode7 + (coverImage != null ? coverImage.hashCode() : 0)) * 37;
        Boolean bool = this.is_paid;
        int hashCode9 = hashCode8 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Badge.Builder builder = new Badge.Builder(10, false);
        builder.external_token = this.listing_token;
        builder.external_version = this.customer;
        builder.updated_at = this.amount;
        builder.customer_token = this.title;
        builder.created_at = this.location_id;
        builder.item_type = this.description;
        builder.count_groups = this.image;
        builder.is_badged = this.is_paid;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.listing_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "listing_token=", arrayList);
        }
        Customer customer = this.customer;
        if (customer != null) {
            arrayList.add("customer=" + customer);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        if (this.title != null) {
            arrayList.add("title=██");
        }
        String str2 = this.location_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "location_id=", arrayList);
        }
        if (this.description != null) {
            arrayList.add("description=██");
        }
        CoverImage coverImage = this.image;
        if (coverImage != null) {
            arrayList.add("image=" + coverImage);
        }
        Boolean bool = this.is_paid;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_paid=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetListingDetailsResponse{", "}", 0, null, null, 56);
    }
}
