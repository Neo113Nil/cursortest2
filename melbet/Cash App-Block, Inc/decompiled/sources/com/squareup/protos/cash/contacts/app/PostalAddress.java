package com.squareup.protos.cash.contacts.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import xyz.block.protos.genie.Expression;

/* loaded from: classes7.dex */
public final class PostalAddress extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PostalAddress> CREATOR;
    public final String city;
    public final String country;
    public final String iso_country_code;
    public final String label;
    public final String neighborhood;
    public final String po_box;
    public final String postal_code;
    public final String region;
    public final String state;
    public final String street;
    public final String subadministrative_area;
    public final String sublocality;

    static {
        PostalAddress$Companion$ADAPTER$1 postalAddress$Companion$ADAPTER$1 = new PostalAddress$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PostalAddress.class), "type.googleapis.com/squareup.cash.contacts.app.PostalAddress", Syntax.PROTO_2, null, "squareup/cash/contacts/app/AddressBookContact.proto");
        ADAPTER = postalAddress$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(postalAddress$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostalAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.street = str;
        this.po_box = str2;
        this.neighborhood = str3;
        this.city = str4;
        this.state = str5;
        this.postal_code = str6;
        this.country = str7;
        this.region = str8;
        this.iso_country_code = str9;
        this.subadministrative_area = str10;
        this.sublocality = str11;
        this.label = str12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PostalAddress)) {
            return false;
        }
        PostalAddress postalAddress = (PostalAddress) obj;
        return Intrinsics.areEqual(unknownFields(), postalAddress.unknownFields()) && Intrinsics.areEqual(this.street, postalAddress.street) && Intrinsics.areEqual(this.po_box, postalAddress.po_box) && Intrinsics.areEqual(this.neighborhood, postalAddress.neighborhood) && Intrinsics.areEqual(this.city, postalAddress.city) && Intrinsics.areEqual(this.state, postalAddress.state) && Intrinsics.areEqual(this.postal_code, postalAddress.postal_code) && Intrinsics.areEqual(this.country, postalAddress.country) && Intrinsics.areEqual(this.region, postalAddress.region) && Intrinsics.areEqual(this.iso_country_code, postalAddress.iso_country_code) && Intrinsics.areEqual(this.subadministrative_area, postalAddress.subadministrative_area) && Intrinsics.areEqual(this.sublocality, postalAddress.sublocality) && Intrinsics.areEqual(this.label, postalAddress.label);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.street;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.po_box;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.neighborhood;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.city;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.state;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.postal_code;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.country;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.region;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.iso_country_code;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.subadministrative_area;
        int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.sublocality;
        int hashCode12 = (hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.label;
        int hashCode13 = hashCode12 + (str12 != null ? str12.hashCode() : 0);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Expression.Builder builder = new Expression.Builder(5, false);
        builder.string_literal = this.street;
        builder.key_path_ref = this.po_box;
        builder.int_literal = this.neighborhood;
        builder.float_literal = this.city;
        builder.bool_literal = this.state;
        builder.blob_literal = this.postal_code;
        builder.unary_op = this.country;
        builder.binary_op = this.region;
        builder.conditional_op = this.iso_country_code;
        builder.filter_op = this.subadministrative_area;
        builder.collection_literal = this.sublocality;
        builder.format_string_op = this.label;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.street;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "street=", arrayList);
        }
        String str2 = this.po_box;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "po_box=", arrayList);
        }
        String str3 = this.neighborhood;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "neighborhood=", arrayList);
        }
        String str4 = this.city;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "city=", arrayList);
        }
        String str5 = this.state;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "state=", arrayList);
        }
        String str6 = this.postal_code;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "postal_code=", arrayList);
        }
        String str7 = this.country;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "country=", arrayList);
        }
        String str8 = this.region;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "region=", arrayList);
        }
        String str9 = this.iso_country_code;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "iso_country_code=", arrayList);
        }
        String str10 = this.subadministrative_area;
        if (str10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "subadministrative_area=", arrayList);
        }
        String str11 = this.sublocality;
        if (str11 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str11, "sublocality=", arrayList);
        }
        String str12 = this.label;
        if (str12 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str12, "label=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PostalAddress{", "}", 0, null, null, 56);
    }
}
