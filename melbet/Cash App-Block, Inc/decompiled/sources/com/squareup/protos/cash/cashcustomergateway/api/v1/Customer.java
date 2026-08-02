package com.squareup.protos.cash.cashcustomergateway.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.client.ClientInfo;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.time.Instant;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Customer extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Customer> CREATOR;
    public final BlockState block_state;
    public final Boolean can_accept_payments;
    public final String cashtag;
    public final String email_address;
    public final String full_name;
    public final Boolean is_business;
    public final Boolean is_cash_customer;
    public final Boolean is_square;
    public final Boolean is_verified_account;
    public final Instant joined_date;
    public final String photo_url;
    public final Region region;
    public final String render_data;
    public final String sms_number;
    public final String token;

    static {
        Customer$Companion$ADAPTER$1 customer$Companion$ADAPTER$1 = new Customer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Customer.class), "type.googleapis.com/squareup.cash.cashcustomergateway.api.v1beta1.Customer", Syntax.PROTO_2, null, "squareup/cash/cashcustomergateway/api/v1beta1/lookup_cashtag_service.proto");
        ADAPTER = customer$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(customer$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Customer(String str, String str2, String str3, String str4, String str5, String str6, Region region, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str7, BlockState blockState, Instant instant, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.email_address = str2;
        this.sms_number = str3;
        this.full_name = str4;
        this.photo_url = str5;
        this.cashtag = str6;
        this.region = region;
        this.is_cash_customer = bool;
        this.can_accept_payments = bool2;
        this.is_square = bool3;
        this.is_business = bool4;
        this.is_verified_account = bool5;
        this.render_data = str7;
        this.block_state = blockState;
        this.joined_date = instant;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Customer)) {
            return false;
        }
        Customer customer = (Customer) obj;
        return Intrinsics.areEqual(unknownFields(), customer.unknownFields()) && Intrinsics.areEqual(this.token, customer.token) && Intrinsics.areEqual(this.email_address, customer.email_address) && Intrinsics.areEqual(this.sms_number, customer.sms_number) && Intrinsics.areEqual(this.full_name, customer.full_name) && Intrinsics.areEqual(this.photo_url, customer.photo_url) && Intrinsics.areEqual(this.cashtag, customer.cashtag) && this.region == customer.region && Intrinsics.areEqual(this.is_cash_customer, customer.is_cash_customer) && Intrinsics.areEqual(this.can_accept_payments, customer.can_accept_payments) && Intrinsics.areEqual(this.is_square, customer.is_square) && Intrinsics.areEqual(this.is_business, customer.is_business) && Intrinsics.areEqual(this.is_verified_account, customer.is_verified_account) && Intrinsics.areEqual(this.render_data, customer.render_data) && this.block_state == customer.block_state && Intrinsics.areEqual(this.joined_date, customer.joined_date);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.email_address;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.sms_number;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.full_name;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.photo_url;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.cashtag;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Region region = this.region;
        int hashCode8 = (hashCode7 + (region != null ? region.hashCode() : 0)) * 37;
        Boolean bool = this.is_cash_customer;
        int hashCode9 = (hashCode8 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.can_accept_payments;
        int hashCode10 = (hashCode9 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.is_square;
        int hashCode11 = (hashCode10 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        Boolean bool4 = this.is_business;
        int hashCode12 = (hashCode11 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        Boolean bool5 = this.is_verified_account;
        int hashCode13 = (hashCode12 + (bool5 != null ? Boolean.hashCode(bool5.booleanValue()) : 0)) * 37;
        String str7 = this.render_data;
        int hashCode14 = (hashCode13 + (str7 != null ? str7.hashCode() : 0)) * 37;
        BlockState blockState = this.block_state;
        int hashCode15 = (hashCode14 + (blockState != null ? blockState.hashCode() : 0)) * 37;
        Instant instant = this.joined_date;
        int hashCode16 = hashCode15 + (instant != null ? instant.hashCode() : 0);
        this.hashCode = hashCode16;
        return hashCode16;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClientInfo.Builder builder = new ClientInfo.Builder(1);
        builder.user_agent = this.token;
        builder.device_uuid = this.email_address;
        builder.date_format = this.sms_number;
        builder.time_format = this.full_name;
        builder.ip_address = this.photo_url;
        builder.device_name = this.cashtag;
        builder.device_installation_id = this.region;
        builder.drm_id = this.is_cash_customer;
        builder.device_vendor_id = this.can_accept_payments;
        builder.device_id = this.is_square;
        builder.threatmetrix_smart_id = this.is_business;
        builder.timestamp = this.is_verified_account;
        builder.accept_language = this.render_data;
        builder.navigation_paradigm = this.block_state;
        builder.client_scenario = this.joined_date;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        if (this.email_address != null) {
            arrayList.add("email_address=██");
        }
        if (this.sms_number != null) {
            arrayList.add("sms_number=██");
        }
        if (this.full_name != null) {
            arrayList.add("full_name=██");
        }
        String str2 = this.photo_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "photo_url=", arrayList);
        }
        if (this.cashtag != null) {
            arrayList.add("cashtag=██");
        }
        Region region = this.region;
        if (region != null) {
            arrayList.add("region=" + region);
        }
        Boolean bool = this.is_cash_customer;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_cash_customer=", bool, arrayList);
        }
        Boolean bool2 = this.can_accept_payments;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("can_accept_payments=", bool2, arrayList);
        }
        Boolean bool3 = this.is_square;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_square=", bool3, arrayList);
        }
        Boolean bool4 = this.is_business;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_business=", bool4, arrayList);
        }
        Boolean bool5 = this.is_verified_account;
        if (bool5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_verified_account=", bool5, arrayList);
        }
        if (this.render_data != null) {
            arrayList.add("render_data=██");
        }
        BlockState blockState = this.block_state;
        if (blockState != null) {
            arrayList.add("block_state=" + blockState);
        }
        Instant instant = this.joined_date;
        if (instant != null) {
            Matcher$$ExternalSyntheticOutline0.m("joined_date=", instant, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Customer{", "}", 0, null, null, 56);
    }
}
