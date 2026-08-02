package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.countries.Country;
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

/* loaded from: classes8.dex */
public final class SyncedContact extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncedContact> CREATOR;
    public final Boolean can_accept_payments;
    public final String cashtag;
    public final Country country_code;
    public final Long credit_card_fee_bps;
    public final String customer_token;
    public final String display_name;
    public final ByteString hashed_alias;
    public final String hashed_alias_id;
    public final Boolean is_business;
    public final Boolean is_cash_customer;
    public final Boolean is_verified_account;
    public final String photo_url;

    static {
        SyncedContact$Companion$ADAPTER$1 syncedContact$Companion$ADAPTER$1 = new SyncedContact$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncedContact.class), "type.googleapis.com/squareup.franklin.common.SyncedContact", Syntax.PROTO_2, null, "squareup/franklin/common/contact.proto");
        ADAPTER = syncedContact$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncedContact$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncedContact(ByteString byteString, String str, String str2, String str3, Boolean bool, String str4, Boolean bool2, Boolean bool3, Long l, Country country, Boolean bool4, String str5, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.hashed_alias = byteString;
        this.photo_url = str;
        this.cashtag = str2;
        this.display_name = str3;
        this.can_accept_payments = bool;
        this.customer_token = str4;
        this.is_business = bool2;
        this.is_verified_account = bool3;
        this.credit_card_fee_bps = l;
        this.country_code = country;
        this.is_cash_customer = bool4;
        this.hashed_alias_id = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncedContact)) {
            return false;
        }
        SyncedContact syncedContact = (SyncedContact) obj;
        return Intrinsics.areEqual(unknownFields(), syncedContact.unknownFields()) && Intrinsics.areEqual(this.hashed_alias, syncedContact.hashed_alias) && Intrinsics.areEqual(this.photo_url, syncedContact.photo_url) && Intrinsics.areEqual(this.cashtag, syncedContact.cashtag) && Intrinsics.areEqual(this.display_name, syncedContact.display_name) && Intrinsics.areEqual(this.can_accept_payments, syncedContact.can_accept_payments) && Intrinsics.areEqual(this.customer_token, syncedContact.customer_token) && Intrinsics.areEqual(this.is_business, syncedContact.is_business) && Intrinsics.areEqual(this.is_verified_account, syncedContact.is_verified_account) && Intrinsics.areEqual(this.credit_card_fee_bps, syncedContact.credit_card_fee_bps) && this.country_code == syncedContact.country_code && Intrinsics.areEqual(this.is_cash_customer, syncedContact.is_cash_customer) && Intrinsics.areEqual(this.hashed_alias_id, syncedContact.hashed_alias_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.hashed_alias;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        String str = this.photo_url;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.cashtag;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.display_name;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool = this.can_accept_payments;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str4 = this.customer_token;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Boolean bool2 = this.is_business;
        int hashCode8 = (hashCode7 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.is_verified_account;
        int hashCode9 = (hashCode8 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        Long l = this.credit_card_fee_bps;
        int hashCode10 = (hashCode9 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Country country = this.country_code;
        int hashCode11 = (hashCode10 + (country != null ? country.hashCode() : 0)) * 37;
        Boolean bool4 = this.is_cash_customer;
        int hashCode12 = (hashCode11 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        String str5 = this.hashed_alias_id;
        int hashCode13 = hashCode12 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Expression.Builder builder = new Expression.Builder(23, false);
        builder.blob_literal = this.hashed_alias;
        builder.string_literal = this.photo_url;
        builder.key_path_ref = this.cashtag;
        builder.float_literal = this.display_name;
        builder.bool_literal = this.can_accept_payments;
        builder.unary_op = this.customer_token;
        builder.binary_op = this.is_business;
        builder.conditional_op = this.is_verified_account;
        builder.int_literal = this.credit_card_fee_bps;
        builder.filter_op = this.country_code;
        builder.collection_literal = this.is_cash_customer;
        builder.format_string_op = this.hashed_alias_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.hashed_alias != null) {
            arrayList.add("hashed_alias=██");
        }
        if (this.photo_url != null) {
            arrayList.add("photo_url=██");
        }
        if (this.cashtag != null) {
            arrayList.add("cashtag=██");
        }
        if (this.display_name != null) {
            arrayList.add("display_name=██");
        }
        Boolean bool = this.can_accept_payments;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("can_accept_payments=", bool, arrayList);
        }
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        Boolean bool2 = this.is_business;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_business=", bool2, arrayList);
        }
        Boolean bool3 = this.is_verified_account;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_verified_account=", bool3, arrayList);
        }
        Long l = this.credit_card_fee_bps;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("credit_card_fee_bps=", l, arrayList);
        }
        Country country = this.country_code;
        if (country != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("country_code=", country, arrayList);
        }
        Boolean bool4 = this.is_cash_customer;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_cash_customer=", bool4, arrayList);
        }
        String str2 = this.hashed_alias_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "hashed_alias_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncedContact{", "}", 0, null, null, 56);
    }
}
